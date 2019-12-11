package screenshots;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainScreen {
	
	@BeforeClass
	public void init() throws IOException {
		//start scanner application and simulator
		StartUp.setup();
		StartUp.startBrowser();		
	}
	
	@Test (priority=1)
	public void MainScreenInsertTray() throws Exception
	{
		//Take screenshot of main screen without any trays
		sleep(3000);
		Common.takeScreenshot("MainScreen_InsertTray_Pg47");
	}


	@Test (priority=2)
	public void MainScreenSingleSlideTray() throws Exception
	{
		//Insert Single Slide Tray (with all slides) and take screenshot
		//Remove Tray after taking screenshot
		ScannerSimulator.selectSingleSlideType();
		sleep(3000);
		ScannerSimulator.selectSingleSlides();
		sleep(5000);
		ScannerSimulator.clickInsert();
		sleep(15000);
		Common.takeScreenshot("MainScreen_SingleSlideTray_Pg48");
		sleep(2000);
		ScannerSimulator.clickEject();
		sleep(5000);
		ScannerSimulator.clickRemove();
		sleep(5000);
	}
	
	@Test (priority=3)
	public void MainScreenDoubleSlideTray() throws Exception
	{
		//Insert Double Slide Tray (with all slides) and take screenshot
		//Remove Tray after taking screenshot
		ScannerSimulator.selectDoubleSlideType();
		sleep(3000);
		ScannerSimulator.selectDoubleSlides();
		sleep(5000);
		ScannerSimulator.clickInsert();
		sleep(15000);
		Common.takeScreenshot("MainScreen_DoubleSlideTray_Pg48");
		sleep(2000);
		ScannerSimulator.clickEject();
		sleep(5000);
		ScannerSimulator.clickRemove();
		sleep(5000);
	}
	
	@Test (priority=4)
	public void MainScreenSingleSlide_Slide3_Slide4() throws Exception
	{
		ScannerSimulator.selectSingleSlideType();
		sleep(3000);
		ScannerSimulator.selectSingleSlides();
		sleep(5000);
		ScannerSimulator.clickInsert();
		sleep(25000);
		ScanApp.selectSlides3and4();
		sleep(3000);
		ScanApp.clickThumbnail();
		sleep(5000);
		ScanApp.waitThumbnailing();
		sleep(2000);
		ScanApp.deselectSlides();
		sleep(2000);
		ScanApp.selectSlide3();
		sleep(2000);
		ScanApp.clickScan();
		sleep(5000);
		ScanApp.waitScanning();
		ScanApp.deselectSlides();
		sleep(10000);
		ScanApp.closeBanners();
		sleep(2000);
		Common.takeScreenshot("MainScreen_Slide3_Slide4_Pg48");
		sleep(2000);
		ScannerSimulator.clickEject();
		sleep(5000);
		ScannerSimulator.clickRemove();
		sleep(5000);

	}
	
	
	static void sleep(int time) {
		try { Thread.sleep(time); } catch (InterruptedException e) {}
	}
	
	@AfterClass (alwaysRun=true)
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
			System.out.println("Element not found");
		}

		ScannerSimulator.closeSimulator();
		sleep(3000);
	}
}
