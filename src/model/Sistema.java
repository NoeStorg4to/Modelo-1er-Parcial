
package model;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    
        private List<Mercancia> lstMercancia;

        public Sistema(){
        this.lstMercancia  = new ArrayList<>();
        }

        public Mercancia traerMercancia(String codMercancia){
            for (Mercancia mercancia : lstMercancia){
                if (mercancia.getCodMercancia().equals(codMercancia))
                    return mercancia;
            }
            return null; // no se encontro la mercancia
        }

        public ArrayList<Mercancia> traerMercancia (boolean enOferta){

            ArrayList<Mercancia> seleccionados = new ArrayList<>();

            for (Mercancia mercancia : lstMercancia){
                    if (mercancia instanceof Producto){ //verifica el tipo de mercancia (prodcuto o servicio)
                             Producto producto = (Producto) mercancia;
                             if (producto.isEsDescuentoEn2daUnidad() == enOferta){ // si el producto esta en descuento lo agrega a la lista
                                 seleccionados.add(producto);
                                 System.out.println("Producto en oferta: " + producto.getNombreProducto() + ", Código: " + producto.getCodMercancia());
                             }                             
                    } else if (mercancia instanceof Servicio){
                             Servicio servicio = (Servicio) mercancia;
                             if (servicio.isEnPromocion() == enOferta){
                                 seleccionados.add(servicio);
                                 System.out.println("Servicio en oferta: " + servicio.getNombreServicio() + ", Código: " + servicio.getCodMercancia());
                             }
                    }

            }
            return seleccionados;
            }
        
        public boolean agregarProducto (String codMercancia, String nombreProducto, double precioProducto, double porcentajeDescuento, boolean esDescuentoEn2daUnidad)throws Exception{
                if (traerMercancia(codMercancia) != null){
                         throw new Exception("El producto con el código " + codMercancia + " ya existe.");      
                }
                Producto nuevoProducto = new Producto(codMercancia, nombreProducto, precioProducto, porcentajeDescuento, esDescuentoEn2daUnidad);
                lstMercancia.add(nuevoProducto);
                
                return true;
        }
        
        public boolean agregarServicio (String codMercancia, String nombreServicio, double presupuesto, double porcentajeDescuento, boolean enPromocion) throws Exception{
                if (traerMercancia(codMercancia) != null){
                         throw new Exception("El producto con el código " + codMercancia + " ya existe.");      
                }
                Servicio nuevoServicio = new Servicio(codMercancia, nombreServicio, presupuesto, porcentajeDescuento, enPromocion);
                lstMercancia.add(nuevoServicio);
                
                return true;
        }
        
        
}
