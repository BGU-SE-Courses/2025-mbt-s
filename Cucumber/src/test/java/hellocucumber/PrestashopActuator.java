package hellocucumber;

import io.cucumber.java.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrestashopActuator {
    private static WebDriver driver;
    private static WebDriverWait wait;

    public void initSessionAsUser(String webDriver, String path){
        // webDriver = "webdriver.chrome.driver"
        System.setProperty(webDriver, path);

        // new chrome driver object
        this.driver = new ChromeDriver();

        // new web driver wait -> waits until element are loaded (40 sec max)
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(40));


        // launch website -> localhost
        driver.get("http://localhost/OpenCartFile/");

        // maximize the window - some web apps look different in different sizes
        driver.manage().window().setPosition(new Point(700, 5));

        System.out.println("Driver setup finished for - " + driver.getTitle());
    }

    public void goToLogin(){
        // locate and click on web element -> login
        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).click();
    }

    public void enterLoginInfo(String username, String password) {
        // locate the username input box and enter username
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='input-email']"))).sendKeys(username);
        // locate the password input box and enter password
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='input-password']"))).sendKeys(password);
        // locate Log in button and press
        driver.findElement(By.xpath("//*[@id='form-login']/div/button[1]")).click();
        // Wait for a moment
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // enter sign in button?
    }

    public void addProductToWishlist(int quantity) {
        // scroll down to find element
        // locate and click on web element -> wishlist
        driver.findElement(By.xpath("")).click();
        // scroll down again
        // find the quantity input box and enter quantity
        driver.findElement(By.xpath("")).sendKeys(String.valueOf(quantity));
        // locate and click on web element -> add to wishlist
        driver.findElement(By.xpath("")).click();
        // choose "My Wishlist" from the dropdown
        driver.findElement(By.xpath("")).click();
    }

    public void checkProductAdded(int quantity){
        // Refresh the page
        driver.navigate().refresh();
        // click on the username to go to profile
        driver.findElement(By.xpath("")).click();
        // click on the wishlist
        driver.findElement(By.xpath("")).click();
        // open list dropdown
        driver.findElement(By.xpath("")).click();
        // how to valide the quantity?
    }
}
