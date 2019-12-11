package screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Checking {
	
	public static WebDriver driver;
	
	@Test
	public static void startBrowser()
	{
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        // Port to communicate on
        options.addArguments("remote-debugging-port=8088");
        driver = new ChromeDriver(options);		
	}

}
