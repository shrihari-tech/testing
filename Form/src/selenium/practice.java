package selenium;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://google.com");
		WebElement textbox = d.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		boolean enabled = textbox.isEnabled();
		System.out.println(enabled);
		
		org.openqa.selenium.Dimension size = textbox.getSize();
		System.out.println(size);
		
		d.navigate().to("https://demoqa.com/automation-practice-form");
		WebElement checkbox = d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
		boolean selectedcheckbox = checkbox.isSelected();
		System.out.println(selectedcheckbox);
		d.quit();//java socet exception while use of close()
		

	}

}
