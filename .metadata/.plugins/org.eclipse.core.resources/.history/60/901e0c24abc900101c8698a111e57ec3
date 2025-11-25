package lab_session;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	WebDriver dr = new ChromeDriver();
	
	dr.get("https://amazon.in");
	
	dr.findElement(By.xpath("//button[@class='a-button-text']")).click();
	
	Actions fre = new Actions(dr);
	fre.moveToElement(dr.findElement(By.linkText("Fresh"))).click();
	Action fresh = fre.build();
	fresh.perform();

	// skip 
	Actions sk = new Actions(dr);
//	sk.moveToElement(dr.findElement(By.cssSelector(".a-popover-wrapper > button"))).click();
	sk.moveToElement(dr.findElement(By.cssSelector("[data-action='a-popover-close']"))).click().build().perform();
	Thread.sleep(Duration.ofSeconds(5));
	
	
	Actions drink = new Actions(dr);
	drink.scrollToElement(dr.findElement(By.cssSelector("[alt=\"Juices&Colddrinks\"]"))).build().perform();
	
	dr.quit();
	
	
}
}
