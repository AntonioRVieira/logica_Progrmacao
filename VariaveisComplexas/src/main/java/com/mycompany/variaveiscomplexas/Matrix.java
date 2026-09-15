/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveiscomplexas;

/**
 *
 * @author AntônioVieira
 */
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
     
 //variaveis
 int coluna, linha;
        
 Scanner entradaNumero= new Scanner (System.in);  
 
  String [][] alunos= new String[11][2];
  
  alunos[0][0]="Jordana";
  alunos[1][0]="Geovanna";
  alunos[2][0]="Kauwan";
  alunos[3][0]="Kalebe";
  alunos[4][0]="Arthur M.";
  alunos[5][0]="Antonio.";    
  alunos[7][0]="Enzo";    
  alunos[9][0]="Pedro";      
        
   alunos[0][1]="Rogerio";     
   alunos[1][1]="Israel";       
   alunos[2][1]="Arthur B.";       
   alunos[3][1]="Cleiceiane";       
   alunos[4][1]="Samara";  
   alunos[5][1]="Marya";      
   alunos[6][1]="Victor";       
   alunos[9][1]="Daniel";       
   alunos[10][1]="Raniely";      
  
        System.out.println("Digite um numero 0 e 10, para encolher a linha");
        linha= entradaNumero.nextInt();
        
        System.out.println("Digite um numero entre 0 e 10, para encolher a coluna");
        coluna= entradaNumero.nextInt();
        
        System.out.println("O Aluno e "+alunos[linha][coluna]);
        
        
        
        
        
    }
   
}
