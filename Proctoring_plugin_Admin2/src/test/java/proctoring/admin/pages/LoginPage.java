package proctoring.admin.pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proctoring.admin.base.TestBase;

public class LoginPage extends TestBase {
	//	WebDriverWait wait = new WebDriverWait(driver,3);
	//Login
	@FindBy(className="login-btn")
	WebElement logIn;

	@FindBy(id="username")
	WebElement uname;

	@FindBy(id="password")
	WebElement pssword;

	@FindBy(id="loginbtn")
	WebElement loginBtn;

	@FindBy(xpath="//button[@id='sidebarBtn']")
	WebElement sideBar; 
	
	@FindBy(xpath="//span[contains(text(),'Site home')]")
	WebElement siteHome;

	@FindBy(xpath="//a[contains(text(),'Test_Proctoring_plugin')]")
	WebElement Proctoredcourse;
	
	@FindBy(xpath="//span[contains(text(),'Proctored_Quiz')]")
	WebElement proctoredQuiz;


	@FindBy(xpath="//button[contains(text(),'View proctoring report')]")
	WebElement viewReport;

	@FindBy(xpath="(//i[@class='icon fa fa-folder-o fa-fw '])[1]")
	WebElement folderButton;
	
	/* @FindBy(xpath="(//i[@class='icon fa fa-trash fa-fw '])[1]")
	WebElement deleteButton;*/

	@FindBy(xpath="//a[contains(text(),'Proctoring Summary Report')]")
	WebElement summarytButton;

	//Initializing the Page Objects:
	public LoginPage(){

		PageFactory.initElements(driver, this);
	}


	public void login(String em, String pwd) throws InterruptedException{
		logIn.click();

		Thread.sleep(3000);
		uname.sendKeys(em);

		Thread.sleep(3000);
		pssword.sendKeys(pwd);

		loginBtn.click();
	}
	
	public void clickOnSideBar() {
		sideBar.click();
	} 
	
	public void clickOnSiteHome() {
		siteHome.click();
	}

	public void clickOnCourse() throws AWTException, InterruptedException{
		Proctoredcourse.click();

	}
	
	public void clickOnQuiz() throws AWTException, InterruptedException{
		proctoredQuiz.click();
		Thread.sleep(2000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}
	public void clickOnReport() throws InterruptedException {

		viewReport.click();
		
	}

	public void clickOnFolder() throws InterruptedException {

		folderButton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}

/*	public void clickOnDelete() throws InterruptedException, AWTException {

		deleteButton.click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		
           
	}*/

	public void clickOnSummary() throws InterruptedException {

		summarytButton.click();
		Thread.sleep(3000);
           
	}
}
	
