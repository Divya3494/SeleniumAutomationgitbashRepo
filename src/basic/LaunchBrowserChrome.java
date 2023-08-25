package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserChrome {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(3000);
		//System.out.println("hi");
		//System.out.println(driver.getTitle());
		//Thread.sleep(3000);
		//driver.navigate().to("https.www.gmail.com");
		
		//this is comment added to see if pull is working or not

	}

}
