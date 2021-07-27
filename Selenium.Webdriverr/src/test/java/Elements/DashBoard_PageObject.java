package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard_PageObject {
	
	@FindBy(xpath="//*[@id=\'panel_resizable_1_2\']/legend")
	public static WebElement PendingLeaveRequests;

}
