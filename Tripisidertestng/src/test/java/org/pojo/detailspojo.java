package org.pojo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class detailspojo extends Baseclass{
public detailspojo() {
PageFactory.initElements(driver, this);
}
@CacheLookup
@FindBy(xpath="//select[@name='tourist[1][birthday][day]']")
private WebElement birthdayday;

@CacheLookup
@FindBy(xpath="//select[@name='tourist[1][birthday][month]']")
private WebElement birthdaymonth;

@CacheLookup
@FindBy(xpath="//select[@name='tourist[1][birthday][year]']")
private WebElement birthdayyear;

@CacheLookup
@FindBy(xpath="(//span[@class='radio__text'])[2]")
private WebElement radiobuttonmale;

@CacheLookup
@FindBy(xpath="//select[@name='tourist[1][country]']")
private WebElement countryselect;

@CacheLookup
@FindBy(xpath="//input[@name='tourist[1][city]']")
private WebElement citychoose;

@CacheLookup
@FindBy(xpath="//input[@name='tourist[1][address]']")
private WebElement addresschoose;

@CacheLookup
@FindBy(xpath="//input[@name='tourist[1][zip]']")
private WebElement touristcode;

@CacheLookup
@FindBy(xpath="//span[@class='checkbox__text']")
private WebElement privacyandterms;

@CacheLookup
@FindBy(xpath="(//button[@type='submit'])[1]")
private WebElement submitbuttons;

public WebElement getBirthdayday() {
	return birthdayday;
}

public WebElement getBirthdaymonth() {
	return birthdaymonth;
}

public WebElement getBirthdayyear() {
	return birthdayyear;
}

public WebElement getRadiobuttonmale() {
	return radiobuttonmale;
}

public WebElement getCountryselect() {
	return countryselect;
}

public WebElement getCitychoose() {
	return citychoose;
}

public WebElement getAddresschoose() {
	return addresschoose;
}

public WebElement getTouristcode() {
	return touristcode;
}

public WebElement getPrivacyandterms() {
	return privacyandterms;
}

public WebElement getSubmitbuttons() {
	return submitbuttons;
}















}
