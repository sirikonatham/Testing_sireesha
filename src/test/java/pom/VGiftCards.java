package pom;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BaseClass;

public class VGiftCards extends BaseClass {
   @FindBy(xpath="(//label[@class='block-swatch__item'])[2]")
   private WebElement vcards;
   
   @FindBy(id="name")
   private WebElement userName;
   @FindBy(id="mobilenumber")
   private WebElement number;
   @FindBy(id="email")
   private WebElement emailtextbox;
   @FindBy(id="message")
   private WebElement msg;
   @FindBy(id="buy-now-gift")
   private WebElement buy;
   public VGiftCards(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   public void vCards()
   {
	   vcards.click();
   }
   
   public void userNameTextbox(String name) 
   {
	   userName.sendKeys(name);
   }
   public void mobileNumberTextbox(String name) 
   {
	   number.sendKeys(name);
   }
   
   public void emailTextBox(String name) 
   {
	   emailtextbox.sendKeys(name);
   }
   public void messageBox(String name)
   {
	   msg.sendKeys(name);
   }
   public void buyProduct()
   {
	   buy.click();
   }
}
