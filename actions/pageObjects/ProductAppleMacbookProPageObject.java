package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class ProductAppleMacbookProPageObject extends AbstractPage{
	WebDriver driver;

	public ProductAppleMacbookProPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public ProductNotebooksPageObject backToPage() {
		backToPage(driver);
		return PageGeneratorManager.getProductNotebooksPage(driver);
	}
}
