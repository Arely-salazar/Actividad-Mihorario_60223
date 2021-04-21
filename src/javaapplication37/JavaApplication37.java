/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;
import java.util.Scanner;
/**
 *
 * @author Jairo
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primera Actividad
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introducir una hora de 1 a 24 horas para saber que realizará: ") ;
        int hora = entrada.nextInt();
        
          if (hora ==8 ){
           System.out.println( "Despertar a las " + hora + " de la mañana");}
          else if (hora == 9 && hora < 11){
             System.out.println( "Clase de física de  " + hora + " a 11 de la mañana");}
            if (hora==10){
                System.out.println("Clase de Física de 9 a 11 de la mañana");}
          else if (hora ==11 && hora <13){
             System.out.println("Clase de Inglés de " + hora + " a 13 de la tarde");}
              if (hora==12){
                System.out.println("Clase de Inglés de 11 a 13 de la tarde");}
          else  if (hora ==13 && hora < 15){
             System.out.println("Clase de Organización Computacional de " + hora + " a 15 de la tarde");}
              if (hora==14){
           System.out.println("Clase de Organización Computacional de 13 a 15 de la tarde");}
          else  if (hora ==15 ){
             System.out.println("Comer a las " + hora + " de la tarde");}
          else  if (hora ==16 ){
              System.out.println("Bañarse a las " + hora + " de la tarde");}
          else  if (hora == 17){
               System.out.println("Dormir a las " + hora + " de la tarde");}
          else  if (hora ==18 ){
             System.out.println("Hora libre ");}
          else  if (hora == 19 && hora <= 21){
             System.out.println("Clase de Lenguaje de programación de " + hora + " a 21 de la noche");}
           if (hora==20){
           System.out.println("Clase de Lenguaje de progrmación de 19 a 21 de la noche");}
          else if  (hora==21 && hora <= 23){
             System.out.println("Hora libre de "+ hora + " a 22 de la noche"); } 
             if (hora== 22){
           System.out.println("Hora libre 21  a 23 de la noche");}
          else if  (hora==23){
           System.out.println("Dormir"); } 
    }
    
}
