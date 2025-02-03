package testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AccountPage;
import pom.GiftCardPage;
import pom.MonteCarlo_Loginpage;
import pom.SignInPage;
import pom.VGiftCards;

public class GiftCard extends BaseClass {
	@Test
	public void giftCards() throws EncryptedDocumentException, IOException{
	MonteCarlo_Loginpage ln=new MonteCarlo_Loginpage(driver);
    ln.signInButton();
    
   SignInPage sg=new SignInPage(driver);	
   sg.emailTextBox();
   sg.passwordTextBox();
   sg.loginbtn();
   
  Assert.assertEquals(driver.getTitle(), datautilities.readingProperytFile("AccountPage"));
  AccountPage ap=new AccountPage(driver);
  ap.giftCards();
  Assert.assertEquals(driver.getTitle(),datautilities.readingProperytFile("Giftcardspage"));
 
   GiftCardPage g=new GiftCardPage(driver);
   g.giftCard();
   VGiftCards vg=new VGiftCards(driver);
   vg.userNameTextbox(datautilities.readingProperytFile("username"));
   vg.mobileNumberTextbox(datautilities.readingProperytFile("mobileNumber"));
   vg.emailTextBox(datautilities.readingProperytFile("Email"));
   vg.messageBox(datautilities.readingProperytFile("Message"));
   vg.buyProduct();
   
  
  
	}
}
