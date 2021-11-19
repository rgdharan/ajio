package PageObjectManager;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AjioPage1 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\org.com.ajio\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.ajio.com/");

		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.titleContains(
				"Ajio.com | Shop Online the Latest Fashion in apparels brands in India | Reliance Ajio.com"));

		WebElement kitchen = driver.findElement(By.xpath("//a[contains(text(),'HOME AND KITCHEN')]"));

		kitchen.click();

		WebElement item = driver.findElement(By.xpath("//div[contains(text(),'Lushomes')]"));

		item.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String string : windowHandles) {
			System.out.println(string);
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}

		String title = "Buy Multi Towels & Bath Robes for Home & Kitchen by Lushomes Online | Ajio.com";
		for (String string : windowHandles) {
			if (driver.switchTo().window(string).getTitle().equals(title)) {
				break;
			}
		}
		
		WebElement addtobag = driver.findElement(By.xpath("//span[contains(text(),'ADD TO BAG')]"));
		
		addtobag.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'GO TO BAG')]")));

		WebElement gotobag = driver.findElement(By.xpath("//span[contains(text(),'GO TO BAG')]"));
		
		gotobag.click();

	}

	
}
