package com.training.pom;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import java.util.List;


public class Testcases8POM {
	private WebDriver driver; 
	
	public Testcases8POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'selenium50')]")
	private WebElement coursename; 
	
	@FindBy(linkText="Course description")
	private WebElement courseDescription;
	
	@FindBy(xpath="//section[@id='cm-content']//div[@class='row']//a[1]//img[1]")
	private WebElement descriptionicon;
	
	@FindBy(id="course_description_title")
	private WebElement titleinput;
	
	@FindBy(xpath="//html//body")
	private WebElement contentinput;
	
	@FindBy(xpath="//button[@id='course_description_submit']")
	private WebElement savebutton;
	
	
	
	public void clickLink() {
		//driver.findElement(By.linkText("Create a course")).click();
			this.coursename.click(); 
			//this.linkText1.click();
			
	}
	
	public void courseContent(String titleinput, String contentinput) {
		
		this.coursename.click();
		this.courseDescription.click();
		this.descriptionicon.click();
			this.titleinput.sendKeys(titleinput);
			this.contentinput.sendKeys(contentinput);
			this.savebutton.click();
		
	}
}
