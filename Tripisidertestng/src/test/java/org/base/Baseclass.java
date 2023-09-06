package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static Actions a;
	public static Alert b;
	public static Robot r;
	public static Select s;
	public static JavascriptExecutor js;
	public static TakesScreenshot tk;
	public static WebDriverWait w;
	public static FluentWait<WebDriver> f;
public static void launchchrome() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
}
public static void launchfirefox() {
WebDriverManager.firefoxdriver().setup();
driver=new FirefoxDriver();
}
public static void launchedge() {
WebDriverManager.edgedriver().setup();
driver=new EdgeDriver();
}
public static void gettitle() {
String title = driver.getTitle();
System.out.println(title);
}
public static void getCurrentpagetitle() {
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
}
public static void close() {
driver.close();
}
public static void quit() {
driver.quit();
}
public static void launchurl(String url) {
driver.get(url);
}
public static void maximize() {
driver.manage().window().maximize();
}
public static void minimize() {
driver.manage().window().minimize();
}
public static void sendkeys(WebElement element, String value) {
element.sendKeys(value);
}
public static void click(WebElement element) {
element.click();
}
public static void gettext(WebElement element) {
String text = element.getText();
System.out.println(text);
}
public static void getattribute(WebElement element, String value) {
String attribute = element.getAttribute(value);
System.out.println(attribute);
}

