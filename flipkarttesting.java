package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkarttesting {

public static void main(String[] args) {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\Aniket Gupta\\Downloads\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://www.flipkart.com");

driver.manage().window().maximize();

driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8102806239");

driver.findElement(By.xpath("//input[@type='password']")).sendKeys("632967");


driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

driver.findElement(By.name("q")).sendKeys("Macbook air"+ Keys.ENTER);
driver.findElement(By.cssSelector("[alt='APPLE 2020 Macbook Air M1 - (8 GB/512 GB SSD/Mac OS Big Sur) MGN73HN/A']")).click();
driver.findElement(By.cssSelector("Span[class=)
//driver.findElement(By.name("q")).sendKeys("Iphone 13" +Keys.ENTER);
//driver.findElement(By.xpath("")).click();
//driver.findElement(By.className("background-color: rgb(255, 255, 255); align-items: flex-end;")).sendKeys("Iphone 13 +Keys.Enter");
//driver.findElement(By.xpath("//class[@apple-iphone-13-midnight-128-gb")).click();
//driver.findElement(By.linkText("APPLE 2020 Macbook Air M1 - (8 GB/256 GB SSD/Mac OS Big Sur) MGN63HN/A"));
//}
}

}