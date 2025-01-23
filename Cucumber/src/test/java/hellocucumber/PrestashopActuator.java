package hellocucumber;

import io.cucumber.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PrestashopActuator {
    private static WebDriver driver;  // web driver
    private static WebDriverWait wait;  // web driver wait
    private Xpath xpath = new Xpath();  // a Xpath dictionary for all the web element paths


    public void userSetup() {
        this.driver = new ChromeDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // open the login path
        driver.get("http://localhost:8080/login?back=http%3A%2F%2Flocalhost%3A8080%2F");
    }

    public void enterLoginInfo(String email, String password) {
        /**
         * String email - email for login
         * String password - password for login
         * The function enters the user credential and login
         */
        // locate the username input box and enter username
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath.dictUseCase_1.get("INPUT: (email)")))).sendKeys(email);
        // locate the password input box and enter password
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath.dictUseCase_1.get("INPUT: (password)")))).sendKeys(password);
        // locate Log in button and press
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("BUTTON: SIGN IN"))).click();
        // Wait for a moment
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkProductNotAddedPreviously() {
        // click on the username to go to profile
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("user"))).click();
        // click on the wishlists
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("my wishlists"))).click();
        // click on my wishlist
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("my wishlist"))).click();

        // scroll down to find element
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

        try {
            WebElement quantity_element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath(xpath.dictUseCase_1.get("quantity"))));
        } catch (Exception e){
            // navigate to the home page by pressing the img
            driver.findElement(By.xpath(xpath.dictUseCase_1.get("IMG: home page"))).click();
            //driver.get("http://localhost:8080/");
            return;  // item is not in the wishlist
        }

        // else, item was found in the wishlist and need to be removed
        // click on the delete button from the xpath
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("BUTTON: delete"))).click();
        // click remove for confirmation
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("BUTTON: remove"))).click();
        // return to the home page
        driver.get("http://localhost:8080/");
    }

    public void addProductToWishlist(int quantity) {
        /**
         * int quantity - the quantity of the product to add to the wishlist
         * This function add a product to My Wishlist with the specified quantity
         */
        // scroll down to find element
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
        // locate and click on the wanted product
        // wait until the element is visible:
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(xpath.dictUseCase_1.get("MUG:best is yet to come"))
        )).click();

        // find the quantity input box and enter quantity

        WebElement quantityInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(xpath.dictUseCase_1.get("INPUT: QUANTITY"))
        ));
        // Perform triple-click on the input field
        Actions actions = new Actions(driver);
        // Perform click three times to simulate a triple-click
        actions.click(quantityInput).click(quantityInput).click(quantityInput).perform();        // Clear the existing text
        // quantityInput.clear();
        // Send the new string
        quantityInput.sendKeys(String.valueOf(quantity));

        driver.findElement(By.xpath(xpath.dictUseCase_1.get("BUTTON: add to wishlist"))).click();
        // choose "My Wishlist" from the dropdown
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("BUTTON: my wishlist"))).click();
    }

    public String checkProductAdded(){
        // Refresh the page
        driver.navigate().refresh();
        try {
            Thread.sleep(100);
        }
        catch (Exception e){

        }

        // click on the username to go to profile
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("user"))).click();
        // click on the wishlists
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("my wishlists"))).click();
        try {
            Thread.sleep(100);
        }
        catch (Exception e){

        }
        // click on my wishlist
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("my wishlist"))).click();

        // scroll down to find element
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");

        // wait until visibility of the quantity element
        WebElement quantity_element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(xpath.dictUseCase_1.get("quantity"))
        ));

        String actual_quantity = quantity_element.getText();
        // print the quantity for debugging
        System.out.println("The actual quantity is: " + actual_quantity);
        return actual_quantity;
    }

    public void closeDriver() {
        // close the driver
        driver.quit();
    }
}
