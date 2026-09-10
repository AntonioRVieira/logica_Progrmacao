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
public class Desafio {
    public static void main(String[] args) {
   
        
    // Variaveis
   String nome, tipoIngresso;
   int idade;
   boolean autorizacao = false;
   
   //Scanner
   Scanner entradaTexto = new Scanner (System.in);
   Scanner entradaNumero = new Scanner (System.in);
   Scanner entradaLogica =  new Scanner (System.in);    
        
   
   //Solicitações
        System.out.println("Ola, informe seu nome");    
        nome= entradaTexto.nextLine();
        
        System.out.println("Ola; informe a sua idade");
        idade= entradaNumero.nextInt();
        
        System.out.println("Qual tipo de ingresso");
        tipoIngresso= entradaTexto.nextLine();
       
        System.out.println("Voce tem autorizacao?"+ "true para sim ou false para nao");
       autorizacao= entradaLogica.nextBoolean();
       
        System.out.println("Ola "+nome+", voce possui "+idade+" anos e");
       
       
       
       
       
       
       
       //VALIDACAO COM IF ELSE
       
     if (idade >=18 && tipoIngresso.equals("Vip")){
         System.out.println("Acesso Vip Liberado!");
     }else if(idade>=18 && tipoIngresso.equals("Comum")){
         System.out.println("Acesso Comum Liberado");
     }else if((idade==16 || idade==17 ) && autorizacao==true){
         System.out.println("Acesso Liberado com Autorizacao!");
     }else if(tipoIngresso.equals("Profeesor") || tipoIngresso.equals("Funcionario")){
         System.out.println("Acesso Especial Liberado!");
     }else{
         System.out.println("Acesso Negado!");
     }
       
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
      
      } 
        
        
        
    }
    

