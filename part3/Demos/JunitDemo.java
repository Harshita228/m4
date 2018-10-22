package SeleniumPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class JunitDemo {
	static FirefoxProfile profile = new FirefoxProfile();
	FirefoxDriver driver = new FirefoxDriver(profile);
	
	@BeforeClass
	public static void beforeclasstest()
	{
		
		System.setProperty("webdriver.firefox.bin",
		"C:/Users/chenitha/AppData/Local/Mozilla Firefox/firefox.exe");
//        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("network.proxy.type", 1);
        profile.setPreference("network.proxy.http", "10.219.96.26");
        profile.setPreference("network.proxy.http_port", 8080);
        profile.setPreference("network.proxy.ssl", "10.219.96.26");
        profile.setPreference("network.proxy.ssl_port", 8080);
        
  //      FirefoxDriver driver = new FirefoxDriver(profile);
	  }
	
	@Before
	public void beforetest()
	{
		System.out.println("Verification Starting.......");
	}
	
	
	@Test
	public void test() throws InterruptedException 
	{
		
		 String expectedtitle = "Conference Registartio";
	 driver.get("file:///D:/My folders/My Resources/VnV - Automation Testing/AT - M4/Test Automation and Advanced Selenium/ConferenceRegistartion.html");
		String  actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		/*if (actualtitle.contentEquals(expectedtitle)) {
			System.out.println("Conf Reg Title Test Passed");

		} else {
			System.out.println("Conf Reg Title Test failed");
		}*/
	        assertEquals(expectedtitle, actualtitle);
	}
	
	@Test
	public void test1() throws InterruptedException 
	{
		String expectedtitle = "Payment Details";
		 driver.get("file:///D:/My folders/My Resources/VnV - Automation Testing/AT - M4/Test Automation and Advanced Selenium/PaymentDetails.html");
		 //driver.get("file:///D:/Users/sutadepa/Desktop/PaymentDetails.html");
		String  actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		/*if (actualtitle.contentEquals(expectedtitle)) {
			System.out.println("Payment Title Test Passed");

		} else {
			System.out.println("Payment Title Test failed");
		}*/
		assertEquals(expectedtitle, actualtitle);
		
	}
	@After
	public void aftertest()
	{
		System.out.println("Verification ended");
		driver.quit();
	}
	
	
}
