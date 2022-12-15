package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		// Login into Leaftaps application

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);

		

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Bavithra");

		driver.findElement(By.id("lastNameField")).sendKeys("Duraisamy");

		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Bavithra");

		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Duraisamy");

		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Computer Science");

		driver.findElement(By.id("createContactForm_description")).sendKeys("Sample Description");

		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Bavithra.arvind@gmail.com");

		Select state = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));

		state.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();
		
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Sample Important note");

		
		driver.findElement(By.cssSelector(".fieldgroup-body tbody tr:nth-of-type(8) input")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		

		driver.quit();

	}

}
