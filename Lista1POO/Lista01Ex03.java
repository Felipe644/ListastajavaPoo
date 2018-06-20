package lista01ex03;

import java.util.Scanner;

/**
 *
 * @author Felipe Guilherme
 * 
 *    
 */
public class Lista01Ex03 {

    
    
    public static void main(String[] args) {
      Scanner escreva = new Scanner (System.in);  
        
      
        System.out.println("Entre com um valor que tenha no minimo 3 digitos ");
        int num = escreva.nextInt();
        
        if (num >= 3){
            
             
       int x = num / 100; 
       int y = (num % 100) / 10; 
       int z = (num % 100) % 10; 
      
            System.out.println(""+z+""+y+""+x);  
        }
       
        
        
         
      
    }

}
