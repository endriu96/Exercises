import java.util.Scanner;
//1.Jaki kod napisać żeby rata była właściwie obliczana?
public class Cw6 {

    public static void main(String[] args) {
        String info = "Podaj cene towaru w zakresie od 1000 zł do 50000 zł";
        System.out.println(info);

        Scanner scan = new Scanner(System.in);
        int cenaTowaru = scan.nextInt();
        if (/* 1. 50000<= ?*/cenaTowaru <= 1000) {
            System.out.println(info);
        }
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj liczbe rat w zakresie od 1 do 48");
        int liczbaRat = scan1.nextInt();
        double oprocentowanie1 = 3.0 / 100.0;
        double oprocentowanie2 = 6.0 / 100.0;
        double oprocentowanie3 = 10.0 / 100.0;

        if (liczbaRat >= 1 && liczbaRat <= 12) {
            System.out.println("Twoja rata wynosi= " + cenaTowaru / liczbaRat * (1 + oprocentowanie1));
        } else if (liczbaRat > 12 && liczbaRat <= 24) {
            System.out.println("Twoja rata wynosi= " + cenaTowaru / liczbaRat * (1 + oprocentowanie2));

        } else if (liczbaRat > 24 && liczbaRat <= 48) {
            System.out.println("Twoja rata wynosi= " + cenaTowaru / liczbaRat * (1 + oprocentowanie3));
        }


    }
}

