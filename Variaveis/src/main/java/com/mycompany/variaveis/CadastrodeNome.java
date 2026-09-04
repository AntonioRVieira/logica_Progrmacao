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

public class CadastrodeNome {
  
    public static void main(String[] args) {
    //*codigo para cadatrade de nome
    // variavel
    String nome;
    //criar a entrada
    Scanner entradaTexto= new 
      Scanner(System.in);
    //solicitar que o usuário digite seu nome 
        System.out.println("Digite o seu nome:");
        nome=entradaTexto.nextLine();
       
        //imprimir a mensagem 
        System.out.println("Ola,"+nome+"! seja bem-vindo (a) ao Java.");
        
        
        
        
    }
}
