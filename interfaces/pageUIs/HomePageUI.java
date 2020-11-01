package pageUIs;

public class HomePageUI {
	public static final String LOGOUT_LINK = "//a[@class='ico-logout']";
	public static final String MY_ACCOUNT_LINK = "//a[@class='ico-account']";
	public static final String REGISTER_LINK = "//a[@class='ico-register']";
	public static final String LOGIN_LINK ="//a[@class='ico-login']";
	public static final String BUILD_YOUR_OWN_COMPUTER_LINK = "//div[@class='item-grid']//a[@title='Show details for Build your own computer']";
	public static final String FOOTER_SEARCH_LINK = "//a[contains(text(),'Search')]";
	public static final String COMPUTERS_TOP_MENU_LINK = "//ul[@class='top-menu notmobile']//a[text()='Computers ']";
	public static final String NOTEBOOKS_CHILD_COMPUTERS_TOP_MENU_LINK = "//ul[@class='top-menu notmobile']//a[text()='Computers ']//following-sibling::ul//a[text()='Notebooks ']";
	public static final String PRODUCT_NAME_LINK = "//h2[@class='product-title']//a[text()='%s']";
	public static final String DYNAMIC_ADD_TO_COMPARE_LIST_BUTTON = "//a[text()='%s']//parent::h2[@class='product-title']//following-sibling::div[@class='add-info']//input[@title='Add to compare list']";
	public static final String NOTIFICATION_ADD_TO_COMAPRE_LIST_MESSAGE = "//div[@class='bar-notification success']//p";
	public static final String CLOSE_MEESAGE_BUTTON = "//span[@class='close']";
	public static final String COMPARE_PRODUCT_LIST_LINK = "//a[text()='Compare products list']";
}
