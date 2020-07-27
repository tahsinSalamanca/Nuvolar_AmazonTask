package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//span[@id='sc-subtotal-label-activecart']")
    public WebElement quantityOnCart;

    @FindBy(xpath = "//span[@id='sc-subtotal-amount-activecart']")
    public WebElement priceOnCart;

    @FindBy(xpath = "//span[@id='sc-subtotal-label-buybox']")
    public WebElement changedQuantityOnCart;

    @FindBy(xpath = "//span[@id='sc-subtotal-amount-buybox']/span")
    public WebElement changedPriceOnCart;


    public WebElement selectList(int value){

        String locator = "(//select[@name='quantity'])["+ value + "]";

        return  Driver.get().findElement(By.xpath(locator));

    }































}
