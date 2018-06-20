package lista01ex02;

import java.util.Scanner;

/**
 *
 * @author Felipe Guilherme
 * 
 *    
 */
public class Lista01Ex02 {

    
    public static void main(String[] args) {
        Scanner escreva = new Scanner (System.in);
        System.out.println("Digite uma distancia que vá ate 12 km ");
        float d = escreva.nextFloat();
        
        if (d > 0 && d <= 12) {
         
         int metro = (int) (d * 1000);
         float t = metro /(20 / 3.6f) ;
         
            System.out.println("A onda chegou a distancia de " +d+" km em "+ (t/60)+" minutos");
                   
                    
         }    

       
        
    }

}
