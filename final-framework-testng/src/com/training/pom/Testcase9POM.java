package com.training.pom;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import java.util.List;


public class Testcase9POM {
	private WebDriver driver; 
	
	public Testcase9POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'selenium50')]")
	private WebElement coursename; 
	
	@FindBy(linkText="Users")
	private WebElement clickusers;
	
	@FindBy(linkText="Trainers")
	private WebElement clickTrainers;
	
	@FindBy(xpath="//input[@name='user[]']")
	private WebElement clickcheckbox;
	
	@FindBy(xpath="//button[@class='btn btn-default dropdown-toggle']")
	private WebElement dropdownbutton;
	
	@FindBy(linkText="Unsubscribe")
	private WebElement clickUnsubscribe;
	
	
	
	
	
	
	public void clickLink() {
		//driver.findElement(By.linkText("Create a course")).click();
			this.coursename.click(); 
			//this.linkText1.click();
			
	}
	
	public void Unsubscribe() {
		
		this.coursename.click();
		this.clickusers.click();
		this.clickTrainers.click();
			this.clickcheckbox.click();
			this.dropdownbutton.click();
			this.clickUnsubscribe.click();
			System.out.println("unsubscribe button is clicked");
		
	}
}
