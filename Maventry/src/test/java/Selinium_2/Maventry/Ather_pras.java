/**
 * 
 */
package Selinium_2.Maventry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Administrator
 *
 */
public class Ather_pras {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://atherenergy.com/";
		driver.get(baseUrl);
		//String baseUrl1 = "https://app.atherenergy.com/product/450x/preorder";
		//driver.get(baseUrl1);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("li[data-img='/images/450x-new/scooter-scroll/mint.png']")).click();
	     Thread.sleep(10000);
		System.out.print("green selected");
		
	     String baseUrl1 = "https://app.atherenergy.com/product/450x/preorder";
		driver.get(baseUrl1);
		
	     driver.findElement(By.cssSelector("img[src='/images/mint_ather@2x.png']")).click();
	     Thread.sleep(10000);
	     driver.findElement(By.xpath("//*[@class='next-btn-wrapper active']")).click();
	     Thread.sleep(5000);
	     System.out.println("page is :  " + driver.getCurrentUrl());
	     Thread.sleep(5000);
	     driver.findElement(By.id("person_mail")).sendKeys("Madhujami91@gmail.com");
         driver.findElement(By.id("person_confirm_mail")).sendKeys("Madhujami91@gmail.com");
         driver.findElement(By.name("f_name")).sendKeys("Madhu");
         driver.findElement(By.name("l_name")).sendKeys("Sudhan");
         driver.findElement(By.name("contact_no")).sendKeys("8056250743");
         driver.findElement(By.name("details[installationAddress][address_line_1]")).sendKeys("526");
         driver.findElement(By.id("whatsappConsent")).click();
         driver.findElement(By.cssSelector("img[src='/images/inverse-logo.svg\']")).click();
         Thread.sleep(3000);
         System.out.println("page is :  " + driver.getCurrentUrl());
	     //WebElement Element = driver.findElement(By.linkText("Calculate your EMI"));
	     driver.close();
	     driver.quit();
	}

}
