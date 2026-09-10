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
public class ExemploComtexto {
    public static void main(String[] args) {
        
    //  DASAFIO - BARRADO NA FESTA
    
    String nome;
    
    Scanner entradaTexto= new Scanner (System.in);
    
        System.out.println("Ola, me diga seu nome para ver se esta na lista");
       nome = entradaTexto.nextLine();
       
       //para avaliar igualdade usamos a função equals
     if(nome.equals("Enzo")){ 
         System.out.println("Desculpe, seu nome nao esta na lista");  
     }else if(nome.equals("Antonio")){
         System.out.println("Saia ja daqui seu penetra!");
     }else if(nome.equals("Jordana")){
         System.out.println("Bem Vina Chefona!");
     }else if (!nome.equals("Enzo") && !nome.equals("Antonio") && !nome.equals("Jordana") && !nome.equals("Maria")){
         System.out.println("Sejam bem vindo");
     }
     
     
     
     
     
     
     
     
     
        
    }
  
}
