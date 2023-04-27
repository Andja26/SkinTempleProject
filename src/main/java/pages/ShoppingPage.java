package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage extends BasePage {

    //webelements

    @FindBy(xpath = "//img[@alt = 'CosRX krema sa puževom sluzi 100ml']")
    WebElement imgKremaPuzevaSluz;

    @FindBy(xpath = "//img[@alt = 'Pyunkang Yul krema za hidrataciju 100ml']")
    WebElement imgPyunkangKrema;

    @FindBy(xpath = "//div[@class = 'counter-holder']/button[@type = 'submit']")
    WebElement addToBasketButton;

    @FindBy(xpath = "//span[@class = 'items-qty']")
    WebElement shoppingCartNumber;

    @FindBy(xpath = "//a[contains(text(), 'Poručivanje')]")
    WebElement porucivanjeButton;

    @FindBy(xpath = "//button[contains (text(), 'Potvrđujem porudžbinu')]")
    WebElement potvrdjujemPorudzbinuButton;

    @FindBy(xpath = "//span[contains (text(), 'Morate prihvatiti uslove korišćenja!')]")
    WebElement usloviKoriscenjaMsg;


    //constructor

    public ShoppingPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //methods

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
     * Method clicks on a image Puzeva sluz krema
     */

    public void clickImgPuzevaSluz() {
        JSclkElement(driver, imgKremaPuzevaSluz);
    }

    /*
     * Method clicks on a image Pyunkang Yul Krema
     */

    public void clickImgPyunkangYulKrema () {
        JSclkElement(driver, imgPyunkangKrema);
    }

    /*
     * Method clicks on add to basket button
     */

    public void clickAddToBasketButton() {
        JSclkElement(driver, addToBasketButton);

    }

    /*
     * Method gets number from shopping cart icon
     */
    public String getNumberFromShoppingCartIcon() {
        sleep(10);
        //   wait(10);
        // waitForElement(shoppingCartNumber);
        print("getNumberFromShoppingCartIcon");
        return shoppingCartNumber.getText();

    }

    /*
     * Method clicks on a "porucivanje" button
     */

    public void clickPorucivanjeButton() {
        JSclkElement(driver, porucivanjeButton);

    }


    /*
     * Method clicks on a "potvrdjujem porudzbinu" button
     */

    public void clickPotvrdjujemPorudzbinu() {
        JSclkElement(driver, potvrdjujemPorudzbinuButton);

    }

    /*
     * Method asserts if msg: "Morate prihvatiti uslove korišćenja!" is present
     * without credentials
     */

    public String getMsgUsloviKoriscenja() {
        //  sleep(10);
        print("getMsgUsloviKorsicenja");
        return usloviKoriscenjaMsg.getText();
    }


}


