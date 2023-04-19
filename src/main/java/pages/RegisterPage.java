package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {

    ChromeDriver driver;


    //webelements in modal "ULOGUJ SE"
    @FindBy(xpath = "//a[@class = 'register-link']")
    WebElement registerLinkLoginField;

    //webelements in page "REGISTRUJ SE"

    @FindBy(xpath = "//input[@name='first_name']")
    WebElement registerName;

    @FindBy(xpath = "//input[@name='last_name']")
    WebElement registerLastName;

    @FindBy(xpath = "//div[@class='col-md-9 col-lg-8']/input[@name='email']")
    WebElement registerEmail;

    @FindBy(xpath = "//input[@name='phone']")
    WebElement registerPhone;

    @FindBy(xpath = "//input[@name='city']")
    WebElement registerCity;

    @FindBy(xpath = "//input[@name='address']")
    WebElement registerAddress;

    @FindBy(xpath = "//input[@name='postal_number']")
    WebElement registerPostalNumber;

    @FindBy(xpath = "//div[@class='col-md-9 col-lg-8']/input[@id='password']")
    WebElement registerPassword;

    @FindBy(xpath = "//input[@id='repeat-password']")
    WebElement registerRepeatPassword;

    @FindBy(xpath = "//button[@class='btn-t1 blue margin fl-right xs-block']")
    WebElement registerSubmitButton;

    @FindBy(xpath = "//span[contains(text(), 'Niste ispunili SPAM proveru!')]")
    WebElement nisteIspuniliSpamProveruMsg;


    //constructor


    public RegisterPage(ChromeDriver driver) {
        this.driver = driver;
        driver.get(Strings.REGISTER_PAGE_URL);
        PageFactory.initElements ( driver, this);
    }


    //Method (LoginPage)


    /*
     * Method clicks on a register link in Login Field
     */

    public void clickRegisterLinkLoginField() {
        JSclkElement(driver, registerLinkLoginField);
        ;

    }

    //Methods

    /*
     * Method clicks and enters Register Name
     */

    public void enterRegisterName(){
        assert isElementPresent ( registerName ):"Error. Element Register Name is not present.";
        registerName.click ();
        registerName.sendKeys ( Strings.REGISTER_NAME );
    }

    /*
     * Method clicks and enters Register Last Name
     */
    public void enterRegisterLastName(){
        assert isElementPresent ( registerLastName ):"Error. Element Register Last Name is not present.";
        registerLastName.click ();
        registerLastName.sendKeys ( Strings.REGISTER_LAST_NAME );
    }

    /*
     * Method clicks and enters Register Email
     */
    public void enterRegisterEmail(){
        assert isElementPresent ( registerEmail ):"Error. Element Register Email is not present.";
        registerEmail.click ();
        registerEmail.sendKeys ( Strings.REGISTER_EMAIL );
    }

    /*
     * Method clicks and enters Register Phone
     */
    public void enterRegisterPhone(){
        assert isElementPresent ( registerPhone ):"Error. Element Register Phone is not present.";
        registerPhone.click ();
        registerPhone.sendKeys ( Strings.REGISTER_PHONE );
    }

    /*
     * Method clicks and enters Register City
     */
    public void enterRegisterCity(){
        assert isElementPresent ( registerCity ):"Error. Element Register City is not present.";
        registerCity.click ();
        registerCity.sendKeys ( Strings.REGISTER_CITY );
    }

    /*
     * Method clicks and enters Register Address
     */
    public void enterRegisterAddress(){
        assert isElementPresent ( registerAddress ):"Error. Element Register Address is not present.";
        registerAddress.click ();
        registerAddress.sendKeys ( Strings.REGISTER_ADDRESS );
    }

    /*
     * Method clicks and enters Register Postal Number
     */
    public void enterPostalNumber(){
        assert isElementPresent ( registerPostalNumber ):"Error. Element Register Postal Number is not present";
        registerPostalNumber.click ();
        registerPostalNumber.sendKeys ( Strings.REGISTER_POSTAL_NUMBER );
    }

    /*
     * Method clicks and enters Register Password
     */
    public void enterRegisterPassword(){
        assert isElementPresent ( registerPassword ):"Error. Element Register Password is not present";
        registerPassword.click ();
        registerPassword.sendKeys ( Strings.REGISTER_PASSWORD );
    }

    /*
     * Method clicks and enters Register Repeat Password
     */
    public void enterRepeatPassword(){
        assert isElementPresent ( registerRepeatPassword ):"Error. Element Register Repeat Password is not present";
        registerRepeatPassword.click ();
        registerRepeatPassword.sendKeys ( Strings.REGISTER_REPEAT_PASSWORD );
    }


    /*
     * Method clicks on a Register Submit Button
     */
    public void clickRegisterSubmitButton () {
        isElementPresent(registerSubmitButton);
        JSclkElement(driver, registerSubmitButton);
    }

    /*
     * Method : verify that registration page is loaded
     */

    public boolean isRegistrationPageLoaded () {
        return   isElementPresent(nisteIspuniliSpamProveruMsg);

    }

}


