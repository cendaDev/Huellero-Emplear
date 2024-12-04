/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Controlador;
import Modelo.Funcionario;
import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author cardo
 */
public class Anotacion extends javax.swing.JFrame {

    private static LocalDate fecha;
    private static LocalTime horaComparacion;
    private static Funcionario funcionario;
    private static String motivo;

    Controlador controlador;

    public Anotacion(String motivo, Funcionario funcionario, LocalTime horaComparacion, LocalDate fecha) {
        initComponents();
        setLocationRelativeTo(this);
        this.funcionario = funcionario;
        this.motivo = motivo;
        this.horaComparacion = horaComparacion;
        this.fecha = fecha;
        controlador = new Controlador();
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
        TextAnotacion = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnEnviarAnotacion = new javax.swing.JButton();
        cboAnotaciones = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Anotación");

        TextAnotacion.setColumns(20);
        TextAnotacion.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        TextAnotacion.setRows(5);
        jScrollPane1.setViewportView(TextAnotacion);

        jButton1.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEnviarAnotacion.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        btnEnviarAnotacion.setText("Enviar anotación");
        btnEnviarAnotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarAnotacionActionPerformed(evt);
            }
        });

        cboAnotaciones.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cboAnotaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tesorero ", "Revisor fiscal pista", "Llegué más temprano", "Mucho tráfico / trancón", "Personal nuevo ", "Entrega de turno", "Permiso del Doctor", "Diligencias personales autorizadas", "Cierre de caja", "Calibraciones ", "Mantenimiento", "Entrega de aplicaciones / software", "Cubriendo turno", "Llegaron clientes", "Olvidé registrar entrada / salida", "Fallas con mi vehículo (carro / moto)", "Problemas con el transporte público", "Estaba en capacitación", "Auditoría" }));
        cboAnotaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAnotacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnEnviarAnotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cboAnotaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(cboAnotaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnEnviarAnotacion))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Control.labelBienvenido.setForeground(Color.red);

        if (motivo.equalsIgnoreCase("Entrada no marcada")) {
            Control.labelBienvenido.setText("Último ingreso fallido por falta de anotación");
        }

        if (motivo.equalsIgnoreCase("Salida no marcada")) {
            Control.labelBienvenido.setText("Última salida fallida por falta de anotación");
        }

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEnviarAnotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarAnotacionActionPerformed

        String anotacion = TextAnotacion.getText();

        // Verificar que anotacion tenga más de 1 palabra
        if (validarCadena(anotacion)) {

            if (controlador.registrarAnotacion(funcionario.getDocumento(), anotacion, funcionario.getNombre(), motivo, fecha, horaComparacion)) {

                if (motivo.equalsIgnoreCase("Entrada no marcada")) {
                    controlador.guardarRegistro(funcionario, horaComparacion, fecha);
                    controlador.reproducirSonidoEntrada();
                    Control.labelBienvenido.setForeground(Color.black);
                    Control.labelBienvenido.setText("Último ingreso registrado");
                    controlador.actualizarRegistroEntrada();
                }

                if (motivo.equalsIgnoreCase("Salida no marcada")) {
                    controlador.actualizarRegistroConHoraSalida(funcionario, horaComparacion, fecha);
                    controlador.reproducirSonidoSalida();
                    Control.labelBienvenido.setForeground(Color.black);
                    Control.labelBienvenido.setText("Última salida registrada");
                    controlador.actualizarRegistroEntrada();
                }

                this.dispose();
            } else {
                controlador.editarLabelsSegundos(Control.labelBienvenido, "Error de conexión");
                Control.labelBienvenido.setForeground(Color.red);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes escribir solo puntos o signos especiales, mínimo 2 palabras");

        }

    }//GEN-LAST:event_btnEnviarAnotacionActionPerformed
    private static boolean validarCadena(String cadena) {
        // Expresión regular para permitir al menos 2 palabras que pueden contener cualquier carácter especial
        String regex = "^(?!(^[.,\\s]+$))(.*[.,\\s\\p{L}\\p{N}/].*){2,}$";

        // Compilar la expresión regular
        Pattern pattern = Pattern.compile(regex);

        // Crear un matcher con la cadena de texto
        Matcher matcher = pattern.matcher(cadena);

        // Devolver true si la cadena cumple con la validación, false de lo contrario
        return matcher.matches();
    }


    private void cboAnotacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAnotacionesActionPerformed
        // Obtener el elemento seleccionado del JComboBox
        String anotacionSeleccionada = (String) cboAnotaciones.getSelectedItem();

        // Asignar la anotación seleccionada al JTextArea
        TextAnotacion.setText(anotacionSeleccionada);
    }//GEN-LAST:event_cboAnotacionesActionPerformed

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
            java.util.logging.Logger.getLogger(Anotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anotacion(motivo, funcionario, horaComparacion, fecha).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextAnotacion;
    private javax.swing.JButton btnEnviarAnotacion;
    private javax.swing.JComboBox<String> cboAnotaciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}