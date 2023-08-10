import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String haftaGunleri[] = {"PazarTesi" , "Sali" , "Carcampa" , "Persamba" , "Cuma" , "Cumartesi" ,"Pazar"};
        for(int i = 0 ; i <haftaGunleri.length ; i++){
            System.out.println(haftaGunleri[i]);
        }
        System.out.println("Haftanin Sayi Gunu Giriniz :");
        Scanner scanner = new Scanner(System.in);
        int gunSayisi ;
        gunSayisi = scanner.nextInt();
        switch (gunSayisi) {
            case 7 :
            case 6 :
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Hafta Ici");
        }

    }
}