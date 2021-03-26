package aoutomationFramework;

import java.util.List;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.support.ui.Select;	

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://www.bukalapak.com/";
        driver.get(baseUrl);		
		
        		
        Select drpDepartment= new Select(driver.findElement(By.id("searchDropdownBox")));		
        drpDepartment.selectByVisibleText("Electronics");		
   		
        WebElement keyword = driver.findElement(By.id("twotabsearchtextbox"));		
        WebElement search = driver.findElement(By.className("nav-input"));		
        		
        keyword.sendKeys("Television & Video");		
        search.click();		
        		
        driver.findElement(By.partialLinkText("Television & Video")).click();		
        driver.findElement(By.partialLinkText("Televisions")).click();		
        driver.findElement(By.partialLinkText("32 Inches & Under")).click();		
        Select drpFeatured= new Select(driver.findElement(By.id("s-result-sort-select")));		
        drpFeatured.selectByVisibleText("Price: High to Low");		
        		
        driver.findElement(By.id("low-price")).sendKeys("300");		
        driver.findElement(By.id("high-price")).sendKeys("400");		
        driver.findElement(By.id("a-autoid-1-announce")).click();		
        		
        driver.findElement(By.id("low-price")).clear();		
        driver.findElement(By.id("high-price")).clear();		
        driver.findElement(By.id("low-price")).sendKeys("0");		
        driver.findElement(By.id("high-price")).sendKeys("150");		
        driver.findElement(By.id("a-autoid-1-announce")).submit();		
        		
        driver.findElement(By.partialLinkText("32 Inche")).click();		
        //Add List		
        driver.findElement(By.id("add-to-wishlist-button-submit")).submit();		
        		
        //Sign In		
        driver.findElement(By.name("Email")).sendKeys("engkus.kurniawan@gmail.com");		
        		
        //Continue		
        driver.findElement(By.id("continue")).submit();		
		
		
      //close Fire fox		
        driver.close();		
	}

}
