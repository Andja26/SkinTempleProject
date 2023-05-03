package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ShoppingPage;
import pages.Strings;

public class ShoppingTest extends BaseTest {



    ChromeDriver driver;

    /**
     * User is buying "krema puzeva sluz" using search bar
     * Steps:
     * 1.  Login with valid credentials
     * 2.  Click on search icon
     * 3.  Enter name of the item and click on search
     * 3.a Verify that user is on "pretraga" page
     * 4.  Choose item by clicking on a image
     * 4.a Verify that user is on "proizvod" page
     * 5.  Click on add to basket button/dodaj u korpu
     * 5.a Verify that number in basket is 1
     * 6.  Click on a basket
     * 7.  Click on "porucivanje" button
     * 8.  Click on "potvrdjujem porudzbinu" button
     * Expected result:
     * Verify that user is redirected to item url
     * Verify that message "Morate prihvatiti uslove korišćenja!" is present,
       after clicking on a "potvrdjujem porudzbinu" button
     */


    @Test
    public void shoppingTestKremaPuzevaSluz() {

        ChromeDriver driver = openChromeDriver();

        try {

            ShoppingPage shoppingPage = new ShoppingPage(driver);
            print("1. Login with valid credentials");
            shoppingPage.loginToSkintemple(driver);

            BasePage basePage = new BasePage(driver);
            print("2. Click on search icon");
            // basePage.wait(15);
            sleep(5);
            basePage.clickOnSearchIcon();

            print("3. Enter name of the item and click on search");
            basePage.enterTextAndSearch("krema puzeva sluz");

            print("3a. Verify that user is on 'pretraga' page");
            String actualUrl = driver.getCurrentUrl();
            assert actualUrl.equals(Strings.PRETRAGA_URL) : "User is on a wrong page. " +
                    Strings.PRETRAGA_URL + " Actual "  + actualUrl;

            print("4. Choose item by clicking on a image Puzeva sluz");
            shoppingPage.clickImgPuzevaSluz();

            print("4a. Verify that user is on 'proizvod' page ");
            String actualUrl1 = driver.getCurrentUrl();
            assert actualUrl1.equals(Strings.PROIZVOD_URL) : "User is on a wrong page. " +
                    Strings.PROIZVOD_URL + " Actual "  + actualUrl1;

            print("5. Click on add to basket button/dodaj u korpu");
            shoppingPage.clickAddToBasketButton();

            print("5a. Verify that number in basket is 1");
            String actualNumber = shoppingPage.getNumberFromShoppingCartIcon();
            assert actualNumber.equals("(1)") : "Wrong numeber in shopping cart" +
                    " Expected: 1. Acctual " + actualNumber;

            print("6. Click on a basket");
            basePage.clickOnShoppingCartIcon();

            print("7.  Click on porucivanje button");
            shoppingPage.clickPorucivanjeButton();

            print(" Verify that user is redirected to  url ");

            String actualUrl2 = driver.getCurrentUrl();
            assert actualUrl2.equals(Strings.DOSTAVA_URL) : "User is on a wrong page. " +
                    Strings.DOSTAVA_URL + " Actual "  + actualUrl2;

            print("8.  Click on potvrdjujem porudzbinu button");
            shoppingPage.clickPotvrdjujemPorudzbinu();

            print(" Verify that message" + "Morate prihvatiti uslove korišćenja!" + "is present");

            String actualText = shoppingPage.getMsgUsloviKoriscenja();
            assert actualText.equals("Morate prihvatiti uslove korišćenja!") : "Wrong text" +
                    " Expected: " + "Morate prihvatiti uslove korišćenja!" + actualText;


        } finally {

           driver.quit();
        }

    }




    /**
     * User is buying "Pyunkang Yul Krema za hidrataciju" using search bar
     * Steps:
     * 1.  Login with valid credentials
     * 2.  Click on search icon
     * 3.  Enter name of the item and click on search
     * 3.a Verify that user is on "pretraga" page
     * 4.  Choose item by clicking on a image
     * 4.a Verify that user is on "proizvod" page
     * 5.  Click on add to basket button/dodaj u korpu
     * 5.a Verify that number in basket is 1
     * 6.  Click on a basket
     * 7.  Click on "porucivanje" button
     * 8.  Click on "potvrdjujem porudzbinu" button
     * Expected result:
     * Verify that user is redirected to item url
     * Verify that message "Morate prihvatiti uslove korišćenja!" is present,
     after clicking on a "potvrdjujem porudzbinu" button
     */


    @Test
    public void shoppingTestKremaPyunkangYul () {

        ChromeDriver driver = openChromeDriver();

        try {

            ShoppingPage shoppingPage = new ShoppingPage(driver);
            print("1. Login with valid credentials");
            shoppingPage.loginToSkintemple(driver);

            BasePage basePage = new BasePage(driver);
            print("2. Click on search icon");
            // basePage.wait(15);
            sleep(5);
            basePage.clickOnSearchIcon();

            print("3. Enter name of the item and click on search");
            basePage.enterTextAndSearch("Pyunkang Yul Krema za hidrataciju");

            print("3a. Verify that user is on 'pretraga' page");
            String actualUrl = driver.getCurrentUrl();
            assert actualUrl.equals(Strings.PRETRAGA1_URL) : "User is on a wrong page. " +
                    Strings.PRETRAGA1_URL + " Actual "  + actualUrl;

            print("4. Choose item by clicking on a image Pyunkang Yul Krema");
            shoppingPage.clickImgPyunkangYulKrema();

            print("4a. Verify that user is on 'proizvod' page ");
            String actualUrl1 = driver.getCurrentUrl();
            assert actualUrl1.equals(Strings.PROIZVOD1_URL) : "User is on a wrong page. " +
                    Strings.PROIZVOD1_URL + " Actual "  + actualUrl1;

            print("5. Click on add to basket button/dodaj u korpu");
            shoppingPage.clickAddToBasketButton();

            print("5a. Verify that number in basket is 1");
            String actualNumber = shoppingPage.getNumberFromShoppingCartIcon();
            assert actualNumber.equals("(1)") : "Wrong numeber in shopping cart" +
                    " Expected: 1. Acctual " + actualNumber;

            print("6. Click on a basket");
            basePage.clickOnShoppingCartIcon();

            print("7.  Click on porucivanje button");
            shoppingPage.clickPorucivanjeButton();

            print(" Verify that user is redirected to  url ");

            String actualUrl2 = driver.getCurrentUrl();
            assert actualUrl2.equals(Strings.DOSTAVA_URL) : "User is on a wrong page. " +
                    Strings.DOSTAVA_URL + " Actual "  + actualUrl2;

            print("8.  Click on potvrdjujem porudzbinu button");
            shoppingPage.clickPotvrdjujemPorudzbinu();

            print(" Verify that message" + "Morate prihvatiti uslove korišćenja!" + "is present");

            String actualText = shoppingPage.getMsgUsloviKoriscenja();
            assert actualText.equals("Morate prihvatiti uslove korišćenja!") : "Wrong text" +
                    " Expected: " + "Morate prihvatiti uslove korišćenja!" + actualText;


        } finally {

           driver.quit();
        }


    }



}
