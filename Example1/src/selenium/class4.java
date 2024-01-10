package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class class4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		WebElement firstname = d.findElement(By.id("firstName"));
		firstname.sendKeys("Shrihari");
		WebElement lastname = d.findElement(By.id("lastName"));
		lastname.sendKeys("BH");
		WebElement email = d.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		email.sendKeys("hari@gmail.com");
		WebElement gender = d.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
		gender.click();
		WebElement number = d.findElement(By.id("userNumber"));
		number.sendKeys("123456789");
		
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		
		
//		WebElement subject = d.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
//		subject.sendKeys("nothing");
		WebElement sports = d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
		sports.click();
		WebElement music = d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
		music.click();
		//File uploadFile = new File("download.jpg");
	    WebElement fileInput = d.findElement(By.id("uploadPicture"));
	    //fileInput.sendKeys(uploadFile.getAbsolutePath());
	    fileInput.sendKeys("C:\\Users\\SHRIHARI\\eclipse-workspace\\Example1\\src\\selenium\\download.jpg");
	    //d.findElement(By.id("file-submit")).click();
		

		
		
		WebElement address = d.findElement(By.id("currentAddress"));
		address.sendKeys("chennai");

		
		WebElement dob = d.findElement(By.id("dateOfBirthInput"));
		dob.click();
		
		WebElement month = d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select monthselect = new Select(month);
		monthselect.selectByIndex(5);
		
		WebElement year = d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select yearselect = new Select(year);
		yearselect.selectByVisibleText("2024");
		
		WebElement day = d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[6]"));
		day.click();
		
		
		
//		
//		WebElement state = d.findElement(By.xpath("//*[@id=\"state\"]/div/div[2]/div"));
//		Select select = new Select(state);
//		select.selectByIndex(2);
		
		
		
		//d.close();
		
		
		

	}

}
