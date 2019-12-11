package screenshots;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class Common extends StartUp {
	
	@Test
    public static void takeScreenshot(String filename) throws Exception {
		
		String location = loc;
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		String time = dateFormat.format(now);
		File dir = new File(location + time);
		
		if (!dir.exists())
		{
			dir.mkdir();
		}
		else
		{
			//System.out.println("directory already exists");
			//Do nothing
		}
        
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
        	FileUtils.copyFile(scrFile, new File(location + time + "\\" + filename + ".png"));
        	}
        catch (IOException e)
        	 {
        	  System.out.println(e.getMessage());
        	 
        	 }
    }
	

	@Test
	public static void takeFullScreenShot(String FN) throws HeadlessException, AWTException, IOException
	{
		String location = loc;
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		String time = dateFormat.format(now);
		File dir = new File(location + time);
		
		if (!dir.exists())
		{
			dir.mkdir();
		}
		else
		{
			//System.out.println("directory already exists");
			//Do nothing
		}
		
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "png", new File(location + time + "\\" + FN + ".png"));
	}
	
	
	@Test
	public static WebElement findElementbyID(String ID)
	{
		try 
		{
			WebElement foundElement = driver.findElement(By.id(ID));
			return foundElement;
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Unable to find element: " + ID);
			return null;
		}
	}
	
	@Test
	public static WebElement findElementbyXPath(String xPath)
	{
		try
		{
			WebElement foundElementx = driver.findElement(By.xpath(xPath));
			return foundElementx;
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Unable to find element. Xpath: " + xPath);
			return null;
		}
	}
	
	

}
