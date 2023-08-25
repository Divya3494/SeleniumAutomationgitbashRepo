package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxEnabled {
 public static void main(String [] args)
 {
	 WebDriver driver=new FirefoxDriver();
	 driver.get("https://www.Facebook.com/");
	 System.out.println(driver.getTitle());
	 WebElement ele=driver.findElement(By.name("email"));
	Boolean val= ele.isEnabled();
	 System.out.println(val);
	 if (val==true)
		 System.out.println("textbox is enabled ");
	 else
		 System.out.println("textbox is not  enabled ");
 }
}
