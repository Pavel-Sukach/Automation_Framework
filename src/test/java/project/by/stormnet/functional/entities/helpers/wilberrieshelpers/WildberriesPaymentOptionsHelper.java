package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.wildberriespages.WildberriesPaymentOptionsPage;

public class WildberriesPaymentOptionsHelper extends AbstractHelper {
    private WildberriesPaymentOptionsPage wildberriesPaymentOptionsPage = new WildberriesPaymentOptionsPage();

    public boolean checkVisaPaymentOptionPresent(){
        return wildberriesPaymentOptionsPage
                .clickBankCardDropdown()
                .isVisaLogoPresent();
    }
}
