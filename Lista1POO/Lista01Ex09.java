package lista01ex09;

import java.util.Scanner;

/**
 *
 * @author Felipe Guilherme
 * 
 *    
 */
public class Lista01Ex09 {

    
    public static void main(String[] args) {
        Scanner escreva = new Scanner (System.in);
        
        System.out.print("Digite um valor: ");
        int n1 = escreva.nextInt();
        System.out.print("Digite outro valor: ");
        int n2 = escreva.nextInt();
        
        if (n1 % n2 == 0){
            System.out.println ("O numero "+ n1+" é multiplo de "+ n2);
            
        }else{
            System.out.println("O numero "+n1+ " nao é multiplo de "+ n2 );
        }
        
        
    }

}
