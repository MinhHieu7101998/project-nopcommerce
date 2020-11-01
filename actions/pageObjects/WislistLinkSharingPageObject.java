package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.WishlistLinkSharingPageUI;

public class WislistLinkSharingPageObject extends AbstractPage{
	WebDriver driver;

	public WislistLinkSharingPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String pageWistlistPageTitle() {
		waitToElementVisible(driver, WishlistLinkSharingPageUI.WISHLIST_PAGE_TITLE_TEXT);
		return getElementText(driver, WishlistLinkSharingPageUI.WISHLIST_PAGE_TITLE_TEXT);
	}

}
