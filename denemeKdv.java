import java.util.Scanner;

public class denemeKdv {
    public static void main(String[] args) {
    double tutar, kdvOran = 0.18, kdvOran2 = 0.8;
        Scanner input = new Scanner(System.in);
        System.out.println("Fiyat bilgisi giriniz :");
        tutar = input.nextDouble();

        double kdvtutar = (tutar >= 1000) ? tutar * kdvOran2 : tutar * kdvOran;
        double kdvliTutar = tutar + kdvtutar;


        System.out.println("Kdv Tutari :" +kdvtutar);
        System.out.println("Kdv'li Fiyat : " + kdvliTutar);










    }}



