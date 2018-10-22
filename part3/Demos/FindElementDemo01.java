package SeleniumPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementDemo01
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.bin",
				"C:/Users/chenitha/AppData/Local/Mozilla Firefox/firefox.exe");
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("network.proxy.type", 1);
        profile.setPreference("network.proxy.http", "10.219.96.26");
        profile.setPreference("network.proxy.http_port", 8080);
        profile.setPreference("network.proxy.ssl", "10.219.96.26");
        profile.setPreference("network.proxy.ssl_port", 8080);
        
        FirefoxDriver driver = new FirefoxDriver(profile);
		//driver.get("file:///D:/Users/chenitha/Desktop/Recipe_class_registration.html");
        driver.get("http://demo.opencart.com");
        driver.
		Thread.sleep(1000);
		System.out.println(driver.getTitle());

		//WebElement searchBox=driver.findElement(By.name("search"));
		
		//WebElement searchBox=driver.findElement(By.className("form-control input-lg"));
		//searchBox.sendKeys("Phone");
		
		//Thread.sleep(10000);
		
		driver.quit();
//		System.exit(0);
	}
}