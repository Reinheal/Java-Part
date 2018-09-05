package com.academy.tests.lesson19.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")
    private WebElement clickDressesLink;

    @FindBy(xpath = "//*[@id=\"list\"]/a/i")
    private WebElement clickToList;

    @FindBy(id = "selectProductSort")
    private WebElement clickToSelectProductSort;

    @FindBy(css ="#center_column > ul > li > div > div > div.right-block.col-xs-4.col-xs-12.col-md-4 > div > div.content_price.col-xs-5.col-md-12 > span.price.product-price")
    private WebElement productOnPage;

    public WomenPage(WebDriver driver){
        super(driver);

    }
    public WomenPage selectDress(){
        clickDressesLink.click();
        return this;
    }
    public WomenPage sortProductBy(String sortBy){
        selectSort(clickToSelectProductSort,sortBy);
        return this;
    }
    public List<String> listProduct() {
        List<WebElement> listPrices =driver.findElements(By.cssSelector("#center_column > ul > li > div > div > div.right-block.col-xs-4.col-xs-12.col-md-4 > div > div.content_price.col-xs-5.col-md-12 > span.price.product-price"));
        List<String> actualPrises = new ArrayList<String>();
        for (WebElement e : listPrices) {
            actualPrises.add(e.getText());
        }
        return actualPrises;
    }
    public WomenPage toList(){
        clickToList.click();
        return this;
    }

}
