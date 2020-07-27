package com.step_definitions;

import com.pages.ShoppingCartPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;

public class ShoppingCart_step_definitions {

    ShoppingCartPage shoppingCartPage;

    @Then("The user Change the quantity for {int} nd item as {int} on Cart")
    public void the_user_Change_the_quantity_for_nd_item_as_on_Cart(Integer TargetItem, Integer TargetQuantity) {

        shoppingCartPage = new ShoppingCartPage();
        Select options = new Select(shoppingCartPage.selectList(TargetItem));
        options.selectByIndex(TargetQuantity);
    }

    @Then("The user should see total price and quantity are changed correctly")
    public void the_user_should_see_total_price_and_quantity_are_changed_correctly() {

        //After changed, item's quantity on item's list
        shoppingCartPage = new ShoppingCartPage();
        String actualItemQuantity = shoppingCartPage.quantityOnCart.getText();
        String [] strtext2 = actualItemQuantity.split("l ");
        String expectedQuantity = strtext2[1]; //the quantity before change

        String expectedPrice = shoppingCartPage.priceOnCart.getText(); //the price before change

        //After changed, item's quantity on dashboard
        String actualItemQuantityChanged = shoppingCartPage.changedQuantityOnCart.getText();
        String [] strtext4 = actualItemQuantityChanged.split("l ");
        String actualQuantityChanged = strtext4[1];//the quantity after change

        String actualPriceChanged = shoppingCartPage.changedPriceOnCart.getText();//the price after change

        assertEquals(expectedPrice,actualPriceChanged);
        assertEquals(expectedQuantity, actualQuantityChanged);

    }

}
