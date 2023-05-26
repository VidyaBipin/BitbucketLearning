package cta.findnseek.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeedbacksComplaintsPageObjects {
	
	public FeedbacksComplaintsPageObjects(WebDriver driver)
	{
		  PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	public
	WebElement searchTxtBox;

	@FindBy(xpath="//table[@class='table table-coded']/tbody")
	public
	WebElement FeedbackComplaintsTable;
	
	@FindBy(xpath="//span/label[text()='Feedback & Complaints']")
	public
	WebElement feedbackAndComplaintsIcon;
	
	@FindBy(xpath="//div[@class='pagination']/li")
	public
	List<WebElement> totalPagination;
	
	@FindBy(xpath="//div/button[@class='dropdown-toggle btn btn-primary']")
	public
	WebElement selectStatusButtn;
	
	
	@FindBy(xpath="(//div/button[@class='dropdown-toggle btn btn-primary'])[2]")
	public
	WebElement assignToField;
	
	
	@FindBy(xpath="(//div/button[@class='dropdown-toggle btn btn-primary'])[3]")
	public
	WebElement statusField;
	

	@FindBy(xpath="//textarea[@class='textareaPlace']")
	public
	WebElement addCommentTxtBox;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']/div/a")
	public
	List<WebElement> dropDwn;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']/a")
	public
	List<WebElement> statusDropDwn;
	
	@FindBy(xpath="//button/span[@id='Submit']")
	public
	WebElement submitButton;
	
	
	@FindBy(xpath="//a[text()='Confirm']")
	public
	WebElement confirmButton;
	
	@FindBy(xpath="//a[text()='Continue']")
	public
	WebElement continueButton;
	
	
	@FindBy(xpath="(//table[@class='table table-coded']/tbody)[2]")
	public
	WebElement logsTable;
	
	@FindBy(xpath="//button/span[text()='Back']")
	public
	WebElement backButtn;
	
	
	
	
	
	
}
