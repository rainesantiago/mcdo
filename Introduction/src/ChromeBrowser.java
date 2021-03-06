import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

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
		driver.get("http://shopsm.com"); //hit url of google chrome
		System.out.println(driver.getTitle());//this will help you validate if your Page title is correct
		
		System.out.println(driver.getCurrentUrl()); //validate if you are landed on correct URL
		
		driver.get("https://www.shopsm.com/login/"); //hit url of google chrome
		//driver.navigate().back();
		driver.close(); //close current browser
		driver.quit(); //It closes all the browsers open by selenium script
		
	}

}
