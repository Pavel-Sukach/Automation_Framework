package project.by.stormnet.functional.entities.pages.onliner;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class OnlinerHomePage extends AbstractPage {

    private static String logo = "//a[@href='https://www.onliner.by/']";
    private static String catalog = "//a[@href='https://catalog.onliner.by/']";

    public static OnlinerHomePage getOnlinerHomePage(){
        OnlinerHomePage onlinerHomePage = new OnlinerHomePage();
        waitForElementVisible(getElementBy(logo));
        System.out.println("Home page is opened");
        return onlinerHomePage;
    }

    public OnlinerHomePage navigateToOnlinerHomePage(){
        openUrl(baseUrlOnliner);
        return getOnlinerHomePage();
    }

    public OnlinerCatalogPage clickCatalogButton(){
        getElement(catalog).click();
        wait(3000);
        return OnlinerCatalogPage.getCatalogPage();
    }


}