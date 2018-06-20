package lista01ex08;

import java.util.Scanner;

/**
 *
 * @author Felipe Guilherme
 * 
 *    
 */
public class Lista01Ex08 {

    
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int n1 = escreva.nextInt();
        System.out.print("Digite um valor: ");
        int n2 = escreva.nextInt();
        System.out.print("Digite um valor: ");
        int n3 = escreva.nextInt();
        
        int soma = n1 + n2+ n3;
        int media = soma /3;
        int prod = n1 * n2 *n3;
        
        System.out.println("A media é: "+ media);
        System.out.println("A soma é: "+ soma);
        System.out.println("O produto é: "+ prod); 
        
        if (n3>n2 && n3>n1){
            System.out.println("O maior numero é: "+ n3);
            
        }else if (n2>n1 && n2>n3){
            System.out.println("O maior numero é: "+ n2);
            
        }else{
            System.out.println("O maior numero é: "+ n1);
        }
    }

}
