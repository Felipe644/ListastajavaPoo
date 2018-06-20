package lista01ex07;

import java.util.Scanner;

/**
 *
 * @author Felipe Guilherme
 * 
 *    
 */
public class Lista01Ex07 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite um valor: ");
        int n1 = input.nextInt();
        System.out.print("Digite outro valor: ");
        int n2 = input.nextInt();
        
        if (n1==n2){
            System.out.println("These numbers are equal");
            System.exit(0);
        }
        if (n1<n2){
            System.out.printf("%d is larger\n", n2);
        }else{
            System.out.printf("%d is larger\n", n1);
        }
        
    }

}
