package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

	

		public static WebDriver driver;
		public static WebDriverWait wait;


		public void initSetp() {
			System.out.println("Parrent BeforeClass");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver, 30);
		}



		public void tearDownp() {
			System.out.println("Parrent AfterClass");
			driver.close();
			if (driver != null) {
				driver.quit();
			}

		}
		
		public void navigate(String URL)
		{
			driver.navigate().to(URL);
			driver.manage().window().maximize();
			wait.until(ExpectedConditions.urlContains("http://demoqa.com/"));
		}

		
		public static void clickObject(String value_element,String type_by_element, Boolean mandatory_element) {
			By locator = null;
			if (type_by_element=="id") {		
				locator= By.id(value_element);
				// WebElement loc= driver.findElement(locator);
				}
			else if (type_by_element=="class") {
				locator= By.className(value_element);
				//return driver.findElement(By.className(value_element));
			}
			else if (type_by_element=="css") {		
				locator= By.cssSelector(value_element);
			}
			else if (type_by_element=="xpath") {		
				locator=By.xpath(value_element);
			}
			try {
				driver.findElement(locator).click();
				System.out.println("este");
			} catch (Exception e) {
				System.out.println("nu este");
			}
			//return null;
		}
		public static WebElement getWebElementBy(String selectorType, String selectorInfo, boolean selectorMandatory) {
			WebElement element = null;
			try {
				switch (selectorType) {
				case "id":
					element = driver.findElement(By.id(selectorInfo));
					break;
				case "className":
					element = driver.findElement(By.className(selectorInfo));
					break;
				case "xpath":
					element = driver.findElement(By.xpath(selectorInfo));
					break;
				case "name":
					element = driver.findElement(By.name(selectorInfo));
					break;
				case "cssSelector":
					element = driver.findElement(By.cssSelector(selectorInfo));
					break;
				}

			} catch (NoSuchElementException e) {
				if (selectorMandatory == true) {
					e.printStackTrace();
					driver.close();
					if (driver != null) {
						driver.quit();
						System.exit(1);
					}
				} else {
					e.printStackTrace();
				}
			}

			return element;
		}
		
		
		public static String extractTextFromWebElement(String selectorType, String selectorInfo,
				boolean selectorMandatory) {

			return getWebElementBy(selectorType, selectorInfo, selectorMandatory).getText();
		
		}
		
}
