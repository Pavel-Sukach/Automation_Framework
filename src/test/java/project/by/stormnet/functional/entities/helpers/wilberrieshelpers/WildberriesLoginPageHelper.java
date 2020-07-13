package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesConfirmPage;
import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesLoginPage;

public class WildberriesLoginPageHelper extends AbstractHelper {
    WildberriesLoginPage wildberriesLoginPage = new WildberriesLoginPage();

    public WildberriesConfirmPage inputInPhoneField(String phoneKey) {
        wildberriesLoginPage
                .fillPhoneField(phoneKey)
                .clickGetCodeButton1();
        return new WildberriesConfirmPage();
    }

    public WildberriesLoginPage getValue(){
        wildberriesLoginPage.getValue();
        return WildberriesLoginPage.getWbLoginPage();
    }

    public boolean isErrorMessageDisplayed(){
        return wildberriesLoginPage.displayErrorMessage();
    }
}