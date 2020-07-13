package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesYoutubePage;

public class WildberriesYoutubeHelper extends AbstractHelper {
    private WildberriesYoutubePage wildberriesYoutubePage = new WildberriesYoutubePage();

    public boolean checkYoutubeLogo(){
        return wildberriesYoutubePage.isYoutubeLogoPresent();
    }
}
