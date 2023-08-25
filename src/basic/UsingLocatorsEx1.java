package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocatorsEx1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.id("email")).sendKeys("divyaaaaaaaaa");
		
		driver.findElement(By.id("password")).sendKeys("paswd");
		
		driver.findElement(By.id("last")).click();
		

	}

}
