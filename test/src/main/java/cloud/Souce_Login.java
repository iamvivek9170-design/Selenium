package cloud;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Souce_Login {
	
	WebDriver dr;
	
	@BeforeClass
	private void setUp() {
		// TODO Auto-generated method stub
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.saucedemo.com/");
		
	}
	
	
	
	@Test(priority = 1)
	private void Login() {
		dr.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("standard_user");
		dr.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("secret_sauce");
		dr.findElement(By.cssSelector("[name=\"login-button\"]")).click();
	
		// Validate
		
		String title = dr.findElement(By.className("title")).getText();
		Assert.assertEquals(title, "Products","Login Failed");
		
	}
	
//	id="add-to-cart-sauce-labs-backpack"id="add-to-cart-sauce-labs-backpack"id="add-to-cart-sauce-labs-backpack"
@Test(priority = 2)
private void TestAdtocart() {
	// TODO Auto-generated method stub
	try {
		
	
	dr.findElement(By.cssSelector("[id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	dr.findElement(By.cssSelector("[data-test=\"shopping-cart-link\"]")).click();
	dr.navigate().back();
	dr.navigate().forward();
	String item = dr.findElement(By.cssSelector("[class=\"shopping_cart_badge\"]")).getText();
	System.out.println("number of item in cart : "+item);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
}

