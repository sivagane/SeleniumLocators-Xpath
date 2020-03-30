package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SeleniumLocators Xpath\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.irctc.co.in/nget/train-search");
	d.manage().window().maximize();
	WebElement from=d.findElement(By.xpath("//input[@placeholder='From*']"));
	from.sendKeys("Pudhucherry");
	
	WebElement to= d.findElement(By.xpath("//input[@placeholder='To*']"));
	to.sendKeys("Tirupur");
	Thread.sleep(3000);

	List<WebElement> allrows = d.findElements(By.tagName("tr"));
	int s = allrows.size();
	for(int i=0;i<s;i++) {
		List<WebElement> alldata = d.findElements(By.tagName("td"));
		int ds = alldata.size();
		for( i=0;i<ds;i++) {
			WebElement eachdata = alldata.get(i);
			String st = eachdata.getText();
			if(st.equals("20")) {
				eachdata.click();
				break;
			}
		}
	}

	WebElement drop=d.findElement(By.xpath("//label[@class='ng-tns-c13-7 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']"));
	drop.click();
	WebElement Train = d.findElement(By.xpath("(//li[@class='ng-tns-c13-7 ui-dropdown-item ui-corner-all ng-star-inserted'])[1]"));
	Train.click();
	WebElement btn=d.findElement(By.xpath("//button[@label='Find Trains']"));
	btn.click();
}
}
