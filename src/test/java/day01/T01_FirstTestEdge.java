package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class T01_FirstTestEdge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\fzayd\\Documents\\selenium dependencies\\drivers\\msedgedriver");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.selenium.dev/");
    }
}
