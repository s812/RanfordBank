package com.pagelibrary.RanfordBank;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Breanch_Creation extends Base {
	public static WebElement Branch_Name()
	{
	   return  driver.findElement(getElement ("Branchname"));
	 }
	public static WebElement Address_Editbox()
	{
	   return  driver.findElement(getElement ("Address"));
	}
	public static WebElement Area_Edit()
	{
	   return  driver.findElement(getElement ("Area"));
	 
	}
	public static WebElement Zipcode_Editbox()
	{
	   return  driver.findElement(getElement ("Zipcode"));
	 
	}
	public static WebElement County_Dropdown()
	{
	   return  driver.findElement(getElement ("Country Name"));
	 
	}
	public static WebElement State_Dropdown()
	{
	   return  driver.findElement(getElement ("State Name"));
	 
	}
	public static WebElement City_Dropdown()
	{
	   return  driver.findElement(getElement ("City Name"));
	
	 }
public static WebElement Submit_Btn()
{
   return  driver.findElement(getElement ("Submit"));

 }
}


	

