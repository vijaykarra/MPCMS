import java.util.Collections;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartNow {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://3.108.190.123:7003/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath(" //button[contains(text(),'Start Now')] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //button[contains(text(),'Sign In')] ")).click();


		//driver.findElement(By.xpath(" //button[contains(text(),'Home')] ")).click();

		WebElement hoverable = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[1]"));

		Thread.sleep(2000);
		driver.findElement(By.xpath(" //*[@id=\"root\"]/div/div/div/div[1]/div[1]/button ")).click();


		Actions action = new Actions(driver);
		action.moveToElement(hoverable).perform();

		//driver.findElement(By.xpath(" //*[@id=\"root\"]/div/div/div/div[1]/div[1]/button ")).click();


		driver.navigate().back();
    	Thread.sleep(2000);
    	System.out.println("back done....");	 
    	
    	driver.navigate().forward();
    	Thread.sleep(2000);
    	System.out.println("Forword done...");
    	
    	driver.navigate().refresh();
    	Thread.sleep(1000);
    	System.out.println("Refresh done..");






	}

}
