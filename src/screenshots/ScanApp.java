package screenshots;

import java.io.IOException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.List;


public class ScanApp extends StartUp {
	
	@Test
	public static void clickApplicationMenu() 
	{
		WebElement applicationMenu = driver.findElement(By.id("value"));
		applicationMenu.click();
	}
	
	@Test
	public static void clickExit()
	{
		WebElement exit = Common.findElementbyID("exit");
		exit.click();
	}
	
	@Test
	public static void clickGlobalSettings()
	{
		WebElement globalSettings = Common.findElementbyID("showSettings");
		globalSettings.click();
	}
	
	@Test
	public static void clickGSConfigureIMS()
	{
		WebElement configureIMS = Common.findElementbyID("ims");
		configureIMS.click();
	}
	
	@Test
	public static void clickThumbnail()
	{
		WebElement thumbnail = driver.findElement(By.id("thumbnail"));
		if (thumbnail.isEnabled())
		{
			thumbnail.click();
		}
		else
		{
			System.out.println("Thumbnail button is disabled");
		}
	}
	
	@Test
	public static void waitThumbnailing()
	{
		boolean elementVisible = false;
		do {
			try {
				WebElement thumbnailing = driver.findElement(By.xpath("//div[@id='thumbnail' and @class='active stop-button']"));
				if (thumbnailing.isDisplayed())
				{
					elementVisible = true;
					sleep(3000);
				}
				else
				{
					elementVisible = false;
				}
			}
			catch (NoSuchElementException e){
				System.out.println("Thumbnail complete or unable to find element");
				elementVisible = false;
			}	
		}while (elementVisible);
	}
	
	@Test
	public static void clickScan()
	{
		WebElement scan = driver.findElement(By.id("scan"));
		if (scan.isEnabled())
		{
			scan.click();
		}
		else
		{
			System.out.println("Scan button is disabled");
		}
		
	}
	
	@Test
	public static void waitScanning()
	{
		boolean elementVisible = false;
		do {
			try {
				WebElement thumbnailing = driver.findElement(By.xpath("//div[@id='scan' and @class='active stop-button']"));
				if (thumbnailing.isDisplayed())
				{
					elementVisible = true;
					sleep(3000);
				}
				else
				{
					elementVisible = false;
				}
			}
			catch (NoSuchElementException e){
				System.out.println("Scan complete or unable to find element");
				elementVisible = false;
			}	
		}while (elementVisible);
	}
	
	@Test
	public static void selectSlide1()
	{
		WebElement canvas = driver.findElement(By.xpath("//canvas[@class='upper-canvas ']"));
		
		Action clickSlide1 = builder
				.moveToElement(canvas, 135, 400)
				.keyDown(Keys.CONTROL)
				.click()
				.build();
		
		clickSlide1.perform();
	}
	
	@Test
	public static void selectSlide2()
	{
		WebElement canvas = driver.findElement(By.xpath("//canvas[@class='upper-canvas ']"));
		
		Action clickSlide2 = builder
				.moveToElement(canvas, 410, 400)
				.keyDown(Keys.CONTROL)
				.click()
				.build();
		
		clickSlide2.perform();
	}
	
	@Test
	public static void selectSlide3()
	{
		WebElement canvas = driver.findElement(By.xpath("//canvas[@class='upper-canvas ']"));
		
		Action clickSlide3 = builder
				.moveToElement(canvas, 685, 400)
				.keyDown(Keys.CONTROL)
				.click()
				.build();
		
		clickSlide3.perform();
	}
	
	@Test
	public static void selectSlide4()
	{
		WebElement canvas = driver.findElement(By.xpath("//canvas[@class='upper-canvas ']"));
		
		Action clickSlide4 = builder
				.moveToElement(canvas, 960, 400)
				.keyDown(Keys.CONTROL)
				.click()
				.build();
		
		clickSlide4.perform();
	}
	
	@Test
	public static void selectSlide5()
	{
		WebElement canvas = driver.findElement(By.xpath("//canvas[@class='upper-canvas ']"));
		
		Action clickSlide5 = builder
				.moveToElement(canvas, 1235, 400)
				.keyDown(Keys.CONTROL)
				.click()
				.build();
		
		clickSlide5.perform();
	}
	
	@Test
	public static void selectSlide6()
	{
		WebElement canvas = driver.findElement(By.xpath("//canvas[@class='upper-canvas ']"));
		
		Action clickSlide6 = builder
				.moveToElement(canvas, 1510, 400)
				.keyDown(Keys.CONTROL)
				.click()
				.build();
		
		clickSlide6.perform();
	}
	
	
	@Test
	public static void selectNextSlide()
	{
		Action clickNextSlide = builder
				.moveByOffset(275, 0)
				.keyDown(Keys.SHIFT)
				.click()
				.build();
		
		clickNextSlide.perform();		
	}
	
