package project.by.stormnet.functional.tests;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.wilberrieshelpers.*;

public class WildberriesNavigationTests {
    private WildberriesHomeHelper wildberriesHomeHelper = new WildberriesHomeHelper();
    private WildberriesSearchHelper wildberriesSearchHelper = new WildberriesSearchHelper();
    private TheoryOfEverythingHelper theoryOfEverythingHelper = new TheoryOfEverythingHelper();
    private WildberriesCartHelper wildberriesCartHelper = new WildberriesCartHelper();
    private WildberriesVkHelper wildberriesVkHelper = new WildberriesVkHelper();
    private WildberriesKidsHelper wildberriesKidsHelper = new WildberriesKidsHelper();
    private WildberriesPolishHelper wildberriesPolishHelper = new WildberriesPolishHelper();
    private WildberriesRentHelper wildberriesRentHelper = new WildberriesRentHelper();
    private WildberriesAllBrandsHelper wildberriesAllBrandsHelper = new WildberriesAllBrandsHelper();
    private WildberriesAdidasHelper wildberriesAdidasHelper = new WildberriesAdidasHelper();
    private WildberriesPaymentOptionsHelper wildberriesPaymentOptionsHelper = new WildberriesPaymentOptionsHelper();
    private WildberriesYoutubeHelper wildberriesYoutubeHelper = new WildberriesYoutubeHelper();


    @Test
    public void buyTheBookTest(){
        String bookSearchKey = "Теория всего";
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.search(bookSearchKey);
        wildberriesSearchHelper.goToTheoryOfEverythingPage();
        theoryOfEverythingHelper.addBook();
        Assert.assertTrue(wildberriesCartHelper.checkTheoryOfEverythingPresentInCart(),"Book is not found in the cart!");
    }
    @Test
    public void vkLinkTest(){
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.goToVkPage();
        wildberriesVkHelper.goToHomePage();
        boolean logoPresent = wildberriesHomeHelper.checkHomeLogo();
        Assert.assertTrue(logoPresent,"Home page is not opened!");
    }

    @Test
    public void locationChangeTest(){
        String citySearchKey = "Лида";
        wildberriesHomeHelper.navigateToHomePage();
        Assert.assertTrue(wildberriesHomeHelper.checkLocationChange(citySearchKey),"New location is not set!");
    }

    @Test
    public void kidsPageTest(){
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.goToKidsPage();
        Assert.assertTrue(wildberriesKidsHelper.checkKidsLogo(),"Kids page is not opened!");
    }

    @Test
    public void countryChangeTest(){
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.goToPolishPage();
        Assert.assertTrue(wildberriesPolishHelper.checkPolishLogo(), "Polish page is not opened!");
    }

    @Test
    public void rentPageTest(){
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.goToRentPage();
        Assert.assertTrue(wildberriesRentHelper.checkRentLogo(), "Rest page is not opened!");
    }

    @Test
    public void adidasBrandTest(){
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.goToAllBrandsPage();
        wildberriesAllBrandsHelper.goAdidasPage();
        Assert.assertTrue(wildberriesAdidasHelper.checkAdidasLogo(), "Adidas page is not opened!");
    }

    @Test
    public void visaPaymentOptionTest(){
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.goToPaymentOptionsPage();
        Assert.assertTrue(wildberriesPaymentOptionsHelper.checkVisaPaymentOptionPresent(), "Visa payment option is not present!");
    }

    @Test
    public void youtubeLinkTest(){
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.goToYoutubePage();
        Assert.assertTrue(wildberriesYoutubeHelper.checkYoutubeLogo(),"Youtube page is not present!");
    }



    @AfterSuite
    public void tearDown(){
        wildberriesCartHelper.quit();
    }
}
