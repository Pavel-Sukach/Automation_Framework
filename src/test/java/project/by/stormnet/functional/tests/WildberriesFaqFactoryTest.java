package project.by.stormnet.functional.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.wilberrieshelpers.WildberriesFaqHelper;
import project.by.stormnet.functional.entities.helpers.wilberrieshelpers.WildberriesHomeHelper;

public class WildberriesFaqFactoryTest {
    private WildberriesHomeHelper wildberriesHomeHelper = new WildberriesHomeHelper();
    private WildberriesFaqHelper wildberriesFaqHelper = new WildberriesFaqHelper();
    private String faqSerchKey;

    public WildberriesFaqFactoryTest(String faqSerchKey){
        this.faqSerchKey = faqSerchKey;
    }

    @Test
    public void faqSearchTest(){
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.goToFaqPage();
        int faqResults = wildberriesFaqHelper.faqSearch(faqSerchKey);
        Assert.assertTrue(faqResults > 0, "No results were found!");
    }
}
