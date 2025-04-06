package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class JenkinsExecution {

	@Test
	
	public void Launch() {
		WebDriver driver = new ChromeDriver();
		Reporter.log("Launch browser");
	}

}
