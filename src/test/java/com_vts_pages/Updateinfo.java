package com_vts_pages;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Updateinfo {
	WebDriver driver;

	public Updateinfo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Update Contact Info']")
	WebElement updateInfo;

	@FindBy(id = "customer.firstName")
	WebElement firstName;

	@FindBy(id = "customer.lastName")
	WebElement lastName;

	@FindBy(id = "customer.address.street")
	WebElement address;

	@FindBy(id = "customer.address.city")
	WebElement city;

	@FindBy(id = "customer.address.state")
	WebElement state;

	@FindBy(id = "customer.address.zipCode")
	WebElement zipcode;

	@FindBy(id = "customer.phoneNumber")
	WebElement phone;

	@FindBy(xpath = "//input[@value='Update Profile']")
	WebElement updateProfile;

	// Reusable Methods

	public void clickUpdateInfo() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(updateInfo))
		.click();
	}

	public void enterFirstName() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOf(firstName))
		.sendKeys("Naval");
	}

	public void enterLastName() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOf(lastName))
		.sendKeys("Saxena");
	}

	public void enterAddress() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOf(address))
		.sendKeys("7rrtt88");
	}

	public void enterCity() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOf(city))
		.sendKeys("Delhi");
	}

	public void enterState() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOf(state))
		.sendKeys("New Delhi");
	}

	public void enterZipCode() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOf(zipcode))
		.sendKeys("110045");
	}

	public void enterPhone() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOf(phone))
		.sendKeys("5555555555");
	}

	public void clickUpdateProfile() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(updateProfile))
		.click();
	}
}





