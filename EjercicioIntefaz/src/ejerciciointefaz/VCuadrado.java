
package ejerciciointefaz;


public class VCuadrado extends javax.swing.JFrame {

    public VCuadrado() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        lblLadoC = new javax.swing.JLabel();
        txtLadoC = new javax.swing.JTextField();
        txtPerimetro = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        lblP = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
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
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        lblLadoC.setText("Lado");
        getContentPane().add(lblLadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));
        getContentPane().add(txtLadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 60, 180, -1));
        getContentPane().add(txtPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 180, -1));
        getContentPane().add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 180, -1));

        lblP.setText("Perimetro");
        getContentPane().add(lblP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lblA.setText("Area");
        getContentPane().add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        lblC.setText("CUADRADO");
        getContentPane().add(lblC, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fx.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        dispose ();
        EjercicioIntefaz.VSeleccion.setVisible(true);
        EjercicioIntefaz.VSeleccion.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        Figura f ;
        double ladoC= Double.parseDouble(txtLadoC.getText());
        f = new Cuadrado (ladoC);
        txtArea.setText(""+f.CalcularArea());
        txtPerimetro.setText(""+f.CalcularPerimetro());
        txtLadoC.setText("");
        
    }//GEN-LAST:event_btnCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblLadoC;
    private javax.swing.JLabel lblP;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtLadoC;
    private javax.swing.JTextField txtPerimetro;
    // End of variables declaration//GEN-END:variables
}
