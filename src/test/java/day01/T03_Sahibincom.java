package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class T03_Sahibincom {
    //    /*
    //1) driver olusturun
    //2) Tam ekran yapin
    //3) Driver'in sayfanin yüklenmesi için 10.000 milisaniye beklemesini ayarlayin
    //4) getir.com adresine gidin
    //5) web sayfasinin sayfa basligini(title) alin ve ekrana yazdirin
    //6) web sayfasinin url'ini alin ve ekrana yazdirin
    //7) web sayfasinin title'inin "getir" icerdigini kontrol edin
    //8) gittigidiyor.com adresine gidin
    //9) web sayfasinin sayfa basligini(title) alin ve ekrana yazdirin
    //10) web sayfasinin url'ini alin ve ekrana yazdirin
    //11) Title'in Gittigidiyor icerdigini kontrol edin.
    //12) sahibinden.com sayfasina geri don.
    //13) sayfayi yenile
    //14) onceki sayfaya don
    //
    //     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fzayd\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get("https://www.getir.com");
        String actualTitle=driver.getTitle();
        String expectedTitle="getir";

        System.out.println(actualTitle);
        String actualURL= driver.getCurrentUrl();
        System.out.println(actualURL);

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test title PASS");
        }else{
            System.out.println("test title FAILED");
        }

        driver.get("https://www.gittigidiyor.com");

        String actualTitlegittigidiyor= driver.getTitle();

        String expectedTitlegittigidiyor="Gittigidiyor";
        System.out.println("actualTitlegitigidiyor = " + actualTitlegittigidiyor);
        String actualURLgittigidiyor= driver.getCurrentUrl();
        System.out.println("actualURLgittigidiyor = " + actualURLgittigidiyor);

        if (actualTitlegittigidiyor.contains(expectedTitlegittigidiyor)){
            System.out.println("gittigidiyotTitle PASS");
        }else{
            System.out.println("gittigidiyorTitle FAILED");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.close();

    }
}
