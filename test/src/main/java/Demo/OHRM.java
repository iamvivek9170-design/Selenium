package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		
		Thread.sleep(Duration.ofSeconds(5));
		
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		By sele = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
		
		WebElement web = dr.findElement(sele);
		web.sendKeys("admin");
		
	}
	
	
}
