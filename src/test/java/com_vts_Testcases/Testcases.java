package com_vts_Testcases;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com_vts_pages.AccountOverview;
import com_vts_pages.BillPay;
import com_vts_pages.FindTransaction;
import com_vts_pages.Login;
import com_vts_pages.NewAccount;
import com_vts_pages.Requestloan;
import com_vts_pages.TransferFund;
import com_vts_pages.Updateinfo;
import com_vts_pages.signup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcases {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();

	}

	@Test (priority = 1)
	public void Signup() {
		signup sign = new signup(driver);
		sign.Signup();
		sign.FirstName();
		sign.LastName();
		sign.Address();
		sign.City();
		sign.state();
		sign.zipcode();
		sign.phone();
		sign.SSN();
		sign.username();
		sign.password();
		sign.confirmpassword();
		sign.Login();

	}

	@Test (priority = 2)
	public void Login() {
		Login login = new Login(driver);
		login.enterUsername();
		login.enterPassword();
		login.clickLogin();

	}


	@Test (priority = 3)
	public void openNewAccount() {
		NewAccount Account = new NewAccount(driver);
		Account.openNewAccountlink();
		Account.typeofAccount();
		Account.Amount();
		Account.openNewAccount();

	}

	@Test (priority = 4)
	public void AccoutOverview() {
		AccountOverview overview = new AccountOverview(driver);
		overview.accountOverview();
	}

	@Test (priority = 5)
	public void FundTransfer() {
		TransferFund tf = new TransferFund(driver);
		tf.fundTransfer();
		tf.enterAmount();
		tf.selectFromAccount();
		tf.selectToAccount();
		tf.clickTransferButton();
	}
	@Test (priority = 6)
	public void Billpay() {
		BillPay Pay = new BillPay(driver);
		Pay.billpay();
		Pay.PayeeName();
		Pay.Address();
		Pay.City();
		Pay.State();
		Pay.zipcode();
		Pay.Phone();
		Pay.Account();
		Pay.verifyAccount();
		Pay.Amount();
		Pay.fromaccount();
		Pay.sendPayment();
	}
	@Test (priority = 7)
	public void FindTransactions() {

		FindTransaction ft = new FindTransaction(driver);

		// Search By Transaction ID
		ft.clickFindTransactions();
		ft.selectAccount();
		ft.enterTransactionId();
		ft.clickFindByIdButton();

		// Open Find Transactions page again
		ft.clickFindTransactions();
		ft.enterTransactionDate();
		ft.clickFindByDateButton();

		// Open Find Transactions page again
		ft.clickFindTransactions();
		ft.enterFromDate();
		ft.enterToDate();
		ft.clickDateRangeButton();

		// Open Find Transactions page again
		ft.clickFindTransactions();
		ft.enterAmount();
		ft.clickFindByAmountButton();
	}
	@Test (priority = 8)
	public void updateinfo() {
		Updateinfo uc = new Updateinfo(driver);
		uc.clickUpdateInfo();
		uc.enterFirstName();
		uc.enterLastName();
		uc.enterAddress();
		uc.enterCity();
		uc.enterState();
		uc.enterZipCode();
		uc.enterPhone();
		uc.clickUpdateProfile();
	}
	@Test (priority = 9)
	public void RequestLoan() {
		Requestloan rl = new Requestloan(driver);
		rl.clickRequestLoan();
		rl.enterLoanAmount();
		rl.enterDownPayment();
		rl.selectFromAccount();
		rl.clickApplyNow();
	}


	@AfterClass
	public void TearDown() {
		driver.quit();

	}

}



















