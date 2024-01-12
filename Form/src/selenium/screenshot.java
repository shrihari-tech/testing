package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://facebook.com");
		String title = d.getTitle();
		String url=d.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		d.close();
		//		TakesScreenshot scrShot =(TakesScreenshot)d;
//		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//		File DestFile=new File("C:\\Users\\SHRIHARI\\Desktop\\test\\facebook.png");
//		FileHandler.copy(SrcFile, DestFile);
	}

}