	@Test
	public static void selectPrevSlideOnly()
	{
		Action clickPrevSlideOnly = builder
				.moveByOffset(-275, -750)
				.keyDown(Keys.SHIFT)
				.click()
				.build();
		clickPrevSlideOnly.perform();
	}
		
	@Test
	public static void selectSlides3and4()
	{
		WebElement canvas = driver.findElement(By.xpath("//canvas[@class='upper-canvas ']"));
		Action clickSlide3 = builder
				.moveToElement(canvas, 685, 400)
				.keyDown(Keys.CONTROL)
				.click()
				.build();
		clickSlide3.perform();
		sleep(2000);
		Action clickSlide4 = builder
				.moveToElement(canvas, 960, 400)
				.keyDown(Keys.SHIFT)
				.click()
				.build();
		clickSlide4.perform();	
	}
	
	@Test
	public static void deselectSlides()
	{
		WebElement canvas = driver.findElement(By.xpath("//canvas[@class='upper-canvas ']"));
		
		Action clickOutside = builder
				.moveToElement(canvas, 135, 1050)
				.click()
				.build();		
		clickOutside.perform();
	}
	
	@Test
	public static void closeBanners()
	{
		try
		{
			WebElement greenBanner = driver.findElement(By.xpath("//div[@class='notification ng-scope notificationGreen']//img[@id='imgBtn' and @class='cross-image']"));
			greenBanner.click();
		}
		catch (NoSuchElementException e)
		{
			System.out.println("No Green Banner Found");
		}
		
		try
		{
			WebElement blueBanner = driver.findElement(By.xpath("//div[@class='notification ng-scope notificationBlue']//img[@id='imgBtn' and @class='cross-image']"));
			blueBanner.click();
		}
		catch (NoSuchElementException e)
		{
			System.out.println("No Blue Banner Found");
		}
		
		try
		{
			WebElement redBanner = driver.findElement(By.xpath("//div[@class='notification ng-scope notificationRed2']//img[@id='imgBtn' and @class='cross-image']"));
			redBanner.click();
		}
		catch (NoSuchElementException e)
		{
			System.out.println("No Red Banner Found");
		}
		
	}
	
	@Test
	public static void aoiDetectionMethod(String detectionMethod)
	{

		try {
			WebElement aoiApproach = driver.findElement(By.id("aoiApproach"));
			aoiApproach.click();
			sleep(2000);
			switch (detectionMethod)
			{
			case "Default":
				Action selectDefault = builder
				.moveToElement(aoiApproach)
				.click()
				.build();
				selectDefault.perform();
				break;
				
			case "Round": 
				Action selectRound = builder
				.moveToElement(aoiApproach)
				.sendKeys(Keys.ARROW_DOWN)
				.click()
				.build();
				selectRound.perform();
				break;
				
			case "Faint" :
				Action selectFaint = builder
				.moveToElement(aoiApproach)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.click()
				.build();
				selectFaint.perform();
				break;
				
			case "Custom" :
				Action selectCustom = builder
				.moveToElement(aoiApproach)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.click()
				.build();
				selectCustom.perform();
				break;
				
			default:
				Action selectDefault2 = builder
				.moveToElement(aoiApproach)
				.click()
				.build();
				selectDefault2.perform();
				break;
			}
			
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Cannot find AOI approach element");
		}

	}
	
	@Test
	public static void selectMag(String mag)
	{
		try
		{
			//Open Magnification menu
			WebElement magnification = driver.findElement(By.id("magnification"));
			magnification.click();
			sleep(2000);
			
			switch(mag)
			{
			case "20":
				Action select20x = builder
				.moveToElement(magnification)
				.click()
				.build();
				select20x.perform();
				break;
				
			case "40":
				Action select40x = builder
				.moveToElement(magnification)
				.sendKeys(Keys.ARROW_DOWN)
				.click()
				.build();
				select40x.perform();
				break;				
			}
			
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Can find mag object");
		}
	}
	
