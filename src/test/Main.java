
package test;

import java.util.ArrayList;
import model.Mercancia;
import model.Producto;
import model.Servicio;
import model.Sistema;


public class Main {

    public static void main(String[] args) {
        
        Sistema sistema = new Sistema();
         
        
        try {
                // 1-3
                //sistema.agregarProducto("432597", "Manguera de desagote lavarropa", 650.0, 15.0, true);
                // 1-4
//                Producto producto = new Producto ("4325971", "Manguera de desagote lavarropa", 650.0, 15.0, true);
//                System.out.println(producto);
                // 2-2
//                double precioFinal = producto.calcularPrecioFinal();
//                System.out.println("El precio final del producto es: " + precioFinal);
                // 3-1
                sistema.agregarProducto("3892871", "Aceite para maquinas", 430.0, 10.0, true);
                sistema.agregarProducto("9381925", "Tambor lavarropa", 7500.0, 00.0, false);
//                ArrayList<Mercancia> enOferta = sistema.traerMercancia(true);
//                System.out.println(enOferta);
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
         try {
                // 1-1
                //sistema.agregarServicio("897323", "Mantenimiento máquina de cortar pasto", 2500.0, 15.0, true);
                //1-2
//                Servicio servicio = new Servicio ("8973231", "Mantenimiento máquina de cortar pasto", 2500.0, 15.0, true);
//                System.out.println (servicio);
                // 2-1
//                double precioFinal = servicio.calcularPrecioFinal();
//                System.out.println("El precio final del servicio es: " + precioFinal);
                // 3-1
                sistema.agregarServicio("3892815", "Mantenimiento de cortadora de césped", 2520.0, 15.0, true);
                sistema.agregarServicio("3481759", "Mantenimiento estufa", 1250.0, 00.0, false);
//                 ArrayList<Mercancia> enOferta = sistema.traerMercancia(true);
//                System.out.println(enOferta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         
         ArrayList<Mercancia> enOferta = sistema.traerMercancia(true);
        System.out.println(enOferta);

    }    
 
}
