package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HamburgerMenuPage extends BasePage {


    //webelements


    @FindBy(xpath = "//a[@href = 'https://www.skintemple.rs/sr/blog']")
    WebElement nasePriceItrendovi;

    @FindBy(xpath = "//a[@href = 'https://www.skintemple.rs/sr/o-nama']")
    WebElement oNama;

    @FindBy(xpath = "//a[@href = 'https://www.skintemple.rs/sr/kontakt']")
    WebElement kontakt;

    @FindBy(xpath = "//h1[contains(text(), 'Naše priče i trendovi')]")
    WebElement NaslovNasePriceItrendovi;

    @FindBy(xpath = "//h1[contains(text(), 'O nama')]")
    WebElement NaslovOnama;

    @FindBy(xpath = "//h1[contains(text(), 'Kontakt')]")
    WebElement NaslovKontakt;




    //constructor

    public HamburgerMenuPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver, this);
    }


    //methods

    /*
     * Method clicks on a "Nase price i trendovi" field
     */
    public void clickNasePriceItrendovi () {
        waitForElement(nasePriceItrendovi);
      assert isElementPresent(nasePriceItrendovi) : "Web element nasePriceItrendovi is NOT present";
        JSclkElement(driver, nasePriceItrendovi);
    }

    /*
     * Method clicks on a "O nama" field
     */
    public void clickOnama () {
        waitForElement(oNama);
        assert isElementPresent(oNama) : "Web element oNama is NOT present";
        JSclkElement(driver, oNama);
    }

    /*
     * Method clicks on a "Kontakt" field
     */
    public void clickKontakt () {
        waitForElement(kontakt);
        assert  isElementPresent(kontakt) : "Web element Kontakt is NOT present";
        JSclkElement(driver, kontakt);
    }

}


