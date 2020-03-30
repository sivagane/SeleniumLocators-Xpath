package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SeleniumLocators Xpath\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.amazon.in/");
	
	WebElement signin=d.findElement(By.id("nav-link-accountList"));
    signin.click();
    
    WebElement account=d.findElement(By.id("createAccountSubmit"));
    account.click();
    
    WebElement name=d.findElement(By.id("ap_customer_name"));
    name.sendKeys("Sivaganesh");
    
    WebElement email=d.findElement(By.id("ap_email"));
    email.sendKeys("sivag918@gmail.com");
    
    WebElement pass=d.findElement(By.id("ap_password"));
    pass.sendKeys("sivaamaon");
    
    
    
    WebElement btn=d.findElement(By.id("continue"));
    btn.click();
}
}
