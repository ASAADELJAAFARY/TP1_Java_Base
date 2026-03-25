package partie;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   
        System.out.print("Entrez N: ");
        int N4 = sc.nextInt();
        int somme = 0, j = 1;
        while (j <= N4) { somme += j; j++; }
        System.out.println("Somme: " + somme);

}
}	
