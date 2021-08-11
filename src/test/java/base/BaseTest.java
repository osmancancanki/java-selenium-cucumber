package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait webDriverWait;

    Properties prop = new Properties();

    FileInputStream ip = new FileInputStream(
            "src/test/java/utils/ConfigProperties.java");

    public BaseTest() throws FileNotFoundException {
    }

    String wb = prop.getProperty("WD");

    public void initializeDriver() {

        if (wb.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

            ChromeOptions options = new ChromeOptions();

            driver = new ChromeDriver(options);
            options.addArguments("incognito");
            driver.manage().window().maximize();

            //driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            //driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        }
        else if(wb.equals("FF")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new FirefoxDriver();
        }
        else if(wb.equals("IE")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new InternetExplorerDriver();
        }
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
