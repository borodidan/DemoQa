package pages;

import org.openqa.selenium.By;


public class Tabs3Page extends BasePage{
	
	public String tab() {
	
	driver.findElement(By.xpath(".//*[@id='menu-item-66']/a")).click();
	System.out.println("Am dat click pe butonul demo");
	
	driver.findElement(By.xpath(".//*[@id='menu-item-153']/a")).click();
	System.out.println("Am dat click pe butonul tools");
	driver.findElement(By.id("ui-id-3")).click();
	System.out.println("Am dat click pe butonul tools 3");
	
	
	String a = driver.findElement(By.id("ui-id-3")).getText();
	System.out.println("am luat");
	System.out.println(a);
	return a;
	
	
	
	}
	

}
