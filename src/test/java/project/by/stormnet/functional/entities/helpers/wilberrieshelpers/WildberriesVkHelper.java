package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesVkPage;


public class WildberriesVkHelper extends AbstractHelper {
    private WildberriesVkPage wildberriesVkPage = new WildberriesVkPage();

    public WildberriesHomeHelper goToHomePage(){
        wildberriesVkPage.clickWildberriesBackLink();
        System.out.println("User is re-directed back to Wildberries site!");
        return new WildberriesHomeHelper();
    }
}
