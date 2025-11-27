package espocrm;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Compose_email_ESPOCRm {
	public static void main(String[] args) throws InterruptedException {
		
WebDriver dr = new ChromeDriver();
dr.manage().window().maximize();
dr.get("http://localhost/espocrm/");
dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

By locatorUsername = By.id("field-userName");
WebElement txtUsername = dr.findElement(locatorUsername);
txtUsername.sendKeys("admin");
System.out.println("Text Entered in txtUsername is "+txtUsername.getText());
System.out.println("Text Entered in txtUsername is "+txtUsername.getAttribute("value"));
By locatorPassword = By.name("password");
WebElement txtPassword = dr.findElement(locatorPassword);
txtPassword.sendKeys("admin");
dr.findElement(By.className("fa-eye")).click();
By locatorLogin = By.tagName("button");
WebElement btnLogin = dr.findElement(locatorLogin);
btnLogin.click();
	
		
	dr.findElement(By.cssSelector("[data-name=\"Email\"] a")).click();
	Thread.sleep(Duration.ofSeconds(5));

	dr.findElement(By.cssSelector("[data-action=\"composeEmail\"]")).click();
	
	Thread.sleep(Duration.ofSeconds(5));

	dr.quit();
}
	
	
}
