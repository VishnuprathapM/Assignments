package week4Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFacebookAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vishnuprathap");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("vishnu@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("vish34567890");
		String title=driver.getTitle();
		if(title.contains("Facebook")) {
			System.out.println("Tile is verified");
		}else {
			System.out.println("Title is not verified");
		}
		
	
	}

}
