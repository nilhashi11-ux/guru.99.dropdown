package com.test.gurumenubar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenunameGuru {
    WebDriver driver;
   
	void get_xpath_allmenu() {
	
		WebDriver driver = new ChromeDriver();			
	    driver.manage().window().maximize();	
	    driver.get("https://demo.guru99.com/test/newtours/");
		List<WebElement> menubar=driver.findElements(By.xpath("//*[@class='collapse navbar-collapse']//a"));//1of12
		System.out.println(menubar.size());//end point/total count
	
		for(int i=0;i<menubar.size();i++) 
		{
		System.out.println(menubar.get(i).getText());
		}	
	}
	

	public static void main(String[] args) {

		MenunameGuru obj = new MenunameGuru ();
		obj.get_xpath_allmenu();
			
		
	}
	
}
