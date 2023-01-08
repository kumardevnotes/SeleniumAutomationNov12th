package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemoRepeatTestCase {
	// @Test (invocationCount = 100, timeOut = 10000) //10k ms - 10 seconds

	@DataProvider(name = "myUserDetails")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "user1@gmail.com", "pwd#1122" },
	   { "user2@gmail.com", "Iliketesting1133"},
	 };
	}

	@Test (dataProvider = "myUserDetails")
	public void testCase1(String emailAddress, String pwd) throws Exception {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("email_input")).sendKeys(emailAddress);
		driver.findElement(By.id("password_input")).sendKeys(pwd);
		driver.findElement(By.id("login_button")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