public static void Actions() {
 a = new Actions(driver);
}
public static void Movetoelement(WebElement element) {
	 a = new Actions(driver);
a.moveToElement(element).perform();
}
public static void draganddrop(WebElement element, WebElement value) {
	 a = new Actions(driver);
a.dragAndDrop(element, value).perform();
}
public static void keyup(WebElement element) {
	 a = new Actions(driver);
a.keyUp((CharSequence) element).perform();
}
public static void keydown(WebElement element) {
	 a = new Actions(driver);
a.keyDown((CharSequence) element).perform();
}
public static void contextclick(WebElement element) {
	 a = new Actions(driver);
a.contextClick(element).perform();
}
public static void doubleclick(WebElement element) {
	 a = new Actions(driver);
a.doubleClick(element).perform();
}
public static void switchtoalert() {
driver.switchTo().alert();
}
public static void acceptalert() {
	b = driver.switchTo().alert();
b.accept();
}
public static void dismissalert() {
	b = driver.switchTo().alert();
b.dismiss();
}
public static void sendkeysalert(String value) {
	b = driver.switchTo().alert();
b.sendKeys(value);
}
public static void gettextalert() {
	b = driver.switchTo().alert();
String text = b.getText();
System.out.println(text);
}
public static void robot() throws AWTException {
r = new Robot();
}
public static void keypress(int key) throws AWTException {
	r = new Robot();
r.keyPress(key);
}
public static void keyrelease(int key) throws AWTException {
	r = new Robot();
r.keyRelease(key);
}
public static void copykey() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_C);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_C);
}
public static void pastekey() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);

	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
}
public static void cutkey() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_X);

	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_X);

}
public static void navigateurl(String url) {
driver.navigate().to(url);
}
public static void navigateforward() {
driver.navigate().forward();
}
public static void navigateback() {
driver.navigate().back();
}
public static void navigationrefresh() {
driver.navigate().refresh();
}
public static void dropdown(WebElement element) {
s = new Select(element);
}
public static void selectbyvalue(WebElement element, String value) {
	s = new Select(element);
s.selectByValue(value);
}
public static void selectbyindex(WebElement element, int index) {
	s = new Select(element);
s.selectByIndex(index);
}
public static void selectbytext(WebElement element,String text) {
	s = new Select(element);
s.selectByVisibleText(text);
}
public static void ismultiple(WebElement element) {
	s = new Select(element);
boolean multiple = s.isMultiple();
System.out.println(multiple);
}
public static void isdisplayed(WebElement element) {
	s = new Select(element);
boolean displayed = element.isDisplayed();
System.out.println(displayed);
}
public static void isenabled(WebElement element) {
	s = new Select(element);
boolean enabled = element.isEnabled();
System.out.println(enabled);
}
public static void isselected(WebElement element) {
	s = new Select(element);
boolean selected = element.isSelected();
System.out.println(selected);
}
public static void gettagname(WebElement element) {
	s = new Select(element);
String tagName = element.getTagName();
System.out.println("Tagname:"+tagName);
}
public static void getoption(WebElement element) {
	s = new Select(element);
List<WebElement> options = s.getOptions();
for (int i = 0; i < options.size(); i++) {
	System.out.println(options.get(i).getText());
}
}
public static void getallselectedoption(WebElement element) {
	s = new Select(element);
List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
for (WebElement z : allSelectedOptions) {
	System.out.println(z.getText());
}
}
public static void getfirstselectoption(WebElement element) {
	s = new Select(element);
WebElement firstSelectedOption = s.getFirstSelectedOption();
System.out.println(firstSelectedOption.getText());
}
public static void deselectbyindex(WebElement element,int index) {
	s= new Select(element);
s.deselectByIndex(index);
}
public static void deselectbyvalue(WebElement element, String value) {
	s= new Select(element);
s.deselectByValue(value);
}
public static void deselectbytext(WebElement element,String text) {
	s = new Select(element);
s.deselectByVisibleText(text);
}
public static void deselectall(WebElement element) {
	s = new Select(element);
s.deselectAll();
}
public static void switchtoframe(WebElement element) {
driver.switchTo().frame(element);
}
public static void parentframe() {
driver.switchTo().parentFrame();
}
public static void outerframe() {
	driver.switchTo().defaultContent();
}
public static void javascriptexecutor() {
js = (JavascriptExecutor)driver;
}
public static void executescript(WebElement element, String key) {
	js = (JavascriptExecutor)driver;
js.executeScript(key, element);
}
public static void scroll(WebElement element, String value) {
	js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].ScrollIntoView()", element);
}
public static void passthevaluescript(WebElement element, String value) {
	js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttribute('value','"+value+"')", element);
}
public static void getattributescript(WebElement element,String value) {
	js = (JavascriptExecutor)driver;
	Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element);
	System.out.println("Value:"+executeScript);
}
public static void clickscript(WebElement element, String value) {
	js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click()", element);
}
public static void windowshandling(String windowsid) {
driver.switchTo().window(windowsid);
}
public static void getparentwindow() {
String windowHandle = driver.getWindowHandle();
System.out.println(windowHandle);
}
public static void childwindow(int window) {
Set<String> windowHandles = driver.getWindowHandles();
List<String> l = new ArrayList<String>();
l.addAll(windowHandles);
String child = l.get(window);
driver.switchTo().window(child);
}
public static void takescreenshot(String filename) throws IOException {
tk = (TakesScreenshot)driver;
File src = tk.getScreenshotAs(OutputType.FILE);
File des = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven12pmbatch\\src\\Screenshot\\"+filename+".png");
FileUtils.copyFile(src, des);
}
public static void implicitwait(int duration) {
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(duration));
}
public static void tempwait(int duration) throws InterruptedException {
Thread.sleep(duration);
}
public static void webdriverwait(int duration) {
w = new WebDriverWait(driver, Duration.ofMillis(duration));
}
public static void Fluentwait(int duration, int time) {
 f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(duration)).pollingEvery(Duration.ofMillis(time)).ignoring(Exception.class);
}
public static void Tofetchtablenthrownthcell(int index, int rowindex, int dataindex) {
List<WebElement> alltable = driver.findElements(By.tagName("table"));
WebElement table = alltable.get(index);
List<WebElement> allrow = table.findElements(By.tagName("tr"));
WebElement row = allrow.get(rowindex);
List<WebElement> alldata = row.findElements(By.tagName("td"));
WebElement data = alldata.get(dataindex);
System.out.println(data.getText());
}
public static void Tofetchtableallrowdatanorm(int index) {
List<WebElement> alltable = driver.findElements(By.tagName("table"));
WebElement table = alltable.get(index);
List<WebElement> allrow = table.findElements(By.tagName("tr"));
for (int i = 0; i < allrow.size(); i++) {
	WebElement row = allrow.get(i);
	List<WebElement> alldata = row.findElements(By.tagName("td"));
	for (int j = 0; j < alldata.size(); j++) {
		WebElement data = alldata.get(j);
		System.out.println(data.getText());
	}}}
