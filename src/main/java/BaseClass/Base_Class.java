package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
	public static WebDriver driver;
	
	 	public static WebDriver getBrowser(String browser) {
	 		try {
				if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("//Driver//chromedriver.exe"));
					driver = new ChromeDriver();
				}
				
				else if (browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+("//Driver//geckodriver.exe"));
					driver = new FirefoxDriver();
				}
				else if(browser.equalsIgnoreCase("edge")) {
					System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+("//Driver//msedgedriver.exe"));
					driver = new EdgeDriver();
				}
				else {
					System.out.println("Invalid Browser");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	 		
	 		driver.manage().window().maximize();
	 		return driver;
	 		
	 	}
	 	
	 	public static void clear(WebElement element) {
	 		element.clear();
		}
	 	
	 	public static void getUrl(String url) {
	 		driver.get(url);
		}
	 	public static void webdriverwait() {
	 		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
	 		Boolean until = wait.until(ExpectedConditions.titleContains(""));
		}
	 	public static void sendkeys(WebElement element, String value) {
	 		element.sendKeys(value);
		}
	 	public static void click(WebElement element) {
	 	element.click();	
	 	}
	 	public static void selectindex(WebElement element, int value) {
	 		Select select = new Select(element);
	 		select.selectByIndex(value);
	 	}
	 	
	 	
}
