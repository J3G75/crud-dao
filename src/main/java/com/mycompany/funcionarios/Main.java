/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.funcionarios;

import controller.EmpleadoController;
import domain.Empleado;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan3
 */
public class Main extends javax.swing.JFrame {
    
    private final EmpleadoController empleadoController;
    
    private final static String[] COLUMNS={"ID","IDENTIDAD","NOMBRE","APELLIDO","ESTADO","SEXO",
        "DIRECCION","TELEFONO","NACIMIENTO","NIVEL","TITULO","UNIVERSIDAD"};
    
    private final static String SELECCIONE="--SELECCIONE";
    

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        txtIdEdit.setEditable(false);
        empleadoController=new EmpleadoController();
        listEmpleados();
        addListener();
    }
    
    private void listEmpleados() {

        cmbFuncionarios.removeAllItems();
        Empleado empleado1 = new Empleado();
        empleado1.setNombre(SELECCIONE);
        empleado1.setApellido("");
        cmbFuncionarios.addItem(empleado1);
        DefaultTableModel defaultTableModel = new DefaultTableModel();

        for (String COLUMN : COLUMNS) {
            defaultTableModel.addColumn(COLUMN);
        }

        tblFuncionarios.setModel(defaultTableModel);

        try {
            List<Empleado> empleados = empleadoController.obtenerEmpleados();
            
            if(empleados.isEmpty()){
                return;
            }
            defaultTableModel.setRowCount((empleados.size()));
            int row=0;
            
            for(Empleado empleado: empleados){
                defaultTableModel.setValueAt(empleado.getId(), row, 0);
                defaultTableModel.setValueAt(empleado.getIdentidad(), row, 1);
                defaultTableModel.setValueAt(empleado.getNombre(), row, 2);
                defaultTableModel.setValueAt(empleado.getApellido(), row, 3);
                defaultTableModel.setValueAt(empleado.getEstado(), row, 4);
                defaultTableModel.setValueAt(empleado.getSexo(), row, 5);
                defaultTableModel.setValueAt(empleado.getDireccion(), row, 6);
                defaultTableModel.setValueAt(empleado.getTelefono(), row, 7);
                defaultTableModel.setValueAt(empleado.getNacimiento(), row, 8);
                defaultTableModel.setValueAt(empleado.getNivel(), row, 9);
                defaultTableModel.setValueAt(empleado.getTitulo(), row, 10);
                defaultTableModel.setValueAt(empleado.getUniversidad(), row, 11);
                row++;
                
                cmbFuncionarios.addItem(empleado);
                
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void addListener(){
        
        cmbFuncionarios.addItemListener(event-> {
           Empleado selectedEmpleado=(Empleado) event.getItem();
           
           if(selectedEmpleado.getNombre().equals(SELECCIONE)){
               txtIdEdit.setText("");
               txtIdentidadEdit.setText("");
               txtNombreEdit.setText("");
               txtApellidoEdit.setText("");
               txtEstadoEdit.setText("");
               txtSexoEdit.setText("");
               txtDireccionEdit.setText("");
               txtTelefonoEdit.setText("");
               txtNacimientoEdit.setText("");
               txtNivelEdit.setText("");
               txtTituloEdit.setText("");
               txtUniversidadEdit.setText("");
           }
                else{
               txtIdEdit.setText(String.valueOf(selectedEmpleado.getId()));
               txtIdentidadEdit.setText(String.valueOf(selectedEmpleado.getIdentidad()));
               txtNombreEdit.setText(String.valueOf(selectedEmpleado.getNombre()));
               txtApellidoEdit.setText(String.valueOf(selectedEmpleado.getApellido()));
               txtEstadoEdit.setText(String.valueOf(selectedEmpleado.getEstado()));
               txtSexoEdit.setText(String.valueOf(selectedEmpleado.getSexo()));
               txtDireccionEdit.setText(String.valueOf(selectedEmpleado.getDireccion()));
               txtTelefonoEdit.setText(String.valueOf(selectedEmpleado.getTelefono()));
               txtNacimientoEdit.setText(String.valueOf(selectedEmpleado.getNacimiento()));
               txtNivelEdit.setText(String.valueOf(selectedEmpleado.getNivel()));
               txtTituloEdit.setText(String.valueOf(selectedEmpleado.getTitulo()));
               txtUniversidadEdit.setText(String.valueOf(selectedEmpleado.getUniversidad()));
               
           }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanes = new javax.swing.JTabbedPane();
        jPFun1 = new javax.swing.JPanel();
        jFuncionario = new javax.swing.JPanel();
        lblIdentidad = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblUniversidad = new javax.swing.JLabel();
        txtIdentidad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNacimiento = new javax.swing.JTextField();
        txtNivel = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtUniversidad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        jPFun2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblFuncionarios = new javax.swing.JLabel();
        cmbFuncionarios = new javax.swing.JComboBox<>();
        lblIdEdit = new javax.swing.JLabel();
        lblIdentidadEdit = new javax.swing.JLabel();
        lblNombreEdit = new javax.swing.JLabel();
        lblApellidoEdit = new javax.swing.JLabel();
        lblEstadoEdit = new javax.swing.JLabel();
        lblSexoEdit = new javax.swing.JLabel();
        lblDireccionEdit = new javax.swing.JLabel();
        lblTelefonoEdit = new javax.swing.JLabel();
        lblNacimientoEdit = new javax.swing.JLabel();
        lblNivelEdit = new javax.swing.JLabel();
        lblTituloEdit = new javax.swing.JLabel();
        lblUniversidadEdit = new javax.swing.JLabel();
        txtIdEdit = new javax.swing.JTextField();
        txtIdentidadEdit = new javax.swing.JTextField();
        txtNombreEdit = new javax.swing.JTextField();
        txtApellidoEdit = new javax.swing.JTextField();
        txtEstadoEdit = new javax.swing.JTextField();
        txtSexoEdit = new javax.swing.JTextField();
        txtDireccionEdit = new javax.swing.JTextField();
        txtTelefonoEdit = new javax.swing.JTextField();
        txtNacimientoEdit = new javax.swing.JTextField();
        txtNivelEdit = new javax.swing.JTextField();
        txtTituloEdit = new javax.swing.JTextField();
        txtUniversidadEdit = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("APP FUNCIONARIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite los siguientes campos"));

        lblIdentidad.setText("IDENTIDAD");

        lblNombre.setText("NOMBRE");

        lblApellido.setText("APELLIDO");

        lblEstado.setText("ESTADO");

        lblSexo.setText("SEXO");

        lblDireccion.setText("DIRECCION");

        lblTelefono.setText("TELEFONO");

        lblNacimiento.setText("NACIMIENTO");

        lblNivel.setText("NIVEL");

        lblTitulo.setText("TITULO");

        lblUniversidad.setText("UNIVERSIDAD");

        txtIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentidadActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFuncionarioLayout = new javax.swing.GroupLayout(jFuncionario);
        jFuncionario.setLayout(jFuncionarioLayout);
        jFuncionarioLayout.setHorizontalGroup(
            jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(lblIdentidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFuncionarioLayout.createSequentialGroup()
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFuncionarioLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnGuardar))
                    .addGroup(jFuncionarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jFuncionarioLayout.createSequentialGroup()
                                .addComponent(lblSexo)
                                .addGap(12, 12, 12))
                            .addGroup(jFuncionarioLayout.createSequentialGroup()
                                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNacimiento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUniversidad)
                            .addGroup(jFuncionarioLayout.createSequentialGroup()
                                .addComponent(lblUniversidad)
                                .addGap(0, 47, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jFuncionarioLayout.setVerticalGroup(
            jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdentidad)
                    .addComponent(lblNombre)
                    .addComponent(lblApellido)
                    .addComponent(lblEstado)
                    .addComponent(lblSexo)
                    .addComponent(lblDireccion)
                    .addComponent(lblTelefono)
                    .addComponent(lblNacimiento)
                    .addComponent(lblNivel)
                    .addComponent(lblTitulo)
                    .addComponent(lblUniversidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addContainerGap())
        );

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblFuncionarios);

        javax.swing.GroupLayout jPFun1Layout = new javax.swing.GroupLayout(jPFun1);
        jPFun1.setLayout(jPFun1Layout);
        jPFun1Layout.setHorizontalGroup(
            jPFun1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFun1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFun1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPFun1Layout.setVerticalGroup(
            jPFun1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFun1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanes.addTab("Crear Funcionario", jPFun1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Edite los siguientes campos"));

        lblFuncionarios.setText("FUNCIONARIOS");

        lblIdEdit.setText("ID");

        lblIdentidadEdit.setText("IDENTIDAD");

        lblNombreEdit.setText("NOMBRE");

        lblApellidoEdit.setText("APELLIDO");

        lblEstadoEdit.setText("ESTADO");

        lblSexoEdit.setText("SEXO");

        lblDireccionEdit.setText("DIRECCION");

        lblTelefonoEdit.setText("TELEFONO");

        lblNacimientoEdit.setText("NACIMIENTO");

        lblNivelEdit.setText("NIVEL");

        lblTituloEdit.setText("TITULO");

        lblUniversidadEdit.setText("UNIVERSIDAD");

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFuncionarios)
                            .addComponent(cmbFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(lblIdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtIdentidadEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addComponent(lblIdentidadEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombreEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblApellidoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEstadoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(lblEstadoEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSexoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(lblSexoEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDireccionEdit)
                            .addComponent(txtDireccionEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTelefonoEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNacimientoEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNivelEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTituloEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUniversidadEdit))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTelefonoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNacimientoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNivelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTituloEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUniversidadEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(155, 155, 155))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(455, 455, 455))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFuncionarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdEdit)
                    .addComponent(lblIdentidadEdit)
                    .addComponent(lblNombreEdit)
                    .addComponent(lblApellidoEdit)
                    .addComponent(lblEstadoEdit)
                    .addComponent(lblSexoEdit)
                    .addComponent(lblDireccionEdit)
                    .addComponent(lblTelefonoEdit)
                    .addComponent(lblNacimientoEdit)
                    .addComponent(lblNivelEdit)
                    .addComponent(lblTituloEdit)
                    .addComponent(lblUniversidadEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdentidadEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacimientoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNivelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTituloEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUniversidadEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPFun2Layout = new javax.swing.GroupLayout(jPFun2);
        jPFun2.setLayout(jPFun2Layout);
        jPFun2Layout.setHorizontalGroup(
            jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFun2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPFun2Layout.setVerticalGroup(
            jPFun2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFun2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanes.addTab("Editar Funcionario", jPFun2);

        getContentPane().add(jPanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 740, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentidadActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtIdentidad.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el numero de identidad");
            txtIdentidad.requestFocus();
            return;
        }

        if (txtNombre.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el nombre");
            txtNombre.requestFocus();
            return;
        }

        if (txtApellido.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el apellido");
            txtApellido.requestFocus();
            return;
        }

        if (txtEstado.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el estado civil");
            txtEstado.requestFocus();
            return;
        }

        if (txtSexo.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el sexo");
            txtSexo.requestFocus();
            return;
        }

        if (txtDireccion.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la direccion");
            txtDireccion.requestFocus();
            return;
        }

        if (txtTelefono.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el telefono");
            txtTelefono.requestFocus();
            return;
        }

        if (txtNacimiento.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la fecha de nacimiento");
            txtNacimiento.requestFocus();
            return;
        }

        if (txtNivel.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el nivel de estudio");
            txtNivel.requestFocus();
            return;
        }

        if (txtTitulo.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el titulo obtenido");
            txtTitulo.requestFocus();
            return;
        }

        if (txtUniversidad.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la universidad");
            txtUniversidad.requestFocus();
            return;
        }

        try {

            Empleado empleado = new Empleado();
            empleado.setIdentidad(txtIdentidad.getText().trim());
            empleado.setNombre(txtNombre.getText().trim());
            empleado.setApellido(txtApellido.getText().trim());
            empleado.setEstado(txtEstado.getText().trim());
            empleado.setSexo(txtSexo.getText().trim());
            empleado.setDireccion(txtDireccion.getText().trim());
            empleado.setTelefono(txtTelefono.getText().trim());
            empleado.setNacimiento(txtNacimiento.getText().trim());
            empleado.setNivel(txtNivel.getText().trim());
            empleado.setTitulo(txtTitulo.getText().trim());
            empleado.setUniversidad(Integer.parseInt(txtUniversidad.getText().trim()));

            empleadoController.crear(empleado);
            
            txtIdentidad.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtEstado.setText("");
            txtSexo.setText("");
            txtDireccion.setText("");
            txtTelefono.setText("");
            txtNacimiento.setText("");
            txtNivel.setText("");
            txtTitulo.setText("");
            txtUniversidad.setText("");
            
            listEmpleados();
            JOptionPane.showMessageDialog(null, "Empleado creado exitosamente");
            

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
 
        if (txtIdEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un empleado de la lista");
            txtIdEdit.requestFocus();
            return;
        }

        if (txtIdentidadEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el numero de identidad");
            txtIdentidadEdit.requestFocus();
            return;
        }

        if (txtNombreEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el nombre");
            txtNombreEdit.requestFocus();
            return;
        }

        if (txtApellidoEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el apellido");
            txtApellidoEdit.requestFocus();
            return;
        }

        if (txtEstadoEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el estado civil");
            txtEstadoEdit.requestFocus();
            return;
        }

        if (txtSexoEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el sexo");
            txtSexoEdit.requestFocus();
            return;
        }

        if (txtDireccionEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la direccion");
            txtDireccionEdit.requestFocus();
            return;
        }

        if (txtTelefonoEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el telefono");
            txtTelefonoEdit.requestFocus();
            return;
        }

        if (txtNacimientoEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la fecha de nacimiento");
            txtNacimientoEdit.requestFocus();
            return;
        }

        if (txtNivelEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el nivel de estudio");
            txtNivelEdit.requestFocus();
            return;
        }

        if (txtTituloEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el titulo obtenido");
            txtTituloEdit.requestFocus();
            return;
        }

        if (txtUniversidadEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la universidad");
            txtUniversidadEdit.requestFocus();
            return;
        }

        Empleado empleado = new Empleado();
        empleado.setIdentidad(txtIdentidadEdit.getText().trim());
        empleado.setNombre(txtNombreEdit.getText().trim());
        empleado.setApellido(txtApellidoEdit.getText().trim());
        empleado.setEstado(txtEstadoEdit.getText().trim());
        empleado.setSexo(txtSexoEdit.getText().trim());
        empleado.setDireccion(txtDireccionEdit.getText().trim());
        empleado.setTelefono(txtTelefonoEdit.getText().trim());
        empleado.setNacimiento(txtNacimientoEdit.getText().trim());
        empleado.setNivel(txtNivelEdit.getText().trim());
        empleado.setTitulo(txtTituloEdit.getText().trim());
        empleado.setUniversidad(Integer.parseInt(txtUniversidadEdit.getText().trim()));

        int optn = JOptionPane.showConfirmDialog(null, "Desea actualizar el empleado?",
                "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        try {
            
            empleadoController.actualizarEmpleado(Integer.parseInt(txtIdEdit.getText()),empleado);

            txtIdentidad.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtEstado.setText("");
            txtSexo.setText("");
            txtDireccion.setText("");
            txtTelefono.setText("");
            txtNacimiento.setText("");
            txtNivel.setText("");
            txtTitulo.setText("");
            txtUniversidad.setText("");

            listEmpleados();
            JOptionPane.showMessageDialog(null, "Empleado actualizado exitosamente");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (txtIdEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un empleado de la lista");
            txtIdEdit.requestFocus();
            return;
        }

        int optn = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el empleado?",
                "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (optn == 0) {

            try {

                empleadoController.eliminarEmpleado(Integer.parseInt(txtIdEdit.getText()));

                txtIdentidadEdit.setText("");
                txtNombreEdit.setText("");
                txtApellidoEdit.setText("");
                txtEstadoEdit.setText("");
                txtSexoEdit.setText("");
                txtDireccionEdit.setText("");
                txtTelefonoEdit.setText("");
                txtNacimientoEdit.setText("");
                txtNivelEdit.setText("");
                txtTituloEdit.setText("");
                txtUniversidadEdit.setText("");

                listEmpleados();
                JOptionPane.showMessageDialog(null, "Empleado eliminado exitosamente");

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Empleado> cmbFuncionarios;
    private javax.swing.JPanel jFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPFun1;
    private javax.swing.JPanel jPFun2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jPanes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellidoEdit;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccionEdit;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstadoEdit;
    private javax.swing.JLabel lblFuncionarios;
    private javax.swing.JLabel lblIdEdit;
    private javax.swing.JLabel lblIdentidad;
    private javax.swing.JLabel lblIdentidadEdit;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNacimientoEdit;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNivelEdit;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreEdit;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSexoEdit;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefonoEdit;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloEdit;
    private javax.swing.JLabel lblUniversidad;
    private javax.swing.JLabel lblUniversidadEdit;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoEdit;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionEdit;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstadoEdit;
    private javax.swing.JTextField txtIdEdit;
    private javax.swing.JTextField txtIdentidad;
    private javax.swing.JTextField txtIdentidadEdit;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNacimientoEdit;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JTextField txtNivelEdit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEdit;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSexoEdit;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoEdit;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtTituloEdit;
    private javax.swing.JTextField txtUniversidad;
    private javax.swing.JTextField txtUniversidadEdit;
    // End of variables declaration//GEN-END:variables
}