public static void Tofetchtableallrowdataenchan(int index) {
	List<WebElement> alltable = driver.findElements(By.tagName("table"));
	WebElement table = alltable.get(index);
	List<WebElement> allrow = table.findElements(By.tagName("tr"));
	for (WebElement row : allrow) {
		List<WebElement> alldata = row.findElements(By.tagName("td"));
		for (WebElement data : alldata) {
			System.out.println(data.getText());
		}}}
public static void Tofetchtableallrowdataheadingnorm(int index) {
	List<WebElement> alltable = driver.findElements(By.tagName("table"));
	WebElement table = alltable.get(index);
	List<WebElement> allrow = table.findElements(By.tagName("tr"));
	for (int i = 0; i < allrow.size(); i++) {
		WebElement row = allrow.get(i);
		List<WebElement> allhead = row.findElements(By.tagName("th"));
		for (int j = 0; j < allhead.size(); j++) {
			WebElement head = allhead.get(j);
			System.out.println(head.getText());
		}List<WebElement> alldata = row.findElements(By.tagName("td"));
		for (int j = 0; j < alldata.size(); j++) {
			WebElement data = alldata.get(j);
			System.out.println(data.getText());
		}}}
public static void Tofetchtableallrowdataheadenchan(int index) {
	List<WebElement> alltable = driver.findElements(By.tagName("table"));
	WebElement table = alltable.get(index);
	List<WebElement> allrow = table.findElements(By.tagName("tr"));
	for (int i = 0; i < allrow.size(); i++) {
		WebElement row = allrow.get(i);
		List<WebElement> allhead = row.findElements(By.tagName("th"));
		for (WebElement head : allhead) {
			System.out.println(head.getText());
		}
		List<WebElement> alldata = row.findElements(By.tagName("td"));
		for (int j = 0; j < alldata.size(); j++) {
			WebElement data = alldata.get(j);
			System.out.println(data.getText());
		}
	}
}
public static void Tofetchtablelastrowdata(int index) {
	List<WebElement> alltable = driver.findElements(By.tagName("table"));
	WebElement table = alltable.get(index);
	List<WebElement> allrow = table.findElements(By.tagName("tr"));
	WebElement row = allrow.get(allrow.size()-1);
	List<WebElement> alldata = row.findElements(By.tagName("td"));
	WebElement data = alldata.get(alldata.size()-1);
	System.out.println(data.getText());
}
public static void Tofetchtablemiddlerowdata(int index) {
	List<WebElement> alltable = driver.findElements(By.tagName("table"));
	WebElement table = alltable.get(index);
	List<WebElement> allrow = table.findElements(By.tagName("tr"));
	WebElement row = allrow.get(allrow.size()/2);
	List<WebElement> alldata = row.findElements(By.tagName("td"));
	WebElement data = alldata.get(alldata.size()/2);
	System.out.println(data.getText());
}
public static void Tofetchtableevenrowdata(int index) {
	List<WebElement> alltable = driver.findElements(By.tagName("table"));
	WebElement table = alltable.get(index);
	List<WebElement> allrow = table.findElements(By.tagName("tr"));
	for (int i = 0; i < allrow.size(); i++) {
		if (i%2==0) {
		WebElement row = allrow.get(i);
		List<WebElement> alldata = row.findElements(By.tagName("td"));
		for (int j = 0; j < alldata.size(); j++) {
			if (j%2==0) {
			WebElement data = alldata.get(j);
			System.out.println(data.getText());
		}
		}
		}
	}
}
public static void Tofetchtableoddrowdata(int index) {
	List<WebElement> alltable = driver.findElements(By.tagName("table"));
	WebElement table = alltable.get(index);
	List<WebElement> allrow = table.findElements(By.tagName("tr"));
	for (int i = 0; i < allrow.size(); i++) {
		if (i%2!=0) {
		WebElement row = allrow.get(i);
		List<WebElement> alldata = row.findElements(By.tagName("td"));
		for (int j = 0; j < alldata.size(); j++) {
			if (j%2!=0) {
			WebElement data = alldata.get(j);
			System.out.println(data.getText());
		}
		}
		}
	}
}

public static void Tofetchexcelallsheetcell(String filename, String sheetname) throws IOException {
	File f = new File(filename);
	FileInputStream fin = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fin);
	Sheet s = book.getSheet(sheetname);
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
		
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			System.out.println(c);
		}
	}
	
}

