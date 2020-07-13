package project.by.stormnet.functional.entities.pages.wildberriespages;

import org.openqa.selenium.WebElement;
import project.by.stormnet.functional.entities.pages.AbstractPage;

public class WildberriesLoginPage extends AbstractPage {
    private static String phoneField = "//*[@id=\"phoneMobile\"]";
    private static String getCodeButton = "//*[@id=\"body-layout\"]/div/div/div/form/div/div[3]/div[5]/div/button";
    private static String errorMessage = "//*[@id=\"body-layout\"]/div/div/div/form/div/div[3]/div[6]/span[1]/span";
    private static String value = "//*[@id=\"phoneInput_FullPhoneMobile\"]";

    public static WildberriesLoginPage getWbLoginPage(){
        WildberriesLoginPage wildberriesLoginPage = new WildberriesLoginPage();
        waitForElementVisible(getElementBy(phoneField));
        System.out.println("Login page is opened!");
        return wildberriesLoginPage;
    }

    public WildberriesLoginPage fillPhoneField(String phoneKey){
        waitForElementVisible(getElementBy(phoneField));
        getElement(phoneField).sendKeys(phoneKey);
        return getWbLoginPage();
    }

    public WildberriesLoginPage clickGetCodeButton1() {
        getElement(getCodeButton).click();
        return getWbLoginPage();
    }

    public WildberriesLoginPage getValue(){
        getElement(value);
        return getWbLoginPage();
    }

    public boolean GetCodeButtonClickable(){
        return getElement(getCodeButton).isEnabled();
    }

    public boolean displayErrorMessage(){
        System.out.println("Error message is displayed");
        WebElement message = getElement(errorMessage);
        if (message == null) {
            return false;
        } else
            return message.isDisplayed();
    }

}
