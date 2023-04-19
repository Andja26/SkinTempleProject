package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Strings;

public class RedirectToSocialMediaTest extends BaseTest {



    ChromeDriver driver;

    /**
     * Redirect to Social Network Instagram
     * Steps:
     * 1. Navigate to www.skintemple.rs
     * 2. Click on instagram icon (footer)
     *
     * Expected result:
     * 2.a New tab is open and user is redirected to INSTAGRAM url
     */


    @Test

    public void redirectToInstagram () {

        ChromeDriver driver = openChromeDriver();

        try {
            print("1. Navigate to www.skintemple.rs");
            BasePage basepage = new BasePage(driver);
            print("2. Click on Instagram icon");
            print("2.a Verify that new tab (Instagram) is open");
            String actualUrl = basepage.clickOnInstagramIcon();
            assert actualUrl.equals(Strings.INSTAGRAM) : "User is on a wrong page. " + Strings.INSTAGRAM +
                    " Actual "  + actualUrl;

        } finally {

            driver.quit();
        }
    }

    /**
     * Redirect to Social Network Facebook
     * Steps:
     * 1. Navigate to www.skintemple.rs
     * 2. Click on facebook icon (footer)
     *
     * Expected result:
     * 2.a New tab is open and user is redirected to FACEBOOK url
     */


    @Test

    public void redirectToFacebook () {

        ChromeDriver driver = openChromeDriver();

        try {
            print("1. Navigate to www.skintemple.rs");
            BasePage basepage = new BasePage(driver);
            print("2. Click on Facebook icon");
            print("2.a Verify that new tab (Facebook) is open");
            String actualUrl = basepage.clickOnFacebookIcon();
            assert actualUrl.equals(Strings.FACEBOOK) : "User is on a wrong page. " + Strings.FACEBOOK +
                    " Actual "  + actualUrl;
        } finally {

            driver.quit();
        }
    }
}
