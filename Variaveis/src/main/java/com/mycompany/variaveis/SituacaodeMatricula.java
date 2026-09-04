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
public class SituacaodeMatricula {

    public static void main(String[] args) {
        
        
     boolean matricula;
     
     Scanner entradaLogica = new Scanner (System.in);   
        
        
        System.out.println("Voce esta matriculado"); 
        System.out.println("digite True para sim , ou False para nao");
        matricula= entradaLogica.nextBoolean();
        
        System.out.println("Aluno matriculado: "+matricula);
        
        
        
        
        
        
        
        
        
    }
    
}
