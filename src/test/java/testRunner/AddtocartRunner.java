package testRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.ajio.config.ConfigurationReader;
import com.ajio.config.FileReaderManager;

import BaseClass.Base_Class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications = true,
		features = "C:\\Users\\Admin\\eclipse-workspace\\org.com.ajio\\src\\test\\java\\feature",
		glue= {"com\\ajio\\stepdefinition"},
		plugin = {"pretty","html:test-output" , "json:jason/cucumber.json" }
		,monochrome = true,
		dryRun = false
		)
public class AddtocartRunner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable {
		FileReaderManager.getInstanceFR().getInstance();
		String browser = ConfigurationReader.getbrowser();
		driver = Base_Class.getBrowser(browser);
	}
	
	@AfterClass
	public static void teardown() {
		driver.quit();
	}
}
