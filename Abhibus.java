package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='station-body col']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='station-body col']")).click();
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.xpath("//h5[@class='title']"));
		String bus = element1.getText();
		System.out.println(bus);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		WebElement element2 = driver.findElement(By.xpath("//div[@class='text-grey']"));
		String seats = element2.getText();
		System.out.println(seats);
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='1UC']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		WebElement element3 = driver.findElement(By.xpath("//div[@class='selected-seat col auto']/div/div"));
		String SelectedSeat = element3.getText();
		System.out.println("Selected seat is: " + SelectedSeat);
		WebElement element4 = driver.findElement(By.xpath("//div[@class='seat-fare col auto']/div/div"));
		String TotalFare = element4.getText();
		System.out.println("Total Fare is: " + TotalFare);
		driver.close();

	}

}
