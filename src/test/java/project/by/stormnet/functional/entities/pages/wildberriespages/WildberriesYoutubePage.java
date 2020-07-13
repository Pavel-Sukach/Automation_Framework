package project.by.stormnet.functional.entities.pages.wildberriespages;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class WildberriesYoutubePage extends AbstractPage {
    public static String youtubeLogo = "//div[@id='logo-icon-container']";

    public static WildberriesYoutubePage getYoutubePage(){
        WildberriesYoutubePage wildberriesYoutubePage = new WildberriesYoutubePage();
        System.out.println("Youtube page is opened");
        return wildberriesYoutubePage;
    }

    public boolean isYoutubeLogoPresent(){
        changeWindow();
        return getElement(youtubeLogo).isDisplayed();
    }
}
