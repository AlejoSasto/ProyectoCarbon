/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro
 */
public class Ventas extends javax.swing.JFrame {

    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ventas");
        mostrardatos("");
        mostrardatos1("");
        mostrardatos2("");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
    }
    void mostrardatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CEDULA");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("C. COQUE");
        modelo.addColumn("C. TERMICO");
        modelo.addColumn("C. ANTRACITA");
        modelo.addColumn("C. CENIZA");
        modelo.addColumn("FECHA");
        Tbventas.setModel(modelo);
        
         String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM ventas";
        }else{
            sql = "SELECT * FROM ventas WHERE cedula='"+valor+"'";
        }
        String [] datos = new String [7];
        try {
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
                datos [2] = rs.getString(3);
                datos [3] = rs.getString(4);
                datos [4] = rs.getString(5);
                datos [5] = rs.getString(6);
                datos [6] = rs.getString(7);
                
        modelo.addRow(datos); 
            }
            Tbventas.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(RegistroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void mostrardatos1(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CEDULA");
        modelo.addColumn("PRECIO COQUE");
        modelo.addColumn("PRECIO TERMICO");
        modelo.addColumn("PRECIO ANTRACITA");
        modelo.addColumn("PRECIO CENIZA");
        Tbprecio.setModel(modelo);
         String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM ventas";
        }else{
            sql = "SELECT * FROM ventas WHERE cedula='"+valor+"'";
        }
        String [] datos = new String [5];
        try {
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(8);
                datos [2] = rs.getString(9);
                datos [3] = rs.getString(10);
                datos [4] = rs.getString(11);
                
        modelo.addRow(datos); 
            }
            Tbprecio.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void mostrardatos2(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("CEDULA");
        modelo.addColumn("PT. COQUE");
        modelo.addColumn("PT. TERMICO");
        modelo.addColumn("PT. ANTRACITA");
        modelo.addColumn("PT. CENIZA");
        modelo.addColumn("PRECIO TOTAL");
        Tbtotal.setModel(modelo);
         String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM ventas";
        }else{
            sql = "SELECT * FROM ventas WHERE cedula='"+valor+"'";
        }
        String [] datos = new String [6];
        try {
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(12);
                datos [2] = rs.getString(13);
                datos [3] = rs.getString(14);
                datos [4] = rs.getString(15);
                datos [5] = rs.getString(16);
                
        modelo.addRow(datos); 
            }
            Tbtotal.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void cerrar(){
        String Botones []={"cerrar", "cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿Desea cerrar la aplicacion","cerrar",0,0,null,Botones,this);
        if (eleccion == JOptionPane.YES_OPTION) {
           System.exit(0);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Editar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        btnRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtcoque = new javax.swing.JTextField();
        txtceniza = new javax.swing.JTextField();
        txtantracita = new javax.swing.JTextField();
        txttermico = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtprecioceniza = new javax.swing.JTextField();
        txtpreciocoque = new javax.swing.JTextField();
        txttotalcoque = new javax.swing.JTextField();
        txttotaltermico = new javax.swing.JTextField();
        txtprecioantracita = new javax.swing.JTextField();
        txtpreciotermico = new javax.swing.JTextField();
        txttotalceniza = new javax.swing.JTextField();
        txttotalantracita = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btncalcular = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        btnimprimir = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btnmostrardatos = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbventas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbprecio = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tbtotal = new javax.swing.JTable();

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Editar);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ventas"));

        jLabel1.setText("Cedula:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Tipo carbon");

        jLabel4.setText("Termico:");

        jLabel5.setText("Ceniza:");

        jLabel6.setText("Antracita:");

        jLabel7.setText("Fecha:");

        jLabel8.setText("Coque:");

        txtcoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcoqueActionPerformed(evt);
            }
        });

        jLabel9.setText("Cantidad");

        jLabel10.setText("Precio");

        jLabel11.setText("Precio total");

        jLabel23.setText("Total ventas");

        btncalcular.setText("Calcular");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnimprimir.setText("Recibo");
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(63, 63, 63)
                .addComponent(jLabel9)
                .addGap(135, 135, 135)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35)
                        .addComponent(txtantracita, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(50, 50, 50)
                        .addComponent(txtfecha))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(txtcedula))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addComponent(txtnombre))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(48, 48, 48)
                        .addComponent(txtcoque))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtceniza)
                            .addComponent(txttermico)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtprecioceniza)
                                    .addComponent(txtpreciocoque)
                                    .addComponent(txtprecioantracita)
                                    .addComponent(txtpreciotermico))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttotalceniza, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txttotalcoque)
                                    .addComponent(txttotaltermico)
                                    .addComponent(txttotalantracita)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(34, 34, 34)
                                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 74, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnimprimir)
                        .addGap(135, 135, 135))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnimprimir)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpreciocoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotalcoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttermico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotaltermico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpreciotermico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtceniza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecioceniza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotalceniza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtantracita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecioantracita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotalantracita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncalcular, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbuscar))))
        );

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btnmostrardatos.setText("Mostrar datos");
        btnmostrardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrardatosActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        Tbventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tbventas.setComponentPopupMenu(jPopupMenu1);
        Tbventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbventasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbventas);

        Tbprecio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tbprecio.setComponentPopupMenu(jPopupMenu1);
        Tbprecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbprecioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tbprecio);

        Tbtotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tbtotal.setComponentPopupMenu(jPopupMenu1);
        Tbtotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbtotalMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tbtotal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmostrardatos))
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnguardar)
                            .addComponent(btnnuevo)
                            .addComponent(btnactualizar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnsalir)
                    .addComponent(btnmostrardatos))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VentanasConect obj = new VentanasConect();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnmostrardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrardatosActionPerformed
        // TODO add your handling code here:
        mostrardatos("");
        mostrardatos1("");
        mostrardatos2("");
    }//GEN-LAST:event_btnmostrardatosActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pst = co.prepareStatement("INSERT INTO ventas (cedula,nombre,coque,termico,ceniza,antracita,fecha,precoque,pretermico,preceniza,preantracita,totalcoque,totaltermico,totalceniza,totalantracita,total) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, txtcedula.getText());
            pst.setString(2, txtnombre.getText());
            pst.setString(3, txtcoque.getText());
            pst.setString(4, txttermico.getText());
            pst.setString(5, txtantracita.getText());
            pst.setString(6, txtceniza.getText());
            pst.setString(7, txtfecha.getText());
            pst.setString(8, txtpreciocoque.getText());
            pst.setString(9, txtpreciotermico.getText());
            pst.setString(10, txtprecioceniza.getText());
            pst.setString(11, txtprecioantracita.getText());
            pst.setString(12, txttotalcoque.getText());
            pst.setString(13, txttotaltermico.getText());
            pst.setString(14, txttotalceniza.getText());
            pst.setString(15, txttotalantracita.getText());
            pst.setString(16, txttotal.getText());
            pst.executeUpdate();
            mostrardatos("");
            mostrardatos1("");
            mostrardatos2("");
            JOptionPane.showMessageDialog(null, "VENTA GUARDADA");
        }catch (Exception e){
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        mostrardatos(txtbuscar.getText());
        mostrardatos1(txtbuscar.getText());
        mostrardatos2(txtbuscar.getText());
        JOptionPane.showMessageDialog(null, "BUSQUEDA REALIZADA");
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        this.txtcedula.setText("");
        this.txtnombre.setText("");
        this.txtcoque.setText("");
        this.txttermico.setText("");
        this.txtantracita.setText("");
        this.txtceniza.setText("");
        this.txtfecha.setText("");
        this.txtpreciocoque.setText("");
        this.txtpreciotermico.setText("");
        this.txtprecioceniza.setText("");
        this.txtprecioantracita.setText("");
        this.txttotalcoque.setText("");
        this.txttotaltermico.setText("");
        this.txttotalceniza.setText("");
        this.txttotalantracita.setText("");
        this.txttotal.setText("");
        txtcedula.grabFocus();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        // TODO add your handling code here:
        Double total,coque,termico,ceniza,antracita,preco,preter,precen,prean;
        
        coque=Double.parseDouble(txtcoque.getText());
        termico=Double.parseDouble(txttermico.getText());
        ceniza=Double.parseDouble(txtceniza.getText());
        antracita=Double.parseDouble(txtantracita.getText());
        preco=Double.parseDouble(txtpreciocoque.getText());
        preter=Double.parseDouble(txtpreciotermico.getText());
        precen=Double.parseDouble(txtprecioceniza.getText());
        prean=Double.parseDouble(txtprecioantracita.getText());
        
        coque=preco*coque;
        termico=preter*termico;
        ceniza=ceniza*precen;
        antracita=antracita*prean;
        String totalco = coque + "";
        String totalter = termico + "";
        String totalcen = ceniza + "";
        String totalan = antracita + "";
        
        txttotalcoque.setText(totalco);
        txttotaltermico.setText(totalter);
        txttotalceniza.setText(totalcen);
        txttotalantracita.setText(totalan);
        
        total=coque+termico+ceniza+antracita;
        String t = total + "";
        txttotal.setText(t);
        
        JOptionPane.showMessageDialog(null, "CALCULO REALIZADO");
    }//GEN-LAST:event_btncalcularActionPerformed

    private void txtcoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcoqueActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtcoqueActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        int fila = Tbventas.getSelectedRow();
        int fila1 = Tbprecio.getSelectedRow();
        int fila2 = Tbtotal.getSelectedRow();
        if (fila >= 0) {
            txtcedula.setText(Tbventas.getValueAt(fila, 0).toString());
            txtnombre.setText(Tbventas.getValueAt(fila, 1).toString());
            txtcoque.setText(Tbventas.getValueAt(fila, 2).toString());
            txttermico.setText(Tbventas.getValueAt(fila, 3).toString());
            txtantracita.setText(Tbventas.getValueAt(fila, 4).toString());
            txtceniza.setText(Tbventas.getValueAt(fila, 5).toString());
            txtfecha.setText(Tbventas.getValueAt(fila, 6).toString());
        }if (fila >= 0) {
            txtpreciocoque.setText(Tbprecio.getValueAt(fila1, 0).toString());
            txtpreciotermico.setText(Tbprecio.getValueAt(fila1, 1).toString());
            txtprecioceniza.setText(Tbprecio.getValueAt(fila1, 2).toString());
            txtprecioantracita.setText(Tbprecio.getValueAt(fila1, 3).toString());
        }if (fila >= 0) {   
            txttotalcoque.setText(Tbtotal.getValueAt(fila2, 0).toString());
            txttotaltermico.setText(Tbtotal.getValueAt(fila2, 1).toString());
            txttotalceniza.setText(Tbtotal.getValueAt(fila2, 2).toString());
            txttotalantracita.setText(Tbtotal.getValueAt(fila2, 3).toString());
            txttotal.setText(Tbtotal.getValueAt(fila2, 4).toString());
            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila por favor");
        }
    
    }//GEN-LAST:event_EditarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        int fila = Tbventas.getSelectedRow();
        int fila1 = Tbprecio.getSelectedRow();
        int fila2 = Tbtotal.getSelectedRow();
        String cedula="";
        cedula=Tbventas.getValueAt(fila, 0).toString();
        cedula=Tbprecio.getValueAt(fila1, 0).toString();
        cedula=Tbtotal.getValueAt(fila2, 0).toString();
        try{
            PreparedStatement pst = co.prepareStatement("DELETE FROM ventas WHERE cedula='"+cedula+"'");
            PreparedStatement ps = co.prepareStatement("DELETE FROM ventas WHERE cedula='"+cedula+"'");
            PreparedStatement p = co.prepareStatement("DELETE FROM ventas WHERE cedula='"+cedula+"'");
            pst.executeUpdate();
            ps.executeUpdate();
            p.executeUpdate();
            mostrardatos("");
            mostrardatos1("");
            mostrardatos2("");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        try{
            PreparedStatement pst = co.prepareStatement("UPDATE ventas SET nombre='"+txtnombre.getText()+"',coque='"+txtcoque.getText()+"',termico='"+txttermico.getText()+"',antracita='"+txtantracita.getText()+"',ceniza='"+txtceniza.getText()+"',fecha='"+txtfecha.getText()+"',precoque='"+txtpreciocoque.getText()+"',pretermico='"+txtpreciotermico.getText()+"',preceniza='"+txtprecioceniza.getText()+"',preantracita='"+txtprecioantracita.getText()+"',totalcoque='"+txttotalcoque.getText()+"',totaltermico='"+txttotaltermico.getText()+"',totalceniza='"+txttotalceniza.getText()+"',totalantracita='"+txttotalantracita.getText()+"',total='"+txttotal.getText()+"'WHERE cedula='"+txtcedula.getText()+"'");
            pst.executeUpdate();
            mostrardatos("");
           mostrardatos1("");
            mostrardatos2("");
            JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void TbventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbventasMouseClicked
        // TODO add your handling code here:
         int filas;
        int flia_seleccionada=Tbventas.getSelectedRow();
        txtcedula.setText(Tbventas.getValueAt(flia_seleccionada,0).toString());
        txtnombre.setText(Tbventas.getValueAt(flia_seleccionada,1).toString());
        txtcoque.setText(Tbventas.getValueAt(flia_seleccionada,2).toString());
        txtantracita.setText(Tbventas.getValueAt(flia_seleccionada,3).toString());
        txtceniza.setText(Tbventas.getValueAt(flia_seleccionada,4).toString());
        txttermico.setText(Tbventas.getValueAt(flia_seleccionada,5).toString());
        txtfecha.setText(Tbventas.getValueAt(flia_seleccionada,6).toString());
        
        txtpreciocoque.setText(Tbprecio.getValueAt(flia_seleccionada,0).toString());
        txtprecioceniza.setText(Tbprecio.getValueAt(flia_seleccionada,1).toString());
        txtpreciotermico.setText(Tbprecio.getValueAt(flia_seleccionada,2).toString());
        txtprecioceniza.setText(Tbprecio.getValueAt(flia_seleccionada,3).toString());
        
        txttotalcoque.setText(Tbtotal.getValueAt(flia_seleccionada,0).toString());
        txttotalantracita.setText(Tbtotal.getValueAt(flia_seleccionada,1).toString());
        txttotalceniza.setText(Tbtotal.getValueAt(flia_seleccionada,2).toString());
        txttotaltermico.setText(Tbtotal.getValueAt(flia_seleccionada,3).toString());
        txttotal.setText(Tbtotal.getValueAt(flia_seleccionada,4).toString());
        
        filas=flia_seleccionada;
    }//GEN-LAST:event_TbventasMouseClicked

    private void TbprecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbprecioMouseClicked
        // TODO add your handling code here:
         int filas;
        int flia_seleccionada=Tbventas.getSelectedRow();
        txtcedula.setText(Tbventas.getValueAt(flia_seleccionada,0).toString());
        txtnombre.setText(Tbventas.getValueAt(flia_seleccionada,1).toString());
        txtcoque.setText(Tbventas.getValueAt(flia_seleccionada,2).toString());
        txtantracita.setText(Tbventas.getValueAt(flia_seleccionada,3).toString());
        txtceniza.setText(Tbventas.getValueAt(flia_seleccionada,4).toString());
        txttermico.setText(Tbventas.getValueAt(flia_seleccionada,5).toString());
        txtfecha.setText(Tbventas.getValueAt(flia_seleccionada,6).toString());
        
        txtpreciocoque.setText(Tbprecio.getValueAt(flia_seleccionada,0).toString());
        txtprecioceniza.setText(Tbprecio.getValueAt(flia_seleccionada,1).toString());
        txtpreciotermico.setText(Tbprecio.getValueAt(flia_seleccionada,2).toString());
        txtprecioceniza.setText(Tbprecio.getValueAt(flia_seleccionada,3).toString());
        
        txttotalcoque.setText(Tbtotal.getValueAt(flia_seleccionada,0).toString());
        txttotalantracita.setText(Tbtotal.getValueAt(flia_seleccionada,1).toString());
        txttotalceniza.setText(Tbtotal.getValueAt(flia_seleccionada,2).toString());
        txttotaltermico.setText(Tbtotal.getValueAt(flia_seleccionada,3).toString());
        txttotal.setText(Tbtotal.getValueAt(flia_seleccionada,4).toString());
        
        filas=flia_seleccionada;
    }//GEN-LAST:event_TbprecioMouseClicked

    private void TbtotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbtotalMouseClicked
        // TODO add your handling code here:
         int filas;
        int flia_seleccionada=Tbventas.getSelectedRow();
        txtcedula.setText(Tbventas.getValueAt(flia_seleccionada,0).toString());
        txtnombre.setText(Tbventas.getValueAt(flia_seleccionada,1).toString());
        txtcoque.setText(Tbventas.getValueAt(flia_seleccionada,2).toString());
        txtantracita.setText(Tbventas.getValueAt(flia_seleccionada,3).toString());
        txtceniza.setText(Tbventas.getValueAt(flia_seleccionada,4).toString());
        txttermico.setText(Tbventas.getValueAt(flia_seleccionada,5).toString());
        txtfecha.setText(Tbventas.getValueAt(flia_seleccionada,6).toString());
        
        txtpreciocoque.setText(Tbprecio.getValueAt(flia_seleccionada,0).toString());
        txtprecioceniza.setText(Tbprecio.getValueAt(flia_seleccionada,1).toString());
        txtpreciotermico.setText(Tbprecio.getValueAt(flia_seleccionada,2).toString());
        txtprecioceniza.setText(Tbprecio.getValueAt(flia_seleccionada,3).toString());
        
        txttotalcoque.setText(Tbtotal.getValueAt(flia_seleccionada,0).toString());
        txttotalantracita.setText(Tbtotal.getValueAt(flia_seleccionada,1).toString());
        txttotalceniza.setText(Tbtotal.getValueAt(flia_seleccionada,2).toString());
        txttotaltermico.setText(Tbtotal.getValueAt(flia_seleccionada,3).toString());
        txttotal.setText(Tbtotal.getValueAt(flia_seleccionada,4).toString());
        
        filas=flia_seleccionada;
    }//GEN-LAST:event_TbtotalMouseClicked

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnimprimirActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Editar;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JTable Tbprecio;
    private javax.swing.JTable Tbtotal;
    private javax.swing.JTable Tbventas;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnmostrardatos;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtantracita;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtceniza;
    private javax.swing.JTextField txtcoque;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecioantracita;
    private javax.swing.JTextField txtprecioceniza;
    private javax.swing.JTextField txtpreciocoque;
    private javax.swing.JTextField txtpreciotermico;
    private javax.swing.JTextField txttermico;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txttotalantracita;
    private javax.swing.JTextField txttotalceniza;
    private javax.swing.JTextField txttotalcoque;
    private javax.swing.JTextField txttotaltermico;
    // End of variables declaration//GEN-END:variables
Conectar c = new Conectar();
Connection co = c.conexion();
}
