package uam.mx.ayd.proyecto.modelo;

/**
 *
 * @author Omar JRZ
 */
public class Modelo {
    private int id;
    private String descripcion;
    private double precio;
    private String color;
    private String talla;
    private int numeropzs;
    private boolean oferta;
    
    
    public Modelo(int id, String descripcion, double precio, String color, String talla, int numeropzs, boolean oferta){
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.color = color;
        this.talla = talla;
        this.numeropzs = numeropzs;
        this.oferta = oferta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    public int getNumeropzs(){
        return numeropzs;
    }
    
    public void setNumeropzs(int numeropzs){
        this.numeropzs = numeropzs;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    
}
