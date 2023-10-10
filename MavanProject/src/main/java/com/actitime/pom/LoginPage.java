package com.actitime.pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "username")
	private WebElement untext;
	@FindBy(name = "pwd")
	private WebElement pwdtxt;
	@FindBy(partialLinkText = "Login")
	private WebElement login;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void action(String un, String pwd) {
		untext.sendKeys(un);
		pwdtxt.sendKeys(pwd);
		login.click();

	}

}
