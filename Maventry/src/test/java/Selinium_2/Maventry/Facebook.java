/**
 * 
 */
package Selinium_2.Maventry;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Administrator
 *
 */
public class Facebook {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();// open browser
		System.getProperty("line.separator");
		 driver.get("https://www.facebook.com"); // open url
		 Actions Builder = new Actions (driver);
	driver.manage().window().maximize();
	 WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
	 username.sendKeys("madhujami91");
	 username.clear();
	 System.out.print("Field is Clear");
	 Thread.sleep(5000);
	 WebElement password = driver.findElement(By.xpath("//*[contains(@type,'password')]"));
	 password.sendKeys("madhujami91");
	 password.clear();
	 System.out.print("\nField is Clear ");
	 driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.name("firstname")).sendKeys("Madhu");
	 driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Sudhan");
	 driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("8056250743");
	//driver.navigate().refresh();
	driver.findElement(By.xpath("//*[@class='_8idr img']")).click();
	System.out.print("\nReturned to Main page. \n");
	// Thread.sleep(10000);
	WebElement fpassword = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
       Builder.doubleClick(fpassword).perform();
	//Madhu.click();
	 String Madhu1 = driver.getTitle();
	System.out.println(Madhu1);
	 Thread.sleep(10000);
	 driver.findElement(By.cssSelector("svg[class='eltiug27 a8c37x1j']")).click();
	 
	// driver.findElement(By.partialLinkText("Forgot")).click();
	 System.out.println("\ntitle of page is: " + driver.getTitle());
	
		//driver.findElement(By.name("login")).click();
		//driver.navigate().back();
	    Thread.sleep(3000);
		System.out.println("Test case Passed");
		driver.close();

	}

}
