package SeleniumPackage;

import java.net.MalformedURLException;
import java.net.URL;

	import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class iegrid {
	public static void main(String[] args) throws InterruptedException, MalformedURLException 

	{
		System.setProperty("webdriver.ie.driver","D:/IEDriverServer.exe");
	
		String version="11";
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:6666/wd/hub"), caps);
		caps.setBrowserName("internetExplorer");
		caps.setCapability("webdriver.internetExplorer.driver","D:/IEDriverServer.exe");
		
		caps.setPlatform(Platform.WINDOWS);
		caps.setVersion(version);
	
try {
		driver.get("http://demo.opencart.com/");
		System.out.println(driver.getTitle());
//		driver.quit();
}
catch(Exception ex){
	System.out.println("Hello");
}
//driver.quit();
	}
}



	

		