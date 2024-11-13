/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VistasInternas;


import AccesoADatos.MesaData;
import AccesoADatos.ReservaData;
import Entidades.Mesa;
import Entidades.Reserva;
import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.UIManager;
//link para usar el jspinner como set hora
//https://www.youtube.com/watch?v=Uh77miF-YMY


/**
 *
 * @author matiSqui
 */
public class InternalReservas extends javax.swing.JInternalFrame {

    ReservaData reData = new ReservaData();
    Reserva reservaActual = null;
    
    MesaData meData = new MesaData();
    
    /**
     * Creates new form InternalReservas
     */
    public InternalReservas() {
        initComponents();
        cargarJcbReserva();
        cargarJcbMesas();
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
        btBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbMesa = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txReservaName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txDniReserva = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dateC = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        jSpinner1 = new javax.swing.JSpinner(sm);
        cbReserva = new javax.swing.JComboBox<>();
        labelResultado = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manejoReservas.PNG"))); // NOI18N

        jLabel2.setText("Id: ");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Mesa: ");

        jLabel4.setText("Reserva a nombre de:");

        jLabel5.setText("DNI:");

        jLabel6.setText("Fecha:");

        jLabel7.setText("Hora:");

        jLabel8.setText("Estado:");

        cbEstado.setText("Activo/Inactivo");

        JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinner1, "HH:mm:ss");
        jSpinner1.setEditor(de);

        labelResultado.setText("Resultado:");

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel2)
                .addGap(85, 85, 85)
                .addComponent(cbReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btBuscar)
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(dateC, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel7)
                                .addGap(45, 45, 45)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(60, 60, 60))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(63, 63, 63)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbEstado)
                                    .addComponent(txDniReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txReservaName, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(cbMesa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(labelResultado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btNuevo)
                        .addGap(124, 124, 124)
                        .addComponent(btGuardar)
                        .addGap(112, 112, 112)
                        .addComponent(btSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btBuscar)
                    .addComponent(cbReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(labelResultado)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txReservaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txDniReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dateC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbEstado))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btNuevo)
                    .addComponent(btSalir))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed


        try{
            
            //tomo la reserva
           Reserva reservaSel = (Reserva) cbReserva.getSelectedItem();


           int idRe = reservaSel.getIdReserva();
            //busco su id
           reservaActual = reData.buscaReserva(idRe);
           
            if (reservaActual != null) {
                
                //no logro cargar el jcombo con el resultado de la busqueda
                cbMesa.setSelectedItem(reservaActual.getMesa());

                txReservaName.setText(reservaActual.getNombreCliente());
                txDniReserva.setText(String.valueOf(reservaActual.getDniCliente()));
                
                LocalDate localDate = reservaActual.getFechaReserva();
                java.util.Date date = java.util.Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                
                dateC.setDate(date);
                
            LocalTime setTime = reservaActual.getHoraReserva();
            
            Date date1 = Date.from(setTime.atDate(LocalDate.now()).atZone(ZoneId.systemDefault()).toInstant());
            jSpinner1.setValue(date1);

            labelResultado.setText("Resultado: " + reservaActual.toString());
                
            }
            
            
        } catch (NumberFormatException ex){
            
            JOptionPane.showMessageDialog(this,"DEBE SELECCIONAR UN ID VALIDO" + ex.getMessage());
            
        }
        
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btSalirActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed

        try{
           
            Mesa mesaSel = (Mesa) cbMesa.getSelectedItem();
            
            String clienteSel = txReservaName.getText();
            Integer dniSel = Integer.parseInt(txDniReserva.getText());
            
            Date fechaSel = dateC.getDate();
            LocalDate fechaSend = fechaSel.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            Date date = (Date) jSpinner1.getValue();
            LocalDate dateSel = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalTime timeSel = date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();

            boolean estadoSel = cbEstado.isSelected();
            
            if (mesaSel == null) {
                
                JOptionPane.showMessageDialog(this, "Debe seleccionar una mesa");
                return;
            }
            
            if (reservaActual == null) {
                
            Reserva reservaActual = new Reserva(mesaSel, clienteSel,dniSel,fechaSend,timeSel, estadoSel);
            
            reData.hacerReserva(reservaActual, mesaSel.getIdMesa());
            
            
            } else {
                
                reservaActual.setMesa(mesaSel);
                reservaActual.setNombreCliente(clienteSel);
                reservaActual.setDniCliente(dniSel);
                reservaActual.setFechaReserva(fechaSend);
                reservaActual.setHoraReserva(timeSel);
                reservaActual.setEstado(estadoSel);
                
                reData.modificarReserva(reservaActual, mesaSel, mesaSel.getIdMesa());
                
            }
            
        } catch (NumberFormatException ex){
            
            JOptionPane.showMessageDialog(this,"TIPO DE DATO INCORRECTO" + ex.getMessage());
            
        }

        
        
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        
        reservaActual = null;
        txReservaName.setText("");
        txDniReserva.setText("");
        setHoraActual();
       

            
        
    }//GEN-LAST:event_btNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSalir;
    private javax.swing.JCheckBox cbEstado;
    private javax.swing.JComboBox<Mesa> cbMesa;
    private javax.swing.JComboBox<Reserva> cbReserva;
    private com.toedter.calendar.JDateChooser dateC;
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
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JTextField txDniReserva;
    private javax.swing.JTextField txReservaName;
    // End of variables declaration//GEN-END:variables

//Cargo jcb de reservas
    public void cargarJcbReserva(){
        
        for (Reserva reserva : reData.listadoReservas()) {
             
            cbReserva.addItem(reserva);
       
        }
 
    }

//cargo el jcb de mesas
    public void cargarJcbMesas(){
         for (Mesa mesa : meData.listadoMesasaAll()) {
            
             cbMesa.addItem(mesa);
             
        }
        
        
    }
    
    //hora actual
    public void setHoraActual(){
        
    LocalDate fechaActual = LocalDate.now();
    Date date = Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant());
    
    dateC.setDate(date);
    
}
    //metodos para cambiar los border
    public void setColorText(JTextField textField){

        textField.setBorder(BorderFactory.createLineBorder(Color.RED,1));

    }

    //volver al originar
    public void  restColorText(JTextField textField) {

        textField.setBorder(UIManager.getBorder("TextField.border"));
    }
    
    
}
