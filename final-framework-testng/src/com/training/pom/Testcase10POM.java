package com.training.pom;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import java.util.List;


public class Testcase10POM {
	private WebDriver driver; 
	
	public Testcase10POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Course catalog")
	private WebElement coursecatalog; 
	
	@FindBy(xpath="//input[@name='search_term']")
	private WebElement search;
	
	
	@FindBy(xpath="//div[@class='input-group']//button[1]")
	private WebElement searchbutton;
	
	
	
	public void search(String searchinput) {
		
		this.coursecatalog.click();
		this.search.sendKeys(searchinput);
		this.searchbutton.click();
			
		
	}
}
