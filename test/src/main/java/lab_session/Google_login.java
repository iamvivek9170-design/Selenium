package lab_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_login {

	public static void main(String[] args) {
		
		
		WebDriver dr = new ChromeDriver();
		
		
		dr.get("https://accounts.google.com/");
		
		dr.findElement(By.cssSelector("[type=\"email\"]")).sendKeys("iamvivek9170@gmail.com");
		
		
		Actions nex = new Actions(dr);
		nex.moveToElement(dr.findElement(By.cssSelector("#identifierNext > div > button"))).click().build().perform();
		
		
		dr.findElement(By.cssSelector("[type=\"password\"]")).sendKeys("Password"); ////// enter your password 
			
	}
}
