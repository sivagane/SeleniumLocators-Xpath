package org.test;

import java.awt.AWTException;
import java.awt.KeyEventDispatcher;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationTesting {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SeleniumLocators Xpath\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://demo.automationtesting.in/Register.html");
	d.manage().window().maximize();
	
	WebElement fname=d.findElement(By.xpath("//input[@placeholder='First Name']"));
	fname.sendKeys("Siva");
	
	WebElement lname=d.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lname.sendKeys("Ganesh");
	
	WebElement addr=d.findElement(By.xpath("//textarea[@ng-model='Adress']"));
    addr.sendKeys("No83, Ambalathadayar Madam Street, Pudhucherry-605001.");
    
    WebElement email=d.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
    email.sendKeys("sivag918@gmail.com");
    
    WebElement phone=d.findElement(By.xpath("//input[@ng-model='Phone']"));
    phone.sendKeys("9750364952");
    
    WebElement gender=d.findElement(By.xpath("//input[@value='Male']"));
    gender.click();
    
    WebElement hobbies=d.findElement(By.xpath("//input[@value='Movies']"));
    hobbies.click();
    WebElement drdoC = d.findElement(By.id("msdd"));
    drdoC.click();
    WebElement lang = d.findElement(By.xpath("(//li[@class='ng-scope'])[8]"));
    lang.click();
    
    WebElement drdown =d.findElement(By.id("Skills"));
    Select dropdown=new Select(drdown);
    
    dropdown.selectByVisibleText("Java");
    
     
     WebElement drdo=d.findElement(By.id("countries"));
    
     Select dropdown1= new Select(drdo);
     dropdown1.selectByVisibleText("India");
    
     WebElement Coun = d.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
    Coun.click();
    
    WebElement CoName = d.findElement(By.xpath("//input[@class='select2-search__field']"));
    CoName.sendKeys("India");
    
    
    WebElement drdo2=d.findElement(By.id("yearbox"));
    Select dropdown3=new Select(drdo2);
    
    dropdown3.selectByVisibleText("1990");
    
    WebElement drdo3=d.findElement(By.xpath("//select[@placeholder='Month']"));
    Select dropdown4=new Select(drdo3);
    
    dropdown4.selectByVisibleText("September");
    
    WebElement drdo4=d.findElement(By.id("daybox"));
    Select dropdown5=new Select(drdo4);
    
    dropdown5.selectByVisibleText("8");
    
    WebElement pass=d.findElement(By.id("firstpassword"));
    pass.sendKeys("Siga0809");
    
    WebElement secpass=d.findElement(By.id("secondpassword"));
    secpass.sendKeys("Siga0809");
    
    WebElement btn=d.findElement(By.id("submitbtn"));
    btn.click();
}
}
