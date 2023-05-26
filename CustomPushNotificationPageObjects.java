package cta.findnseek.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomPushNotificationPageObjects {
	public CustomPushNotificationPageObjects (WebDriver driver)
	{
		 PageFactory.initElements(driver, this);


	}
	
	@FindBy(xpath="//span/label[text()='Custom Push Notification']")
	public
	 WebElement customPushNotificatnIcon;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	public
	 WebElement searchTxtField;
	
	@FindBy(xpath="//span[@id='Add Notfication']")
	public
	 WebElement addNotificatnButtn;
	
	@FindBy(xpath="//div/button[text()='Select audience']")
	public
	 WebElement selectAudienceField;
	
	@FindBy(xpath="//div/button[text()='Select gender']")
	public
	 WebElement selectGenderField;
	
	@FindBy(xpath="//div[@class='col-12 menuList  show dropdown']/div/div")
	public
	List<WebElement> dropDwn;

	
	@FindBy(xpath="//textarea[@class='textareaPlace']")
	public
	WebElement messageContentTxtField;
	
	@FindBy(xpath="(//div[@class='enb-radio'])[4]")
	public
    WebElement nowButtn;
	
	
	@FindBy(xpath="(//div[@class='enb-radio'])[5]")
	public
    WebElement scheduleButtn;
	
	@FindBy(xpath="//a[text()='Continue']")
	public
	 WebElement continueButtn;
	
	@FindBy(xpath="//a[text()='Confirm']")
	public
    WebElement confirmButtn;
	
	@FindBy(xpath="(//button[@class='dropdown-toggle btn btn-primary'])[3]")
	public
    WebElement HHButtn;
	
	@FindBy(xpath="(//button[@class='dropdown-toggle btn btn-primary'])[4]")
	public
    WebElement MMButtn;
	
	@FindBy(xpath="//button[@id='Submit']")
	public
	 WebElement submitButtn;
	
	@FindBy(xpath="//div[text()='Select Date']/following-sibling::img")
	public
	 WebElement selectDateIcon;
	
	@FindBy(xpath="//div[@class='no-data']")
	public
	 WebElement noDataMsg;
	
	
	@FindBy(xpath="//div[@class='react-datepicker__month-container']")
	public
	 WebElement monthContainer;
	
	@FindBy(xpath="//div[@class='pagination']/li")
	public
	List< WebElement> totalPagination;
	
	@FindBy(xpath="//table[@class='table table-coded']/tbody")
	public
	 WebElement notificatnTable;
	
}
