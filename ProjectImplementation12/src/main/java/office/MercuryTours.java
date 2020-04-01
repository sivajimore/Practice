package office;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@name='userName']").sendKeys("mercury");
		driver.findElementByXPath("//*[@name='password']").sendKeys("mercury");
		driver.findElementByXPath("//*[@name='login']").click();
		Thread.sleep(5000);
		WebElement depart=driver.findElementByXPath("//*[@name='fromPort']");
		Select sel=new Select(depart);
		sel.selectByVisibleText("London");
		
		WebElement arr=driver.findElementByXPath("//*[@name='toPort']");
		
		Select arrin=new Select(arr);
		arrin.selectByVisibleText("New York");
		driver.findElementByXPath("(//*[@name='servClass'])[2]").click();
		
		driver.findElementByXPath("//*[@name='findFlights']").click();
		
		driver.close();
		

	}

}
