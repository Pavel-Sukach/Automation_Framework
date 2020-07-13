package project.by.stormnet.functional.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.wilberrieshelpers.WildberriesHomeHelper;

public class WBSearchTests {
    private WildberriesHomeHelper wildberriesHomeHelper = new WildberriesHomeHelper();
    private String searchKey = "jeans";


    //- поиск по кнопке
    @Test
    public void performSearchViaBtn() {
        int countPerPage = wildberriesHomeHelper.searchViaBtn(searchKey).getSearchResultsPerPage();
        System.out.println("Here are results for " + searchKey);
        Assert.assertTrue(countPerPage > 0, "Nothing is found:");
    }
    //- поиск клавишей энтер
    @Test
    public void performSearchViaEnter() {
        int countPerPage = wildberriesHomeHelper.searchViaEnter(searchKey).getSearchResultsPerPage();
        System.out.println("Here are results for " + searchKey);
        Assert.assertTrue(countPerPage > 0, "Nothing is found:");
    }
    //- вывод кол-ва резалтов на странице
    @Test
    public void countSearchResultsPerPage() {
        int countPerPage = wildberriesHomeHelper.searchViaBtn(searchKey).getSearchResultsPerPage();
        System.out.println("Results per page for " + searchKey + " are " + countPerPage);
        Assert.assertTrue(countPerPage > 0, "Nothing is found:");
    }
    //- вывод общего кол-ва результатов
    @Test
    public void countSearchResultsTotal() {
        int countTotal = wildberriesHomeHelper.searchViaBtn(searchKey).getSearchResultsTotal();
        System.out.println("Total Results for " + searchKey + " are " + countTotal);
        Assert.assertTrue(countTotal > 0, "Nothing is found:");
    }
    //- тест на невалидное значение + data provider
    @Test (dataProvider = "nonExistentKeys")
    public void searchNonExistent(String searchKey) {
        boolean resultsTitle = wildberriesHomeHelper.searchViaBtn(searchKey).isResultsTitleExist();
        Assert.assertTrue(resultsTitle, "Something is found, but should be:");
    }

    @DataProvider(name = "nonExistentKeys")
    public Object[] provideDate() {
        return new Object[][]{{"jeans"}, {"белиберда"}, {"tututu"}};
    }

    //- поиск киррилицей
    @Test
    public void searchCyrillic() {
        String searchKey = "привет";
        int countPerPage = wildberriesHomeHelper.searchViaEnter(searchKey).getSearchResultsPerPage();
        Assert.assertTrue(countPerPage > 0, "Nothing is found:");
    }
    //- поиск спецсимволов и цифр
    @Test
    public void searchSpecialChars() {
        String searchKey = "!@#$%^&*()_+1234567890";
        boolean resultsTitle = wildberriesHomeHelper.searchViaBtn(searchKey).isResultsTitleExist();
        Assert.assertTrue(resultsTitle, "Something is found, but shouldn't be:");
    }
    //- поиск с заменой
    @Test
    public void searchNumbers() {
        String searchKey = "k.,jdm";
        boolean resultsTitle = wildberriesHomeHelper.searchViaBtn(searchKey).isResultsReplacedExist();
        Assert.assertTrue(resultsTitle, "Key word is not replaced, but shouldn't be:");
    }
    //- поиск без ввода значения
    @Test
    public void searchEmpty() {
        String searchKey = "";
        boolean resultsTitle = wildberriesHomeHelper.searchViaEnter(searchKey).isResultsTitleExist();
        Assert.assertFalse(resultsTitle, "Something is found, but shouldn't be:");
    }
    //- поиск с максимальным значением
    @Test
    public void searchMaxAmount() {
        String searchKey = "qwertqwertqwertqwe20qwertqwertqwertqwe40qwertqwertqwertqwe60qwertqwertqwertqwe80qwertqwertqwertqw100qwertqwertqwertqw120qwertqwertqwertqw140qwertqwertqwertqw160qwertqwertqwertqw180qwertqwertqwertqw200qwertqwertqwertqw220qwertqwertqwertqw240qwertqwertqwertqw220qwertqwertqwertqw280qwertqwertqwertqw300qwertqwertqwertqw320qwertqwertqwertqw340";
        int resultsTitleSize = wildberriesHomeHelper.searchViaEnter(searchKey).getSearchResultsTitleSize();
        Assert.assertEquals(resultsTitleSize, 300, "Search result key is not cropped to 300 chars:");
    }

    @AfterTest
    public void tearDown() {
        wildberriesHomeHelper.quit();
    }
}
