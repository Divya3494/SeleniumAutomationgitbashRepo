package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowManagement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //to maximize browswer
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000); //waiting period
		driver.manage().window().fullscreen(); //fullscreen
		Thread.sleep(3000);
		driver.manage().window().minimize(); //to minimize browser

		driver.navigate().back(); //to go back 
		Thread.sleep(3000);
		driver.navigate().forward(); //to go forward
		Thread.sleep(3000);
		driver.navigate().refresh(); //to refresh
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/"); // to navigate to another application
		driver.manage().window().maximize();

	}

}
