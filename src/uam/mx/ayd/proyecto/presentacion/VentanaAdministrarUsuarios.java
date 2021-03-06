/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.mx.ayd.proyecto.presentacion;

import uam.mx.ayd.proyecto.negocio.ControlEmpleados;

/**
 *
 * @author elxris
 */
public class VentanaAdministrarUsuarios extends javax.swing.JFrame {

    ControlEmpleados control;
    
    /**
     * Creates new form VentanaAdministrarUsuarios
     */
    public VentanaAdministrarUsuarios(ControlEmpleados control) {
        initComponents();
        this.control = control;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAltaUsuario = new javax.swing.JButton();
        jButtonBajaUsuario = new javax.swing.JButton();
        jButtonEditarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrar Usuarios");

        jButtonAltaUsuario.setText("Alta Usuario");
        jButtonAltaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaUsuarioActionPerformed(evt);
            }
        });

        jButtonBajaUsuario.setText("Baja Usuario");
        jButtonBajaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaUsuarioActionPerformed(evt);
            }
        });

        jButtonEditarUsuario.setText("Editar Usuario");
        jButtonEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBajaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAltaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jButtonAltaUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButtonBajaUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButtonEditarUsuario)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAltaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaUsuarioActionPerformed
        // TODO add your handling code here:
        control.despliegaVentanaAltaEmpleado();
    }//GEN-LAST:event_jButtonAltaUsuarioActionPerformed

    private void jButtonBajaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaUsuarioActionPerformed
        // TODO add your handling code here:
        control.despliegaVentanaBajaEmpleado();
    }//GEN-LAST:event_jButtonBajaUsuarioActionPerformed

    private void jButtonEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarUsuarioActionPerformed
        // TODO add your handling code here:
        control.despliegaVentanaEditaEmpleado();
    }//GEN-LAST:event_jButtonEditarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAltaUsuario;
    private javax.swing.JButton jButtonBajaUsuario;
    private javax.swing.JButton jButtonEditarUsuario;
    // End of variables declaration//GEN-END:variables
}
