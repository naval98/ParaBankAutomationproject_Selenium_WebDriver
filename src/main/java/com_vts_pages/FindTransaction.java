package com_vts_pages;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindTransaction {

	WebDriver driver;
	public FindTransaction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Locators
	@FindBy(linkText = "Find Transactions")
	WebElement FindTransactionslink;
	@FindBy(id ="accountId")
	WebElement accountdropdown;
	@FindBy(id ="transactionId")
	WebElement transactionIdField;
	@FindBy(id ="findById")
	WebElement FindByIdButton;
	@FindBy(id ="transactionDate")
	WebElement transactionDateField;
	@FindBy(id ="findByDate")
	WebElement findByDateButton;
	@FindBy(id ="fromDate")
	WebElement fromDateField;
	@FindBy(id ="toDate")
	WebElement toDateField;
	@FindBy(id = "findByDateRange")
	WebElement searchByDateRange;
	@FindBy(id ="amount")
	WebElement amountfield;
	@FindBy(id ="findByAmount")
	WebElement searchByAmount;

	// Click Find Transactions Link
	public void clickFindTransactions() {

		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.elementToBeClickable(FindTransactionslink))
		.click();
	}

	// Select Account
	public void selectAccount() {

		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOf(accountdropdown));

		new Select(accountdropdown).selectByIndex(0);
	}

	// Enter Transaction ID
	public void enterTransactionId() {

		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOf(transactionIdField))
		.sendKeys("12345");
	}

	// Click Find By ID Button
	public void clickFindByIdButton() {

		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.elementToBeClickable(FindByIdButton))
		.click();
	}

	// Enter Transaction Date
	public void enterTransactionDate() {

		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOf(transactionDateField))
		.sendKeys("06-18-2026");
	}

	// Click Find By Date Button
	public void clickFindByDateButton() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript(
				"arguments[0].scrollIntoView({block:'center'});",
				findByDateButton);

		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOf(findByDateButton));

		js.executeScript(
				"arguments[0].click();",
				findByDateButton);
	}

	// Enter From Date
	public void enterFromDate() {

		System.out.println("URL = " + driver.getCurrentUrl());
		System.out.println("Title = " + driver.getTitle());

		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOf(fromDateField));

		fromDateField.sendKeys("2026-06-01");
	}

	// Enter To Date
	public void enterToDate() {

		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOf(toDateField));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript(
				"arguments[0].value='2026-06-18';",
				toDateField);
	}

	// Click Date Range Button
	public void clickDateRangeButton() {


		WebElement button = new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.visibilityOf(searchByDateRange));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", button);

		js.executeScript("arguments[0].click();", button);

	}

	// Enter Amount
	public void enterAmount() {
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript(
				"arguments[0].scrollIntoView({block:'center'});",
				amountfield);

		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOf(amountfield));

		amountfield.clear();
		amountfield.sendKeys("500");
	}


	// Click Find By Amount Button
	public void clickFindByAmountButton() {

		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.elementToBeClickable(searchByAmount))
		.click();
	}
}