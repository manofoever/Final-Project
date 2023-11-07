package com.demo.server_testing;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Server_Testing {
	public static String performServer_Testing() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("http://3.19.148.225:8081/contact.html");

        driver.findElement(By.id("inputName")).sendKeys("Hello");
        System.out.println("Name Updated!");
        Thread.sleep(1000);
        driver.findElement(By.id("inputNumber")).sendKeys("123456");
        System.out.println("Number Updated!");
        Thread.sleep(1000);
        driver.findElement(By.id("inputMail")).sendKeys("abc@gmail.com");
        System.out.println("Mail Updated!");
        Thread.sleep(1000);
        driver.findElement(By.id("inputMessage")).sendKeys("123456");
        System.out.println("Message Updated!");
        Thread.sleep(1000);
        driver.findElement(By.id("my-button")).click();
        Thread.sleep(2000);
        String responseText = driver.findElement(By.id("response")).getText();
        driver.quit();
        
        

        return responseText;
    }
}
