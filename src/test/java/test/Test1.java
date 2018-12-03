package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		driver = new FirefoxDriver();
		driver.get("https://www.javabykiran.com/");
		
	}
	
	@Test
	public void pageTitleTest()
	{
		 String actual =driver.getTitle();
		assertEquals(actual , "Java Classes in Pune | Selenium Training | Python Courses in pune");
	}
	
	@AfterMethod
	public void close() {
		
		driver.quit();
	}

}
