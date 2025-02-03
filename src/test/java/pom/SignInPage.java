package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BaseClass;

public class SignInPage extends BaseClass {
  @FindBy(id="customer[email]")
  private WebElement email;
  
  @FindBy(id="customer[password]")
  private WebElement password;
  
  @FindBy(xpath="//span[text()='Login']")
  private WebElement login;
  
  
  public SignInPage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  public void emailTextBox() throws EncryptedDocumentException, IOException
  {
	  email.sendKeys(datautilities.readingExcelFile("Sheet1", 1, 1)); 
  }
  public void passwordTextBox() throws EncryptedDocumentException, IOException
  {
	  password.sendKeys(datautilities.readingExcelFile("Sheet1", 1, 2));
  }
	public void loginbtn()
	{
		login.click();
	}
}
