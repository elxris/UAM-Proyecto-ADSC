/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.mx.ayd.proyecto.modelo;
/**
 *
 * @author GABRIELA
 */
public class Venta {
    private String nombre;
    private String fecha;
    private int cantidad;
    private double total;
    private  double precio;
    
    //inicia el contructor de la clase venta el cual inicializa los atributos
    
    public Venta(String nombre,String fecha,int cantidad,double precio,double total){
       this.nombre=nombre;
       this.fecha=fecha;
       this.cantidad=cantidad;
       this.precio=precio;
       this.total=total;
    }//finaliza el constructor de la clase venta

    
    //metodos getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getfecha() {
        return fecha;
    }

    public void setMarca(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCaducidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double gettotal(){
        return total;
    }
    public void settotal(double total){
        this.total=total;
    }
    
    //incian los metodos que retornar los valores de los atributos correspondientes
    
    public String dameNombre(){
        return this.nombre;
    }//termina el metodo dameNombre
    
    public String dameFecha(){
        return this.fecha;
                }//finaliza el metodo damefecha
     public int dameCantidad(){
         return this.cantidad;
     }//termina el metodo dameCantidad
    
     public double damePrecio(){
         return this.precio;
     }//termina el metodo de damePrecio
     
     public double dametotal(){
         return this.total;
     }
    
}//termina la clase venta
