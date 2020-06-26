package project.by.stormnet.functional.entities.helpers.onlinerhelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.onliner.NotebookPage;

public class NotebookPageHelper extends AbstractHelper {
    private NotebookPage notebookPage = new NotebookPage();

    public void setFilter() throws InterruptedException {
        notebookPage.setMinPrice("500");
        notebookPage.setMaxPrice("1200");
        notebookPage.clickDateCheckbox();
    }

    public int getSearchResultCountPerPage(){
        return notebookPage.getResultsSizePerPage();
    }
}