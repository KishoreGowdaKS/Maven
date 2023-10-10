package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addnewbutton;
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newcustomer;
	@FindBy(xpath = "//input[contains(@class,'inputFieldWithPlaceholder new')]")
	private WebElement name;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement discription;
	@FindBy(xpath = "//div[text()='- Select Customer -']")
	private WebElement SelectCustomer;
	@FindBy(xpath = "//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement company;
	@FindBy(xpath = "//div[text()='Create Customer' ]")
	private WebElement createCustomer;
	@FindBy(xpath = "//input[@placeholder='Start typing name ...']")
	private WebElement searchBox;
	@FindBy(className  = "highlightToken")
	private WebElement highlightedName;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='editButton']")
	private WebElement settingsBtn;
	@FindBy (xpath = "//div[@class='taskManagement_customerPanel']//div[text()='ACTIONS']")
	private WebElement actionBtn;
	@FindBy(xpath = "//div[@class='taskManagement_customerPanel']//div[text()='Delete']")
	private WebElement deleteBtn;
	@FindBy(xpath  = "//span[text()='Delete permanently']")
	private WebElement deletePermanently;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbutton() {
		return addnewbutton;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getDiscription() {
		return discription;
	}

	public WebElement getSelectCustomer() {
		return SelectCustomer;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getCreateCustomer() {
		return createCustomer;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getHighlightedName() {
		return highlightedName;
	}

	public WebElement getSettingsBtn() {
		return settingsBtn;
	}

	public WebElement getActionBtn() {
		return actionBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getDeletePermanently() {
		return deletePermanently;
	}
}
