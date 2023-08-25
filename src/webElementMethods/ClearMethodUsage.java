package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearMethodUsage {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("E:\\Divya\\SQL OQSPIDsERS\\samplewebpage.html");
		WebElement ele=driver.findElement(By.xpath("//input[@type='text'][1]"));
		ele.clear();
		ele.sendKeys("diya");
		

	}

}
