/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VistasInternas;

import AccesoADatos.DetallePedidoData;
import AccesoADatos.FacturaData;
import AccesoADatos.MesaData;
import AccesoADatos.PedidoData;
import Entidades.DetallePedido;
import Entidades.Factura;
import Entidades.Mesa;
import Entidades.Pedido;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author matiSqui
 */
public class InternalFactura extends javax.swing.JInternalFrame {

    PedidoData peData = new PedidoData();
    DetallePedidoData deData = new DetallePedidoData();
    
    FacturaData faData = new FacturaData();
    Factura facturaActual = null;
    
    MesaData meData = new MesaData();
    
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
        jLabel7 = new javax.swing.JLabel();
        txNumDiv = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();

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

        dateC.setEnabled(false);

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

        jLabel7.setText("Dividir la cuenta:");

        jButton1.setText("÷");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Al dividir la cuenta se generan \"x\" facturas identicas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel5))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbRecargo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(brVerTotal))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(txNumDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jButton1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btNuevo)
                        .addGap(163, 163, 163)
                        .addComponent(btGuardar)
                        .addGap(190, 190, 190)
                        .addComponent(btSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMozo)
                                    .addComponent(jLabel3))))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txSubtotal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btBuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
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
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbRecargo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brVerTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txNumDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(38, 38, 38)
                .addComponent(jLabel8)
                .addGap(37, 37, 37)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
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
            
            JOptionPane.showMessageDialog(this, "debe ingresar un pedido");
            setColorComboBox(cbPedidos);
            
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
            restColorComboBox(cbPedidos);
            restColorText(txTotal);
            
    Pedido pedidoActual = (Pedido) cbPedidos.getSelectedItem();
    if (pedidoActual == null) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar un pedido para generar la factura");
        setColorComboBox(cbPedidos);
        return;
    }

    Date fechaSel = dateC.getDate();
    LocalDate fechaPed = fechaSel.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

     Double totalFinal = Double.parseDouble(txTotal.getText());
    
     System.out.println(totalFinal);
     
    if (totalFinal == null) {
        JOptionPane.showMessageDialog(null, "Debe ingresar el total del pedido.");
        setColorText(txTotal);
        return;
    }

  
    if (facturaActual == null) {
          Factura facturaActual = new Factura(pedidoActual, totalFinal, fechaPed);
        faData.guardarFactura(facturaActual, pedidoActual);
        
        peData.cambiarEstadoPedido(pedidoActual.getIdPedido(), false);
        deData.modificarEstado(pedidoActual.getIdPedido(), false);
        
        
    }
      
    Mesa mesaActual = pedidoActual.getMesa();
    
        meData.modificarEstado(mesaActual, true);
        

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Debe ingresar un pedido: ");
    setColorComboBox(cbPedidos);
}

    }//GEN-LAST:event_btGuardarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed

        dispose();
        
    }//GEN-LAST:event_btSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
    Pedido pedidoActual = (Pedido) cbPedidos.getSelectedItem();
    Date fechaSel = dateC.getDate();
    LocalDate fechaPed = fechaSel.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    restColorComboBox(cbPedidos);
    try {
        Integer valDiv = Integer.parseInt(txNumDiv.getText());
        Double totalFinal = Double.parseDouble(txTotal.getText());
        
        System.out.println(totalFinal);
        
        // Validar que valDiv no sea cero para evitar división por cero
        if (valDiv != null && totalFinal != null && valDiv != 0) {
            double totalpf = (double) totalFinal / valDiv;
            
            Factura facturaActual = new Factura(pedidoActual, totalpf, fechaPed);
       
            
           int respuesta = JOptionPane.showConfirmDialog(this, "Total para cada factura: " + totalpf, "Confirmación", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
             faData.guardarFactura(facturaActual, pedidoActual);
             } 
    
            } 
        
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Debe ingresar un pedido: " + ex.getMessage());
        setColorComboBox(cbPedidos);
    }
        


// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brVerTotal;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Pedido> cbPedidos;
    private javax.swing.JCheckBox cbRecargo;
    private com.toedter.calendar.JDateChooser dateC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelMozo;
    private javax.swing.JTextField txNumDiv;
    private javax.swing.JTextField txSubtotal;
    private javax.swing.JTextField txTotal;
    // End of variables declaration//GEN-END:variables

    //Cargar jcb pedidos
    
    public void cargarJcbPedidos(){
        
        for (Pedido pedido : peData.listarPedidoAct()) {
            
            cbPedidos.addItem(pedido);
            
        }
        
    }

    //metodos para cambiar los border
    public void setColorText(JTextField textField){

        textField.setBorder(BorderFactory.createLineBorder(Color.RED,1));

    }

    //volver al originar
    public void  restColorText(JTextField textField) {

        textField.setBorder(UIManager.getBorder("TextField.border"));
    }
  
     // Método para cambiar el borde de un JComboBox a color rojo
    public static void setColorComboBox(JComboBox<?> comboBox) {
        comboBox.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
    }

    // Método para restablecer el borde original de un JComboBox
    public static void restColorComboBox(JComboBox<?> comboBox) {
        comboBox.setBorder(UIManager.getBorder("ComboBox.border"));
    }
}

