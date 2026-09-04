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
public class CalculodeMedia {
 
    public static void main(String[] args) {
        
        //*variiaveis para media
        double valor1;
        double valor2;
       
        // chamar o Scanner
        Scanner entradaNumero = new Scanner (System.in);
        
        System.out.println("Digite o primeiro valor:");
        valor1= entradaNumero.nextDouble();
        
        System.out.println("Digite o segundo valor:");
        valor2= entradaNumero.nextDouble();
        
        double media = (valor1 + valor2) /2;
        
        
        System.out.println("A media e:"+media);
        
        
        
        
        
    }
    
    
    
    
    
    
}
