package testscript;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AcCartPage;
import pom.AcCollectionPage;
import pom.AcWishListPage;
import pom.MonteCarlo_Loginpage;
import pom.SignInPage;

public class EmptyCart extends BaseClass {
@Test
public void emptyCart() throws FileNotFoundException, IOException, InterruptedException
{
	MonteCarlo_Loginpage ln=new MonteCarlo_Loginpage(driver);
    ln.signInButton();
    
   SignInPage sg=new SignInPage(driver);	
   sg.emailTextBox();
   sg.passwordTextBox();
   sg.loginbtn();
   
  Assert.assertEquals(driver.getTitle(), datautilities.readingProperytFile("AccountPage"));
  
  AcCartPage a=new AcCartPage(driver);
  a.addtoCart();
  a.shopping();
  
  AcCollectionPage ac=new AcCollectionPage(driver);
  ac.sortBy();
 
  ac.sortFilter();
  ac.products();
  
  AcWishListPage w=new AcWishListPage(driver);
  w.addToCartbtn();
  
  w.orderNote();
  w.orderNoteTxt(datautilities.readingProperytFile("ordernote"));
 
  w.saveText();
 
  w.addTocartCls();
 
  }
}
