package cta.findnseek.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjects {
	
	public LoginObjects(WebDriver driver)
	{
		  PageFactory.initElements(driver, this);
	}
	
 @FindBy(xpath="//input[@placeholder='Enter your email address']")
public
 WebElement userTxtBox;
 
 @FindBy(xpath="//input[@placeholder='Enter your password']")
public
 WebElement passwordTxtBox;
  
 @FindBy(xpath="//button[@id='LOGIN']")
public
 WebElement logInButton;
 
 @FindBy(xpath="//label[text()='Dashboard']")
 public WebElement dashboard;
 
 @FindBy(xpath="//a[text()='Cancel']")
 public WebElement cancelButton;
 
 @FindBy(xpath="//a[text()='Try Again']")
 public WebElement tryAgainButton;

 @FindBy(xpath="//h5[text()='Please check your credentials']")
 public WebElement loginErrorMsg;

}
