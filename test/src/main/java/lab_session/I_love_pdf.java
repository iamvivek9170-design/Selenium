package lab_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_love_pdf {

	
	public static void main(String[] args) {
		
	
	
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.ilovepdf.com/");
	dr.manage().window().maximize();
	
	By pdf = By.className("tools__item");
	WebElement pdf_e = dr.findElement(pdf);
	pdf_e.click();
	
	
	By up = By.xpath("//input[@type='file']");
	WebElement click_up = dr.findElement(up);
//	click_up.click();
	click_up.sendKeys("C:\\Users\\cdac\\Desktop/jmeter.pdf\nC:\\\\Users\\\\cdac\\\\Desktop/jmeter.pdf");
	
	}
	
}
