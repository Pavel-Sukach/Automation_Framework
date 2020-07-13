package project.by.stormnet.functional.entities.pages.wildberriespages;
import org.openqa.selenium.WebElement;
import project.by.stormnet.functional.entities.pages.AbstractPage;

public class WildberriesConfirmPage extends AbstractPage {
    private static String title = "//*[@id=\"body-layout\"]/div/div/div/form/div/div[2]/h2";

    public boolean getWbConfirmPage(){
        WildberriesConfirmPage wildberriesConfirmPage = new WildberriesConfirmPage();
        waitForElementVisible(getElementBy(title));
        WebElement titl = getElement(title);
        if (titl == null) {
            return false;
        } else
            return titl.isDisplayed();
    }
}
