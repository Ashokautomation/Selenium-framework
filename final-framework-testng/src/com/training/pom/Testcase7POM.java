package com.training.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import java.util.List;


public class Testcase7POM {
	private WebDriver driver; 
	
	public Testcase7POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement linkText; 
	
		
	@FindBy(id="title")
	private WebElement courseNametitle;
	
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement advancedTab;
	
	@FindBy(xpath="//input[@id='add_course_wanted_code']")
	private WebElement coursecode;
	
	//@FindBy(xpath="//button[@class='btn btn-default dropdown-toggle']")
	//private WebElement dropdownbutton;
	
	
	@FindBy(xpath="//div[contains(text(),'none')]")
	private WebElement dropdownbutton;
	
	@FindBy(xpath="//div[contains(text(),'Automation04 (NL102904)')]")
	private WebElement categoryOption;
	
	@FindBy(xpath="//div[contains(text(),'English')]")
	private WebElement Languagedropdownbutton;
	
	//@FindBy(linkText="Create a course")
	//private WebElement linkText1;
	
	@FindBy(xpath="//button[@id='add_course_submit']")
	private WebElement createcourse;
		
	
	@FindBy(xpath="//div[@class='help-course']//em[@class='fa fa-file-text']")
	private WebElement introductionIcon;
	
	

	
	public void clickLink() {
		//driver.findElement(By.linkText("Create a course")).click();
			this.linkText.click(); 
			//this.linkText1.click();
			
	}
	
	public void enterTitle(String title, String coursecode) {
		//driver.findElement(By.linkText("Create a course")).click();
		this.courseNametitle.clear();
			this.courseNametitle.sendKeys(title);
			System.out.println("Title is entered");
			this.advancedTab.click();
			//this.coursecode.clear();
			
			//this.dropdown.getFirstSelectedOption();
			this.coursecode.sendKeys(coursecode);
			this.createcourse.click();
			this.Languagedropdownbutton.click();
		this.introductionIcon.click();
			//dropdownbutton.selectByValue("Selenium_test (PROJECT1)");
	}
}
