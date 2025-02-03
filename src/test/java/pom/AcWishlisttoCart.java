package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcWishlisttoCart {
	
    @FindBy(xpath="//button[text()='Add to Cart']")
    private WebElement cartbtn;
    
    public AcWishlisttoCart(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    public void wishListButton()
    {
    	cartbtn.click();
    }
    
}
