/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import clases.repositorios.PersonaRepositorio;
import clases.repositorios.TipoAlquilerRepositorio;
import clases.repositorios.TipoViviendaRepositorio;
import clases.repositorios.ViviendaRepositorio;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.ComboItem;
import models.Persona;
import models.TipoAlquiler;
import models.TipoVivienda;
import models.Vivienda;

/**
 *
 * @author j-aco
 */
public class ListaVivienda extends javax.swing.JFrame {
    
    String idSelected;

    /**
     * Creates new form ListaVivienda
     */
    public ListaVivienda() {
        initComponents();
        mostrarVivienda();
        cargarTiposVivienda();
        cargarTipoAlquiler();
        cargarPersonas();
    }
    
    public void cargarTiposVivienda(){
        try{
            TipoViviendaRepositorio tvRepo = new TipoViviendaRepositorio();
            List<TipoVivienda> tipos = tvRepo.List();
            for(TipoVivienda t:tipos){
                comboTipoVivienda.addItem(new ComboItem(t.nombre, Integer.toString(t.id_tipo_vivienda)));
            }
        }
        catch(Exception e){
        
        }
    }
    public void cargarTipoAlquiler(){
        try{
            TipoAlquilerRepositorio taRepo = new TipoAlquilerRepositorio();
            List<TipoAlquiler> tipos = taRepo.List();
            for(TipoAlquiler t:tipos){
                comboTipoAlquiler.addItem(new ComboItem(t.nombre, Integer.toString(t.id_tipo_alquiler)));
            }
        }
        catch(Exception e){
        
        }
    }
    public void cargarPersonas(){
        try{
            PersonaRepositorio pRepo = new PersonaRepositorio();
            List<Persona> personas = pRepo.List();
            for(Persona p:personas){
                comboTipoPersona.addItem(new ComboItem(p.nombres+" "+p.apellido_paterno, Integer.toString(p.id_persona)));
            }
        }
        catch(Exception e){
        }
    }
    public void mostrarVivienda(){
            
        try {
            ViviendaRepositorio viviendaRepo = new ViviendaRepositorio();
            List<Vivienda> vivienda = viviendaRepo.List();
            DefaultTableModel DFT = (DefaultTableModel) tblVivienda.getModel();
            DFT.setRowCount(0);
                for(Vivienda vi:vivienda){
                    Vector v = new Vector();
                    for (int ii = 1; ii <= vivienda.size(); ii++) {
                        v.add(vi.id_vivienda);
                        v.add(vi.ciudad);
                        v.add(vi.distrito);
                        v.add(vi.direccion);
                        v.add(vi.referencia);
                        v.add(vi.tipo_vivienda);
                        v.add(vi.tipo_alquiler);
                        v.add(vi.persona);
                        v.add(vi.estado);
                        v.add(vi.precio);
                        v.add(vi.moneda);
                    }
                DFT.addRow(v);
                }
            } catch (Exception e) {
                System.out.println(e);
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        inputCiudad = new javax.swing.JTextField();
        btnImages = new javax.swing.JButton();
        inputDireccion = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        inputDistrito = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        inputReferencia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        inputEstado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVivienda = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboTipoVivienda = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboTipoAlquiler = new javax.swing.JComboBox<>();
        comboTipoPersona = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        inputPrecio = new javax.swing.JTextField();
        comboTipoMoneda = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Direccion");

        jLabel4.setText("Referencia");

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel5.setText("Estado");

        btnClear.setText("Limpiar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        inputCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCiudadActionPerformed(evt);
            }
        });

