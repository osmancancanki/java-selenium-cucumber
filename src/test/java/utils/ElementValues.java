package utils;

import org.openqa.selenium.By;

public class ElementValues {
    /*
        LOGIN PAGE
         */
    public By login_login_button = By.className("login");
    //public By login_email_textbox = By.id("email");
    //public By login_password_textbox = By.id("passwd");
    //public By login_submit_button = By.id("SubmitLogin");//*[@id="days"]/option[2]

    public By register_submit_button = By.id("SubmitCreate");
    public By register_submit_textbox = By.xpath("//*[@id='email_create']");
    public By register_gender_radiobutton = By.id("uniform-id_gender1");
    public By register_firstname_textbox = By.id("customer_firstname");
    public By register_lastname_textbox = By.id("customer_lastname");
    public By register_email_textbox = By.id("email");
    public By register_password_textbox = By.id("passwd");
    public By register_day_dropdown = By.id("uniform-days");
    public By register_day_item = By.xpath("//*[@id=\"days\"]/option[2]");
    public By register_month_dropdown = By.id("uniform-months");
    public By register_month_item = By.xpath("//*[@id=\"months\"]/option[2]");
    public By register_year_dropdown = By.id("uniform-years");
    public By register_year_item = By.xpath("//*[@id=\"years\"]/option[2]");

    public By address_firstname_textbox = By.id("firstname");
    public By address_lastname_textbox = By.id("lastname");
    public By address_company_textbox = By.id("company");
    public By address_address1_textbox = By.id("address1");
    public By address_address2_textbox = By.id("address2");
    public By address_city_textbox = By.id("city");
    public By address_additional_textarea = By.id("other");
    public By address_country_dropdown = By.id("uniform-id_country");
    public By address_country_item = By.xpath("//option[text()=\"United States\"]");
    public By address_phone1_textbox = By.id("phone");
    public By address_phone2_textbox = By.id("phone_mobile");
    public By address_reference_textbox = By.id("alias");

    public By catalog_dressess_menuitem = By.xpath("(//*[@title=\"Dresses\"])[2]");
    public By catalog_summerdressess_menuitem = By.xpath("(//*[@title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.'])[1]");

    public By product_product_listitem = By.xpath("(//*[@title='Printed Summer Dress'])[1]");
    public By product_add_button = By.id("add_to_cart");
    public By product_proceed_button = By.xpath("//*[@title='Proceed to checkout']");

}
