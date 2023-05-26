package cta.findnseek.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlanManagementObjects {
	
	public PlanManagementObjects(WebDriver driver)
	{
		  PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@id='Add New Plan']")
	public
	WebElement addNewPlanButton;
	
	@FindBy(xpath="//input[@placeholder='Enter your plan name']")
	public
	WebElement planName;
	
	@FindBy(xpath="//input[@placeholder='Enter your description']")
	public
	WebElement planDescription;
	
	
	@FindBy(xpath="//input[@id='61a769f4758703eb3a48d65d']")
	public
	WebElement featuresChat;
	
	@FindBy(xpath="//input[@id='61aa136f469ccd4debfa8092']")
	public
	WebElement featuresVideo;
	
	@FindBy(xpath="//input[@id='61aa1384469ccd4debfa8093']")
	public
	WebElement planFeaturesProfile;
	
	@FindBy(xpath="//input[@placeholder='Enter price']")
	public
	WebElement priceUSD;
	
	@FindBy(xpath="//div[@class='react-datepicker__week']/div[@aria-disabled='false']")
	public
	List<WebElement> dates;
	
	@FindBy(xpath="//div[@class='react-datepicker__header ']/div")
	public
	WebElement monthyear;

	@FindBy(xpath="(//div[@class='d-flex']/img)[1]")
	public
	WebElement startDateIcon;
	

	@FindBy(xpath="//div[@class='react-datepicker__month-container']")
	public
	WebElement wholeCalenderContainer;
	
	@FindBy(xpath="(//div[@class='d-flex']/img)[2]")
	public
	WebElement endDateIcon;
	
	@FindBy(xpath="(//div[@class='enb-radio']/label)[1]")
	public
	WebElement activeButtn;
	
	@FindBy(xpath="//input[@placeholder='Duration in days']")
	public
	WebElement duration;
	@FindBy(xpath="//h2[text()='ERROR!']")
	public
	WebElement errorMsg;
	
	@FindBy(xpath="//p/a[text()='Cancel']")
	public
	WebElement planCancelButtn;
	@FindBy(xpath="//div[@class='stampSecondItem']/b")
	public
	List<WebElement> planNames;
	
	
	
	@FindBy(xpath="(//div[@class='stampFirstBtn'])[1]")
	public
	WebElement newPlan;
	@FindBy(xpath="//div[@class='borderBoxWrappers']/p")
	public
	WebElement displayedNewPlan;
	
	
	@FindBy(xpath="//div[@class='container']/div/div[1]/p[2]")
			public
	WebElement priceDisplayed;
	
	@FindBy(xpath="//div[@class='container']/div/div[2]/p[2]")
	public
WebElement startdateDisplayed;
	
	@FindBy(xpath="//div[@class='container']/div/div[3]/p[2]")
	public
WebElement enddateDisplayed;

	@FindBy(xpath="//div[@class='container']/div/div[4]/p[2]")
	public
WebElement duratnDisplayed;
	
	@FindBy(xpath="//div[@class='container']/div/div[5]/p[2]")
	public
WebElement statusDisplayed;
	
	@FindBy(xpath="//div[@class='descriptionContainer']/p[2]")
	public
WebElement descriptnDisplayed;
	
	//div[@class='descriptionContainer']/p[2]
	
	@FindBy(xpath="//button[@id='Edit']")
	public
	WebElement newPlanEditButtn;
	
	@FindBy(xpath="//a[text()='Confirm']")
	public
	WebElement planConfirmButtn;
	
	@FindBy(xpath="//a[text()='Continue']")
	public
	WebElement planContinueButtn;
	

	@FindBy(xpath="//button[@id='dropdown-basic']/span")
	public
	WebElement profile;
	
	

	@FindBy(xpath="//button[@id='Delete']")
	public
	WebElement newPlanDeleteButtn;
	
	@FindBy(xpath="//button[@id='View Log']")
	public
	WebElement viewLogButtn;
	
	@FindBy(xpath="//table[@class='table table-coded']/tbody")
			public
	WebElement viewLogTable;
	
	@FindBy(xpath="//button[@id='Close']")
	public
WebElement closeButtn;
	
	@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--015 react-datepicker__day--keyboard-selected react-datepicker__day--today']")
	public
WebElement currentDate;
	
	@FindBy(xpath="//button[@id='Save Plan']")
	public
WebElement savePlanButtn;
	
	
	@FindBy(xpath="//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")
	public
	WebElement forwrdMonth;
	
	@FindBy(xpath="(//div[@class='enb-radio']/label)[2]")
	public
	WebElement inactiveButtn;
	
	@FindBy(xpath=" //span[@id='/plan-management']")
	public
	WebElement planManagementIcon;
	
	@FindBy(xpath="//span[@id='Add Plan']")
	public
	WebElement addPlanButton;
	
	
	
}
