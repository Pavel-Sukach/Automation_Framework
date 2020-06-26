package project.by.stormnet.functional.entities.pages.onliner;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class OnlinerCatalogPage extends AbstractPage {

    private static String title = "//h1[@class='catalog-navigation__title']";
    private String computerButton = "//li[@data-id='2']";

    public static OnlinerCatalogPage getCatalogPage(){
        OnlinerCatalogPage onlinerCatalogPage = new OnlinerCatalogPage();
        waitForElementVisible(getElementBy(title));
        System.out.println("Catalog page is opened");
        return onlinerCatalogPage;
    }

    public FilterPage clickComputerButton(){
        getElement(computerButton).click();
        wait(3000);
        return FilterPage.getFilterPage();
    }
}