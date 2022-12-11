package com.selenium.demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class SeleniumDemoDropdowns {

	public static ChromeDriver driver;
	

	public static void main(String[] args) throws Exception {
		Faker fake = new Faker();
		
		System.out.println("Launch the selenium script");
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://speaklanguages.com");
		driver.findElement(By.linkText("Sign up")).click();
		
		String firstName = fake.name().firstName();
		String lastName = fake.name().lastName();
		String emailAddress = fake.internet().emailAddress();
		
		
		driver.findElement(By.id("first_name")).sendKeys(firstName);
		driver.findElement(By.name("last_name")).sendKeys(lastName);
		driver.findElement(By.name("email")).sendKeys(emailAddress);
		driver.findElement(By.name("password")).sendKeys("pwdPWD4122");
		
		Select genderDD = new Select(driver.findElement(By.name("sex")));
		genderDD.selectByIndex(1);
		//Or
		//genderDD.selectByValue("Female");
		//Or
		//genderDD.selectByVisibleText("Male");
		
		Select dayDD = new Select(driver.findElement(By.name("dob_day")));
		dayDD.selectByIndex(1);
		
		Select monthDD = new Select(driver.findElement(By.name("dob_month")));
		monthDD.selectByIndex(4);
		
		Select yearDD = new Select(driver.findElement(By.name("dob_year")));
		yearDD.selectByIndex(3);
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		Thread.sleep(6000);
		
		boolean isSignupSuccessMsgDisplyed  = driver.findElement(By.xpath("//h1[.='Thank you — now activate your account!']")).isDisplayed();
		
		if(isSignupSuccessMsgDisplyed) { // true && true && true --> false
			System.out.println("Signup completed without issues");
		}
		else{
			System.out.println("failed to Signup");
		}
		
		//Capturing screenshot in Selenium
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination  =  new File(rootFolder+"//Screenshots//randomImage_"+ fake.number().randomDigit()+".png");
		FileHandler.copy(src, destination);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("logo")).click();
		
		JavascriptExecutor jse =  (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		Thread.sleep(6000);
		
        boolean footerLinkDisplayed  = driver.findElement(By.linkText("Privacy policy")).isDisplayed();
        

		if(footerLinkDisplayed) { // true && true && true --> false
			System.out.println("footer section loaded without issues");
		}
		else{
			System.out.println("failed to load footer section");
		}
		
		WebElement langDD = driver.findElement(By.id("language_menu"));
		
		Actions action = new Actions(driver);
		action.moveToElement(langDD).build().perform();
		Thread.sleep(4000);
		
		
		System.out.println("Selenium script finished");
		driver.quit();
	}


}
