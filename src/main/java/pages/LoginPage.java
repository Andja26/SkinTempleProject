package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    ChromeDriver driver;


    //webelements in modal "ULOGUJ SE" ( da li da ih pisem na srpskom?)

    @FindBy(id = "email-login" )
    WebElement emailLoginField;

    @FindBy (id = "password_login" )
    WebElement passwordLoginField;

    @FindBy (xpath = "//button[text() ='Uloguj se']")
    WebElement loginButtonLoginField;

    @FindBy (xpath = "//a[@href = 'https://www.skintemple.rs/sr/izloguj-se']")
    WebElement signOutOptionLoginField;

    @FindBy (xpath = "//span[@class='fa fa-user']")
    WebElement loginIconAfterLoggingIn;

    @FindBy (xpath = "//span[contains(text(), 'Pogrešni podaci za pristup')]")
    WebElement errorMsgPogresniPodaciZaPristup;
    @FindBy (xpath = "//span[contains(text(),'Uneti email nije ispravan!')]")
    WebElement errorMsgUnetiEmailNijeIspravan;

    @FindBy (xpath = "//span[contains(text(),'Niste uneli email')]")
    WebElement errorMsgNisteUneliEmail;


    //constructor


    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
        driver.get(Strings.BASE_PAGE_URL);
        PageFactory.initElements ( driver, this);
    }

    //Methods

    /*
     * Method clicks and enters text in  email field
     */
    public void enterTextInEmailField(String text) {
        print("enterTextInEmailField");
        assert isElementPresent(emailLoginField);
        emailLoginField.click();
        emailLoginField.sendKeys(text);
    }

    /*
     * Method clicks and enters text in  password field
     */
    public void enterTextInPasswordField(String text) {
        print("enterTextInPasswordField");
        assert isElementPresent(passwordLoginField);
        passwordLoginField.click();
        passwordLoginField.sendKeys(text);
    }

    /*
     * Method clicks on a login button in Login Field
     */
    public void clickLoginButtonLoginField() {
        loginButtonLoginField.click();
    }

    /*
     * Method shows if Sign Out option is present
     */
    public void assertIsIsSignOutOptionPresent () {
        assert isElementPresent ( signOutOptionLoginField ):"Error. Sign Out option is not shown.";

    }


    /*
     * Method clicks on a loginIconAfterLoggingIn Login Field
     */
    public void clickOnLogInIconAfterLoggingIn (){
        JSclkElement(driver, loginIconAfterLoggingIn);
    }


    /*
     Method asserts if msg: "Pogresni podaci za pristup" is present
     * valid user name, invalid pass
     */
    public String getMsgPogresniPodaciZaPristup  () {
        //  sleep(10);
        print("getMsgPogresniPodaciZaPristup" );
        return errorMsgPogresniPodaciZaPristup .getText();
    }

    /*
     * Method asserts if msg: "Uneti email nije ispravan" is present
     * invalid user name, valid pass
     */
    public String getMsgUnetiEmailNijeIspravan  () {
        //  sleep(10);
        print("getMsgUnetiEmailNijeIspravan");
        return errorMsgUnetiEmailNijeIspravan.getText();
    }

    /*
     * Method asserts if msg: "Niste uneli email " is present
     * without credentials
     */
    public String getMsgNisteUneliEmail() {
        //  sleep(10);
        print("getMsgNisteUneliEmail");
        return errorMsgNisteUneliEmail.getText();
    }

    /*
     * Method asserts if page is loaded
     */
    public boolean isPageLoaded ()  {
        //wait(10);
        return isElementPresent(signOutOptionLoginField);
    }

}
