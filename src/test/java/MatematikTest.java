import org.junit.Test;

public class MatematikTest {

    @Test
    public void toplamaTest(){
        Matematik mat = new Matematik();
        System.out.println(mat.topla(2, 4));
        System.out.println(mat.topla(2, 4, 6));
        System.out.println(mat.cikar(2, 4));
        System.out.println(mat.carp(2, 4));
        System.out.println(mat.bol(2, 4));
        System.out.println(mat.kareAl(2));

        mat.topla2(2, 4);
        mat.topla2(2);
        mat.topla2(2, 4, 8, 3, 5);

    }






}
