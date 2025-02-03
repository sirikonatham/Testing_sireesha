package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcCartPage {

	@FindBy(xpath="//div[@class='cart-area']")
	private WebElement cart;
	
	@FindBy(xpath="(//span[@class='loader-button__text'])[2]")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[text()='Start shopping']")
	private WebElement shop;
	@FindBy(xpath="//button[contains(@class,'checkout-button button button')]")
	private WebElement initiate;
	public AcCartPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public void addtoCart()
	{
		cart.click();
	}
	public void addToCartbtn()
	{
		addtocart.click();
	}
	
	public void initiatePay()
	{
		initiate.click();
	}
	public void shopping()
	{
		shop.click();
	}
}
