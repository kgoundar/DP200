package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Service {
	
	private static ChromeDriverService service;
	public static WebDriver driver;
	
	@BeforeClass
	public static void createAndStartService() throws IOException {
		service = new ChromeDriverService.Builder()
	        .usingDriverExecutable(new File("C:\\chromedriver_win32\\chromedriver.exe"))
	        .usingAnyFreePort()
	        .build();
	    service.start();
	  }

	  @AfterClass
	  public static void createAndStopService() {
	    service.stop();
	  }

	  @Test
	  public static void createDriver() {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-debugging-port=8088");
        //DesiredCapabilities mycaps = DesiredCapabilities.chrome();
        //mycaps.setCapability(ChromeOptions.CAPABILITY, options);
	    driver = new RemoteWebDriver(service.getUrl(), options);
	    sleep(4000);
		WebElement applicationMenu = driver.findElement(By.id("value"));
		applicationMenu.click();
	  }

	  @AfterTest
	  public static void quitDriver() {
	    driver.quit();
	  }
	  
	  
	  static void sleep(int time) {
			try { Thread.sleep(time); } catch (InterruptedException e) {}
		}


}
