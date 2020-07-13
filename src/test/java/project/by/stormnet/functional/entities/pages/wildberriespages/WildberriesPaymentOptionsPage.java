package project.by.stormnet.functional.entities.pages.wildberriespages;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class WildberriesPaymentOptionsPage extends AbstractPage {
    private static String paymentOptionsTitle = "//h1[@class='title-main']";
    private static String bankCardDropdown = "//h2[(contains(text(),'Банковская карта'))]";
    private static String visaLogo = "//span[@class='block-cards-item card-visa-37']";

    public static WildberriesPaymentOptionsPage getPaymentOptionsPage(){
        WildberriesPaymentOptionsPage wildberriesPaymentOptionsPage = new WildberriesPaymentOptionsPage();
        waitForElementVisible(getElementBy(paymentOptionsTitle));
        System.out.println("Payment options page is opened");
        return wildberriesPaymentOptionsPage;
    }

    public WildberriesPaymentOptionsPage clickBankCardDropdown(){
        getElement(bankCardDropdown).click();
        return getPaymentOptionsPage();
    }

    public boolean isVisaLogoPresent(){
        wait(500);
        return getElement(visaLogo).isDisplayed();
    }
}
