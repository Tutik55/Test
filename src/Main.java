import java.util.*;
public class Main{
    public static void main(String[] args){
        List<Double> nutVoce = Arrays.asList(5.0, 12.5, 4.0, 3.0, 2.0);       // suma 26.5
        List<Double> nutPovrce = Arrays.asList(10.0, 15.0, 8.0, 6.0, 3.0);    // suma 42.0
        List<Double> nutMeso = Arrays.asList(40.0, 30.0, 15.0, 5.0, 2.0);     // suma 92.0 -> *1.2 = 110.4

        Voce jabuka=new Voce("BiH",nutVoce,"latinjara");
        Povrce mrkva=new Povrce("Hrvatska",nutPovrce,"Litnski");
        Meso piletina=new Meso("Kosovo",nutMeso,VrstaMesa.Piletina);

        Prodavac prod=new Prodavac("Adnan","Tutic","12","LIC-2025-01");

        // Demonstracija: kalorije + Zdravlje()
        System.out.println("=== Kalorije namirnica ===");
        System.out.printf("Voće (jabuka): %.2f kcal%n", jabuka.DajBrojKalorija());
        System.out.printf("Povrće (mrkva): %.2f kcal%n", mrkva.DajBrojKalorija());
        System.out.printf("Meso (piletina): %.2f kcal%n", piletina.DajBrojKalorija());

        System.out.println("\n=== Zdravstveni kriteriji ===");
        double kVoce = 0.80;
        double kPovrce = 0.65;
        double kMeso = 0.98;
        double kProdavac = 0.0; // ignorira se, ali potpis je isti

        System.out.printf("Jabuka zdravo? %s%n", jabuka.Zdravlje(kVoce));
        System.out.printf("Mrkva zdravo? %s%n", mrkva.Zdravlje(kPovrce));
        System.out.printf("Piletina zdravo? %s%n", piletina.Zdravlje(kMeso));

        // Polimorfna lista subjekata za zdravstvenu provjeru
        List<Zdravstveno> subjekti = Arrays.asList(jabuka, mrkva, piletina);
        System.out.println("\n=== Polimorfna provjera preko interfejsa ===");
        double[] koefovi = {kVoce, kPovrce, kMeso, kProdavac};
        for (int i = 0; i < subjekti.size(); i++) {
            Zdravstveno z = subjekti.get(i);
            System.out.println(z + " -> Zdravlje: " + z.Zdravlje(koefovi[i]));
        }
    }
}