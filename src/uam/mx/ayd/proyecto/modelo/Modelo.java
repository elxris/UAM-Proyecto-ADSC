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
    private String reglaventa;
    private int tiempoInventario;
    
    
    public Modelo(int id, String descripcion, double precio, String color, String talla, int numeropzs, String reglaventa, int tiempo){
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.color = color;
        this.talla = talla;
        this.numeropzs = numeropzs;
        this.reglaventa = reglaventa;
        this.tiempoInventario = tiempo;
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

    public String getReglaventa() {
        return reglaventa;
    }

    public void setReglaventa(String reglaventa) {
        this.reglaventa = reglaventa;
    }
    
    public int getTiempoInventario(){
        return tiempoInventario;
    }
    
    public void setTiempoInventario(int tiempo){
        this.tiempoInventario = tiempo;
    }
}
