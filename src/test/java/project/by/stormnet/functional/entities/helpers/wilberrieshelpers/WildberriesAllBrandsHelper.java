package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesAllBrandsPage;

public class WildberriesAllBrandsHelper extends AbstractHelper {
    private WildberriesAllBrandsPage wildberriesAllBrandsPage = new WildberriesAllBrandsPage();

    public WildberriesAdidasHelper goAdidasPage(){
        wildberriesAllBrandsPage.clickAdidasLink();
        return new WildberriesAdidasHelper();
    }
}
