package page;

import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage{

	private String dotright = "//a[@id=\"nav-menu-dropdown\"]";
	private String logout = "//*[@data-name=\"logout\"]";
	
	
	public LogoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	public void click3dot (String dotright) {
		click(dotright);
	}
	
	public void logoutpath (String logout) {
		click(logout);
	}
	
	public void logout() {
		click(dotright);
		click(logout);
		
	}
	
	
	
}
