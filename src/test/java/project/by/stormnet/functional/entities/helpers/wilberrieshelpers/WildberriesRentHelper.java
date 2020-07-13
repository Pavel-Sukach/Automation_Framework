package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesRentPage;

public class WildberriesRentHelper extends AbstractHelper {
    private WildberriesRentPage wildberriesRentPage = new WildberriesRentPage();

    public boolean checkRentLogo(){
        return wildberriesRentPage.isWbRentPageLogoIsPresent();
    }
}
