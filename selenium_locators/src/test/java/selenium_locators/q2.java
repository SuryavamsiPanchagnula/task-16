package selenium_locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class q2 {

	public static void main(String args[])  {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		
		if(driver.getTitle().equals("STORE")) {
			System.out.println("Page landed on correct website");
		}
		else {
			System.out.println("Page not landed on correct website");
		}
		
		
		driver.close();
		
	}
}
