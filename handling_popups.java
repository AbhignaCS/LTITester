package selected;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\LTI\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alt=driver.switchTo().alert();
		String errorMsg=alt.getText();
		System.out.println("" +errorMsg);
		Thread.sleep(3000);
		alt.accept();
		driver.switchTo().defaultContent();


	}

}
