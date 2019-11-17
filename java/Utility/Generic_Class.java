package Utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import TestBase.Base;

public class Generic_Class extends Base {
	
 public static void DP_HANDLE (WebElement element, String data) {
	 
		Select s = new Select(element);
		List<WebElement>list = s.getOptions();
		for(WebElement op:list)
		{
			String text = op.getText();
			if(text.contains(data))
			{
				s.deselectByVisibleText(text);
				break;	
			}
		}
	}
}
