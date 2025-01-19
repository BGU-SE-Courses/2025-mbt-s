package hellocucumber;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefinitions {

    private static final WebDriver driver = RunCucumberTest.driver;
    private static final WebDriverWait wait = RunCucumberTest.wait;

    

    // $$*TODO* explain what this step does$$
    @Given("an example scenario")
    public void anExampleScenario() {
        System.out.println("This is an example scenario");
    }

    // $$*TODO* explain what this step does$$
    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
        System.out.println("All step definitions are implemented");
    }

    // $$*TODO* explain what this step does$$
    @Then("the scenario passes")
    public void theScenarioPasses() {
        System.out.println("The scenario passes");
    }

    @Given("I am a registered user")
    public void iAmARegisteredUser() {
        
    }

    @And("I am signed in to my account")
    public void iAmSignedInToMyAccount() {
        
    }

    @When("I select a product")
    public void iSelectAProduct() {
        
    }

    @And("I specify a quantity of {int}")
    public void iSpecifyAQuantityOf(int arg0) {
        
    }

    @And("I click the {string} button")
    public void iClickTheButton(String arg0) {
        
    }

    @Then("the product should be added to my wishlist")
    public void theProductShouldBeAddedToMyWishlist() {
        
    }

    @And("my wishlist should show the product with a quantity of {int}")
    public void myWishlistShouldShowTheProductWithAQuantityOf(int arg0) {
        
    }

    @And("I should see a confirmation message {string}")
    public void iShouldSeeAConfirmationMessage(String arg0) {
        
    }

    @When("I add the following products to my wishlist:")
    public void iAddTheFollowingProductsToMyWishlist() {
        
    }

    @Then("all products should be present in my wishlist")
    public void allProductsShouldBePresentInMyWishlist() {
        
    }

    @And("each product should have the specified quantity")
    public void eachProductShouldHaveTheSpecifiedQuantity() {
        
    }

    @Given("I have a product in my wishlist with quantity {int}")
    public void iHaveAProductInMyWishlistWithQuantity(int arg0) {


    }

    @When("I update the quantity to {int}")
    public void iUpdateTheQuantityTo(int arg0) {
        
    }

    @Then("the product quantity in my wishlist should be updated to {int}")
    public void theProductQuantityInMyWishlistShouldBeUpdatedTo(int arg0) {
        
    }

    @When("I add the same product with quantity {int}")
    public void iAddTheSameProductWithQuantity(int arg0) {
        
    }

    @Given("I am not signed in")
    public void iAmNotSignedIn() {
        
    }

    @When("I try to add a product to my wishlist")
    public void iTryToAddAProductToMyWishlist() {
        
    }

    @Then("I should see a message {string}")
    public void iShouldSeeAMessage(String arg0) {
    }
}
