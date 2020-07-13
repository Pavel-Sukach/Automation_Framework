package project.by.stormnet.functional.entities.pages.wildberriespages;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class WildberriesRentPage extends AbstractPage {
    private static String rentLogo = "//h2[(contains(text(),'Аренда нежилых помещений'))]";

    public static WildberriesRentPage getWildberriesRentPage(){
        WildberriesRentPage wildberriesRentPage = new WildberriesRentPage();
        System.out.println("Wildberries rent page is opened");
        return wildberriesRentPage;
    }

    public boolean isWbRentPageLogoIsPresent(){
        return getElement(rentLogo).isDisplayed();
    }
}
