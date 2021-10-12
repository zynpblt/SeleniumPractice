package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T02_FirstTestChrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fzayd\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.trendyol.com");
        driver.manage().window().maximize();

        //1) URL kontrol
        String actualURL= driver.getCurrentUrl();
        System.out.println(actualURL);
        String expectedURL="https://www.trendyol.com";
        if (actualURL.equals(expectedURL)){
            System.out.println("test PASS");
        }else{
            System.out.println("Test FAILED");
        }

        //2)Title kontrol trendyol geciyor mu?
        String actualTitle= driver.getTitle();
        String containsTitle="trendyol";
        if (actualTitle.contains(containsTitle)){
            System.out.println("test PASS");
        }else{
            System.out.println("test FAILED");
        }

    }
}
