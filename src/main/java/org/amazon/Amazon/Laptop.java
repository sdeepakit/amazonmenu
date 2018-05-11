package org.amazon.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Laptop 
{
	WebDriver driver;
	@Given("^the user in Amazon home page$")
	public void the_user_in_Amazon_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "I:\\Users\\Deepak\\workspace\\Amazon\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

	@When("^the user search various \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" in search box$")
	public void the_user_search_various_in_search_box(String hp, String dell, String acer, String apple, String iball) throws Throwable {
		 WebDriverWait wait = new WebDriverWait(driver,20);
		
		 //HP Laptop model
		WebElement search_hp = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
	    search_hp.sendKeys(hp);
	    WebElement click_search_hp = driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input"));
	    click_search_hp.click();
	    WebElement click_hplaptop = driver.findElement(By.xpath("//*[@id='result_1']/div/div/div/div[2]/div[1]/div[1]/a/h2"));
	    click_hplaptop.click();
	    for (String handle : driver.getWindowHandles()) {
	        driver.switchTo().window(handle);
	        }
	    WebElement click_addcart_hp = driver.findElement(By.xpath("//*[@id='add-to-cart-button']"));
	    click_addcart_hp.click();
	    
	    //Dell Laptop model
	    
	    WebElement search_dell = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
	    search_dell.sendKeys(dell);
	    WebElement click_search_dell = driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input"));
	    click_search_dell.click();
	    WebElement click_delllaptop = driver.findElement(By.xpath("//*[@id='result_0']/div/div[3]/div[1]/a/h2"));
	    click_delllaptop.click();
	    for (String handle : driver.getWindowHandles()) {
	        driver.switchTo().window(handle);
	        }
	   
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='add-to-cart-button']")));
	    
	    WebElement click_addcart_dell = driver.findElement(By.xpath("//*[@id='add-to-cart-button']"));
	    click_addcart_dell.click();
	    
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='siNoCoverage-announce']")));
	    WebElement click_close_dell = driver.findElement(By.xpath("//*[@id='siNoCoverage-announce']"));
	    click_close_dell.click();
	    
	    //Acer Laptop model
	    
	    //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='twotabsearchtextbox']")));
	    WebElement search_acer = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
	    search_acer.sendKeys(acer);
	    WebElement click_search_acer = driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input"));
	    click_search_acer.click();
	}

	@Then("^the user has to verifing the particular Laptop added in cart or not$")
	public void the_user_has_to_verifing_the_particular_Laptop_added_in_cart_or_not() throws Throwable {
	   
	}

}
