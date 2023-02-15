/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro
 */
public class Toneladas_Procesadas extends javax.swing.JFrame {

    /**
     * Creates new form Toneladas_Procesadas
     */
    public Toneladas_Procesadas() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Toneladas Procesadas");
        mostrardatos("");
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
        modelo.addColumn("TOTAL");
        Tbproceso.setModel(modelo);
         String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM procesamiento";
        }else{
            sql = "SELECT * FROM procesamiento WHERE cedula='"+valor+"'";
        }
        String [] datos = new String [8];
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
                datos [7] = rs.getString(8);
                
        modelo.addRow(datos); 
            }
            Tbproceso.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroClientes.class.getName()).log(Level.SEVERE, null, ex);
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
        btnregresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtcoque = new javax.swing.JTextField();
        txttermico = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtantracita = new javax.swing.JTextField();
        txtceniza = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnmostardatos = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btncaalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbproceso = new javax.swing.JTable();
        btnsalir1 = new javax.swing.JButton();

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
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Toneladas procesadas"));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Cedula:");

        jLabel3.setText("Numero de toneladas proceadas");

        jLabel4.setText("Termico:");

        jLabel5.setText("Fecha:");

        jLabel6.setText("Ceniza:");

        jLabel7.setText("Antracita:");

        jLabel8.setText("Coque:");

        jLabel9.setText("Total:");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtantracita, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtceniza, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txttermico, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcoque, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttermico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtceniza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtantracita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmostardatos.setText("Mostrar Datos");
        btnmostardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostardatosActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btncaalcular.setText("Calcular total");
        btncaalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncaalcularActionPerformed(evt);
            }
        });

        Tbproceso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tbproceso.setComponentPopupMenu(jPopupMenu1);
        Tbproceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbprocesoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbproceso);

        btnsalir1.setText("Salir");
        btnsalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnnuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnguardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnmostardatos)
                            .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncaalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addComponent(btnguardar)
                        .addGap(32, 32, 32)
                        .addComponent(btnnuevo)
                        .addGap(31, 31, 31)
                        .addComponent(btnactualizar)
                        .addGap(31, 31, 31)
                        .addComponent(btnmostardatos)
                        .addGap(31, 31, 31)
                        .addComponent(btncaalcular)
                        .addGap(35, 35, 35)
                        .addComponent(btnsalir1)
                        .addGap(29, 29, 29)
                        .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        // TODO add your handling code here:
        VentanasConect obj = new VentanasConect();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pst = co.prepareStatement("INSERT INTO procesamiento (cedula,nombre,coque,termico,antracita,ceniza,fecha,total) VALUES (?,?,?,?,?,?,?,?)");

            pst.setString(1, txtcedula.getText());
            pst.setString(2, txtnombre.getText());
            pst.setString(3, txtcoque.getText());
            pst.setString(4, txttermico.getText());
            pst.setString(5, txtantracita.getText());
            pst.setString(6, txtceniza.getText());
            pst.setString(7, txtfecha.getText());
            pst.setString(8, txttotal.getText());
            pst.executeUpdate();
            mostrardatos("");
            JOptionPane.showMessageDialog(null, "Registro Guardado");
        }catch (Exception e){
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        this.txtcedula.setText("");
        this.txtnombre.setText("");
        this.txtcoque.setText("");
        this.txttermico.setText("");
        this.txtantracita.setText("");
        this.txtceniza.setText("");
        this.txtfecha.setText("");
        this.txttotal.setText("");
        txtcedula.grabFocus();
        
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        try{
            PreparedStatement pst = co.prepareStatement("UPDATE procesamiento SET nombre='"+txtnombre.getText()+"',coque='"+txtcoque.getText()+"',termico='"+txttermico.getText()+"',antracita='"+txtantracita.getText()+"',ceniza='"+txtceniza.getText()+"',fecha='"+txtfecha.getText()+"',total='"+txttotal.getText()+"'WHERE cedula='"+txtcedula.getText()+"'");
            pst.executeUpdate();
            mostrardatos("");
            JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btncaalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncaalcularActionPerformed
        // TODO add your handling code here:
        Double coque,termico,ceniza,antracita,total;
        
        coque=Double.parseDouble(txtcoque.getText());
        termico=Double.parseDouble(txttermico.getText());
        ceniza=Double.parseDouble(txtceniza.getText());
        antracita=Double.parseDouble(txtantracita.getText());
        
        total=coque+termico+ceniza+antracita;
        String t = total + "";
        txttotal.setText(t);
        
        JOptionPane.showMessageDialog(null, "CALCULO REALIZADO");
        
    }//GEN-LAST:event_btncaalcularActionPerformed

    private void btnmostardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostardatosActionPerformed
        // TODO add your handling code here:
        mostrardatos("");
    }//GEN-LAST:event_btnmostardatosActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        mostrardatos(txtbuscar.getText());
        JOptionPane.showMessageDialog(null, "BUSQUEDA REALIZADA");
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnsalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir1ActionPerformed
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_btnsalir1ActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        int fila = Tbproceso.getSelectedRow();
        if (fila >= 0) {
            txtcedula.setText(Tbproceso.getValueAt(fila, 0).toString());
            txtnombre.setText(Tbproceso.getValueAt(fila, 1).toString());
            txtcoque.setText(Tbproceso.getValueAt(fila, 2).toString());
            txttermico.setText(Tbproceso.getValueAt(fila, 3).toString());
            txtantracita.setText(Tbproceso.getValueAt(fila, 4).toString());
            txtceniza.setText(Tbproceso.getValueAt(fila, 5).toString());
            txtfecha.setText(Tbproceso.getValueAt(fila, 6).toString());
            txttotal.setText(Tbproceso.getValueAt(fila, 7).toString());
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila por favor");
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        int fila = Tbproceso.getSelectedRow();
        String cedula="";
        cedula=Tbproceso.getValueAt(fila, 0).toString();
        try{
            PreparedStatement pst = co.prepareStatement("DELETE FROM procesamiento WHERE cedula='"+cedula+"'");
            pst.executeUpdate();
            mostrardatos("");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_EliminarActionPerformed
    private void cerrar(){
        String Botones []={"cerrar", "cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿Desea cerrar la aplicacion","cerrar",0,0,null,Botones,this);
        if (eleccion == JOptionPane.YES_OPTION) {
           System.exit(0);
        }
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void TbprocesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbprocesoMouseClicked
        // TODO add your handling code here:
        int filas;
        int flia_seleccionada=Tbproceso.getSelectedRow();
        txtcedula.setText(Tbproceso.getValueAt(flia_seleccionada,0).toString());
        txtnombre.setText(Tbproceso.getValueAt(flia_seleccionada,1).toString());
        txtcoque.setText(Tbproceso.getValueAt(flia_seleccionada,2).toString());
        txtantracita.setText(Tbproceso.getValueAt(flia_seleccionada,3).toString());
        txtceniza.setText(Tbproceso.getValueAt(flia_seleccionada,4).toString());
        txttermico.setText(Tbproceso.getValueAt(flia_seleccionada,5).toString());
        txtfecha.setText(Tbproceso.getValueAt(flia_seleccionada,6).toString());
        txttotal.setText(Tbproceso.getValueAt(flia_seleccionada,7).toString());
        filas=flia_seleccionada;
    }//GEN-LAST:event_TbprocesoMouseClicked

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
            java.util.logging.Logger.getLogger(Toneladas_Procesadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Toneladas_Procesadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Toneladas_Procesadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Toneladas_Procesadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Toneladas_Procesadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Editar;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JTable Tbproceso;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncaalcular;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmostardatos;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnsalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField txtantracita;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtceniza;
    private javax.swing.JTextField txtcoque;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttermico;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
Conectar c = new Conectar();
Connection co = c.conexion();
}