package org.test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redbus {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SeleniumLocators Xpath\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.redbus.in/");
	
   d.manage().window().maximize();
   WebElement btn=d.findElement(By.id("sign-in-icon-down"));
   btn.click();
   
   WebElement signin=d.findElement(By.id("hc"));
   signin.click();
   WebElement frame = d.findElement(By.xpath("//iframe[@class='modalIframe']"));
   d.switchTo().frame(frame);
   Thread.sleep(3000);
   WebElement pcode=d.findElement(By.id("mobileNoInp"));
   pcode.sendKeys("9750364952");
   WebElement btn1=d.findElement(By.xpath("//div[@class='otpContainer clearfix border-r-3']"));
   btn1.click();
   Thread.sleep(3000);
   WebElement otp = d.findElement(By.xpath("(//input[@class='IP'])[3]"));
   otp.sendKeys("846779");
   WebElement votp = d.findElement(By.id("verifyUser"));
   votp.click();
   
}
}
