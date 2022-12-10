package com.selenium.demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Launch the selenium script");
		
        String rootFolder = System.getProperty("user.dir");
		
		//Need to setProperty with driver file, before you run the script
		System.setProperty("webdriver.chrome.driver", rootFolder+"//src//test//resources//chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		
		driver.quit();
		
		System.out.println("Selenium script finished");
	}

}
