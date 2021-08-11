package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigProperties;
import utils.ElementValues;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LoginSteps extends ElementValues {

    public static WebDriver driver;
    ConfigProperties cp;

    @Given("^user is  on homepage$")
    public void user_is_on_homepage() {
        System.setProperty("webdriver.chrome.driver","web-drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
    }

    @When("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() throws Throwable {
        driver.findElement(By.className("login")).click();

    }

    @And("^user enters username and Password$")
    public void user_enters_username_and_Password() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("test");
        driver.findElement(By.id("SubmitLogin")).click();
    }


    @When("^navigate to register page$")
    public void navigate_to_register_page() throws Throwable {
        driver.findElement(By.className("login")).click();

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);

        driver.findElement(register_submit_textbox).click();
        driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys(randomInt+"username"+ randomInt +"@gmail.com");
        driver.findElement(register_submit_button).click();
    }

    @And("^complete personal information$")
    public void complete_personal_information() throws Throwable {
        driver.findElement(register_gender_radiobutton).click();
        driver.findElement(register_firstname_textbox).click();
        driver.findElement(register_firstname_textbox).sendKeys("cp.firstname");
        driver.findElement(register_lastname_textbox).sendKeys("cp.lastname");
        //driver.findElement(register_email_textbox).sendKeys("^$");
        driver.findElement(register_password_textbox).sendKeys("cp.password");
        driver.findElement(register_day_dropdown).click();
        driver.findElement(register_day_item).click();
        driver.findElement(register_month_dropdown).click();
        driver.findElement(register_day_item).click();
        driver.findElement(register_year_dropdown).click();
        driver.findElement(register_day_item).click();
    }

    @And("^complete address information at registration$")
    public void complete_address_information_at_registration() throws Throwable {
        driver.findElement(address_firstname_textbox).sendKeys("^$");
        driver.findElement(address_lastname_textbox).sendKeys("^$");
        driver.findElement(address_company_textbox).sendKeys("^$");
        driver.findElement(address_address1_textbox).sendKeys("^$");
        driver.findElement(address_address2_textbox).sendKeys("^$");
        driver.findElement(address_city_textbox).sendKeys("^$");
        driver.findElement(address_additional_textarea).sendKeys("1233211232");
        driver.findElement(address_country_dropdown).click();
        driver.findElement(address_country_item).click();
        driver.findElement(address_phone1_textbox).sendKeys("1231231212");
        driver.findElement(address_phone2_textbox).sendKeys("3213213232");
        driver.findElement(address_reference_textbox).sendKeys("^$");
    }

    @And("^verify that new account$")
    public void verify_that_new_account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^go to dresses menu to choose a dress$")
    public void go_to_dresses_menu_to_choose_a_dress() throws Throwable {
        driver.findElement(catalog_dressess_menuitem).click();
        driver.findElement(catalog_summerdressess_menuitem).click();
    }

    @And("^add to shopping cart and make sure for product$")
    public void add_to_shopping_cart_and_make_sure_for_product() throws Throwable {
        driver.findElement(product_product_listitem).click();
        driver.findElement(product_add_button).click();
        driver.findElement(product_proceed_button).click();
    }

    @And("^complete address information at shopping cart$")
    public void complete_address_information_at_shopping_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^complete shipping information$")
    public void complete_shipping_information() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^choose payment type and complete order$")
    public void choose_payment_type_and_complete_order() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^navigate to order history to check order$")
    public void navigate_to_order_history_to_check_order() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^close web application$")
    public void close_web_application() throws Throwable {
        driver.quit();
    }

    @Then("^success message is displayed$")
    public void success_message_is_displayed() throws Throwable {
//        String exp_message = "Welcome to your account. Here you can manage all   of your personal information and orders.";
//        String actual = driver.findElement(By.cssSelector(".info-account")).getText();
//        Assert.assertEquals(exp_message, actual);
        driver.quit();
    }
}
