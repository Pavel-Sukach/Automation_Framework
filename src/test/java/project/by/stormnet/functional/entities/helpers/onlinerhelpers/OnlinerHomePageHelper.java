package project.by.stormnet.functional.entities.helpers.onlinerhelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.onliner.OnlinerCatalogPage;
import project.by.stormnet.functional.entities.pages.onliner.OnlinerHomePage;

public class OnlinerHomePageHelper extends AbstractHelper {
    private OnlinerHomePage onlinerHomePage = new OnlinerHomePage();

    public OnlinerHomePageHelper navigateToHomePage(){
        System.out.println("Navigate to 'Home' page");
        onlinerHomePage.navigateToOnlinerHomePage();
        return this;
    }

    public OnlinerCatalogPage clickButton(){
        onlinerHomePage.clickCatalogButton();
        return new OnlinerCatalogPage();
    }
}