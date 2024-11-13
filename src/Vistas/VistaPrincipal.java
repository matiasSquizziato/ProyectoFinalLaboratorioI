/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.ProductoData;
import Entidades.Mesero;
import Entidades.Producto;
import LoginMozo.InternalLoginMozo;
import LoginMozo.LoginMozo;
import VistasInternas.InternalAdminMozos;
import VistasInternas.InternalDetallePedido;
import VistasInternas.InternalFactura;
import VistasInternas.InternalMesas;
import VistasInternas.InternalPedidos2;
import VistasInternas.InternalProductos;
import VistasInternas.InternalReservas;
import VistasInternas.InternalTotalFact;
import VistasInternas.ListadoInternalMesas;
import VistasInternas.ListadoInternalMozos;
import VistasInternas.ListadoInternalPedidos;
import VistasInternas.ListadoInternalProductos;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matiSqui
 */
public class VistaPrincipal extends javax.swing.JFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    ProductoData proData = new ProductoData();

    

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        setHoraActual();
        armarCabecera();
        mostrarProductos();
        mensajePrincipal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinField1 = new com.toedter.components.JSpinField();
        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        dateC = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        btActualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        btIniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuFactura = new javax.swing.JMenuItem();
        MenuFacturado = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuPedidos = new javax.swing.JMenuItem();
        MenuDetalles = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuMozos = new javax.swing.JMenuItem();
        MenuListMozos = new javax.swing.JMenuItem();
        MenuListPedidos = new javax.swing.JMenuItem();
        List = new javax.swing.JMenu();
        MenuMesas = new javax.swing.JMenuItem();
        MenuReservas = new javax.swing.JMenuItem();
        MenuListMesas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuProductos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/portada.PNG"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Productos");

        dateC.setEnabled(false);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btActualizar.setText("Actualizar");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Productos que tienen poca cantidad.");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("HOY ES:");

        btIniciar.setText("Abrir");
        btIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Manejo de la sesion.");

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("SE NECESITA REPONER");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(dateC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btActualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btIniciar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jSeparator4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(btIniciar))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(escritorioLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btActualizar))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(btSalir)
                        .addGap(45, 45, 45)))
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateC, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btIniciar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(btActualizar))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btSalir))))
                .addGap(54, 54, 54))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setForeground(new java.awt.Color(91, 40, 70));

        jMenu1.setText("Facturación");

        MenuFactura.setText("Cierre de Mesa");
        MenuFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFacturaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuFactura);

        MenuFacturado.setText("Cierre de caja");
        MenuFacturado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFacturadoActionPerformed(evt);
            }
        });
        jMenu1.add(MenuFacturado);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pedido");

        MenuPedidos.setText("Pedidos");
        MenuPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPedidosActionPerformed(evt);
            }
        });
        jMenu2.add(MenuPedidos);

        MenuDetalles.setText("Modificar pedido");
        MenuDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDetallesActionPerformed(evt);
            }
        });
        jMenu2.add(MenuDetalles);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Mozo");

        MenuMozos.setText("Manejo Mozos");
        MenuMozos.setActionCommand("");
        MenuMozos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMozosActionPerformed(evt);
            }
        });
        jMenu3.add(MenuMozos);

        MenuListMozos.setText("Listado Mozos");
        MenuListMozos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListMozosActionPerformed(evt);
            }
        });
        jMenu3.add(MenuListMozos);

        MenuListPedidos.setText("Listado Pedidos");
        MenuListPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListPedidosActionPerformed(evt);
            }
        });
        jMenu3.add(MenuListPedidos);

        jMenuBar1.add(jMenu3);

        List.setText("Mesas");
        List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListActionPerformed(evt);
            }
        });

        MenuMesas.setText("Mesas");
        MenuMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMesasActionPerformed(evt);
            }
        });
        List.add(MenuMesas);

        MenuReservas.setText("Reservas");
        MenuReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReservasActionPerformed(evt);
            }
        });
        List.add(MenuReservas);

        MenuListMesas.setText("Listado Mesas");
        MenuListMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListMesasActionPerformed(evt);
            }
        });
        List.add(MenuListMesas);

        jMenuBar1.add(List);

        jMenu4.setText("Producto");

        MenuProductos.setText("Productos");
        MenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProductosActionPerformed(evt);
            }
        });
        jMenu4.add(MenuProductos);

        jMenuItem1.setText("Listado Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuListMozosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListMozosActionPerformed

        ListadoInternalMozos listadoMozos = new ListadoInternalMozos();
        escritorio.add(listadoMozos);
        listadoMozos.setVisible(true);


    }//GEN-LAST:event_MenuListMozosActionPerformed

    private void MenuMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMesasActionPerformed

        InternalMesas internalMesas = new InternalMesas();
        escritorio.add(internalMesas);
        internalMesas.setVisible(true);

    }//GEN-LAST:event_MenuMesasActionPerformed

    private void MenuListMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListMesasActionPerformed

        ListadoInternalMesas listadoMesas = new ListadoInternalMesas();
        escritorio.add(listadoMesas);
        listadoMesas.setVisible(true);
        
        
    }//GEN-LAST:event_MenuListMesasActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        
        mostrarProductos();


    }//GEN-LAST:event_btActualizarActionPerformed

    private void btIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarActionPerformed

        InternalLoginMozo internalLogin = new InternalLoginMozo();
        escritorio.add(internalLogin);
        internalLogin.setVisible(true);

    }//GEN-LAST:event_btIniciarActionPerformed

    private void MenuPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPedidosActionPerformed

         Mesero mozo = LoginMozo.getMeseroActual();

         if (mozo == null) {
            
             JOptionPane.showMessageDialog(this,"Debe iniciar sesion primero!");
             return;
        }
         
        InternalPedidos2 internalPedidos2 = new InternalPedidos2();
        escritorio.add(internalPedidos2);
        internalPedidos2.setVisible(true);
        
       
     
        JOptionPane.showMessageDialog(this, "Ingresando como: " + mozo.toString());
        

        
    }//GEN-LAST:event_MenuPedidosActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btSalirActionPerformed

    private void MenuReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReservasActionPerformed

        InternalReservas internalReservas = new InternalReservas();
        escritorio.add(internalReservas);
        internalReservas.setVisible(true);

    }//GEN-LAST:event_MenuReservasActionPerformed

    private void MenuFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFacturaActionPerformed

        InternalFactura internalFactura = new InternalFactura();
        escritorio.add(internalFactura);
        internalFactura.setVisible(true);


    }//GEN-LAST:event_MenuFacturaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        ListadoInternalProductos listadoProdu = new ListadoInternalProductos();
        escritorio.add(listadoProdu);
        listadoProdu.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListActionPerformed

          Mesero mozo = LoginMozo.getMeseroActual();

         if (mozo == null) {
            
             JOptionPane.showMessageDialog(this,"Debe iniciar sesion primero!");
             return;
        }
        
        ListadoInternalPedidos internalPedidosList = new ListadoInternalPedidos();
        escritorio.add(internalPedidosList );
        internalPedidosList.setVisible(true);

    }//GEN-LAST:event_ListActionPerformed

    private void MenuListPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListPedidosActionPerformed

          Mesero mozo = LoginMozo.getMeseroActual();

         if (mozo == null) {
            
             JOptionPane.showMessageDialog(this,"Debe iniciar sesion primero!");
             return;
        }
        
        ListadoInternalPedidos internalPedidosList = new ListadoInternalPedidos();
        escritorio.add(internalPedidosList );
        internalPedidosList.setVisible(true);


        
    }//GEN-LAST:event_MenuListPedidosActionPerformed

    private void MenuFacturadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFacturadoActionPerformed
        InternalTotalFact internalFacturado = new InternalTotalFact();
        escritorio.add(internalFacturado);
        internalFacturado.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuFacturadoActionPerformed

    private void MenuMozosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMozosActionPerformed

        InternalAdminMozos internalMozos = new InternalAdminMozos();
        escritorio.add(internalMozos);
        internalMozos.setVisible(true);

    }//GEN-LAST:event_MenuMozosActionPerformed

    private void MenuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProductosActionPerformed

        InternalProductos internalProductos = new InternalProductos();
        escritorio.add(internalProductos);
        internalProductos.setVisible(true);
    }//GEN-LAST:event_MenuProductosActionPerformed

    private void MenuDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDetallesActionPerformed

        InternalDetallePedido internalDetalle = new InternalDetallePedido();
        escritorio.add(internalDetalle);
        internalDetalle.setVisible(true);

    }//GEN-LAST:event_MenuDetallesActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu List;
    private javax.swing.JMenuItem MenuDetalles;
    private javax.swing.JMenuItem MenuFactura;
    private javax.swing.JMenuItem MenuFacturado;
    private javax.swing.JMenuItem MenuListMesas;
    private javax.swing.JMenuItem MenuListMozos;
    private javax.swing.JMenuItem MenuListPedidos;
    private javax.swing.JMenuItem MenuMesas;
    private javax.swing.JMenuItem MenuMozos;
    private javax.swing.JMenuItem MenuPedidos;
    private javax.swing.JMenuItem MenuProductos;
    private javax.swing.JMenuItem MenuReservas;
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btIniciar;
    private javax.swing.JButton btSalir;
    private com.toedter.calendar.JDateChooser dateC;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

public void setHoraActual(){
        
    LocalDate fechaActual = LocalDate.now();
    Date date = Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant());
    
    dateC.setDate(date);
    
}

public void armarCabecera(){
    
    modelo.addColumn("codigo");
    modelo.addColumn("nombre");
    modelo.addColumn("stock");
    
    jTable1.setModel(modelo);
    
}

public void mostrarProductos(){
    
    
    modelo.setRowCount(0);
    
    for (Producto producto : proData.listarProductosMenores()) {
        
        Object [] fila = new Object[3];
        
        fila[0] = producto.getCodigo();
        fila[1] = producto.getNombre();
        fila[2] = producto.getCantidad();
        
        modelo.addRow(fila);
        
    }
    
}

public void mensajePrincipal(){
    
    JOptionPane.showMessageDialog(this,"DEBE INICIAR SESION PARA PODER SEGUIR (manejo de sesion)");
    
    
}

}
