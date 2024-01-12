package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoqa.com/browser-windows");//parent tab
		WebElement tab = d.findElement(By.id("tabButton"));
		tab.click();//child tab (second tab)
		Thread.sleep(3000);
		//closes first tab the function control is switched to second tab
		String parent = d.getWindowHandle();// to get parent window id
		System.out.println(parent);
		Set <String> child = d.getWindowHandles();//import java.util //set is collection array adv topic
		for (String allTabs : child) {
			d.switchTo().window(allTabs);
			
		}
		d.switchTo().window(parent);
		WebElement window = d.findElement(By.id("windowButton"));
		window.click();
		d.quit();
	}

}
