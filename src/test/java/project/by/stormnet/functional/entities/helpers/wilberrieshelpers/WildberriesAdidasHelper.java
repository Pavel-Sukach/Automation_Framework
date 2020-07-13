package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesAdidasPage;

public class WildberriesAdidasHelper extends AbstractHelper {
    private WildberriesAdidasPage wildberriesAdidasPage = new WildberriesAdidasPage();

    public boolean checkAdidasLogo(){
        return wildberriesAdidasPage.isAdidasLogoPresent();
    }
}
