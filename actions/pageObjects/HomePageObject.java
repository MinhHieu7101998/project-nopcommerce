package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.HomePageUI;

public class HomePageObject extends AbstractPage {
	WebDriver driver;

	public HomePageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public RegisterPageObject clickToRegisterLink() {
		waitToElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		return PageGeneratorManager.getRegisterPage(driver);
	}

	public LoginPageObject clickToLoginLink() {
		waitToElementClickable(driver, HomePageUI.LOGIN_LINK);
		clickToElement(driver, HomePageUI.LOGIN_LINK);
		return PageGeneratorManager.getLoginPage(driver);
	}

	public boolean isMyAccountLinkDisplayed() {
		waitToElementVisible(driver, HomePageUI.MY_ACCOUNT_LINK);
		return isElementDisplayed(driver, HomePageUI.MY_ACCOUNT_LINK);
	}

	public boolean isLogoutLinkDisplayed() {
		waitToElementVisible(driver, HomePageUI.LOGOUT_LINK);
		return isElementDisplayed(driver, HomePageUI.LOGOUT_LINK);
	}

	public CustomerInfoPageObject clickTokMyAccountLink() {
		waitToElementClickable(driver, HomePageUI.MY_ACCOUNT_LINK);
		clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
		return PageGeneratorManager.getCustomerInfoPage(driver);
	}

	public ProductPageObject clickToProductComputerPage() {
		waitToElementClickable(driver, HomePageUI.BUILD_YOUR_OWN_COMPUTER_LINK);
		clickToElement(driver, HomePageUI.BUILD_YOUR_OWN_COMPUTER_LINK);
		return PageGeneratorManager.getProductPage(driver);
	}

	public SearchPageObject clickToSearchLinkInFooter() {
		waitToElementClickable(driver, HomePageUI.FOOTER_SEARCH_LINK);
		clickToElement(driver, HomePageUI.FOOTER_SEARCH_LINK);
		return PageGeneratorManager.getSearchPage(driver);
	}

	public void hoverMouseToComputersLink() {
		waitToElementVisible(driver, HomePageUI.COMPUTERS_TOP_MENU_LINK);
		hoverMouseToElment(driver, HomePageUI.COMPUTERS_TOP_MENU_LINK);
	}

	public ProductNotebooksPageObject clickToNotebooksButton() {
		waitToElementClickable(driver, HomePageUI.NOTEBOOKS_CHILD_COMPUTERS_TOP_MENU_LINK);
		clickToElement(driver, HomePageUI.NOTEBOOKS_CHILD_COMPUTERS_TOP_MENU_LINK);
		return PageGeneratorManager.getProductNotebooksPage(driver);
	}

	public ProductPageObject clickToProductByName(String productName) {
		waitToElementClickable(driver, HomePageUI.PRODUCT_NAME_LINK, productName);
		clickToElement(driver, HomePageUI.PRODUCT_NAME_LINK, productName);
		return PageGeneratorManager.getProductPage(driver);
	}

	public void clickToAddToCompareListByProductName(String productName) {
		waitToElementClickable(driver, HomePageUI.DYNAMIC_ADD_TO_COMPARE_LIST_BUTTON, productName);
		clickToElement(driver, HomePageUI.DYNAMIC_ADD_TO_COMPARE_LIST_BUTTON, productName);
		waitToAjaxLoadingPageUserInvisble(driver);
	}

	public String getAddToCompareListSuccessMessage() {
		waitToElementVisible(driver, HomePageUI.NOTIFICATION_ADD_TO_COMAPRE_LIST_MESSAGE);
		return getElementText(driver, HomePageUI.NOTIFICATION_ADD_TO_COMAPRE_LIST_MESSAGE);
	}

	public void clickToCloseMessage() {
		waitToElementClickable(driver, HomePageUI.CLOSE_MEESAGE_BUTTON);
		clickToElement(driver, HomePageUI.CLOSE_MEESAGE_BUTTON);
	}

	public CompareProductListPageObject clickToCompareProductsListFooterPage() {
		waitToElementClickable(driver, HomePageUI.COMPARE_PRODUCT_LIST_LINK);
		clickToElement(driver, HomePageUI.COMPARE_PRODUCT_LIST_LINK);
		return PageGeneratorManager.getCompareProductListPage(driver);
	}
	
	
}
