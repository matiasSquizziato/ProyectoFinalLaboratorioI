/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VistasInternas;

import AccesoADatos.MesaData;
import AccesoADatos.MozoData;
import AccesoADatos.PedidoData;
import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedido;
import LoginMozo.LoginMozo;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matiSqui
 */
public class InternalPedidos2 extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    
    private MesaData meData = new MesaData();
    private PedidoData pedidoData = new PedidoData();
    private MozoData mozoData = new MozoData();
    private Mesero mozoSel = null;
    Pedido pedidoActual = null;

    
    
    /**
     * Creates new form InternalPedidos2
     */
    public InternalPedidos2() {
        initComponents();
        cargarJcbPedido();
        cargarJcbMesa();
        usuarioLog();
        setFecha();
        armarCabecera();
      
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
        jLabel2 = new javax.swing.JLabel();
        cbMesa = new javax.swing.JComboBox<>();
        labelMozo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txIdMozo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        dateC = new com.toedter.calendar.JDateChooser();
        btPedido = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btModificar = new javax.swing.JButton();
        btVer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        brBuscar = new javax.swing.JButton();
        cbPedido = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manejoPedidos.PNG"))); // NOI18N

        jLabel2.setText("Seleccione una mesa:");

        labelMozo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        labelMozo.setText("Usuario:");

        jLabel3.setText("ID Mozo:");

        txIdMozo.setEnabled(false);

        jLabel4.setText("Estado:");

        cbEstado.setText("Pendiente/Pagado");

        jLabel5.setText("Fecha:");

        btPedido.setText("Hacer pedido");
        btPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPedidoActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        jLabel6.setText("Pendientes de:");

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

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btVer.setText("Ver");
        btVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerActionPerformed(evt);
            }
        });

        jLabel7.setText("Id pedido:");

        brBuscar.setText("Buscar");
        brBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btNuevo)
                        .addGap(68, 68, 68)
                        .addComponent(btPedido)
                        .addGap(75, 75, 75)
                        .addComponent(btModificar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txIdMozo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbEstado)
                                .addComponent(dateC, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jLabel7)
                            .addGap(41, 41, 41)
                            .addComponent(cbPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(brBuscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelMozo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btVer)
                        .addGap(105, 105, 105)
                        .addComponent(btSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brBuscar)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txIdMozo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEstado)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNuevo)
                    .addComponent(btPedido)
                    .addComponent(btModificar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMozo)
                    .addComponent(jLabel6))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVer)
                    .addComponent(btSalir))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPedidoActionPerformed
        
        try{
            
        //obtengo la mesa del jcomboBox
        Mesa mesaSel = null;
        mesaSel = (Mesa) cbMesa.getSelectedItem();
        //obtengo el id de la mesa
        int idSelMesa = mesaSel.getIdMesa();
        
      
        Integer idMozoSel = Integer.parseInt(txIdMozo.getText());
        //tengo que buscar el mozo en la db, el metodo devuleve un Mozo
        mozoSel = mozoData.buscarMozoId(idMozoSel);

        boolean estadoSel = cbEstado.isSelected();

        
        Date fechaActual = dateC.getDate();
        //paso de un date a un LocalDate
        LocalDate fechaSel = fechaActual.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        
            if (mesaSel == null) {
                
                JOptionPane.showMessageDialog(this, "Debe seleccionar una mesa");
                return;
            }
        
            if (pedidoActual == null) {
                
                //creo el pedido con sus atributos
                Pedido pedidoActual = new Pedido(mesaSel, mozoSel, estadoSel, fechaSel);
                //lo cargo en la base de datos
                pedidoData.cargarPedido(pedidoActual, mesaSel, mozoSel);
                
                //cambio el estado de la mesa libre a ocupada
                meData.modificarEstado(mesaSel);
                
                //cargo la tabla de pedidos pendies del mozo
                 cargarTabla();
                
            } else {
                
                pedidoActual.setMesa(mesaSel);
                pedidoActual.setMesero(mozoSel);
                pedidoActual.setEstado(estadoSel);
                pedidoActual.setFechaPedido(fechaSel);
                
                pedidoData.modificarPedido(pedidoActual);
                
            }
            
           cargarJcbMesa();
            
    } catch (NumberFormatException ex){
        
        JOptionPane.showMessageDialog(this, "ingrse un elemento valido");
        
    }
        

    }//GEN-LAST:event_btPedidoActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btSalirActionPerformed

    private void btVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerActionPerformed
  cargarTabla();        // TODO add your handling code here:
    }//GEN-LAST:event_btVerActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        
        pedidoActual = null;
        

    }//GEN-LAST:event_btNuevoActionPerformed

    private void brBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brBuscarActionPerformed

        try{
            //tomo el pedido del jcombobox    
            Pedido pedidoSel = (Pedido) cbPedido.getSelectedItem();
            //busco por id 
            pedidoActual = pedidoData.buscarPedidoId(pedidoSel.getIdPedido());
            
            if (pedidoActual != null) {
                //cargo el jcomboBox de mesa
                cbMesa.setSelectedItem(pedidoActual.getMesa());
                
                //cargo un mesero para consultar su id
                Mesero mesero = pedidoActual.getMesero();
                //seteo el id 
                txIdMozo.setText(String.valueOf(mesero.getIdMesero()));

                //modificamos el estado
                cbEstado.setSelected(pedidoActual.isEstado());
                
                LocalDate localDate = pedidoActual.getFechaPedido();
                //convierto el localdate a dae solo
                java.util.Date date = java.util.Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                //y la fecha
                dateC.setDate(date);
            } 
            
            
            
            
        } catch(NumberFormatException ex){
            
            JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UN ID VALIDO");
            
        }
        
        

    }//GEN-LAST:event_brBuscarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed

        

    }//GEN-LAST:event_btModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brBuscar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btPedido;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btVer;
    private javax.swing.JCheckBox cbEstado;
    private javax.swing.JComboBox<Mesa> cbMesa;
    private javax.swing.JComboBox<Pedido> cbPedido;
    private com.toedter.calendar.JDateChooser dateC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelMozo;
    private javax.swing.JTextField txIdMozo;
    // End of variables declaration//GEN-END:variables

