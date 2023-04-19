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
        isElementPresent(nasePriceItrendovi);
        JSclkElement(driver, nasePriceItrendovi);
    }

    /*
     * Method clicks on a "O nama" field
     */
    public void clickOnama () {
        isElementPresent(oNama);
        JSclkElement(driver, oNama);
    }

    /*
     * Method clicks on a "Kontakt" field
     */
    public void clickKontakt () {
        isElementPresent(kontakt);
        JSclkElement(driver, kontakt);
    }

}