public static void Tofetchexcelnthsheetcell(String filename,String sheetname,int row, int cell) throws IOException {
	File f = new File(filename);
	FileInputStream fin = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fin);
	Sheet s = book.getSheet(sheetname);
	Row r = s.getRow(row);
	Cell c = r.getCell(cell);
	System.out.println(c);
}
public static void TofetchexcelLastsheetcell(String filename, String sheetname) throws IOException {
	File f = new File(filename);
	FileInputStream fin = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fin);
	Sheet s = book.getSheet(sheetname);
	Row r = s.getRow(s.getPhysicalNumberOfRows()-1);
	Cell c = r.getCell(r.getPhysicalNumberOfCells()-1);
	System.out.println(c);
}
public static void TofetchexcelMiddlesheetcell(String filename, String sheetname) throws IOException {
	File f = new File(filename);
	FileInputStream fin = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fin);
	Sheet s = book.getSheet(sheetname);
	Row r = s.getRow(s.getPhysicalNumberOfRows()/2);
	Cell c = r.getCell(r.getPhysicalNumberOfCells()/2);
	System.out.println(c);
}
public static String Tofetchexcelnthdata(String file, String Sheet, int row, int cell ) throws IOException {
	File f = new File(file);
	FileInputStream fin = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fin);
	Sheet sh = book.getSheet(Sheet);
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
			int type = c.getCellType();	
		String name ="";
		if (type==1) {
            name = c.getStringCellValue();
            System.out.println(name);
		} 
		else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			name = sim.format(d);
			System.out.println(name);
		}
		else {
          double d = c.getNumericCellValue();
          long l = (long)d;
          name = String.valueOf(l);
          System.out.println(name);
		}	return name;	
		
}

public static void Tofetchexcelalldata(String file, String Sheet) throws IOException {
	File f = new File(file);
	FileInputStream fin = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fin);
	Sheet sh = book.getSheet(Sheet);
		for (int i = 0; i <sh.getPhysicalNumberOfRows(); i++) {
			Row r = sh.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
			
			int type = c.getCellType();	
		String name ="";
		if (type==1) {
            name = c.getStringCellValue();
            System.out.println(name);
		} 
		else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			name = sim.format(d);
			System.out.println(name);
		}
		else {
          double d = c.getNumericCellValue();
          long l = (long)d;
          name = String.valueOf(l);
          System.out.println(name);
		}	//return name;	
		}
}

}

public static void Tosetexceloldfiledata(String file, String Sheet, int row, int cell, String setcell) throws IOException {
	File f = new File(file);
	FileInputStream fin = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fin);
	Sheet sh = book.getSheet(Sheet);
	Row r = sh.createRow(row);
	Cell c = r.createCell(cell);
	c.setCellValue(setcell);
	FileOutputStream fou = new FileOutputStream(f);
	book.write(fou);

}

public static void Tosetexcelnewfiledata(String file, String Sheet, int row, int cell, String setcell) throws IOException {
	File f = new File(file);
	Workbook book = new XSSFWorkbook();
	Sheet sh = book.createSheet(Sheet);
	Row r = sh.createRow(row);
	Cell c = r.createCell(cell);
	c.setCellValue(setcell);
	FileOutputStream fou = new FileOutputStream(f);
	book.write(fou);
}
public static void Togetexcelnewfiledata(String file, String Sheet, int row, int cell) throws IOException {
	File f = new File(file);
	Workbook book = new XSSFWorkbook();
	Sheet sh = book.getSheet(Sheet);
	Row r = sh.getRow(row);
	Cell c = r.getCell(cell);
	System.out.println(c);
	FileOutputStream fou = new FileOutputStream(f);
	book.write(fou);
}
public static void Togetexceloldfiledata(String file, String Sheet, int row, int cell) throws IOException {
	File f = new File(file);
	FileInputStream fin = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fin);
	Sheet sh = book.getSheet(Sheet);
	Row r = sh.createRow(row);
	Cell c = r.createCell(cell);
	System.out.println(c);
	FileOutputStream fou = new FileOutputStream(f);
	book.write(fou);
}
public static void getDateandTime() {
Date de = new Date();
System.out.println(de);
}
public static void Javascriptexecutorclick(WebElement element) {
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click", element);
}































}

