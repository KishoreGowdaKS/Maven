package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

//@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
//		HomePage h = new HomePage(driver);
//		h.tasklist();
//		Thread.sleep(1000);
//		TaskListPage tsk = new TaskListPage(driver);
//		Thread.sleep(2000);
//		tsk.getAddnewbutton().click();
//		Thread.sleep(2000);
//		tsk.getNewcustomer().click();
//		Thread.sleep(2000);
//		FileLib f = new FileLib();
//		String cusName = f.readDataFromExcel("Sheet1", 1, 2);
//		String cusDesc = f.readDataFromExcel("Sheet1", 1, 3);
//		tsk.getName().sendKeys(cusName);
//		Thread.sleep(2000);
//		tsk.getDiscription().sendKeys(cusDesc);
//		Thread.sleep(2000);
//		tsk.getSelectCustomer().click();
//		Thread.sleep(2000);
//		tsk.getCompany().click();
//		Thread.sleep(2000);
//		tsk.getCreateCustomer().click();
//		Thread.sleep(2000);
		Reporter.log("createCustomer",true);
	}
//	@Test
//	public void deleteCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
//		HomePage h = new HomePage(driver);
//		h.tasklist();
//		TaskListPage tsk = new TaskListPage(driver);
//		FileLib f = new FileLib();
//		String cusName = f.readDataFromExcel("Sheet1", 1, 2);
//		tsk.getSearchBox().sendKeys(cusName);
//		Thread.sleep(2000);
//		tsk.getHighlightedName().click();
//		Thread.sleep(2000);
//		tsk.getSettingsBtn().click();
//		Thread.sleep(2000);
//		tsk.getActionBtn().click();
//		Thread.sleep(2000);
//		tsk.getDeleteBtn().click();
//		Thread.sleep(2000);
//		tsk.getDeletePermanently().click();
//		Thread.sleep(3000);
	}


