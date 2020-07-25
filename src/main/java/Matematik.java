public class Matematik {

    int topla(int sayi1, int sayi2){
       return sayi1 + sayi2;
    }

    int topla(int sayi1, int sayi2, int sayi3){
        return sayi1 + sayi2 + sayi3;
    }

    int topla2(int ... sayiDizisi){
        return 0;
    }

    int cikar(int sayi1, int sayi2){
       return sayi1 - sayi2;
    }

    int carp(int sayi1, int sayi2){
       return sayi1 * sayi2;
    }

    double bol(int sayi1, int sayi2){
       return sayi1 / (double)sayi2;
    }

    int kareAl(int sayi){
        //return sayi * sayi;
        return carp(sayi, sayi);
    }




}
