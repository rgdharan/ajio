package com.ajio.stepdefinition;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ajio.config.ConfigurationReader;
import com.ajio.config.FileReaderManager;
import com.ajio.config.PageObjectManager;

import BaseClass.Base_Class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testRunner.AddtocartRunner;

public class AddtoCart extends Base_Class {

	public static WebDriver driver = AddtocartRunner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("user is already in AJIO page")
	public void user_is_already_in_ajio_page() throws Throwable {
		FileReaderManager.getInstanceFR().getInstance();
		String url = ConfigurationReader.geturl();
		getUrl(url);
	}

	@When("user mouse over and clicks on home and kitchen menu")
	public void user_mouse_over_and_clicks_on_home_and_kitchen_menu() {
		webdriverwait();
		click(pom.getinstanceAjiopage().getKitchen());
	}

	@Then("user selects any one product in the page")
	public void user_selects_any_one_product_in_the_page() throws Throwable {
		webdriverwait();
		click(pom.getinstanceAjiopage().getProduct());
	}

	@Then("user navigate to the product page")
	public void user_navigate_to_the_product_page() {
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
	}

	@Then("user clciks on add to bag button")
	public void user_clciks_on_add_to_bag_button() {
		WebElement addtobag = driver.findElement(By.xpath("//span[contains(text(),'ADD TO BAG')]"));
		addtobag.click();
	}

	@Then("user waits till add to bag changes into go to bag")
	public void user_waits_till_add_to_bag_changes_into_go_to_bag() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'GO TO BAG')]")));
	}

	@Then("user clicks on go to bag button")
	public void user_clicks_on_go_to_bag_button() {
		WebElement gotobag = driver.findElement(By.xpath("//span[contains(text(),'GO TO BAG')]"));
		gotobag.click();
	}

}
