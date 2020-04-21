package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Alert\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	WebElement btn1 = driver.findElement(By.xpath("(//button[contains(text(),'click ')])[1]"));
	btn1.click();
	
	Alert a=  driver.switchTo().alert();
	a.accept();
	WebElement btn2 = driver.findElement(By.xpath("(//a[contains(text(),'Alert ')])[2]"));
	btn2.click();
	
	WebElement btn2a = driver.findElement(By.xpath("(//button[contains(text(),'click ')])[2]"));  
	btn2a.click();
	
	Alert a1= driver.switchTo().alert();
	a1.dismiss();
	
	WebElement btn3 = driver.findElement(By.xpath("(//a[contains(text(),'Alert ')])[3]"));
	btn3.click();
	
	WebElement btn3a = driver.findElement(By.xpath("(//button[contains(text(),'click ')])[3]"));
	btn3a.click();
	
	Alert a2=driver.switchTo().alert();
	a2.sendKeys("enoch");
	a2.accept();
	
	}

}