//cargo el jcomboBox
    public void cargarJcbMesa(){
    
    for (Mesa mesa : meData.listadoMesasaAll() ) {
        
        cbMesa.addItem(mesa);
        
    }
}

    //cargo el jcomboBox
    public void cargarJcbPedido(){
    
    for (Pedido pedido : pedidoData.listarPedido()) {
        
        cbPedido.addItem(pedido);
        
    }
}
    
//cargo el id del mozo iniciado
    public void usuarioLog(){
    
    Mesero mozo = LoginMozo.getMeseroActual();
     
   txIdMozo.setText(String.valueOf(mozo.getIdMesero()));
   labelMozo.setText(mozo.toString());

}
    
    //set fechaActual
    public void setFecha(){
           LocalDate fechaActual = LocalDate.now();
    Date date = Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant());
    
    dateC.setDate(date);
        
    }
 
    //armar cabecera
    public void armarCabecera(){
        
        modelo.addColumn("id Pedido");
        modelo.addColumn("Mesa");
        modelo.addColumn("idMesa");
        modelo.addColumn("Estado pedido");
        modelo.addColumn("Fecha");
        
        jTable1.setModel(modelo);
        
    }
    
    //cargar la tabla
    public void cargarTabla(){
        Mesero mozo = LoginMozo.getMeseroActual();
        
       
        
        modelo.setRowCount(0);
        
        for (Pedido pedido : pedidoData.listarPedidoId(mozo.getIdMesero())) {
            
            Object [] fila = new Object[5];
            fila [0] = pedido.getIdPedido();
            fila [1] = pedido.getMesa();
            fila [2] = pedido.getMesa().getIdMesa();
            fila [3] = pedido.isEstado();
            fila [4] = pedido.getFechaPedido();
           
            modelo.addRow(fila);
            
        }
        
    }
    
}