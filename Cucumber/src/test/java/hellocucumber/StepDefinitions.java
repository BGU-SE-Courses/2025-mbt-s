package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    // $$*TODO* explain what this step does$$
    @Given("an example scenario")
    public void anExampleScenario() {
        PrestashopActuator.userSetup();
    }

    // $$*TODO* explain what this step does$$
    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    // $$*TODO* explain what this step does$$
    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    // --------------------------------------------------------------------

    @Given("the user is signed in")
    public void theUserIsSignedIn() {

    }

    @When("the user adds a quantity of X to the wishlist")
    public void theUserAddsAQuantityOfXToTheWishlist() {

    }

    @Then("the product is added to the wishlist with a quantity of X")
    public void theProductIsAddedToTheWishlistWithAQuantityOfX() {

    }

    @Given("the admin is signed in")
    public void theAdminIsSignedIn() {

    }

    @When("the admin reduces the quantity of a product to less than X")
    public void theAdminReducesTheQuantityOfAProductToLessThanX() {

    }

    @Then("the product is removed from the inventory")
    public void theProductIsRemovedFromTheInventory() {
    }
}