package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Napisati program koji ucitava https://practicetestautomation.com/ stranicu, klikne na "Practice" i klikne na "Test login page", 
//popunjava username i password (student/Password123), 
//loguje se na stranicu klikom na dugme Submit i zatim se odjavljuje klikom na dugme Logout. 
//Na kraju zatvoriti program.
public class PracticeDomaci {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/");

		WebElement button = driver.findElement(By.id("menu-item-20"));
		button.click();
		Thread.sleep(2000);

		WebElement loginButton = driver
				.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a"));
		loginButton.click();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		username.clear();
		username.sendKeys("student");
		Thread.sleep(2000);
		pass.clear();
		pass.sendKeys("Password123");
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		WebElement logOut = driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
		logOut.click();
		Thread.sleep(2000);
		driver.close();
	}

}
