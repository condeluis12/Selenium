package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test12 {

	private static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrador\\eclipse-workspace\\Seleniumtest\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.choucairtesting.com/servicio/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/section[3]/div/div/div[3]/div/div/div/div/div/figure/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/main/div/div/div/div/section[13]/div/div/div[5]/div/div/div/div/div/figure/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("elementor-button-text")).click();
		Thread.sleep(3000);
	
		driver.quit();
	//}
}
}
