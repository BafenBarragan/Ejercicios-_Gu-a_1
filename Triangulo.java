import java.util.*; 
/**
 * Este programa calcula el semiperímetro, el área y el circumradius de un triángulo.
 * 
 * Datos de entrada: 
 * - Lado a (lado1) 
 * - Lado b (lado2)
 * - Lado c (lado3)
 * 
 * Datos de salida: 
 * - Semiperímetro (sperimetro)
 * - Area (area)
 * - Circumradius (cradius)
 * 
 * @author Bafen Ricardo Barragán Sánchez.
 */
public class Triangulo
{
    public static void main (String[] args){
        
        double lado1, lado2, lado3, sperimetro, area, cradius; 
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Semiperímetro, área y circumradius de un triángulo.");
        
        System.out.print("\nIngrese el valor del lado a: ");
        lado1 = teclado.nextDouble();
        
        System.out.print("\nIngrese el valor del lado b: ");
        lado2 = teclado.nextDouble();
        
        System.out.print("\nIngrese el valor del lado c: ");
        lado3 = teclado.nextDouble();
        
        sperimetro = (lado1 + lado2 + lado3)/2;
        area = Math.sqrt(sperimetro*(sperimetro-lado1)*(sperimetro-lado2)*(sperimetro-lado3));
        cradius = (lado1 * lado2 * lado3) / ((4 * Math.PI)*(Math.sqrt(sperimetro*(sperimetro-lado1)*(sperimetro-lado2)*(sperimetro-lado3))));
        
        System.out.println("\nEl semiperímetro del triángulo es: " +sperimetro+ ". \nEl area del triángulo es: " +area+ ". \nEl circumradius del triángulo es: " 
        + cradius+ ".");       
    }
}
