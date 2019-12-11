package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StartUp {
	
	public static WebDriver driver;
	public static Actions builder;
	public static String loc;
	
	@BeforeSuite
	public static void setup() throws IOException {
		
    	Runtime.getRuntime().exec("C:\\Program Files\\Ventana Medical Systems Inc\\Ventana DP 200\\LaunchSimulator.bat",
    			null, new File ("C:\\Program Files\\Ventana Medical Systems Inc\\Ventana DP 200\\simulator"));
    	//Reporter.log("Starting Simulator");
    	sleep(1000);
    	Runtime.getRuntime().exec("C:\\Program Files\\Ventana Medical Systems Inc\\Ventana DP 200\\ScanApp\\Griffin.ScanApp.exe", 
    			null, new File ("C:\\Program Files\\Ventana Medical Systems Inc\\Ventana DP 200\\ScanApp"));
    	//Reporter.log("Starting ScanApp");    	
    	sleep(10000);
	}
	
	@BeforeSuite
	public static void startBrowser()
	{
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32_72.0.3626.69\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        // Port to communicate on
        options.addArguments("remote-debugging-port=12543");
        driver = new ChromeDriver(options);
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        
		builder = new Actions(driver);
	}
	
	@BeforeSuite
	@Parameters({ "language" })
	public void location(String language) throws IOException
	{

		switch(language)
		{
		case "English-US":
			loc = "D:\\Work\\Automation\\Screeshots\\en-US United States\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_US.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Czech":
			loc = "D:\\Work\\Automation\\Screeshots\\cs-CZ Czech\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_CZ.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Danish":
			loc = "D:\\Work\\Automation\\Screeshots\\da-DK Danish\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_DK.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "German":
			loc = "D:\\Work\\Automation\\Screeshots\\de-DE German\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_DE.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Greek":
			loc = "D:\\Work\\Automation\\Screeshots\\el-GR Greek\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_GR.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Spanish":
			loc = "D:\\Work\\Automation\\Screeshots\\es-ES Spanish\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_ES.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "French":
			loc = "D:\\Work\\Automation\\Screeshots\\fr-FR French\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_FR.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Hungarian":
			loc = "D:\\Work\\Automation\\Screeshots\\hu-HU Hungarian\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_HU.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;

		case "Italian":
			loc = "D:\\Work\\Automation\\Screeshots\\it-IT Italian\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_IT.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Japanese":
			loc = "D:\\Work\\Automation\\Screeshots\\ja-JP Japanese\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_JP.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Korean":
			loc = "D:\\Work\\Automation\\Screeshots\\ko-KR Korean\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_KR.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Norwegian":
			loc = "D:\\Work\\Automation\\Screeshots\\nb-NO Norwegian\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_NO.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Dutch":
			loc = "D:\\Work\\Automation\\Screeshots\\nl-NL Dutch\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_NL.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Polish":
			loc = "D:\\Work\\Automation\\Screeshots\\pl-PL Polish\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_PL.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Portuguese":
			loc = "D:\\Work\\Automation\\Screeshots\\pt-PT Portuguese\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_PT.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Russian":
			loc = "D:\\Work\\Automation\\Screeshots\\ru-RU Russian\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_RU.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Slovenian":
			loc = "D:\\Work\\Automation\\Screeshots\\sl-SI Slovenian\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_SI.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Swedish":
			loc = "D:\\Work\\Automation\\Screeshots\\sv-SE Swedish\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_SE.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Thai":
			loc = "D:\\Work\\Automation\\Screeshots\\th-TH Thai\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_TH.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Turkish":
			loc = "D:\\Work\\Automation\\Screeshots\\tr-TR Turkish\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_TR.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		case "Chinese":
			loc = "D:\\Work\\Automation\\Screeshots\\zh-CN Hans Chinese (Simplified)\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_CN.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
			break;
			
		default:
			loc = "D:\\Work\\Automation\\Screeshots\\en-US United States\\";
			try 
			{
				Runtime.getRuntime().exec("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc\\Set_Language_US.bat",
		    			null, new File ("C:\\Users\\goundark\\eclipse-workspace\\DP200\\setLoc"));

			}
			catch (Exception e)
			{
				System.out.print(e);
			}
		}
		
	}
	
		
	@AfterSuite (alwaysRun=true)
	public void close() throws IOException {
		
		//Close Scanner Application, Simulator and Driver
		try {
			ScanApp.clickApplicationMenu();
			sleep(2000);
			ScanApp.clickExit();
			sleep(5000);
			}
		catch (Exception e)
		{
			System.out.println("Exit elements not found");
		}

		ScannerSimulator.closeSimulator();
		sleep(3000);
	}
	
	@AfterSuite (alwaysRun=true)
	public static void closeBrowser() {
		try
		{
			driver.quit();
		}
		catch(Exception e)
		{
			System.out.println("Issue Closing Browser: " + e);
		}
	}
	
	static void sleep(int time) {
		try { Thread.sleep(time); } catch (InterruptedException e) {}
	}


}
