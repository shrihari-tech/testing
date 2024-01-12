package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoqa.com/browser-windows");
		WebElement tab = d.findElement(By.id("tabButton"));
		String parent = d.getWindowHandle();
		tab.click();
		WebElement window = d.findElement(By.id("windowButton"));
		window.click();
//		WebElement message = d.findElement(By.id("messageWindowButton"));
//		message.click();
//		
		Set <String> windows = d.getWindowHandles();
		for (String allTabs : windows) {
			d.switchTo().window(allTabs);
			d.navigate().to("https://google.com");
		}
		
		
	}

}
