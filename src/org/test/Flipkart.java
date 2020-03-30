package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SeleniumLocators Xpath\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.flipkart.com/");
	
	d.manage().window().maximize();
	
	WebElement clo=d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	clo.click();
	
	Thread.sleep(3000);
	
	
	WebElement signinbtn=d.findElement(By.xpath("(//div[@class='dHGf8H'])[1]"));
	signinbtn.click();
	
	Thread.sleep(3000);
	
	WebElement email=d.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
    email.sendKeys("sivag918@gmail.com");
    
    WebElement pass=d.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
    pass.sendKeys("08091990");
    
    WebElement loginbtn=d.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
    loginbtn.click();
    
    Thread.sleep(3000);
    
    
    
    
    
}
}
