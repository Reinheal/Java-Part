package com.academy.tests.lesson19;

import com.academy.lesson18.manager.PropertyManager;
import com.academy.tests.lesson19.page.HomePage;
import com.academy.tests.lesson19.page.WomenPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SortPrice extends BaseTest {

@Test(dataProvider = "sortByLower")
    public void sortPriceToLowerFirst(String sortBy) throws Exception{
        WomenPage womenPage=
                new HomePage(driver)
                        .clickWomenPageLink()
                        .selectDress()
                        .toList()
                        .sortProductBy(sortBy);
        waitUntilScriptComplete(driver);
        List<String> actualPrises =
                         womenPage
                        .listProduct();
        List<String> expectedPrices = new ArrayList<>(actualPrises);
        expectedPrices.sort(String::compareTo);
    System.out.println(actualPrises);
    System.out.println(expectedPrices);
        Assert.assertEquals(actualPrises, expectedPrices);



    }

    @DataProvider(name="sortByLower")
    private Object[]sortBy(){
        return new Object[]
        { PropertyManager.getProperty("automation.sortByLowerFirst")};
    }

}
