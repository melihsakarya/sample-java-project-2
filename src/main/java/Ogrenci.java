public class Ogrenci {
    String ad;
    String soyad;
    Integer ogrenciNo;
    String bolum;
    Integer yas;

    Adres evAdresi = new Adres();

    public void dersCalis(){
        System.out.println(ad + " " + soyad + " ders calisiyor");
    }
}
