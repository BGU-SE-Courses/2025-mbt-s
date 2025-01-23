package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    PrestashopActuator prestashopActuator = new PrestashopActuator();
    PrestashopActuatorAdmin prestashopActuatorAdmin = new PrestashopActuatorAdmin();
    int quantity = 3;  // init a test quantity x
    String emailUser = "avivyuv@post.bgu.ac.il";
    String userPass = "yuval1234!";
    String emailAdmin = "demo@prestashop.com";
    String adminPass = "prestashop_demo";

    // $$*TODO* explain what this step does$$
    @Given("an example scenario")
    public void anExampleScenario() {

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

    // This step set up the driver and login in the user
    @Given("the user is signed in")
    public void theUserIsSignedIn() {
        prestashopActuator.userSetup();
        prestashopActuator.enterLoginInfo(emailUser, userPass);
    }

    @And("product A wasn't added to the wishlist before")
    public void productAWasNotAddedToTheWishlistBefore() {
        // check if the product is in the wishlist
        prestashopActuator.checkProductNotAddedPreviously();
    }

    @When("the user adds a quantity of X to the wishlist")
    public void theUserAddsAQuantityOfXToTheWishlist() {
        prestashopActuator.addProductToWishlist(this.quantity);
    }

    @Then("the product is added to the wishlist with a quantity of X")
    public void theProductIsAddedToTheWishlistWithAQuantityOfX() {
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actual = prestashopActuator.checkProductAdded();
        String expected = "Quantity : " + String.valueOf(this.quantity);
        // close the driver
        prestashopActuator.closeDriver();
        // assert equals
        assertEquals(expected, actual);
    }

    @Given("the admin is signed in")
    public void theAdminIsSignedIn() {
        prestashopActuatorAdmin.adminSetup();
        prestashopActuatorAdmin.enterLoginInfo(emailAdmin, adminPass);
    }

    @When("the admin reduces the quantity of a product to less than X")
    public void theAdminReducesTheQuantityOfAProductToLessThanX() {
        prestashopActuatorAdmin.changeProductQuantityLessThanX(this.quantity);
    }

    @Then("the product quantity is updates")
    public void theProductIsRemovedFromTheInventory() {
        // check updated quantity
        boolean updated = prestashopActuatorAdmin.checkProductQuantityUpdated();
        // close the driver
        prestashopActuatorAdmin.closeDriver();
        // assert equals
        assertEquals(true, updated);
    }

}