/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelesah3;

import javax.swing.JOptionPane;

/**
 *
 * @author monse
 */
public class AgregarU extends javax.swing.JFrame {

    /**
     * Creates new form AgregarU
     */
    public AgregarU() {
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

        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nombreA = new javax.swing.JTextField();
        telefonoA = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        contraseñaA = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        direccionA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        correoA = new javax.swing.JTextField();
        fecha_nacimiento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        apellidoA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(0, 102, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(70, 192, 121));
        jLabel2.setText("Agregar usuario");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(70, 192, 121));
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(70, 192, 121));
        jLabel6.setText("Apellido:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(70, 192, 121));
        jLabel7.setText("Teléfono:");

        jSeparator2.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        nombreA.setBackground(new java.awt.Color(37, 34, 34));
        nombreA.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        nombreA.setForeground(new java.awt.Color(255, 255, 255));
        nombreA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombreA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreAActionPerformed(evt);
            }
        });

        telefonoA.setBackground(new java.awt.Color(37, 34, 34));
        telefonoA.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        telefonoA.setForeground(new java.awt.Color(255, 255, 255));
        telefonoA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        telefonoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoAActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(70, 192, 121));
        jLabel18.setText("Dirección:");

        contraseñaA.setBackground(new java.awt.Color(37, 34, 34));
        contraseñaA.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        contraseñaA.setForeground(new java.awt.Color(255, 255, 255));
        contraseñaA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contraseñaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaAActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(70, 192, 121));
        jLabel16.setText("Fech de nacimiento:");

        direccionA.setBackground(new java.awt.Color(37, 34, 34));
        direccionA.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        direccionA.setForeground(new java.awt.Color(255, 255, 255));
        direccionA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        direccionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionAActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(70, 192, 121));
        jLabel8.setText("Correo:");

        correoA.setBackground(new java.awt.Color(37, 34, 34));
        correoA.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        correoA.setForeground(new java.awt.Color(255, 255, 255));
        correoA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        correoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoAActionPerformed(evt);
            }
        });

        fecha_nacimiento.setBackground(new java.awt.Color(37, 34, 34));
        fecha_nacimiento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        fecha_nacimiento.setForeground(new java.awt.Color(255, 255, 255));
        fecha_nacimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fecha_nacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_nacimientoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(70, 192, 121));
        jLabel17.setText("Contraseña:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(70, 192, 121));
        jLabel9.setText("Estado:");

        jRadioButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 51, 153));
        jRadioButton1.setText("Activo");

        jRadioButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton2.setText("Inctivo");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(70, 192, 121));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        apellidoA.setBackground(new java.awt.Color(37, 34, 34));
        apellidoA.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        apellidoA.setForeground(new java.awt.Color(255, 255, 255));
        apellidoA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        apellidoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(81, 81, 81)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(apellidoA, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(contraseñaA)
                                            .addComponent(fecha_nacimiento))))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(correoA, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                                                .addComponent(direccionA))
                                            .addComponent(telefonoA, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(133, 133, 133)
                                                .addComponent(jRadioButton1)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(480, 480, 480))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel18))
                        .addGap(151, 151, 151))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccionA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(nombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(apellidoA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(correoA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(telefonoA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseñaA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel9)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(79, 79, 79)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreAActionPerformed

    private void telefonoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoAActionPerformed

    private void contraseñaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaAActionPerformed

    private void direccionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionAActionPerformed

    private void correoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoAActionPerformed

    private void fecha_nacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_nacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_nacimientoActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void apellidoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoAActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (nombreA.getText().isEmpty()  || apellidoA.getText().isEmpty()
                || telefonoA.getText ().isEmpty ()   || direccionA.getText ().isEmpty () 
                  || contraseñaA.getText ().isEmpty ()   ||  correoA.getText ().isEmpty () || fecha_nacimiento.getText ().isEmpty () ) {
               
          JOptionPane.showMessageDialog(this, "LLena todos los campos por favor");
        } else {
             JOptionPane.showMessageDialog(this, "Están llenos correctamente");
             guardar ();
        }
        
    }                                           
public  void guardar() {

    Usuario.usuario.add(new Usuario(Integer.parseInt(telefonoA.getText()), nombreA.getText(), apellidoA.getText (),direccionA.getText () , correoA.getText () );

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoA;
    private javax.swing.JTextField contraseñaA;
    private javax.swing.JTextField correoA;
    private javax.swing.JTextField direccionA;
    private javax.swing.JTextField fecha_nacimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nombreA;
    private javax.swing.JTextField telefonoA;
    // End of variables declaration//GEN-END:variables
}
