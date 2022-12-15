package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeLoginTests {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
				ChromeDriver driver = new ChromeDriver();

				// Login into Leaftaps application

				driver.get("https://acme-test.uipath.com/login");
				driver.manage().window().maximize();
				driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
				driver.findElement(By.id("password")).sendKeys("leaf@12");
				driver.findElement(By.cssSelector(".main-container form button")).click();
				System.out.println(driver.getTitle());
				driver.findElement(By.cssSelector("#bs-example-navbar-collapse-1 > ul > li:nth-child(4) > a")).click();
				Thread.sleep(3000);
				driver.close();
	}

}
