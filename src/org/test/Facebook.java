package org.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SelemniumLocators\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.facebook.com/");
d.manage().window().maximize();
WebElement user=d.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[1]"));
user.sendKeys("sivag918@gmail.com");

WebElement pas=d.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[2]"));
pas.sendKeys("08091990");

WebElement btn=d.findElement(By.xpath("//label[@class='login_form_login_button uiButton uiButtonConfirm']"));
btn.click();
}
}
