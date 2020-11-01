package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.AbstractPageUI;
import pageUIs.ShoppingCartPageUI;

public class ShoppingCartPageObject extends AbstractPage {
	WebDriver driver;

	public ShoppingCartPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitlePageAtCenterPage() {
		waitToElementVisible(driver, ShoppingCartPageUI.PAGE_TITLE_TEXT);
		return getElementText(driver, ShoppingCartPageUI.PAGE_TITLE_TEXT);
	}

	public boolean isCheckboxRemoveByProductNameDisplayed(String productName) {
		waitToElementClickable(driver, ShoppingCartPageUI.DYNAMIC_REMOVE_CHECKBOX, productName);
		return isElementDisplayed(driver, ShoppingCartPageUI.DYNAMIC_REMOVE_CHECKBOX, productName);
	}

	public boolean isUpdateShoppingCartButtonDisplayed() {
		waitToElementVisible(driver, ShoppingCartPageUI.UPDATE_SHOPPING_CART_BUTTON);
		return isElementDisplayed(driver, ShoppingCartPageUI.UPDATE_SHOPPING_CART_BUTTON);
	}

	public WishlistPageObject clickToWishlishPage() {
		waitToElementClickable(driver, AbstractPageUI.WISHLIST_HEADER_MENU_LINK);
		clickToElement(driver, AbstractPageUI.WISHLIST_HEADER_MENU_LINK);
		return PageGeneratorManager.getWishlistPage(driver);
	}

}
