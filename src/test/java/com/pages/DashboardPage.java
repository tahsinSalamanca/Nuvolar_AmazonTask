package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;


    @FindBy(xpath = "//span[@id='nav-search-submit-text']/../input")
    public WebElement searchButton;
































}
