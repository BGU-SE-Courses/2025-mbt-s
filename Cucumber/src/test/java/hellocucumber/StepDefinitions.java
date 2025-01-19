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


//    *****Admin action*****

    @Given("I am a privileged administrator")
    public void iAmAPrivilegedAdministrator() {
    }

    @And("I am logged in as an admin")
    public void iAmLoggedInAsAnAdmin() {
    }

    @And("I navigate to the the Dashboard sidebar")
    public void iNavigateToTheTheDashboardSidebar() {
    }

    @And("I click the \\{Products} button in Catalog section")
    public void iClickTheProductsButtonInCatalogSection() {
    }

    @And("I select a product with stock quantity of {int}")
    public void iSelectAProductWithStockQuantityOf(int arg0) {
    }

    @And("I click the \\{Edit} button")
    public void iClickTheEditButton() {
    }

    @And("I choose the Stock section")
    public void iChooseTheStockSection() {
    }

    @When("I decrease the stock by {int}")
    public void iDecreaseTheStockBy(int arg0) {
    }

    @Then("the updated stock quantity should be {int}")
    public void theUpdatedStockQuantityShouldBe(int arg0) {
    }

    @And("a confirmation message {string} should be displayed")
    public void aConfirmationMessageShouldBeDisplayed(String arg0) {
    }

    @Then("an error message {string} should be displayed")
    public void anErrorMessageShouldBeDisplayed(String arg0) {
    }

    @And("the stock quantity should remain {int}")
    public void theStockQuantityShouldRemain(int arg0) {
    }

    @And("I select a product named {string}")
    public void iSelectAProductNamed(String arg0) {
    }

    @And("I navigate to the {string} section")
    public void iNavigateToTheSection(String arg0) {
    }

    @And("the product has the following combinations:")
    public void theProductHasTheFollowingCombinations() {
    }

    @When("I select the combinations:")
    public void iSelectTheCombinations() {
    }

    @And("I decrease the stock by {int} for the selected combinations")
    public void iDecreaseTheStockByForTheSelectedCombinations(int arg0) {
    }

    @Then("the updated stock should be:")
    public void theUpdatedStockShouldBe() {
    }

    @Given("I am on the admin login page")
    public void iAmOnTheAdminLoginPage() {
    }

    @When("I enter the following credentials:")
    public void iEnterTheFollowingCredentials() {
    }

    @Then("I should remain on the login page")
    public void iShouldRemainOnTheLoginPage() {
    }
}
