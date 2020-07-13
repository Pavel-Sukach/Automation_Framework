package project.by.stormnet.functional.entities.pages.wildberriespages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import project.by.stormnet.functional.entities.pages.AbstractPage;

public class WilberriesHomePage extends AbstractPage {
    private static String logo = "//img[@alt='Wildberries']";
    private static String searchField = "//input[@id='tbSrch']";
    private static String searchButton = "//span[@id='btnSrch']";
    private static String enter = "//*[@id=\"basketContent\"]/div[2]/a";
    private static String vkLink = "//a[@href='http://vk.com/club42631504']";
    private static String bottomLabel = "//span[(contains(text(),'Мы в соцсетях'))]";
    private static String faqLink = "//a[@class='faq-btn']";
    private static String cityLocation = "//li[@class='geocity item']/child::*";
    private static String cityInputField = "//input[@id='geo-city-input']";
    private static String cityLidaSearch = "//div[@title='Лида|г Лида, Беларусь, Гродненская обл|']";
    private static String cityLidaLocation = "//span[(contains(text(),'Лида'))]";
    private static String guideLogo = "//a[@aria-label='Гид по Wildberries']";
    private static String wbKidsLink = "//a[@href='https://wbkids.ru' and (contains(text(),'WB Kids'))]";
    private static String countriesLink = "//span[(contains(text(),'Сменить страну'))]";
    private static String polandLink = "//a[@href='https://pl.wildberries.eu']";
    private static String rentLink = "//a[@href='https://www.wildberries.by/promo/rent']";
    private static String popularBrandsLogo = "//h3[@class='c-h1 title']";
    private static String popularBrandsLink = "//a[@class='see-all']";
    private static String paymentOptionsLink = "//a[@href='https://www.wildberries.by/services/sposoby-oplaty']";
    private static String youTubeLink = "//a[@href='https://www.youtube.com/Wildberriesshop']";


    public static WilberriesHomePage getWildberriesHomePage(){
        WilberriesHomePage wilberriesHomePage = new WilberriesHomePage();
        waitForElementVisible(getElementBy(logo));
        System.out.println("Home page is opened");
        return wilberriesHomePage;
    }

    public WilberriesHomePage navigateToWildberriesHomePage(){
        openUrl(baseUrlWildberries);
        return getWildberriesHomePage();
    }

    public WilberriesHomePage fillSearchField(String searchKey){
        getElement(searchField).sendKeys(searchKey);
        return getWildberriesHomePage();
    }

    public WildberriesSearchPage clickSearchButton(){
        getElement(searchButton).click();
        return WildberriesSearchPage.getWildberriesSearchPage();
    }

    public WildberriesVkPage clickVkLink(){
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(bottomLabel));
        scroll.perform();
        getElement(vkLink).click();
        return WildberriesVkPage.getVkWildberriesPage();
    }

    public boolean isWildberriesLogoPresent(){
        changeWindow();
        if(getElement(logo).isDisplayed()){
            System.out.println("Home logo is present!");
            return true;
        }
        else {
            System.out.println("Logo is not displayed!");
            return false;
        }
    }
    public WildberriesFaqPage clickFaqLink(){
        getElement(faqLink).click();
        return WildberriesFaqPage.getFAQPage();
    }

    public WilberriesHomePage clickCityLink(){
        getElement(cityLocation).click();
        wait(500);
        return getWildberriesHomePage();
    }

    public WilberriesHomePage enterNewCity(String searchKey){
        getElement(cityInputField).sendKeys(searchKey);
        wait(500);
        return getWildberriesHomePage();
    }

    public WilberriesHomePage changeCityToLida(){
        getElement(cityLidaSearch).click();
        wait(500);
        return getWildberriesHomePage();
    }
    public boolean checkCity(){
        return getElement(cityLidaLocation).isDisplayed();
    }

    public WildberriesKidsPage clickKidsLink(){
        hoverOnItem(guideLogo);
        getElement(wbKidsLink).click();
        changeWindow();
        return WildberriesKidsPage.getWildberriesKidsPage();
    }

    public WildberriesPolishPage clickPolandLink(){
        hoverOnItem(countriesLink);
        getElement(polandLink).click();
        return WildberriesPolishPage.getWildberriesPolishPage();
    }

    public WildberriesRentPage clickRentPageLink(){
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(bottomLabel));
        scroll.perform();
        getElement(rentLink).click();
        changeWindow();
        return WildberriesRentPage.getWildberriesRentPage();
    }

    public WildberriesAllBrandsPage clickAllBrandsLink(){
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(popularBrandsLogo));
        scroll.perform();
        getElement(popularBrandsLink).click();
        return WildberriesAllBrandsPage.getWildberriesAllBrandsPage();
    }

    public WildberriesPaymentOptionsPage clickPaymentOptionsLink(){
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(bottomLabel));
        scroll.perform();
        getElement(paymentOptionsLink).click();
        return WildberriesPaymentOptionsPage.getPaymentOptionsPage();
    }

    public WildberriesYoutubePage clickYoutubeLink(){
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(bottomLabel));
        scroll.perform();
        getElement(youTubeLink).click();
        return WildberriesYoutubePage.getYoutubePage();
    }
    public WildberriesLoginPage clickEnter(){
        waitForElementVisible(getElementBy(enter));
        getElement(enter).click();
        return WildberriesLoginPage.getWbLoginPage();
    }

    public WildberriesSearchPage pressEnterKey() {
        getElement(searchField).sendKeys(Keys.ENTER);
        return WildberriesSearchPage.getSearchPage();
    }
}
