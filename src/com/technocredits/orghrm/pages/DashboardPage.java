package com.technocredits.orghrm.pages;

import java.util.List;

import org.openqa.selenium.By;

import com.tehnocredits.orghrm.base.PredefinedActions;

public class DashboardPage extends PredefinedActions {

	public String getPageHeaderTitle() {
		return driver.getTitle();
	}

	public String getPageTitle() {
		return driver.findElement(By.xpath("//li[@class='page-title']")).getText();
	}

	public int getCountOfTotalWidgets() {
		return driver.findElements(By.xpath("//div[@class='widget-header']")).size();
	}

	public List<String> getAllWidgetsText() {
		return getTextOfAllElements("//div[@class='widget-header']/span[2]");
	}

	public String getWidgetTextBasedOnIndex(int index) {
		List<String> widgetnameList = getAllWidgetsText();
		return widgetnameList.get(index);
	}
}
