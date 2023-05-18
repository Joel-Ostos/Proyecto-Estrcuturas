/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clases.GUI;

import clases.V1.Cliente;
import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Axum
 */
public class InicioSesion extends javax.swing.JFrame {
    
    HashMap<String, String> credencialesBibliotecario = new HashMap<>();
    HashMap<String, String> credencialesCliente = new HashMap<>();
    HashMap<String, Cliente> clientes = new HashMap<>();
        
        
    public InicioSesion() {
        initComponents();
        rbUsuario.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPickTypeUser = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        barraSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tfUsuario = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelInicioSesion = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        labelEstadoSesion = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        rbUsuario = new javax.swing.JRadioButton();
        rbAdmin = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(1280, 720));
        bg.setMinimumSize(new java.awt.Dimension(1280, 720));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraSuperior.setBackground(new java.awt.Color(255, 150, 20));
        barraSuperior.setPreferredSize(new java.awt.Dimension(1280, 70));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Gestion de Biblioteca (SGB)");

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraSuperiorLayout.createSequentialGroup()
                .addContainerGap(409, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(491, 491, 491))
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        bg.add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        jPanel4.setBackground(new java.awt.Color(210, 230, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 300));

        tfUsuario.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });

        btnIniciarSesion.setBackground(new java.awt.Color(255, 150, 20));
        btnIniciarSesion.setPreferredSize(new java.awt.Dimension(125, 50));
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseExited(evt);
            }
        });

        jLabel2.setText("Ingresar");

        javax.swing.GroupLayout btnIniciarSesionLayout = new javax.swing.GroupLayout(btnIniciarSesion);
        btnIniciarSesion.setLayout(btnIniciarSesionLayout);
        btnIniciarSesionLayout.setHorizontalGroup(
            btnIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnIniciarSesionLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(34, 34, 34))
        );
        btnIniciarSesionLayout.setVerticalGroup(
            btnIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIniciarSesionLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        labelInicioSesion.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        labelInicioSesion.setText("Iniciar Sesion");

        passField.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });

        labelEstadoSesion.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        labelEstadoSesion.setText("Informacion");

        labelUsuario.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        labelUsuario.setText("Usuario");

        labelContraseña.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        labelContraseña.setText("Contraseña");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 306, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelContraseña)
                    .addComponent(labelUsuario)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passField)
                        .addComponent(tfUsuario)
                        .addComponent(btnIniciarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelEstadoSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                        .addComponent(labelInicioSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(344, 344, 344))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelInicioSesion)
                .addGap(15, 15, 15)
                .addComponent(labelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEstadoSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        bg.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        buttonGroupPickTypeUser.add(rbUsuario);
        rbUsuario.setText("Usuario");
        bg.add(rbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 690, -1, -1));

        buttonGroupPickTypeUser.add(rbAdmin);
        rbAdmin.setText("Administrador");
        bg.add(rbAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 690, -1, -1));

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

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked

                                                      
        String nombre = tfUsuario.getText() ;
        String clave = passField.getText();
        
        credencialesBibliotecario.put("a", "1");
        
        
        if(rbAdmin.isSelected()){
            if (!credencialesBibliotecario.containsKey(nombre) || !credencialesBibliotecario.get(nombre).equals(clave)) {
                labelEstadoSesion.setText("No eres un administrador");
                tfUsuario.setText("");
                passField.setText("");
	} 
            else{
                //labelEstadoSesion.setText("Si es un admin, borrar esto y montar ejecutable");
                Administrador VentanaAdmin = new Administrador();
                VentanaAdmin.setVisible(true);
                this.dispose();
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        if(rbUsuario.isSelected()){
            boolean passwordCorrecta;
            Cliente cliente = null;
            
             
            if (clientes.containsKey(nombre)) { //caso donde esta el nombre
                cliente = clientes.get(nombre); //busca el cliente
                passwordCorrecta = cliente.getClave().equals(clave);  //compara la clave dada con la guardada
                if (!passwordCorrecta) {
                    labelEstadoSesion.setText("Contraseña incorrecta, intente de nuevo"); 
                    passField.setText("");
                }
                else{
                    labelEstadoSesion.setText("Si es un usuario, borrar esto y montar ejecutable");
                    
                    Usuario VentanaUser = new Usuario();
                    VentanaUser.setVisible(true);
                    this.dispose();
                }
            
            } 
            else{//caso donde no esta el nombre
                labelEstadoSesion.setText("No esta registrado, registrando automaticamente");
                tfUsuario.setText("");
                passField.setText("");
                cliente = new Cliente(nombre, clave, new LinkedList<>());
                clientes.put(nombre, cliente);
            }
        }
            
            //labelEstadoSesion.setText("Si es un cliente, borrar esto y montar ejecutable");  
        
           // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSesionMouseClicked

    private void btnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseEntered
        btnIniciarSesion.setBackground(new Color (255,100,10));
    }//GEN-LAST:event_btnIniciarSesionMouseEntered

    private void btnIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseExited
        btnIniciarSesion.setBackground(new Color (255,150,20));
    }//GEN-LAST:event_btnIniciarSesionMouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnIniciarSesion;
    private javax.swing.ButtonGroup buttonGroupPickTypeUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelEstadoSesion;
    private javax.swing.JLabel labelInicioSesion;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPasswordField passField;
    private javax.swing.JRadioButton rbAdmin;
    private javax.swing.JRadioButton rbUsuario;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
