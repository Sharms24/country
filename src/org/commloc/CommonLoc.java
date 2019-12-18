package org.commloc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonLoc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\Desktop\\Selenium\\eclipse workspace\\testng\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
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
		
		System.out.println("Print");
		
		
		
		System.out.println("Hai");
		System.out.println("Hello");
		System.out.println("sharmi");
		System.out.println("Hell");
		
		WebElement buy = driver.findElement((By.xpath("(//a[@class='nav-a  '])[1])")));
		buy.click();
		System.out.println("Donefully");
		
		
	}

}
