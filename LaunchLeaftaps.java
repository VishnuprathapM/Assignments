package week3Day4Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchLeaftaps{
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		String title = driver.getTitle();
		if (title.contains("Leaftaps")){
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}
		//driver.close();
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishnuprathap");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/05/2003");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("52");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876544380");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vp123@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Arya");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Suriya");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Madambakkam ");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Kodambakkam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600073");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title2 = driver.getTitle();
		
		if(title2.contains("View Lead")) {
			System.out.println("Title is verified");
		}
		
		else {
			System.out.println("Title is not verified");
		}
		
		
	}

}
