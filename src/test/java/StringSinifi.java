import org.junit.Test;

public class StringSinifi {

    @Test
    public void stringKarsilastirma(){
        String ad1 = "Melih";
        String ad2 = "melih";

        if(ad1.equals(ad2)){
            System.out.println("isimler ayni");
        }
        else if (ad1.equalsIgnoreCase(ad2)){
            System.out.println("Isimler ayni fakat birisi büyük harf ile yazilmis");
        }
        else {
            System.out.println("isimler ayni degil");
        }
    }

    @Test
    public void stringIslemleri(){
        String ad = "Melih";
        System.out.println(ad.length());
        System.out.println(ad.substring(2));
        System.out.println(ad.replace("e","a"));

        System.out.println("Merhaba \"Nasilsin\" \n \t \\ Dunya");
    }

    @Test
    public void stringBirlestirmeOrnek(){
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "test ";
        }
        System.out.println(str);

    }

    @Test
    public void stringAyirmaOrnek() {
        String str = "Merhaba Dunya deneme amacli bir yazi";
        String[] kelimeler = str.split(" ");
        for (String kelime: kelimeler) {
            System.out.println(kelime);
        }
    }

}