	@Test
	public static void createProfile(String profName)
	{
		
		try
		{
			//open profile menu
			WebElement profile = driver.findElement(By.xpath("//div[@class='profile-option-select']//div[@class='profile-data']"));
			profile.click();
			sleep(4000);
			
			//Click 'Save as new'
			WebElement saveProf = driver.findElement(By.xpath("//div[@class='profile-names-details' and @id='profileDialog']"));
			saveProf.click();
			sleep(4000);
			
			//use input profName and save profile
			try
			{
				//WebElement newProfWindow = driver.findElement(By.xpath("//form[@name='profileForm']"));
				
				//if (newProfWindow.isDisplayed())
				//{
					WebElement profNameEntry = driver.findElement(By.xpath("//div[@class='profile-entry']//input[@id='pName']"));
					//profNameEntry.click();
					//profNameEntry.clear();
					//profNameEntry.sendKeys("test");
					//sleep(2000);
					
					//JavascriptExecutor jse = (JavascriptExecutor)driver;
					//jse.executeScript("arguments[0].click();", profNameEntry);
					//jse.executeScript("arguments[0].value='tester';", profNameEntry);
					//sleep(2000);
					
					profNameEntry.sendKeys(Keys.BACK_SPACE);
					profNameEntry.sendKeys(profName);
					/*
					Action enterProfileName = builder
							.moveToElement(profNameEntry)
							.click()
							.sendKeys(profName)
							.build();
					enterProfileName.perform();
					sleep(2000);
					*/
					
					//testActions = new Actions(driver);
					//testActions.sendKeys(profName);
					//sleep(2000);
					
					
					//profNameEntry.click();
					//sleep(2000);
					//profNameEntry.sendKeys(profName);
					//sleep(2000);
					
					
					//Click 'SAVE' button
					WebElement profSave = driver.findElement(By.xpath("//div[@class='footer-profile']//button[@id='save']"));
					profSave.click();
				//}
				
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Can find profile popup objects");
			}
			
			
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("Can find profile object");
		}
		
	}
	
	@Test
	public static void selectFocusLayers(int focusLayer)
	{
		try
		{
			//Click on Focus Layers
			WebElement focusLayerObject = driver.findElement(By.id("focuslayer"));
			focusLayerObject.click();
			sleep(2000);
			
			switch(focusLayer)
			{
			case 1:
				Action selectOne = builder
				.moveToElement(focusLayerObject)
				.click()
				.build();
				selectOne.perform();
				break;
				
			case 3:
				Action selectThree = builder
				.moveToElement(focusLayerObject)
				.sendKeys(Keys.ARROW_DOWN)
				.click()
				.build();
				selectThree.perform();
				break;
				
			case 5:
				Action selectFive = builder
				.moveToElement(focusLayerObject)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.click()
				.build();
				selectFive.perform();
				break;
				
			case 7:
				Action selectSeven = builder
				.moveToElement(focusLayerObject)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.click()
				.build();
				selectSeven.perform();
				break;
				
			case 9:
				Action selectNine = builder
				.moveToElement(focusLayerObject)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.click()
				.build();
				selectNine.perform();
				break;
				
			case 11:
				Action selectEleven = builder
				.moveToElement(focusLayerObject)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.click()
				.build();
				selectEleven.perform();
				break;
				
			case 13:
				Action selectThirteen = builder
				.moveToElement(focusLayerObject)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.click()
				.build();
				selectThirteen.perform();
				break;
				
			case 15:
				Action selectFifteen = builder
				.moveToElement(focusLayerObject)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.click()
				.build();
				selectFifteen.perform();
				break;
							
			}
		}
		
		catch (NoSuchElementException e)
		{
			System.out.println("Can't find focus layer object");
		}
		
	}
	
	@Test
	public static void selectSpacing(String spacing)
	{
		try
		{
			//Check to see if spacing is enabled
			WebElement spacingEnable = driver.findElement(By.xpath("//select[@id='focusspacing']//ancestor::div[2]"));
			String spacingCheck = spacingEnable.getAttribute("class");
			
			//if spacing disabled show message
			if (spacingCheck.equals("focus-layer-spacing disable"))
			{
				System.out.println("Spacing is disabled");
				
			}
			
			//if spacing enabled then select the one being received
			if (spacingCheck.equals("focus-layer-spacing"))
			{
				WebElement spacingObject = driver.findElement(By.id("focusspacing"));
				spacingObject.click();
				sleep(2000);
				
				switch(spacing)
				{
				case "1.0":
					Action selectFirst = builder
					.moveToElement(spacingObject)
					.click()
					.build();
					selectFirst.perform();
					break;
					
				case "0.5":
					Action selectSecond = builder
					.moveToElement(spacingObject)
					.sendKeys(Keys.ARROW_DOWN)
					.click()
					.build();
					selectSecond.perform();
					break;
					
				case "0.25":
					Action selectThird = builder
					.moveToElement(spacingObject)
					.sendKeys(Keys.ARROW_DOWN)
					.sendKeys(Keys.ARROW_DOWN)
					.click()
					.build();
					selectThird.perform();
					break;
					
				case "0.2":
					Action selectFourth = builder
					.moveToElement(spacingObject)
					.sendKeys(Keys.ARROW_DOWN)
					.sendKeys(Keys.ARROW_DOWN)
					.sendKeys(Keys.ARROW_DOWN)
					.click()
					.build();
					selectFourth.perform();
					break;
					
				case "0.1":
					Action selectFifth = builder
					.moveToElement(spacingObject)
					.sendKeys(Keys.ARROW_DOWN)
					.sendKeys(Keys.ARROW_DOWN)
					.sendKeys(Keys.ARROW_DOWN)
					.sendKeys(Keys.ARROW_DOWN)
					.click()
					.build();
					selectFifth.perform();
					break;
					
				}
				
			}
		}
		
		catch (NoSuchElementException e)
		{
			System.out.println("Can't find spacing object");
		}
	}
	
	
	@Test
	public static void turnondeidentify()
	{
		try
		{
			WebElement deid = driver.findElement(By.id("labelAnonymization"));
			String isChecked = deid.getAttribute("class");
			
			if (isChecked.toLowerCase().contains("ng-not-empty"))
			{
				System.out.println("Deidentify is already enabled");
			}
			else if(isChecked.toLowerCase().contains("ng-empty"))
			{
				WebElement clickDeid = driver.findElement(By.xpath("//span[@id='labelAnonymizationSpan']//following-sibling::span"));
				clickDeid.click();
			}
			
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Can't find deidentify object");
		}
		
	}
	
