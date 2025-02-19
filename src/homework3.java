import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        double speed;
        Scanner inp = new Scanner(System.in);

        System.out.println("Hız giriniz");
        speed = inp.nextDouble();

        if (speed > 130)
            System.out.println("Sürücünün ehliyetine el konuldu");
        else if (speed > 110)
            System.out.println("2000 TL para cezası");
        else if (speed > 90)
            System.out.println("1000 TL para cezası");
        else System.out.println("Hız sınırı aşılmamış");
    }
}