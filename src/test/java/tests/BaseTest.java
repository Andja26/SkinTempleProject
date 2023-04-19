package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BaseTest {


    ChromeDriver driver;


    /**
     * Method for ChromeDriver
     */
    public ChromeDriver openChromeDriver () {
        print("Opening Chrome Driver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--start-maximized"});
        options.addArguments(new String[]{"--ignore-certificate-errors"});
        options.addArguments(new String[]{"--disable-popup-blocking"});
        options.addArguments(new String[]{"--incognito"});
        // options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get ( "https://www.skintemple.rs/sr" );
        // driver.manage().window().setSize(new Dimension(600, 768));
        return driver;
    }


    /*
     * Method for printing
     */

    public static void print(String s) {System.out.println(s);}


    /*
     * Method sleep
     */

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (Exception e) {
            print(e.getMessage());

        }
    }


    //Method shows is element present

    public boolean isElementPresent(WebElement element) {
        print("isElementPresent");
        try {
            boolean isPresent=element.isDisplayed();
            return true;
        }catch (Exception e){
            print ( e.getMessage () );
            print ( "Element is NOT present on page" );
            return false;
        }
    }

}
