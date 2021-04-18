/**
 * 
 */
package Bonitry.Gracia;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Administrator
 *
 */
public class Facebook_bonistyle {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		//Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Firefox
		//WebDriverManager.firefoxdriver().setup();
	    //WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		System.out.print(driver.getTitle());
		
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
		//  driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		 driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		 Thread.sleep(7000);
		 screenshots(driver, "E:\\selenium\\Screenshots\\test2.png");
		 driver.findElement(By.name("firstname")).sendKeys("Madhu");
		 driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Sudhan");
		 driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("8056250743");
		 WebElement day = driver.findElement(By.id("day"));
		 WebElement month = driver.findElement(By.id("month"));
		 WebElement year = driver.findElement(By.id("year"));
//		 Select select = new Select(day);
//				 select.selectByValue("23");
//		 Select select1 = new Select(month);
//		 select1.selectByVisibleText("Apr");
//		 Select select2 = new Select(year);
//		 select2.selectByVisibleText("1991");
		 
		 SelectDropdown(day,"23");
		 SelectDropdown(month,"May");
		 SelectDropdown(year,"1991");
		 driver.findElement(By.xpath("//*[text()= 'Male']")).click();
	
	//	 driver.findElement(By.id("u_6_3_IT")).click();
		 //driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@class='_8idr img']")).click();
		System.out.print("\nReturned to Main page. \n");
		screenshots(driver, "E:\\selenium\\Screenshots\\test3.png");
		
		WebElement fpassword = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	    fpassword.click();
	    screenshots(driver, "E:\\selenium\\Screenshots\\test4.png");
		 String Madhu1 = driver.getTitle();
		System.out.println(Madhu1);
		 Thread.sleep(10000);
		 driver.findElement(By.cssSelector("svg[class='eltiug27 a8c37x1j']")).click();
		Thread.sleep(3000);
		//call take screenshot function
		 screenshots(driver, "E:\\selenium\\Screenshots\\test5.png");
		// driver.findElement(By.partialLinkText("Forgot")).click();
		 System.out.println("\ntitle of page is: " + driver.getTitle());
		
//			driver.findElement(By.name("login")).click();
//			driver.navigate().back();
		    Thread.sleep(3000);
			System.out.println("Test case Passed");
			driver.close();
		driver.quit();
		
	}
		public static void SelectDropdown(WebElement string1, String value)
		{
			Select select1 = new Select(string1);
			select1.selectByVisibleText(value);
			System.out.println(select1.isMultiple());
			
		}
		public static void screenshots(WebDriver webdriver , String location) throws IOException
		{
		
			
			

			//convert web driver object to Takescreenshoot
			TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
				
		    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(location);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

		}

	}


