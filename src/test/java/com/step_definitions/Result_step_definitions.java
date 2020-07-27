package com.step_definitions;

import com.pages.ResultPage;
import com.pages.ShoppingCartPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class Result_step_definitions {

    ResultPage resultPage;
    ShoppingCartPage shoppingCartPage;

    @Then("The user select the first option")
    public void the_user_select_the_first_option() throws InterruptedException {

        resultPage = new ResultPage();
        resultPage.firstHatForMen.click();
    }

    @Then("The user select quantity as {string} and add item to Cart")
    public void the_user_select_quantity_as(String quantity) throws InterruptedException {

        try {
            Select optionsSize = new Select(resultPage.selectSize);
            optionsSize.selectByIndex(2);
        } catch (NoSuchElementException e) {
        }

        try {
            Select options = new Select(resultPage.select);
            options.selectByValue(quantity);
        } catch (NoSuchElementException e) {
        }

        Thread.sleep(2000);
        resultPage.addToCart.click();
    }

    @Then("The user should see total price and quantity on Cart pages")
    public void the_user_should_see_total_price_and_quantity_on_Cart_pages() throws InterruptedException {

        String expectedPrice  = resultPage.lastPriceOnResult.getText();
        String text =  resultPage.lastQuantityOnResult.getText();
        String [] strtext1 =text.split("l ");
        String expectedQuantity =  strtext1[1];

        resultPage.Cart.click();

        shoppingCartPage = new ShoppingCartPage();
        String actualItemQuantity = shoppingCartPage.quantityOnCart.getText();
        String [] strtext2 = actualItemQuantity.split("l ");
        String actualQuantity = strtext2[1];

        assertEquals(expectedQuantity,actualQuantity);

        String actualPrice = shoppingCartPage.priceOnCart.getText();
        assertEquals(expectedPrice, actualPrice);
    }

}
