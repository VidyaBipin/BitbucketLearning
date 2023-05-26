 package cta.findnseek.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RolesPermissionsPageObjects {

	public RolesPermissionsPageObjects(WebDriver driver)
	{
		  PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[text()='Roles & Permissions']")
	public
	 WebElement rolesAndPermissionsIcon;
	
	@FindBy(xpath="//span[@id='Add Roles']")
	public
	 WebElement addRolesButton;
	
	@FindBy(xpath="//span[@id='View Log']")
	public
	 WebElement viewLogButton;
	
	@FindBy(xpath="//table[@class='table table-coded']/tbody")
	public
	 WebElement rolesTable;
	
	@FindBy(xpath="//div[@class='no-data']")
	public
	WebElement nodataMsg;
	
	@FindBy(xpath="//span[text()='Role']")
	public
	 WebElement roleIcon;
	
	@FindBy(xpath="//table[@class='table table-coded']/tbody/tr")
	public
	List<WebElement> tableRows;
	
	@FindBy(xpath="//table[@class='table table-coded']/tbody/tr/td[4]/div[1]/img")
	public
	 WebElement roleEditIcon;
	
	@FindBy(xpath="//table[@class='table table-coded']/tbody/tr/td[4]/div[2]/img")
	public
	 WebElement roleDeleteIcon;
	
	@FindBy(xpath="//table[@class='table table-coded']/thead/tr/th[2]/span")
	public
	 WebElement roleDescriptionIcon;
	
	@FindBy(xpath="//table[@class='table table-coded']/thead/tr/th[3]/span")
	public
	 WebElement statusIcon;
	
	@FindBy(xpath="//table[@class='table table-coded']/thead/tr/th[4]/span")
	public
	 WebElement actionIcon;
	
	@FindBy(xpath="//input[@placeholder='Enter role name']")
	public
	 WebElement roleTxtBox;
	@FindBy(xpath="//input[@class='fieldsetInput col-12 transition']")
	public
	 WebElement editroleTxtBox;
	
	
	@FindBy(xpath="//input[@placeholder='Enter description']")
	public
	 WebElement descriptionTxtBox;
	
	
	
	@FindBy(xpath="//div[@class='permissionCheckBorder']/div/span/input[@id='618a519ee5a0fa7c3b6fb5f2']")
	public
	 WebElement rolesPermissionsChkBx;
	
	
	@FindBy(xpath="//div[@class='permissionCheckBorder']/div/span/input[@id='618b51df42e23fd18c3bef60']")
	public
	 WebElement adminUserManagementChkBx;
	
	@FindBy(xpath="//div[@class='permissionCheckBorder']/div/span/input[@id='61972f5d444bd279c8836c3d']")
	public
	 WebElement customPushNotificationChkBx;
	
	@FindBy(xpath="//div[@class='permissionCheckBorder']/div/span/input[@id='61972f8b444bd279c8836c6a']")
	public
	 WebElement planManagementChkBx;
	
	@FindBy(xpath="//div[@class='permissionCheckBorder']/div/span/input[@id='61972faa444bd279c8836c97']")
	public
	 WebElement feedbacksCompliantsChkBx;
	

	@FindBy(xpath="//div[@class='permissionCheckBorder']/div/span/input[@id='61972fbd444bd279c8836cc4']")
	public
	 WebElement reportsChkBx;
	
	@FindBy(xpath="//div[@class='permissionCheckBorder']/div/span/input[@id='61972fe5444bd279c8836cf1']")
	public
	 WebElement generalConfigChkBx;
	
	@FindBy(xpath="//div[@class='permissionCheckBorder']/div/span/input[@id='61c948722be4f24afb538d74']")
	public
	 WebElement appUsersChkBx;
	
	@FindBy(xpath="//div[@class='permissionCheckBorder']/div/span/input[@id='62318806f220f29dd1896d48']")
	public
	 WebElement dashboardChkBx;
	
	@FindBy(xpath="/div[@class='sweet-alert ']/div/following-sibling::div /h5 ")
	public
	 WebElement getAlertTxt;
	@FindBy(xpath="//span[@id='Submit']")
	public
	 WebElement submitButton;
	
	@FindBy(xpath="//a[text()='Continue']")
public
	 WebElement continueButton;
	
	@FindBy(xpath="//a[text()='Confirm']")
	public
		 WebElement confirmButton;
		
	@FindBy(xpath="//table[@class='table table-coded']/thead/tr/th/span[1]")
public
	 WebElement roleSortIcon;
	
	
	@FindBy(xpath="//div[@class='sweet-alert ']/p/a[2]")
	public
		 WebElement roleDeleteConfirmButton;
	
	@FindBy(xpath="//div[@class='sweet-alert ']/p/a")
	public
		 WebElement roleAfterDeleteContinueButton;
	
	@FindBy(xpath="//div[@class='pagination']/li[4]")
	public
		 WebElement forwardPagination;
	
	@FindBy(xpath="//div[@class='pagination']/li")
	public
		List<WebElement> totalPagination;
	
	@FindBy(xpath="//button[@id='Close']")
	public
		 WebElement logCloseButton;
	
	@FindBy(xpath="//h5[text()='Logs - User Roles']/following-sibling::div/div/div/table/tbody/tr[1]")
	public
		 WebElement lastLoggedRole;
	
	
	@FindBy(xpath="//input[@placeholder='Search']")
	public
		 WebElement searchTxtBox;
	
	@FindBy(xpath="//div/h5[text()='Role already exist']")
	public
		 WebElement existingRoleErrMsg;
	
	@FindBy(xpath="//p/a[text()='Cancel']")
	public
		 WebElement cancelRoleAdd;
	
	
}
