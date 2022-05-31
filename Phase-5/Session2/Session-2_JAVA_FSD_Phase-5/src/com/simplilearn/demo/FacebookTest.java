package com.simplilearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {
	public static void main(String[] args) {
		
		//step:1 Declare path of driver
		
		String path="D:\\JavaFSD1\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		
		//step:2 initiate the driver
		
		WebDriver driver= new ChromeDriver();
		
		//step:3 base url
		
		String base_url="https://www.facebook.com/";
		
		
		//step:4 launch the facebook
		
		driver.get(base_url);
		
	}

}