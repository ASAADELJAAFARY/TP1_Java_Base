package partie2;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille N: ");
        int n = sc.nextInt();
        int[] T = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
        }

        int max = T[0]; // Kan-supposer-w l-lowel howa l-kbir
        for (int i = 1; i < n; i++) {
            if (T[i] > max) {
                max = T[i];
            }
        }

        System.out.println("Le plus grand élément est: " + max);
    }
}