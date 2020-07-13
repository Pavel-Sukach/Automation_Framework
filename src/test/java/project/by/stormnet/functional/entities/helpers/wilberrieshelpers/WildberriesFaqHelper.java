package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesFaqPage;

public class WildberriesFaqHelper extends AbstractHelper {
    WildberriesFaqPage wildberriesFaqPage = new WildberriesFaqPage();

    public int faqSearch(String searchKey){
        return wildberriesFaqPage
                .fillInputFaqLine(searchKey)
                .getFaqResults();
    }
}
