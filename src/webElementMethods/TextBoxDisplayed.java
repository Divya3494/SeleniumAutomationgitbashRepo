package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxDisplayed  {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://www.Facebook.com/");
		System.out.println(driver.getTitle());
		WebElement ele=driver.findElement(By.name("email"));
				Boolean val=ele.isDisplayed();
				System.out.println(val);
				if (val==true)
					System.out.println("Textbox is Displayed");
				else
					System.out.println("Textbox is not  Displayed");
	}

}
