import Bolmeislemi.*;

public class Main {

    public static void main(String[] args) {
        Bolmeislemi bolmeIslemi = new Bolmeislemi();

        int sayi1 = 10;
        int sayi2 = 2;

        Integer sonuc = bolmeIslemi.bolme(sayi1, sayi2);

        if (sonuc != null) {
            System.out.println("Sonuç: " + sonuc);
        }
    }
}
