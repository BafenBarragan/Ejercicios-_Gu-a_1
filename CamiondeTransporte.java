import java.util.Scanner;
/**
 * Un camión va a llevar una carga de Bogotá a Sasaima. Puede 
 * llevar cierta cantidad de kilos en un viaje y consume cierta 
 * cantidad de gasolina por kilómetro. Un viaje se compone de ida y regreso.
 * 
 * Datos de entrada: 
 * - Kilos que se deben transportar (nkilos).
 * - Kilos permitidos por viaje (kilosp). 
 * - Gasolina consumida por km (gasolinac).   
 * 
 * Datos conocidos:
 * - Distancia del viaje (distancia).
 * 
 * Datos de salida: 
 * - Cantidad de viajes (nviajes).
 * - Cantidad de galones necesarios (ngalones).
 * 
 * @author Bafen Ricardo Barragán Sánchez 
 * 
 */
public class CamiondeTransporte
{
    public static void main(String[] args)
    {
        double kilosp, gasolinac, distancia, nkilos, ngalones;
        int nviajes;
        
        Scanner teclado = new Scanner(System.in);
        
        //Establecer datos conocidos
        distancia = 80.2 * 2;
        
        //Solicitar datos de entrada
        System.out.println("Viaje a Sasaima. \nPara digitar números decimales, utilice la coma (',')");
        
        System.out.print("\nIngrese el número de kilos permitidos por viaje: ");
        kilosp = teclado.nextDouble();
        
        System.out.print("\nIngrese el número de galones que su vehículo consume por kilómetro: ");
        gasolinac = teclado.nextDouble();
        
        System.out.print("\nAhora ingrese la cantidad de kilos que quiere transportar: ");
        nkilos = teclado.nextDouble();
        
        //Comunicar dato conocido
        System.out.println("\nEl viaje a Sasaima es de " + (distancia) + " kilómetros. Un viaje consta de ida y regreso.");
        
        //Calcular datos de salida        
         double viaje = nkilos/ kilosp; 
         nviajes = (int) viaje;
         
         ngalones = (distancia * gasolinac)*nviajes; 
         
         //Mostrar datos de salida
         System.out.println("\nPara transportar " + nkilos + " kilos usted debe realizar: " + nviajes + " viaje(s). \nEsto requiere de: " + 
         ngalones + " galones de gasolina.");   
        
    }
}
