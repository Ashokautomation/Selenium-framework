package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
	private WebDriver driver; 
	
	public LoginPagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	/*
	 * public void sendUserName(String userName) { this.userName.clear();
	 * this.userName.sendKeys(userName); }
	 * 
	 * public void sendPassword(String password) { this.password.clear();
	 * this.password.sendKeys(password); }
	 */
	
	public  void clickLoginBtn(String userName, String password) {
		this.userName.clear();
		this.userName.sendKeys(userName);
		this.password.clear(); 
		this.password.sendKeys(password); 
	
			this.loginBtn.click(); 
	}
}
