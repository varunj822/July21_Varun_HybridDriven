package com.technocredits.orghrm.testScripts;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.technocredits.orghrm.pages.DashboardPage;
import com.tehnocredits.orghrm.base.PredefinedActions;

public class DashboardTest extends LoginTest {

	@BeforeMethod
	public void setup() {
		PredefinedActions.start();
	}

	@Test
	public void verfiyWidgetsTest() {
		System.out.println("VERFIY - Dashboard page title should be Dashboard");
		DashboardPage dashboardPage = new DashboardPage();
		String expectedDashboardPageHeaderTitle = "Dashboard";
		String actualDashboardPageHeaderTitle = dashboardPage.getPageHeaderTitle();
		softAssert.assertEquals(expectedDashboardPageHeaderTitle, actualDashboardPageHeaderTitle);

		String expectedDashboardPageTitle = "Dashboard";
		String actualDashboardPageTitle = dashboardPage.getPageTitle();
		softAssert.assertEquals(expectedDashboardPageTitle, actualDashboardPageTitle);

		System.out.println("Verify that total 12 widgets should be there");
		int countOfTotalWidget = dashboardPage.getCountOfTotalWidgets();
		softAssert.assertEquals(countOfTotalWidget, 12);
		softAssert.assertAll();

		System.out.println("Get all the widgets name from the Dashboard");
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("Quick Access");
		expectedList.add("Buzz Latest Posts");
		expectedList.add("Employee Job Details");
		expectedList.add("My Actions");
		expectedList.add("Headcount by Location");
		expectedList.add("Employees on Leave Today");
		expectedList.add("Time At Work");
		expectedList.add("Performance Quick Feedback");
		expectedList.add("Annual basic payment by Location");
		expectedList.add("Latest Documents");
		expectedList.add("Latest News");

		List<String> actualWidgetList = new ArrayList<String>();
		System.out.println("Verify widget names fetched from the dashboard");
		Assert.assertTrue(actualWidgetList.equals(expectedList));
	}
	
	@AfterClass
	public void tearDown() {
		super.closeBrowser();
	}
}
