package hellocucumber;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("hellocucumber")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
public class RunCucumberTest {
    public static WebDriver driver;
    public static WebDriverWait wait;  // wait until done loading

    public void initSessionAsUser(String webDriver, String webDriverPath) {
        System.setProperty(webDriver, webDriverPath);
        this.driver = new ChromeDriver();
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(40));

        this.driver.get("http://localhost:8080");
        this.driver.manage().window().setPosition(new Point(700, 5));

        System.out.println("Driver initialized for - " + this.driver.getTitle());
    }



    public void closeSession() {
        this.driver.quit();
    }
}
