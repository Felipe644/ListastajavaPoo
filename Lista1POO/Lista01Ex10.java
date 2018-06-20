package lista01ex10;

import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author Felipe Guilherme
 * 
 *    
 */

public class Lista01Ex10 {

    
    public static void main(String[] args) {
        Scanner escreva = new Scanner (System.in);
        
        
        
        System.out.println("Entre com o valor do raio: ");
        int raio = escreva.nextInt();
        float diam = raio * 2;
        float circ = (float) (Math.PI * diam);
        float area = (float) (Math.PI * (raio * raio));
        
        System.out.println("Diametro: " +diam);
        System.out.println("Circunferencia: "+ circ);
        System.out.println("Area: "+ area);
        
       
    }

}
