
package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { 
        Scanner entrada= new Scanner(System.in); // Lectura de entrada
        Random numeros= new Random(); // Generador de números aleatorios
        
        // Genero un número entre 1 y 1000
        int numeroSecreto= numeros.nextInt(1000)+1;
        int valorLeido;
        boolean adivino= false;
        final int MAX_INTENTOS= 10;
        
        System.out.print("Adivinador 2.0 – Dispones de 10 intentos para adivinar.\n"
                            +"Rango de valores: 1 a 1000 inclusive.\n\n"); 
        
        for (int i= 1; i<= MAX_INTENTOS; i++){
            System.out.print("Intento "+i+ ": ");
            valorLeido= entrada.nextInt();
            entrada.nextLine();
            
            if(valorLeido<numeroSecreto && i < MAX_INTENTOS){
                System.out.println("El número a adivinar es Mayor");
            } else 
                    if(valorLeido>numeroSecreto && i < MAX_INTENTOS){
                        System.out.println("El número a adivinar es Menor");
            }else 
                    if(valorLeido==numeroSecreto){
                        System.out.print("¡¡¡GANASTE!!!");
                adivino= true;
                break;
            }
        }
        
        if (!adivino){
            System.out.print("¡¡¡PERDISTE!!! El número era "+numeroSecreto);
        }
        
    }
}
