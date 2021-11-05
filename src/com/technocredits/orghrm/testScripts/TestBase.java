package com.technocredits.orghrm.testScripts;

import org.testng.asserts.SoftAssert;

import com.tehnocredits.orghrm.base.PredefinedActions;
import com.technocredits.orghrm.pages.LoginPage;
import com.technocredits.orghrm.pages.MenuPages;

public class TestBase {

	SoftAssert softAsset = new SoftAssert();

	public MenuPages setup() {
		System.out.println("STEP - Launch OrgHrm Application");
		PredefinedActions.start();
		LoginPage loginPage = new LoginPage();
		loginPage.enterLoginCredentials("Admin", "yVRuRA@70a");
		System.out.println("Click on Login button");
		return loginPage.clickOnLoginButton();
	}

	public void close() {
		PredefinedActions.closeBrowser();
	}
}
