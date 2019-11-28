import java.util.Scanner;

public class Cw5 {
    public static void main(String[] args){
        System.out.println("Podaj promien kuli");
        Scanner scan = new Scanner(System.in);
        double radius=scan.nextDouble();
        double powField=2;
        double powVolume=3;
        double sphereField=4*Math.PI*Math.pow(radius,powField);
        if (radius<=0){
            System.out.println("Promien nie może być mniejszy badz rowny zero ");
            //1.Co zrobić żeby program nie pokazał wyniku?
        }
        double volumeOfTheBall=(4/3)*Math.PI*Math.pow(radius,powVolume);
        System.out.println("Pole kuli wynosi "+ sphereField);
        System.out.println("Objetosc kuli wynosi "+ volumeOfTheBall);
    }
//2.Dlaczego w wyniku jest tak dużo miejsc po przecinku?
//3.Dlaczego program nie przyjmuje liczb zmiennoprzecinkowych?

}
