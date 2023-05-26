package cta.findnseek.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralConfigurationPageObjects {
	public GeneralConfigurationPageObjects (WebDriver driver)
	{
		 PageFactory.initElements(driver, this);


	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	public
	 WebElement searchFilter;
	
	@FindBy(xpath="//span/label[text()='General Configuration']")
	public
	 WebElement generalConfigIcon;
	
	@FindBy(xpath="//div[@class='stampFirstBtn']/div[2]/b[text()='Registration Configuration']")
	public
	 WebElement registratnConfigIcon;
	@FindBy(xpath="//div[@class='table-panel']/div/div[1]")
	public
	 WebElement ethnicityIcon;
	
	@FindBy(xpath="//div[@class='table-panel']/div/div[2]")
	public
	 WebElement passionIcon;
	
	@FindBy(xpath="//div[@class='table-panel']/div/div[3]")
	public
	 WebElement proficiencyIcon;
	
	@FindBy(xpath="//div[@class='table-panel']/div/div[4]")
	public
	 WebElement religionIcon;
	@FindBy(xpath="//div[@class='stampFirstBtn']/div[2]/b[text()='Feedback and Complaint']")
	public
	 WebElement feedbackComplaintsIcon;
	
	@FindBy(xpath="//input[@placeholder='Enter the subject']")
	public
	 WebElement addSubjectTxtField;
	
	@FindBy(xpath="//button[@class='dropdown-toggle btn btn-primary']")
	public
	 WebElement statusButton;
	
	@FindBy(xpath="//button[@id='Submit']")
	public
	 WebElement submitButtn;
	
	
	@FindBy(xpath="//button/span[text()='Back']")
	public
	 WebElement backButtn;

	
	
	@FindBy(xpath="//div[@id='customDropDown']/a[text()='Enable']")
	public
	 WebElement statusEnable;
	
	@FindBy(xpath="//div[@id='customDropDown']/a[text()='Disable']")
	public
	 WebElement statusDisable;
	
	@FindBy(xpath="//button[@id='Add']")
	public
	 WebElement AddButtn;
	
	@FindBy(xpath="//a[text()='Continue']")
	public
	 WebElement continueButtn;
	
	@FindBy(xpath="//table[@class='table table-coded']/tbody/tr")
	public
	List<WebElement> subjectTablerows;
	
	@FindBy(xpath="//table[@class='table table-coded']/tbody/tr")
	public static
	WebElement Tablerows;
	
	 @FindBy(xpath="//input[@placeholder='Search']")
	public
	 WebElement searchBx;
	
	
	@FindBy(xpath="//input[@placeholder='Enter ethnicity name']")
	public
	WebElement ethnicityTxtField;
	 
	@FindBy(xpath="//a[text()='Confirm']")
	public
	WebElement confirmButtn;
	
	@FindBy(xpath="//div[@class='pagination']/li[4]")
	public
	WebElement pagination;
	

	@FindBy(xpath="//div[@class='pagination']/li")
	public
	List<WebElement> totalPagination;
	
	@FindBy(xpath="//table[@class='table table-coded']/tbody/tr")
	public
	WebElement feedbackSubjectTable;
	
	@FindBy(xpath="//input[@placeholder='Enter passion name']")
	public
	WebElement passionTxtField;
	
	@FindBy(xpath="//input[@placeholder='Enter proficiency name']")
	public
	WebElement proficiencyTxtField;
	
	@FindBy(xpath="//input[@placeholder='Enter religion name']")
	public
	WebElement religionTxtField;
	//test
	/*@FindBy(xpath="//table[@class='table table-coded']")
	public
	List<WebElement> */
	
}
