/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import clases.V1.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;


public class Exe extends javax.swing.JFrame {

    static HashMap<String, String> administrador = new HashMap<>();
    static HashMap<String, String> credencialesCliente = new HashMap<>();
    static HashMap<String, Cliente> clientes = new HashMap<>();
    static LibrosBiblioteca almacen = new LibrosBiblioteca();
    static ArrayList<Libro> listaSalida;
    static Cliente cliente;    
    static String Usuario;
    
    panSesion pb1 = new panSesion();    
    panUser pb2 = new panUser();
    panAdmin pb3 = new panAdmin();
        
   
    
    
    
    
    public Exe() {
        
        
        initComponents();
        precarga();
        selInit(1);
        
        pb1.setSize(1280,650);
        pb1.setLocation(0,0);       
        panContent.add(pb1);//BorderLayout.CENTER
        
        pb2.setSize(1280,650);
        pb2.setLocation(0,0);
         panContent.add(pb2);//BorderLayout.CENTER
         
        pb3.setSize(1280,650);
        pb3.setLocation(0,0);        
        panContent.add(pb3);//BorderLayout.CENTER
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panTitle.setBackground(new java.awt.Color(255, 150, 50));
        panTitle.setPreferredSize(new java.awt.Dimension(1280, 80));

        lblTitle.setText("SGB (Sistema de Gestion de Biblioteca)");

        javax.swing.GroupLayout panTitleLayout = new javax.swing.GroupLayout(panTitle);
        panTitle.setLayout(panTitleLayout);
        panTitleLayout.setHorizontalGroup(
            panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTitleLayout.createSequentialGroup()
                .addGap(496, 496, 496)
                .addComponent(lblTitle)
                .addContainerGap(549, Short.MAX_VALUE))
        );
        panTitleLayout.setVerticalGroup(
            panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTitleLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bg.add(panTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 70));

        javax.swing.GroupLayout panContentLayout = new javax.swing.GroupLayout(panContent);
        panContent.setLayout(panContentLayout);
        panContentLayout.setHorizontalGroup(
            panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        panContentLayout.setVerticalGroup(
            panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        bg.add(panContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1280, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exe().setVisible(true);
            }
        });
    }

    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panContent;
    private javax.swing.JPanel panTitle;
    // End of variables declaration//GEN-END:variables

    public void iniciarPanelSesion() {
        
        
        pb1.setVisible(true);
        pb2.setVisible(false);
        pb3.setVisible(false);
    }
    public void iniciarPanelUser() {
        pb1.setVisible(false);
        pb2.setVisible(true);
        pb3.setVisible(false);
        
    }
    public void iniciarPanelAdmin() {
        
        pb1.setVisible(false);
        pb2.setVisible(false);
        pb3.setVisible(true);
       
       
    }
    public void selInit(int i) {
        if(i == 1){
            iniciarPanelSesion();
        }
        if(i == 2){
            iniciarPanelUser();
        }
        if(i == 3){
            iniciarPanelAdmin();
        }
    }
    
    private void precarga(){
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
        almacen.create("Libro12", "Bonn", 0, "Pearson", "Ingenieria");
    }
    
}

    
