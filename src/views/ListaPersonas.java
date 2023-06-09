/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import clases.ConexionBD;
import clases.repositorios.PersonaRepositorio;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Persona;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author j-aco
 */
public class ListaPersonas extends javax.swing.JFrame {

    /**
     * Creates new form ListaPersonas
     */
    String idSelected;
    
    public ListaPersonas() {
        initComponents();
        mostrarPersonas();
    }
    
    public void mostrarPersonas(){
            
        try {
            PersonaRepositorio personaRepo = new PersonaRepositorio();
            List<Persona> personas = personaRepo.List();
            DefaultTableModel DFT = (DefaultTableModel) tblPersona.getModel();
            DFT.setRowCount(0);
                for(Persona p:personas){
                    Vector v = new Vector();
                    for (int ii = 1; ii <= personas.size(); ii++) {
                        v.add(p.id_persona);
                        v.add(p.nombres);
                        v.add(p.apellido_paterno);
                        v.add(p.apellido_materno);
                        v.add(p.correo);
                        v.add(p.telefono);
                        v.add(p.tipo_documento);
                        v.add(p.numero_documento);
                        v.add(p.tipo_persona);                    
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersona = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputNombres = new javax.swing.JTextField();
        inputApellidoMaterno = new javax.swing.JTextField();
        inputApellidoPaterno = new javax.swing.JTextField();
        inputCorreo = new javax.swing.JTextField();
        inputTelefono = new javax.swing.JTextField();
        inputNumeroDocumento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        inputTipoPersona = new javax.swing.JComboBox<>();
        inputTipoDocumento = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombres");

        tblPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id persona", "Nombres", "ApellidoPaterno", "ApellidoMaterno", "Correo", "Telefono", "Tipo de documento", "Numero de documento", "Tipo de persona"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersona);

        jLabel2.setText("Apellido paterno");

        jLabel3.setText("Apellido materno");

        jLabel4.setText("Correo");

        jLabel5.setText("Teléfono");

        jLabel6.setText("Tipo de documento");

        jLabel7.setText("Número de documento");

        jLabel8.setText("Tipo de persona");

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setText("Limpiar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnUpdate.setText("Actualizar");
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

        inputTipoPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARRENDADOR", "ARRENDATARIO" }));
        inputTipoPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTipoPersonaActionPerformed(evt);
            }
        });

        inputTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "PASAPORTE", "C.E." }));
        inputTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTipoDocumentoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setText("Personas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(50, 50, 50)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addGap(50, 50, 50)
                        .addComponent(btnDelete))
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(inputCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(inputApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(inputApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(inputNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(inputNumeroDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(inputTipoPersona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTipoDocumento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputNombres)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // boton guardar
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        ConexionBD con = new ConexionBD();
        String nombres = inputNombres.getText();
        String apellidoPaterno = inputApellidoPaterno.getText();
        String apellidoMaterno = inputApellidoMaterno.getText();
        String correo = inputCorreo.getText();
        String telefono = inputTelefono.getText();
        String tipoDocumento = inputTipoDocumento.getSelectedItem().toString();
        String numeroDocumento = inputNumeroDocumento.getText();
        String tipoPersona = inputTipoPersona.getSelectedItem().toString();
        
        inputNombres.setBackground(Color.WHITE);
        inputApellidoPaterno.setBackground(Color.WHITE);
        inputApellidoMaterno.setBackground(Color.WHITE);
        inputCorreo.setBackground(Color.WHITE);
        inputTelefono.setBackground(Color.WHITE);
        inputNumeroDocumento.setBackground(Color.WHITE);
        
        if (nombres.isEmpty() || apellidoPaterno.isEmpty() || apellidoMaterno.isEmpty() || correo.isEmpty() || telefono.isEmpty() || numeroDocumento.isEmpty()){
            
            if(nombres.isEmpty()){
                inputNombres.setBackground(new Color(255,153,153));
            }
            if(apellidoPaterno.isEmpty()){
                inputApellidoPaterno.setBackground(new Color(255,153,153));
            }
            if(apellidoMaterno.isEmpty()){
                inputApellidoMaterno.setBackground(new Color(255,153,153));
            }
            if(correo.isEmpty()){
                inputCorreo.setBackground(new Color(255,153,153));
            }
            if(telefono.isEmpty()){
                inputTelefono.setBackground(new Color(255,153,153));
            }
            if(numeroDocumento.isEmpty()){
                inputNumeroDocumento.setBackground(new Color(255,153,153));
            }
        }else{
            
            PersonaRepositorio personaRepo = new PersonaRepositorio();

            Persona personaToSave = new Persona();
            personaToSave.nombres = nombres;
            personaToSave.apellido_paterno = apellidoPaterno;
            personaToSave.apellido_materno = apellidoMaterno;
            personaToSave.correo = correo;
            personaToSave.telefono = telefono;
            personaToSave.tipo_documento = tipoDocumento;
            personaToSave.numero_documento = numeroDocumento;
            personaToSave.tipo_persona = tipoPersona;

            try {
                personaRepo.crearPersona(personaToSave);
                JOptionPane.showMessageDialog(null, "Se guardo exitosamente");
                mostrarPersonas();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo guardar, intentelo de nuevo");
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        inputNombres.setText("");
        inputApellidoPaterno.setText("");
        inputApellidoMaterno.setText("");
        inputCorreo.setText("");
        inputTelefono.setText("");
        inputTelefono.setText("");
        inputNumeroDocumento.setText("");
        mostrarPersonas();
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String nombres = inputNombres.getText();
        String apellidoPaterno = inputApellidoPaterno.getText();
        String apellidoMaterno = inputApellidoMaterno.getText();
        String correo = inputCorreo.getText();
        String telefono = inputTelefono.getText();
        String tipoDocumento = inputTipoDocumento.getSelectedItem().toString();
        String numeroDocumento = inputNumeroDocumento.getText();
        String tipoPersona = inputTipoPersona.getSelectedItem().toString();
        
        inputNombres.setBackground(Color.WHITE);
        inputApellidoPaterno.setBackground(Color.WHITE);
        inputApellidoMaterno.setBackground(Color.WHITE);
        inputCorreo.setBackground(Color.WHITE);
        inputTelefono.setBackground(Color.WHITE);
        inputNumeroDocumento.setBackground(Color.WHITE);
        
        if (nombres.isEmpty() || apellidoPaterno.isEmpty() || apellidoMaterno.isEmpty() || correo.isEmpty() || telefono.isEmpty() || numeroDocumento.isEmpty()){
            
            if(nombres.isEmpty()){
                inputNombres.setBackground(new Color(255,153,153));
            }
            if(apellidoPaterno.isEmpty()){
                inputApellidoPaterno.setBackground(new Color(255,153,153));
            }
            if(apellidoMaterno.isEmpty()){
                inputApellidoMaterno.setBackground(new Color(255,153,153));
            }
            if(correo.isEmpty()){
                inputCorreo.setBackground(new Color(255,153,153));
            }
            if(telefono.isEmpty()){
                inputTelefono.setBackground(new Color(255,153,153));
            }
            if(numeroDocumento.isEmpty()){
                inputNumeroDocumento.setBackground(new Color(255,153,153));
            }
        }else{
            
            PersonaRepositorio personaRepo = new PersonaRepositorio();

            Persona personaToSave = new Persona();
            personaToSave.id_persona = Integer.parseInt(idSelected);
            personaToSave.nombres = nombres;
            personaToSave.apellido_paterno = apellidoPaterno;
            personaToSave.apellido_materno = apellidoMaterno;
            personaToSave.correo = correo;
            personaToSave.telefono = telefono;
            personaToSave.tipo_documento = tipoDocumento;
            personaToSave.numero_documento = numeroDocumento;
            personaToSave.tipo_persona = tipoPersona;

            try {
                personaRepo.actualizarPersona(personaToSave);
                JOptionPane.showMessageDialog(null, "Se actualizó exitosamente");
                mostrarPersonas();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar, intentelo de nuevo");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row = tblPersona.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento de la tabla para eliminar");
        }
        else{
            try {
                PersonaRepositorio personaRepo = new PersonaRepositorio();
                boolean delete = personaRepo.eliminarPersona(Integer.parseInt(idSelected));
                if(delete){
                    inputNombres.setText("");;
                    inputApellidoPaterno.setText("");;
                    inputApellidoMaterno.setText("");;
                    inputCorreo.setText("");;
                    inputTelefono.setText("");;
                    inputNumeroDocumento.setText("");
                    idSelected = null;
                    btnUpdate.setEnabled(false);
                    btnSave.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Se elimino exitosamente");
                    mostrarPersonas();
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar, intentelo de nuevo");
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar, intentelo de nuevo");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void inputTipoPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTipoPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTipoPersonaActionPerformed

    private void inputTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTipoDocumentoActionPerformed

    private void tblPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonaMouseClicked
        // TODO add your handling code here:
        int row = tblPersona.getSelectedRow();
        if(row >= 0){
            btnUpdate.setEnabled(true);
            btnSave.setEnabled(false);
            String id = tblPersona.getModel().getValueAt(row, 0).toString();
            idSelected = id;
            
            PersonaRepositorio personaRepo = new PersonaRepositorio();
            Persona v = personaRepo.Get(Integer.parseInt(id));
            
            inputNombres.setText(v.nombres);
            inputApellidoPaterno.setText(v.apellido_paterno);
            inputApellidoMaterno.setText(v.apellido_materno);
            inputCorreo.setText(v.correo);
            inputTelefono.setText(v.telefono);
            inputNumeroDocumento.setText(v.numero_documento);
        }
        
    }//GEN-LAST:event_tblPersonaMouseClicked

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
            java.util.logging.Logger.getLogger(ListaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPersonas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField inputApellidoMaterno;
    private javax.swing.JTextField inputApellidoPaterno;
    private javax.swing.JTextField inputCorreo;
    private javax.swing.JTextField inputNombres;
    private javax.swing.JTextField inputNumeroDocumento;
    private javax.swing.JTextField inputTelefono;
    private javax.swing.JComboBox<String> inputTipoDocumento;
    private javax.swing.JComboBox<String> inputTipoPersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersona;
    // End of variables declaration//GEN-END:variables
}