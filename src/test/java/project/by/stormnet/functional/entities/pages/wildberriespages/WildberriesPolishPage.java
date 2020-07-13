package project.by.stormnet.functional.entities.pages.wildberriespages;

import org.openqa.selenium.interactions.Actions;
import project.by.stormnet.functional.entities.pages.AbstractPage;

public class WildberriesPolishPage extends AbstractPage {
    public static String polishPageSign = "//div[(contains(text(),'2020 © pl.wildberries.eu'))]";

    public static WildberriesPolishPage getWildberriesPolishPage(){
        WildberriesPolishPage wildberriesPolishPage = new WildberriesPolishPage();
        System.out.println("Wildberries Polish page is opened");
        return wildberriesPolishPage;
    }

    public boolean checkPageIsPolish(){
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(polishPageSign));
        scroll.perform();
        return getElement(polishPageSign).isDisplayed();
    }
}
