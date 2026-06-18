package com_vts_pages;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Requestloan {

	WebDriver driver;

	public Requestloan(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Request Loan']")
	WebElement requestLoan;

	@FindBy(id = "amount")
	WebElement loanAmount;

	@FindBy(id = "downPayment")
	WebElement downPayment;

	@FindBy(id = "fromAccountId")
	WebElement fromAccount;

	@FindBy(xpath = "//input[@value='Apply Now']")
	WebElement applyNow;

	// Reusable Methods

	public void clickRequestLoan() {

		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(requestLoan))
		.click();
	}

	public void enterLoanAmount() {

		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOf(loanAmount))
		.sendKeys("4500");
	}

	public void enterDownPayment() {

		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOf(downPayment))
		.sendKeys("3000");
	}

	public void selectFromAccount() {

		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(fromAccount))
		.click();
	}

	public void clickApplyNow() {

		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(applyNow))
		.click();
	}
}


