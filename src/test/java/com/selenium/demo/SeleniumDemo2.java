package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {

	public static ChromeDriver driver;

	public static void main(String[] args) throws Exception {
		System.out.println("Launch the selenium script");
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://speaklanguages.com");
		driver.findElement(By.linkText("Log in")).click();
		
		boolean isHeaderDisplayed  = driver.findElement(By.xpath("//h1[.='Log in to Speak Languages']")).isDisplayed();
		boolean isCheckboxSelected  = driver.findElement(By.id("keep_logged_in_input")).isSelected();
		boolean isButonenabled  = driver.findElement(By.id("login_button")).isEnabled();
		
		if(isHeaderDisplayed && !isCheckboxSelected && isButonenabled) { // true && true && true --> false
			System.out.println("Login page displayed without issues");
		}
		else{
			System.out.println("Login page not displayed and has issues");
		}
		
		Thread.sleep(2000);
		System.out.println("Selenium script finished");
		driver.quit();
	}


}
