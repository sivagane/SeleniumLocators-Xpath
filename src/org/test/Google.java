package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SeleniumLocators Xpath\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://accounts.google.com/signup/v2/webcreateaccount?h1=en&flowName=GlifWebSignIn&flowEntry=Signup");
	d.manage().window().maximize();
	
	d.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	
	Actions actions=new Actions(d);
	
	WebElement create=d.findElement(By.xpath("//span[@class='NlWrkb snByac']"));
	create.click();
	actions.moveToElement(create).perform();
	WebElement myself=d.findElement(By.xpath("//div[@class='jO7h3c'][1]"));
	myself.click();
	
	WebElement fname=d.findElement(By.id("firstName"));
	fname.sendKeys("Siva");
	
	WebElement lname=d.findElement(By.id("lastName"));
	lname.sendKeys("Ganesh");
	
	WebElement EmailId=d.findElement(By.id("username"));
	EmailId.sendKeys("sivag1990");
	
	WebElement pass=d.findElement(By.name("Passwd"));
	pass.sendKeys("0809siva");
	
	WebElement passc=d.findElement(By.name("ConfirmPasswd"));
	passc.sendKeys("0809siva");
	
	WebElement btn=d.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	btn.click();
}
}
