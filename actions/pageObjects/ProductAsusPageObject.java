package pageObjects;

import org.openqa.selenium.WebDriver;


import commons.AbstractPage;

public class ProductAsusPageObject extends AbstractPage{
	WebDriver driver;

	public ProductAsusPageObject(WebDriver driver) {
		this.driver = driver;
	}
	public ProductNotebooksPageObject backToPage() {
		backToPage(driver);
		return 	PageGeneratorManager.getProductNotebooksPage(driver);
	}
}
