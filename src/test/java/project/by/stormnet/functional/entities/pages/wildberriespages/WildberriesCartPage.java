package project.by.stormnet.functional.entities.pages.wildberriespages;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class WildberriesCartPage extends AbstractPage {
    private static String cartPageLogo = "//h3[@class='bold']";
    private static String theoryInCart = "//span[(contains(text(),'Теория Всего'))]";

    public static WildberriesCartPage getCartContantsPage() {
        WildberriesCartPage wildberriesCartPage = new WildberriesCartPage();
        waitForElementVisible(getElementBy(cartPageLogo));
        System.out.println("Cart page is opened");
        return wildberriesCartPage;
    }
    public boolean isTheoryOfEverythingPresent(){
        if (getElement(theoryInCart).isDisplayed()){
            return true;
        }
        else {
            return false;
        }
    }
}
