package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainClass extends BaseClass {

	public static void main(String[] args) {
		launchChromeBrowser();
		loadUrl("https://www.facebook.com/");
		getTitle();
		getCUrl();
		
		WebElement user=driver.findElement(By.id("email"));
		fill(user, "laxmi");
		
		WebElement password=driver.findElement(By.id("pass"));
		fill(password, "786");
		
		WebElement date=driver.findElement(By.id("day"));
		sBI(date, 9);
		//sBV(date, "India");
		//sBVT(date, "Dubai");
		
		WebElement button = driver.findElement(By.id("loginbutton"));
		btnClick(button);
}
}
