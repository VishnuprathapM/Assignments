package week4Day5Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceDelete {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement delete = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", delete);
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Salesforce Automation by Vishnuprathap M");
		Thread.sleep(5000);
		WebElement delete2 = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']//a[@role='button']"));
		driver.executeScript("arguments[0].click();", delete2);
		Thread.sleep(5000);
		WebElement delete3 = driver.findElement(By.xpath("//a[@title='Delete']/div"));
		driver.executeScript("arguments[0].click();", delete3);
		WebElement element = driver.findElement(By.xpath("//span[text()='Delete']"));
		driver.executeScript("arguments[0].click();", element);
		Thread.sleep(3000);
		WebElement delete4 = driver.findElement(By.xpath("//a[text()='Salesforce Automation by Vishnuprathap M']"));
		String text = delete4.getText();
		if (text.equals("Salesforce Automation by Vishnuprathap M")) {
			System.out.println("Opportunity is Found");
		} else {
			System.out.println("Opportunity is Deleted");
		}
		
	}
}
