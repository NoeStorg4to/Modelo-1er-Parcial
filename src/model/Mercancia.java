
package model;

public abstract class Mercancia {
    protected String codMercancia; // validar longitud de 7 caracteres con excepcion

    protected Mercancia(String codMercancia) throws Exception {
        
        if (codMercancia == null || codMercancia.length() != 7){
                 throw new Exception ("El codigo de mercancia debe ser de 7 caracteres");
        }
        this.codMercancia = codMercancia;
        }

    public String getCodMercancia() {
        return codMercancia;
    }

    public void setCodMercancia(String codMercancia) {
        this.codMercancia = codMercancia;
    }
    
    public abstract double calcularPrecioFinal();
    
    
}
