package com.actitime.generic;

import org.openqa.selenium.WebDriver;

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
