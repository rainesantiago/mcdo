import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium-code
		
				//Create first Driver object - this driver is specific to each and every browser.
				//FIREFOX BROWSER
				//We will strictly implement methods of webdriver
				
				/* Class Name = ChromeDriver,

				 * X driver = new X();*/
				
				//gecko driver
				System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("http://facebook.com"); //hit url of google chrome
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl()); //validate if you are landed on correct URL
				
				// Credentials
				driver.findElement(By.cssSelector("#email")).sendKeys("sallyjabel@gmail.com");
				driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("sallyjabel1234");
				driver.findElement(By.id("u_0_b")).click();
				driver.close();
			}
				
	}









