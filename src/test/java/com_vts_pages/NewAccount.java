package com_vts_pages;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewAccount {

	WebDriver driver;
	public NewAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='type']")
	WebElement typeofAccount;
	@FindBy(xpath = "//select[@id='fromAccountId']")
	WebElement Amount;
	@FindBy(xpath = "//input[@value='Open New Account']")
	WebElement openNewAccount;
	@FindBy(xpath = "//a[normalize-space()='Open New Account']")
	WebElement openNewAccountlink;


	//Reusable Method
	public void typeofAccount() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(typeofAccount)).click();
	}

	public void Amount() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Amount)).click();
	}

	public void openNewAccount() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(openNewAccount)).click();
	}

	public void openNewAccountlink() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(openNewAccountlink)).click();
	}







}
