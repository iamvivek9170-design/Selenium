package espocrm;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Compose_mail_espocrm {
	public static void main(String[] args) throws InterruptedException {
		
WebDriver dr = new ChromeDriver();
dr.manage().window().maximize();
dr.get("http://localhost/espocrm/");
Thread.sleep(Duration.ofSeconds(5));
By locatorUsername = By.id("field-userName");
WebElement txtUsername = dr.findElement(locatorUsername);
txtUsername.sendKeys("admin");
Thread.sleep(Duration.ofSeconds(5));
System.out.println("Text Entered in txtUsername is "+txtUsername.getText());
System.out.println("Text Entered in txtUsername is "+txtUsername.getAttribute("value"));
By locatorPassword = By.name("password");
WebElement txtPassword = dr.findElement(locatorPassword);
txtPassword.sendKeys("admin");
Thread.sleep(Duration.ofSeconds(5));
dr.findElement(By.className("fa-eye")).click();
Thread.sleep(Duration.ofSeconds(5));
By locatorLogin = By.tagName("button");
WebElement btnLogin = dr.findElement(locatorLogin);
btnLogin.click();
Thread.sleep(Duration.ofSeconds(5));
	
		
	dr.get("http://localhost/espocrm/#Account");
		
	Thread.sleep(Duration.ofSeconds(5));
	
	
	dr.findElement(By.xpath("//div[@class='page-header-column-2']//a")).click();
	
//	page open to fill
	Thread.sleep(Duration.ofSeconds(5));
	dr.findElement(By.xpath("//input[@data-name='name']")).sendKeys("Vivek");
	
	Thread.sleep(Duration.ofSeconds(5));
	
	
	// enter website
	dr.findElement(By.xpath("(//input[@class=\"main-element form-control\"])[2]")).sendKeys("https://www.google.com/");
	Thread.sleep(Duration.ofSeconds(5));
	dr.findElement(By.xpath("//input[@class='form-control email-address']")).sendKeys("Vivek123@gmail.com");
	
	
	// phone number
	dr.findElement(By.xpath("//input[@class='form-control phone-number numeric-text no-margin-shifting  ']")).sendKeys("1234567891");
	
	
	
	// Billing Address
	dr.findElement(By.xpath("(//textarea[@class='form-control auto-height'])[1]")).sendKeys("Panchavti");
	dr.findElement(By.xpath("(//input[@placeholder=\"City\"])[1]")).sendKeys("Pune");
	dr.findElement(By.xpath("(//input[@placeholder=\"State\"])[1]")).sendKeys("Maharashtra");
	dr.findElement(By.xpath("(//input[@placeholder=\"Postal Code\"])[1]")).sendKeys("121234");
	dr.findElement(By.xpath("(//input[@placeholder=\"Country\"])[1]")).sendKeys("India");
	
	
	// Shopping Address
	dr.findElement(By.xpath("(//textarea[@placeholder=\"Street\"])[2]")).sendKeys("Pashan");
	dr.findElement(By.xpath("(//input[@placeholder=\"City\"])[2]")).sendKeys("Pune");
	dr.findElement(By.xpath("(//input[@placeholder=\"Country\"])[2]")).sendKeys("India");
	dr.findElement(By.xpath("(//input[@placeholder=\"State\"])[2]")).sendKeys("Maharashtra");
	dr.findElement(By.xpath("(//input[@placeholder=\"Postal Code\"])[2]")).sendKeys("121234");
	
//	 Detail
//		 Types				
	// Click the input
	dr.findElement(By.xpath("//div[@data-name='type']//div[contains(@class, 'selectize-input')]")).click();
	dr.findElement(By.xpath("(//*[@class=\"selectize-control form-control main-element single plugin-espo_select\"])[1]")).click();
	Thread.sleep(Duration.ofSeconds(5));
	// Find and click the 'Customer' option
	dr.findElement(By.xpath("//div[contains(@class, 'selectize-dropdown')]//div[@data-value='Customer']")).click();		
	
	
	
	
		// Industry
	By industriesLocator = By.xpath("//div[@data-name='industry']//div[contains(@class, 'selectize-input')]");
	dr.findElement(industriesLocator).click();
	By agricultureLocator = By.xpath("//div[contains(@class, 'selectize-dropdown')]//div[@data-value='Agriculture']");
	dr.findElement(agricultureLocator).click();
	System.out.println("Selected 'Agriculture' for Industry.");
	
	
	// Description
	dr.findElement(By.xpath("//textarea[@data-name='description']")).sendKeys("This is my description");
	Thread.sleep(Duration.ofSeconds(5));
	
//	dr.findElement(By.className("btn action btn-xs-wide detail-action-item btn-primary radius-left")).click();
	dr.findElement(By.xpath("//button[@data-action='save']")).click();
	
	Thread.sleep(Duration.ofSeconds(5));
	
	
	
	dr.quit();
}
	
	
}
