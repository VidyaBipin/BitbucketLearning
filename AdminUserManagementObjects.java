package cta.findnseek.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminUserManagementObjects {

	public AdminUserManagementObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@id='/admin-user-management']")
	public WebElement adminUserManagementIcon;

	@FindBy(xpath = "//button[@id='Add Admin User']")
	public WebElement addAdminUserButton;

	@FindBy(xpath = "//input[@placeholder='Enter user name']")
	public WebElement usernameTxtBx;

	@FindBy(xpath = "//input[@placeholder='Enter email address']")
	public WebElement useremailTxtBx;

	@FindBy(xpath = "//button[@id='Submit']/span")
	public WebElement submitButtn;

	@FindBy(xpath = "//input[@placeholder='Enter phone number']")
	public WebElement userphnTxtBx;

	@FindBy(xpath = "//div/button[text()='Select role']")
	public WebElement selectRoleTxtBox;

	@FindBy(xpath = "//div[@class='dropdownContainer col-lg-6 col-md-6 col-12']/div/fieldset/div/div/div")
	public List<WebElement> roleDropDown;

	@FindBy(xpath = "//a[text()='Continue']")
	public WebElement continueButton;

	@FindBy(xpath = "//div[@class='no-data']")
	public WebElement nodataMsg;

	@FindBy(xpath = "//table[@class='table table-coded']/tbody")
	public WebElement adminUserTable;

	@FindBy(xpath = "//button[@id='Add']")
	public WebElement add;

	@FindBy(xpath = "//div[@class='row']/div[1]/p[2]")
	public WebElement viewUsername;

	@FindBy(xpath = "//div[@class='row']/div[3]/p[2]")
	public WebElement viewUserphone;

	@FindBy(xpath = "//button/span[text()='Back']")
	public WebElement backButtn;

	@FindBy(xpath = "//a[text()='Confirm']")
	public WebElement confirmButton;

	@FindBy(xpath = "//span[@id='View Log']")
	public WebElement viewLogButton;

	@FindBy(xpath = "//span[@id='Cancel']")
	public WebElement viewLogCancelIcon;

	@FindBy(xpath = "//div/button[text()='Code']")
	public WebElement countryCodeButtn;

	@FindBy(xpath = "//div[@class='col-12 menuList  show dropdown']/div/div")
	public List<WebElement> countryCodeDropdown;

	@FindBy(xpath = "//h5[text()='Admin User Logs']/following-sibling::div/div/div/table/tbody/tr")
	public WebElement lastLoggedRow;

	@FindBy(xpath = "//table[@class='table table-coded']/thead/tr/th/span[1]")
	public WebElement nameSortIcon;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement searchBx;

	@FindBy(xpath = "//h2[text()='ERROR!']")
	public WebElement invalidMailMsg;

	@FindBy(xpath = "//p/a[text()='Cancel']")
	public WebElement cancelUserAdd;

	@FindBy(xpath = "//div[@class='pagination']/li[4]")
	public WebElement forwardPagination;

	@FindBy(xpath = "//div[@class='pagination']/li")
	public WebElement backwardPagination;

	@FindBy(xpath = "//div[@class='pagination']/li")
	public List<WebElement> totalPagination;

	@FindBy(xpath = "//h5[contains(text(),'User created successfully.')]")
	public WebElement createUserSuccessMsg;

	@FindBy(xpath = "//h2[contains(text(),'Are you sure?')]")
	public WebElement confirmationMsg;
	
	@FindBy(xpath = "//h5[contains(text(),'User updated successfully.')]")
	public WebElement editUserSuccessMsg;
}
