package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com");//opens chrome
		d.navigate().to("https://facebook.com");
		d.navigate().back(); //moves to previous page
		d.navigate().forward(); //moves to next page
		Thread.sleep(2000); //wait for 2 seconds
		d.close();
		
	}

}
