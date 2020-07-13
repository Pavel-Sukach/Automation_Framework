package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesCartPage;

public class WildberriesCartHelper extends AbstractHelper {
    private WildberriesCartPage wildberriesCartPage = new WildberriesCartPage();

    public boolean checkTheoryOfEverythingPresentInCart(){
        return wildberriesCartPage.isTheoryOfEverythingPresent();
    }
}
