/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package clases.GUI;
import clases.V1.*;
import clases.V1.Cliente;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class PanelBusqueda extends javax.swing.JPanel {
    
    private DefaultTableModel tblModel;
    private String[] header = {"Libro","Autor","Cantidad","Editorial","Categoria"};
    LibrosBiblioteca almacen = new LibrosBiblioteca();
    ArrayList<Libro> listaSalida;
    
    
    
    public PanelBusqueda() {
        initComponents();
        initTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        cbFiltro = new javax.swing.JComboBox<>();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JPanel();
        btnSolicitar = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JPanel();
        labelprueba = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JPanel();
        precargadedatos = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 255));
        setMinimumSize(new java.awt.Dimension(700, 420));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(tblInventario);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 390));

        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre de libro", "Autor", "Editorial", "Categoria", "Mostrar todos" }));
        add(cbFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, -1, -1));

        txtBusqueda.setText("jTextField1");
        add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 190, -1));

        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, 40));

        btnSolicitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSolicitarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSolicitarLayout = new javax.swing.GroupLayout(btnSolicitar);
        btnSolicitar.setLayout(btnSolicitarLayout);
        btnSolicitarLayout.setHorizontalGroup(
            btnSolicitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        btnSolicitarLayout.setVerticalGroup(
            btnSolicitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(btnSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, 40));

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, -1, 40));

        labelprueba.setText("jLabel1");
        add(labelprueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnLimpiarLayout = new javax.swing.GroupLayout(btnLimpiar);
        btnLimpiar.setLayout(btnLimpiarLayout);
        btnLimpiarLayout.setHorizontalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        btnLimpiarLayout.setVerticalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, -1, 40));

        precargadedatos.setText("precargadedatos");
        precargadedatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precargadedatosActionPerformed(evt);
            }
        });
        add(precargadedatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
        
        if(cbFiltro.getSelectedIndex() == 0){ //buscar por nombre
            labelprueba.setText("se eligio el 0");
            limpiarTabla();
            
            String nombre = txtBusqueda.getText();
            txtBusqueda.setText("");
            
            Libro l = almacen.mostrarPorNombre(nombre);
            if(l == null){
                labelprueba.setText("No se encuentra el libro");
            }
            else{
                tblModel.addRow(l.toArray());
            }

        }
        if(cbFiltro.getSelectedIndex() == 1){ // buscar por autor
            labelprueba.setText("se eligio el 1");
            limpiarTabla();            
           
            String nombre = txtBusqueda.getText();
            txtBusqueda.setText("");
            
            listaSalida = almacen.mostrarPorAutor(nombre);
            
            
            for(int i = 0; i < listaSalida.size(); i++){
                Libro l = listaSalida.get(i);
                tblModel.addRow(l.toArray());
            }
            listaSalida.clear();
        }
        
        if(cbFiltro.getSelectedIndex() == 2){
            labelprueba.setText("se eligio el 2");            
            limpiarTabla();
            
            String nombre = txtBusqueda.getText();
            txtBusqueda.setText("");
            
            listaSalida = almacen.mostrarPorEditorial(nombre);
            
            for(int i = 0; i < listaSalida.size(); i++){
                Libro l = listaSalida.get(i);
                tblModel.addRow(l.toArray());
            }
            listaSalida.clear();
        }
        
        if(cbFiltro.getSelectedIndex() == 3){
            labelprueba.setText("se eligio el 3");            
            limpiarTabla();
            
            String nombre = txtBusqueda.getText();
            txtBusqueda.setText("");
            
            listaSalida = almacen.mostrarPorCategoria(nombre);
            
            for(int i = 0; i < listaSalida.size(); i++){
                Libro l = listaSalida.get(i);
                tblModel.addRow(l.toArray());
            } 
            listaSalida.clear();
        }
        
        if(cbFiltro.getSelectedIndex() == 4){
            labelprueba.setText("se eligio el 4"); 
            limpiarTabla();
            
            listaSalida = almacen.mostrarTodos();

            
            for(int i = 0; i < listaSalida.size(); i++){
                Libro l = listaSalida.get(i);
                tblModel.addRow(l.toArray());
            }
        }    
            
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        
        limpiarTabla();
        
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void precargadedatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precargadedatosActionPerformed
        
        
        
            almacen.create("Libro1", "Gauss", 50, "McGrawHill", "Matematicas");
            almacen.create("Libro4", "Martinez", 70, "Norma", "Literatura");
            almacen.create("Libro3", "Dietel", 57, "Norma", "Historia");
            almacen.create("Libro2", "Gauss", 5, "McGrawHill", "Matematicas");
            almacen.create("Libro5", "Bonn", 1, "McGrawHill", "Ingenieria");
            almacen.create("Libro6", "Arrieta", 6, "McGrawHill", "Estadistica");
            almacen.create("Libro7", "Parrado", 3, "Pearson", "Literatura");
            almacen.create("Libro8", "Demba Cisse", 4, "McGrawHill", "Literatura");
            almacen.create("Libro9", "Dietel", 15, "Pearson", "Politica");
            almacen.create("Libro10", "Gauss", 13, "Norma", "Novela");
            almacen.create("Libro11", "Gauss", 6, "Pearson", "Estadistica");
    }//GEN-LAST:event_precargadedatosActionPerformed

    private void btnSolicitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSolicitarMouseClicked
        if (tblInventario.getSelectedRowCount() != 1){
            return;
        }
        
        int fila = tblInventario.getSelectedRow();
        
        String nombre = (String) tblModel.getValueAt(fila,0);
        String autor = (String) tblModel.getValueAt(fila,1);
        int cantidad = (int) tblModel.getValueAt(fila,2);
        String editorial =  (String) tblModel.getValueAt(fila,3);
        String categoria = (String) tblModel.getValueAt(fila,4);
        
        
        
        if(cantidad == 0){
            
        }
        else{
            Libro libroPrestado = almacen.mostrarPorNombre(nombre);
            cliente.getListaLibros().add(libroPrestado);
            
        }        
        
                
    }//GEN-LAST:event_btnSolicitarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JPanel btnSolicitar;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelprueba;
    private javax.swing.JButton precargadedatos;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        tblModel = new DefaultTableModel(header,0){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
            }
        };
        tblInventario.setModel(tblModel);
        
    }
    
    public void limpiarTabla(){
        for(int i = 0; i < tblInventario.getRowCount(); i++ ){
            tblModel.removeRow(i);
            i --;
        }
    
    }
}
