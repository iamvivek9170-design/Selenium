package testcase;

import org.openqa.selenium.WebDriver;

import page.LoginPage;
import page.LogoutPage;

public class LoginTestCase {

	private LoginPage login;
	private LogoutPage logout;
	
	// to login
	public LoginTestCase(WebDriver driver) {
		login = new LoginPage(driver);
		logout = new LogoutPage(driver);
	}
	
	// to validate using right password
	public void validLogin() {
		try {
			login.login("admin", "admin");			
			logout.logout();
			System.out.println("Valid Login Test Case Passed");
		} catch (Exception e) {
			System.out.println("Valid Login Test Case Failed:"+e.getMessage());
//			e.printStackTrace();
		}
		
	}
	
	// to validate using wrong password
	public void invalidLogin() {
		try {
			login.login("admin", "admin1");
			System.out.println("Invalid Login Test Case Failed");
		} catch (Exception e) {
			System.out.println("Invalid Login Test Case Passed");
		}
	}
	
	
	public void logout() {
		
	}
	
	
}




