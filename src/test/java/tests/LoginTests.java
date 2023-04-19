package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Strings;

public class LoginTests extends BaseTest {




    /**
     * Login with valid credentials
     * Steps:
     * 1. Navigate to www.skintemple.rs
     * 2. Click on a login icon
     * 3. Enter valid username
     * 4. Enter valid password
     * 5. Click Login button
     *
     * Expected result:
     * Verify that user is logged in
     * Verify that option "Odjavi se" is present
     */


    @Test(dataProvider = "validCredentials", dataProviderClass = DataProvider.class)
    public void loginWithValidCredentials  (String username, String password)  {


        ChromeDriver driver = openChromeDriver();

        try {
            print("1. Navigate to www.skintemple.rs");
            LoginPage loginPage = new pages.LoginPage (driver);
            print("2. Click on a login icon ");
            loginPage.clickOnLoginIcon();
            print("3. Enter valid username");
            loginPage.enterTextInEmailField (username);
            print("4. Enter valid password");
            loginPage.enterTextInPasswordField(password);
            print("5. Click Login button");
            loginPage.clickLoginButtonLoginField();
            print("5. Click on login icon after logging in ");
            loginPage.clickOnLogInIconAfterLoggingIn();
            //   sleep(5);
            print ("5. Verify that  Odjavi se option is present" );
            //  loginPage.assertIsIsSignOutOptionPresent();
            assert loginPage.isPageLoaded() : "User is on a wrong page.";

        } finally {

            driver.quit();
        }

    }
    /**
     * Login with valid user and invalid password
     * Steps:
     * 1. Navigate to www.skintemple.rs
     * 2. Click on a login icon
     * 3. Enter valid username
     * 4. Enter invalid password
     * 5. Click Login button
     *
     * Expected result:
     * Verify that error message is shown: "Pogrešni podaci za pristup"
     */


    @Test (dataProvider = "invalidPassword", dataProviderClass = DataProvider.class)
    public void loginWithValidUserAndInvalidPass (String username, String invalidPassword)  {

        ChromeDriver driver = openChromeDriver();

        try {
            print("1. Navigate to www.skintemple.rs");
            LoginPage loginPage = new pages.LoginPage (driver);
            print("2. Click on a login icon ");
            loginPage.clickOnLoginIcon();
            print("3. Enter valid username");
            loginPage.enterTextInEmailField (username);
            print("4. Enter invalid password");
            loginPage.enterTextInPasswordField(invalidPassword);
            print("5. Click Login button");
            loginPage.clickLoginButtonLoginField();
            sleep(5);
            print("5. Verify that error message is shown: Pogrešni podaci za pristup");
            //loginPage.assertIsMsgPogresniPodaciZaPristupIsPresent();
            String actualText = loginPage.getMsgPogresniPodaciZaPristup();
            assert actualText.equals("Pogrešni podaci za pristup") : "Wrong text" +
                    " Expected: " + "Pogrešni podaci za pristup " + actualText;

        } finally{

            driver.quit();
        }

    }

    /**
     * Login with invalid user and valid password
     * Steps:
     * 1. Navigate to www.skintemple.rs
     * 2. Click on a login icon
     * 3. Enter invalid username
     * 4. Enter valid password
     * 5. Click Login button
     *
     * Expected result:
     * Verify that error message is shown: "Uneti email nije ispravan!"
     */


    @Test
    public void loginWithInvalidUserAndValidPass ()  {

        ChromeDriver driver = openChromeDriver();

        try {
            print("1. Navigate to www.skintemple.rs");
            LoginPage loginPage = new pages.LoginPage (driver);
            print("2. Click on a login icon ");
            loginPage.clickOnLoginIcon();
            print("3. Enter valid username");
            loginPage.enterTextInEmailField (Strings.INVALID_USERNAME);
            print("4. Enter invalid password");
            loginPage.enterTextInPasswordField(Strings.VALID_PASSWORD);
            print("5. Click Login button");
            loginPage.clickLoginButtonLoginField();
            print("5. Verify that error message is shown: Uneti email nije ispravan!");
            //  loginPage.assertIsErrorMsgUnetiEmailNijeIspravanPresent();

            String actualText = loginPage.getMsgUnetiEmailNijeIspravan();
            assert actualText.equals("Uneti email nije ispravan!") : "Wrong text" +
                    " Expected: " + "Uneti email nije ispravan! " + actualText;

        } finally {

            driver.quit();
        }

    }

    /**
     * Login without credentials
     * Steps:
     * 1. Navigate to www.skintemple.rs
     * 2. Click Login icon
     * 3. Click Login button
     *
     * Expected result:
     * Verify that error message is shown: "Niste uneli email"
     */

    @Test
    public void loginWithoutCredentials () {

        ChromeDriver driver = openChromeDriver();

        try {
            print("1. Navigate to www.skintemple.rs");
            LoginPage loginPage = new pages.LoginPage (driver);
            print("2. Click on a login icon ");
            loginPage.clickOnLoginIcon();
            print("3. Click Login button");
            loginPage.clickLoginButtonLoginField();
            print("3. Verify that error message is shown: Niste uneli email ");
            // loginPage.assertIsErrorMsgNisteUneliEmailPresent();
            String actualText = loginPage.getMsgNisteUneliEmail();
            assert actualText.equals("Niste uneli email") : "Wrong text" +
                    " Expected: " + "Niste uneli email  " + actualText;

        } finally {

            driver.quit();
        }

    }

}
