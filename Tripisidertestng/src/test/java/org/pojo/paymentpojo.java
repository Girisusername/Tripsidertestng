package org.pojo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentpojo extends Baseclass {
public paymentpojo() {
PageFactory.initElements(driver, this);
}
@CacheLookup
@FindBy(xpath="(//input[@type='text'])[1]")
private WebElement emaildetails;

@CacheLookup
@FindBy(xpath="//input[@id='cardNumber']")
private WebElement cardnumber;

@CacheLookup
@FindBy(xpath="//input[@name='cardExpiry']")
private WebElement cardexpiry;

public WebElement getEmaildetails() {
	return emaildetails;
}

public WebElement getCardnumber() {
	return cardnumber;
}

public WebElement getCardexpiry() {
	return cardexpiry;
}

public WebElement getCardcvc() {
	return cardcvc;
}

public WebElement getBillingname() {
	return billingname;
}

public WebElement getBillingcountry() {
	return billingcountry;
}

public WebElement getSubmiticon() {
	return submiticon;
}
@CacheLookup
@FindBy(xpath="//input[@id='cardCvc']")
private WebElement cardcvc;

@CacheLookup
@FindBy(xpath="//input[@name='billingName']")
private WebElement billingname;

@CacheLookup
@FindBy(xpath="//select[@id='billingCountry']")
private WebElement billingcountry;

@CacheLookup
@FindBy(xpath="//div[@class='SubmitButton-IconContainer']")
private WebElement submiticon;










}
