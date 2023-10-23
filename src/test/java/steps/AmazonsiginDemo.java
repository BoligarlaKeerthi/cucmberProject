package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmazonsiginDemo {
	
	static WebDriver driver;
	
	@Given("I open the browser and enter URL")
	public void i_open_the_browser_and_enter_url() {
		driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/");
	    
	}

	@Then("I capture the title of the Page")
	public void i_capture_the_title_of_the_page() {
		System.out.println("title of the is page is : "+ driver.getTitle());
	    
	}

	@Then("user mouse hover and click to the sigin")
	public void user_mouse_hover_and_click_to_the_sigin() throws InterruptedException {
		
		WebElement e1=driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		Actions a = new Actions(driver);
		a.moveToElement(e1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
        Thread.sleep(3000);
	    
	}

	@Then("user click on signin")
	public void user_click_on_signin() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
        Thread.sleep(3000);
	    
	}

	@Given("User is on sigin Page")
	public void user_is_on_sigin_page() {
		System.out.println("title of the is page is : "+ driver.getTitle());
	   
	}
	@Then("User enters following details and user click on signin")
	public void User_enters_following_details_and_user_click_on_signin(DataTable dataTable) {
		List<List<String>> userList = dataTable.asLists(String.class);
		for(List<String> e : userList)
		{
			driver.findElement(By.id("ap_email")).sendKeys(e.get(0));
			driver.findElement(By.xpath("//input[@id='continue']")).click();
			driver.findElement(By.id("ap_password")).sendKeys(e.get(1));
			driver.findElement(By.id("signInSubmit")).click();
	}

	}
	
	
}
