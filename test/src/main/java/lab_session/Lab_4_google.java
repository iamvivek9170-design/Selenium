package lab_session;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab_4_google {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver dr = new ChromeDriver();
		Thread.sleep(Duration.ofSeconds(5));
		
		
		
		dr.get("https://www.google.com/?zx=1763482526967&no_sw_cr=1");
		Thread.sleep(Duration.ofSeconds(5));
 
		
		
		By find_you = By.className("CgwTDb");
		Thread.sleep(Duration.ofSeconds(5));

		WebElement you_e = dr.findElement(find_you);
		System.out.println("Before click : "+you_e.isDisplayed());

		Thread.sleep(Duration.ofSeconds(10));

		you_e.click();
		
		System.out.println("After click :"+you_e.isDisplayed());
	}
	
	
	
}
