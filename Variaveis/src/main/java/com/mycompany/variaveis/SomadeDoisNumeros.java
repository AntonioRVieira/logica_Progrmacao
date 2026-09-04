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
public class SomadeDoisNumeros {
    
    public static void main(String[] args) {
        
     int numero1;
     int numero2;
     
     Scanner entradaNumero= new Scanner (System.in);
     
        System.out.println("Digite seu primeiro numero");
        numero1= entradaNumero.nextInt();
        
        System.out.println("Digite seu segundo numero");
        numero2= entradaNumero.nextInt();
        
        int soma = numero1 + numero2 ;
        
        System.out.println("A sua soma e "+soma);
        
        
        
        
        
        
        
        
    }
    
}
