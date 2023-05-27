/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import clases.V1.Libro;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Axum
 */

public class panPrestamo extends javax.swing.JPanel {
    
    private DefaultTableModel tblModel;
    private String[] header = {"Libro","Autor","Cantidad","Editorial","Categoria"};

   
    public panPrestamo() {
        initComponents();
        initTable();
        

        

        
        
        
        
        
        
        
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDevolver = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblInfP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrestamo = new javax.swing.JTable();
        btnActualizar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 102, 153));

        btnDevolver.setPreferredSize(new java.awt.Dimension(150, 50));
        btnDevolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDevolverMouseClicked(evt);
            }
        });

        jLabel1.setText("Devolver");

        javax.swing.GroupLayout btnDevolverLayout = new javax.swing.GroupLayout(btnDevolver);
        btnDevolver.setLayout(btnDevolverLayout);
        btnDevolverLayout.setHorizontalGroup(
            btnDevolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDevolverLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        btnDevolverLayout.setVerticalGroup(
            btnDevolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDevolverLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        lblInfP.setText("Estado, informacion");

        jScrollPane1.setViewportView(tblPrestamo);

        btnActualizar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        jLabel2.setText("Actualizar Tabla");

        javax.swing.GroupLayout btnActualizarLayout = new javax.swing.GroupLayout(btnActualizar);
        btnActualizar.setLayout(btnActualizarLayout);
        btnActualizarLayout.setHorizontalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        btnActualizarLayout.setVerticalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnActualizarLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(lblInfP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224)
                .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblInfP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDevolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDevolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolverMouseClicked
        // TODO add your handling code here:
        if(tblPrestamo.getSelectedRowCount() != 1){
            return;
        }
        //añade la unidad al almacen
        int fila = tblPrestamo.getSelectedRow();        
        String nombreDevolucion = (String) tblModel.getValueAt(fila,0);              
        Exe.almacen.devolverUnidad(nombreDevolucion);
        
        
        limpiarTabla();
        //elimina de la lista del cliente de prestamos

        Libro l = Exe.almacen.mostrarPorNombre(nombreDevolucion);
            
        if(l == null){
            lblInfP.setText("No se encuentra el libro");
        }
        else{
            Exe.cliente.devolverLibro(l);
        }
        actualizar();

       
    }//GEN-LAST:event_btnDevolverMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        // TODO add your handling code here:
        
        limpiarTabla();
        actualizar();
        
        
    }//GEN-LAST:event_btnActualizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnActualizar;
    private javax.swing.JPanel btnDevolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfP;
    private javax.swing.JTable tblPrestamo;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        tblModel = new DefaultTableModel(header,0){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
            }
        };
        tblPrestamo.setModel(tblModel);
        
        
    }
    
    
    public void limpiarTabla(){
        for(int i = 0; i < tblPrestamo.getRowCount(); i++ ){
            tblModel.removeRow(i);
            i --;
        }
    
    }

    public void actualizar() {
        LinkedList<Libro> listaPrestamos =  Exe.cliente.getListaLibros();
        
        for(Libro libro : listaPrestamos){
            Object[] l = libro.toArray();
            l[2] = 1;
            tblModel.addRow(l);
        }
        if(listaPrestamos != null){
            
            lblInfP.setText("Tiene libros en prestamo, seleccione para devolver");
        }
        else lblInfP.setText("No tiene libros en prestamo");
        
    }
}

