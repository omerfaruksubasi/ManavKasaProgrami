import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("armuttan kac kilo aldiniz? ");
        armut = input.nextDouble();
        toplam += 2.14*armut;
        System.out.print("elma kac kilo aldiniz? ");
        elma = input.nextDouble();
        toplam += 3.67*elma;
        System.out.print("domates kac kilo aldiniz? ");
        domates = input.nextDouble();
        toplam += 1.11*domates;
        System.out.print("muzdan kac kilo aldiniz? ");
        muz = input.nextDouble();
        toplam += 0.95*muz;
        System.out.print("patlicandan kac kilo aldiniz? ");
        patlican = input.nextDouble();
        toplam += 5.00*patlican;

        System.out.println("toplam fiyat: "+toplam);
    }
}
