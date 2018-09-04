package com.academy.tests.lesson19.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    protected WebDriver driver;

    protected BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected void inputTextField(WebElement field, String value) {
        field.click();
        field.clear();
        field.sendKeys(value);
    }
    protected void selectSort(WebElement selectMenu,String value){
        selectMenu.click();
        new Select(selectMenu).selectByVisibleText(value);
        selectMenu.click();

    }
}