import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        int choice;
        double cost = 0;

        do {
            choice = menu.menu();
            switch (choice) {
                case 1:
                case 2:
                    cost += 100;
                    break;
                case 3:
                    cost += 150;
                    break;
                case 4:
                    cost += 200;
                    break;
                case 5:
                    cost += 75;
                    break;
                case 6:
                    System.out.println("Sipariş sonlandırıldı!");
                    break;
                default:
                    System.out.println("Hatalı işlem no. Tekrar deneyiniz!");
            }
            if (choice >= 1 && choice < 6)
                System.out.println("Ürün sipariş verilmiştir!");
        }while (choice != 6);

        System.out.println("Tutar: " + cost + "TL");

    }
}