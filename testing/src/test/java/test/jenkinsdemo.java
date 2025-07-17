package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class jenkinsdemo {

    static WebDriver driver;
    static WebDriver sdriver;

    public static void main(String[] args) {

        String BROWSER = System.getProperty("browser");

        if (BROWSER.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (BROWSER.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (BROWSER.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Invalid browser passed: " + BROWSER);
            return;
        }

        System.out.println("Browser Launching...");
        sdriver = driver;

        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("a is greater = " + a);
        } else if (b > a) {
            System.out.println("b is greater = " + b);
        } else {
            System.out.println("good bye");
        }

        driver.quit();
    }
}
