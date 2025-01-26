package hellocucumber;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PrestashopActuatorAdmin {
    private static WebDriver driver;  // web driver
    private static WebDriverWait wait;  // web driver wait
    private Xpath xpath = new Xpath();  // a Xpath dictionary for all the web element paths
    private int productExpQuantity;  // init a test quantity x
    private int productActualQuantity;  // init a test quantity x

    public void adminSetup() {
        /**
         * This function sets up the driver and opens the login page
         */
        this.driver = new ChromeDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // open the login path
        driver.get("http://localhost:8080/admina/index.php?controller=AdminLogin&token=987418a10ea852502b634ff73d5c5f65");
    }

    public void enterLoginInfo(String email, String password) {
        /**
         * String email - email for login
         * String password - password for login
         * The function enters the user credential and login
         */
        // locate the username input box and enter username
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath.dictUseCase_2.get("INPUT: (email)")))).sendKeys(email);
        // locate the password input box and enter password
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath.dictUseCase_2.get("INPUT: (password)")))).sendKeys(password);
        // locate Log in button and press
        driver.findElement(By.xpath(xpath.dictUseCase_2.get("BUTTON: SIGN IN"))).click();
        // Wait for a moment
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void changeProductQuantityLessThanX(int x) {
        /**
         * int x - the quantity to change the product to less than
         * The function changes the product quantity to less than x
         */
        driver.manage().window().maximize();  // the catalog button is not visible without maximizing the window
        // click on catalog
        // wait until the element is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath.dictUseCase_2.get("BUTTON: catalog")))).click();
        // click on products
        driver.findElement(By.xpath(xpath.dictUseCase_2.get("BUTTON: products"))).click();
        // scroll down to find the product
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
        // click on the product edit button
        driver.findElement(By.xpath(xpath.dictUseCase_2.get("BUTTON: edit"))).click();
        // click on the stock tab
        driver.findElement(By.xpath(xpath.dictUseCase_2.get("BUTTON: stocks"))).click();
        // find the current quantity
        WebElement quantity_element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(xpath.dictUseCase_2.get("INPUT: quantity"))));
        // calculate a new quantity, less than x
        int currQuan = Integer.parseInt(quantity_element.getText());
        int amount_to_subtract = currQuan - x + 1;
        this.productExpQuantity = currQuan - amount_to_subtract;
        String amount_to_subtract_str = "-" + amount_to_subtract;
        // enter the amount to subtract in the input box
        // find the input box
        WebElement input_box = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(xpath.dictUseCase_2.get("INPUT: subtract"))));
        // triple click on the box to select all
        Actions actions = new Actions(driver);
        // Perform click three times to simulate a triple-click
        actions.click(input_box).click(input_box).click(input_box).perform();
        // enter the amount to subtract
        input_box.sendKeys(amount_to_subtract_str);
        // save the changes
        driver.findElement(By.xpath(xpath.dictUseCase_2.get("BUTTON: save and publish"))).click();
    }

    public boolean checkProductQuantityUpdated() {
        /**
         * The function checks if the product quantity was updated to less than x
         */
        // check the in stock quantity
        WebElement quantity_element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(xpath.dictUseCase_2.get("STOCK: quantity"))));
        // get the actual quantity
        this.productActualQuantity = Integer.parseInt(quantity_element.getText());
        return this.productActualQuantity == this.productExpQuantity;
    }

    public void closeDriver() {
        /**
         * The function closes the driver
         */
        // close the driver
        driver.quit();
    }
}
