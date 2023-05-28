/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import clases.V1.Cliente;
import java.awt.Color;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        txtUser.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(102, 102, 102));
        txtUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUser.setPreferredSize(new java.awt.Dimension(300, 40));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        lblInfo.setText("Ingrese o registrese. El registro es automatico.");

        btnSign.setBackground(new java.awt.Color(250, 150, 50));
        btnSign.setPreferredSize(new java.awt.Dimension(150, 50));
        btnSign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/user (1).png"))); // NOI18N
        jLabel1.setText("         Ingresar");

        javax.swing.GroupLayout btnSignLayout = new javax.swing.GroupLayout(btnSign);
        btnSign.setLayout(btnSignLayout);
        btnSignLayout.setHorizontalGroup(
            btnSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSignLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
        );
        btnSignLayout.setVerticalGroup(
            btnSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSignLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel2.setText("Iniciar Sesion");

        pwd.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        pwd.setForeground(new java.awt.Color(102, 102, 102));
        pwd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pwd.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel3.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jLabel3.setText("Usuario");

        jLabel4.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jLabel4.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(469, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(560, 560, 560))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(448, 448, 448))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(503, 503, 503))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel2)
                .addGap(62, 62, 62)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblInfo)
                .addGap(57, 57, 57)
                .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
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

            
        if (Exe.HashClientes.containsKey(nombre)) { //caso donde esta el nombre
            Exe.cliente = Exe.HashClientes.get(nombre); //busca el cliente
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
                lblInfo.setText("No esta registrado. Registrado automaticamente, Inicie Sesion.");
                txtUser.setText("");
                pwd.setText("");
                Exe.cliente = new Cliente(nombre, clave, new LinkedList<>());
                Exe.HashClientes.put(nombre, Exe.cliente);
            }
        }
        
    }//GEN-LAST:event_btnSignMouseClicked

    private void btnSignMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignMouseEntered
        btnSign.setBackground(new Color(250,200,85));
        
    }//GEN-LAST:event_btnSignMouseEntered

    private void btnSignMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignMouseExited
       btnSign.setBackground(new Color(250,150,50));
    }//GEN-LAST:event_btnSignMouseExited



    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnSign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
