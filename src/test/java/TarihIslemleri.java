import org.junit.Test;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TarihIslemleri {

    @Test
    public void ornekTarih() throws ParseException {
        Date tarih = new Date();
        System.out.println(tarih);

        DateFormat formatlayici = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String buGun = formatlayici.format(tarih);
        formatlayici.parse("16/09/1981");

        System.out.println(buGun);

        System.out.println(tarih.getTime());
        System.out.println(System.currentTimeMillis());
    }


    //Doğum gununuzden bu yana kac ms gectigini yazdirin ?
    @Test
    public void dogumTarihiHesaplama() throws ParseException {
        DateFormat formatlayici = new SimpleDateFormat("dd/MM/yyyy");
        Date dogumGunu = formatlayici.parse("16/09/1981");
        Date buGun = new Date();

        long dogumGunumdenSimdiyeKadarkiZaman = buGun.getTime() - dogumGunu.getTime();
        System.out.println(dogumGunumdenSimdiyeKadarkiZaman);
        System.out.println(dogumGunumdenSimdiyeKadarkiZaman/1000);
        System.out.println(dogumGunumdenSimdiyeKadarkiZaman/1000/60);
        System.out.println(dogumGunumdenSimdiyeKadarkiZaman/1000/60/60);
        System.out.println(dogumGunumdenSimdiyeKadarkiZaman/1000/60/60/24);
        System.out.println(dogumGunumdenSimdiyeKadarkiZaman/1000/60/60/24/30);
        System.out.println(dogumGunumdenSimdiyeKadarkiZaman/1000/60/60/24/30/12);

        Calendar cal = Calendar.getInstance();
        cal.setTime(dogumGunu);
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));

    }
}
