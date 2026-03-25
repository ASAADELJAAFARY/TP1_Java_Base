package partie4;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = sc.nextLine();
        
        
        String chaineMin = chaine.toLowerCase();
        
        int nbVoyelles = 0;

       
        for (int i = 0; i < chaineMin.length(); i++) {
            char c = chaineMin.charAt(i);
            
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                nbVoyelles++;
            }
        }

       
        System.out.println("Le nombre de voyelles dans \"" + chaine + "\" est : " + nbVoyelles);

        sc.close();
    }
}