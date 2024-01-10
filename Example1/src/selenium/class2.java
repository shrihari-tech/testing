package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com");//opens chrome
		d.navigate().to("https://instagram.com");
		Thread.sleep(2000);
		d.navigate().back();
		d.navigate().to("https://youtube.com");
		Thread.sleep(2000);
		d.navigate().back();
		d.quit();
		//locators - used to click 
		//8 type - id , name, className, xpath, tagnNme, linkText, partiallyLinkText, cssSelector
		
	}

}
