package pageUIs;

public class ShoppingCartPageUI {
	public static final String PAGE_TITLE_TEXT = "//div[@class='page-title']//h1";
	public static final String COLUMN_REMOVE = "//th[@class='remove-from-cart' and text()='Remove']";
	public static final String UPDATE_SHOPPING_CART_BUTTON = "//input[@name='updatecart']";
	public static final String DYNAMIC_REMOVE_CHECKBOX = "//a[text()='%s']//parent::td//preceding-sibling::td//input[@name='removefromcart']";
}
