package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amizon {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://student.amizone.net/");
		driver.manage().window().maximize();
	
		
		driver.findElement(By.xpath("//*[@id='loginform']/div[1]/input")).sendKeys("7287228");
		driver.findElement(By.xpath("//*[@id='loginform']/div[2]/input")).sendKeys("gaurav@653");
		
		driver.findElement(By.xpath("//*[@id='loginform']/div[4]/button")).click();
		Thread.sleep(5000);
		
		/*driver.findElement(By.xpath("//*[@id='2']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id='18']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='1']")).click();
		Thread.sleep(5000); 
		
		
		driver.findElement(By.xpath("//*[@id='10']/span")).click();
		Thread.sleep(10000); 
		//faculty feedback
		driver.findElement(By.xpath("//*[@id='27']")).click();
		Thread.sleep(10000);
		/*driver.findElement(By.xpath("//*[@id='Div_Partial']/div/div/div[2]/div[2]/div/ul/li[1]/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='no-more-tables']/table/tbody/tr[1]/td[3]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='no-more-tables']/table/tbody/tr[2]/td[3]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='no-more-tables']/table/tbody/tr[3]/td[3]/label/span")).click();
		Thread.sleep(1000);
		
		//4to 10
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[3]/label/span")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[2]/div[2]/div/div/table/tbody/tr[2]/td[3]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[2]/div[2]/div/div/table/tbody/tr[3]/td[3]/label/span")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='no-more-tables']/table/tbody/tr[4]/td[4]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='no-more-tables']/table/tbody/tr[5]/td[3]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='no-more-tables']/table/tbody/tr[6]/td[4]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='no-more-tables']/table/tbody/tr[7]/td[3]/label/span")).click();
		Thread.sleep(1000);
		//11to14
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[3]/div[2]/div/div/table/tbody/tr[1]/td[3]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[3]/div[2]/div/div/table/tbody/tr[2]/td[3]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[3]/div[2]/div/div/table/tbody/tr[3]/td[3]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[3]/div[2]/div/div/table/tbody/tr[4]/td[3]/label/span")).click();
		Thread.sleep(1000);
		//15to16
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[4]/div[2]/div/div/table/tbody/tr[1]/td[3]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[4]/div[2]/div/div/table/tbody/tr[2]/td[3]/label/span")).click();
		Thread.sleep(1000);
		//17to20
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[5]/div[2]/div/div/table/tbody/tr[1]/td[3]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[5]/div[2]/div/div/table/tbody/tr[2]/td[3]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[5]/div[2]/div/div/table/tbody/tr[3]/td[4]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[5]/div[2]/div/div/table/tbody/tr[4]/td[3]/label/span")).click();
		Thread.sleep(1000);
		
		//1 to 4 (with comment)
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[6]/table/tbody/tr[1]/td[3]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[6]/table/tbody/tr[2]/td[3]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[6]/table/tbody/tr[3]/td[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[6]/table/tbody/tr[4]/td[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='FeedbackRating_Comments']")).sendKeys("nice");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='btnSubmit']")).click();*/
		
		
		driver.findElement(By.xpath("//*[@id='Div_Partial']/div/div/div[2]/div[2]/div/ul/li[2]/div[1]")).click();
		//1to3
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[2]/div/ul/li[2]/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[3]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[1]/div[2]/div/div/table/tbody/tr[2]/td[3]/label/span")).click();
		
		//4to
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[3]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[3]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[3]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[3]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[2]/div[2]/div/div/table/tbody/tr[5]/td[3]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[2]/div[2]/div/div/table/tbody/tr[5]/td[3]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[2]/div[2]/div/div/table/tbody/tr[7]/td[3]/label/span")).click();
		//11to
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[2]/div[2]/div/div/table/tbody/tr[7]/td[3]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[3]/div[2]/div/div/table/tbody/tr[2]/td[3]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[3]/div[2]/div/div/table/tbody/tr[3]/td[3]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[3]/div[2]/div/div/table/tbody/tr[4]/td[3]/label/span")).click();
		//15
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[4]/div[2]/div/div/table/tbody/tr[1]/td[3]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[4]/div[2]/div/div/table/tbody/tr[2]/td[3]/label/span")).click();
		//17
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[5]/div[2]/div/div/table/tbody/tr[1]/td[3]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[5]/div[2]/div/div/table/tbody/tr[2]/td[3]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[5]/div[2]/div/div/table/tbody/tr[3]/td[3]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[5]/div[2]/div/div/table/tbody/tr[4]/td[3]/label/span")).click();
		//1
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[6]/table/tbody/tr[1]/td[3]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[6]/table/tbody/tr[2]/td[3]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[6]/table/tbody/tr[3]/td[4]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[6]/table/tbody/tr[4]/td[4]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/form/div/div/div[6]/table/tbody/tr[5]/td[2]/textarea")).sendKeys("nice");
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		
		
		/*driver.findElement(By.xpath("//*[@id='sidebar']/div[1]/div[1]/ul/li[7]/a/span")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id='21']/span")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id='22']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id='24']/span")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id='sidebar']/div[1]/div[1]/ul/li[8]/a/span")).click();
		Thread.sleep(3000);*/
		
		
		
		

		
		
		

	}

}
