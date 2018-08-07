import java.util.*;
/**
 * Este programa calcula el volumen de un tronco de cono. A partir de los datos introducidos por el usuario r1, r2 y h, donde:
 * - r1 es el radio de la base mayor. 
 * - r2 es el radio de la base menor. 
 * - h es la altura del tronco. 
 * 
 * Datos de salida: 
 * - Volumen del tronco de cono
 * 
 * 
 * @author Bafen Ricardo Barragán Sánchez
 * 
 */
public class TroncodeCono
{
    public static void main(String[] args)
    {
    double r1, r2, h, volumen;
    
    Scanner teclado = new Scanner(System.in);
    
    //Solicitud de datos
    System.out.println("Volumen Tronco de cono. \n\nPara digitar números decimales, utilice la coma (',')");
    
    System.out.print("\nIngrese el valor de la altura del tronco de cono: ");
    h = teclado.nextDouble();
    
    System.out.print("\nIngrese el valor del radio de la base mayor: ");
    r1 = teclado.nextDouble();
    
    System.out.print("\nIngrese el valor del radio de la base menor: ");
    r2 = teclado.nextDouble();
    
    // Calcular datos de salida
    
    if (r1 == r2){
        
        System.out.println("\nNo es posible calcular el resultado porque los radios son iguales.");
        
    } else{
       
        volumen = ((h*Math.PI)/3)*((r1*r1)+ (r2*r2) + (r1*r2));
        System.out.println("\nEl volumen del tronco de cono es: " + volumen);
    }        
    }      
}
