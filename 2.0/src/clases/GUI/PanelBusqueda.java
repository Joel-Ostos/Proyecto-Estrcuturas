/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package clases.GUI;

import clases.V1.Libro;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Axum
 */
public class PanelBusqueda extends javax.swing.JPanel {
    
    private DefaultTableModel tblModel;
    private String[] header = {"Libro","Autor","Editorial","Categoria","Cantidad"};
    
    
    public PanelBusqueda() {
        initComponents();
        initTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusqueda = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBusquedaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBusqueda);

        btnAgregar.setText("agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnAgregar)
                        .addGap(31, 31, 31)
                        .addComponent(btnEditar)
                        .addGap(31, 31, 31)
                        .addComponent(btnEliminar)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        String nombre = "nlibro1";
        String autor = "baudilio";
        int cantidad = 5;
        String editorial = "xdxd";
        String categoria = "popo";
        
        Libro l = new Libro(nombre, autor, cantidad, editorial,  categoria);
        tblModel.addRow(l.toArray());
        
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        if (tblBusqueda.getSelectedRowCount() != 1){
            return;
        }
        String nombre = "nlibro2";
        String autor = "rene";
        int cantidad = 13;
        String editorial = "lapopo";
        String categoria = "porqueria";
        int fila = tblBusqueda.getSelectedRow();
        
        Libro l = new Libro(nombre, autor, cantidad, editorial,  categoria);
        tblBusqueda.setValueAt(l.getNombre(),fila,0);
        tblBusqueda.setValueAt(l.getAutor(),fila,1);
        tblBusqueda.setValueAt(l.getCantidad(),fila,2);
        tblBusqueda.setValueAt(l.getEditorial(),fila,3);
        tblBusqueda.setValueAt(l.getCategoria(),fila,4);   
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBusquedaMouseClicked
        if(evt.getClickCount() == 2){
            int fila = tblBusqueda.getSelectedRow();
            
            String nombre = (String) tblModel.getValueAt(fila,0);
            String autor = (String) tblModel.getValueAt(fila,1);
            int cantidad = (int) tblModel.getValueAt(fila,2);
            String editorial =  (String) tblModel.getValueAt(fila,3);
            String categoria = (String) tblModel.getValueAt(fila,4);
            
            //Libro l = new Libro(nombre, autor, cantidad, editorial,  categoria);
            //cambia las entradas del txt para modificar mas facil
        }
        
    }//GEN-LAST:event_tblBusquedaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(tblBusqueda.getSelectedRowCount() != 1){
            return;
        }
        
        int fila = tblBusqueda.getSelectedRow();
        tblModel.removeRow(fila);
        
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBusqueda;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        tblModel = new DefaultTableModel(header,0){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
            }
        };
        tblBusqueda.setModel(tblModel);
        
        
    }
}
