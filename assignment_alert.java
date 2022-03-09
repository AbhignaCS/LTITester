package selected;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\LTI\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert alt=driver.switchTo().alert();
		String errorMsg=alt.getText();
		System.out.println("" +errorMsg);
		Thread.sleep(3000);
		alt.accept();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		System.out.println("" +errorMsg);
		Thread.sleep(6000);
		alt.accept();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		System.out.println("" +errorMsg);
		Thread.sleep(5000);
		alt.dismiss();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		System.out.println("" +errorMsg);
		Thread.sleep(5000);
		alt.sendKeys("Abhigna C S");;
		driver.switchTo().defaultContent();
		Thread.sleep(5000);

	}

}
