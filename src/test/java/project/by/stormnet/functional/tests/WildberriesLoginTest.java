package project.by.stormnet.functional.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.wilberrieshelpers.WildberriesConfirmPageHelper;
import project.by.stormnet.functional.entities.helpers.wilberrieshelpers.WildberriesHomeHelper;
import project.by.stormnet.functional.entities.helpers.wilberrieshelpers.WildberriesLoginPageHelper;
import project.by.stormnet.functional.entities.helpers.wilberrieshelpers.WildberriesSearchHelper;

public class WildberriesLoginTest {
    private WildberriesHomeHelper wildberriesHomeHelper = new WildberriesHomeHelper();
    private WildberriesSearchHelper wildberriesSearchHelper = new WildberriesSearchHelper();
    private WildberriesLoginPageHelper wildberriesLoginPageHelper = new WildberriesLoginPageHelper();
    private WildberriesConfirmPageHelper wildberriesConfirmPageHelper = new WildberriesConfirmPageHelper();

    @Test
    public void negativeSearch() {
        String searchKey = "qqqqqqqqqqqqqq";
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.search(searchKey);
        System.out.println("Negative search test passed");
        Assert.assertTrue(wildberriesSearchHelper.isResultFound(), "No results were found!");
    }

    @Test
    public void foundResultWithUsePriseFilter(){
        String searchKey = "босоножки";
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.search(searchKey);
        wildberriesSearchHelper.getPriceFilter();
        System.out.println("Test with price filter using is passed");
        Assert.assertFalse(wildberriesSearchHelper.isPriceFilterResultFound(), "Test with filter using is failed");
    }

    @Test
    public void foundResultWithUseBrandFilter(){
        String searchKey = "платье";
        String searchBrand = "Domira";
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.search(searchKey);
        wildberriesSearchHelper.getBrandFilter(searchBrand);
        System.out.println("Test with brand filter using is passed");
        Assert.assertFalse(wildberriesSearchHelper.isBrandFilterResultFound(), "Test with filter using is failed");
    }

    @Test
    public void foundResultAtNewPage() {
        String searchKey = "пляжное полотенце";
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.search(searchKey);
        wildberriesSearchHelper.clickNextPage();
        System.out.println("Test switch to next page is passed");
        Assert.assertFalse(wildberriesSearchHelper.isNextPageResultFound(), "Test switch to next page is failed");
    }


    @Test
    public void validInputInPhoneField() {
        int phoneKey = ((int) (Math.random() * 999_999_999) +100_000_000);
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.clickLoginButton();
        wildberriesLoginPageHelper.inputInPhoneField(String.valueOf(phoneKey));
        System.out.println("Valid input in phone field test passed");
        Assert.assertTrue(wildberriesConfirmPageHelper.displayConfirmPage(), "Valid input in phone field test is failed");

    }

    @Test
    public void invalidLetterInputInPhoneField() {
        String phoneKey = "qwertyu";
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.clickLoginButton();
        wildberriesLoginPageHelper.inputInPhoneField(phoneKey);
        System.out.println("Invalid letter in phone field test passed");
        Assert.assertTrue(wildberriesLoginPageHelper.isErrorMessageDisplayed(), "Invalid input in phone field test is failed");
    }

    @Test
    public void invalidShortInputInPhoneField() {
        String phoneKey = "12";
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.clickLoginButton();
        wildberriesLoginPageHelper.inputInPhoneField(phoneKey);
        System.out.println("Invalid input in phone field test passed");
        Assert.assertTrue(wildberriesLoginPageHelper.isErrorMessageDisplayed(), "Invalid input in phone field test failed");
    }

    @Test
    public void invalidLongInPhoneField() {
        String phoneKey = "301941595156548951568515655065140";
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.clickLoginButton();
        wildberriesLoginPageHelper.inputInPhoneField(phoneKey);
        wildberriesLoginPageHelper.getValue().equals("301941595");
        System.out.println("Invalid long input in phone field test passed");
        Assert.assertTrue(wildberriesConfirmPageHelper.displayConfirmPage(), "Invalid long input in phone field test failed");
    }

    @Test
    public void invalidSymbolsInputInPhoneField() {
        String phoneKey = "!@#$%^&";
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.clickLoginButton();
        wildberriesLoginPageHelper.inputInPhoneField(phoneKey);
        System.out.println("Invalid symbols in phone field test passed");
        Assert.assertTrue(wildberriesLoginPageHelper.isErrorMessageDisplayed(), "Invalid symbols in phone field test failed");
    }

    @Test
    public void invalidNoInputInPhoneField() {
        String phoneKey = "";
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.clickLoginButton();
        wildberriesLoginPageHelper.inputInPhoneField(phoneKey);
        System.out.println("Invalid no input in phone field test passed");
        Assert.assertTrue(wildberriesLoginPageHelper.isErrorMessageDisplayed(), "No input in phone field test failed");
    }

    @Test
    public void invalidSpaceInputInPhoneField() {
        String phoneKey = "       ";
        wildberriesHomeHelper.navigateToHomePage();
        wildberriesHomeHelper.clickLoginButton();
        wildberriesLoginPageHelper.inputInPhoneField(phoneKey);
        System.out.println("Invalid spaces input in phone field test passed");
        Assert.assertTrue(wildberriesLoginPageHelper.isErrorMessageDisplayed(), "Space spaces input in phone field test failed");
    }

    @AfterClass
    public void tearDown() {
        wildberriesHomeHelper.quit();
    }
}
