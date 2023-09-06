package org.testng;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.base.Baseclass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.pojo.detailspojo;
import org.pojo.loginpojo;
import org.pojo.paymentpojo;
import org.pojo.selectpojo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tripsider extends Baseclass{
	@BeforeClass()
@Test(priority=0)
private void test1() {
launchchrome();
launchurl("https://tripsider.com/");maximize();implicitwait(1000);
}

@Test(priority=1)
public void test2() {
loginpojo l = new loginpojo();
click(l.getCookies());
click(l.getSigin());
sendkeys(l.getEmail(), "greenstechabc@gmail.com");
click(l.getClickemail());
sendkeys(l.getPassword(), "Greenstech");
click(l.getLogin());
}

@Test(priority=2)
private void test3() throws InterruptedException {
	loginpojo l = new loginpojo();
	 Thread.sleep(3000);
	sendkeys(l.getPassvaluetosearch(), "usa");
	click(l.getMonthtoclick());
	click(l.getFirstsele());click(l.getSecondselec());
	click(l.getSearch());
}
@Test(priority=3)
private void test4() {
selectpojo s = new selectpojo();
click(s.getPackselect());
Set<String> windowHandles = driver.getWindowHandles();
List<String> l = new ArrayList<String>();
l.addAll(windowHandles);
String allid = l.get(1);
driver.switchTo().window(allid);
click(s.getRequesttobook());
click(s.getGotopayment());
Set<String> windowHandle = driver.getWindowHandles();
List<String> li = new ArrayList<String>();
li.addAll(windowHandle);
String all = li.get(2);
driver.switchTo().window(all);
}

@Test(priority=4)
private void test5() {
detailspojo d = new detailspojo();
selectbyvalue(d.getBirthdayday(), "5");
selectbyvalue(d.getBirthdaymonth(), "5");
selectbyvalue(d.getBirthdayyear(), "2000");
click(d.getRadiobuttonmale());
selectbyvalue(d.getCountryselect(), "22");
}

@Test(priority=5)
private void test6() {
	detailspojo d = new detailspojo();
	sendkeys(d.getCitychoose(), "Salta");
	sendkeys(d.getAddresschoose(), "greenstech, salta");
	sendkeys(d.getTouristcode(), "A4400");
	javascriptexecutor();
	WebElement pri = d.getPrivacyandterms();
	js.executeScript("arguments[0].click()", pri);
	click(d.getSubmitbuttons());
}

@Test(priority=6)
private void test7() throws InterruptedException {
	Thread.sleep(7000);
paymentpojo p = new paymentpojo();
sendkeys(p.getEmaildetails(), "greenstechabc@gmail.com");
sendkeys(p.getCardnumber(), "46839878987456123");
sendkeys(p.getCardexpiry(), "0224");
sendkeys(p.getCardcvc(), "567");
sendkeys(p.getBillingname(), "greenstech");
selectbyvalue(p.getBillingcountry(), "AR");
click(p.getSubmiticon());

}
@AfterMethod
private void test8() {
getDateandTime();
}
@BeforeMethod
private void test9() {
getDateandTime();
}


















}
