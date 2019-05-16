/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.Modelo.Cliente;
import ec.edu.ups.controladores.ControladorCliente;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Domenica Cañizares
 */
public class VentanaCrearCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaCrear
     */
    
    public static String x;
    
    private ControladorCliente contCliente;

    public VentanaCrearCliente(ControladorCliente contCliente) {
        initComponents();
        x="x";
        
        this.contCliente = contCliente;
        txtCod.setText(String.valueOf(this.contCliente.getCodigo()));
        
        //centrar ventana
        int a = VentanaPrincipal.desktopPane.getWidth()-this.getWidth();
        int b = VentanaPrincipal.desktopPane.getHeight()-this.getHeight();
        
        setLocation(a/2, b/2);
        
        setVisible(true);
        
    }
//const
   
/*
    private VentanaCrearCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodC = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblNomC = new javax.swing.JLabel();
        txtCed = new javax.swing.JTextField();
        lblCedC = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        lblDirC = new javax.swing.JLabel();
        txtTelf = new javax.swing.JTextField();
        lblTelC = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodC.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblCodC.setText("Codigo");
        getContentPane().add(lblCodC, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 61, -1, -1));

        txtCod.setEditable(false);
        txtCod.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtCod.setEnabled(false);
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 140, -1));

        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 140, -1));

        lblNomC.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblNomC.setText("Nombre");
        getContentPane().add(lblNomC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        txtCed.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txtCed, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 140, -1));

        lblCedC.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblCedC.setText("Cedula");
        getContentPane().add(lblCedC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        txtDir.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 140, -1));

        lblDirC.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblDirC.setText("Direccion");
        getContentPane().add(lblDirC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        txtTelf.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txtTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 140, -1));

        lblTelC.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTelC.setText("Telefono");
        getContentPane().add(lblTelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("Nuevo Cliente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        btnCrear.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        Cliente cliente = new Cliente();
        System.out.println(cliente.getCodigo());
        cliente.setCodigo(Integer.parseInt(txtCod.getText()));
        cliente.setNombre(txtNombre.getText());
        cliente.setCedula(txtCed.getText());
        cliente.setDirecion(txtDir.getText());
        cliente.setTelefono(txtTelf.getText());
        contCliente.create(cliente);
        JOptionPane.showMessageDialog(this, "Cliente creado correctamente", "Crear Cliente", JOptionPane.OK_OPTION);

        //volver a establecer codigo
        //limpiar cajas de texto
        txtCod.setText(String.valueOf(this.contCliente.getCodigo()));
        txtNombre.setText("");
        txtCed.setText("");
        txtDir.setText("");
        txtTelf.setText("");


    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        x=null;
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblCedC;
    private javax.swing.JLabel lblCodC;
    private javax.swing.JLabel lblDirC;
    private javax.swing.JLabel lblNomC;
    private javax.swing.JLabel lblTelC;
    private javax.swing.JTextField txtCed;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelf;
    // End of variables declaration//GEN-END:variables
}
