package pageUIs;

public class ProductNotebooksPageUI {
	public static final String SORT_BY_DROPDOWN = "//select[@id='products-orderby']";
	public static final String PRODUCT_TITLE_NAME_TEXT = "(//h2[@class='product-title'])[%s]";
	public static final String PRODUCT_PRICE_TEXT = "(//div[@class='prices'])[%s]//span";
	public static final String NUMBER_PRODUCT_DISPLAYED_PER_PAGE_DROPDOWN = "//select[@id='products-pagesize']";
	public static final String NEXT_ICON = "//div[@class='pager']//a[text()='Next']";
	public static final String PREVIOUS_ICON = "//div[@class='pager']//a[text()='Previous']";
	public static final String DYNAMIC_PRODUCT_NAME = "//h2[@class='product-title']//a[text()='%s']";
	
}
