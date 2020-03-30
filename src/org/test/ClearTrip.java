package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SeleniumLocators Xpath\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.cleartrip.com/trains");
	d.manage().window().maximize();
	
	WebElement from=d.findElement(By.id("from_station"));
	from.sendKeys("Pudhucherry");
	
	
	WebElement to=d.findElement(By.id("to_station"));
    to.sendKeys("Karur");
    WebElement tclass=d.findElement(By.id("trainClass"));
    Select dropdown =new Select (tclass);
    dropdown.selectByVisibleText("AC First Class (1A)");
    
   
   List<WebElement> allrows = d.findElements(By.tagName("tr"));
   int s = allrows.size();
   for(int i=0;i<s;i++) {
	   List<WebElement> alldata = d.findElements(By.tagName("td"));
	  
	   for(i=0;i<alldata.size();i++) {
		   WebElement eachdata = alldata.get(i);
		   String st = eachdata.getText();
		   if(st.equals("25")){
			   eachdata.click();
			   break;
		   }
	   }
   }
   
   WebElement tadult = d.findElement(By.id("train_adults"));  
   Select dropdown1= new Select(tadult);
   dropdown1.selectByIndex(6);
   
   WebElement tchild = d.findElement(By.id("train_children"));
   Select dropdown2= new Select(tchild);
   dropdown2.selectByIndex(1);
   
   WebElement tbtn = d.findElement(By.id("trainFormButton"));
   tbtn.click();
}
}
