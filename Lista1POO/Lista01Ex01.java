package lista01ex01;

import java.util.Scanner;

/**
 *
 * @author Felipe Guilherme
 * 
 *    
 */
public class Lista01Ex01 {

    
    public static void main(String[] args) {
    Scanner escreva = new Scanner (System.in);   
        float mensalidade = 550 ;
        float valorCheio = mensalidade;
        
       
        for (int mes = 1; mes<=48; mes++ ) {       
            if ((mes == 12) || (mes == 24) || (mes == 36) || (mes == 48)){
                
            mensalidade += mensalidade * 0.1f;
            
            
            }
           
            
            valorCheio += mensalidade;
        }  
        System.out.printf("O valor total a ser pago é $%.2f\n", valorCheio);
        System.out.print("Quanto sera descontado em % ? ");
        int porcentagemDesconto = escreva.nextInt();
        
        float desconto = (porcentagemDesconto * valorCheio)/100 ;
        float valorfinal = valorCheio - desconto;
        System.out.printf("O valor com desconto é : $%.2f\n " , valorfinal);
        
        
        
    }

}
