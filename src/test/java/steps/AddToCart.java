package steps;

import java.util.ArrayList;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddToCart {
	
	@Then ("search for product mobile")
	public void  Then_search_for_product_mobile() throws InterruptedException
	{
		AmazonsiginDemo.driver.findElement(By.linkText("Mobiles")).click();
		WebElement mobile = AmazonsiginDemo.driver.findElement(By.xpath("//*[@id='nav-subnav']/descendant::span[2]"));
		Actions a = new Actions(AmazonsiginDemo.driver);
		a.moveToElement(mobile).build().perform();
		Thread.sleep(3000);
	}
 
	@Then ("search for the brand of mobile")
	public void Then_search_for_the_brand_of_mobile() throws InterruptedException
	{
		AmazonsiginDemo.driver.findElement(By.linkText("Apple")).click();
		AmazonsiginDemo.driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[6]/descendant::span[9]")).click();
	    ArrayList<String> tabs = new ArrayList<String>(AmazonsiginDemo.driver.getWindowHandles());
	    AmazonsiginDemo.driver.switchTo().window(tabs.get(1));
		Thread.sleep(1500);
	}
	 @And ("add product to the cart")
	 public void  And_add_product_to_the_cart()
	 {
		 AmazonsiginDemo. driver.findElement(By.id("add-to-cart-button")).click();
	 }
}
