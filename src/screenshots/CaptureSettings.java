package screenshots;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CaptureSettings {

	/*
	@BeforeClass
	public void init() throws IOException {
		//start scanner application and simulator
		StartUp.setup();
		StartUp.startBrowser();		
	}
	*/
	
	@Test (priority=1)
	public void CaptureSettings_InsertTray() throws Exception
	{
		//Take screenshot of main screen without any trays
		sleep(3000);
		Common.takeScreenshot("CaptureSettings_Panel_Pg49");
	}
	
	@Ignore
	@Test (priority=2) 
	public void CaptureSettings_ScanMethod() throws Exception
	{
		// select single slide tray type on simulator
		ScannerSimulator.selectSingleSlideType();
		sleep(3000);
		// select all slides on simulator
		ScannerSimulator.selectSingleSlides();
		sleep(5000);
		// click on insert on simulator
		ScannerSimulator.clickInsert();
		sleep(10000);
		// on app select slide 2
		ScanApp.selectSlide2();
		sleep(2000);
		// using capture setting change aoi detection method to 'Round'
		ScanApp.aoiDetectionMethod("Round");
		sleep(2000);
		// on app select slide 5
		ScanApp.deselectSlides();
		sleep(2000);
		ScanApp.selectSlide5();
		sleep(2000);
		// using capture setting change aoi detection method to 'Faint'
		ScanApp.aoiDetectionMethod("Faint");
		sleep(2000);
		//thumbnail all slides
		ScanApp.deselectSlides();
		sleep(2000);
		ScanApp.clickThumbnail();
		sleep(5000);
		ScanApp.waitThumbnailing();
		sleep(2000);
		Common.takeScreenshot("CaptureSettings_AOIDetectionMethod_Pg50");
		sleep(2000);
		ScannerSimulator.clickEject();
		sleep(5000);
		ScannerSimulator.clickRemove();
		sleep(5000);
		
	}
	
	@Ignore
	@Test (priority=3)
	public void CaptureSettings_MultipleValues() throws Exception
	{
		//Select single slides
		ScannerSimulator.selectSingleSlideType();
		sleep(3000);
		ScannerSimulator.selectSingleSlides();
		sleep(5000);
		//Insert Tray
		ScannerSimulator.clickInsert();
		sleep(15000);
		//Enable De-identify
		ScanApp.turnondeidentify();
		sleep(2000);
		//Select Slide 2
		ScanApp.selectSlide2();
		sleep(2000);
		//Select 40x mag
		ScanApp.selectMag("40");
		sleep(2000);
		//Select focusLayer
		ScanApp.selectFocusLayers(3);
		sleep(2000);
		//select 0.5 spacing
		ScanApp.selectSpacing("0.5");
		sleep(2000);
		//Create Profile 1 and assign to Slide 2
		ScanApp.createProfile("Profile 1");
		sleep(2000);
		//Select all slides 
		ScanApp.deselectSlides();
		sleep(2000);
		Common.takeScreenshot("CaptureSettings_MultipleValuesandDe-Identify_Pg51");
		sleep(2000);
		ScanApp.deleteProfile();
		sleep(3000);
		ScannerSimulator.clickEject();
		sleep(5000);
		ScannerSimulator.clickRemove();
		sleep(5000);
	}
	
	@Ignore
	@Test (priority=4)
	public void CaptureSettings_OutputFolder() throws Exception
	{
		//Select single slides
		ScannerSimulator.selectSingleSlideType();
		sleep(3000);
		ScannerSimulator.selectSingleSlides();
		sleep(5000);
		//Insert Tray
		ScannerSimulator.clickInsert();
		sleep(15000);
		//Take Screenshot of Capture Settings
		Common.takeScreenshot("CaptureSettings_OutputFolder1_Pg52");
		//Open Output Folder Browse Window
		ScanApp.browseOutputFolder();
		sleep(2000);
		//Take Screenshot of Browse Folder
		//Common.takeScreenshot("CaptureSettings_OutputFolder2_Pg52");
		Common.takeFullScreenShot("CaptureSettings_OutputFolder2_Pg52");
		//Close Output Folder Browse Window
		ScanApp.closeBrowseWindow();
		sleep(2000);
		ScannerSimulator.clickEject();
		sleep(5000);
		ScannerSimulator.clickRemove();
		sleep(5000);
		
	}
	
	public void CaptureSettings_SavetoIMS() throws IOException
	{		
		//Select single slides
		ScannerSimulator.selectSingleSlideType();
		sleep(3000);
		ScannerSimulator.selectSingleSlides();
		sleep(5000);
		//Insert Tray
		ScannerSimulator.clickInsert();
		sleep(15000);
		//Create IMS
		ScanApp.createIMS("ImageTest");
		
	}
	
	static void sleep(int time) {
		try { Thread.sleep(time); } catch (InterruptedException e) {}
	}
	
		
}
