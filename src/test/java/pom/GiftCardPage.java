package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardPage {
   @FindBy(xpath="(//div[contains(@class,'cts-collection')])[11]")
   private WebElement gifts;
   
   public GiftCardPage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void giftCard()
   {
	   gifts.click();
   }
}
