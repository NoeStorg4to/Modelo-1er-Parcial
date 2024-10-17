
package model;


public class Servicio extends Mercancia {
    private String nombreServicio;
    private double presupuesto;
    private double porcentajeDescuento;
    private boolean enPromocion;

    public Servicio(String codMercancia, String nombreServicio, double presupuesto, double porcentajeDescuento, boolean enPromocion) throws Exception {
        super(codMercancia);
        this.nombreServicio = nombreServicio;
        this.presupuesto = presupuesto;
        this.porcentajeDescuento = porcentajeDescuento;
        this.enPromocion = enPromocion;
    }

    @Override
    public String toString() {
        return "Servicio{" + "nombreServicio=" + nombreServicio + ", presupuesto=" + presupuesto + ", porcentajeDescuento=" + porcentajeDescuento + ", enPromocion=" + enPromocion + '}';
    }
     
    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public boolean isEnPromocion() {
        return enPromocion;
    }

    public void setEnPromocion(boolean enPromocion) {
        this.enPromocion = enPromocion;
    }

    public String getCodMercancia() {
        return codMercancia;
    }

    public void setCodMercancia(String codMercancia) {
        this.codMercancia = codMercancia;
    } 

    @Override
    public double calcularPrecioFinal() {
                double descuento = 0;
        
        if(enPromocion){
                descuento  = (getPresupuesto() * getPorcentajeDescuento()) / 100;       
        }
        return getPresupuesto() - descuento;
    }
    
}
