/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VistasInternas;

/**
 *
 * @author matiSqui
 */
public class InternalAdminMozos extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalAdminMozos
     */
    public InternalAdminMozos() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        getContentPane().setLayout(null);

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 200, 47, 16);

        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 250, 47, 16);

        jLabel3.setText("DNI:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 150, 23, 16);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 200, 141, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 250, 141, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(170, 150, 141, 22);

        jLabel4.setText("Estado:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 300, 38, 16);

        jCheckBox1.setText("Activo/Inactivo");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(170, 300, 104, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manejoPersonal.PNG"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 628, 125);

        btBuscar.setText("Buscar");
        getContentPane().add(btBuscar);
        btBuscar.setBounds(340, 150, 72, 23);

        btModificar.setText("Modificar");
        getContentPane().add(btModificar);
        btModificar.setBounds(40, 380, 90, 23);

        btEliminar.setText("Eliminar");
        getContentPane().add(btEliminar);
        btEliminar.setBounds(290, 380, 75, 23);

        btGuardar.setText("Guardar");
        getContentPane().add(btGuardar);
        btGuardar.setBounds(170, 380, 72, 23);

        btSalir.setText("Salir");
        getContentPane().add(btSalir);
        btSalir.setBounds(410, 380, 75, 23);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 350, 480, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btSalir;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
