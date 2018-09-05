package com.academy.tests.lesson19.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BasePage {
    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    private WebElement singInButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")
    private WebElement myAddressesButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public AddressPage clickMyAddressesButton(){
        myAddressesButton.click();
        return new AddressPage (driver);
    }

    public LoginPage inputEmail(String email) {
        inputTextField(emailField, email);
        return this;
    }

    public LoginPage inputPassword(String password) {
        inputTextField(passwordField, password);
        return this;
    }

    public AccountPage clickSingIn() {
        singInButton.click();
        return new AccountPage(driver);
    }
}