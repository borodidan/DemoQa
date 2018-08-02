package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Tabs3Page;

public class Tabs3Test extends BaseTest{

	
	
	@Test
	public void tabs()
	{
		
		System.out.println("home page test");
		navigate("http://demoqa.com/");
		String textinf = "Tab 3";
		
		Tabs3Page t = new Tabs3Page();
		System.out.println("a aparut");
		Assert.assertEquals(t.tab(),textinf);
		
		
		
		//Assert.assertEquals(t.tab(), "http://demoqa.com/tabs/");
		
		
	}
}
