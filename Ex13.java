
package partie4;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Entrez une chaîne à inverser : ");
        String original = sc.nextLine();
        
        
        String inverse = "";

        
        for (int i = original.length() - 1; i >= 0; i--) {

            inverse = inverse + original.charAt(i);
        }

        
        System.out.println("La chaîne inversée est : " + inverse);

        sc.close();
    }
}