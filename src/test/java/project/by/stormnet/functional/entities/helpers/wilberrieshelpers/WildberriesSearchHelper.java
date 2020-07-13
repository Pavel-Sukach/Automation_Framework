package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.wildberriespages.TheoryOfEverythingPage;
import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesSearchPage;

public class WildberriesSearchHelper extends AbstractHelper {
    private WildberriesSearchPage wildberriesSearchPage = new WildberriesSearchPage();

    public TheoryOfEverythingHelper goToTheoryOfEverythingPage(){
        System.out.println("'Theory of everything' book page is opened!");
        wildberriesSearchPage.clickTheoryOfEverything();
        return new TheoryOfEverythingHelper();
    }

    public boolean isResultFound() {
        return wildberriesSearchPage.foundResult();
    }

    public WildberriesSearchPage getPriceFilter() {
        wildberriesSearchPage.clickPriceFilter();
        return new WildberriesSearchPage();
    }

    public WildberriesSearchPage getBrandFilter(String searchBrand) {
        wildberriesSearchPage.scrollPage();
        wildberriesSearchPage.inputBrand(searchBrand);
        wildberriesSearchPage.enableDomiraCheckbox();
        return new WildberriesSearchPage();
    }

    public WildberriesSearchPage clickNextPage() {
        wildberriesSearchPage.scrollPageToFoot();
        wildberriesSearchPage.clickNextPage();
        return new WildberriesSearchPage();
    }

    /*public boolean isPriceFilterResultFound() {
        return wildberriesSearchPage.isResultFound1();
    }


    public boolean isNextPageResultFound() {
        return wildberriesSearchPage.isResultFound2();
    }

    public boolean isBrandFilterResultFound() {
        return wildberriesSearchPage.isResultFound3();
    }

    public int getSearchResultsPerPage() {
        return wildberriesSearchPage.getResultsPerPage();
    }*/

    public int getSearchResultsTotal() {
        return Integer.parseInt(wildberriesSearchPage.getResultsTotal().split(" ")[0]);
    }

    public boolean isResultsTitleExist() {
        return wildberriesSearchPage.isResultsTitleDisplayed();
    }

    public boolean isResultsReplacedExist() {
        return wildberriesSearchPage.isResultsReplacedDisplayed();
    }

    public int getSearchResultsTitleSize() {
        return wildberriesSearchPage.getResultsTitleSize();
    }

    public boolean isPriceFilterResultFound() {
        return wildberriesSearchPage.isPriseResultFound();
    }

    public boolean isNextPageResultFound() {
        return wildberriesSearchPage.isNextPageResultFound();
    }

    public boolean isBrandFilterResultFound() {
        return wildberriesSearchPage.isBrandResultFound();
    }

    public int getSearchResultsPerPage() {
        return wildberriesSearchPage.getResultsPerPage();
    }
}
