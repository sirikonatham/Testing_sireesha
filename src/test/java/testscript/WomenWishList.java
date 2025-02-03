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
import pom.ProductsPage;
import pom.SignInPage;

public class WomenWishList extends BaseClass {
  @Test
  public void womenWishlist() throws FileNotFoundException, IOException, InterruptedException
  {
      
    AccountPage ap=new AccountPage(driver);
    ap.womenList();
    AcCollectionPage ac=new AcCollectionPage(driver);
    ac.womenText();
    ProductsPage p=new ProductsPage(driver);
    p.minPrice(datautilities.readingProperytFile("MinPrice"));
    p.maxPrice(datautilities.readingProperytFile("MaxPrice"));
    
    Thread.sleep(4000);
    p.resetFilter();
    
    Thread.sleep(3000);
    
    p.minPrice1(datautilities.readingProperytFile("MinPrice1"));
    p.maxPrice1(datautilities.readingProperytFile("MaxPrice1"));
    
    p.womenDress();
    Thread.sleep(3000);
    AcWishListPage awp=new AcWishListPage(driver);
    awp.wish();
    Thread.sleep(3000);
    awp.emailpop(datautilities.readingProperytFile("Email"));
    Thread.sleep(3000);
    awp.addText();
    
    
    
  }
}
