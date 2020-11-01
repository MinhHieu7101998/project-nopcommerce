package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.CompareProductPageUI;

public class CompareProductListPageObject extends AbstractPage {
	WebDriver driver;

	public CompareProductListPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isRemoveButton_1_Displayed() {
		waitToElementVisible(driver, CompareProductPageUI.REMOVE_PRODUCT_1_LINK);
		return isElementDisplayed(driver, CompareProductPageUI.REMOVE_PRODUCT_1_LINK);
	}

	public boolean isRemoveButton_2_Displayed() {
		waitToElementVisible(driver, CompareProductPageUI.REMOVE_PRODUCT_2_LINK);
		return isElementDisplayed(driver, CompareProductPageUI.REMOVE_PRODUCT_2_LINK);
	}

	public boolean isRowNameDisplayed() {
		waitToElementVisible(driver, CompareProductPageUI.ROW_NAME_IN_COMPARE_TABLE);
		return isElementDisplayed(driver, CompareProductPageUI.ROW_NAME_IN_COMPARE_TABLE);
	}

	public String getProductName_2_InTableCompare() {
		waitToElementVisible(driver, CompareProductPageUI.PRODUCT_NAME_2_IN_COMPARE_TABLE);
		return getElementText(driver, CompareProductPageUI.PRODUCT_NAME_2_IN_COMPARE_TABLE);
	}

	public boolean isRowPriceDisplayed() {
		waitToElementVisible(driver, CompareProductPageUI.ROW_PRICE_IN_COMPARE_TABLE);
		return isElementDisplayed(driver, CompareProductPageUI.ROW_PRICE_IN_COMPARE_TABLE);
	}

	public String getProductPrice_2_InTableCompare() {
		waitToElementVisible(driver, CompareProductPageUI.PRODUCT_PRICE_2_IN_COMPARE_TABLE);
		return getElementText(driver, CompareProductPageUI.PRODUCT_PRICE_2_IN_COMPARE_TABLE);
	}

	public void clickToClearListButton() {
		waitToElementClickable(driver, CompareProductPageUI.CLEAR_LIST_BUTTON);
		clickToElement(driver, CompareProductPageUI.CLEAR_LIST_BUTTON);
	}

	public String getEmptyProductCompareText() {
		waitToElementVisible(driver, CompareProductPageUI.EMPTY_PRODUCT_IN_COMPARE_LIST_TEXT);
		return getElementText(driver, CompareProductPageUI.EMPTY_PRODUCT_IN_COMPARE_LIST_TEXT);
	}

	public boolean isProductNameInTableUndisplayed() {
		return isElementUndisplayed(driver, CompareProductPageUI.ALL_PRODUCT_NAME_IN_COMPARE_TABLE);
	}

}
