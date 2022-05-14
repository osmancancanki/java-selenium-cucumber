package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utils.ConfigReader;

import java.util.concurrent.TimeUnit;

public class BaseTest {

   public WebDriver driver;
   ConfigReader configReader = new ConfigReader();

    public void initializeDriver() {

        if (configReader.getProperty("web_driver").equals("chrome")) {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();

            driver = new ChromeDriver(options);
            options.addArguments("incognito");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        else if(configReader.getProperty("web_driver").equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if(configReader.getProperty("web_driver").equals("ie")){
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        driver.get(configReader.getProperty("base_url"));
    }

    public void killDriver() {
    /*    if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            if (screenshot != null ) {
                scenario.attach(screenshot, "image/png", "screenshots");
            }
        }
    */
        if(driver!=null){

            driver.close();
        }
    }
}
