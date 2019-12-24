package org.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
static WebDriver driver;

public static void launchChromeBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\ReusableClass\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
}

public static void loadUrl(String url) {
	driver.get(url);
}

public static void fill(WebElement e, String value) {
	e.sendKeys(value);
}

public static void getTitle() {
	String title=driver.getTitle();
	System.out.println(title);
}

public static void getCUrl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
}

public static void sBI(WebElement e, int index) {
	Select s=new Select(e);
	s.selectByIndex(index);
}

public static void sBV(WebElement e, String val) {
	Select s=new Select(e);
	s.selectByValue(val);
}

public static void sBVT(WebElement e, String text) {
	Select s=new Select(e);
	s.selectByVisibleText(text);
}

public static void btnClick(WebElement e) {
	e.click();
}
}