import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        String correctPIN = "1111";     // chosen PIN
        String PIN;
        double balance = 0;
        Scanner inp = new Scanner(System.in);
        int choice;

        System.out.println("PIN kodunu giriniz: ");
        PIN = inp.next();
        if (PIN.equals(correctPIN)) {
            do {
                System.out.println("1. Bakiye Görüntüleme");
                System.out.println("2. Para Yatırma");
                System.out.println("3. Para Çekme");
                System.out.println("4. Çıkış");
                System.out.println("İşleminizi seçiniz (1-4): ");
                choice = inp.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Bakiyeniz: " + balance + " TL");
                        break;
                    case 2:
                        System.out.println("Yatıracak para miktarını seçin: ");
                        double deposit = inp.nextDouble();
                        balance += deposit;
                        break;
                    case 3:
                        System.out.println("Çekecek para miktarını seçin: ");
                        double withdrawal = inp.nextDouble();
                        if (withdrawal > balance) {
                            System.out.println("Yetersiz bakiye! Çekim yapabilmek için " + (withdrawal-balance) + " TL eksik!");
                        }
                        else {
                            balance -= withdrawal;
                            System.out.println("Para çekme işlemi başarılı!");
                        }
                        break;
                    case 4:
                        System.out.println("İşlem sonladırıldı. Çıkış yapılıyor...");
                        break;
                    default:
                        System.out.println("Hatalı işlem no girdiniz. Tekrar deneyiniz!");
                }
            }while(choice != 4);
        }
        else System.out.println("Hatalı PIN!");

    }
}