package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstants;
import generics.BasePage;
import generics.ExcelLibrary;

public class PomActitime extends BasePage implements AutoConstants
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoggedInCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotYourPasswordLink;

	public PomActitime(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void loginMethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet_name, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet_name, 1, 1));
		keepMeLoggedInCheckbox.click();
		loginButton.click();
	}
	
	public void forgotPassword()
	{
		forgotYourPasswordLink.click();
	}

}

