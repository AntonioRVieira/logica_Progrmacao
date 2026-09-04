/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author AntônioVieira
 */
import java.util.Scanner;
public class CadastroCompleto {

    public static void main(String[] args) {
        
      String nome; 
      int idade;
      double altura;
      
      Scanner entradaTexto= new Scanner(System.in);
     Scanner entradaNumero= new Scanner (System.in);
     
        System.out.println("Digite seu nome");
        nome= entradaTexto.nextLine();
        
        System.out.println("Digite sua idade");
        idade= entradaNumero.nextInt();
        
        System.out.println("Digite sua altura");
        altura= entradaNumero.nextDouble();
        
        System.out.println("Seu nome e "+nome);
        System.out.println("sua idade e "+idade+"anos e sua altura e "+altura+ "metros");
        
        
        
        
        
        
        
        
        
    }
}
