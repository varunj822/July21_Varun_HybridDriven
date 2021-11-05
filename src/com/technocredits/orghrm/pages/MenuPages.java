package com.technocredits.orghrm.pages;

import org.openqa.selenium.By;

import com.tehnocredits.orghrm.base.PredefinedActions;

public class MenuPages extends PredefinedActions {
	
	public void navigateTo(String menu) {
		String[] arr = menu.split("->");
		for (String item : arr) {
			driver.findElement(By.xpath("//span[text()='" + item + "']")).click();
		}
	}
}
