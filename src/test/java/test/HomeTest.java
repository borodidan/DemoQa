package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomeTest extends BaseTest{
	
	
	
	@Test
	public void home()
	{
		System.out.println("home page test");
		navigate("http://demoqa.com/");
		HomePage p = new HomePage();
		p.homeP();
		
		Assert.assertEquals(p.homeP(), "http://demoqa.com/");
		
		
	}
	
	

}
