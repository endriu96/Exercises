import java.util.Scanner;

public class AttractiveCompaniesCalculator {
    public static void main(String[]args) {
        
        System.out.println("Oto  prosty kalkulator atrakcyjności spółek giełdowych,który pokazuje czy spolka" +
                "\n" + "jest atrakcyjna na podstawie wskaźników:C/Z, ROE i ROA " + "\n" +
                "Aby rozpocząć podaj wymagane wartości.(Wartości możesz pobrać m.in. z raportów finansowych spółek)");
        System.out.println("Podaj obecną wartość wszystkich akcji danej spółki:");
        Scanner scan = new Scanner(System.in);
        double StocksPrice = scan.nextDouble();
        System.out.println("Podaj najbardziej aktualny zysk spółki ");
        Scanner scan1 = new Scanner(System.in);
        double StocksEarnings = scan1.nextDouble();
        System.out.println("Wskaźnik C/Z wynosi:" + StocksPrice / StocksEarnings);

        System.out.println("Podaj wartość kapitału własnego spółki");
        Scanner scan2 = new Scanner(System.in);
        double equityCapial = scan2.nextDouble();
        System.out.println(StocksEarnings / equityCapial);
        System.out.println("Wartość ROE mówi nam ile na na kapitale posiadanym przez spółkę generujemy ZYSKU" +
                "\n" + "Przykładowo jeżeli zakładamy firmę wpłacając jako kapitał na jej założenie 100 zł i " +
                "\n" + "przez rok zarobimy 50 zł (Zarobimy czyli ile wychodzimy na czysto odliczając koszty)" +
                "\n" + "wówczas nasz ROE wynosi 50%. Im wyższa wartość ROE tym spółka jest atrakcyjniejsza");

        System.out.println("Podaj wartość aktywów");
        Scanner scan3=new Scanner(System.in);
        double assets=scan3.nextDouble();
        System.out.println(StocksEarnings/assets);
        System.out.println("Wartość ROA jest podobna do ROE. Zasadnicza różnica polega na tym, że podstawą obliczania " +
                "\n"+"ROA nie jest kapitał własny ale same aktywa bez odejmowania zobowiązań tak jak w przypadku ROE" +
                "\n"+"Jest to o tyle isotne, że ROA pokazuje nam w jakim stopniu majątek firmy jest finansowany długiem" +
                "\n"+ "Jeżeli wskaźnik ROE wynosi 20% a ROA 10% oznacza to że połowa majątku jest finansowana kapitałem" +
                "\n"+ "obcym. Im ROA jest bliżej ROE tym spółka jest bardziej atrakcyjna");
    }
}
