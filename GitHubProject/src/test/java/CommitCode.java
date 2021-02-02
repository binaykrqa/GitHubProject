import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CommitCode {
	//https://github.com/binaykrqa/GitHubProject.git
	WebDriver driver;
	@Test
	public void test()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\NewDownloads\\chrome88\\chromedriver.exe");
	driver = new ChromeDriver();
	 
	driver.get("https://www.edureka.co/");
	driver.close();
	}
}