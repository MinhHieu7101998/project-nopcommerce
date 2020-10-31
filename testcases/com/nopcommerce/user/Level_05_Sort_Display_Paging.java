package com.nopcommerce.user;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.HomePageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.ProductNotebooksPageObject;

public class Level_05_Sort_Display_Paging extends AbstractTest {
	WebDriver driver;
	String firstName, lastName, companyName, email, password;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String url) {
		driver = getBrowserDriver(browserName, url);
		firstName = "Ronaldo";
		lastName = "de Lima";
		companyName = "football";
		email = "Ronaldo" + getRandomNumber() + "@gmail.com";
		password = "1234567";
	}

	@Test
	public void TC_01_Sort_Computers_Notebooks_With_Name_A_To_Z() {
		homePage = PageGeneratorManager.getHomePage(driver);

		homePage.hoverMouseToComputersLink();

		productNotebooksPage = homePage.clickToNotebooksButton();

		productNotebooksPage.selectItemSortByDropdown("Name: A to Z");

		Assert.assertEquals(productNotebooksPage.getProductTitleNameByIndex("1"), "Apple MacBook Pro 13-inch");

		Assert.assertEquals(productNotebooksPage.getProductTitleNameByIndex("6"), "Samsung Series 9 NP900X4C Premium Ultrabook");

	}

	@Test
	public void TC_02_Sort_Computers_Notebooks_With_Name_Z_To_A() {
		productNotebooksPage.selectItemSortByDropdown("Name: Z to A");

		Assert.assertEquals(productNotebooksPage.getProductTitleNameByIndex("1"), "Samsung Series 9 NP900X4C Premium Ultrabook");

		Assert.assertEquals(productNotebooksPage.getProductTitleNameByIndex("6"), "Apple MacBook Pro 13-inch");
	}

	@Test
	public void TC_03_Sort_Computers_Notebooks_With_Price_Low_To_High() {
		productNotebooksPage.selectItemSortByDropdown("Price: Low to High");

		Assert.assertEquals(productNotebooksPage.getProductPriceByIndex("1"), "$1,350.00");

		Assert.assertEquals(productNotebooksPage.getProductPriceByIndex("6"), "$1,800.00");

	}

	@Test
	public void TC_04_Sort_Computers_Notebooks_With_Price_High_To_Low() {
		productNotebooksPage.selectItemSortByDropdown("Price: High to Low");

		Assert.assertEquals(productNotebooksPage.getProductPriceByIndex("1"), "$1,800.00");

		Assert.assertEquals(productNotebooksPage.getProductPriceByIndex("6"), "$1,350.00");

	}

	@Test
	public void TC_05_Display_Three_Product_Per_Page() {
		productNotebooksPage.selectItemDisplayNumberProductDropdown("3");

		Assert.assertTrue(productNotebooksPage.isProductUndisplayedByIndex("4"));

		Assert.assertTrue(productNotebooksPage.isNextIconDisplayed());

		productNotebooksPage.clickToNextIcon();

		Assert.assertTrue(productNotebooksPage.isPreviousIconDisplayed());

		productNotebooksPage.clickToPreviousIcon();

		Assert.assertTrue(productNotebooksPage.isNextIconDisplayed());
	}

	@Test
	public void TC_06_Display_Six_Product_Per_Page() {
		productNotebooksPage.selectItemDisplayNumberProductDropdown("6");

		Assert.assertTrue(productNotebooksPage.isProductUndisplayedByIndex("7"));

		Assert.assertTrue(productNotebooksPage.isNextIconUndisplayed());
	}

	@Test
	public void TC_07_Display_Nine_Product_Per_Page() {
		productNotebooksPage.selectItemDisplayNumberProductDropdown("9");

		Assert.assertTrue(productNotebooksPage.isProductUndisplayedByIndex("10"));

		Assert.assertTrue(productNotebooksPage.isNextIconUndisplayed());
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		removeDriver();
	}

	HomePageObject homePage;
	ProductNotebooksPageObject productNotebooksPage;
}