        btnImages.setText("Ver imagenes");
        btnImages.setToolTipText("");
        btnImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagesActionPerformed(evt);
            }
        });

        btnUpdate.setText("Actualizar");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("Ciudad");

        inputEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Ocupado" }));
        inputEstado.setSelectedIndex(-1);
        inputEstado.setToolTipText("");
        inputEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEstadoActionPerformed(evt);
            }
        });

        tblVivienda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id vivienda", "Ciudad", "Distrito", "Direccion", "Referencia", "Tipo vivienda", "Tipo contrato", "Propietario", "Estado", "Precio", "Moneda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblVivienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViviendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVivienda);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setText("Vivienda");

        jLabel2.setText("Distrito");

        jLabel6.setText("Tipo vivienda");

        comboTipoVivienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoViviendaActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo alquiler");

        jLabel8.setText("Dueño");

        comboTipoPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoPersonaActionPerformed(evt);
            }
        });

        jLabel10.setText("Precio");

        jLabel11.setText("Moneda");

        inputPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPrecioActionPerformed(evt);
            }
        });

        comboTipoMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soles", "Dolares" }));
        comboTipoMoneda.setSelectedIndex(1);
        comboTipoMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoMonedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(50, 50, 50)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImages)
                        .addGap(50, 50, 50)
                        .addComponent(btnUpdate)
                        .addGap(50, 50, 50)
                        .addComponent(btnDelete))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputReferencia)
                                .addComponent(inputDistrito)
                                .addComponent(inputDireccion)
                                .addComponent(inputCiudad)
                                .addComponent(inputEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboTipoVivienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboTipoAlquiler, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboTipoPersona, 0, 170, Short.MAX_VALUE)
                                .addComponent(inputPrecio)
                                .addComponent(comboTipoMoneda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(50, 50, 50)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboTipoVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(comboTipoAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(comboTipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(inputPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(comboTipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnImages)
                    .addComponent(btnClear)
                    .addComponent(btnSave))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    
        String ciudad = inputCiudad.getText();
        String distrito = inputDistrito.getText();
        String direccion = inputDireccion.getText();
        String referencia = inputReferencia.getText();
        String estado = inputEstado.getSelectedItem().toString();
        Object iTipoVivienda = comboTipoVivienda.getSelectedItem();
        String tipoVivienda = ((ComboItem)iTipoVivienda).getValue();
        Object iTipoAlquiler = comboTipoAlquiler.getSelectedItem();
        String tipoAlquiler = ((ComboItem)iTipoAlquiler).getValue();
        Object iPersona = comboTipoPersona.getSelectedItem();
        String persona = ((ComboItem)iPersona).getValue();
        String precio = inputPrecio.getText();
        String moneda = comboTipoMoneda.getSelectedItem().toString();
      
        inputCiudad.setBackground(Color.WHITE);
        inputDistrito.setBackground(Color.WHITE);
        inputDireccion.setBackground(Color.WHITE);
        inputReferencia.setBackground(Color.WHITE);
        inputPrecio.setBackground(Color.WHITE);
        
        if(ciudad.isEmpty() || distrito.isEmpty() || direccion.isEmpty() || referencia.isEmpty() || precio.isEmpty()){
        
            if(ciudad.isEmpty()){
                inputCiudad.setBackground(new Color(255,153,153));
            }
            if(distrito.isEmpty()){
                inputDistrito.setBackground(new Color(255,153,153));
            }
            if(direccion.isEmpty()){
                inputDireccion.setBackground(new Color(255,153,153));
            }
            if(referencia.isEmpty()){
                inputReferencia.setBackground(new Color(255,153,153));
            }
            if(precio.isEmpty()){
                inputPrecio.setBackground(new Color(255,153,153));
            }
            
        }else{
        
            ViviendaRepositorio viviendaRepo = new ViviendaRepositorio();

            Vivienda viviendaToSave = new Vivienda();
            viviendaToSave.ciudad = ciudad;
            viviendaToSave.distrito = distrito;
            viviendaToSave.direccion = direccion;
            viviendaToSave.referencia = referencia;
            viviendaToSave.estado = estado;
            viviendaToSave.id_tipo_vivienda = Integer.parseInt(tipoVivienda);
            viviendaToSave.id_tipo_alquiler = Integer.parseInt(tipoAlquiler);
            viviendaToSave.id_persona = Integer.parseInt(persona);
            viviendaToSave.precio = precio;
            viviendaToSave.moneda = moneda;

            try {
                viviendaRepo.crearVivienda(viviendaToSave);
                JOptionPane.showMessageDialog(null, "Se guardo exitosamente");
                mostrarVivienda();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo guardar, intentelo de nuevo");
            }
        }
        

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        inputCiudad.setText("");
        inputDistrito.setText("");
        inputDireccion.setText("");
        inputReferencia.setText("");
        inputPrecio.setText("");
        mostrarVivienda();
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagesActionPerformed
        // TODO add your handling code here:
        int row = tblVivienda.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento de la tabla");
        }
        else{
            String value = tblVivienda.getModel().getValueAt(row, 0).toString();
            new ListaViviendaImagenes(value).setVisible(true);
        }
        
    }//GEN-LAST:event_btnImagesActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String ciudad = inputCiudad.getText();
        String distrito = inputDistrito.getText();
        String direccion = inputDireccion.getText();
        String referencia = inputReferencia.getText();
        String estado = inputEstado.getSelectedItem().toString();
        Object iTipoVivienda = comboTipoVivienda.getSelectedItem();
        String tipoVivienda = ((ComboItem)iTipoVivienda).getValue();
        Object iTipoAlquiler = comboTipoAlquiler.getSelectedItem();
        String tipoAlquiler = ((ComboItem)iTipoAlquiler).getValue();
        Object iPersona = comboTipoPersona.getSelectedItem();
        String persona = ((ComboItem)iPersona).getValue();
        String precio = inputPrecio.getText();
        String moneda = comboTipoMoneda.getSelectedItem().toString();
      
        inputCiudad.setBackground(Color.WHITE);
        inputDistrito.setBackground(Color.WHITE);
        inputDireccion.setBackground(Color.WHITE);
        inputReferencia.setBackground(Color.WHITE);
        
        if(ciudad.isEmpty() || distrito.isEmpty() || direccion.isEmpty() || referencia.isEmpty() || precio.isEmpty()){
        
            if(ciudad.isEmpty()){
                inputCiudad.setBackground(new Color(255,153,153));
            }
            if(distrito.isEmpty()){
                inputDistrito.setBackground(new Color(255,153,153));
            }
            if(direccion.isEmpty()){
                inputDireccion.setBackground(new Color(255,153,153));
            }
            if(referencia.isEmpty()){
                inputReferencia.setBackground(new Color(255,153,153));
            }
            if(precio.isEmpty()){
                inputPrecio.setBackground(new Color(255,153,153));
            }
            
        }else{
        
            ViviendaRepositorio viviendaRepo = new ViviendaRepositorio();

            Vivienda viviendaToSave = new Vivienda();
            viviendaToSave.id_vivienda = Integer.parseInt(idSelected);
            viviendaToSave.ciudad = ciudad;
            viviendaToSave.distrito = distrito;
            viviendaToSave.direccion = direccion;
            viviendaToSave.referencia = referencia;
            viviendaToSave.estado = estado;
            viviendaToSave.id_tipo_vivienda = Integer.parseInt(tipoVivienda);
            viviendaToSave.id_tipo_alquiler = Integer.parseInt(tipoAlquiler);
            viviendaToSave.id_persona = Integer.parseInt(persona);
            viviendaToSave.precio = precio;
            viviendaToSave.moneda = moneda;

            try {
                viviendaRepo.actualizarVivienda(viviendaToSave);
                JOptionPane.showMessageDialog(null, "Se actualizo exitosamente");
                mostrarVivienda();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo guardar, intentelo de nuevo");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row = tblVivienda.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento de la tabla para eliminar");
        }
        else{
            try {
                ViviendaRepositorio viviendaRepo = new ViviendaRepositorio();
                boolean delete = viviendaRepo.eliminarVivienda(Integer.parseInt(idSelected));
                if(delete){
                    inputCiudad.setText("");
                    inputDistrito.setText("");
                    inputDireccion.setText("");
                    inputReferencia.setText("");
                    inputPrecio.setText("");
                    idSelected = null;
                    btnUpdate.setEnabled(false);
                    btnSave.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Se elimino exitosamente");
                    mostrarVivienda();
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar, intentelo de nuevo");
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar, intentelo de nuevo");
            }
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void inputEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEstadoActionPerformed

    private void inputCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCiudadActionPerformed

    private void tblViviendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViviendaMouseClicked
        // TODO add your handling code here:
        int row = tblVivienda.getSelectedRow();
        if(row >= 0){
            btnUpdate.setEnabled(true);
            btnSave.setEnabled(false);
            String id = tblVivienda.getModel().getValueAt(row, 0).toString();
            idSelected = id;
            
            ViviendaRepositorio viviendaRepo = new ViviendaRepositorio();
            Vivienda v = viviendaRepo.Get(Integer.parseInt(id)); 
            
            inputCiudad.setText(v.ciudad);
            inputDistrito.setText(v.distrito);
            inputDireccion.setText(v.direccion);
            inputReferencia.setText(v.referencia);
            inputEstado.setSelectedItem(v.estado);
            inputPrecio.setText(v.precio);
            comboTipoMoneda.setSelectedItem(v.moneda);
            comboTipoVivienda.setSelectedItem(v.id_tipo_vivienda);
            comboTipoAlquiler.setSelectedItem(v.id_tipo_alquiler);
            comboTipoPersona.setSelectedItem(v.id_persona);
        }
    }//GEN-LAST:event_tblViviendaMouseClicked

    private void comboTipoPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoPersonaActionPerformed

    private void inputPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPrecioActionPerformed

    private void comboTipoMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoMonedaActionPerformed

    private void comboTipoViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoViviendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoViviendaActionPerformed

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
            java.util.logging.Logger.getLogger(ListaVivienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaVivienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaVivienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaVivienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaVivienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnImages;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<ComboItem> comboTipoAlquiler;
    private javax.swing.JComboBox<String> comboTipoMoneda;
    private javax.swing.JComboBox<ComboItem> comboTipoPersona;
    private javax.swing.JComboBox<ComboItem> comboTipoVivienda;
    private javax.swing.JTextField inputCiudad;
    private javax.swing.JTextField inputDireccion;
    private javax.swing.JTextField inputDistrito;
    private javax.swing.JComboBox<String> inputEstado;
    private javax.swing.JTextField inputPrecio;
    private javax.swing.JTextField inputReferencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVivienda;
    // End of variables declaration//GEN-END:variables
}
