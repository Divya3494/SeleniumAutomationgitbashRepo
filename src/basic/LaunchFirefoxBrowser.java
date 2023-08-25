package basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//System.out.println(driver.getPageSource());
		Class c= driver.getClass();
		System.out.println("class name of driver object is " + c.getName());
		
		

	}

}
