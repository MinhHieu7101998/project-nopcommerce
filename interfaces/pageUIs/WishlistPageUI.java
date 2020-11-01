package pageUIs;

public class WishlistPageUI {
	public static final String SKU_PRODUCT_TEXT = "//span[@class='sku-number']";
	public static final String WISHLIST_SHARING_LINK = "//a[@class='share-link']";
	public static final String DYNAMIC_ADD_TO_CART_BUTTON = "//span[text()='%s']//parent::td//preceding-sibling::td//input[@name='addtocart']";
	public static final String ADD_TO_CART_BUTTON = "//input[@name='addtocartbutton']";
	public static final String DYNAMIC_WISHLISH_CHECKBOX = "//span[@class='sku-number' and text()='%s']";
	public static final String DYNAMIC_REMOVE_CHECKBOX = "//a[text()='%s']//parent::td//preceding-sibling::td//input[@name='removefromcart']";
	public static final String UPDATE_WISHLIST_BUTTON = "//input[@name='updatecart']";
	public static final String NO_PRODUCT_IN_WISHLIST_MEESAGE = "//div[@class='no-data']";
	public static final String DYNAMIC_PRODUCT_NAME = "//a[@class='product-name' and text() = '%s']";
}
