package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Attribute {
	
	@FindBy(id="ap_email")
	public static WebElement email;
	
	@FindBy(id="continue")
	public static WebElement login1_button;
	
	

}