	@Test
	public static void browseOutputFolder()
	{
		try
		{
			WebElement outputFolder = driver.findElement(By.xpath("//div[@class='output-option']//input[@id='browseOutputFolder']"));
			outputFolder.click();
			
		}
		
		catch (NoSuchElementException e)
		{
			System.out.println("Can't find Output Folder object");
		}
	}
	
	@Test
	public static void closeBrowseWindow() throws IOException
	{
		Runtime.getRuntime().exec("cmd /c D:\\Work\\Automation\\AutoIT\\ClickCancel_FolderBrowse.exe");
	}
		
	@Test
	public static void deleteProfile()
	{
		
		try {
			//check if selected profile is default; select default profile if not
			WebElement checkIfDefault = driver.findElement(By.xpath("//div[@class='profile-default-name']//div[@id='defaultProfile']"));
			String defaultCheck = checkIfDefault.getAttribute("class");			
			
			WebElement profile = driver.findElement(By.xpath("//div[@class='profile-option-select']//div[@class='profile-data']"));
							
			//delete rest of profiles
			if (defaultCheck.equals("default-profile defaultProfileWhite"))
			{				
				
				//delete all profiles
				deleteAllProfiles();
							
			}
			
			// if selected prof is not default then select default prof
			if (defaultCheck.equals("default-profile defaultProfileBlack"))
			{
				//open profile menu
				profile.click();
				sleep(2000);
				
				//select default profile
				WebElement defaultProfinList = driver.findElement(By.xpath("//img[@class='default-start defaultStarHeight']//ancestor::div[1]"));
				defaultProfinList.click();
				sleep(1000);
			
				//delete all profiles
				deleteAllProfiles();
			}
			
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Can find default profile object");
		}		
	}
	
	public static void deleteAllProfiles()
	{
		try
		{
			//delete all profiles
			int iCount = 0;
			List<WebElement> myListOfElements = driver.findElements(By.xpath("//div[@class='deleteProfile']"));
			iCount = myListOfElements.size();
			WebElement profile = driver.findElement(By.xpath("//div[@class='profile-option-select']//div[@class='profile-data']"));
			
			if (iCount != 0)
			{
				for (int i=0; i < iCount; i++)
				{
					//open profile menu
					profile.click();
					sleep(2000);
					
					//Click delete icon
					WebElement deleteProfIcon = driver.findElement(By.xpath("//div[@class='deleteProfile']"));
					deleteProfIcon.click();
					sleep(2000);
					
					//Confirm deletion
					WebElement delBtn = driver.findElement(By.xpath("//div[@class='warning-footer']//button[@id='preferBtn']"));
					delBtn.click();
				}
			}
			else
			{
				System.out.println("No Profiles to delete");
			}
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Can't find delete profile elements");
		}
	}
	
	
	@Test
	public static void createIMS(String imsName)
	{
		//Open Configure IMS
		clickApplicationMenu();
		clickGlobalSettings();
		clickGSConfigureIMS();
		
		//Enter Custom IMS Name
		WebElement customName = Common.findElementbyXPath("//input[@id='name']");
		customName.click();
		customName.sendKeys(Keys.BACK_SPACE);
		customName.sendKeys(imsName);
		
		//Enter IMS Path
		
		
		
	}
	
}
