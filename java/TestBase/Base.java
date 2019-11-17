package TestBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
public static WebDriver driver;
static Properties property;
public static void loadproperty()
{
	try {
		
		File f= new File (".src/main/java/configuration/OR.properties");
		FileReader fr = new FileReader (f);
		property.load(fr);
	}
	catch (FileNotFoundException e) {
			e.printStackTrace();
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	
	}
   public static By getElement (String key)
   {
	   loadproperty();
	   By loc = null;
	   
	   String value = property.getProperty(key);
	   
	   String loctype1 = value.split(":")[0];
	   String locvalue = value.split(":")[1];
	   
	   switch (loctype1)
	   {
	   case "id":
		   loc = By.id(locvalue);
		   break;
	   case "xpath":
		   loc = By.xpath (locvalue);
		   break;
		   
	   case "name":
		   loc = By.name (locvalue);
		   break;
	   }
	   return loc;
	  
	   }
   }