package testscript;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AcCollectionPage;
import pom.AcWishListPage;
import pom.AccountPage;
import pom.MonteCarlo_Loginpage;
import pom.ProductsPage;
import pom.SignInPage;
import pom.StoresPage;

public class MountCarloHome extends BaseClass {
	
	
	@Test
	public void mountCraloHome() throws FileNotFoundException, IOException, InterruptedException
	{
	MonteCarlo_Loginpage ln=new MonteCarlo_Loginpage(driver);
    ln.signInButton();
    
   SignInPage sg=new SignInPage(driver);	
   sg.emailTextBox();
   sg.passwordTextBox();
   sg.loginbtn();
   
   Assert.assertEquals(driver.getTitle(), datautilities.readingProperytFile("AccountPage"));
   AccountPage a=new AccountPage(driver);
   a.homeLink();
   
   AcCollectionPage ac=new AcCollectionPage(driver);
   ac.shopBlanket();
   
   ProductsPage p=new ProductsPage(driver);
   p.blanketprd();
   
   AcWishListPage wh=new AcWishListPage(driver);
   wh.detailsbtn();
   Reporter.log(wh.adressbtn(),true);
   wh.ourstore();
   
   StoresPage st= new StoresPage(driver);
   st.searchbar(datautilities.readingProperytFile("serachpin"));
   Thread.sleep(3000);
   st.getDirection();
		   
   
   
	}
}
