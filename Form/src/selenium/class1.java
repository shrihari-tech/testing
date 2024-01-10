package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class class1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		WebElement firstname = d.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]"));
		firstname.sendKeys("sri");
		WebElement lastname = d.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]"));
		lastname.sendKeys("ab");
		WebElement phno = d.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]"));
		phno.sendKeys("7418529630");
		WebElement country = d.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]"));
		country.sendKeys("india");
		WebElement city = d.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]"));
		city.sendKeys("coimbatore");
		WebElement email = d.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]"));
		email.sendKeys("abc@gmail.com");
		WebElement gender = d.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label"));
		gender.click();
		WebElement monday = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[2]/td/label"));
		monday.click();
		WebElement tuesday = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[3]/td/label"));
		tuesday.click();
		WebElement contact = d.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]"));
		Select select = new Select(contact);
		select.selectByIndex(2);
		WebElement fileinput = d.findElement(By.xpath("//*[@id=\"RESULT_FileUpload-10\"]"));
		fileinput.sendKeys("C:\\Users\\SHRIHARI\\eclipse-workspace\\Example1\\src\\selenium\\download.jpg");
		
		//screen short
		TakesScreenshot scrShot =(TakesScreenshot)d;
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\SHRIHARI\\Desktop\\test\\demo.png");
		FileHandler.copy(SrcFile, DestFile);
		
	}

}
