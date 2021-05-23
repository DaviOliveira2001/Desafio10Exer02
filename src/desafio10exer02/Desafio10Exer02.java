/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio10exer02;

import java.util.Scanner;

/**
 *
 * @author odavi
 */
public class Desafio10Exer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String nome;
        double valorCompras;
        for(int cont = 1; cont <=150; cont++ ){
            System.out.println("Informe o nome do cliente:");
            nome = teclado.nextLine();
            System.out.println("Informe o valor de suas compras:");
            valorCompras = teclado.nextDouble();
            if(valorCompras < 500.000){
                System.out.println("Caro cliente, o valor gasto nas suas compras lhe conferiu um bônus de 10% em qualquer uma de nossas lojas! Aproveite!!");
            } else{
                System.out.println("Caro cliente, o valor gasto nas suas compras lhe conferiu um bônus de 15% em qualquer uma de nossas lojas! Aproveite!!");
            }
        }
    }
    
}
