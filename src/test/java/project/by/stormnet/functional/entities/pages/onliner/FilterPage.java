package project.by.stormnet.functional.entities.pages.onliner;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class FilterPage extends AbstractPage {

    private static String menu = "//div[(@class='catalog-navigation-list__aside-title') and contains(text(),'компьютеры')]";
    private String laptop = "//a[@href='https://catalog.onliner.by/notebook']";

    public static FilterPage getFilterPage(){
        FilterPage filterPage = new FilterPage();
        waitForElementVisible(getElementBy(menu));
        System.out.println("Filter page is opened");
        return filterPage;
    }

    public NotebookPage clicklLaptopButton(){
        getElement(menu).click();
        wait(3000);
        getElement(laptop).click();
        return NotebookPage.getNotebookPage();
    }

}