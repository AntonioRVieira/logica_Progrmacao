/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

/**
 *
 * @author AntônioVieira
 */
import java.util.Scanner;
public class DesafioSwitchCase {
 
    public static void main(String[] args) {
   
        //variaveis
   int numeroProduto, quantidadeProduto;
   double valorTotal;
    
   
 //Scanner
   Scanner entradaNumero = new Scanner(System.in);
   
 //Solicitar os dados
 
        System.out.println("---LANCHONETE---");
        
        System.out.println("Digite sua opcao");   
        System.out.println("1-Hamburguer....15\n2-Pizza.......25\n3-Cachorro-Quente.....12\n4-Refrigerante.......6\n5-Suco.......8");
        numeroProduto = entradaNumero.nextInt();
        System.out.println("Qual e quantidade");
        quantidadeProduto = entradaNumero.nextInt();
       
        
        
        
     switch(numeroProduto) {  
        
         case 1:
             System.out.println("Voce escolheu Hamburguer, que custa R$15, a quantidade comprada foi "+quantidadeProduto);
          valorTotal= 15 * quantidadeProduto;  
             System.out.println("O total da sua compra foi "+valorTotal+" reais");  
            break;  
         case 2:
           System.out.println("Voce escolheu a Pizza, que custa R$25, a quantidade comprada foi "+quantidadeProduto);  
                valorTotal= 25 * quantidadeProduto;
             System.out.println("O total da sua compra foi "+valorTotal+" reais");   
           break;
         case 3:
             System.out.println("Voce escolheu Cachorro-Quente, que custa R$12, a quantidade comprada foi "+quantidadeProduto);
              valorTotal= 12 * quantidadeProduto;
        System.out.println("O total da sua compra foi "+valorTotal+" reais");
               break;
         case 4:
            System.out.println("Voce escolheu Refrigerante, que custa R$6, a quantidade comprada foi "+quantidadeProduto); 
        valorTotal= 6 * quantidadeProduto;
          System.out.println("O total da sua compra foi "+valorTotal+" reais"); 
            break;
         case 5:
             System.out.println("Voce escolheu Suco, que custa R$8, a quantidade comprada foi "+quantidadeProduto); 
            valorTotal= 8 * quantidadeProduto; 
            System.out.println("O total da sua compra foi "+valorTotal+" reais"); 
            break;
         default:
             System.out.println("Escolha invalida!");
            break;
        
                     }  
    }
}
