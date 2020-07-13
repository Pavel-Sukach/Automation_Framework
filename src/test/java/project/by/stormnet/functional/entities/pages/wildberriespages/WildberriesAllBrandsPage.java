package project.by.stormnet.functional.entities.pages.wildberriespages;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class WildberriesAllBrandsPage extends AbstractPage {
    private static String allBrandsLogo = "//h2[@class='our-brands-title']";
    private static String adidasLink = "//img[@title='Страница adidas']";

    public static WildberriesAllBrandsPage getWildberriesAllBrandsPage(){
        WildberriesAllBrandsPage wildberriesAllBrandsPage = new WildberriesAllBrandsPage();
        waitForElementVisible(getElementBy(allBrandsLogo));
        System.out.println("Wildberries all brands page is opened");
        return wildberriesAllBrandsPage;
    }

    public WildberriesAdidasPage clickAdidasLink(){
        getElement(adidasLink).click();
        return WildberriesAdidasPage.getWildberriesAdidasPage();
    }
}
