package project.by.stormnet.functional.entities.pages.wildberriespages;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class WildberriesAdidasPage extends AbstractPage {
    private static String adidasLogo = "//img[@alt='adidas']";

    public static WildberriesAdidasPage getWildberriesAdidasPage(){
        WildberriesAdidasPage wildberriesAdidasPage = new WildberriesAdidasPage();
        System.out.println("Wildberries adidas page is opened");
        return wildberriesAdidasPage;
    }

    public boolean isAdidasLogoPresent(){
        return getElement(adidasLogo).isDisplayed();
    }
}
