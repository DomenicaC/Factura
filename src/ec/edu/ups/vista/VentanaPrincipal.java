/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controladores.ControladorCliente;

/**
 *
 * @author Domenica Cañizares
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorCliente contCliente;
    
    //cotroladores
    
    //VentanaModificarCliente mod = new VentanaModificarCliente(contCliente);//modificar
    
    
    
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        contCliente = new ControladorCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jlbTitulo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        crearMenuItem = new javax.swing.JMenuItem();
        buscarMenuItem = new javax.swing.JMenuItem();
        modificarAsMenuItem = new javax.swing.JMenuItem();
        eliminarMenuItem = new javax.swing.JMenuItem();
        imprimirMenuItem1 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbTitulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jlbTitulo.setText("Factura");
        desktopPane.add(jlbTitulo);
        jlbTitulo.setBounds(130, 20, 160, 40);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cliente");

        crearMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        crearMenuItem.setMnemonic('o');
        crearMenuItem.setText("Crear");
        crearMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(crearMenuItem);

        buscarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        buscarMenuItem.setMnemonic('s');
        buscarMenuItem.setText("Buscar");
        buscarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(buscarMenuItem);

        modificarAsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        modificarAsMenuItem.setMnemonic('a');
        modificarAsMenuItem.setText("Modificar");
        modificarAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(modificarAsMenuItem);

        eliminarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        eliminarMenuItem.setMnemonic('x');
        eliminarMenuItem.setText("Eliminar");
        eliminarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(eliminarMenuItem);

        imprimirMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        imprimirMenuItem1.setText("Imprimir");
        imprimirMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(imprimirMenuItem1);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_eliminarMenuItemActionPerformed

    private void imprimirMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirMenuItem1ActionPerformed

    private void crearMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMenuItemActionPerformed
        VentanaCrearCliente crear = new VentanaCrearCliente(contCliente);//crear
        crear.setVisible(true);
        desktopPane.add(crear);
        jlbTitulo.setVisible(false);
        
    }//GEN-LAST:event_crearMenuItemActionPerformed

    private void modificarAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarAsMenuItemActionPerformed
        
        //mod.setVisible(true);
       // desktopPane.add(mod);
        jlbTitulo.setVisible(false);
        
        
    }//GEN-LAST:event_modificarAsMenuItemActionPerformed

    private void buscarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMenuItemActionPerformed
        VentanaBuscarCliente buscarC = new VentanaBuscarCliente(contCliente);//buscar
        buscarC.setVisible(true);
        desktopPane.add(buscarC);
        jlbTitulo.setVisible(false);
        
    }//GEN-LAST:event_buscarMenuItemActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem buscarMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem crearMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem eliminarMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem imprimirMenuItem1;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem modificarAsMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}
