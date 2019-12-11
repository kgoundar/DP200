package screenshots;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class StartApplication {
	// Start Scan App and Simulator
	@Test
	public void AppStart() throws Exception {
		
		StartUp.setup();
		StartUp.startBrowser();
		
	}
	
	//@AfterClass
	//public void close() throws IOException {
	//	
	//	StartUp.closeBrowser();
	//}

}
