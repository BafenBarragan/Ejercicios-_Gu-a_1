    import java.util.*;
/**
 * Este programa cálcula el área y el volumen de un tronco de pirámide a
 * partir de los datos introducidos por el usuario a, b, h y ap, donde:
 * - a: Lado de la base mayor.
 * - b: Lado de la base menor.
 * - h: Altura del tronco de pirámide. 
 * - ap: Apotema. 
 * 
 * Datos de Salida: Área del tronco de pirámide y volumen del tronco de
 * pirámide. 
 * 
 * @author Bafen Ricardo Barragán Sánchez
 */
public class TroncodePiramide
{
    public static void main(String[] args)
    {
        double a, b, h, ap, area, volumen, s1, s2, p1, p2;
        
        Scanner teclado = new Scanner(System.in);
        
        //Solicitud de datos
        System.out.println("Área y volumen: Tronco de pirámide. \nPara digitar números decimales, utilice la coma (',')");
        
        System.out.print("\nEntre el valor del lado de la base mayor: ");
        a = teclado.nextDouble();
        
        System.out.print("\nEntre el valor del lado de la base menor: ");
        b = teclado.nextDouble();
        
        System.out.print("\nEntre el valor de la altura: ");
        h = teclado.nextDouble();
        
        System.out.print("\nEntre el valor de la apotema: ");
        ap = teclado.nextDouble();
        
        //Calcular datos de salida
        s1 = a*a; s2 = b*b; p1 = 4*a; p2 = 4*b;
        area = s1 +s2 +(((p1 + p2) / 2)*ap);
        volumen = (h/3) * (s1 + s2 + (Math.sqrt(s1*s2)));
        
        //Enviar Datos de salida
        System.out.println("\n-El área es: " + area + "\n-El volumen es: " + volumen);
      
             
    }    
}
