package com.nopcommerce.user;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.CompareProductListPageObject;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.ProductAppleMacbookProPageObject;
import pageObjects.ProductAsusPageObject;
import pageObjects.ProductHPPageObject;
import pageObjects.ProductLenovoPageObject;
import pageObjects.ProductNotebooksPageObject;
import pageObjects.ProductPageObject;
import pageObjects.ProductReviewPageObject;
import pageObjects.ProductSamsungPageObject;
import pageObjects.RecentlyViewedProductsPageObject;
import pageObjects.RegisterPageObject;
import pageObjects.ShoppingCartPageObject;
import pageObjects.WishlistPageObject;
import pageObjects.WislistLinkSharingPageObject;

public class Level_06_Wishlist_Compare_Recent_View extends AbstractTest {
	WebDriver driver;
	String invalidEmail;
	String firstName, lastName, companyName, email, password;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String url) {
		driver = getBrowserDriver(browserName, url);

		invalidEmail = "automation.gmail.com";
		firstName = "Ronaldo";
		lastName = "de Lima";
		companyName = "football";
		email = "Ronaldo" + getRandomNumber() + "@gmail.com";
		password = "1234567";
	}

	public void TC_01_Add_To_Wishlist() {
		homePage = PageGeneratorManager.getHomePage(driver);

		registerPage = homePage.clickToRegisterLink();

		registerPage.clickToGenderMaleRadioButton();

		registerPage.inputToFirstNameTextbox(firstName);

		registerPage.inputToLastNameTextbox(lastName);

		registerPage.selectDayDropdown("7");

		registerPage.selectMonthDropdown("August");

		registerPage.selectYearDropdown("1980");

		registerPage.inputToEmailTextbox(email);

		registerPage.inputToCompanyNameTextbox(companyName);

		registerPage.inputToPasswordTextbox(password);

		registerPage.inputToConfirmPasswordTextbox(password);

		registerPage.clickToRegisterButton();

		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

		homePage = registerPage.clickToLogoutLink();

		loginPage = homePage.clickToLoginLink();

		loginPage.inputToEmailTextbox(email);

		loginPage.inputToPasswordTextbox(password);

		homePage = loginPage.clickToLoginButton();

		Assert.assertTrue(homePage.isMyAccountLinkDisplayed());

		productPage = homePage.clickToProductByName("Apple MacBook Pro 13-inch");

		productPage.clickToAddToWishlist();

		Assert.assertEquals(productPage.getNotification(), "The product has been added to your wishlist");

		productPage.clickToCloseNotificationButton();

		wishlistPage = productPage.clickToWishlistHeaderLink();

		Assert.assertEquals(wishlistPage.getSKUProduct(), "AP_MBP_13");

		wislistLinkSharingPage = wishlistPage.clickToURLSharingLink();

		Assert.assertEquals(wislistLinkSharingPage.pageWistlistPageTitle(), "Wishlist of " + firstName + " " + lastName);
	}

	public void TC_02_Add_Product_To_Cart_From_Wishlist_Page() {
		homePage = PageGeneratorManager.getHomePage(driver);

		registerPage = homePage.clickToRegisterLink();

		registerPage.clickToGenderMaleRadioButton();

		registerPage.inputToFirstNameTextbox(firstName);

		registerPage.inputToLastNameTextbox(lastName);

		registerPage.selectDayDropdown("7");

		registerPage.selectMonthDropdown("August");

		registerPage.selectYearDropdown("1980");

		registerPage.inputToEmailTextbox(email);

		registerPage.inputToCompanyNameTextbox(companyName);

		registerPage.inputToPasswordTextbox(password);

		registerPage.inputToConfirmPasswordTextbox(password);

		registerPage.clickToRegisterButton();

		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

		homePage = registerPage.clickToLogoutLink();

		loginPage = homePage.clickToLoginLink();

		loginPage.inputToEmailTextbox(email);

		loginPage.inputToPasswordTextbox(password);

		homePage = loginPage.clickToLoginButton();

		Assert.assertTrue(homePage.isMyAccountLinkDisplayed());

		productPage = homePage.clickToProductByName("Apple MacBook Pro 13-inch");

		productPage.clickToAddToWishlist();

		Assert.assertEquals(productPage.getNotification(), "The product has been added to your wishlist");

		productPage.clickToCloseNotificationButton();

		wishlistPage = productPage.clickToWishlistHeaderLink();

		Assert.assertEquals(wishlistPage.getSKUProduct(), "AP_MBP_13");

		wishlistPage.clickToAddToCartCheckboxBySKU("AP_MBP_13");

		shoppingCartPage = wishlistPage.clickToAddToCartButton();

		Assert.assertEquals(shoppingCartPage.getTitlePageAtCenterPage(), "Shopping cart");

		Assert.assertTrue(shoppingCartPage.isCheckboxRemoveByProductNameDisplayed("Apple MacBook Pro 13-inch"));

		Assert.assertTrue(shoppingCartPage.isUpdateShoppingCartButtonDisplayed());

		wishlistPage = shoppingCartPage.clickToWishlishPage();

		Assert.assertTrue(wishlistPage.isSKUUndisplayed("AP_MBP_13"));

	}

	
	public void TC_03_Remove_Product_In_Wishlist_Page() {
		homePage = PageGeneratorManager.getHomePage(driver);

		registerPage = homePage.clickToRegisterLink();

		registerPage.clickToGenderMaleRadioButton();

		registerPage.inputToFirstNameTextbox(firstName);

		registerPage.inputToLastNameTextbox(lastName);

		registerPage.selectDayDropdown("7");

		registerPage.selectMonthDropdown("August");

		registerPage.selectYearDropdown("1980");

		registerPage.inputToEmailTextbox(email);

		registerPage.inputToCompanyNameTextbox(companyName);

		registerPage.inputToPasswordTextbox(password);

		registerPage.inputToConfirmPasswordTextbox(password);

		registerPage.clickToRegisterButton();

		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

		homePage = registerPage.clickToLogoutLink();

		loginPage = homePage.clickToLoginLink();

		loginPage.inputToEmailTextbox(email);

		loginPage.inputToPasswordTextbox(password);

		homePage = loginPage.clickToLoginButton();

		Assert.assertTrue(homePage.isMyAccountLinkDisplayed());

		productPage = homePage.clickToProductByName("HTC One M8 Android L 5.0 Lollipop");

		productPage.clickToAddToWishlist();

		Assert.assertEquals(productPage.getNotification(), "The product has been added to your wishlist");

		productPage.clickToCloseNotificationButton();

		wishlistPage = productPage.clickToWishlistHeaderLink();

		wishlistPage.clickToRemoveCheckboxByProductName("HTC One M8 Android L 5.0 Lollipop");

		wishlistPage.clickToUpdateWishlistButton();
		
		Assert.assertEquals(wishlistPage.getEmptyProductText(), "The wishlist is empty!");

		Assert.assertTrue(wishlistPage.isProductNameUndisplayed("HTC One M8 Android L 5.0 Lollipop"));

	}
	
	
	public void TC_04_Add_Product_To_Compare() {
		homePage = PageGeneratorManager.getHomePage(driver);

		registerPage = homePage.clickToRegisterLink();

		registerPage.clickToGenderMaleRadioButton();

		registerPage.inputToFirstNameTextbox(firstName);

		registerPage.inputToLastNameTextbox(lastName);

		registerPage.selectDayDropdown("7");

		registerPage.selectMonthDropdown("August");

		registerPage.selectYearDropdown("1980");

		registerPage.inputToEmailTextbox(email);

		registerPage.inputToCompanyNameTextbox(companyName);

		registerPage.inputToPasswordTextbox(password);

		registerPage.inputToConfirmPasswordTextbox(password);

		registerPage.clickToRegisterButton();

		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

		homePage = registerPage.clickToLogoutLink();

		loginPage = homePage.clickToLoginLink();

		loginPage.inputToEmailTextbox(email);

		loginPage.inputToPasswordTextbox(password);

		homePage = loginPage.clickToLoginButton();

		Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
		
		homePage.clickToAddToCompareListByProductName("Build your own computer");
		
		Assert.assertEquals(homePage.getAddToCompareListSuccessMessage(), "The product has been added to your product comparison");
		
		homePage.clickToCloseMessage();
		
		homePage.clickToAddToCompareListByProductName("Apple MacBook Pro 13-inch");
		
		Assert.assertEquals(homePage.getAddToCompareListSuccessMessage(), "The product has been added to your product comparison");
		
		homePage.clickToCloseMessage();
		
		compareProductListPage = homePage.clickToCompareProductsListFooterPage();
		
		Assert.assertTrue(compareProductListPage.isRemoveButton_1_Displayed());
		
		Assert.assertTrue(compareProductListPage.isRemoveButton_2_Displayed());
		
		Assert.assertTrue(compareProductListPage.isRowNameDisplayed());
		
		Assert.assertEquals(compareProductListPage.getProductName_2_InTableCompare(), "Build your own computer");
		
		Assert.assertTrue(compareProductListPage.isRowPriceDisplayed());
		
		Assert.assertEquals(compareProductListPage.getProductPrice_2_InTableCompare(), "$1,200.00");
		
		compareProductListPage.clickToClearListButton();
		
		Assert.assertEquals(compareProductListPage.getEmptyProductCompareText(), "You have no items to compare.");
		
		Assert.assertTrue(compareProductListPage.isProductNameInTableUndisplayed());
		
	}
	
	@Test
	public void TC_05_Recently_Viewed_Products() {
		homePage = PageGeneratorManager.getHomePage(driver);

		registerPage = homePage.clickToRegisterLink();

		registerPage.clickToGenderMaleRadioButton();

		registerPage.inputToFirstNameTextbox(firstName);

		registerPage.inputToLastNameTextbox(lastName);

		registerPage.selectDayDropdown("7");

		registerPage.selectMonthDropdown("August");

		registerPage.selectYearDropdown("1980");

		registerPage.inputToEmailTextbox(email);

		registerPage.inputToCompanyNameTextbox(companyName);

		registerPage.inputToPasswordTextbox(password);

		registerPage.inputToConfirmPasswordTextbox(password);

		registerPage.clickToRegisterButton();

		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

		homePage = registerPage.clickToLogoutLink();

		loginPage = homePage.clickToLoginLink();

		loginPage.inputToEmailTextbox(email);

		loginPage.inputToPasswordTextbox(password);

		homePage = loginPage.clickToLoginButton();

		Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
		
		homePage.hoverMouseToComputersLink();

		productNotebooksPage = homePage.clickToNotebooksButton();
		
		productNotebooksPage.clickToProductByProductName("Apple MacBook Pro 13-inch");
		
		productAppleMacbookProPage = PageGeneratorManager.getProductAppleMacbookProPage(driver);
		
		productNotebooksPage = productAppleMacbookProPage.backToPageNotebooks(driver);
		
		productNotebooksPage.clickToProductByProductName("Asus N551JK-XO076H Laptop");
		
		productAsusPage = PageGeneratorManager.getProductAsusPage(driver);
		
		productNotebooksPage = productAsusPage.backToPageNotebooks(driver);
		
		productNotebooksPage.clickToProductByProductName("HP Envy 6-1180ca 15.6-Inch Sleekbook");
		
		productHPPage = PageGeneratorManager.getProductHPPage(driver);
		
		productNotebooksPage = productHPPage.backToPageNotebooks(driver);
		
		productNotebooksPage.clickToProductByProductName("Lenovo Thinkpad X1 Carbon Laptop");
		
		productLenovoPage = PageGeneratorManager.getProductLenovoPage(driver);
		
		productNotebooksPage = productLenovoPage.backToPageNotebooks(driver);
		
		productNotebooksPage.clickToProductByProductName("Samsung Series 9 NP900X4C Premium Ultrabook");
		
		productSamsungPage = PageGeneratorManager.getProductSamsungPage(driver);
		
		productSamsungPage.clickToRecentlyViewedProductsFooterLink(driver);
		
		recentlyViewedProductsPage = PageGeneratorManager.getRecentlyViewedProductsPage(driver);
		
		Assert.assertTrue(recentlyViewedProductsPage.isProductDisplayedByProductName("HP Envy 6-1180ca 15.6-Inch Sleekbook"));
		
		Assert.assertTrue(recentlyViewedProductsPage.isProductDisplayedByProductName("Lenovo Thinkpad X1 Carbon Laptop"));
		
		Assert.assertTrue(recentlyViewedProductsPage.isProductDisplayedByProductName("Samsung Series 9 NP900X4C Premium Ultrabook"));
		
		Assert.assertTrue(recentlyViewedProductsPage.isProductUndisplayedByProductName("Apple MacBook Pro 13-inch"));
		
		Assert.assertTrue(recentlyViewedProductsPage.isProductUndisplayedByProductName("Asus N551JK-XO076H Laptop"));
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		removeDriver();
	}

	HomePageObject homePage;
	RegisterPageObject registerPage;
	LoginPageObject loginPage;
	ProductReviewPageObject productReviewPage;
	ProductPageObject productPage;
	WishlistPageObject wishlistPage;
	WislistLinkSharingPageObject wislistLinkSharingPage;
	ShoppingCartPageObject shoppingCartPage;
	CompareProductListPageObject compareProductListPage;
	ProductNotebooksPageObject productNotebooksPage;
	ProductAppleMacbookProPageObject productAppleMacbookProPage;
	ProductAsusPageObject productAsusPage;
	ProductHPPageObject productHPPage;
	ProductLenovoPageObject productLenovoPage;
	ProductSamsungPageObject productSamsungPage;
	RecentlyViewedProductsPageObject recentlyViewedProductsPage;
}

