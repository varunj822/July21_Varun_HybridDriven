package com.technocredits.orghrm.testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.technocredits.orghrm.pages.LoginPage;
import com.tehnocredits.orghrm.base.PredefinedActions;

public class LoginTest {
	SoftAssert softAssert = new SoftAssert();
	@BeforeMethod
	public void setup() {
		PredefinedActions.start();
	}
	
	@Test
	public void loginTest() {
		LoginPage loginPage = new LoginPage();
		System.out.println("Verify that Logo should get displayed");
		boolean isLogoDisplayed = loginPage.isLogoDisplayed();
		softAssert.assertTrue(isLogoDisplayed, "Logo was not there on login page");
		
		System.out.println("Verify that Login panel should get displayed");
		boolean isLoginPanelDisplayed = loginPage.isLoginPanelDisplayed();
		softAssert.assertTrue(isLoginPanelDisplayed, "Login panel was not there on login page");
		
		System.out.println("Please enter the valid credentials");
		loginPage.enterLoginCredentials("Admin", "yVRuRA@70a");
		softAssert.assertAll();
		
		System.out.println("Please click on login button");
		loginPage.clickOnLoginButton();
	}
	
	@Test
	public void loginTestWithInvalidCredentials() {
		LoginPage loginPage = new LoginPage();
		System.out.println("Verify that Logo should get displayed");
		boolean isLogoDisplayed = loginPage.isLogoDisplayed();
		softAssert.assertTrue(isLogoDisplayed, "Logo was not there on login page");
		
		System.out.println("Verify that Login panel should get displayed");
		boolean isLoginPanelDisplayed = loginPage.isLoginPanelDisplayed();
		softAssert.assertTrue(isLoginPanelDisplayed, "Login panel was not there on login page");
		
		System.out.println("Please enter the valid credentials");
		loginPage.enterLoginCredentials("Admin", "");
		softAssert.assertAll();
		
		System.out.println("Please click on login button");
		loginPage.clickOnLoginButton();
		
		String expectedErrorMessage = "Password cannot be empty";
		String actualErrorMessage = loginPage.loginErrorMessage();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}
	
	@AfterMethod
	public void closeBrowser() {
		PredefinedActions.closeBrowser();
	}
}
