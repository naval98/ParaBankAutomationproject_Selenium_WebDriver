package com_vts_pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@value='Log In']")
	WebElement loginButton;

	public void enterUsername() {
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOf(username));

		username.clear();
		username.sendKeys("Admin105");
	}

	public void enterPassword() {

		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOf(password));

		password.clear();
		password.sendKeys("Delhi@123");
	}

	public void clickLogin() {

		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.elementToBeClickable(loginButton))
		.click();
	}
}