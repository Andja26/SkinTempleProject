package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HamburgerMenuPage;
import pages.Strings;

public class HamburgerMenuTest extends BaseTest {



    ChromeDriver driver;

    /**
     * User goes to "Nase price i trendovi" page using Hamburger menu
     * Steps:
     * 1. Navigate to www.skintemple.rs
     * 2. Click on Hamburger menu
     * 3. Click on "Nase Price i Trendovi"
     *
     * Expected result:
     * 3. Verify that user is redirected to NASE_PRICE_I_TRENDOVI URL
     */

    @Test

    public void goToNasePriceiTrendoviPage () {

        ChromeDriver driver = openChromeDriver();


        try {
            print("1. Navigate to www.skintemple.rs");
            HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage(driver);

            print("2. Click on hamburger menu");
            hamburgerMenuPage.clickOnHamburgerMenu();

            print("3. Click on Nase Price i Trendovi");
            hamburgerMenuPage.clickNasePriceItrendovi();

            String actualUrl = driver.getCurrentUrl();
            assert actualUrl.equals(Strings.NASE_PRICE_I_TRENDOVI) : "User is on a wrong page. " +
                    Strings.NASE_PRICE_I_TRENDOVI + " Actual "  + actualUrl;

        } finally {

            driver.quit();
        }
    }




    /**
     * User goes to "O nama" page using Hamburger menu
     * Steps:
     * 1. Navigate to www.skintemple.rs
     * 2. Click on hamburger menu
     * 3. Click on "O nama"
     *
     * Expected result:
     * 3. Verify that user is redirected to O_NAMA url
     */

    @Test

    public void goToOnamaPage () {

        ChromeDriver driver = openChromeDriver();

        try {
            print("1. Navigate to www.skintemple.rs");
            HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage(driver);

            print("2. Click on hamburger menu");
            hamburgerMenuPage.clickOnHamburgerMenu();

            print("3. Click on O nama");
            hamburgerMenuPage.clickOnama();

            String actualUrl = driver.getCurrentUrl();
            assert actualUrl.equals(Strings.O_NAMA) : "User is on a wrong page. " +
                    Strings.O_NAMA + " Actual "  + actualUrl;

        } finally {

            driver.quit();
        }
    }


    /**
     * User goes to "Kontakt" page using Hamburger menu
     * Steps:
     * 1. Navigate to www.skintemple.rs
     * 2. Click on hamburger menu
     * 3. Click on "Kontak"
     *
     * Expected result:
     * 3. Verify that user is redirected to KONTAKT url
     */


    @Test

    public void goToKontaktPage () {

        ChromeDriver driver = openChromeDriver();

        try {
            print("1. Navigate to www.skintemple.rs");
            HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage(driver);

            print("2. Click on hamburger menu");
            hamburgerMenuPage.clickOnHamburgerMenu();

            print("3. Click on Kontakt");
            hamburgerMenuPage.clickKontakt();

            String actualUrl = driver.getCurrentUrl();
            assert actualUrl.equals(Strings.KONTAKT) : "User is on a wrong page. " +
                    Strings.KONTAKT + " Actual "  + actualUrl;

        } finally {

            driver.quit();
        }
    }

}
