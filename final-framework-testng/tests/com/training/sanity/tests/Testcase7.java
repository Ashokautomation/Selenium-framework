package com.training.sanity.tests;

import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.training.generics.ScreenShot;
import com.training.pom.Testcase7POM;
import com.training.pom.LoginPagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Testcase7{

	private WebDriver driver;
	private String baseUrl;
	private LoginPagePOM testcasesPOM;
	private Testcase7POM testcase7POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		testcasesPOM = new LoginPagePOM(driver); 
		testcase7POM = new Testcase7POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		
		testcasesPOM.clickLoginBtn("testelearn","testelearn"); 
		
		testcase7POM.clickLink();
		
		System.out.println("Course page is displayed");
		//Select dropdown = new Select(dropdownbutton);
		
		testcase7POM.enterTitle("selenium5", "sel4");
	
		
		
		screenShot.captureScreenShot("First");
		
		System.out.println("");
		
		
		
	}
	
	
			
			
		
	}

