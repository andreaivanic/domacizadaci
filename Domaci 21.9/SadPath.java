package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadPath extends HappyPath {

	public SadPath() {
		super();
	}

	public void sadPath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/login");

		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("tomsmith");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("SuperSecret");

		WebElement loginButton = driver.findElement(By.className("radius"));
		loginButton.click();

		WebElement mssg = driver.findElement(By.id("flash-messages"));
		String mssgLog = mssg.getText();

		if (mssgLog.contains("You logged into a secure area")) {
			System.out.println("PASS");
		} else if (mssgLog.contains("Your password is invalid!")) {
			System.out.println("FAIL! Wrong password!");
		} else if (mssgLog.contains("Your username is invalid")) {
			System.out.println("FAIL! Wrong username!");
		}

		Thread.sleep(2000);
		driver.close();
	}

}
