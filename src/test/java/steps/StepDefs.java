package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.ConfigReader;
import utils.ElementReader;

import java.util.Random;

public class StepDefs extends BaseTest {
    ConfigReader configReader = new ConfigReader();
    ElementReader loginElements = new ElementReader("login");
    ElementReader addressElements = new ElementReader("address");
    ElementReader productElements = new ElementReader("product");

    @Given("^user is  on homepage$")
    public void user_is_on_homepage() {
        initializeDriver();
    }

    @When("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() {
        driver.findElement(loginElements.getElementValue("login_button")).click();

    }

    @And("^user enters username and Password$")
    public void user_enters_username_and_Password() {
        driver.findElement(loginElements.getElementValue("login_email_input")).sendKeys(configReader.getProperty("user_email"));
        driver.findElement(loginElements.getElementValue("login_password_input")).sendKeys("test");
        driver.findElement(loginElements.getElementValue("login_submit_button")).click();
    }


    @When("^navigate to register page$")
    public void navigate_to_register_page() {
        driver.findElement(loginElements.getElementValue("login_button")).click();

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);

        driver.findElement(loginElements.getElementValue("register_submit_text_box")).click();
        driver.findElement(loginElements.getElementValue("register_submit_text_box")).sendKeys(randomInt + "username" + randomInt + "@gmail.com");
        driver.findElement(loginElements.getElementValue("register_submit_button")).click();
    }

    @And("^complete personal information$")
    public void complete_personal_information() {
        driver.findElement(loginElements.getElementValue("register_gender_radio_button")).click();
        driver.findElement(loginElements.getElementValue("register_firstname_text_box")).click();
        driver.findElement(loginElements.getElementValue("register_firstname_text_box")).sendKeys(configReader.getProperty("first_name"));
        driver.findElement(loginElements.getElementValue("register_lastname_text_box")).sendKeys(configReader.getProperty("last_name"));
        driver.findElement(loginElements.getElementValue("register_password_text_box")).sendKeys(configReader.getProperty("user_password"));
        driver.findElement(loginElements.getElementValue("register_day_dropdown")).click();
        driver.findElement(loginElements.getElementValue("register_day_item")).click();
        driver.findElement(loginElements.getElementValue("register_month_dropdown")).click();
        driver.findElement(loginElements.getElementValue("register_month_item")).click();
        driver.findElement(loginElements.getElementValue("register_year_dropdown")).click();
        driver.findElement(loginElements.getElementValue("register_year_item")).click();
    }

    @And("^complete address information at registration$")
    public void complete_address_information_at_registration() {
        driver.findElement(addressElements.getElementValue("address_company_text_box")).sendKeys("loremipsum");
        driver.findElement(addressElements.getElementValue("address_address1_text_box")).sendKeys("loremipsum");
        driver.findElement(addressElements.getElementValue("address_address2_text_box")).sendKeys("loremipsum");
        driver.findElement(addressElements.getElementValue("address_city_text_box")).sendKeys("loremipsum");
        driver.findElement(addressElements.getElementValue("address_additional_text_area")).sendKeys("1233211232");

        driver.findElement(addressElements.getElementValue("address_country_dropdown")).click();
        driver.findElement(addressElements.getElementValue("address_country_item")).click();

        driver.findElement(addressElements.getElementValue("address_phone1_text_box")).sendKeys("1231231212");
        driver.findElement(addressElements.getElementValue("address_phone1_text_box")).sendKeys("3213213232");

        driver.findElement(addressElements.getElementValue("address_reference_text_box")).sendKeys("loremipsum");
    }

    @And("^verify that new account$")
    public void verify_that_new_account() {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^go to dresses menu to choose a dress$")
    public void go_to_dresses_menu_to_choose_a_dress() {
        driver.findElement(productElements.getElementValue("catalog_dressess_menu_item")).click();
        driver.findElement(productElements.getElementValue("catalog_summerdressess_menu_item")).click();
    }

    @And("^add to shopping cart and make sure for product$")
    public void add_to_shopping_cart_and_make_sure_for_product() {
        driver.findElement(productElements.getElementValue("product_product_list_item")).click();
        driver.findElement(productElements.getElementValue("product_add_button")).click();
        driver.findElement(productElements.getElementValue("product_proceed_button")).click();
    }

    @And("^complete address information at shopping cart$")
    public void complete_address_information_at_shopping_cart() {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^complete shipping information$")
    public void complete_shipping_information() {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^choose payment type and complete order$")
    public void choose_payment_type_and_complete_order() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^navigate to order history to check order$")
    public void navigate_to_order_history_to_check_order() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^close web application$")
    public void close_web_application() {
        driver.quit();
    }

    @Then("^success message is displayed$")
    public void success_message_is_displayed() {
        killDriver();
    }
}
