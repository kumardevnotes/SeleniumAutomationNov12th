package com.selenium.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static ChromeDriver driver;

	public static void main(String[] args) throws Exception {

		// Below method will launch chrome and launch the application
		// https://www.speaklanguages.com/

		
		System.out.println("Launch the selenium script");

		// To get the root folder
		String rootFolder = System.getProperty("user.dir");

		// Need to setProperty with driver file, before you run the script
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");

		driver = new ChromeDriver(); // it opens a chrome browser

		// maximize browser
		driver.manage().window().maximize();

		// launching my app as shown below
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		Thread.sleep(3000); // 3000ms == 3seconds


		// Click on sign in to enable the Alert box on the screen
		driver.findElement(By.name("proceed")).click();

		// Capture the Alert and then accept it (OK)
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// alert.dismiss();

		String rediffEmailWindow = driver.getWindowHandle();

		// Launching a new tab in the browser where there is already a tab opened with
		// rediff email
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://facebook.com");

		String facebookWindow = driver.getWindowHandle();

		driver.switchTo().window(rediffEmailWindow);
		

		driver.switchTo().window(facebookWindow);
		driver.switchTo().window(rediffEmailWindow);

		driver.switchTo().window(facebookWindow);
		driver.switchTo().window(rediffEmailWindow);

		driver.switchTo().window(facebookWindow);
		
		driver.close();
		

		/*
		 * launchChromeandLaunchApp("https://www.speaklanguages.com");
		 * 
		 * driver.findElement(By.xpath("//a[.='Log in']")).click(); Thread.sleep(2000);
		 * 
		 * driver.navigate().back(); Thread.sleep(2000);
		 * 
		 * driver.navigate().forward(); Thread.sleep(2000);
		 * 
		 * driver.navigate().refresh(); Thread.sleep(2000);
		 * 
		 * 
		 * 
		 * driver.findElement(By.name("email")).sendKeys("johnnitesh2@gmail.com");
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.id("password_input")).sendKeys("Testing@123");
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.id("login_button")).click();
		 * 
		 * Thread.sleep(4000);
		 * 
		 * //closing the browser finally
		 */
		driver.quit();
		
		System.out.println("Completed selenium script");
	}


}
