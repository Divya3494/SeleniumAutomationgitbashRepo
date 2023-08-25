package webElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="E:\\Divya\\QSpider_TestingCourse\\SeleniumAutomationProject\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https:www.facebook.com");

	}

}
