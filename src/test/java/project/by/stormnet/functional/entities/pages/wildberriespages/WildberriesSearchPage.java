package project.by.stormnet.functional.entities.pages.wildberriespages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import project.by.stormnet.functional.entities.pages.AbstractPage;

public class WildberriesSearchPage extends AbstractPage {
    private static String bookResults = "//h1[@class='c-h1 searching-results-title']";
    private static String theory = "//img[@alt='Теория Всего Издательство АСТ']";
    private static String logo = "//a[@class=\"header-logo\"]";
    private static String results = "//div[@class=\"l_class\"]";
    private static String searchResult = "//span[@class=\"goods-count j-goods-count\"]";
    private static String priceFilter = "//*[@id=\"price\"]";
    private static String brand = "//input[@id=\"tBrandSearch\"]";
    private static String DomiraCheckbox = "//*[@id=\"brand_list_left\"]/label";
    private static String pagination = "//a[@class=\"pagination-next\"]";
    private static String result1 = "//div[@id=\"c11847653\"]";
    private static String result2 = "//div[@id=\"c13015586\"]";
    private static String result3 = "//div[@id=\"c11396172\"]";
    private static String resultsCounter = "//span[@class = 'goods-count j-goods-count']";
    private static String resultsTitle = "//h1[@class = 'searching-results-title']";
    private static String resultsReplaced = "//span[@class = 'searching-results-text searching-results-text-replaced']";
    private static String resultPrice = "//div[@id=\"c8808990\"]";
    private static String resultNextPage = "//div[@id=\"c8319559\"]";
    private static String resultBrand = "//div[@id=\"c12101596\"]";

    public static WildberriesSearchPage getWildberriesSearchPage(){
        WildberriesSearchPage wildberriesSearchPage = new WildberriesSearchPage();
        waitForElementVisible(getElementBy(bookResults));
        System.out.println("Wildberries search page is opened");
        return wildberriesSearchPage;
    }

    public TheoryOfEverythingPage clickTheoryOfEverything(){
        getElement(theory).click();
        return TheoryOfEverythingPage.getTheoryOfEverythingPage();
    }

    public boolean foundResult(){
        WebElement res = getElement(results);
        if (res == null) {
            return false;
        } else
            return res.isDisplayed();
    }

    public WildberriesSearchPage clickPriceFilter(){
        waitForElementVisible(getElementBy(priceFilter));
        getElement(priceFilter).click();
        return getWildberriesSearchPage();
    }

    public void scrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,900)");
    }

    public void scrollPageToFoot() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,100000)");
    }

    public WildberriesSearchPage clickNextPage(){
        waitForElementVisible(getElementBy(pagination));
        getElement(pagination).click();
        return getWildberriesSearchPage();
    }

    public boolean isResultFound1(){
        WebElement res = getElement(result1);
        if (res == null) {
            return false;
        } else
            return res.isDisplayed();
    }

    public boolean isResultFound2(){
        wait(500);
        WebElement res = getElement(result2);
        if (res == null) {
            return false;
        } else
            return res.isDisplayed();
    }

    public WildberriesSearchPage inputBrand(String searchKey){
        waitForElementVisible(getElementBy(brand));
        getElement(brand).sendKeys(searchKey);
        return getWildberriesSearchPage();
    }

    public WildberriesSearchPage enableDomiraCheckbox(){
        waitForElementVisible(getElementBy(DomiraCheckbox));
        getElement(DomiraCheckbox).click();
        return getWildberriesSearchPage();
    }

    public boolean isResultFound3(){
        wait(500);
        WebElement res = getElement(result3);
        if (res == null) {
            return false;
        } else
            return res.isDisplayed();
    }

    public static WildberriesSearchPage getSearchPage() {
        WildberriesSearchPage wildberriesSearchPage = new WildberriesSearchPage();
        System.out.println("Search page is opened");
        return wildberriesSearchPage;
    }

    public int getResultsPerPage() {
        return getElements(results).size();
    }

    public String getResultsTotal() {
        return getElement(resultsCounter).getText();
    }

    public boolean isResultsTitleDisplayed() {
        try {
            WebElement element = getElement(resultsTitle);
            return element.isDisplayed();
        }
        catch (Exception e) {
            return false;
        }
    }


    public int getResultsTitleSize() {
        wait(500);
        return getElement(resultsTitle).getText().length();
    }

    public boolean isResultsReplacedDisplayed() {
        return getElement(resultsReplaced).isDisplayed();
    }

    public boolean isPriseResultFound(){
        try {
            WebElement res = getElement(resultPrice);
            return res.isDisplayed();
        }
        catch (Exception e){
            return false;
        }
    }

    public boolean isNextPageResultFound(){
        try {
            WebElement res = getElement(resultNextPage);
            return res.isDisplayed();
        }
        catch (Exception e) {
            return false;
        }
    }

    public boolean isBrandResultFound(){
        try {
            WebElement res = getElement(resultBrand);
            return res.isDisplayed();
        }
        catch (Exception e){
            return false;
        }
    }
}
