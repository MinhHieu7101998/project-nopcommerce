package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.RecentlyViewedProductsPageUI;

public class RecentlyViewedProductsPageObject extends AbstractPage {
	WebDriver driver;

	public RecentlyViewedProductsPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isProductDisplayedByProductName(String productName) {
		waitToElementVisible(driver, RecentlyViewedProductsPageUI.DYNAMIC_PRODUCT_NAME, productName);
		return isElementDisplayed(driver, RecentlyViewedProductsPageUI.DYNAMIC_PRODUCT_NAME, productName);
	}

	public boolean isProductUndisplayedByProductName(String productName) {
		return isElementUndisplayed(driver, RecentlyViewedProductsPageUI.DYNAMIC_PRODUCT_NAME, productName);
	}

}
