package com.training.sanity.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.training.generics.ScreenShot;
import com.training.pom.Testcase7POM;
import com.training.pom.LoginPagePOM;
import com.training.pom.Testcases8POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Testcase8{

	private WebDriver driver;
	private String baseUrl;
	private LoginPagePOM testcasesPOM;
	private Testcases8POM testcase8POM;
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
		testcase8POM = new Testcases8POM(driver);
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
		 
		
		testcase8POM.courseContent("Selenium for Beginners", "Selenium for Beginners");
		
		
		screenShot.captureScreenShot("First");
				
	}		
			
		
	}

