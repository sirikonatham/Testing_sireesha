package testscript;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pom.AcCollectionPage;
import pom.AccountPage;
import pom.MonteCarlo_Loginpage;
import pom.SignInPage;

public class AddingAdreess extends BaseClass{
  @Test
  public void addingAdress() throws FileNotFoundException, IOException
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
    
    AcCollectionPage ac=new AcCollectionPage(driver);
    ac.newAdress();
    ac.firstName(datautilities.readingProperytFile("Firstname"));
    ac.lasttName(datautilities.readingProperytFile("LastName"));
    ac.companyName(datautilities.readingProperytFile("Companyname"));
    ac.phoneNum(datautilities.readingProperytFile("mobileNumber"));
    ac.address1(datautilities.readingProperytFile("Adress1"));
    ac.cityName(datautilities.readingProperytFile("City"));
    ac.zipNum(datautilities.readingProperytFile("ZipCode"));
    utilities.dropDown(ac.getCountry(), "India");
    utilities.dropDown(ac.getPname(), "Andhra Pradesh");
    ac.checkBox();
    ac.addNewAdress();
  }
}
