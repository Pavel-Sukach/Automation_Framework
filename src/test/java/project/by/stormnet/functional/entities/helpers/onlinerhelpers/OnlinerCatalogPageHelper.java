package project.by.stormnet.functional.entities.helpers.onlinerhelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.onliner.FilterPage;
import project.by.stormnet.functional.entities.pages.onliner.OnlinerCatalogPage;

public class OnlinerCatalogPageHelper extends AbstractHelper {
    private OnlinerCatalogPage onlinerCatalogPage = new OnlinerCatalogPage();

    public FilterPage clickMenuButton(){
        onlinerCatalogPage.clickComputerButton();
        return new FilterPage();
    }
}