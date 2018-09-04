package com.academy.tests.lesson19.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage {
    @FindBy(linkText = "Sign in")
    private WebElement signInLink;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    private WebElement womenPageLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WomenPage clickWomenPageLink(){
        womenPageLink.click();
        return new WomenPage(driver);

    }
    public LoginPage clickSingIn() {
        signInLink.click();
        return new LoginPage(driver);
    }
}