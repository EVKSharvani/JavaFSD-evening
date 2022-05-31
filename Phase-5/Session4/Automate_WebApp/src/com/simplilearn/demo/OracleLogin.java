package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleLogin {
public static void main(String[] args) {
		
		//step:1 Declare path of driver
		
		String path="D:\\JavaFSD1\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		
		//step:2 initiate the driver
		
		WebDriver driver= new ChromeDriver();
		
		//step:3 base url
		
		String base_url="https://login.oracle.com/mysso/signon.jsp";
		
		
		//step:4 launch the Oracle
		
		driver.get(base_url);
		
		
		//finding email
		WebElement uname= driver.findElement(By.id("sso_username"));
		System.out.println(uname.getAttribute("placeholder"));
		
		
		//finding password
		WebElement pass= driver.findElement(By.id("ssopassword"));
		System.out.println(pass.getAttribute("placeholder"));
		 
		
		//type email using sendkeys
		
		uname.sendKeys("sharvani@gmail.com");
		pass.sendKeys("Sharvani@123");
		
		//login  button
		WebElement login= driver.findElement(By.id("signin_button"));
		login.click();
		
	}


}
