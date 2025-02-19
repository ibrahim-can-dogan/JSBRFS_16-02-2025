import java.util.Scanner;

public class menu {


    public static int menu() {
        int choice;
        Scanner inp = new Scanner(System.in);
        System.out.println("Menü:");
        System.out.println("1. Domates Çorbası - 100 TL");
        System.out.println("2. Mercimek Çorbası - 100 TL");
        System.out.println("3. Kumpir - 150 TL");
        System.out.println("4. Pizza - 200 TL");
        System.out.println("5. Tiramisu - 75 TL");
        System.out.println("6. Siparişi sonlandır");

        System.out.println("Sipariş vermek istediğiniz ürünün numarasını girin (1-6): ");
        choice = inp.nextInt();
        return choice;
    }
}
