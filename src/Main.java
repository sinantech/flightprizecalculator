import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe;
        int yolculuktipi;
        int yas;
        double normaltutar;

        System.out.print("Lutfen Gidilecek Mesafeyi Km Cinsinden Giriniz : ");
        Scanner input = new Scanner(System.in);
        mesafe = input.nextInt();

        System.out.print("Lutfen Yasinizi Giriniz : ");
        Scanner input2 = new Scanner(System.in);
        yas = input2.nextInt();

        System.out.print("Lutfen Yolculuk Tipini Giriniz Asamoah : ");
        System.out.print("1-Tek Yon,2-Gidis-Donus : ");
        Scanner input3 = new Scanner(System.in);
        yolculuktipi = input3.nextInt();

        normaltutar = (mesafe * 0.10);

        switch (yolculuktipi) {
            case 1:
                if (yas >= 0 && yas <= 12) {
                    System.out.println("Ucret : " + (normaltutar * 0.5) + " Euro");
                } else if (yas > 12 && yas <= 24) {
                    System.out.println("Ucret : " + (normaltutar * 0.9) + " Euro");
                } else if (yas >= 65) {
                    System.out.println("Ucret : " + (normaltutar * 0.7) + " Euro");
                } else if (yas < 0 || mesafe < 0) {
                    System.out.println("Yas ve Mesafe Negatif Olamaz");
                } else {
                    System.out.println("Ucret : " + normaltutar + "Euro");
                }
                break;
            case 2:
                if (yas >= 0 && yas <= 12) {
                    System.out.println("Ucret : " + (normaltutar * 0.5 * 0.8) + " Euro");
                } else if (yas > 12 && yas <= 24) {
                    System.out.println("Ucret : " + (normaltutar * 0.9 * 0.8) + " Euro");
                } else if (yas >= 65) {
                    System.out.println("Ucret : " + (normaltutar * 0.7 * 0.8) + " Euro");
                } else if (yas < 0 || mesafe < 0){
                    System.out.println("Yas ve Mesafeyi Pozitif Giriniz");
                } else {
                    System.out.println("Ucret : " + normaltutar + "Euro");
                }
                break;
        }


    }
}