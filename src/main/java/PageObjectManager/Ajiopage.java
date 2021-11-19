package PageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ajiopage {

	public Ajiopage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver driver;
	

	@FindBy (xpath = "//a[contains(text(),'HOME AND KITCHEN')]")
	private WebElement kitchen;
	
	@FindBy (xpath = "//div[contains(text(),'Reversible King-Size Comforter')]")
	private WebElement product;
	
	@FindBy (xpath = "//span[contains(text(),'ADD TO BAG')]")
	private WebElement addtobag;
	
	@FindBy (xpath = "//span[contains(text(),'GO TO BAG')]")
	private WebElement gotobag;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getKitchen() {
		return kitchen;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getAddtobag() {
		return addtobag;
	}

	public WebElement getGotobag() {
		return gotobag;
	}

}
