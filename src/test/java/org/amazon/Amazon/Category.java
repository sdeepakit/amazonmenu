package org.amazon.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Category {
	static WebDriver driver;
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "I:\\Users\\Deepak\\workspace\\Amazon\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
    WebElement click_electronic = driver.findElement(By.xpath("//span[text()='Category']"));
    //click_electronic.click();
    Actions click = new Actions(driver);
    click.moveToElement(click_electronic).build().perform();
    WebElement click_electronic_mobile_parent = driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
    //click_electronic_mobile.click();
    Actions click1 = new Actions(driver);
    click1.moveToElement(click_electronic_mobile_parent).build().perform();
    
    WebElement click_electronic_mobile_child = driver.findElement(By.xpath("//span[text()='All Mobile Phones']"));
    click_electronic_mobile_child.click();
}
}
