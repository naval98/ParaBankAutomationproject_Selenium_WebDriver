package com_vts_pages;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BillPay {

	WebDriver driver;
	public BillPay(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//a[normalize-space()='Bill Pay']")
	WebElement billpay;
	@FindBy(xpath ="//input[@name='payee.name']")
	WebElement PayeeName;
	@FindBy(xpath = "//input[@name='payee.address.street']")
	WebElement Address;
	@FindBy(xpath = "//input[@name='payee.address.city']")
	WebElement City;
	@FindBy(xpath = "//input[@name='payee.address.state']")
	WebElement state;
	@FindBy(xpath = "//input[@name='payee.address.zipCode']")
	WebElement zipcode;
	@FindBy(name ="payee.phoneNumber")
	WebElement Phone;
	@FindBy(xpath = "//input[@name='payee.accountNumber']")
	WebElement Account;
	@FindBy(name = "verifyAccount")
	WebElement verifyAccount;
	@FindBy(xpath = "//input[@name='amount']")
	WebElement Amount;
	@FindBy(xpath = "//select[@name='fromAccountId']")
	WebElement fromaccount;
	@FindBy(xpath = "//input[@value='Send Payment']")
	WebElement sendPayment;


	//Reusable Method
	public void billpay() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(billpay)).click();
	}

	public void PayeeName() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(PayeeName)).sendKeys("Naval");
	}
	public void Address() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Address)).sendKeys("e234455");
	}
	public void City() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(City)).sendKeys("Delhi");
	}
	public void State() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(state)).sendKeys("New Delhi");
	}
	public void zipcode() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(zipcode)).sendKeys("110046");
	}
	public void Phone() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Phone)).sendKeys("9999999999");
	}
	public void Account() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Account)).sendKeys("70000");
	}

	public void verifyAccount() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(verifyAccount)).sendKeys("70000");
	}
	public void Amount() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Amount)).sendKeys("2000");
	}
	public void sendPayment() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(sendPayment)).click();
	}
	public void fromaccount() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(fromaccount)).click();
	}



}



