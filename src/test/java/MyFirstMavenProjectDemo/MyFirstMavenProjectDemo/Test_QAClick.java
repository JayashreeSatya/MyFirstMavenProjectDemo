
//author name:Jayashree	
package MyFirstMavenProjectDemo.MyFirstMavenProjectDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test_QAClick {
	WebDriver driver;

	@BeforeClass
	public void PreCondtion() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayashree\\Downloads\\Video\\ChromeServer\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, Login_QAClick.class);
		
	}

	@Test(priority=1)
	public void test() {
		Login_QAClick login=new Login_QAClick();
		login.PracticePage();
	}
	@Test(priority=2)
	public void Test()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}

//	@AfterClass()
//	public void teradown() {
//		driver.quit();
//	}

}
