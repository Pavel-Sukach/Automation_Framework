package project.by.stormnet.functional.entities.helpers.onlinerhelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.onliner.FilterPage;
import project.by.stormnet.functional.entities.pages.onliner.NotebookPage;

public class FilterPageHelper extends AbstractHelper {
    private FilterPage filterPage = new FilterPage();

    public NotebookPage clickLaptop(){
        filterPage.clicklLaptopButton();
        return new NotebookPage();
    }
}