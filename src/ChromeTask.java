import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTask {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\DESKTOP\\JAVA\\eclipse\\ARAVINTHAN\\Chrome\\drive\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.flipkart.com/");
}
}