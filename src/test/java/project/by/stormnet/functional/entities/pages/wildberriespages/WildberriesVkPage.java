package project.by.stormnet.functional.entities.pages.wildberriespages;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class WildberriesVkPage extends AbstractPage {
    private static String vkWildberriesBackLink = "//a[@href='/away.php?to=http%3A%2F%2Fwww.wildberries.by&cc_key=']";

    public static WildberriesVkPage getVkWildberriesPage(){
        WildberriesVkPage wildberriesVkPage = new WildberriesVkPage();
        System.out.println("Vk wildberries page is opened");
        return wildberriesVkPage;
    }
    public WilberriesHomePage clickWildberriesBackLink(){
        changeWindow();
        getElement(vkWildberriesBackLink).click();
        return WilberriesHomePage.getWildberriesHomePage();
    }
}
