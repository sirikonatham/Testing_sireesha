package testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AcCartPage;
import pom.AcCollectionPage;
import pom.AccountPage;
import pom.MonteCarlo_Loginpage;
import pom.ProductsPage;
import pom.SignInPage;

public class WomenSection extends BaseClass
  {
	@Test
  
   public void womenSectionproduct() throws EncryptedDocumentException, IOException, InterruptedException
    {
	
	MonteCarlo_Loginpage ln=new MonteCarlo_Loginpage(driver);
    ln.signInButton();
    
    SignInPage sg=new SignInPage(driver);	
    sg.emailTextBox();
    sg.passwordTextBox();
    sg.loginbtn();
   
    Assert.assertEquals(driver.getTitle(), datautilities.readingProperytFile("AccountPage"));
    
    AccountPage account=new AccountPage(driver);
    account.searchBox();
    account.searchButton(datautilities.readingProperytFile("searchwomen"));
    account.viewResultBtn();
    ProductsPage pp=new ProductsPage(driver);
    pp.womenJacket();
    
   
    
    
    AcCollectionPage ac=new AcCollectionPage(driver);
    ac.womenDressSize();
    ac.quantitysize();
    
    AcCartPage p=new AcCartPage(driver);
    p.addToCartbtn();
    p.initiatePay();

}
	
  }
