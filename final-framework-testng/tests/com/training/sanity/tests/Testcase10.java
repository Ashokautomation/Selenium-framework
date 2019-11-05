package com.training.sanity.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPagePOM;
import com.training.pom.Testcase10POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Testcase10{

	private WebDriver driver;
	private String baseUrl;
	private LoginPagePOM testcasesPOM;
	private Testcase10POM testcase10POM;
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
		testcase10POM = new Testcase10POM(driver);
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
		 
		testcase10POM.search("selenium");
		System.out.println("search selenium");
		
		
		
		screenShot.captureScreenShot("First");
				
	}		
			
		
	}

