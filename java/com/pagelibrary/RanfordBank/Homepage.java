package com.pagelibrary.RanfordBank;

import org.openqa.selenium.WebElement;
import TestBase.Base;

public class Homepage  extends Base {
	
	public static  WebElement Username_Editbox()
	{
		return driver.findElement (getElement("Username"));
	}
	public static WebElement Password_Editbox()
	{
		return driver.findElement (getElement("Password"));
	}
	public static WebElement Login_btn()
	{
		return driver.findElement (getElement("Login"));
		
	}
	
}
