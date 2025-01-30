// @provengo summon ctrl

/**
 * List of events "of interest" that we want test suites to cover.
 */
const GOALS = [
    any(/End\(UsrChooseProductAndQuantity\)/),
    any(/Begin\(AdminChange\)/),
    any(/Begin\(UsrAddToWishlist\)/),
    any(/End\(AdminValidation\)/),
    any(/End\(UseValidation\)/),

];


/**
 * Ranks test suites by how many events from the GOALS array were met.
 * The more goals are met, the higher the score.
 *
 * It make no difference if a goal was met more then once.
 *
 * @param {Event[][]} ensemble The test suite to be ranked.
 * @returns Number of events from GOALS that have been met.
 */
function rankByMetGoals(ensemble) {
    const unreachedGoals = [];
    for (let idx = 0; idx < GOALS.length; idx++) {
        unreachedGoals.push(GOALS[idx]);
    }

    for (let test of ensemble) {
        for (let event of test) {
            for (let ugIdx = unreachedGoals.length - 1; ugIdx >= 0; ugIdx--) {
                let unreachedGoal = unreachedGoals[ugIdx];
                if (unreachedGoal.contains(event)) {
                    unreachedGoals.splice(ugIdx, 1);
                }
            }
        }
    }

    return GOALS.length - unreachedGoals.length;
}

/**
 * Calculates the number of unique consecutive element pairs in the given ensemble.
 *
 * @param {Array<Array<any>>} ensemble - An array of arrays, where each inner array represents a test.
 * @returns {number} The number of unique consecutive element pairs in the ensemble.
 */
function two_ways_ranking_function(ensemble) {
    let set = new Set();

    for (var test of ensemble)
        for (var i = 0; i < test.length - 1; i++)
            set.add(`${test[i]},${test[i + 1]}`);

    return set.size;
}

/**
 * Ranks potential test suites based on the percentage of goals they cover.
 * Goal events are defined in the GOALS array above. An ensemble with rank
 * 100 covers all the goal events.
 *
 * Multiple ranking functions are supported - to change ranking function,
 * use the `ensemble.ranking-function` configuration key, or the
 * --ranking-function <functionName> command-line parameter.
 *
 * @param {Event[][]} ensemble the test suite/ensemble to be ranked
 * @returns the percentage of goals covered by `ensemble`.
 */
function rankingFunction(ensemble) {

    // How many goals did `ensemble` hit?
    // const metGoalsCount = rankByMetGoals(ensemble);
    const metGoalsCount = two_ways_ranking_function(ensemble);
    // What percentage of the goals did `ensemble` cover?
    const metGoalsPercent = metGoalsCount/GOALS.length;

    return metGoalsPercent * 100; // convert to human-readable percentage
}

