package MyFirstMavenProjectDemo.MyFirstMavenProjectDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Login_QAClick {
	static WebDriver driver;
	@FindBy(xpath = "//input[@type='radio']")
	static List<WebElement> l1;

	@FindBy(xpath = "//input[@placeholder='Type to Select Countries']")
	static WebElement SelectCountries;

	@FindBy(id = "dropdown-class-example")
	static WebElement DDL;

	@FindBy(xpath = "//input[@type='checkbox']")
	static List<WebElement> l2;

	public void Login_QAClick() {
		this.driver = driver;
	}

	public static void RedioButton1(int i)
	{
		
		for( i=0;i<l1.size();i++)
		{
			l1.get(i).click();
		}
	}
	public static  void Checkbox(int j)
	{
		
		for(j=0;j<l2.size();j++)
		{
			l2.get(j).click();
		}
	}
	

	public static void Dropdown() {
		Select sct = new Select(DDL);
		sct.selectByVisibleText("Option2");

	}

	public static void PracticePage() {
		RedioButton1(2);
		SelectCountries.sendKeys("INDIA");
		Dropdown();
		Checkbox(2);
		

	}

}
