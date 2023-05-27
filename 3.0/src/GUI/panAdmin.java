/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;
//falta implementar la suma de un libro
import clases.V1.*;
import java.awt.Color;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class panAdmin extends javax.swing.JPanel {

    private DefaultTableModel tblModel;
    private String[] header = {"Libro","Autor","Cantidad","Editorial","Categoria"};
    
    public panAdmin() {
        initComponents();
        initTable();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        panSearch = new javax.swing.JPanel();
        txtBusqueda = new javax.swing.JTextField();
        cmbFiltro = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblInfB = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panEdit = new javax.swing.JPanel();
        btnCreate = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnDel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblResultBusqueda = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panTable.setPreferredSize(new java.awt.Dimension(900, 450));

        tblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInventario);

        javax.swing.GroupLayout panTableLayout = new javax.swing.GroupLayout(panTable);
        panTable.setLayout(panTableLayout);
        panTableLayout.setHorizontalGroup(
            panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTableLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panTableLayout.setVerticalGroup(
            panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTableLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(panTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 890, 440));

        panSearch.setBackground(new java.awt.Color(245, 255, 255));

        txtBusqueda.setMinimumSize(new java.awt.Dimension(400, 30));
        txtBusqueda.setPreferredSize(new java.awt.Dimension(400, 40));

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre del libro", "Autor", "Editorial", "Categoria", "Mostrar todos" }));
        cmbFiltro.setMinimumSize(new java.awt.Dimension(120, 40));
        cmbFiltro.setPreferredSize(new java.awt.Dimension(120, 30));

        btnLimpiar.setPreferredSize(new java.awt.Dimension(150, 40));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });

        jLabel4.setText("Limpiar");

        javax.swing.GroupLayout btnLimpiarLayout = new javax.swing.GroupLayout(btnLimpiar);
        btnLimpiar.setLayout(btnLimpiarLayout);
        btnLimpiarLayout.setHorizontalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        btnLimpiarLayout.setVerticalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimpiarLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        btnBuscar.setPreferredSize(new java.awt.Dimension(150, 40));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        jLabel3.setText("Buscar");

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(54, 54, 54))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        lblInfB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("Escriba lo que desea buscar");

        jLabel2.setText("Seleccione tipo de busqueda");

        javax.swing.GroupLayout panSearchLayout = new javax.swing.GroupLayout(panSearch);
        panSearch.setLayout(panSearchLayout);
        panSearchLayout.setHorizontalGroup(
            panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSearchLayout.createSequentialGroup()
                .addGroup(panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSearchLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(lblInfB, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panSearchLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSearchLayout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addGroup(panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSearchLayout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(314, 314, 314))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSearchLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(167, 167, 167)
                        .addGroup(panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(52, 52, 52))))
        );
        panSearchLayout.setVerticalGroup(
            panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSearchLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(lblInfB)
                .addGap(18, 18, 18)
                .addGroup(panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(panSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 890, 200));

        panEdit.setBackground(new java.awt.Color(245, 255, 255));

        btnCreate.setPreferredSize(new java.awt.Dimension(390, 50));
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateMouseExited(evt);
            }
        });

        jLabel11.setText("Añadir Nuevo Libro");

        javax.swing.GroupLayout btnCreateLayout = new javax.swing.GroupLayout(btnCreate);
        btnCreate.setLayout(btnCreateLayout);
        btnCreateLayout.setHorizontalGroup(
            btnCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCreateLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel11)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        btnCreateLayout.setVerticalGroup(
            btnCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCreateLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnEdit.setPreferredSize(new java.awt.Dimension(390, 50));
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMouseExited(evt);
            }
        });

        jLabel13.setText("Editar Libro");

        javax.swing.GroupLayout btnEditLayout = new javax.swing.GroupLayout(btnEdit);
        btnEdit.setLayout(btnEditLayout);
        btnEditLayout.setHorizontalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel13)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        btnEditLayout.setVerticalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel13)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnDel.setMinimumSize(new java.awt.Dimension(100, 50));
        btnDel.setPreferredSize(new java.awt.Dimension(390, 50));
        btnDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDelMouseExited(evt);
            }
        });

        jLabel12.setText("Eliminar Libro");

        javax.swing.GroupLayout btnDelLayout = new javax.swing.GroupLayout(btnDel);
        btnDel.setLayout(btnDelLayout);
        btnDelLayout.setHorizontalGroup(
            btnDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDelLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel12)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        btnDelLayout.setVerticalGroup(
            btnDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnAdd.setPreferredSize(new java.awt.Dimension(390, 50));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });

        jLabel14.setText("Añadir Unidad");

        javax.swing.GroupLayout btnAddLayout = new javax.swing.GroupLayout(btnAdd);
        btnAdd.setLayout(btnAddLayout);
        btnAddLayout.setHorizontalGroup(
            btnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel14)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        btnAddLayout.setVerticalGroup(
            btnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txtNombre.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(100, 30));

        txtAutor.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        txtAutor.setPreferredSize(new java.awt.Dimension(100, 30));

        txtCantidad.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        txtCantidad.setPreferredSize(new java.awt.Dimension(100, 30));

        txtEditorial.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        txtEditorial.setPreferredSize(new java.awt.Dimension(100, 30));

        txtCategoria.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        txtCategoria.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel6.setText("Inserte el nombre");

        jLabel7.setText("Inserte el autor");

        jLabel8.setText("Inserte la cantidad");

        jLabel9.setText("Inserte la editorial");

        jLabel10.setText("Inserte la categoria");

        lblResultBusqueda.setText("infodasdasdsadsadasdasdas");

        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(200, 50));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCerrarSesionLayout = new javax.swing.GroupLayout(btnCerrarSesion);
        btnCerrarSesion.setLayout(btnCerrarSesionLayout);
        btnCerrarSesionLayout.setHorizontalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panEditLayout = new javax.swing.GroupLayout(panEdit);
        panEdit.setLayout(panEditLayout);
        panEditLayout.setHorizontalGroup(
            panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panEditLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panEditLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel9))
            .addGroup(panEditLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel10))
            .addGroup(panEditLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel6))
            .addGroup(panEditLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel7))
            .addGroup(panEditLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultBusqueda)
                .addGap(98, 98, 98))
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panEditLayout.setVerticalGroup(
            panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditLayout.createSequentialGroup()
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(7, 7, 7)
                .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResultBusqueda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
        if(cmbFiltro.getSelectedIndex() == 0){ //buscar por nombre
            
            limpiarTabla();
            
            String nombre = txtBusqueda.getText();
            txtBusqueda.setText("");
            
            Libro l = Exe.almacen.mostrarPorNombre(nombre);
            if(l == null){
                lblInfB.setText("No se encuentra el libro");
            }
            else{
                tblModel.addRow(l.toArray());
            }

        }
        if(cmbFiltro.getSelectedIndex() == 1){ // buscar por autor           
            limpiarTabla();            
           
            String nombre = txtBusqueda.getText();
            txtBusqueda.setText("");
            
            Exe.listaSalida = Exe.almacen.mostrarPorAutor(nombre);
            
            
            for(int i = 0; i < Exe.listaSalida.size(); i++){
                Libro l = Exe.listaSalida.get(i);
                tblModel.addRow(l.toArray());
            }
            Exe.listaSalida.clear();
        }
        
        if(cmbFiltro.getSelectedIndex() == 2){
                     
            limpiarTabla();
            
            String nombre = txtBusqueda.getText();
            txtBusqueda.setText("");
            
            Exe.listaSalida = Exe.almacen.mostrarPorEditorial(nombre);
            
            for(int i = 0; i < Exe.listaSalida.size(); i++){
                Libro l = Exe.listaSalida.get(i);
                tblModel.addRow(l.toArray());
            }
            Exe.listaSalida.clear();
        }
        
        if(cmbFiltro.getSelectedIndex() == 3){                     
            limpiarTabla();
            
            String nombre = txtBusqueda.getText();
            txtBusqueda.setText("");
            
            Exe.listaSalida = Exe.almacen.mostrarPorCategoria(nombre);
            
            for(int i = 0; i < Exe.listaSalida.size(); i++){
                Libro l = Exe.listaSalida.get(i);
                tblModel.addRow(l.toArray());
            } 
            Exe.listaSalida.clear();
        }
        
        if(cmbFiltro.getSelectedIndex() == 4){            
            limpiarTabla();
            
            Exe.listaSalida = Exe.almacen.mostrarTodos();

            
            for(int i = 0; i < Exe.listaSalida.size(); i++){
                Libro l = Exe.listaSalida.get(i);
                tblModel.addRow(l.toArray());
            }
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseClicked
       
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
        boolean tipo = true;
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
            try{
               cantidad = Integer.parseInt(cant); 
            }
            catch(NumberFormatException e ){
                tipo = false;                
            }           
            if(tipo == false) lblResultBusqueda.setText("Inserte un numero entero en la cantidad");
            else{
                
                if(Exe.almacen.mostrarPorNombre(nombre) != null){
                    lblResultBusqueda.setText("Ya existe un libro con ese nombre");
                }
                else{
                    Exe.almacen.create(nombre, autor, cantidad, editorial, categoria);
                    Libro l = Exe.almacen.mostrarPorNombre(nombre);
                    tblModel.addRow(l.toArray());
            
                    txtNombre.setText("");
                    txtAutor.setText("");
                    txtCantidad.setText("");
                    txtEditorial.setText("");
                    txtCategoria.setText("");
                    lblResultBusqueda.setText("Libro añadido exitosamente");        
                    
                }             
        
            }
        }
    }//GEN-LAST:event_btnCreateMouseClicked

    private void btnDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseClicked
        // TODO add your handling code here:
        if(tblInventario.getSelectedRowCount() != 1){
            return;
        }
        int fila = tblInventario.getSelectedRow();
        
        String nombreEliminar = (String) tblModel.getValueAt(fila,0);        
        Exe.almacen.eliminarLibro(nombreEliminar);

        tblModel.removeRow(fila);
        
        
    }//GEN-LAST:event_btnDelMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        // TODO add your handling code here:
        if (tblInventario.getSelectedRowCount() != 1){
            return;
        }
        int cantidad = 0;
        String nombre;
        String autor  ;
        String cant  ;
        String editorial;
        String categoria;
        boolean tipo = true;
        boolean verificar = true;
        
        nombre = txtNombre.getText();
        autor = txtAutor.getText();
        cant = txtCantidad.getText();
        editorial = txtEditorial.getText();
        categoria = txtCategoria.getText();
        
        
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
            try{
               cantidad = Integer.parseInt(cant);
            }
            catch(NumberFormatException e ){
                tipo = false;                
            }           
            if(tipo == false) lblResultBusqueda.setText("Inserte un numero entero en la cantidad");
            else{
                int fila = tblInventario.getSelectedRow();
            
                String nombreViejo = (String) tblModel.getValueAt(fila,0);
            
            
                Libro l = new Libro(nombre, autor, cantidad, editorial,  categoria);
            
                Exe.almacen.actualizarLibro(nombreViejo, nombre, autor, editorial, categoria);
            
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
        }
        
    }//GEN-LAST:event_btnEditMouseClicked

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

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        if(tblInventario.getSelectedRowCount() != 1){
            return;
        }
        //añade la unidad al almacen
        int fila = tblInventario.getSelectedRow();        
        String nombreDevolucion = (String) tblModel.getValueAt(fila,0);              
        Exe.almacen.devolverUnidad(nombreDevolucion);
        
        int cantidad = (int) tblModel.getValueAt(fila,2); 
        tblInventario.setValueAt(cantidad + 1,fila,2);
        
        
        
  
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnCreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseEntered
        // TODO add your handling code here:
        btnCreate.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnCreateMouseEntered

    private void btnCreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseExited
        // TODO add your handling code here:
        btnCreate.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnCreateMouseExited

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        // TODO add your handling code here:
        btnEdit.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        // TODO add your handling code here:
        btnEdit.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnEditMouseExited

    private void btnDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseEntered
        // TODO add your handling code here:
        btnDel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnDelMouseEntered

    private void btnDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseExited
        // TODO add your handling code here:
        btnDel.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnDelMouseExited

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        // TODO add your handling code here:
        btnAdd.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        // TODO add your handling code here:
        btnAdd.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnAddMouseExited

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:
        btnBuscar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        // TODO add your handling code here:
        btnBuscar.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        // TODO add your handling code here:
        btnLimpiar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        // TODO add your handling code here:
        btnLimpiar.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        
        Exe frame = (Exe) SwingUtilities.getWindowAncestor(panAdmin.this);
        frame.selInit(1);
        
        
        
        
    }//GEN-LAST:event_btnCerrarSesionMouseClicked
   
    
    public void limpiarTabla(){
        for(int i = 0; i < tblInventario.getRowCount(); i++ ){
            tblModel.removeRow(i);
            i --;
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAdd;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnCreate;
    private javax.swing.JPanel btnDel;
    private javax.swing.JPanel btnEdit;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfB;
    private javax.swing.JLabel lblResultBusqueda;
    private javax.swing.JPanel panEdit;
    private javax.swing.JPanel panSearch;
    private javax.swing.JPanel panTable;
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
