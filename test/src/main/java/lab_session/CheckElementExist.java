package lab_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementExist {
	
	
	
//	public static boolean element_Exist(WebDriver Driver,) {
//		return false;
//		
//	}

	public static boolean element_exist(WebDriver drive,By locate) {
		WebElement ele = drive.findElement(locate);
		
	if (ele != null) {
		return true;
	}
return false;
	
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		WebDriver dr = new ChromeDriver();
//		
//		dr.get("http://localhost/espocrm/");
//		By btn = By.id("btn-login");
//		if(()
		
		
				
		By fi_e = By.className("Null123");
		
		element_exist(dr, fi_e);
		if (element_exist(dr, fi_e)){
			
		}
		
		
	}
	
}
