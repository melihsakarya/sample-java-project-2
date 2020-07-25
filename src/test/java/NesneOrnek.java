import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NesneOrnek {

    @Test
    public void ogrenciTest(){
        Ogrenci o1 = new Ogrenci();
        o1.ad = "Melih";
        o1.soyad = "Sakarya";
        o1.bolum = "IT";
        o1.ogrenciNo = 33;
        o1.yas = 39;
        o1.dersCalis();


        Ogrenci o2 = new Ogrenci();
        o2.ad = "Ahmet";
        o2.soyad = "Dursun";
        o2.yas = 44;
        o2.bolum = "Spor";
        o2.evAdresi.cadde = "Karanfil";
        o2.evAdresi.il = "Istanbul";
        o2.dersCalis();

    }

    @Test
    public void seleniumOrnek(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.n11.com");
    }

    @Test
    public void calisanOrnek(){
        Calisan calisan = new Calisan();
        calisan.ad = "Melih";
        calisan.soyad = "Sakarya";

        calisan.departman = new Departman();
        calisan.departman.ad = "Yazılım";

        calisan.evAdresi = new Adres();
        calisan.evAdresi.cadde = "Barbaros";
        calisan.evAdresi.ilce = "Atasehir";
        calisan.evAdresi.sokak = "Karanfil";

        calisan.yonetici = new Calisan();
        calisan.yonetici.ad  = "Ahmet";
        calisan.yonetici.soyad = "Dursun";

        calisan.calis();
    }


}
