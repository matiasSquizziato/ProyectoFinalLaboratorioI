/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VistasInternas;

import AccesoADatos.DetallePedidoData;
import AccesoADatos.FacturaData;
import AccesoADatos.PedidoData;
import Entidades.DetallePedido;
import Entidades.Factura;
import Entidades.Pedido;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author matiSqui
 */
public class InternalFactura extends javax.swing.JInternalFrame {

    PedidoData peData = new PedidoData();
    DetallePedidoData deData = new DetallePedidoData();
    
    FacturaData faData = new FacturaData();
    Factura facturaActual = null;
    
    
    /**
     * Creates new form InternalFactura
     */
    public InternalFactura() {
        initComponents();
        cargarJcbPedidos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbRecargo = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        dateC = new com.toedter.calendar.JDateChooser();
        cbPedidos = new javax.swing.JComboBox<>();
        txSubtotal = new javax.swing.JTextField();
        txTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        brVerTotal = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btNuevo = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        labelMozo = new javax.swing.JLabel();

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("id pedido:");

        jLabel2.setText("subtotal:");

        jLabel3.setText("Fecha:");

        jLabel4.setText("Total:");

        cbRecargo.setText("15% más");
        cbRecargo.setActionCommand("");

        jLabel5.setText("Recargo:");

        txSubtotal.setEnabled(false);

        txTotal.setEnabled(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manejoFactura.PNG"))); // NOI18N

        brVerTotal.setText("Ver ");
        brVerTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brVerTotalActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btNuevo.setText("Nuevo");

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        labelMozo.setText("Detalle:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btNuevo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel3)))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txSubtotal, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dateC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMozo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btBuscar)
                                .addGap(475, 475, 475))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel5))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(120, 120, 120)
                                        .addComponent(brVerTotal)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbRecargo)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btGuardar)
                        .addGap(190, 190, 190)
                        .addComponent(btSalir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(475, 475, 475))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btBuscar))
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dateC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(labelMozo)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbRecargo))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brVerTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalir)
                    .addComponent(btGuardar)
                    .addComponent(btNuevo))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed

        try{
            
            Pedido pedidoActual = (Pedido) cbPedidos.getSelectedItem();
            peData.buscarPedidoId(pedidoActual.getIdPedido());
            
            if (pedidoActual != null) {
                
                //llamo al metodo que me trae el importe 
                double  subTotal = 0;
                for (DetallePedido detallePedido : deData.importesPorId(pedidoActual.getIdPedido())) {
                    
                 subTotal += detallePedido.getImporte();
                 //se lo cargo al textField
                 txSubtotal.setText(String.valueOf(subTotal));
                    
                }
                
                //pasamos a la fehca
                LocalDate localDate = pedidoActual.getFechaPedido();
                java.util.Date date = java.util.Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    
                dateC.setDate(date);
                
                labelMozo.setText("Factura expedida por : " +pedidoActual.getMesero().toString());
                
          
                
            }
            
            
            
            
        }catch (NumberFormatException ex){
            
            JOptionPane.showMessageDialog(this, "debe ingresar un elemento valido");
            
        }


    }//GEN-LAST:event_btBuscarActionPerformed

    private void brVerTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brVerTotalActionPerformed
 
        
            Pedido pedidoActual = (Pedido) cbPedidos.getSelectedItem();
            peData.buscarPedidoId(pedidoActual.getIdPedido());
            
            if (pedidoActual != null) {
                
                //llamo al metodo que me trae el importe 
                double  subTotal = 0;
                for (DetallePedido detallePedido : deData.importesPorId(pedidoActual.getIdPedido())) {
                    
                 subTotal += detallePedido.getImporte();
                 //se lo cargo al textField
                 txSubtotal.setText(String.valueOf(subTotal));
                    
                }
                
                //pasamos a la fehca
                LocalDate localDate = pedidoActual.getFechaPedido();
                java.util.Date date = java.util.Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    
                dateC.setDate(date);
                
                labelMozo.setText("Factura expedida por : " +pedidoActual.getMesero().toString());
                
                if (cbRecargo.isSelected()) {
                    
                    double precFinal = 0;
                    double importe = 0;
                    double recargo = 0.15;
                    
                    importe = subTotal * recargo;
                    
                    precFinal = importe + subTotal;
                    
                    txTotal.setText(String.valueOf(precFinal));
                    
                } else{
                    
                    txTotal.setText(String.valueOf(subTotal));
                }
                
            } 
        
        

    }//GEN-LAST:event_brVerTotalActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
try {
    Pedido pedidoActual = (Pedido) cbPedidos.getSelectedItem();
    if (pedidoActual == null) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar un pedido para generar la factura");
        return;
    }

    Date fechaSel = dateC.getDate();
    LocalDate fechaPed = fechaSel.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

     Double totalFinal = Double.parseDouble(txTotal.getText());
    
     System.out.println(totalFinal);
     
    if (totalFinal == null) {
        JOptionPane.showMessageDialog(null, "Debe ingresar el total del pedido.");
        return;
    }

  
    if (facturaActual == null) {
          Factura facturaActual = new Factura(pedidoActual, totalFinal, fechaPed);
        faData.guardarFactura(facturaActual, pedidoActual);
        
        peData.cambiarEstadoPedido(pedidoActual.getIdPedido(), false);
        
        
    }
      
    
        

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Ocurrió un error: " + ex.getMessage());
}

    }//GEN-LAST:event_btGuardarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed

        dispose();
        
    }//GEN-LAST:event_btSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brVerTotal;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Pedido> cbPedidos;
    private javax.swing.JCheckBox cbRecargo;
    private com.toedter.calendar.JDateChooser dateC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelMozo;
    private javax.swing.JTextField txSubtotal;
    private javax.swing.JTextField txTotal;
    // End of variables declaration//GEN-END:variables

    //Cargar jcb pedidos
    
    public void cargarJcbPedidos(){
        
        for (Pedido pedido : peData.listarPedidoAct()) {
            
            cbPedidos.addItem(pedido);
            
        }
        
    }

}
