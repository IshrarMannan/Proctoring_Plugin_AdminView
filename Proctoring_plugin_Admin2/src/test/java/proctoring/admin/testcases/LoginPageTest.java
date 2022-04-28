package proctoring.admin.testcases;

import java.awt.AWTException;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import proctoring.admin.base.TestBase;
import proctoring.admin.pages.LoginPage;


public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;

	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
		public void setUp(){

		loginPage = new LoginPage();	
	}

	
	@Test(priority=1)
	public void loginTest() throws InterruptedException{
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=2)
	public void sidebar() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnSideBar();
	}
	
	@Test(priority=3)
	public void siteHome() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnSiteHome();
	}
	
	@Test(priority=4)
	public void course() throws InterruptedException, AWTException{
		Thread.sleep(2000);
		loginPage.clickOnCourse();
	}
	@Test(priority=5)
	public void quiz() throws InterruptedException, AWTException{
		Thread.sleep(2000);
		loginPage.clickOnQuiz();
	}
	
	@Test(priority=6)
	public void viewReport() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnReport();
	}
	
	@Test(priority=7)
	public void folder() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnFolder();
	}
	
/*	@Test(priority=8)
	public void delete() throws InterruptedException, AWTException{
		Thread.sleep(3000);
		loginPage.clickOnDelete();
	}*/
	
	@Test(priority=9)
	public void summary() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnSummary();
	}
	

	

}





