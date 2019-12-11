package screenshots;

import java.io.IOException;
import org.testng.annotations.Test;

public class ScannerSimulator {
	
	@Test (description = "Select All Single Slides")
	public static void selectSingleSlides() throws IOException
	{
		Runtime.getRuntime().exec("cmd /c D:\\Work\\Automation\\AutoIT\\SelectAllSingleSlides.exe");
	}
	
	@Test (description = "Click INSERT Button")
	public static void clickInsert() throws IOException
	{
		Runtime.getRuntime().exec("cmd /c D:\\Work\\Automation\\AutoIT\\ClickInsert.exe");
	}
	
	@Test (description = "Click EJECT Button")
	public static void clickEject() throws IOException
	{
		Runtime.getRuntime().exec("cmd /c D:\\Work\\Automation\\AutoIT\\ClickEject.exe");
	}

	
	@Test (description = "Click REMOVE Button")
	public static void clickRemove() throws IOException
	{
		Runtime.getRuntime().exec("cmd /c D:\\Work\\Automation\\AutoIT\\ClickRemove.exe");
	}
	
	@Test (description = "Close Simulator")
	public static void closeSimulator() throws IOException
	{
		Runtime.getRuntime().exec("cmd /c D:\\Work\\Automation\\AutoIT\\CloseSimulator.exe");
	}

	@Test (description = "Select Single Slide Type")
	public static void selectSingleSlideType() throws IOException
	{
		Runtime.getRuntime().exec("cmd /c D:\\Work\\Automation\\AutoIT\\SelectSingleSlideType.exe");
	}

	@Test (description = "Select Double Slide Type")
	public static void selectDoubleSlideType() throws IOException
	{
		Runtime.getRuntime().exec("cmd /c D:\\Work\\Automation\\AutoIT\\SelectDoubleSlideType.exe");
	}
	
	@Test (description = "Select All Double Slides")
	public static void selectDoubleSlides() throws IOException
	{
		Runtime.getRuntime().exec("cmd /c D:\\Work\\Automation\\AutoIT\\SelectAllDoubleSlides.exe");
	}
}
