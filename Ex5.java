package partie2;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau (N): ");
        int n = sc.nextInt();
        int[] T = new int[n];

        // Remplissage
        for (int i = 0; i < n; i++) {
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
        }

        // Affichage
        System.out.print("Les éléments du tableau sont: ");
        for (int i = 0; i < n; i++) {
            System.out.print(T[i] + " ");
        }
    }
}