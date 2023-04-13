package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "FireFox";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;
    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        }else{
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);
        WebElement emailFIeld = driver.findElement(By.id("Email"));
        emailFIeld.sendKeys("sitaram123@gmail.com");
        WebElement passWordField = driver.findElement(By.id("Password"));
passWordField.sendKeys("sitaram");
driver.close();

    }
}
