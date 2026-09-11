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
public class AprendemdoSwitchCase {
 
    public static void main(String[] args) {
        
   // Sistema de Agendamentos de Serviçoes Pet
   String nomePet, racaPet;
   int idadePet, opcaoServico;
   
     //Scanner
     Scanner entradaTexto = new Scanner(System.in);
     Scanner entradaNumero = new Scanner(System.in);
     
     //Solicitar os dados 
        System.out.println("Ola, para iniciarmos digite o nome pet");
        nomePet = entradaTexto.nextLine();
        System.out.println("Bem Vindo(a) "+nomePet+", qual a sua raca?");
        racaPet = entradaTexto.nextLine();
        System.out.println("Agora que sabemos sua raca, nos diga a sua idade");
        idadePet = entradaNumero.nextInt();
        System.out.println("Escolha um de nossos servicos");
        System.out.println("1-Tosa \n2-Banho\n3-Banho e Tosa\n4-Veterinario");
        opcaoServico = entradaNumero.nextInt();
        
    //Analisando o serviço com Swutch Case
     
   switch(opcaoServico) {   
       case 1:
           System.out.println(nomePet+" voce possui "+idadePet+" anos de idade, e sua raca e "+racaPet+ " e escolheu o servico Tosa");
             break; 
       case 2:
              System.out.println(nomePet+" voce possui "+idadePet+" anos de idade, e sua raca e "+racaPet+ " e escolheu o servico Banho"); 
          break;
       case 3:
           System.out.println(nomePet+" voce possui "+idadePet+" anos de idade, e sua raca e "+racaPet+ " e escolheu o servico Banho e Tosa");
          break;
       case 4:
           System.out.println(nomePet+" voce possui "+idadePet+" anos de idade, e sua raca e "+racaPet+ " e escolheu o servico Veterinario");
          break;
       default:
           System.out.println("A escolhida e invalida!");
        break;
        
   } // fim do switch case  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
  
    
}
