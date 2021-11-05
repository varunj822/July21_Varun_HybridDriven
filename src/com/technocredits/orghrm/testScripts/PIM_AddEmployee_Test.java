package com.technocredits.orghrm.testScripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.technocredits.orghrm.pages.MenuPages;
import com.technocredits.orghrm.pages.PIM_AddEmployee_Page;

public class PIM_AddEmployee_Test extends TestBase {
	private MenuPages menuPages;

	@BeforeMethod
	public void setUp() {
		menuPages = super.setup();
	}

	@Test
	public void verifyAddEmployeeTest() {
		menuPages.navigateTo("PIM->Add Employee");
		PIM_AddEmployee_Page pim_AddEmployee_Page = new PIM_AddEmployee_Page();
		pim_AddEmployee_Page.setEmpFirstName("Varun").setEmpMiddleName("26").setEmpLastName("Joshi").setEmployeeLocation("Australian Regional HQ")
		.clickOnNext().setHobbies("Anchoring").clickOnNext().setWorkShift("Twilight").setEffectiveFrom("26").setRegion("Region-1").setFTE("0.5")
		.setTemporaryDepartment("Sub unit-2").saveEmploymentDetails();
	}

	public void close() {
		super.close();
	}
}
