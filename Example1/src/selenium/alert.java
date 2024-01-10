package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement alertmsg  = d.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		alertmsg.click();
		Thread.sleep(2000);
		Alert alert = d.switchTo().alert();
		alert.accept();
		
		WebElement prompt = d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		prompt.click();
		
		WebElement cancel = d.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		cancel.click();
		Alert alert1 = d.switchTo().alert();
		alert.accept();
		
		WebElement input = d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		input.click();
		
		WebElement input1 = d.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		input1.click();
		Thread.sleep(2000);
		Alert alert2 = d.switchTo().alert();
		alert2.sendKeys("hari");
		Thread.sleep(2000);
		alert2.accept();
		d.close();

	}

}
