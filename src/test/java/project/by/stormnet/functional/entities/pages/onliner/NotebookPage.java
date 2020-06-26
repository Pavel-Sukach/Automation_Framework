package project.by.stormnet.functional.entities.pages.onliner;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class NotebookPage extends AbstractPage {

    private static String laptopTitle = "//h1[@class='schema-header__title']";
    private  String asusCheckbox = "//label[@class='schema-filter__checkbox-item']/span[text()='ASUS'][1]";
    private  String minPrice = "//input[@placeholder='от']";
    private  String maxPrice = "//input[contains(@class,'schema-filter__number-input_price') and contains(@data-bind,'до')]";
    private  String date = "//label[@class='schema-filter__checkbox-item']/span[text()='2019']";
    private  String result = "//div[@class='schema-product__title']";



    public static NotebookPage getNotebookPage(){
        NotebookPage notebookPage = new NotebookPage();
        waitForElementVisible(getElementBy(laptopTitle));
        return notebookPage;

    }

    public NotebookPage clickAsusCheckbox(){
        getElement(asusCheckbox).click();
            wait(3000);
        return getNotebookPage();
    }

    public NotebookPage setMinPrice(String min){
        getElement(minPrice).sendKeys(min);
            wait(3000);
        return getNotebookPage();
    }
    public NotebookPage setMaxPrice(String max){
        getElement(maxPrice).sendKeys(max);
            wait(3000);
        return getNotebookPage();
    }

    public NotebookPage clickDateCheckbox() throws InterruptedException {
        getElement(date).click();
        wait(300
        );
        return getNotebookPage();
    }

    public int getResultsSizePerPage(){
        return getElements(result).size();
    }

}