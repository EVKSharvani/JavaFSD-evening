package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OracleRegistration {


	
	public static void main(String[] args) {
		//step:1 Creating System Environment
		System.setProperty("webdriver.chrome.driver","D:\\JavaFSD1\\Phase-5\\chromedriver_win32\\chromedriver.exe");
		
		//step:2 initializing chrome
		WebDriver driver= new ChromeDriver();
		
		//step:3 giving a base url
	driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");

		
		
	WebElement password= driver.findElement(By.id("sView1:r1:0:password::content"));
	password.sendKeys("Sharvani@123");
	
	WebElement email=driver.findElement(By.id("sView1:r1:0:email::content"));
		email.sendKeys("sharvani@gmail.com");
		
		
		WebElement password1= driver.findElement(By.id("sView1:r1:0:password::content"));
		password1.sendKeys("Sharvani@123");
		
		WebElement repassword= driver.findElement(By.id("sView1:r1:0:retypePassword::content"));
		repassword.sendKeys("Sharvani@123");
		
        Select dropCountry= new Select(driver.findElement(By.name("sView1:r1:0:country")));
		dropCountry.selectByVisibleText("India");
		
		WebElement fname= driver.findElement(By.id("sView1:r1:0:firstName::content"));
		fname.sendKeys("Sharvani");
		
		WebElement lname= driver.findElement(By.id("sView1:r1:0:lastName::content"));
		lname.sendKeys("Emandi");
		
		WebElement job= driver.findElement(By.id("sView1:r1:0:jobTitle::content"));
		job.sendKeys("Student");
		
		WebElement mobile= driver.findElement(By.id("sView1:r1:0:workPhone::content"));
		mobile.sendKeys("9672356809");
		
		WebElement company= driver.findElement(By.id("sView1:r1:0:companyName::content"));
		company.sendKeys("ANITS");
		
		WebElement address1= driver.findElement(By.id("sView1:r1:0:address1::content"));
		address1.sendKeys("3-178/1,xxx plaza, sector-11 ");
		
		WebElement address2= driver.findElement(By.id("sView1:r1:0:address2::content"));
		address2.sendKeys("Behind Petrol bank, MVP ");
		
		WebElement city= driver.findElement(By.id("sView1:r1:0:city::content"));
		city.sendKeys("Vishakapatnam");
		
        Select dropState= new Select(driver.findElement(By.name("sView1:r1:0:state")));
        dropState.selectByIndex(2);

		WebElement pincode= driver.findElement(By.id("sView1:r1:0:postalCode::content"));
		pincode.sendKeys("530016");
		
		
		
		
		
	}

}