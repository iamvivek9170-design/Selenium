package espocrm;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_all {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver dr = new ChromeDriver();
	dr.get("http://localhost/samples/select.php");
	
	
	WebElement ele =  dr.findElement(By.id("langs"));
	
	System.out.println("find");
	Select sc = new Select(ele);

	
	
	
	
//	By opt = By.xpath("//select[@id='langs']");
//	By op = By.tagName("option");
	By op = By.xpath("//select[@name=\"languages\"]//option");
	List<WebElement> lang = dr.findElements(op);

	System.out.println(lang.size());
	
	int i =0;
	for (WebElement option : lang) {
		if(i<lang.size()) {
		sc.selectByIndex(i);
		System.out.println(option.getText());
		i++;
		}
	}
	
	Thread.sleep(Duration.ofSeconds(5));
//	List<WebElement> list = sc.getAllSelectedOptions();
//
//	for (WebElement web : list) {
//		System.out.println(web);
//	}
	
	
	dr.quit();
	
	
	
	
	
}
}
