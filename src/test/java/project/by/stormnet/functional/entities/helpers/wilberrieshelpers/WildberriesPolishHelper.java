package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesPolishPage;

public class WildberriesPolishHelper extends AbstractHelper {
    private WildberriesPolishPage wildberriesPolishPage = new WildberriesPolishPage();

    public boolean checkPolishLogo(){
        return wildberriesPolishPage.checkPageIsPolish();
    }
}
