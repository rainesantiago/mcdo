import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//selenium-code
		
		//Create first Driver object - this driver is specific to each and every browser.
		//We will strictly implement methods of webdriver
		
		/* Class Name = ChromeDriver,

		 * X driver = new X();*/
		
		//invoke .exe file first	
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://shopsm.com"); //hit url of google chrome
		System.out.println(driver.getTitle());//this will help you validate if your Page title is correct
		System.out.println(driver.getCurrentUrl()); //validate if you are landed on correct URL
		
		//System.out.println(driver.getPageSource()); //print page source
		driver.get("https://ace-sat.acehardware.ph/"); //ace hardware homepage
		driver.get("https://ace-sat.acehardware.ph/login/"); //Ace login page
		//WebElement element = driver.findElement(By.cssSelector(".sc-fzplWN.gGCuVj"));element.click();
		
		driver.findElement(By.id("email")).sendKeys("sallyjabel@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sallyjabel123");
		System.out.println(driver.findElement(By.cssSelector("error")).getText()); //print error message on console
		driver.findElement(By.id("u_0_b")).click();
		driver.close();
	}

}
