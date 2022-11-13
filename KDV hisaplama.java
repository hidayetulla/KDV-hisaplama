import java.util.Scanner;
public class pratik2 {
    public static void main(String[] args) {
        double tutar,kdvOrani = 0.18, kdvTutari, kdvliTutar;
        Scanner inp = new Scanner(System.in);

        System.out.print("tutari giriniz:");
        tutar = inp.nextInt();

        kdvTutari = tutar*kdvOrani;
        kdvliTutar = tutar+kdvTutari;

        System.out.println("kdvsiz tutar:"+tutar);
        System.out.println("kdv orani:"+ kdvOrani);
        System.out.println("kdv tutari:"+kdvTutari);
        System.out.println("kdvli tutar:"+kdvliTutar);
      
    }
}
