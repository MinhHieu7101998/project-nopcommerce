package pageUIs;

public class CompareProductPageUI {
	public static final String REMOVE_PRODUCT_1_LINK = "(//input[@value='Remove'])[1]";
	public static final String REMOVE_PRODUCT_2_LINK = "(//input[@value='Remove'])[2]";
	public static final String ROW_NAME_IN_COMPARE_TABLE = "//label[text()='Name']";
	public static final String PRODUCT_NAME_2_IN_COMPARE_TABLE = "(//label[text()='Name']//parent::td//following-sibling::td)[2]";
	public static final String ROW_PRICE_IN_COMPARE_TABLE = "//label[text()='Price']";
	public static final String PRODUCT_PRICE_2_IN_COMPARE_TABLE = "(//label[text()='Price']//parent::td//following-sibling::td)[2]";
	public static final String CLEAR_LIST_BUTTON = "//a[@class='clear-list']";
	public static final String EMPTY_PRODUCT_IN_COMPARE_LIST_TEXT = "//div[@class='no-data']";
	public static final String ALL_PRODUCT_NAME_IN_COMPARE_TABLE = "//label[text()='Name']//parent::td//following-sibling::td//a[contains(text(),'')]";
}
