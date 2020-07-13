package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesConfirmPage;

public class WildberriesConfirmPageHelper {
    WildberriesConfirmPage wildberriesConfirmPage = new WildberriesConfirmPage();

    public boolean displayConfirmPage(){
        System.out.println("Confirm page is opened!");
        return wildberriesConfirmPage.getWbConfirmPage();
    }
}
