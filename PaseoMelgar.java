import java.util.*;
/**
 * El programa calcula costos y cantidades necesarias para un viaje estudiantil a Melgar 
 * 
 * Variables de entrada: 
 * 
 * - Estudiantes gordos, flacos y total. (gordos, flacos, e_total)
 * - Número de sillas en los buses. (sillas)
 * - Precio de la comida. (p_comida)
 * - Precio del alquiler de una habitación. (p_habitacion)
 * - Número de personas en cada habitación. (pesonas)
 * - Precio del alquier del bus. (p_bus)
 * - Número de días que dura el paseo. (dias)
 * 
 * Variables de salida: 
 * 
 * - Número de buses necesarios. (buses_t)
 * - Costo del alquiler de los buses. (costot_bus)
 * - Costo de la comida. (costot_comida)
 * - Número de habitaciones necesarias. (hab_total)
 * - Valor diario de las habitaciones. (pd_habitacion)
 * - Valor total de las habitaciones. (pt_habitacion)
 * 
 * @author Bafen Ricardo Barragán Sánchez. 
 * @version (a version number or a date)
 */
public class PaseoMelgar
{
    public static void main (String[] args)
    {
        int gordos, flacos, e_total, sillas, p_comida, p_habitacion, personas, p_bus, dias, buses_t, costot_bus, costot_comida, hab_total,
        pd_habitacion, pt_habitacion, tot_sillas, tot_comidas;
        
        Scanner teclado = new Scanner(System.in);
        
        // Solicitar datos de entrada
        
        System.out.println("Cotización paseo a melgar.");
        
        System.out. print("\nIngrese el número de estudiantes gordos: ");
        gordos = teclado.nextInt();
        
        System.out. print("\nIngrese el número de estudiantes flacos: ");
        flacos = teclado.nextInt();
        
        e_total = gordos + flacos;
        System.out. println("\nEn total son: " + e_total + " estudiantes.");
        
        System.out. print("\nIngrese el número de sillas por bus: ");
        sillas = teclado.nextInt();
        
        System.out. print("\nIngrese el precio de un plato de comida: ");
        p_comida = teclado.nextInt();
        
        System.out. print("\nIngrese el valor de una habitación de hotel: ");
        p_habitacion = teclado.nextInt();
        
        System.out. print("\nIngrese el número de personas por habitación: ");
        personas = teclado.nextInt();
        
        System.out. print("\nIngrese el precio de alquiler de un bus: ");
        p_bus = teclado.nextInt();
        
        System.out. println("\nIngrese el número de días de duración del paseo: ");
        dias = teclado.nextInt();
        
        //Calcular datos de salida
               
        tot_sillas = (gordos * 2) + flacos; 
        
        buses_t = tot_sillas/sillas;
        
        costot_bus = (p_bus * 2)*buses_t;
        
        tot_comidas = (3*flacos) + (5*gordos);
        
        costot_comida = p_comida * tot_comidas;
        
        hab_total = e_total / personas;
        
        pd_habitacion = hab_total * p_habitacion;
        
        pt_habitacion = pd_habitacion * dias;       
        
        
        System.out.println("\nEl número total de buses necesarios para todos los estudiantes es: " +buses_t);
        
        System.out.println("\nEl costo total del alquiler de los buses (ida y vuelta) es: $" +costot_bus);
        
        System.out.println("\nEl costo total de la comida es: $" +costot_comida);
        
        System.out.println("\nEl número de habitaciones requeridas es: " +hab_total);
        
        System.out.println("\nEl costo diario del alquiler de las habitaciones es: $" +pd_habitacion);
        
        System.out.println("\nEl costo total del alquiler de las habitaciones es: $" +pt_habitacion);
        
        
        
    }
    
    
}
