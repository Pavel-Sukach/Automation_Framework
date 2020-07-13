package project.by.stormnet.functional.entities.pages.wildberriespages;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class WildberriesFaqPage extends AbstractPage {
    private static String logoFaq = "//div[@class='faq-result']";
    private static String inputFaqLine = "//input[@class='faq-search-input tooltipstered']";
    private static String resultsFaq = "//span[@class='faq-result-count']";

    public static WildberriesFaqPage getFAQPage(){
        WildberriesFaqPage wildberriesFaqPage = new WildberriesFaqPage();
        waitForElementVisible(getElementBy(logoFaq));
        System.out.println("FAQ page is opened!");
        return wildberriesFaqPage;
    }

    public WildberriesFaqPage fillInputFaqLine(String searchKey){
        getElement(inputFaqLine).sendKeys(searchKey);
        return getFAQPage();
    }

    public int getFaqResults(){
        wait(500);
        return Integer.parseInt(getElement(resultsFaq).getText());
    }
}
