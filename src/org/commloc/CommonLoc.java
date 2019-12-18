package org.commloc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonLoc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\Desktop\\Selenium\\eclipse workspace\\testng\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver, 20);
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi note 7 pro");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		
		
		List<WebElement> red = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for(int i=0;i<red.size();i++)
		{
			WebElement redmi = red.get(i);
			String x = redmi.getText();
			//System.out.println(x);
			if(x.contains("Redmi"))
			{
				System.out.println(x);
			}
			
		}
		
		
		
		System.out.println("venom");
		System.out.println("toxin");
		
		
	}

}
