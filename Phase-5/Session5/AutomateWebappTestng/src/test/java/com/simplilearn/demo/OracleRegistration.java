package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OracleRegistration {
  
	WebDriver driver= null;
	
	@Test(groups="Chrome")
	public void launchChrome() {
		
		//step:1 Declare path of driver
		System.setProperty("webdriver.chrome.driver", "D:\\JavaFSD1\\Phase-5\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test(groups = "Chrome",dependsOnMethods = {"launchChrome"})
	public void loginwithChrome() {
		
		driver.findElement(By.id("sView1:r1:0:password::content")).sendKeys("Sharvani@123");
		driver.findElement(By.id("sView1:r1:0:email::content")).sendKeys("sharvani@gmail.com");
		driver.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys("Sharvani@123");
		driver.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys("Sharvani");
		driver.findElement(By.id("sView1:r1:0:lastName::content")).sendKeys("Emandi");
		driver.findElement(By.id("sView1:r1:0:jobTitle::content")).sendKeys("Student");
		driver.findElement(By.id("sView1:r1:0:workPhone::content")).sendKeys("9672356809");
		driver.findElement(By.id("sView1:r1:0:companyName::content")).sendKeys("ANITS");
		driver.findElement(By.id("sView1:r1:0:address1::content")).sendKeys("3-178/1,xxx plaza, sector-11 ");
		driver.findElement(By.id("sView1:r1:0:address2::content")).sendKeys("Behind Petrol bank, MVP ");
		driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys("Vishakapatnam ");
		driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys("530016 ");
		
		
		 
		
	}
	
	
	
	@Test(groups="firefox")
	public void launchFirefox() {
		
		//step:1 Declare path of driver
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_latest\\chromedriver.exe");
		System.setProperty("webdriver.geco.driver", "firefox_driver_path");
		driver= new FirefoxDriver();
		 
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test(groups = "firefox",dependsOnMethods = {"launchFirefox"})
	public void loginwithFirefox() {
		
		driver.findElement(By.id("sView1:r1:0:password::content")).sendKeys("Sharvani@123");
		driver.findElement(By.id("sView1:r1:0:email::content")).sendKeys("sharvani@gmail.com");
		driver.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys("Sharvani@123");
		driver.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys("Sharvani");
		driver.findElement(By.id("sView1:r1:0:lastName::content")).sendKeys("Emandi");
		driver.findElement(By.id("sView1:r1:0:jobTitle::content")).sendKeys("Student");
		driver.findElement(By.id("sView1:r1:0:workPhone::content")).sendKeys("9672356809");
		driver.findElement(By.id("sView1:r1:0:companyName::content")).sendKeys("ANITS");
		driver.findElement(By.id("sView1:r1:0:address1::content")).sendKeys("3-178/1,xxx plaza, sector-11 ");
		driver.findElement(By.id("sView1:r1:0:address2::content")).sendKeys("Behind Petrol bank, MVP ");
		driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys("Vishakapatnam ");
		driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys("530016 ");
		
		
		 
		
	}
}