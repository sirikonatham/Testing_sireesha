package testscript;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AcCollectionPage;
import pom.AccountPage;
import pom.MonteCarlo_Loginpage;
import pom.SignInPage;

public class DeletingAdress extends BaseClass {
   @Test
   public void deletingAdress() throws FileNotFoundException, IOException, InterruptedException
   {
	   MonteCarlo_Loginpage ln=new MonteCarlo_Loginpage(driver);
	      ln.signInButton();
	      
	     SignInPage sg=new SignInPage(driver);	
	     sg.emailTextBox();
	     sg.passwordTextBox();
	     sg.loginbtn();
	     
	    Assert.assertEquals(driver.getTitle(), datautilities.readingProperytFile("AccountPage"));
	    AccountPage account=new AccountPage(driver);
	    account.editAddress();
	    
	    AcCollectionPage ap=new AcCollectionPage(driver);
	    ap.deletingAdd();
	    utilities.alertacceptpopup(driver);
	    
	    Thread.sleep(5000);
	    
   }
}
