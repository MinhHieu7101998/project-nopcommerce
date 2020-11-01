package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.WishlistPageUI;

public class WishlistPageObject extends AbstractPage {
	WebDriver driver;

	public WishlistPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getSKUProduct() {
		waitToElementVisible(driver, WishlistPageUI.SKU_PRODUCT_TEXT);
		return getElementText(driver, WishlistPageUI.SKU_PRODUCT_TEXT);
	}

	public WislistLinkSharingPageObject clickToURLSharingLink() {
		waitToElementClickable(driver, WishlistPageUI.WISHLIST_SHARING_LINK);
		clickToElement(driver, WishlistPageUI.WISHLIST_SHARING_LINK);
		return PageGeneratorManager.getWislistLinkSharingPage(driver);
	}

	public void clickToAddToCartCheckboxBySKU(String codeSKU) {
		waitToElementClickable(driver, WishlistPageUI.DYNAMIC_ADD_TO_CART_BUTTON, codeSKU);
		clickToElement(driver, WishlistPageUI.DYNAMIC_ADD_TO_CART_BUTTON, codeSKU);
	}

	public ShoppingCartPageObject clickToAddToCartButton() {
		waitToElementClickable(driver, WishlistPageUI.ADD_TO_CART_BUTTON);
		clickToElement(driver, WishlistPageUI.ADD_TO_CART_BUTTON);
		return PageGeneratorManager.getShoppingCartPage(driver);
	}

	public boolean isSKUUndisplayed(String codeSKU) {
		return isElementUndisplayed(driver, WishlistPageUI.DYNAMIC_WISHLISH_CHECKBOX, codeSKU);
	}

	public void clickToRemoveCheckboxByProductName(String productName) {
		waitToElementClickable(driver, WishlistPageUI.DYNAMIC_REMOVE_CHECKBOX, productName);
		clickToElement(driver, WishlistPageUI.DYNAMIC_REMOVE_CHECKBOX, productName);
	}

	public void clickToUpdateWishlistButton() {
		waitToElementClickable(driver, WishlistPageUI.UPDATE_WISHLIST_BUTTON);
		clickToElement(driver, WishlistPageUI.UPDATE_WISHLIST_BUTTON);
	}

	public String getEmptyProductText() {
		waitToElementVisible(driver, WishlistPageUI.NO_PRODUCT_IN_WISHLIST_MEESAGE);
		return getElementText(driver, WishlistPageUI.NO_PRODUCT_IN_WISHLIST_MEESAGE);
	}

	public boolean isProductNameUndisplayed(String productName) {
		return isElementUndisplayed(driver, WishlistPageUI.DYNAMIC_PRODUCT_NAME, productName);
	}

}
