package testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AcCartPage;
import pom.AcCollectionPage;
import pom.AcWishListPage;
import pom.AcWishlisttoCart;
import pom.AccountPage;
import pom.MonteCarlo_Loginpage;
import pom.SignInPage;

public class AddToCart extends BaseClass {
    @Test
public void addToCart() throws EncryptedDocumentException, IOException, InterruptedException
{       
    	
    	MonteCarlo_Loginpage ln=new MonteCarlo_Loginpage(driver);
         ln.signInButton();
         
        SignInPage sg=new SignInPage(driver);	
        sg.emailTextBox();
        sg.passwordTextBox();
        sg.loginbtn();
        
       Assert.assertEquals(driver.getTitle(), datautilities.readingProperytFile("AccountPage"));
       AccountPage account=new AccountPage(driver);

       utilities.mouseHover(account.getHomefurnish(), driver);
       Thread.sleep(3000);
       account.acComforter();
       
       
       AcCollectionPage acc=new AcCollectionPage(driver);
       acc.sizeButton();
       acc.sizeButtonSignle();
       acc.colorButton();
       acc.colorButtonCheckbox();
       acc.brandbtn();
       acc.brandButtonCheckbox();
       acc.avaliablebtn();
       acc.avlCheckbox();
       acc.productimg();
       
       
       
       AcWishListPage ws= new AcWishListPage(driver);
       ws.wishButton();
       ws.wishListpage();
       
       
       AcWishlisttoCart cart=new AcWishlisttoCart(driver);
       cart.wishListButton();
       
       AcCartPage ct=new AcCartPage(driver);
       ct.addtoCart();
       
       
        
    	
}
}
