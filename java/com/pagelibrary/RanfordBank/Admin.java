package com.pagelibrary.RanfordBank;

import TestBase.Base;

public class Admin extends Base {

	public static void Branches_Link()
	{
		driver.findElement(getElement ("Branches"));
	}
	public static void Roles_Link()
	{
		driver.findElement(getElement ("Role"));
	}
	public static void Users_Link()
	{
		driver.findElement(getElement ("Users"));
	}
	public static void Employee_Link()
	{
		driver.findElement(getElement ("Employee"));
	
}
}
