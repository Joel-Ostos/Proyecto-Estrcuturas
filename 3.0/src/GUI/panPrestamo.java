/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import clases.V1.Cliente;
import clases.V1.Libro;
import clases.V1.Reserva;
import java.awt.Component;
import java.awt.Font;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

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
        setHeaderFont(tblPrestamo.getTableHeader(), new Font("Yu Gothic UI", Font.BOLD, 40));
        lblInfP.setText("Pulse en ver prestamos para ver la lista de prestamos");
  
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

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDevolver.setBackground(new java.awt.Color(230, 240, 230));
        btnDevolver.setPreferredSize(new java.awt.Dimension(200, 40));
        btnDevolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDevolverMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 60, 30));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/exchange.png"))); // NOI18N
        jLabel1.setText("   Devolver");

        javax.swing.GroupLayout btnDevolverLayout = new javax.swing.GroupLayout(btnDevolver);
        btnDevolver.setLayout(btnDevolverLayout);
        btnDevolverLayout.setHorizontalGroup(
            btnDevolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDevolverLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(44, 44, 44))
        );
        btnDevolverLayout.setVerticalGroup(
            btnDevolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDevolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(btnDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        lblInfP.setBackground(new java.awt.Color(255, 255, 255));
        lblInfP.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        lblInfP.setText(".");
        add(lblInfP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 73, 469, -1));

        tblPrestamo.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        tblPrestamo.setForeground(new java.awt.Color(22, 60, 30));
        tblPrestamo.setRowHeight(30);
        jScrollPane1.setViewportView(tblPrestamo);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 218, 728, 334));

        btnActualizar.setBackground(new java.awt.Color(230, 240, 230));
        btnActualizar.setPreferredSize(new java.awt.Dimension(200, 40));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(22, 60, 30));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/refresh.png"))); // NOI18N
        jLabel2.setText("   Ver Prestamos");

        javax.swing.GroupLayout btnActualizarLayout = new javax.swing.GroupLayout(btnActualizar);
        btnActualizar.setLayout(btnActualizarLayout);
        btnActualizarLayout.setHorizontalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnActualizarLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(34, 34, 34))
        );
        btnActualizarLayout.setVerticalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));
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
            lblInfP.setText("Libro devuelto");
        }                     
        
        actualizar();
        
        //hasta aca la devolucion del libro
        ////////////////////////////////////////////////////
        
        //aca presta el libro si esta en la cola de espera automaticamente si esta en la cola
        if( Exe.almacen.libroEnColaReserva(nombreDevolucion) == true){
            
            //el elemento a buscar es nombre del libro, la cola almacena un objeto de reserva que tiene libro y nombre
            
            Iterator<Reserva> iterator = Exe.almacen.reservas.iterator();
                      
            //busca el primer cliente que tenga el libro en espera
            while (iterator.hasNext()) {
            Reserva elemento = iterator.next();
            if (elemento.getLibro().equals(nombreDevolucion)) {
                //System.out.println("Elemento encontrado: " + elemento);
                //aca ya encontro el cliente
                
                
                Cliente clienteReservado = Exe.HashClientes.get(elemento.getCliente());
                
                
                boolean existencia;
                
                
                
                existencia = clienteReservado.añadirLibro(l);
            
                if(existencia == false){
                    //ya esta el libro solicitado
                    //lblInfR.setText("Ya solicito el libro.");
                
                }
                else{
                    Exe.almacen.retirarUnidad(nombreDevolucion);
                    //solicita el libro devuelto
                    //System.out.println("Libro prestado al cliente");
                    //System.out.println(elemento.getCliente());
                    
                }
                    //lblInfR.setText("Ha solicitado el libro exitosamente.");
                
                Exe.almacen.cancelarReserva(elemento.getCliente(), nombreDevolucion);
                clienteReservado = null;
                
            
               ////////////////////////////////////////////////////////////////////////////// 
                break; // Detener el recorrido cuando se encuentra el elemento requerido
            }
        }
        
            
                
            
        }       

       
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
        lblInfP.setText("");
    
    }

    public void actualizar() {
        LinkedList<Libro> listaPrestamos =  Exe.cliente.getListaLibros();
        
        for(Libro libro : listaPrestamos){
            Object[] l = libro.toArray();
            l[2] = 1;
            tblModel.addRow(l);
        }
        if(tblModel.getRowCount() == 0) {
            lblInfP.setText("No tiene libros en prestamo");
        }
        
        else {
            lblInfP.setText("Tiene libros en prestamo");
        }
        
    }

    private void setHeaderFont(JTableHeader tableHeader, Font font) {
        tableHeader.setFont(font);
        tableHeader.setDefaultRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel headerLabel = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            headerLabel.setHorizontalAlignment(JLabel.CENTER);
            return headerLabel;
        }
    });
    }
}

