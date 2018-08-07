import java.util.*;
/**
 * Este programa calcula la cantidad de pasajeros que viajan en avión, en cada una de las diferentes clases de tiquetes. También calcula 
 * los ingresos totales para la aerolínea por clase. 
 * 
 * Datos de entrada: 
 * 
 * - Clase del tiquete. (clase)
 * - Número de pasajeros (pasajeros)
 * 
 * Datos de salida: 
 * 
 * - Ingresos. (ingresos)
 * 
 * @author Bafen Ricardo Barragán Sánchez 
 */
public class Avion
{
    public static void main(String[] args)
    {
        int pasajeros, ingresos, clase;
       
         
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Registro de pasajeros por clase aérea.");
        
        System.out.print("Seleccione la clase entre 1, 2 o 3.: ");
        clase = teclado.nextInt();
        
        switch (clase){
            case 1:
                System.out.print("\nEscriba la cantidad de pasajeros para la clase 1: ");
                pasajeros = teclado.nextInt();
                
                ingresos = 500000 * pasajeros; 
                
                System.out.println("\nEl total de ingresos para este viaje en clase 1 es: $" + ingresos);
                break;
                
            case 2:
                System.out.print("\nEscriba la cantidad de pasajeros para la clase 2: ");
                pasajeros = teclado.nextInt();
                
                ingresos = 200000 * pasajeros; 
                
                System.out.println("\nEl total de ingresos para este viaje en clase 1 es: $" + ingresos);
                
                break;
                
            case 3:
                System.out.print("\nEscriba la cantidad de pasajeros para la clase 3: ");
                pasajeros = teclado.nextInt();
                
                ingresos = 125000 * pasajeros; 
                
                System.out.println("\nEl total de ingresos para este viaje en clase 1 es: $" + ingresos);
                
                break;
                
            default:
                System.out.println("\nLa clase que ha seleccionado no está disponible, no hay información para mostrar.");
                break;                      
            }
        }
        
    }

