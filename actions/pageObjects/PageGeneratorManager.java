package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}
	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}
	public static CustomerInfoPageObject getCustomerInfoPage(WebDriver driver) {
		return new CustomerInfoPageObject(driver);
	}
	public static AddressesPageObject getAddressesPage(WebDriver driver) {
		return new AddressesPageObject(driver);
	}
	public static OrdersPageObject getOrdersPage(WebDriver driver) {
		return new OrdersPageObject(driver);
	}
	public static DownloadableProductsPageObject getDownloadableProductsPage(WebDriver driver) {
		return new DownloadableProductsPageObject(driver);
	}
	public static BackInStockSubscriptionsPageObject getBackInStockSubscriptionsPage(WebDriver driver) {
		return new BackInStockSubscriptionsPageObject(driver);
	}
	public static RewardPointsPageObject getRewardPointsPage(WebDriver driver) {
		return new RewardPointsPageObject(driver);
	}
	public static ChangePasswordPageObject getChangePasswordPage(WebDriver driver) {
		return new ChangePasswordPageObject(driver);
	}
	public static MyProductReviewsPageObject getMyProductReviewsPage(WebDriver driver) {
		return new MyProductReviewsPageObject(driver);
	}
	public static ProductPageObject getProductPage(WebDriver driver) {
		return new ProductPageObject(driver);
	}
	public static ProductReviewPageObject getProductReviewPage(WebDriver driver) {
		return new ProductReviewPageObject(driver);
	}
	public static SearchPageObject getSearchPage(WebDriver driver) {
		return new SearchPageObject(driver);
	}
	public static DashboardAdminPageObject getDashboardAdminPage(WebDriver driver) {
		return new DashboardAdminPageObject(driver);
	}
	public static ProductsAdminPageObject getProductsAdminPage(WebDriver driver) {
		return new ProductsAdminPageObject(driver);
	}
	public static ProductNotebooksPageObject getProductNotebooksPage(WebDriver driver) {
		return new ProductNotebooksPageObject(driver);
	}
	public static WishlistPageObject getWishlistPage(WebDriver driver) {
		return new WishlistPageObject(driver);
	}
	public static WislistLinkSharingPageObject getWislistLinkSharingPage(WebDriver driver) {
		return new WislistLinkSharingPageObject(driver);
	}
	public static ShoppingCartPageObject getShoppingCartPage(WebDriver driver) {
		return new ShoppingCartPageObject(driver);
	}
	public static CompareProductListPageObject getCompareProductListPage(WebDriver driver) {
		return new CompareProductListPageObject(driver);
	}
	public static ProductAppleMacbookProPageObject getProductAppleMacbookProPage(WebDriver driver) {
		return new ProductAppleMacbookProPageObject(driver);
	}
	public static ProductAsusPageObject getProductAsusPage(WebDriver driver) {
		return new ProductAsusPageObject(driver);
	}
	public static ProductHPPageObject getProductHPPage(WebDriver driver) {
		return new ProductHPPageObject(driver);
	}
	public static ProductLenovoPageObject getProductLenovoPage(WebDriver driver) {
		return new ProductLenovoPageObject(driver);
	}
	public static ProductSamsungPageObject getProductSamsungPage(WebDriver driver) {
		return new ProductSamsungPageObject(driver);
	}
	public static RecentlyViewedProductsPageObject getRecentlyViewedProductsPage(WebDriver driver) {
		return new RecentlyViewedProductsPageObject(driver);
	}
	
}
