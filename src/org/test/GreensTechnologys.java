package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnologys {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SeleniumLocators Xpath\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.greenstechnologys.com/");
	d.manage().window().maximize();
	
	WebElement contact=d.findElement(By.xpath("//a[@href='contact.php']"));
    contact.click();
    
    WebElement name=d.findElement(By.id("InputName"));
   name.sendKeys("Sivaganesh");
   
   WebElement email=d.findElement(By.id("InputEmail1"));
   email.sendKeys("Sivag918@gmail.com");
   
   WebElement mobile=d.findElement(By.id("InputSubject"));
   mobile.sendKeys("975036495");
   
   WebElement course=d.findElement(By.name("courses"));
   course.sendKeys("Selenium");
   
   WebElement br=d.findElement(By.name("branch"));
   br.sendKeys("OMR");
   
   WebElement ti=d.findElement(By.name("time"));
   ti.sendKeys("10.00AM");
   
   WebElement comment=d.findElement(By.name("comments"));
   comment.sendKeys("I Want to study in greenstechnologys to get placed");
   Thread.sleep(3000);
  
   WebElement btn=d.findElement(By.name("submit"));
   btn.click();
   
   
   
   
   
   
   
   
}
}
