package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_PageObject {
	
	@FindBy(id = "txtUsername")
	public static WebElement Username;
	@FindBy(id="txtPassword")
	public static WebElement password;
	@FindBy(id="btnLogin")
	public static WebElement button;


}
