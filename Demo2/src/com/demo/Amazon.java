package com.demo;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinabkvernac-21&ascsubtag=_k_CjwKCAiAyeTxBRBvEiwAuM8dnW1mWRWMbVxnILu2klmDaTZEzdChHA-OmP1vM8Z9Yck6zxydw2yalxoCjBIQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAiAyeTxBRBvEiwAuM8dnW1mWRWMbVxnILu2klmDaTZEzdChHA-OmP1vM8Z9Yck6zxydw2yalxoCjBIQAvD_BwE");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        
         Actions a1=new Actions(driver);
        WebElement e1 = driver.findElement(By.xpath("//*[@id='nav-link-accountList'] "));
        a1.moveToElement(e1).build().perform();
        Thread.sleep(10000);
        
        WebElement e2= driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span"));
        e2.click();
        Thread.sleep(10000);
        
        WebElement e3= driver.findElement(By.xpath("//*[@id='ap_email']"));
        e3.sendKeys("7070756905");
        WebElement e4=driver.findElement(By.xpath("//*[@id='continue']"));
        e4.click();
        Thread.sleep(10000);
        WebElement e5=driver.findElement(By.xpath("//*[@id='ap_password']"));
        e5.sendKeys("gaurav&653");
        Thread.sleep(10000);
        WebElement e6=driver.findElement(By.xpath("//*[@id='signInSubmit']"));
        e6.click();
        WebElement e8=driver.findElement(By.xpath("//*[@id='cvf-page-content']/div[1]/div/div/form/div[5]/label/input"));
        e8.click();
        WebElement e7=driver.findElement(By.xpath("//*[@id='continue']"));
        e7.click();
        WebElement e9=driver.findElement(By.xpath("//*[@id='a-autoid-0']/span/input"));
        e9.click();
        
        
        
        Thread.sleep(10000);
        
       //driver.close();
        
	}

}
