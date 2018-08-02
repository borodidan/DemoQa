package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.BasePage;



public class BaseTest extends BasePage{
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeClass
	public void initia() {
		initSetp();
		
	}
	
	@AfterClass
	public void tearDown()
	{
		tearDownp();
	}
	

}
