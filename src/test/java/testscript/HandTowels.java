package testscript;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AcCollectionPage;
import pom.AcWishListPage;
import pom.AccountPage;
import pom.MonteCarlo_Loginpage;
import pom.SignInPage;

public class HandTowels extends BaseClass{

@Test
public void handTowels() throws FileNotFoundException, IOException, InterruptedException
{
	MonteCarlo_Loginpage ln=new MonteCarlo_Loginpage(driver);
    ln.signInButton();
    
   SignInPage sg=new SignInPage(driver);	
   sg.emailTextBox();
   sg.passwordTextBox();
   sg.loginbtn();
   
   Assert.assertEquals(driver.getTitle(), datautilities.readingProperytFile("AccountPage"));
   AccountPage ac=new AccountPage(driver);
   ac.searchBox();
   ac.searchButton(datautilities.readingProperytFile("search"));
   ac.handtowel();
   
   AcCollectionPage ap=new AcCollectionPage(driver);
    ap.towelWishlist();
    ap.wishPage();
    
    AcWishListPage wh=new AcWishListPage(driver);
    Thread.sleep(5000);
    utilities.mouseHover(wh.getWishpageprd(), driver);
    Thread.sleep(3000);
    wh.closeButton();
}
}
