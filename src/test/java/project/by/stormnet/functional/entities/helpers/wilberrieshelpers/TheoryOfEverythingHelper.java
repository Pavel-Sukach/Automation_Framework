package project.by.stormnet.functional.entities.helpers.wilberrieshelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.wildberriespages.TheoryOfEverythingPage;

public class TheoryOfEverythingHelper extends AbstractHelper {
    private TheoryOfEverythingPage theoryOfEverythingPage = new TheoryOfEverythingPage();

    public WildberriesCartHelper addBook(){
        theoryOfEverythingPage
                .clickAddToCartButton()
                .clickCartIcon();
        System.out.println("Add book to a cart and go to cart page!");
        return new WildberriesCartHelper();
    }
}
