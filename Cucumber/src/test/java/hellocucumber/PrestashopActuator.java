package hellocucumber;

import io.cucumber.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PrestashopActuator {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private Xpath xpath = new Xpath();


    public static void userSetup() {
        String webDriver = "webdriver.chrome.driver";
        // Path to ChromeDriver executable
        String path = "C:\\Users\\natal\\OneDrive - post.bgu.ac.il\\Third\\QA\\2025-mbt-s\\Selenium\\chromedriver.exe";

        // System.setProperty(webDriver, path);

        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("http://localhost:8080/login?back=http%3A%2F%2Flocalhost%3A8080%2F");
    }
//    public static void initSessionAsUser(){
//        String webDriver = "webdriver.chrome.driver";
//        // Path to ChromeDriver executable
//        String path = "C:\\Users\\natal\\OneDrive - post.bgu.ac.il\\Third\\QA\\2025-mbt-s\\Selenium\\chromedriver.exe";
//
//        // Suppress ChromeDriver logging for cleaner console output
//        System.setProperty("webdriver.chrome.silentOutput", "true");
//        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(java.util.logging.Level.OFF);
//
//        System.setProperty(webDriver, path);
//        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//
//        // Navigate to the login page URL
//        driver.get("http://localhost/myshop/he/%D7%9B%D7%A0%D7%99%D7%A1%D7%94?back=http%3A%2F%2Flocalhost%2Fmyshop%2Fhe%2Fwomen%2F2-9-brown-bear-printed-sweater.html");
//        driver.manage().window().setPosition(new Point(300, 5));
//        driver.manage().window().maximize();
//        System.out.println("Driver setup finished for - " + driver.getTitle());


//    }

    public void goToLogin(){
        // locate and click on web element -> login
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("SPAN: Sign in"))).click();
    }

    public void enterLoginInfo(String email, String password) {
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

    public void addProductToWishlist(int quantity) {
        // scroll down to find element
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
        // locate and click on the wanted product
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("IMG:\n"))).click();
        // scroll down again
        // find the quantity input box and enter quantity
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(xpath.dictUseCase_1.get("INPUT: QUANTITY"))
        )).sendKeys(String.valueOf(quantity));        // locate and click on web element -> add to wishlist
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("BUTTON: add to wishlist"))).click();
        // choose "My Wishlist" from the dropdown
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("BUTTON: my wishlist"))).click();
    }

    public int checkProductAdded(){
        // Refresh the page
        driver.navigate().refresh();
        // click on the username to go to profile
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("user"))).click();
        // click on the wishlists
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("my wishlists"))).click();
        // click on my wishlist
        driver.findElement(By.xpath(xpath.dictUseCase_1.get("my wishlist"))).click();

        WebElement quantity_element = driver.findElement(By.xpath(xpath.dictUseCase_1.get("quantity")));
//
//        int actual_quantity = quantity_element.getText();
////        print(f"נמצאה כמות: {actual_quantity}")
//        return int(actual_quantity);
        return 0;
    }
}
