/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clases.GUI;
import clases.V1.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Administrador extends javax.swing.JFrame {

    private DefaultTableModel tblModel;
    private String[] header = {"Libro","Autor","Cantidad","Editorial","Categoria"};
    LibrosBiblioteca almacen = new LibrosBiblioteca();
    ArrayList<Libro> listaSalida;
    
    
    public Administrador() {
        initComponents();
        initTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        barraSuperior = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        precarga = new javax.swing.JButton();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        panelEdicion = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblResultBusqueda = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        panelBusqueda = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelprueba = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        txtBusqueda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraSuperior.setBackground(new java.awt.Color(255, 150, 20));
        barraSuperior.setPreferredSize(new java.awt.Dimension(1280, 70));

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel10.setText("Sistema de Gestion de Biblioteca (SGB)");

        precarga.setText("poner datos default");
        precarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addGap(498, 498, 498)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(precarga)
                .addGap(111, 111, 111))
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(precarga))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        bg.add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        panelTabla.setPreferredSize(new java.awt.Dimension(700, 650));

        tblInventario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInventario);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        bg.add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 760, 650));

        panelEdicion.setBackground(new java.awt.Color(150, 175, 255));

        txtNombre.setPreferredSize(new java.awt.Dimension(70, 30));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtAutor.setPreferredSize(new java.awt.Dimension(70, 30));

        txtEditorial.setMinimumSize(new java.awt.Dimension(64, 30));

        txtCantidad.setBackground(new java.awt.Color(255, 220, 220));

        jLabel1.setText("Inserte el nombre");

        jLabel2.setText("Inserte el autor");

        jLabel3.setText("Inserte la editorial");

        jLabel4.setText("Inserte la categoria");

        jLabel5.setText("Inserte la cantidad");

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnEditar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        jLabel7.setText("Editar");

        javax.swing.GroupLayout btnEditarLayout = new javax.swing.GroupLayout(btnEditar);
        btnEditar.setLayout(btnEditarLayout);
        btnEditarLayout.setHorizontalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEditarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        jLabel6.setText("Agregar");

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(30, 30, 30))
        );

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setMaximumSize(new java.awt.Dimension(32767, 30));
        btnEliminar.setMinimumSize(new java.awt.Dimension(0, 30));
        btnEliminar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        jLabel8.setText("Eliminar");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        lblResultBusqueda.setText("dassa");

        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        jLabel13.setText("Limpiar");

        javax.swing.GroupLayout btnLimpiarLayout = new javax.swing.GroupLayout(btnLimpiar);
        btnLimpiar.setLayout(btnLimpiarLayout);
        btnLimpiarLayout.setHorizontalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel13)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        btnLimpiarLayout.setVerticalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelEdicionLayout = new javax.swing.GroupLayout(panelEdicion);
        panelEdicion.setLayout(panelEdicionLayout);
        panelEdicionLayout.setHorizontalGroup(
            panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEdicionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblResultBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEdicionLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEdicionLayout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEdicionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEdicionLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(75, 75, 75))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEdicionLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(90, 90, 90))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEdicionLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(77, 77, 77))
                                    .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelEdicionLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEdicionLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(83, 83, 83))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEdicionLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(76, 76, 76))
                                    .addComponent(txtEditorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEdicionLayout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEdicionLayout.createSequentialGroup()
                        .addGroup(panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        panelEdicionLayout.setVerticalGroup(
            panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEdicionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addGroup(panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEdicionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEdicionLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addComponent(lblResultBusqueda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(panelEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 520, 390));

        panelBusqueda.setBackground(new java.awt.Color(204, 255, 255));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        jLabel12.setText("Buscar");

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(29, 29, 29))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jLabel9.setText("Escriba que desea buscar");

        jLabel11.setText("Seleccione el filtro");

        labelprueba.setText("probar resultados");

        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre de libro", "Autor", "Editorial", "Categoria", "Sin filtro" }));

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(69, 69, 69))
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusquedaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelprueba)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusquedaLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelprueba))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        bg.add(panelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        
        int cantidad = 0;
        String nombre;
        String autor  ;
        String cant  ;
        String editorial;
        String categoria;
        
        nombre = txtNombre.getText();
        autor = txtAutor.getText();
        cant = txtCantidad.getText();
        editorial = txtEditorial.getText();
        categoria = txtCategoria.getText();
        
        boolean verificar = true;
        String[] ConfV = {nombre,autor,cant,editorial,categoria};
        for (String ConfV1 : ConfV) {
            if (ConfV1.equals("")) {
                verificar = false;
            }
        }
            
        if(verificar == false){
            lblResultBusqueda.setText("Hay celdas sin rellenar");
        } 
        else{
            cantidad = Integer.parseInt(cant);
            
            almacen.create(nombre, autor, cantidad, editorial, categoria);
            Libro l = almacen.mostrarPorNombre(nombre);
            tblModel.addRow(l.toArray());
            
            txtNombre.setText("");
            txtAutor.setText("");
            txtCantidad.setText("");
            txtEditorial.setText("");
            txtCategoria.setText("");
            lblResultBusqueda.setText("Libro añadido exitosamente");
        
        }
        
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        if (tblInventario.getSelectedRowCount() != 1){
            return;
        }
        int cantidad = 0;
        String nombre;
        String autor  ;
        String cant  ;
        String editorial;
        String categoria;
        
        nombre = txtNombre.getText();
        autor = txtAutor.getText();
        cant = txtCantidad.getText();
        editorial = txtEditorial.getText();
        categoria = txtCategoria.getText();
        
        boolean verificar = true;
        String[] ConfV = {nombre,autor,cant,editorial,categoria};
        for (String ConfV1 : ConfV) {
            if (ConfV1.equals("")) {
                verificar = false;
            }
        }
            
        if(verificar == false){
            lblResultBusqueda.setText("Hay celdas sin rellenar");
        } 
        else{
            cantidad = Integer.parseInt(cant);
            int fila = tblInventario.getSelectedRow();
            
            String nombreViejo = (String) tblModel.getValueAt(fila,0);
            
            
            Libro l = new Libro(nombre, autor, cantidad, editorial,  categoria);
            
            almacen.actualizarLibro(nombreViejo, nombre, autor, editorial, categoria);
            
            tblInventario.setValueAt(l.getNombre(),fila,0);
            tblInventario.setValueAt(l.getAutor(),fila,1);
            tblInventario.setValueAt(l.getCantidad(),fila,2);
            tblInventario.setValueAt(l.getEditorial(),fila,3);
            tblInventario.setValueAt(l.getCategoria(),fila,4);   
            
            txtNombre.setText("");
            txtAutor.setText("");
            txtCantidad.setText("");
            txtEditorial.setText("");
            txtCategoria.setText("");
            lblResultBusqueda.setText("Libro editado exitosamente");
        }
      
    }//GEN-LAST:event_btnEditarMouseClicked

    private void tblInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInventarioMouseClicked
        if(evt.getClickCount() == 2){
            int fila = tblInventario.getSelectedRow();
            
            String nombre = (String) tblModel.getValueAt(fila,0);
            String autor = (String) tblModel.getValueAt(fila,1);
            int cantidad = (int) tblModel.getValueAt(fila,2);
            String editorial =  (String) tblModel.getValueAt(fila,3);
            String categoria = (String) tblModel.getValueAt(fila,4);
            
            String cant = String.valueOf(cantidad);
            
            txtNombre.setText(nombre);
            txtAutor.setText(autor);
            txtCantidad.setText(cant);
            txtEditorial.setText(editorial);
            txtCategoria.setText(categoria);
            
        }     
    }//GEN-LAST:event_tblInventarioMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if(tblInventario.getSelectedRowCount() != 1){
            return;
        }
        int fila = tblInventario.getSelectedRow();
        
        String nombreEliminar = (String) tblModel.getValueAt(fila,0);        
        almacen.eliminarLibro(nombreEliminar);

        tblModel.removeRow(fila);
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void precargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precargaActionPerformed

        // TODO add your handling code here:
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
    }//GEN-LAST:event_precargaActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        //boton busqueda
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
    
    public void limpiarTabla(){
        for(int i = 0; i < tblInventario.getRowCount(); i++ ){
            tblModel.removeRow(i);
            i --;
        }
    
    }
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelprueba;
    private javax.swing.JLabel lblResultBusqueda;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelEdicion;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JButton precarga;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtNombre;
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
}

