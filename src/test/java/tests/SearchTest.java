package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Strings;

public class SearchTest extends BaseTest {


    ChromeDriver driver;

    /**
     * User searches for item trough Search option
     * Steps:
     * 1. Navigate to www.skintemple.rs
     * 2. Click on search icon
     * 3. Click and enter name of item
     *
     * Expected result:
     * 3. Verify that user is redirected to item url
     */


    @Test
    public void searchKremaPuzevaSluz () {

        ChromeDriver driver = openChromeDriver();

        try {

            print("1. Navigate to www.skintemple.rs");
            BasePage basePage = new BasePage(driver);
            print("2. Click on a search icon ");
            basePage.clickOnSearchIcon();
            print("3. Click and enter name of item");
            basePage.enterTextAndSearch("krema puzeva sluz");

            String actualUrl = driver.getCurrentUrl();
            assert actualUrl.equals(Strings.KREMA_URL) : "User is on a wrong page. " +
                    Strings.KREMA_URL + " Actual "  + actualUrl;

        }finally {

            driver.quit();
        }
    }


}
