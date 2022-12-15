package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLoginTests {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		// Login into Leaftaps application

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Bavithra");
		driver.findElement(By.name("lastname")).sendKeys("Duraisamy");
		driver.findElement(By.name("reg_email__")).sendKeys("9884465539");
		driver.findElement(By.name("reg_passwd__")).sendKeys("password");
		Select dateOfBirth = new Select(driver.findElement(By.id("day")));
		dateOfBirth.selectByIndex(4);
		Select monthOfBirth = new Select(driver.findElement(By.id("month")));
		monthOfBirth.selectByVisibleText("Nov");
		Select yearOfBirth = new Select(driver.findElement(By.id("year")));
		yearOfBirth.selectByVisibleText("1991");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();

	}

}
