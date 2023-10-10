package com.actitime.generic;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.beust.jcommander.Parameter;

public class BaseClass {
	public WebDriver driver;
//
//	@BeforeClass
//	public void openBrowser() throws IOException {
//		driver = new ChromeDriver();
////		if (browser.equals("chrome")) {
////			driver = new ChromeDriver();
////		} if (browser.equals("edge")) {
////			driver = new EdgeDriver();	
////		}
////		else if (browser.equals("firefox")) {
////			driver = new FirefoxDriver();
////		}
//		
//		FileLib f = new FileLib();
//		String url = f.readDataFromPropertyFile("url");
//		driver.get(url);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//
//		Reporter.log("open Browser", true);
//
//	}
//
//	@BeforeMethod
//	public void logIn() throws IOException {
//		LoginPage l = new LoginPage(driver);
//		FileLib f = new FileLib();
//		String un = f.readDataFromPropertyFile("username");
//		String pwd = f.readDataFromPropertyFile("password");
//		l.action(un, pwd);
//		Reporter.log("logIn", true);
//	}
//
//	@AfterMethod
//	public void logOut() {
//		HomePage h = new HomePage(driver);
//		h.logout();
//		Reporter.log("logOut", true);
//	}
//
//	@AfterClass
//	public void closeBrowser() {
//		driver.quit();
//		Reporter.log("closeBrowser", true);
//	}
}
