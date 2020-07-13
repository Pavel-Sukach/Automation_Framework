package project.by.stormnet.functional.entities.pages.wildberriespages;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class WildberriesKidsPage extends AbstractPage {
    private static String wbKidsTitle = "//a[@href='https://kids.wildberries.ru/adventures']";

    public static WildberriesKidsPage getWildberriesKidsPage(){
        WildberriesKidsPage wildberriesKidsPage = new WildberriesKidsPage();
        System.out.println("Wildberries kids page is opened!");
        return wildberriesKidsPage;
    }
    public boolean isWbKidsTitlePresent(){
        return getElement(wbKidsTitle).isDisplayed();
    }
}
