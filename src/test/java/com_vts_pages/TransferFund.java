package com_vts_pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransferFund {

	WebDriver driver;
	WebDriverWait wait;

	public TransferFund(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Transfer Funds")
	WebElement transferFundsLink;

	@FindBy(id = "amount")
	WebElement enterAmount;

	@FindBy(id = "fromAccountId")
	WebElement fromAccountDropdown;

	@FindBy(id = "toAccountId")
	WebElement toAccountDropdown;

	@FindBy(xpath = "//input[@value='Transfer']")
	WebElement transferButton;

	public void fundTransfer() {

		wait.until(ExpectedConditions.elementToBeClickable(transferFundsLink))
		.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
	}

	public void enterAmount() {

		WebElement amountField = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("amount")));

		amountField.clear();
		amountField.sendKeys("500");
	}

	public void selectFromAccount() {

		WebElement dropdown = wait.until(
				ExpectedConditions.visibilityOf(fromAccountDropdown));

		Select select = new Select(dropdown);

		wait.until(driver -> select.getOptions().size() > 0);

		select.selectByIndex(0);
	}

	public void selectToAccount() {


		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOf(toAccountDropdown));

		Select select = new Select(toAccountDropdown);

		System.out.println("To Account Options: "
				+ select.getOptions().size());

		for (WebElement option : select.getOptions()) {
			System.out.println(option.getText());
		}

		select.selectByIndex(0);
	}



	public void clickTransferButton() {

		wait.until(ExpectedConditions.elementToBeClickable(transferButton))
		.click();
	}
}




