package testNG_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amizonNG {

private By driver;


public void Test1() {
	System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://student.amizone.net/");
	driver.manage().window().maximize();

	}
public void Test2() {
	
		

	}
public void Test3() {
	

}public void Test4() {
	

}

}
