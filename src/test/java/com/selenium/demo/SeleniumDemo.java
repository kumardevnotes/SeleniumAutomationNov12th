package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	
	public static ChromeDriver driver ;

	public static void main(String[] args) throws Exception {
		
		//Below method will launch chrome and launch the application https://www.speaklanguages.com/
		launchChromeandLaunchApp();
		
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("johnnitesh2@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password_input")).sendKeys("Testing@123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login_button")).click();
		
		Thread.sleep(4000);
		
		//closing the browser finally
		driver.quit();
	}

	public static void launchChromeandLaunchApp() throws Exception {
		System.out.println("Launch the selenium script");

		// To get the root folder
        String rootFolder = System.getProperty("user.dir");
		
		//Need to setProperty with driver file, before you run the script
		System.setProperty("webdriver.chrome.driver", rootFolder+"//src//test//resources//chromedriver.exe");
		
		driver = new ChromeDriver(); //it opens a chrome browser
		
		//maximize browser
		driver.manage().window().maximize();
		
		//launching my app as shown below
		driver.get("https://www.speaklanguages.com/");
		
		
		Thread.sleep(3000); //3000ms == 3seconds
		
	
		
		System.out.println("Selenium script finished");
	}

}
