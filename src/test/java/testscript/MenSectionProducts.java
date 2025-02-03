package testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AcCollectionPage;
import pom.AcWishListPage;
import pom.AccountPage;
import pom.MonteCarlo_Loginpage;
import pom.ProductsPage;
import pom.SignInPage;

public class MenSectionProducts extends BaseClass{
    @Test
    public void menSection() throws EncryptedDocumentException, IOException, InterruptedException
    {
    	MonteCarlo_Loginpage ln=new MonteCarlo_Loginpage(driver);
        ln.signInButton();
        
       SignInPage sg=new SignInPage(driver);	
       sg.emailTextBox();
       sg.passwordTextBox();
       sg.loginbtn();
       
      Assert.assertEquals(driver.getTitle(), datautilities.readingProperytFile("AccountPage"));
     
      AccountPage acc=new AccountPage(driver);
      utilities.mouseHover( acc.getMen(), driver);
      acc.menButton();
      
      
      
      AcCollectionPage account=new AcCollectionPage(driver);
      account.minPrice1(datautilities.readingProperytFile("MinPrice1"));
      account.maxPrice1(datautilities.readingProperytFile("MaxPrice1"));
      account.sizeButton();
      account.menSizebtn();
      account.brandbtn();
      account.menBrandbtn();;
      account.slvButton();
      account.slvCheckBox();  
      account.menProducts();
      
      AcWishListPage wh=new AcWishListPage(driver);
      wh.pinCode(datautilities.readingProperytFile("pincode"));
      wh.checkBox();
    }
}
