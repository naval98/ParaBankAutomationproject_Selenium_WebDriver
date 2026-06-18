package com_vts_pages;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signup {

	WebDriver driver;

	public signup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement Signup;
	@FindBy(id = "customer.firstName")
	WebElement FirstName;
	@FindBy(name ="customer.lastName")
	WebElement LastName;
	@FindBy(xpath = "//*[@id=\"customer.address.street\"]")
	WebElement Address;
	@FindBy(xpath = "//*[@id=\"customer.address.city\"]")
	WebElement city;
	@FindBy(name = "customer.address.state")
	WebElement state;
	@FindBy(id = "customer.address.zipCode")
	WebElement zipcode;
	@FindBy(name ="customer.phoneNumber")
	WebElement phoneNumber;
	@FindBy(xpath = "//*[@id=\"customer.ssn\"]")
	WebElement ssn;
	@FindBy(css = "#customer\\.username")
	WebElement username;
	@FindBy(xpath ="//*[@id=\"customer.password\"]")
	WebElement password;
	@FindBy(xpath ="//*[@id=\"repeatedPassword\"]")
	WebElement confirm;
	@FindBy(xpath ="//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
	WebElement login;




	//Reusable Method
	public void Signup() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Signup)).click();
	}

	public void FirstName() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(FirstName)).sendKeys("Naval");

	}

	public void LastName() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(LastName)).sendKeys("saxena");
	}

	public void Address() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Address)).sendKeys("e4566666");
	}

	public void City() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(city)).sendKeys("Delhi");
	}

	public void state() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(state)).sendKeys("New Delhi");
	}

	public void zipcode() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(zipcode)).sendKeys("3333");
	}

	public void phone() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(phoneNumber)).sendKeys("7777777777");
	}

	public void SSN() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ssn)).sendKeys("8888");
	}
	public void username() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(username)).sendKeys("Admin104");
	}
	public void password() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(password)).sendKeys("Delhi@123");
	}

	public void confirmpassword() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(confirm)).sendKeys("Delhi@123");

	}
	public void Login() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(login)).click();
	}

}

