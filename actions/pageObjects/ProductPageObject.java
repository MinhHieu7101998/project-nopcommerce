package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.AbstractPageUI;
import pageUIs.ProductPageUI;

public class ProductPageObject extends AbstractPage {
	WebDriver driver;

	public ProductPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getCurrentUrl() {
		return getCurrentPageUrl(driver);
	}

	public ProductReviewPageObject clickToAddYourReviewLink() {
		waitToElementClickable(driver, ProductPageUI.ADD_YOUR_REVIEW_LINK);
		clickToElement(driver, ProductPageUI.ADD_YOUR_REVIEW_LINK);
		return PageGeneratorManager.getProductReviewPage(driver);
	}

	public void clickToAddToWishlist() {
		waitToElementClickable(driver, ProductPageUI.ADD_TO_WISHLIST_HCT_BUTTON);
		clickToElement(driver, ProductPageUI.ADD_TO_WISHLIST_HCT_BUTTON);
	}

	public String getNotification() {
		waitToAjaxLoadingPageUserInvisble(driver);
		waitToElementVisible(driver, ProductPageUI.NOTIFICATION_SUCCESS);
		return getElementText(driver, ProductPageUI.NOTIFICATION_SUCCESS);
	}

	public void clickToCloseNotificationButton() {
		waitToElementClickable(driver, ProductPageUI.CLOSE_NOTIFICATION_BUTTON);
		clickToElement(driver, ProductPageUI.CLOSE_NOTIFICATION_BUTTON);
	}

	public WishlistPageObject clickToWishlistHeaderLink() {
		waitToElementClickable(driver, AbstractPageUI.WISHLIST_HEADER_MENU_LINK);
		clickToElement(driver, AbstractPageUI.WISHLIST_HEADER_MENU_LINK);
		return PageGeneratorManager.getWishlistPage(driver);
	}
}
