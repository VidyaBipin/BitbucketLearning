package cta.findnseek.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetailsPageObjects {
	
	public PaymentDetailsPageObjects(WebDriver driver)
	{
		  PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	public
	WebElement searchTxtBox;
	
	
	@FindBy(xpath="//div/button[@class='dropdown-toggle btn btn-primary']")
	public
	WebElement selectStatusButtn;


	@FindBy(xpath="//span/label[text()='Payment Details']")
	public
	WebElement paymentDetailsIcon;
	
	@FindBy(xpath="//table[@class='table table-coded']/tbody")
	public
	WebElement paymentTable;
	
	@FindBy(xpath="//div/a[@class='dropdown-item']")
	public
	List<WebElement> statusDropDwn;
	
}
