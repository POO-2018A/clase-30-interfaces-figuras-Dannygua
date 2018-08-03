
package ejerciciointefaz;


public class VTriangulo extends javax.swing.JFrame {

    public VTriangulo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        lblt = new javax.swing.JLabel();
        lbll1 = new javax.swing.JLabel();
        lbll2 = new javax.swing.JLabel();
        lblb = new javax.swing.JLabel();
        llbla = new javax.swing.JLabel();
        lblp = new javax.swing.JLabel();
        lbla = new javax.swing.JLabel();
        txtLado1 = new javax.swing.JTextField();
        txtLado2 = new javax.swing.JTextField();
        txtBase = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtPerimetro = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setText("Volver a Pantalla de Seleccion");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        lblt.setText("TRIANGULO");
        getContentPane().add(lblt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        lbll1.setText("Lado 1");
        getContentPane().add(lbll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lbll2.setText("Lado 2");
        getContentPane().add(lbll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        lblb.setText("Base");
        getContentPane().add(lblb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        llbla.setText("Altura");
        getContentPane().add(llbla, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        lblp.setText("Perimetro");
        getContentPane().add(lblp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        lbla.setText("Area");
        getContentPane().add(lbla, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        txtLado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLado1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtLado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 190, -1));

        txtLado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLado2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtLado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 190, -1));
        getContentPane().add(txtBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 190, -1));

        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });
        getContentPane().add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 190, -1));
        getContentPane().add(txtPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 190, -1));

        txtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaActionPerformed(evt);
            }
        });
        getContentPane().add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 190, -1));

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fx.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose ();
        EjercicioIntefaz.VSeleccion.setVisible(true);
        EjercicioIntefaz.VSeleccion.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtLado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLado2ActionPerformed

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaActionPerformed

    private void txtLado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLado1ActionPerformed

    }//GEN-LAST:event_txtLado1ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        double lado1,lado2,base,altura;
        Figura ob;
        
        lado1 = Double.parseDouble(txtLado1.getText());
        lado2 = Double.parseDouble(txtLado2.getText());
        base = Double.parseDouble(txtBase.getText());
        altura = Double.parseDouble(txtAltura.getText());
        
        ob = new Triangulo (lado1,lado2,base,altura);
        
        txtPerimetro.setText(""+ob.CalcularPerimetro());
        txtArea.setText(""+ob.CalcularArea());
        txtLado1.setText("");
        txtLado2.setText("");
        txtBase.setText("");
        txtAltura.setText("");
    }//GEN-LAST:event_btnCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lbla;
    private javax.swing.JLabel lblb;
    private javax.swing.JLabel lbll1;
    private javax.swing.JLabel lbll2;
    private javax.swing.JLabel lblp;
    private javax.swing.JLabel lblt;
    private javax.swing.JLabel llbla;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    private javax.swing.JTextField txtPerimetro;
    // End of variables declaration//GEN-END:variables
}
