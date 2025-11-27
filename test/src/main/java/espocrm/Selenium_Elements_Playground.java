package espocrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Elements_Playground {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		
		
		dr.get("http://localhost/samples/elements.php");
		
		// user name 
		By name = By.id("username");
		WebElement username = dr.findElement(name);
		username.sendKeys("Vivek Tiwari");
		
		// user name 
		By pass = By.id("username");
		WebElement password = dr.findElement(pass);
		password.sendKeys("Vivek@123");		
		
		
		// select gender 
		By Gender = By.id("male");
		WebElement ma = dr.findElement(Gender);
		ma.click();
		
		// Interests
		By inte = By.id("sports");
		WebElement spo = dr.findElement(inte);
		spo.click();
		
		// country select 
		By coun = By.id("country");
		WebElement counrty = dr.findElement(coun);
		Select sc = new Select(counrty);
		sc.selectByValue("india");
		
		// language skills
		By lang = By.id("skills");
		WebElement skills = dr.findElement(lang);
		Select sk = new Select(skills);
		sk.selectByValue("java");
		sk.selectByValue("selenium");
		sk.selectByContainsVisibleText("SQL");
		
		// comments 
		By com = By.id("comments");
		WebElement comments = dr.findElement(com);
		comments.sendKeys("This my comments ");
		
		// file upload
		By locate = By.id("fileUpload");
		WebElement file = dr.findElement(locate);
//		file.sendKeys("C:\\Users\\cdac\\Desktop\\vivek\\Selenium\\lab\\src\\main\\java\\lab");
		file.sendKeys("C:\\Users\\cdac\\Desktop/summary.csv");
		Thread.sleep(Duration.ofSeconds(5));

		// dob 
		By date = By.id("dob");
		WebElement dob = dr.findElement(date);
		dob.sendKeys("01-01-1999");
		
		// submit 
		By sub = By.id("submitBtn");
		WebElement submit = dr.findElement(sub);
		submit.click();
		
		
		dr.quit();
		
	}
	
	
}
