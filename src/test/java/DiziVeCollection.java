import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class DiziVeCollection {

    @Test
    public void diziOrnek(){
        String[] sehirler = new String[5];
        sehirler[0] = "Ankara";
        sehirler[1] = "Istanbul";
        sehirler[2] = "Izmir";
        sehirler[3] = "Mugla";
        sehirler[4] = "Antalya";


        System.out.println(sehirler[2]);
        System.out.println(sehirler[4]);

        for (int i = 0; i < sehirler.length; i ++){
            System.out.println(i + " - " + sehirler[i]);
        }

        for (String sehir: sehirler) {
            System.out.println(sehir);
        }

    }

    @Test
    public void diziOrnek2(){
        String[] sehirler = {"Ankara", "Istanbul", "Izmir", "Mugla", "Antalya"};
        for (String sehir: sehirler) {
            System.out.println(sehir);
        }
    }

    @Test
    public void cokBoyutluDizi(){
        String[][] cokBoyutluDizi = new String[6][4];

        cokBoyutluDizi[0][1] = "Ankara";
        cokBoyutluDizi[0][2] = "Kırşehir";
        cokBoyutluDizi[1][0] = "Istanbul";
        cokBoyutluDizi[1][2] = "Edirne";

        // 10 a 10 bir dizi yapin her bir alanin icerisine index carpimlarini ekleyin
        // [6][4] = 24

    }

    @Test
    public void diziSiralama(){
        String[] sehirler = {"Ankara", "Istanbul", "Izmir", "Mugla", "Antalya"};
        for (String sehir: sehirler) {
            System.out.println(sehir);
        }

        System.out.println("*****");
        Arrays.sort(sehirler);

        for (String sehir: sehirler) {
            System.out.println(sehir);
        }
    }

    @Test
    public void listeOrnek(){
        List<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Izmir");
        sehirler.add("Adana");

        System.out.println(sehirler.size());
        System.out.println(sehirler.get(0));
        sehirler.remove("Ankara");

    }

    @Test
    public void ornekElemanYakalama(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gittigidiyor.com/uye-girisi");

        WebElement kullaniciElementi = driver.findElement(By.name("kullanici"));
        kullaniciElementi.sendKeys("melih.sakarya");
        kullaniciElementi.clear();
        kullaniciElementi.click();
        kullaniciElementi.sendKeys("Ahmet.dursun");
        kullaniciElementi.clear();
        driver.quit();
    }

    @Test
    public void anasayfaNesneleri(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gittigidiyor.com/uye-girisi");

        List<WebElement> ekrandakiInputNesneleri = driver.findElements(By.tagName("input"));

        for (WebElement eleman: ekrandakiInputNesneleri) {
            System.out.println(eleman.getAttribute("name"));
        }

        driver.quit();
    }

    @Test
    public void mapOrnek(){
        Map<Integer, String> liste = new LinkedHashMap<>();
        liste.put(10, "Balıkesir");
        liste.put(34, "Istanbul");
        liste.put(35, "Izmir");
        liste.put(6, "Ankara");

        //System.out.println(liste.get(10));

        for (String sehirAdi: liste.values()) {
            System.out.println(sehirAdi);
        }

    }

    @Test
    public void setOrnek(){
        Set<String> sehirler = new HashSet<>();
        sehirler.add("Ankara");
        sehirler.add("Ankara");
        sehirler.add("Ankara");
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Izmir");
        sehirler.add("Adana");

        System.out.println(sehirler.size());

    }

    @Test
    public void listOrnek(){
        List<String> sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("Ankara");
        sehirler.add("Ankara");
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Izmir");
        sehirler.add("Adana");

        System.out.println(sehirler.size());

    }

}
