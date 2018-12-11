/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.mx.ayd.proyecto.negocio;

import uam.mx.ayd.proyecto.modelo.Modelo;
import uam.mx.ayd.proyecto.persistencia.DAOModelos;
import uam.mx.ayd.proyecto.presentacion.VentanaRevisionInventario;

/**
 *
 * @author elxris
 */
public class ControlRevisionInventario {
    
    DAOModelos dao;
    Modelo[] modelos;
    int index;
    double perdida;

    public ControlRevisionInventario(DAOModelos dao) {
        this.dao = dao;
        this.modelos = dao.dameModelos();
        this.index = -1;
        despliegaVentanaRevisionInventario();
    }
    
    public void despliegaVentanaRevisionInventario() {
        VentanaRevisionInventario ventana = new VentanaRevisionInventario(this);
        ventana.setVisible(true);
    }
    
    public Modelo siguiente() {
        return modelos[++index];
    }
    
    public boolean haySiguiente() {
        if (modelos.length < index + 1) {
            return true;
        }
        return false;
    }
    
    public Modelo modeloActual () {
        return modelos[index];
    }
    
    public void verificaProductoActual(int piezas) {
        Modelo modelo = modeloActual();
        int piezasAnterior = modelo.getNumeropzs();
        double perdidaProducto = (double)(piezas - piezasAnterior) * modelo.getPrecio();
        calculaPerdida(perdidaProducto);
        modelo.setNumeropzs(piezas);
    }
    
    private void calculaPerdida(double perdida) {
        if (perdida > 0) {
            this.perdida += perdida;
        }
    }
    
    public double damePerdida() {
        return this.perdida;
    }
    
    public void confirmaReporte() {
        for (Modelo modelo : modelos) {
            dao.editaModelo(modelo.getId(), modelo.getDescripcion(), modelo.getPrecio(), modelo.getColor(), modelo.getTalla(), modelo.getNumeropzs(), modelo.getReglaventa(), modelo.getId());
        }
        // TODO: Hacer Venta
    }
    
}
