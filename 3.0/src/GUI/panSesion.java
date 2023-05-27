/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import clases.V1.Cliente;
import java.util.LinkedList;
import javax.swing.SwingUtilities;

/**
 *
 * @author Axum
 */
public class panSesion extends javax.swing.JPanel {

    /**
     * Creates new form panSesion
     */
    public panSesion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new javax.swing.JTextField();
        lblInfo = new javax.swing.JLabel();
        btnSign = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        txtUser.setPreferredSize(new java.awt.Dimension(300, 40));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        lblInfo.setText("info");

        btnSign.setBackground(new java.awt.Color(250, 150, 50));
        btnSign.setPreferredSize(new java.awt.Dimension(150, 50));
        btnSign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSignLayout = new javax.swing.GroupLayout(btnSign);
        btnSign.setLayout(btnSignLayout);
        btnSignLayout.setHorizontalGroup(
            btnSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        btnSignLayout.setVerticalGroup(
            btnSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel2.setText("Iniciar Sesion");

        pwd.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel3.setText("Ingrese el usuario");

        jLabel4.setText("Ingrese la contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(587, 587, 587))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 507, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSign, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addGap(473, 473, 473))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnSignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignMouseClicked
        String nombre = txtUser.getText() ;
        String clave = pwd.getText();
        Exe.administrador.put("a", "a");
        
        //admin
        boolean passwordCorrecta;
        
        
        if (Exe.administrador.containsKey(nombre)) { //caso donde esta el nombre
            
            
            if(Exe.administrador.get(nombre).equals(clave)){
                Exe frame = (Exe) SwingUtilities.getAncestorOfClass(Exe.class, this);
                frame.selInit(3);
                txtUser.setText("");
                pwd.setText("");
            }
            else{
                lblInfo.setText("Contraseña Incorrecta. Intente de nuevo."); 
                pwd.setText("");
            }
        } 
        //usuario

            
        if (Exe.clientes.containsKey(nombre)) { //caso donde esta el nombre
            Exe.cliente = Exe.clientes.get(nombre); //busca el cliente
            passwordCorrecta = Exe.cliente.getClave().equals(clave);  //compara la clave dada con la guardada
            if (!passwordCorrecta) {
                lblInfo.setText("Contraseña Incorrecta. Intente de nuevo."); 
                pwd.setText("");
            }
            else{
                //ejecute el jpanel de usuario
                Exe.Usuario = nombre;
                Exe frame = (Exe) SwingUtilities.getAncestorOfClass(Exe.class, this);
                frame.selInit(2);
                txtUser.setText("");
                pwd.setText("");
            }
        } 
        else{//caso donde no esta el nombre
            if("".equals(nombre) || "".equals(clave)){
                lblInfo.setText("Complete todos los campos.");
            }
            else if(!Exe.administrador.containsKey(nombre)){//creo que es redundante la condicion
                lblInfo.setText("No esta registrado. Registrando automaticamente.");
                txtUser.setText("");
                pwd.setText("");
                Exe.cliente = new Cliente(nombre, clave, new LinkedList<>());
                Exe.clientes.put(nombre, Exe.cliente);
            }
        }
        
    }//GEN-LAST:event_btnSignMouseClicked



    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnSign;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
