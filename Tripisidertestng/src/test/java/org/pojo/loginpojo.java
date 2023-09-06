package org.pojo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpojo extends Baseclass{
public loginpojo() {
       PageFactory.initElements(driver, this);
}
@CacheLookup
@FindBy(xpath="//span[@class='cookie-notification__hidden-text']")
private WebElement cookies;

@CacheLookup
@FindBy(xpath="//div[text()=' Sign in ']")
private WebElement sigin;

@CacheLookup 
@FindBy(xpath="//input[@id='input1']")
private WebElement Email;

@CacheLookup
@FindBy(xpath="//span[text()='Continue with email']")
private WebElement clickemail;

@CacheLookup
@FindBy(xpath="//input[@id='input4']")
private WebElement Password;

@CacheLookup
@FindBy(xpath="//span[text()='Log in']")
private WebElement login;

@CacheLookup
@FindBy(xpath="//*[contains(@class,'multiselect multiselect-search multiselect--above mt6')]")
private WebElement passvaluetosearch;

@CacheLookup
@FindBy(xpath="//input[@placeholder='Month or dates']")
private WebElement monthtoclick;

@CacheLookup
@FindBy(xpath="//td[@title='2023-08-07']")
private WebElement firstsele;

@CacheLookup
@FindBy(xpath="(//td[@title='2023-08-15'])[1]")
private WebElement secondselec;

@CacheLookup
@FindBy(xpath="//button[@class='search-btn']")
private WebElement search;

public WebElement getCookies() {
	return cookies;
}

public WebElement getSigin() {
	return sigin;
}

public WebElement getEmail() {
	return Email;
}

public WebElement getClickemail() {
	return clickemail;
}

public WebElement getPassword() {
	return Password;
}

public WebElement getLogin() {
	return login;
}

public WebElement getPassvaluetosearch() {
	return passvaluetosearch;
}

public WebElement getMonthtoclick() {
	return monthtoclick;
}

public WebElement getFirstsele() {
	return firstsele;
}

public WebElement getSecondselec() {
	return secondselec;
}

public WebElement getSearch() {
	return search;
}
























}
