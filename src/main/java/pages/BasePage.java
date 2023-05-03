package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {


    ChromeDriver driver;

    //webelements

    @FindBy(xpath = "//div[@class = 'hamburger']")
    WebElement hamburgerMenu;

    @FindBy (xpath = "//div[@class = 'icon btn-t2 pink']")
    WebElement loginIcon;

    @FindBy (xpath = "//div[@id = 'shop-cart']")
    WebElement shoppingCartIcon;

    @FindBy (xpath = "//a[@href = 'https://www.instagram.com/skintemple.rs/']")
    WebElement instagramIcon;

    @FindBy (xpath = "//span[@class = 'icon-bootom']/i[@class = 'fa fa-facebook-square']")
    WebElement facebookIcon;

    @FindBy (xpath = "//div[@class = 'search-trigger']/span[@class = 'fa fa-search btn-t2 icon']")
    WebElement searchIcon;


    @FindBy (xpath = "//input[@placeholder = 'Naziv proizvoda...']")
    WebElement searchField;

    @FindBy (xpath = "//span[@class = 'fa fa-search']")
    WebElement searchButton;

    //constructor

    public BasePage () {}

    public BasePage (ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Methods

    /**
     * Method Login with valid credentials
     */

    public void loginToSkintemple(ChromeDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnLoginIcon();
        loginPage.enterTextInEmailField(Strings.VALID_USERNAME);
        loginPage.enterTextInPasswordField(Strings.VALID_PASSWORD);
        loginPage.clickLoginButtonLoginField();
    }

    /*
     * Method clicks on a login icon
     */
    public void clickOnLoginIcon () {
        print("clickOnLoginIcon");
        assert isElementPresent(loginIcon) : "Log in icon is NOT present";
        loginIcon.click();
    }

    /*
     * Method clicks on a shopping cart icon
     */
    public void clickOnShoppingCartIcon () {
        print("clickOnShoppingCartIcon");
        assert isElementPresent(shoppingCartIcon) : "Shopping cart icon is NOT present";
        shoppingCartIcon.click();
    }

    /*
     * Method clicks on a hamburger menu
     */
    public void clickOnHamburgerMenu () {
        print("clickOnHamburgerMenu");
        assert isElementPresent (hamburgerMenu) : "Hamburger menu is NOT present";
        hamburgerMenu.click();
    }

    /*
     * Method clicks on a search icon
     */
    public void clickOnSearchIcon () {
        print("clickOnSearchIcon");
        assert isElementPresent(searchIcon) : "Search icon is NOT present";
        searchIcon.click();
    }

    /*
     * Method enters text in search field
     */
    public void enterTextInSearchField (String text) {
        print("enterTextInSearchField");
        searchField.sendKeys(text);
    }

    /*
     * Method clicks on Search button
     */
    public void clickSearchButton () {
        searchButton.click();
    }

    /*
     * Method enters text and search
     */
    public void enterTextAndSearch (String  text) {
        enterTextInSearchField(text);
        clickSearchButton();
    }

    /*
     * Method assert if user is redirected to Instagram
     */
        public String clickOnInstagramIcon(){
        instagramIcon.click ();
        List<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String actualUrl = driver.getCurrentUrl();
        driver.close();
        driver.switchTo().window(tabs.get(0));
        return actualUrl;
    }

    /*
     * Method assert if user is redirected to Facebook
     */
    public String clickOnFacebookIcon(){
        facebookIcon.click ();
        List<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String actualUrl = driver.getCurrentUrl();
        driver.close();
        driver.switchTo().window(tabs.get(0));
        return actualUrl;
    }

    /**
     * Method verify URL
     * @return
     */

    public boolean verifyURL (String expectedUrl) {
        print("verifyURL ( " + expectedUrl + ")");
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.equals(expectedUrl); }



    /*
     * Method shows is element present
     */
    public boolean isElementPresent(WebElement element) {
        print("isElementPresent");
        try {
            boolean isPresent=element.isDisplayed();
          //  return true;
            return isPresent;
        }catch (Exception e){
            print ( e.getMessage () );
            print ( "Element is NOT present on page" );
            return false;
        }
    }


    /*
     * Method for printing
     */

    public static void print(String s) {System.out.println(s);}



    /*
     * Method JSclkElement
     */
    public static void JSclkElement(ChromeDriver driver, WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click(true);", element);
    }



    /*
     * Method Wait for element
     */
    public void waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait ( driver, 15 );
        wait.until( ExpectedConditions.visibilityOf (element) );
    }

    /*
     * Method implicity wait
     */
    public void wait(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

    }

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

    /*
     * Method scroll
     */

    public void scrollIntoView (WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);" , element);
    }


}
