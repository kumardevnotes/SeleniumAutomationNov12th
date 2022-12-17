package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDemo {
	public static WebDriver driver;

	@Parameters({ "browser" })
	@BeforeMethod(alwaysRun = true)
	public void setUp(String browser) throws Exception {
		String rootFolder = System.getProperty("user.dir");
		
		switch (browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver", rootFolder + "//src//test//resources//msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(2000);
	}

	@Test(priority = 0, groups = { "Smoke"}, enabled = false)
	public void verifyHomePage() throws Exception {

		String pageTitleExpected = "Speak Languages — Learn a new language online";

		String pageTitleActual = driver.getTitle();

		Assert.assertEquals(pageTitleActual, pageTitleExpected, "Page title not matching.");
		System.out.println("Homepage loaded without issues");
	}

	@Test(priority = 1, groups = { "Regression" }, enabled = false)
	public void verifyLoginLaunch() throws Exception {
		String pageTitleExpected = "Log in to Speak Languages";

		driver.findElement(By.xpath("//a[.='Log in']")).click();
		Thread.sleep(1000);

		String pageTitleActual = driver.getTitle();

		Assert.assertEquals(pageTitleActual, pageTitleExpected, "Page title not matching.");
		System.out.println("Login page loaded without issues");
	}

	@Test(priority = 2, groups = { "Smoke" })
	public void verifySignupLaunch() throws Exception {
		String pageTitleExpected = "Sign up to Speak Languages";

		driver.findElement(By.xpath("//a[.='Sign up']")).click();
		Thread.sleep(1000);

		String pageTitleActual = driver.getTitle();

		Assert.assertEquals(pageTitleActual, pageTitleExpected, "Page title not matching.");
		System.out.println("Signup page loaded without issues");
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
