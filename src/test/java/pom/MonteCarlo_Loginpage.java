package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BaseClass;

public class MonteCarlo_Loginpage extends BaseClass {
	
	
   @FindBy(xpath=" //span[contains(text(),'Login/Signup')]")
   private WebElement signinbtn;
   
   public MonteCarlo_Loginpage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   
   public void signInButton()
   {
	   signinbtn.click();
   }
}
