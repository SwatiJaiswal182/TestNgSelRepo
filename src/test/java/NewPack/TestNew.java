package NewPack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNew{


    @Test
    public void test() {
    	System.out.println("Testing");
    	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");

    	//Creating an object of ChromeDriver
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("www.google.com");
    	
    }

}