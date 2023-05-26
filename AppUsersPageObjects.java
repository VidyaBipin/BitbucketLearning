package cta.findnseek.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppUsersPageObjects {
	
	public AppUsersPageObjects(WebDriver driver)
	{
		  PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//table[@class='table table-coded']/tbody")
	public
	WebElement userTable;
	
	@FindBy(xpath="//table[@class='table table-coded']/tbody/tr/td[5]")
	public
	WebElement userStatus;
	
	@FindBy(xpath="//div[@class='feedbackDropdown']/div/button")
	public
	WebElement userStatusButton;
	@FindBy(xpath="//div[@class='feedbackDropdown']/div/div/a")
	public
	List<WebElement> userStatusList;
	
	@FindBy(xpath="//div[@class='row']/div[2]/div/h5")
	public
	WebElement userPhn;
	
	@FindBy(xpath="//div[@class='row']/div[3]/div/h5")
	public
	WebElement userDOB;

	@FindBy(xpath="//div[@class='row']/div[4]/div/h5")
	public
	WebElement userGender;
	

	@FindBy(xpath="//div[@class='row']/div[5]/div/h5")
	public
	WebElement accntCreated;
	
	@FindBy(xpath="//div[@class='outerUserAppProfile row']/div/div/h5")
	public
	WebElement sexOrientatn;
	
	@FindBy(xpath="//div[@class='outerUserAppProfile row']/div[2]/div/h5")
	public
	WebElement proficiency;
	
	@FindBy(xpath="//div[@class='outerUserAppProfile row']/div[6]/div/h5")
	public
	WebElement interestedIn;
	
	@FindBy(xpath="//div[@class='outerUserAppProfile']/div/div/div/h6")
	public
	WebElement passion;
	
	@FindBy(xpath="//div[@class='listProfileImages']/div/div/div/img")
	public
	List<WebElement> photos;

	@FindBy(xpath="//span[@id='/app-users']")
	public
	WebElement appUsersIcon;
	
	@FindBy(xpath="//div[@class='block-button']/button/span[text()='Back']")
	public
	WebElement backButton;
	
	@FindBy(xpath="//button[@class='btn-close']")
	public
	WebElement picturecloseButton;
	
	
	@FindBy(xpath="(//div[@class='pagination']/li)[14]")
	public
	WebElement forwardPagination;
	
	@FindBy(xpath="//button[@id='Block']")
	public
	WebElement blockButton;
	
	@FindBy(xpath="//button[@id='Reject']")
	public
	WebElement rejectButton;
	
	@FindBy(xpath="//button[@id='Approve']")
	public
	WebElement approveButton;
	
	@FindBy(xpath="//button[@id='Unblock']")
	public
	WebElement unblockButton;
	
	@FindBy(xpath="//p/a[text()='Confirm']")
	public
	WebElement confirm;
	
	@FindBy(xpath="//p/a[text()='Continue']")
	public
	WebElement continueButton;
	
	@FindBy(xpath="//div/input[@placeholder='Search']")
	public
	WebElement SearchBx;
	
	@FindBy(xpath="//div[@class='listProfileImages']/div")
	public
	WebElement profileImages;
	

	
	@FindBy(xpath="//div[@class='popupImgView']/img")
	public
	WebElement poppedupImage;
	
}
