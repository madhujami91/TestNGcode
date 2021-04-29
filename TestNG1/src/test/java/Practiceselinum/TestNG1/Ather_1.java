package Practiceselinum.TestNG1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ather_1 {
public WebDriver driver;

	@BeforeSuite
		  public void OpenBrowser() {		
			System.out.print("Test case Started");
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
			//driver = new ChromeDriver ();// open browser
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		  }
	@BeforeTest
		  public void OpentheURl() {
			
		String baseUrl = "https://atherenergy.com/";
		driver.get(baseUrl);
		//String baseUrl1 = "https://app.atherenergy.com/product/450x/preorder";
		//driver.get(baseUrl1);
		driver.manage().window().maximize();
		  }

	@SuppressWarnings("deprecation")
	@Test
	       public void Flogin_page() throws InterruptedException, IOException {
		driver.findElement(By.cssSelector("li[data-img='/images/450x-new/scooter-scroll/mint.png']")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // Thread.sleep(10000);
		System.out.print("green selected");
		driver.findElement(By.id("preorder-header-lg")).click();
		 ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
        System.out.println("Page title of new tab: " + driver.getTitle());
	     
	     driver.findElement(By.cssSelector("img[src='/images/mint_ather@2x.png']")).click();
	     Thread.sleep(10000);
	     driver.findElement(By.xpath("//*[@class='next-btn-wrapper active']")).click();
	     Thread.sleep(5000);
	     System.out.println("page is :  " + driver.getCurrentUrl());
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@id='states']")).click();
	     driver.findElement(By.xpath("//div[@class ='menu transition visible']//div[text() = 'tamil nadu']")).click();
	    		 
	  
//	     WebElement state1 = driver.findElement(By.xpath("//*[@id='states']"));
//	     WebElement city1 = driver.findElement(By.xpath("//*[@id='cities']"));
//	     WebElement dealer1 = driver.findElement(By.id("dealers"));
//	     state1.selec
//	     SelectDropdown(state1,"Tamil Nadu");
//	     SelectDropdown(city1,"chennai");
//	     SelectDropdown(dealer1,"Ather");
	     driver.findElement(By.id("person_mail")).sendKeys("Madhujami91@gmail.com");
        driver.findElement(By.id("person_confirm_mail")).sendKeys("Madhujami91@gmail.com");
        driver.findElement(By.name("f_name")).sendKeys("Madhu");
        driver.findElement(By.name("l_name")).sendKeys("Sudhan");
        driver.findElement(By.name("contact_no")).sendKeys("8056250743");
        driver.findElement(By.name("details[installationAddress][address_line_1]")).sendKeys("526");
        driver.findElement(By.id("whatsappConsent")).click();
       // String clickl = Keys.chord(Keys.CONTROL,Keys.ENTER);
        driver.findElement(By.cssSelector("img[src='/images/inverse-logo.svg\']")).click();
        Thread.sleep(3000);
        // hold all window handles in array list
       
        //switch to new tab
        
        //switch to parent window
        driver.switchTo().window(newTb.get(0));
        System.out.println("page is :  " + driver.getCurrentUrl());
	}
	
	@AfterTest
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test case Passed");
	}
		
	@AfterSuite
	public void afterSuite1() {
		
		driver.close();
		driver.quit();
	}

//	public static void SelectDropdown(WebElement string1, String data)
//	{
//		Select select1 = new Select(string1);
//		select1.selectByVisibleText(data);
//		//System.out.println(select1.isMultiple());
//		
//	}

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
