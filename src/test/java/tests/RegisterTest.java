package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.RegisterPage;
import pages.Strings;

public class RegisterTest extends BaseTest {


    ChromeDriver driver;

    /**
     * Register with valid credentials
     * Steps:
     * 1.  Navigate to www.skintemple.rs
     * 2.  Click on a login icon
     * 3.  Click on a registration link
     * 4.  Enter valid credentials
     * 5.  Enter valid password and repeat password
     * 6.  Click on Submit button
     * Expected result:
     * 6.a Assert: Message "Niste ispunili SPAM proveru!" is present
     * 6.b Assert: User is still on a registration page
     */



    @Test
    public void registerWithValidCredentials   ()  {

        ChromeDriver driver = openChromeDriver();

        try {
            print("1. Navigate to www.skintemple.rs");
            RegisterPage registerPage = new RegisterPage(driver);
            print("2. Click on a login icon ");
            registerPage.clickOnLoginIcon();
            print("3. Click on a registration link ");
            registerPage.clickRegisterLinkLoginField();
            print("4. Enter valid register name");
            registerPage.enterRegisterName();
            print("4a. Enter valid register last name");
            registerPage.enterRegisterLastName();
            print("4b. Enter valid register email");
            registerPage.enterRegisterEmail();
            print("4c. Enter valid register phone");
            registerPage.enterRegisterPhone();
            print("4d. Enter valid register city");
            registerPage.enterRegisterCity();
            print("4e. Enter valid register address");
            registerPage.enterRegisterAddress();
            print("4f. Enter valid postal number");
            registerPage.enterPostalNumber();
            print("5. Enter valid password");
            registerPage.enterRegisterPassword();
            print("5a. Enter repeat password");
            registerPage.enterRepeatPassword();
            print("6. Click on a submit button");
            registerPage.clickRegisterSubmitButton();
            print("6a. Assert: Message" + "Niste ispunili SPAM proveru!" + "is present");
            assert registerPage.isRegistrationPageLoaded() : "User is on a wrong page.";

            print("6b. Assert: " + "User is still on register page.");
            String actualUrl = driver.getCurrentUrl();
            assert actualUrl.equals(Strings.REGISTER_PAGE_URL) : "User is on a wrong page. " +
                    Strings.REGISTER_PAGE_URL + " Actual "  + actualUrl;


        } finally {

            driver.quit();
        }

    }





}
