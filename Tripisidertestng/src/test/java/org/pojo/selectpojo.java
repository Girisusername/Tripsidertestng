package org.pojo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectpojo extends Baseclass{
public selectpojo() {
PageFactory.initElements(driver, this);
}
@CacheLookup
@FindBy(xpath="/html/body/main/div[5]/div[2]/div/div[4]/a[2]/div/div[2]")
private WebElement packselect;

@CacheLookup
@FindBy(xpath="//button[text()=' Request to book ']")
private WebElement requesttobook;

@CacheLookup
@FindBy(xpath="/html/body/div[9]/div[2]/div[2]/div[3]/a")
private WebElement gotopayment;

public WebElement getPackselect() {
	return packselect;
}

public WebElement getRequesttobook() {
	return requesttobook;
}

public WebElement getGotopayment() {
	return gotopayment;
}





























}
