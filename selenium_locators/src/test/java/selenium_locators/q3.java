package selenium_locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class q3 {
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();
		
		driver.findElement(By.id("toc-History")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.id("History")).getText());
		
		driver.close();
	}

}
