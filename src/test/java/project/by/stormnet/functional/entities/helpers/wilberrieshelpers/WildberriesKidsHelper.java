package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesKidsPage;

public class WildberriesKidsHelper extends AbstractHelper {
    private WildberriesKidsPage wildberriesKidsPage = new WildberriesKidsPage();

    public boolean checkKidsLogo(){
        return wildberriesKidsPage.isWbKidsTitlePresent();
    }
}
