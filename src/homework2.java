import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        double product1 = 5;        // products and price
        double product2 = 10;       // products and price
        double product3 = 15;       // products and price
        Scanner inp = new Scanner(System.in);
        String input;
        double totalCost = 0;

        do {
            System.out.println("Alacağınız ürünü seçin product1, product2, product3 (işlemi sonlandırmak inin 0 girin): ");
            input = inp.next();
            switch (input) {
                case "product1":
                    totalCost += product1;
                    break;
                case "product2":
                    totalCost += product2;
                    break;
                case "product3":
                    totalCost += product3;
                    break;
                case "0":
                    System.out.println("İndirim kuponu kullanmak ister misiniz? (evet/hayır): ");
                    String coupon = inp.next();
                    if (coupon.equals("evet")) {
                        System.out.println("%10 indirim yapıldı!");
                        totalCost *= 0.9;
                    }
                    else if (coupon.equals("hayır")){
                        System.out.println("Kupon kullanılmadı");
                    }
                    System.out.println("Alışveriş sonlandırıldı. Tutar:" + totalCost);
                    break;
                default:
                    System.out.println("Hatalı ürün adı! Tekrar deneyiniz.");
            }
        }while (!input.equals("0"));
    }
}