
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	@Test
public void testGoogle(){
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	driver.quit();
}
}
