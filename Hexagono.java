import java.util.*;
/**
 * Este programa calcula el área de un hexágono. 
 * 
 * Datos de entrada: 
 * - Lado del hexágono (lado)
 * - Apotema del hexágono (apotema)
 * 
 * Datos de salida: 
 * - Área del hexágono (área)
 * 
 * @author (Bafen Ricardo Barragán Sánchez.
 * 
 */
public class Hexagono
{
    public static void main(String[] args){
        double lado, apotema, area;
        
        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Área del hexágono."); 
        
        System.out.print("\nIngrese el valor del lado: ");
        lado = teclado.nextDouble();
        
        System.out.print("\nIngrese el valor del apotema: ");
        apotema = teclado.nextDouble();
        
        area = (6*lado*apotema)/2; 
        
        System.out.print("\n\nEl área del hexágono es: " +area);
    }
}
