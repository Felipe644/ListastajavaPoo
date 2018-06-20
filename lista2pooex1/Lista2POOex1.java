
package lista2pooex1;

import java.util.Scanner;

public class Lista2POOex1 {
    public static void main(String[] args) {
        Scanner escreva=new Scanner(System.in);
        CotaJoao c1=new CotaJoao();
        c1.abrirConta("CC");
         System.out.println("Digite o Nome do Dono ");
        c1.setNome(escreva.nextLine());
        System.out.println("Digite o endereço: ");
        c1.setEndereco(escreva.next());
        System.out.println("Digite o CPF: ");
        c1.setCpf(escreva.next());
        System.out.println("Digite o RG: ");
        c1.setRg(escreva.nextInt());
        int opc=0;
        while(opc!= 5){
            System.out.println("==================MENU==================");
            System.out.println("DIGITE 1 PARA DEPOSITAR");
            System.out.println("DIGITE 2 PARA SACAR ");
            System.out.println("DIGITE 3 PARA IMPRIMIR SEU SALDO");
            System.out.println("DIGITE 4 PARA VER O STATUS DA SUA CONTA");
            System.out.println("OPÇÂO");
            opc=escreva.nextInt();
            switch(opc){
                case 1:
                    System.out.print("VALOR: ");
                    c1.depositar(escreva.nextInt());
                    break;
                case 2:
                    System.out.print("VALOR: ");
                    c1.sacar(escreva.nextInt());
                    break;
                case 3:
                    c1.imprimirBoleto();
                    break;
                case 4:
                    c1.estadoAtual();
                    break;
            }
        }
   
    }
    
}
