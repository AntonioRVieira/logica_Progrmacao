/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacoderepeticao;

/**
 *
 * @author AntônioVieira
 */
import java.util.Scanner;
public class LacodeRepeticao {

    public static void main(String[] args) {
       
   //laço de repetição

String [] listaConvidados = new String[20];
//sacanner
Scanner entradaTexto = new Scanner (System.in);

//SOLICITAR QUE ADONA DA FESTA PREEMCHAR A LISTA

for(int cont=0;cont<=19;cont++){
    System.out.println("Digite o nome do convidado:"); 
   listaConvidados[cont]=entradaTexto.nextLine();
   

    
    
}   
  //IMPRIMIR A LISTA DE CONVIDADOS
  for(int cont=0;cont<=19;cont++){
      System.out.println("Convidado "+cont+" :"+listaConvidados[cont]);      
        
        
        
        
        
    }       
    }
}