package com.technocredits.orghrm.pages;

import org.openqa.selenium.By;

import com.tehnocredits.orghrm.base.PredefinedActions;

public class LoginPage extends PredefinedActions{
	
	public boolean isLogoDisplayed() {
		boolean isLogoDisplayed = driver.findElement(By.xpath("//img")).isDisplayed();
		return isLogoDisplayed;
	}
	
	public boolean isLoginPanelDisplayed() {
		boolean isLoginPanelDisplayed = driver.findElement(By.xpath("//div[@id='logInPanelHeading']")).isDisplayed();
		return isLoginPanelDisplayed;
	}
	
	public void enterLoginCredentials(String username, String password) {
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password);
	}
	
	public MenuPages clickOnLoginButton() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		return new MenuPages();
	}
	
	public String loginErrorMessage() {
		return driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
	}
}
