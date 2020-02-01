import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDrJSG {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Jai Shree Ganesh");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://google.co.in");
		driver.findElement(By.id("lst-ib")).click();
		(driver.findElement(By.id("lst-ib"))).sendKeys("Jai Shree Ganesh");
		(driver.findElement(By.name("btnG"))).click();
		
		
		

	}

}
