package steps;

import java.util.ArrayList;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WishList {
	
	 @Given("user search for product")
	 public void  Given_user_search_for_product() throws InterruptedException
	 {
		 AmazonsiginDemo.driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
		 AmazonsiginDemo.driver.findElement(By.id("twotabsearchtextbox")).submit();
			Thread.sleep(1500);
	 }
	@ And ("select the product")
	public void  And_select_the_product() throws InterruptedException
	{
		AmazonsiginDemo.driver.findElement(By.xpath("(//div[@class='a-section'])[2]/descendant::span[11]")).click();
		ArrayList<String> tabs = new ArrayList<String>(AmazonsiginDemo.driver.getWindowHandles());
		AmazonsiginDemo.driver.switchTo().window(tabs.get(1));
		Thread.sleep(1500);
	}
	@Then ("click add wishlist")
	public void Then_click_add_wishlist() throws InterruptedException
	{
		AmazonsiginDemo.driver.findElement(By.id("wishlistButtonStack")).click();
		Thread.sleep(2000);
		AmazonsiginDemo.driver.quit();
	}

}
