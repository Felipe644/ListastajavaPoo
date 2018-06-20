package lista01ex06;

import java.util.Scanner;

/**
 *
 * @author Felipe Guilherme
 * 
 *    
 */
public class Lista01Ex06 {

    
    public static void main(String[] args) {
        Scanner escreva = new Scanner (System.in);
        
        System.out.println("Entre com um valor: ");
        int n1 = escreva.nextInt();
        System.out.println("Entre com outro valor: ");
        int n2 = escreva.nextInt();
        
        int soma = n1 + n2;
        int prod = n1 * n2;
        int dif = n1 - n2;
        int div = n1/n2;
        
        System.out.println("A soma é: "+ soma);
        System.out.println("O produto é: "+ prod);
        System.out.println("A diferença é: "+ dif);
        System.out.println("A divisão é: "+ div);
    }
    

}
