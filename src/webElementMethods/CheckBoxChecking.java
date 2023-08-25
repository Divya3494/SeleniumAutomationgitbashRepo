package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxChecking {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("E:\\Divya\\SQL OQSPIDERS\\samplewebpage.html");
		WebElement ele= driver.findElement(By.xpath("//input[@type='checkbox']"));
		Boolean val=ele.isSelected();
		if (val==true)
			System.out.println("checkbox is selected");
		else
			System.out.println("checkbox is not selected");

	}

}
