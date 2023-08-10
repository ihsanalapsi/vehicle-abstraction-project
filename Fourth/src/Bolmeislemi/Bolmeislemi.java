package Bolmeislemi;

public class Bolmeislemi {

    public Integer bolme(int a, int b) {
        try {
            int c = a / b;
            System.out.println(a + " / " + b + " = " + c);
            return c;
        } catch (ArithmeticException e) {
            System.out.println("Hata oluştu: " + e.getMessage());
            return null;
        }
    }
}
