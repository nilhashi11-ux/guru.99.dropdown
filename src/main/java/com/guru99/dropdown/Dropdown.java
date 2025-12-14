package com.guru99.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
 
	WebDriver  driver ;
	void getLogin() throws InterruptedException 
	{
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@name='country']"));
		
		Select obj = new Select(dropdown);
		
		  obj.selectByIndex(22);
		  Thread.sleep(3000);
		  obj.selectByValue("CHINA");
		  Thread.sleep(3000);

		  obj.selectByVisibleText("UNITED STATES");
		  
	}
	
	public static void main(String[] args) throws InterruptedException {
		Dropdown obj = new Dropdown();
		obj.getLogin();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
