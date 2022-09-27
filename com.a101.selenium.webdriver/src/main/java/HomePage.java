import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void cookieAccept() {
//        Cookie'leri kabul et seçeneğine tıklar.
        System.out.println("Cerezler Kabul edildi.");
        click(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']"));
        System.out.println("Ana Sayfaya Giris Yapildi.");



    }

    public void clickNavBar()  {
//        Giyim&Aksesuar seceneğine tıklar.
        click(By.xpath("//a[normalize-space()='Giyim & aksesuar']"));
        System.out.println("Giyim&Aksesuar Secenegine Tiklandi.");




    }
}

