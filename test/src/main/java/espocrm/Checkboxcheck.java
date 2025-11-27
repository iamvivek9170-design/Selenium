package espocrm;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkboxcheck {
	
	public static void  check(WebElement c) {
		if(c.isSelected()) {
			System.out.println("element is already selected");
		}else {
			c.click();
		}
	}
	
	public static void  uncheck(WebElement un) {
		if(un.isSelected()) {
			un.click();
		}else {
			System.out.println("element is already selected");

		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver dr = new ChromeDriver();
		dr .manage().window().maximize();
		
		dr.get("http://localhost/samples/elements.php");
		
		WebElement male = dr.findElement(By.cssSelector("[id=\"male\"]"));
		check(male);
		uncheck(male);

		WebElement female = dr.findElement(By.cssSelector("[id=\"female\"]"));
		check(female);

		WebElement sports = dr.findElement(By.cssSelector("[id=\"sports\"]"));
		check(sports);
		uncheck(sports);      
		check(sports);

		WebElement music = dr.findElement(By.cssSelector("[id=\"music\"]"));
		check(music);
		Thread.sleep(Duration.ofSeconds(5));

		}
	}

