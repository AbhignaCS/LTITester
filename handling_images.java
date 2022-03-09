package selected;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_images {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\LTI\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jobserve.com/in/en/Job-Search/");

	}

}
