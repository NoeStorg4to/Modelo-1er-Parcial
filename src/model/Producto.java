package model;


public class Producto extends Mercancia {

        private String nombreProducto;
        private double precioProducto;
        private double porcentajeDescuento;
        private boolean esDescuentoEn2daUnidad;

        public Producto(String codMercancia, String nombreProducto, double precioProducto, double porcentajeDescuento, boolean esDescuentoEn2daUnidad) throws Exception {
                 super(codMercancia);
                 this.nombreProducto = nombreProducto;
                 this.precioProducto = precioProducto;
                 this.porcentajeDescuento = porcentajeDescuento;
                 this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
        }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + ", porcentajeDescuento=" + porcentajeDescuento + ", esDescuentoEn2daUnidad=" + esDescuentoEn2daUnidad + '}';
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public boolean isEsDescuentoEn2daUnidad() {
        return esDescuentoEn2daUnidad;
    }

    public void setEsDescuentoEn2daUnidad(boolean esDescuentoEn2daUnidad) {
        this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
    }

    public String getCodMercancia() {
        return codMercancia;
    }

    public void setCodMercancia(String codMercancia) {
        this.codMercancia = codMercancia;
    }
    
        @Override
        public double calcularPrecioFinal() {
            
                 double precioProducto1;
                 double precioProducto2 = 0;
                 double descuento1 ;
                 double descuento2 ;
                 
                 descuento1 = (precioProducto * this.porcentajeDescuento) / 100;
                 precioProducto1 = precioProducto - descuento1;

                 if (esDescuentoEn2daUnidad) {
                         descuento2 = (precioProducto * (porcentajeDescuento / 2) )/ 100;
                         precioProducto2 = precioProducto - descuento2;
                 }
                 return precioProducto1 + precioProducto2;
        }
}