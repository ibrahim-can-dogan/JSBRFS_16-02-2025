import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double avg = 0;
        double grades, min, max;
        boolean checkLow = false;

        System.out.println( "1. Notu giriniz: ");
        grades = inp.nextDouble();
        min = grades;
        max = grades;
        avg += grades;

        for (int i = 1; i < 5; i++) {

            if(grades < 30)
                checkLow = true;

            System.out.println((i+1) + ". Notu giriniz: ");
            grades = inp.nextDouble();

            if (grades > max)
                max = grades;
            else if (grades < min)
                min = grades;

            avg += grades;
        }

        avg /= 5;
        if (avg > 50) {
            System.out.println("Geçti");
        }
        else System.out.println("Kaldı");

        if (checkLow)
            System.out.println("Düşük not aldığınız dersler var!");

        System.out.println("Maksimum: " + max);
        System.out.println("Minimum: " + min);
    }
}