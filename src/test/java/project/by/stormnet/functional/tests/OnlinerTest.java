package project.by.stormnet.functional.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.onlinerhelpers.FilterPageHelper;
import project.by.stormnet.functional.entities.helpers.onlinerhelpers.NotebookPageHelper;
import project.by.stormnet.functional.entities.helpers.onlinerhelpers.OnlinerCatalogPageHelper;
import project.by.stormnet.functional.entities.helpers.onlinerhelpers.OnlinerHomePageHelper;

public class OnlinerTest {
    private OnlinerHomePageHelper onlinerHomePageHelper = new OnlinerHomePageHelper();
    private OnlinerCatalogPageHelper onlinerCatalogPageHelper = new OnlinerCatalogPageHelper();
    private FilterPageHelper filterPageHelper = new FilterPageHelper();
    private NotebookPageHelper notebookPageHelper = new NotebookPageHelper();

    @Test
    public void checkAsusLaptop() throws InterruptedException {
        onlinerHomePageHelper.navigateToHomePage();
        onlinerHomePageHelper.clickButton();
        onlinerCatalogPageHelper.clickMenuButton();
        filterPageHelper.clickLaptop();
        notebookPageHelper.setFilter();
        int result = notebookPageHelper.getSearchResultCountPerPage();
        Assert.assertTrue(result > 0, "No results were found");

    }

    @AfterClass
    public void tearDown(){
        notebookPageHelper.quit();
    }
}