package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
            //Launch the Chrome browser
            WebDriver driver = new ChromeDriver();
            driver.get(baseUrl);
            //The URl will open in the Browser
            String title = driver.getTitle();//Getting the title of the URL
            System.out.println(title);//Printing the title of URL
            System.out.println("Current URL: " + driver. getCurrentUrl());
            //getting the current URL
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            //Click on Login link Element
            loginLink.click();
            //find the email field Element
            WebElement emailFIeld = driver.findElement(By.id("Email"));
            //Print the email in Email Field
            emailFIeld.sendKeys("sitaram123@gmail.com");
            //find the password field Element
            WebElement passwordField = driver.findElement(By.id("Password"));
            //print the Password  in Password Field Element
            passwordField.sendKeys("sitaram");
//close the browser
            driver.close();
        }

    }

