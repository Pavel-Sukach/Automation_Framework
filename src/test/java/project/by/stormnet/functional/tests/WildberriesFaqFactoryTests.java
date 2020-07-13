package project.by.stormnet.functional.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.wilberrieshelpers.WildberriesFaqHelper;
import project.by.stormnet.functional.entities.helpers.wilberrieshelpers.WildberriesHomeHelper;

public class WildberriesFaqFactoryTests {
    private WildberriesHomeHelper wildberriesHomeHelper = new WildberriesHomeHelper();
    private WildberriesFaqHelper wildberriesFaqHelper = new WildberriesFaqHelper();
    private String faqSerchKey;

    public WildberriesFaqFactoryTests(String faqSerchKey){
        this.faqSerchKey = faqSerchKey;
    }

    @Test
    public void faqSearchTest(){
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.goToFaqPage();
        int faqResults = wildberriesFaqHelper.faqSearch(faqSerchKey);
        Assert.assertTrue(faqResults > 0, "No results were found!");
    }

    @AfterSuite
    public void tearDown() {
        wildberriesHomeHelper.quit();
    }
}
