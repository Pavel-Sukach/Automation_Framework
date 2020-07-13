package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.wildberriespages.WilberriesHomePage;
import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesLoginPage;

public class WildberriesHomeHelper extends AbstractHelper {
    private WilberriesHomePage wilberriesHomePage = new WilberriesHomePage();

    public WildberriesHomeHelper navigateToHomePage(){
        wilberriesHomePage.navigateToWildberriesHomePage();
        return this;
    }
    public WildberriesSearchHelper search(String searchKey){
        navigateToHomePage();
        wilberriesHomePage
                .fillSearchField(searchKey)
                .clickSearchButton();

        return new WildberriesSearchHelper();
    }
    public WildberriesVkHelper goToVkPage(){
        wilberriesHomePage.clickVkLink();
        return new WildberriesVkHelper();
    }
    public boolean checkHomeLogo(){
        return wilberriesHomePage.isWildberriesLogoPresent();
    }

    public WildberriesFaqHelper goToFaqPage(){
        wilberriesHomePage.clickFaqLink();
        return new WildberriesFaqHelper();
    }

    public boolean checkLocationChange(String searchKey){
        return wilberriesHomePage
                .clickCityLink()
                .enterNewCity(searchKey)
                .changeCityToLida()
                .checkCity();
    }
    public WildberriesKidsHelper goToKidsPage(){
        wilberriesHomePage.clickKidsLink();
        return new WildberriesKidsHelper();
    }

    public WildberriesPolishHelper goToPolishPage(){
        wilberriesHomePage.clickPolandLink();
        return new WildberriesPolishHelper();
    }

    public WildberriesRentHelper goToRentPage(){
        wilberriesHomePage.clickRentPageLink();
        return new WildberriesRentHelper();
    }

    public WildberriesAllBrandsHelper goToAllBrandsPage(){
        wilberriesHomePage.clickAllBrandsLink();
        return new WildberriesAllBrandsHelper();
    }

    public WildberriesPaymentOptionsHelper goToPaymentOptionsPage(){
        wilberriesHomePage.clickPaymentOptionsLink();
        return new WildberriesPaymentOptionsHelper();
    }

    public WildberriesYoutubeHelper goToYoutubePage(){
        wilberriesHomePage.clickYoutubeLink();
        return new WildberriesYoutubeHelper();
    }

    public WildberriesLoginPage clickLoginButton(){
        wilberriesHomePage.clickEnter();
        return new WildberriesLoginPage();
    }

    public WildberriesSearchHelper searchViaBtn(String searchKey) {
        navigateToHomePage();
        wilberriesHomePage.fillSearchField(searchKey).clickSearchButton();
        return new WildberriesSearchHelper();
    }

    public WildberriesSearchHelper searchViaEnter (String searchKey) {
        navigateToHomePage();
        wilberriesHomePage.fillSearchField(searchKey).pressEnterKey();
        return new WildberriesSearchHelper();
    }
}
