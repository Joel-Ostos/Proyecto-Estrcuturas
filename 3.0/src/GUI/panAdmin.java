/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;
//falta implementar la suma de un libro
import clases.V1.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class panAdmin extends javax.swing.JPanel {

    private DefaultTableModel tblModel;
    
    
    private String[] header = {"Libro","Autor","Cantidad","Editorial","Categoria"};
    
    public panAdmin() {
        initComponents();
        initTable();
        setHeaderFont(tblInventario.getTableHeader(), new Font("Yu Gothic UI", Font.BOLD, 40));
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
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panTable.setBackground(new java.awt.Color(248, 248, 248));
        panTable.setPreferredSize(new java.awt.Dimension(900, 450));

        tblInventario.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        tblInventario.setForeground(new java.awt.Color(0, 20, 150));
        tblInventario.setRowHeight(30);
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
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panTableLayout.setVerticalGroup(
            panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        add(panTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 890, 440));

        panSearch.setBackground(new java.awt.Color(248, 248, 248));

        txtBusqueda.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txtBusqueda.setForeground(new java.awt.Color(153, 153, 153));
        txtBusqueda.setText("Escriba lo que desea buscar");
        txtBusqueda.setMinimumSize(new java.awt.Dimension(400, 30));
        txtBusqueda.setPreferredSize(new java.awt.Dimension(400, 40));
        txtBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBusquedaMouseClicked(evt);
            }
        });
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });

        cmbFiltro.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre del libro", "Autor", "Editorial", "Categoria", "Mostrar todos" }));
        cmbFiltro.setMinimumSize(new java.awt.Dimension(120, 40));
        cmbFiltro.setPreferredSize(new java.awt.Dimension(120, 30));

        btnLimpiar.setBackground(new java.awt.Color(210, 235, 255));
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

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 50, 150));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/trash (1).png"))); // NOI18N
        jLabel4.setText("   Limpiar");

        javax.swing.GroupLayout btnLimpiarLayout = new javax.swing.GroupLayout(btnLimpiar);
        btnLimpiar.setLayout(btnLimpiarLayout);
        btnLimpiarLayout.setHorizontalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimpiarLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(29, 29, 29))
        );
        btnLimpiarLayout.setVerticalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnBuscar.setBackground(new java.awt.Color(210, 235, 255));
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

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 50, 150));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/search.png"))); // NOI18N
        jLabel3.setText("   Buscar");

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(28, 28, 28))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblInfB.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        lblInfB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfB.setText(".");

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione tipo de busqueda");

        javax.swing.GroupLayout panSearchLayout = new javax.swing.GroupLayout(panSearch);
        panSearch.setLayout(panSearchLayout);
        panSearchLayout.setHorizontalGroup(
            panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSearchLayout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addGroup(panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSearchLayout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panSearchLayout.createSequentialGroup()
                            .addGap(188, 188, 188)
                            .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(75, 75, 75))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSearchLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(63, 63, 63)))))
            .addGroup(panSearchLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addComponent(lblInfB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panSearchLayout.setVerticalGroup(
            panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSearchLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblInfB)
                .addGap(15, 15, 15)
                .addGroup(panSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 890, 200));

        panEdit.setBackground(new java.awt.Color(210, 235, 255));
        panEdit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreate.setBackground(new java.awt.Color(210, 235, 255));
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

        jLabel11.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 50, 150));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/plus.png"))); // NOI18N
        jLabel11.setText("     Añadir Libro");

        javax.swing.GroupLayout btnCreateLayout = new javax.swing.GroupLayout(btnCreate);
        btnCreate.setLayout(btnCreateLayout);
        btnCreateLayout.setHorizontalGroup(
            btnCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCreateLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel11)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        btnCreateLayout.setVerticalGroup(
            btnCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCreateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panEdit.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 391, -1));

        btnEdit.setBackground(new java.awt.Color(210, 235, 255));
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

        jLabel13.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 50, 150));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/pencil.png"))); // NOI18N
        jLabel13.setText("     Editar Libro");

        javax.swing.GroupLayout btnEditLayout = new javax.swing.GroupLayout(btnEdit);
        btnEdit.setLayout(btnEditLayout);
        btnEditLayout.setHorizontalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel13)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        btnEditLayout.setVerticalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panEdit.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        btnDel.setBackground(new java.awt.Color(210, 235, 255));
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

        jLabel12.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 50, 150));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/trash (1).png"))); // NOI18N
        jLabel12.setText("      Eliminar Libro");

        javax.swing.GroupLayout btnDelLayout = new javax.swing.GroupLayout(btnDel);
        btnDel.setLayout(btnDelLayout);
        btnDelLayout.setHorizontalGroup(
            btnDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel12)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        btnDelLayout.setVerticalGroup(
            btnDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panEdit.add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        btnAdd.setBackground(new java.awt.Color(210, 235, 255));
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

        jLabel14.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 50, 150));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/add.png"))); // NOI18N
        jLabel14.setText("      Añadir Unidad");

        javax.swing.GroupLayout btnAddLayout = new javax.swing.GroupLayout(btnAdd);
        btnAdd.setLayout(btnAddLayout);
        btnAddLayout.setHorizontalGroup(
            btnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel14)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        btnAddLayout.setVerticalGroup(
            btnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panEdit.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        txtNombre.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.setPreferredSize(new java.awt.Dimension(100, 30));
        panEdit.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 309, -1));

        txtAutor.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        txtAutor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAutor.setPreferredSize(new java.awt.Dimension(100, 30));
        panEdit.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 309, -1));

        txtCantidad.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        txtCantidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCantidad.setPreferredSize(new java.awt.Dimension(100, 30));
        panEdit.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 309, -1));

        txtEditorial.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        txtEditorial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEditorial.setPreferredSize(new java.awt.Dimension(100, 30));
        panEdit.add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 309, -1));

        txtCategoria.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        txtCategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCategoria.setPreferredSize(new java.awt.Dimension(100, 30));
        panEdit.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 309, -1));

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel6.setText("Inserte el nombre");
        panEdit.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel7.setText("Inserte el autor");
        panEdit.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel8.setText("Inserte la cantidad");
        panEdit.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel9.setText("Inserte la editorial");
        panEdit.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        jLabel10.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel10.setText("Inserte la categoria");
        panEdit.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, -1, -1));

        lblResultBusqueda.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        lblResultBusqueda.setText("Pulse dos veces en la celda de la tabla para obtener datos");
        panEdit.add(lblResultBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btnCerrarSesion.setBackground(new java.awt.Color(210, 235, 255));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(200, 50));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/power.png"))); // NOI18N
        jLabel5.setText("Cerrar Sesion");

        javax.swing.GroupLayout btnCerrarSesionLayout = new javax.swing.GroupLayout(btnCerrarSesion);
        btnCerrarSesion.setLayout(btnCerrarSesionLayout);
        btnCerrarSesionLayout.setHorizontalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(23, 23, 23))
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panEdit.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 0, -1, -1));

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
            if(tblModel.getRowCount() == 0) {
            lblInfB.setText("No se encontro ningun libro.");
            }
        
            else {
            lblInfB.setText("Se encontro el libro.");
            }
      ////////////////////////////////////////////////////////            

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
        if(tblModel.getRowCount() == 0) {
            lblInfB.setText("No se encontro ningun libro con el autor mencionado");
            }
        
            else {
            lblInfB.setText("Se encontraron los siguientes libros con el autor mencionado");
            }
        
        ////////////////////////////////////////////////////////////////
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
        if(tblModel.getRowCount() == 0) {
            lblInfB.setText("No se encontro ningun libro con la editorial mencionado");
            }
        
            else {
            lblInfB.setText("Se encontraron los siguientes libros con la editorial mencionado");
            }
        
        ////////////////////////////////////////////////////////////////////////
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
        if(tblModel.getRowCount() == 0) {
            lblInfB.setText("No se encontro ningun libro de la categoria propuesta.");
            }
        
            else {
            lblInfB.setText("Se encontraron los siguientes libros con la categoria propuesta.");
            }
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        if(cmbFiltro.getSelectedIndex() == 4){            
            limpiarTabla();
            
            Exe.listaSalida = Exe.almacen.mostrarTodos();

            
            for(int i = 0; i < Exe.listaSalida.size(); i++){
                Libro l = Exe.listaSalida.get(i);
                tblModel.addRow(l.toArray());
            }
            if(tblModel.getRowCount() == 0) {
            lblInfB.setText("No se encontro ningun libro en el inventario");
            }
        
            else {
            lblInfB.setText("Se muestran todos los libros de la biblioteca.");
            }
            
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        
        limpiarTabla();
        txtBusqueda.setText("");
        lblResultBusqueda.setText("");
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
        
        lblResultBusqueda.setText("Libro eliminado exitosamente");
        
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
            
                Exe.almacen.actualizarLibro(nombreViejo, nombre, autor,cantidad, editorial, categoria);
            
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
            
            lblResultBusqueda.setText("Ha copiado los datos de la fila"+ fila);
            
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
        
        lblResultBusqueda.setText("Ha añadido una unidad al libro de la fila"+ fila);
        
        
  
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnCreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseEntered
        // TODO add your handling code here:
        btnCreate.setBackground(new Color(245,255,255));
    }//GEN-LAST:event_btnCreateMouseEntered

    private void btnCreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseExited
        // TODO add your handling code here:
        btnCreate.setBackground(new Color(210,235,255));
    }//GEN-LAST:event_btnCreateMouseExited

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        // TODO add your handling code here:
        btnEdit.setBackground(new Color(245,255,255));
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        // TODO add your handling code here:
        btnEdit.setBackground(new Color(210,235,255));
    }//GEN-LAST:event_btnEditMouseExited

    private void btnDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseEntered
        // TODO add your handling code here:
        btnDel.setBackground(new Color(245,255,255));
    }//GEN-LAST:event_btnDelMouseEntered

    private void btnDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseExited
        // TODO add your handling code here:
        btnDel.setBackground(new Color(210,235,255));
    }//GEN-LAST:event_btnDelMouseExited

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        // TODO add your handling code here:
        btnAdd.setBackground(new Color(245,255,255));
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        
        btnAdd.setBackground(new Color(210,235,255));
    }//GEN-LAST:event_btnAddMouseExited

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new Color(230,248,255));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        // TODO add your handling code here:
        btnBuscar.setBackground(new Color(210,235,255));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        // TODO add your handling code here:
        btnLimpiar.setBackground(new Color(230,248,255));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        // TODO add your handling code here:
        btnLimpiar.setBackground(new Color(210,235,255));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        
        Exe frame = (Exe) SwingUtilities.getWindowAncestor(panAdmin.this);
        frame.selInit(1);
        
        
        
        
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        btnCerrarSesion.setBackground(new Color(255,210,210));
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        btnCerrarSesion.setBackground(new Color(210,235,255));
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void txtBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBusquedaMouseClicked
        // TODO add your handling code here:
        txtBusqueda.setText("");
    }//GEN-LAST:event_txtBusquedaMouseClicked
   
    
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
