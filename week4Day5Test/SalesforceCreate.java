package week4Day5Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceCreate {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-r5']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement element =driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click()", element);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//records-record-layout-item[@field-label='Opportunity Name']//input")).sendKeys("Salesforce Automation by Vishnuprathap M");
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75,000");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("15/09/2024");
		driver.findElement(By.xpath("(//span[text()='--None--'])[1]")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String title=driver.getTitle();
		
		if(title.contains("Salesforce"))
		{
			System.out.println("Title is verified");
		}
		else
		{
			System.out.print("Not Verified");
		}
		
	}

}
