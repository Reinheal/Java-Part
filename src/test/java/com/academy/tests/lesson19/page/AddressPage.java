package com.academy.tests.lesson19.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[2]/a/span")
    private WebElement addAddressButton;

    public FormAddressPage clickAddAddressButton(){
        addAddressButton.click();
        return new FormAddressPage(driver);
    }


    public AddressPage(WebDriver driver) {
        super(driver);
    }

}
