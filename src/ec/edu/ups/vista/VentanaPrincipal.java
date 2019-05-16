/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.controladores.ControladorFacDetalle;
import ec.edu.ups.controladores.ControladorFactura;
import ec.edu.ups.controladores.ControladorProducto;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Domenica Cañizares
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorCliente contCliente;
    private ControladorProducto contProd;
    private ControladorFactura contFact;
    private ControladorFacDetalle contFacD;
    private Locale localizacion;
    private ResourceBundle mensajes;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        contCliente = new ControladorCliente();
        contProd = new ControladorProducto();
        contFact = new ControladorFactura();
        contFacD = new ControladorFacDetalle();

        setExtendedState(MAXIMIZED_BOTH);

        System.out.println("Localizacion por defecto: " + Locale.getDefault().getLanguage());

        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        System.out.println("Localizacion Forzada: " + Locale.getDefault().getLanguage());

        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());
        System.out.println("Mensajes");
        System.out.println(mensajes.getString("menu.item.crear"));
        cambiarIdioma();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        jlbTitulo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        clienteMenu = new javax.swing.JMenu();
        crearMenuItem = new javax.swing.JMenuItem();
        buscarMenuItem = new javax.swing.JMenuItem();
        modificarMenuItem = new javax.swing.JMenuItem();
        eliminarMenuItem = new javax.swing.JMenuItem();
        listarMenuItem = new javax.swing.JMenuItem();
        prodMenu = new javax.swing.JMenu();
        crearPMenuItem = new javax.swing.JMenuItem();
        buscarPMenuItem = new javax.swing.JMenuItem();
        modificarPMenuItem = new javax.swing.JMenuItem();
        eliminarPMenuItem = new javax.swing.JMenuItem();
        listarPMenuItem = new javax.swing.JMenuItem();
        FacDeMenu = new javax.swing.JMenu();
        crearFDMenuItem = new javax.swing.JMenuItem();
        buscarFDMenuItem = new javax.swing.JMenuItem();
        modFDMenuItem = new javax.swing.JMenuItem();
        eliFDMenuItemr3 = new javax.swing.JMenuItem();
        listarFDMenuItem = new javax.swing.JMenuItem();
        facMenu = new javax.swing.JMenu();
        crearFMenuItem = new javax.swing.JMenuItem();
        modificarFMenuItem = new javax.swing.JMenuItem();
        buscarFMenuItem = new javax.swing.JMenuItem();
        eliminarFMenuItem = new javax.swing.JMenuItem();
        listarFMenuItem = new javax.swing.JMenuItem();
        idiomaMenu = new javax.swing.JMenu();
        inglesMenuItem = new javax.swing.JMenuItem();
        espMenuItem = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbTitulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jlbTitulo.setText("Factura");
        desktopPane.add(jlbTitulo);
        jlbTitulo.setBounds(130, 20, 160, 40);

        clienteMenu.setMnemonic('f');
        clienteMenu.setText("Cliente");

        crearMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        crearMenuItem.setMnemonic('o');
        crearMenuItem.setText("Crear");
        crearMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(crearMenuItem);

        buscarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        buscarMenuItem.setMnemonic('s');
        buscarMenuItem.setText("Buscar");
        buscarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(buscarMenuItem);

        modificarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        modificarMenuItem.setMnemonic('a');
        modificarMenuItem.setText("Modificar");
        modificarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(modificarMenuItem);

        eliminarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        eliminarMenuItem.setMnemonic('x');
        eliminarMenuItem.setText("Eliminar");
        eliminarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(eliminarMenuItem);

        listarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        listarMenuItem.setText("Listar");
        listarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(listarMenuItem);

        menuBar.add(clienteMenu);

        prodMenu.setMnemonic('e');
        prodMenu.setText("Producto");

        crearPMenuItem.setMnemonic('t');
        crearPMenuItem.setText("Crear ");
        crearPMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPMenuItemActionPerformed(evt);
            }
        });
        prodMenu.add(crearPMenuItem);

        buscarPMenuItem.setMnemonic('y');
        buscarPMenuItem.setText("Buscar ");
        buscarPMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPMenuItemActionPerformed(evt);
            }
        });
        prodMenu.add(buscarPMenuItem);

        modificarPMenuItem.setMnemonic('p');
        modificarPMenuItem.setText("Modificar ");
        modificarPMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPMenuItemActionPerformed(evt);
            }
        });
        prodMenu.add(modificarPMenuItem);

        eliminarPMenuItem.setMnemonic('d');
        eliminarPMenuItem.setText("Eliminar ");
        eliminarPMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPMenuItemActionPerformed(evt);
            }
        });
        prodMenu.add(eliminarPMenuItem);

        listarPMenuItem.setMnemonic('d');
        listarPMenuItem.setText("Listar ");
        listarPMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarPMenuItemActionPerformed(evt);
            }
        });
        prodMenu.add(listarPMenuItem);

        menuBar.add(prodMenu);

        FacDeMenu.setText("Factura Detalle");

        crearFDMenuItem.setText("Crear");
        crearFDMenuItem.setToolTipText("");
        crearFDMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearFDMenuItemActionPerformed(evt);
            }
        });
        FacDeMenu.add(crearFDMenuItem);

        buscarFDMenuItem.setText("Buscar");
        buscarFDMenuItem.setToolTipText("");
        buscarFDMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarFDMenuItemActionPerformed(evt);
            }
        });
        FacDeMenu.add(buscarFDMenuItem);

        modFDMenuItem.setText("Modificar");
        modFDMenuItem.setToolTipText("");
        modFDMenuItem.setActionCommand("Modificar");
        modFDMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modFDMenuItemActionPerformed(evt);
            }
        });
        FacDeMenu.add(modFDMenuItem);

        eliFDMenuItemr3.setText("Eliminar");
        eliFDMenuItemr3.setToolTipText("");
        eliFDMenuItemr3.setActionCommand("Eliminar");
        eliFDMenuItemr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliFDMenuItemr3ActionPerformed(evt);
            }
        });
        FacDeMenu.add(eliFDMenuItemr3);

        listarFDMenuItem.setText("Listar");
        listarFDMenuItem.setToolTipText("");
        listarFDMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarFDMenuItemActionPerformed(evt);
            }
        });
        FacDeMenu.add(listarFDMenuItem);

        menuBar.add(FacDeMenu);

        facMenu.setMnemonic('h');
        facMenu.setText("Factura");

        crearFMenuItem.setMnemonic('t');
        crearFMenuItem.setText("Crear ");
        crearFMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearFMenuItemActionPerformed(evt);
            }
        });
        facMenu.add(crearFMenuItem);

        modificarFMenuItem.setMnemonic('p');
        modificarFMenuItem.setText("Modificar ");
        modificarFMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarFMenuItemActionPerformed(evt);
            }
        });
        facMenu.add(modificarFMenuItem);

        buscarFMenuItem.setMnemonic('y');
        buscarFMenuItem.setText("Buscar ");
        buscarFMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarFMenuItemActionPerformed(evt);
            }
        });
        facMenu.add(buscarFMenuItem);

        eliminarFMenuItem.setMnemonic('d');
        eliminarFMenuItem.setText("Eliminar ");
        eliminarFMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFMenuItemActionPerformed(evt);
            }
        });
        facMenu.add(eliminarFMenuItem);

        listarFMenuItem.setMnemonic('d');
        listarFMenuItem.setText("Listar ");
        listarFMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarFMenuItemActionPerformed(evt);
            }
        });
        facMenu.add(listarFMenuItem);

        menuBar.add(facMenu);

        idiomaMenu.setText("Idioma");

        inglesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        inglesMenuItem.setText("Ingles");
        inglesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inglesMenuItemActionPerformed(evt);
            }
        });
        idiomaMenu.add(inglesMenuItem);

        espMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        espMenuItem.setText("Español");
        espMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espMenuItemActionPerformed(evt);
            }
        });
        idiomaMenu.add(espMenuItem);

        menuBar.add(idiomaMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuItemActionPerformed
        String x = VentanaELiminarCliente.x;
        try {
            if (x == null) {
                VentanaELiminarCliente eliminarC = new VentanaELiminarCliente(contCliente);
                eliminarC.setVisible(true);
                desktopPane.add(eliminarC);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_eliminarMenuItemActionPerformed

    private void listarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarMenuItemActionPerformed
        String x = VentanaListarCliente.x;
        try {
            if (x == null) {
                VentanaListarCliente listar = new VentanaListarCliente(contCliente);//crear
                listar.setVisible(true);
                desktopPane.add(listar);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_listarMenuItemActionPerformed

    private void crearMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMenuItemActionPerformed
        String x = VentanaCrearCliente.x;
        try {
            if (x == null) {
                VentanaCrearCliente crear = new VentanaCrearCliente(contCliente);//crear
                //crear.setVisible(true);
                desktopPane.add(crear);
                desktopPane.moveToFront(crear);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_crearMenuItemActionPerformed

    private void modificarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarMenuItemActionPerformed
        String x = VentanaModificarCliente.x;
        try {
            if (x == null) {
                VentanaModificarCliente mod = new VentanaModificarCliente(contCliente);//crear
                mod.setVisible(true);
                desktopPane.add(mod);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_modificarMenuItemActionPerformed

    private void buscarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMenuItemActionPerformed
        String x = VentanaBuscarCliente.x;
        try {
            if (x == null) {
                VentanaBuscarCliente buscarC = new VentanaBuscarCliente(contCliente);//buscar
                buscarC.setVisible(true);
                desktopPane.add(buscarC);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_buscarMenuItemActionPerformed

    private void crearPMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPMenuItemActionPerformed
        String x = ProductoCrear.x;
        try {
            if (x == null) {
                ProductoCrear crearP = new ProductoCrear(contProd);//crear
                crearP.setVisible(true);
                desktopPane.add(crearP);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_crearPMenuItemActionPerformed

    private void crearFMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearFMenuItemActionPerformed
        String x = CrearFactura.x;
        try {
            if (x == null) {
                CrearFactura crearF = new CrearFactura(contFact, contProd, contCliente);//crear

                desktopPane.add(crearF);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_crearFMenuItemActionPerformed

    private void buscarPMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPMenuItemActionPerformed
        String x = ProductoBuscar.x;
        try {
            if (x == null) {
                ProductoBuscar buscarP = new ProductoBuscar(contProd);//crear

                desktopPane.add(buscarP);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_buscarPMenuItemActionPerformed

    private void modificarPMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPMenuItemActionPerformed
        String x = ProductoModificar.x;
        try {
            if (x == null) {
                ProductoModificar modP = new ProductoModificar(contProd);//crear

                desktopPane.add(modP);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_modificarPMenuItemActionPerformed

    private void eliminarPMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPMenuItemActionPerformed
        String x = ProductoEliminar.x;
        try {
            if (x == null) {
                ProductoEliminar eliminarP = new ProductoEliminar(contProd);//crear

                desktopPane.add(eliminarP);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_eliminarPMenuItemActionPerformed

    private void listarPMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarPMenuItemActionPerformed
        String x = ProductoListar.x;
        try {
            if (x == null) {
                ProductoListar listarP = new ProductoListar(contProd);//crear

                desktopPane.add(listarP);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_listarPMenuItemActionPerformed

    private void modificarFMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarFMenuItemActionPerformed
        String x = ModificarFactura.x;
        try {
            if (x == null) {
                ModificarFactura modF = new ModificarFactura();//modificar

                desktopPane.add(modF);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_modificarFMenuItemActionPerformed

    private void buscarFMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarFMenuItemActionPerformed
        String x = BuscarFactura.x;
        try {
            if (x == null) {
                BuscarFactura buscarF = new BuscarFactura();//buscar

                desktopPane.add(buscarF);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_buscarFMenuItemActionPerformed

    private void eliminarFMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFMenuItemActionPerformed
        String x = EliminarFactura.x;
        try {
            if (x == null) {
                EliminarFactura eliF = new EliminarFactura();//eliminar
                eliF.setVisible(true);
                desktopPane.add(eliF);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_eliminarFMenuItemActionPerformed

    private void listarFMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarFMenuItemActionPerformed
        String x = ListarFactura.x;
        try {
            if (x == null) {
                ListarFactura listarF = new ListarFactura();//eliminar
                listarF.setVisible(true);
                desktopPane.add(listarF);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_listarFMenuItemActionPerformed

    private void inglesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inglesMenuItemActionPerformed
        localizacion = new Locale("en", "US");
        Locale.setDefault(localizacion);
        cambiarIdioma();
        System.out.println("Localizacion Forzada: " + Locale.getDefault().getLanguage());
    }//GEN-LAST:event_inglesMenuItemActionPerformed

    private void espMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espMenuItemActionPerformed
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        cambiarIdioma();
        System.out.println("Localizacion Forzada: " + Locale.getDefault().getLanguage());
    }//GEN-LAST:event_espMenuItemActionPerformed

    private void crearFDMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearFDMenuItemActionPerformed
        String x = ListarFactura.x;
        try {
            if (x == null) {
                FacDetalleCrear crearFD = new FacDetalleCrear(contFacD);//crear

                desktopPane.add(crearFD);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_crearFDMenuItemActionPerformed

    private void buscarFDMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarFDMenuItemActionPerformed
        String x = ListarFactura.x;
        try {
            if (x == null) {
                FacDetalleBuscar buscarFD = new FacDetalleBuscar(contFacD);//crear

                desktopPane.add(buscarFD);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_buscarFDMenuItemActionPerformed

    private void modFDMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modFDMenuItemActionPerformed
        String x = ListarFactura.x;
        try {
            if (x == null) {
                FacDetalleModificar modFD = new FacDetalleModificar(contFacD);//crear

                desktopPane.add(modFD);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_modFDMenuItemActionPerformed

    private void eliFDMenuItemr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliFDMenuItemr3ActionPerformed
        String x = ListarFactura.x;
        try {
            if (x == null) {
                FacDetalleELiminar eliFD = new FacDetalleELiminar(contFacD);//crear

                desktopPane.add(eliFD);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_eliFDMenuItemr3ActionPerformed

    private void listarFDMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarFDMenuItemActionPerformed
        String x = ListarFactura.x;
        try {
            if (x == null) {
                FacDetalleListar listarFD = new FacDetalleListar(contFacD);//crear

                desktopPane.add(listarFD);
                jlbTitulo.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_listarFDMenuItemActionPerformed

    public void cambiarIdioma() {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());

        clienteMenu.setText(mensajes.getString("menu.cliente"));

        crearMenuItem.setText(mensajes.getString("menu.item.crear"));
        buscarMenuItem.setText(mensajes.getString("menu.item.buscar"));
        modificarMenuItem.setText(mensajes.getString("menu.item.modificar"));
        eliminarMenuItem.setText(mensajes.getString("menu.item.eliminar"));
        listarMenuItem.setText(mensajes.getString("menu.item.listar"));

        prodMenu.setText(mensajes.getString("menu.producto"));

        crearPMenuItem.setText(mensajes.getString("menu.item.crear"));
        buscarPMenuItem.setText(mensajes.getString("menu.item.buscar"));
        modificarPMenuItem.setText(mensajes.getString("menu.item.modificar"));
        eliminarPMenuItem.setText(mensajes.getString("menu.item.eliminar"));
        listarPMenuItem.setText(mensajes.getString("menu.item.listar"));

        facMenu.setText(mensajes.getString("menu.factura"));

        crearFMenuItem.setText(mensajes.getString("menu.item.crear"));
        buscarFMenuItem.setText(mensajes.getString("menu.item.buscar"));
        modificarFMenuItem.setText(mensajes.getString("menu.item.modificar"));
        eliminarFMenuItem.setText(mensajes.getString("menu.item.eliminar"));
        listarFMenuItem.setText(mensajes.getString("menu.item.listar"));

        idiomaMenu.setText(mensajes.getString("menu.idioma"));
        inglesMenuItem.setText(mensajes.getString("menu.item.ingles"));
        espMenuItem.setText(mensajes.getString("menu.item.espa"));
        
        //crear cliente
        String x = VentanaCrearCliente.x;
        try {
            if (x != null) {
                
            } 
        } catch (Exception e) {
            e.printStackTrace();
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
    private javax.swing.JMenu FacDeMenu;
    private javax.swing.JMenuItem buscarFDMenuItem;
    private javax.swing.JMenuItem buscarFMenuItem;
    private javax.swing.JMenuItem buscarMenuItem;
    private javax.swing.JMenuItem buscarPMenuItem;
    private javax.swing.JMenu clienteMenu;
    private javax.swing.JMenuItem crearFDMenuItem;
    private javax.swing.JMenuItem crearFMenuItem;
    private javax.swing.JMenuItem crearMenuItem;
    private javax.swing.JMenuItem crearPMenuItem;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem eliFDMenuItemr3;
    private javax.swing.JMenuItem eliminarFMenuItem;
    private javax.swing.JMenuItem eliminarMenuItem;
    private javax.swing.JMenuItem eliminarPMenuItem;
    private javax.swing.JMenuItem espMenuItem;
    private javax.swing.JMenu facMenu;
    private javax.swing.JMenu idiomaMenu;
    private javax.swing.JMenuItem inglesMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JMenuItem listarFDMenuItem;
    private javax.swing.JMenuItem listarFMenuItem;
    private javax.swing.JMenuItem listarMenuItem;
    private javax.swing.JMenuItem listarPMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem modFDMenuItem;
    private javax.swing.JMenuItem modificarFMenuItem;
    private javax.swing.JMenuItem modificarMenuItem;
    private javax.swing.JMenuItem modificarPMenuItem;
    private javax.swing.JMenu prodMenu;
    // End of variables declaration//GEN-END:variables

}
