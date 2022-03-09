package selected;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handling1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\LTI\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms11.htm");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,
				Keys.PAGE_DOWN);
		driver.manage().window().maximize();
		WebElement dd=driver.findElement(By.name("mydropdown"));
		Select options=new Select(dd);
		System.out.println("Default selected option is " +options.getFirstSelectedOption().getText());
		options.selectByIndex(2);
		System.out.println("Selected option is " +options.getFirstSelectedOption().getText());
		List<WebElement> allOptions=options.getOptions();
		System.out.println("Total no. of options available - "+allOptions.size());
		for(WebElement w : allOptions)
			System.out.println(w.getText());
		

	}

}
