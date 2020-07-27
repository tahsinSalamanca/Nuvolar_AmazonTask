package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends BasePage {


    @FindBy(xpath = "(//img[@class='s-image'])[1]")
    public WebElement firstHatForMen;

    @FindBy(xpath = "//select[@id='native_dropdown_selected_size_name']")
    public WebElement selectSize;

    @FindBy(id = "quantity")
    public WebElement select;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement addToCart;

    @FindBy(xpath = "//a[@href='/gp/cart/view.html?ref_=nav_cart']")
    public WebElement Cart;

    @FindBy(xpath = "//span[@id='priceblock_ourprice']")
    public WebElement priceOnResult;

    @FindBy(xpath = "//span[@class='a-color-price hlb-price a-inline-block a-text-bold']")
    public WebElement lastPriceOnResult;

    @FindBy(xpath = "//span[@class='a-size-medium a-align-center huc-subtotal']/span")
    public WebElement lastQuantityOnResult;


















}
