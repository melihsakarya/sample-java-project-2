import org.junit.Test;

public class MetodOrnek {

    @Test
    public void toplamaOrnek(){
        Ornek orn = new Ornek();
        int donenDeger = orn.topla(2, 4);
        System.out.println(donenDeger);
    }
}
