package com.technocredits.orghrm.pages;

import java.util.List;

import org.openqa.selenium.By;

import com.tehnocredits.orghrm.base.PredefinedActions;

public class UserProfilePage extends PredefinedActions {

	public void clickOnUserDropdown() {
		driver.findElement(By.xpath("//a[@id='user-dropdown']")).click();
	}

	public List<String> getListOfAllUserDropDownOptions() {
		return getTextOfAllElements("//ul[@id='user_menu']/li/a");
	}

	public int getTotalAvailableOptions() {
		return getListOfAllUserDropDownOptions().size();
	}

	public void clickOnAboutButton() {
		driver.findElement(By.xpath("//ul[@id='user_menu']//a[text()='About']")).click();
	}

	public void clickOnSubMenu(String subMenu) {
		driver.findElement(By.xpath("//ul[@id='user_menu']//a[text()='" + subMenu + "']")).click();
	}

	public String getCmpNameFromPopup() {
		return driver.findElement(By.xpath("//div[@id='companyInfo']/div/div[1]/p")).getText();
	}

	public List<String> getMenuText() {
		return getTextOfAllElements("//div[@id='companyInfo']//p");

	}
}
