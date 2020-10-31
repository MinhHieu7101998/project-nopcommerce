package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.ProductNotebooksPageUI;

public class ProductNotebooksPageObject extends AbstractPage {
	WebDriver driver;

	public ProductNotebooksPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void selectItemSortByDropdown(String itemValue) {
		waitToElementClickable(driver, ProductNotebooksPageUI.SORT_BY_DROPDOWN);
		selectItemInDropdown(driver, ProductNotebooksPageUI.SORT_BY_DROPDOWN, itemValue);
	}

	public String getProductTitleNameByIndex(String index) {
		waitToElementVisible(driver, ProductNotebooksPageUI.PRODUCT_TITLE_NAME_TEXT, index);
		return getElementText(driver, ProductNotebooksPageUI.PRODUCT_TITLE_NAME_TEXT, index);
	}

	public String getProductPriceByIndex(String index) {
		waitToElementVisible(driver, ProductNotebooksPageUI.PRODUCT_PRICE_TEXT, index);
		return getElementText(driver, ProductNotebooksPageUI.PRODUCT_PRICE_TEXT, index);
	}

	public void selectItemDisplayNumberProductDropdown(String itemValue) {
		waitToElementClickable(driver, ProductNotebooksPageUI.NUMBER_PRODUCT_DISPLAYED_PER_PAGE_DROPDOWN);
		selectItemInDropdown(driver, ProductNotebooksPageUI.NUMBER_PRODUCT_DISPLAYED_PER_PAGE_DROPDOWN, itemValue);
	}

	public boolean isProductUndisplayedByIndex(String index) {
		return isElementUndisplayed(driver, ProductNotebooksPageUI.PRODUCT_TITLE_NAME_TEXT, index);
	}

	public boolean isNextIconDisplayed() {
		waitToElementVisible(driver, ProductNotebooksPageUI.NEXT_ICON);
		return isElementDisplayed(driver, ProductNotebooksPageUI.NEXT_ICON);
	}

	public void clickToNextIcon() {
		waitToElementClickable(driver, ProductNotebooksPageUI.NEXT_ICON);
		clickToElement(driver, ProductNotebooksPageUI.NEXT_ICON);
	}

	public boolean isPreviousIconDisplayed() {
		waitToElementVisible(driver, ProductNotebooksPageUI.PREVIOUS_ICON);
		return isElementDisplayed(driver, ProductNotebooksPageUI.PREVIOUS_ICON);
	}

	public void clickToPreviousIcon() {
		waitToElementClickable(driver, ProductNotebooksPageUI.PREVIOUS_ICON);
		clickToElement(driver, ProductNotebooksPageUI.PREVIOUS_ICON);
	}

	public boolean isNextIconUndisplayed() {
		return isElementUndisplayed(driver, ProductNotebooksPageUI.NEXT_ICON);
	}
}
