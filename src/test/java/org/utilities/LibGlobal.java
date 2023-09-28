package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal extends ExcelHelper{

  public static WebDriver driver;
  public static Alert a;
  public static Actions ac;
  public static Robot r;
public static String url;
public static Object allFrames;
public static Select s;

//1.openchrome
 public static void OpenChrome() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
 
 //2.openedge
	
	public static void OpenEdge() {
        
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
//3.openfirefox	
	
	public static void OpenFirefox() {
 
	    WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
	}
	
//4.close browser	
	
	public static void closeBrowser() {
       
		driver.quit();
	}
	
//5.closecurrentTab	
	
	public static void closeCurrentTab() {
        
		driver.close();
	}
	
//6.print title	
	
	public static  void printTitle() {
       
		String titleName = driver.getTitle();
		System.out.println(titleName);
	}
	
//7.print url	
	
	public static void printUrl() {
        
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	 
//8.reload
    
	public static void toReload() {
        
    	driver.navigate().refresh();
	}	
	
//9.maximize window	
    
    public static void maxWindow() {
       
    	driver.manage().window().maximize();
	}
    
 //10.holdTime  
    
    public static void hold(int time) throws InterruptedException {
       
    	Thread.sleep(time);
	}
    
 //11.send keys   
    
    public static void fillTextBox(WebElement element,String input) {
        
    	element.sendKeys(input);
	}
    
//12.click	
	public static void toClick(WebElement element) {
        
		element.click();
	}
	
//13.get Url	
	 
	public static void launchUrl(String pgurl) {

		driver.get(pgurl);
	}
	
//14.accept alert	
	
	public static void acceptAlert() {
 
		a = driver.switchTo().alert();
		a.accept();
	}
	
//15.cancel alert	
	
	public static void cancelAlert() {
  
		a= driver.switchTo().alert();
		a.dismiss();
	}
	
//16.drag and drop	
	
	public static void dragDrop(WebElement e1,WebElement e2) {

		ac = new Actions(driver);
		ac.dragAndDrop(e1, e2);
	}
	
//17.mouse hovering	
	
	public static void mouseHovering(WebElement ele) {
       
		ac = new Actions(driver);
		ac.moveToElement(ele);
	}
	
//18.copy---robot	
	
	public static void copyUsingKeyboard() throws AWTException {
       
		r = new Robot();
	
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);	
		r.keyRelease(KeyEvent.VK_C);
	}
	
//19.copy----robot	
	
	public static void pasteUsingKeyboard() throws AWTException {
		
		r = new Robot();
		
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
	}
	
//20.enter----------robot	
	
	public static void enterUsingKeyboard() throws AWTException {
       
		r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
//21.Backspace----------robot	

	public static void toBackSpace() throws AWTException {

		r = new Robot ();
		
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
	}
	
//22.tab-----robot	
	
	public static void toTabKey() throws AWTException {

		r = new Robot ();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	
	}
	
//23.alt---------robot	
	
	public static void toAlt() throws AWTException {

		r = new Robot ();
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_ALT);
	
	}
	
//24.space---------robot	
	
	public static void toSpace() throws AWTException {

		r = new Robot ();
		
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
	
	}
	
//25.caps lock-----robot	
	
	public static void toCapsLock() throws AWTException {

		r = new Robot ();
		
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
	
	}
	
//26.delete------robot	

	public static void toDelete() throws AWTException {

		r = new Robot ();
		
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
	
	}

//27.getText
	
	public static void printText(WebElement element) {
       
		String txt = element.getText();
		System.out.println(txt);
	}
	
//28.getAttribute
	
	public static void printAttribute(WebElement element) {

		String atr = element.getAttribute("value");
		System.out.println(atr);
	}
	
	
//29.Actions method
	
	public static void DoubleClick(WebElement input) {

		ac= new Actions(driver);
		ac.doubleClick(input).perform();
	}

//30.right click	
	
	public static void contextClick(WebElement input) {

		ac = new Actions (driver);
		ac.contextClick(input).perform();
	}
	
//31.	
	//doubt
	public static void keyUp(CharSequence input) {

		ac = new Actions(driver);
		ac.keyUp(input).perform();
		
	}
	
//32.
	public static void keyDown(CharSequence input) {

		ac = new Actions(driver);
		ac.keyDown(input).perform();
	}
	
//33.Robot methods
	
	public static void tabUsingKey() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	
//34.
	
	public static void downUsingKey() throws AWTException {
 
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
//35.back--------------navi
	
	public static void goBack() {

		driver.navigate().back();
	}
	
//36.forward	
	
	public static void goForward() {

		driver.navigate().forward();
		
	}
	
//37.to given url-----navi
	
	public static void toGivenUrl() {

		driver.navigate().to(url);
		
	}
	
//38.Frames
	
	public static void stringIdOrNameByFrames(String input) {

		driver.switchTo().frame(input);
	}
	
//39.frame---------webelement	
	
	public static void webElementByFrames(WebElement element) {

		driver.switchTo().frame(element);
	}
	
//40.frame----------index	
	
	public static void intIndexByFrames(int number) {

		driver.switchTo().frame(number);
	}
	
//41.size of frames
	
	public static void sizeOfFrame() {

     List<WebElement> allFrames = driver.findElements(By.tagName("iFrame"));
     
	}
	
//42.parent frame	
	
	public static void parentFrame() {

		driver.switchTo().parentFrame();
	}
	
//43.default frame	
	
	public static void defaultFrame() {

		driver.switchTo().defaultContent();
	}
	
//44.Window Handling
	
	public static void getWindow(String input) {

		driver.switchTo().window(input);
	}
	
//45.window handle	
	
	public static void getWindowHandelMethod() {
		
         String parentId = driver.getWindowHandle();
             
	}

//46.window handles	
	
	public static void getWindowHandlesMethod(int input) {

		Set<String> allWindowId = driver.getWindowHandles();
		List<String> allId = new ArrayList<String>(allWindowId);
		driver.switchTo().window(allId.get(input));
	}
	
 //47.how to count-----------general method
	
	public static void linkCount() {

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("num of links :" + allLinks.size());
	}
	
//48.WebTable---------------count
	
	public static void tableCount() {

		List<WebElement> allTables = driver.findElements(By.tagName("table"));
		
		System.out.println("num of tabels:" + allTables.size()); 
	}
	
//49.TakesScreenshots
	
	public static void takeSnap(String picName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File de = new File("C:\\Users\\ADMIN\\eclipse-workspace\\MavenPackage\\screenshots\\" +picName+ ".png");
		
		FileUtils.copyFile(src, de);
	}
	
//50.Select----------ByVisibleText
	
	public static void selectUsingText(WebElement element , String input) {

		 s= new Select(element);
		
		s.selectByVisibleText(input);
	}
	
	
//51.Select---------ByIndex
	
	public static void selectUsingIndex(WebElement element ,int input) {
    
		s = new Select(element);
		s.selectByIndex(input);
	}
	
//52.Select---------------allOptions
	
	public static void printAllOptions(WebElement ele) {

		s  = new Select(ele);
		
		List<WebElement> allOptions = s.getOptions();
		
		for (WebElement eachOption : allOptions) {
		
			System.out.println(eachOption.getText());
		}
	}
	
//53.isMultiple------------Select	
	
	public static void toCheckIsMultiple(WebElement ele) {

		s  = new Select(ele);
		if (s.isMultiple()) {
			System.out.println("It is Multiple drapdrown");
		}
	}

//54.get all selected option----------select	
	
	public static void printAllSelectedOption(WebElement element) {

		s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println("The all selected option :" +allSelectedOptions);
		
	}
	
//55.get first selected option-------select	
	
	public static void printgetFirstSelectedOption(WebElement ele) {

		s = new Select(ele);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("select first selected option :" + firstSelectedOption);
	}
	
//56.select	
	
	public static void deSelectUsingValue(WebElement ele , String value) {

		s = new Select (ele);
		s.deselectByValue(value);
	}
	
//57.select	
	
	public static void deSelectUsingIndex(WebElement ele , int value) {

		s = new Select (ele);
		s.deselectByIndex(value);
	}
	
//58.select	
	
	public static void deSelectUsingVisibleText(WebElement ele , String value) {

		s = new Select (ele);
		s.deselectByVisibleText(value);
	}
	
//59.select	
	public static void desSelectAll(WebElement ele , String value) {

		s = new Select(ele);
		s.deselectAll();
	}
	
	
//60.WebTable-----allRows
	
	public static void rowCounts() {

		List<WebElement> allRow = driver.findElements(By.tagName("tr"));
	}
	
	//public static void getOneRow(WebElement element, int input) {

		//WebElement element.get(input);
	//}

//62.WebTable-----------allDatas
	
	public static void toGetAllDatas() {

		WebElement allData = driver.findElement(By.tagName("td"));
	}
	
//63.implicitly wait	
	
	public static void toImplicitWait(int input) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(input));
	}
	
	//64.
public static void getDateAndTime() {

	Date d = new Date();
	System.out.println(d);
}	
	
//65.	
	public static void scrollDown(WebElement viewmore) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", viewmore);
	}
	
//66.	
	
	public static  void scrollUp(WebElement viewmore) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(false)", viewmore);
		
	}
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	

