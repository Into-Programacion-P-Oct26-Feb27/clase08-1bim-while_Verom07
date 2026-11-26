/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejemplo063 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        String pais;
        String capital;
        String cadena_final = "";
        
        while(bandera==true){
            
            System.out.println("Ingrese un país"); 
            pais = entrada.nextLine();
            
            System.out.println("Ingrese la capital del país"); 
            capital = entrada.nextLine();
            
            cadena_final = String.format("%sPaís: %s\tCapital: %s\n", 
                    cadena_final, pais, capital);
             
            String salir;
            System.out.println("Desea salir del ciclo, ingrese si.");
            salir = entrada.nextLine(); 
            if(salir.equals("si")){ 
                bandera = false;
                System.out.printf("%s\n",cadena_final);
            }
        }
    }
}
/*
En el ejercicio se inicializa con true a la variable bandera, se va al ciclo,
se comprueba si cumple con la condición de true == true como es true ingresa al
ciclo y presenta en pantalla la frase "Estoy en el ciclo", luego pregunta si desea
salir y que de el valor de -100, si se ingresa ese valor se sale del ciclo, caso 
contrario sigue en el ciclo hasta que salir cumpla la condición de ser == -100
*/