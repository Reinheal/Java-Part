package com.academy.tests.lesson19.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormAddressPage extends BasePage{
    @FindBy (xpath = "//*[@id=\"firstname\"]")
    private WebElement firstNameField;

    @FindBy (xpath = "//*[@id=\"lastname\"]")
    private WebElement lastNameField;

    @FindBy (xpath = "//*[@id=\"company\"]")
    private WebElement companyField;

    @FindBy (xpath = "//*[@id=\"address1\"]")
    private WebElement addressField;

    @FindBy (xpath = "//*[@id=\"address2\"]")
    private WebElement secondaryAddressField;

    @FindBy (xpath = "//*[@id=\"city\"]")
    private WebElement cityField;

    @FindBy (xpath = "//*[@id=\"id_state\"]")
    private WebElement selectState;

    @FindBy (xpath = "//*[@id=\"postcode\"]")
    private WebElement postCodeField;

    @FindBy (xpath = "//*[@id=\"id_country\"]")
    private WebElement selectCountry;

    @FindBy (xpath = "//*[@id=\"phone\"]")
    private WebElement homePhoneField;

    @FindBy (xpath = "//*[@id=\"phone_mobile\"]")
    private WebElement mobilePhoneField;

    @FindBy (xpath = "//*[@id=\"other\"]")
    private WebElement additionalInfoField;

    @FindBy (xpath = "//*[@id=\"alias\"]")
    private WebElement addressNameField;

    @FindBy (xpath = "//*[@id=\"submitAddress\"]/span")
    private WebElement saveAddressButton;


    public FormAddressPage(WebDriver driver) {
        super(driver);
    }
    public FormAddressPage inputFirstName(String firstName) {
        inputTextField(firstNameField, firstName);
        return this;
    }
    public FormAddressPage inputLastName(String lastName) {
        inputTextField(lastNameField, lastName);
        return this;
    }
    public  FormAddressPage inputCompany(String company) {
        inputTextField(companyField,company);
        return this;
    }
    public  FormAddressPage inputAddress(String address) {
        inputTextField(addressField,address);
        return this;
    }
    public FormAddressPage inputSecondAddress(String secondAddress) {
        inputTextField(secondaryAddressField,secondAddress);
        return this;
    }
    public FormAddressPage inputCity(String city) {
        inputTextField(cityField,city);
        return this;
    }
    public FormAddressPage selectStateBy(String stateFrom) {
        selectSort(selectState,stateFrom);
        return this;
    }
    public FormAddressPage inputPostalCode(String postalCode) {
        inputTextField(postCodeField,postalCode);
        return this;
    }
    public FormAddressPage selectCountryBy(String countryFrom) {
        inputTextField(selectCountry,countryFrom);
        return this;
    }
    public FormAddressPage inputHomePhone(String homePhone) {
        inputTextField(homePhoneField,homePhone);
        return this;
    }
    public FormAddressPage inputMobilePhone(String mobilePhone) {
        inputTextField(mobilePhoneField,mobilePhone);
        return this;
    }
    public FormAddressPage inputAddInfo(String additionalInfo) {
        inputTextField(additionalInfoField,additionalInfo);
        return this;
    }
    public FormAddressPage inputAddressName(String addressName) {
        inputTextField(addressNameField,addressName);
        return this;
    }
    public FormAddressPage clickSaveButton() {
        saveAddressButton.click();
        return this;
    }
}
