
package ejerciciointefaz;


public class VentanaSeleccion extends javax.swing.JFrame {

    public VentanaSeleccion() {
        initComponents();
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxSeleccion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuadrado", "Triangulo", "Rectangulo", "Circulo" }));
        boxSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSeleccionActionPerformed(evt);
            }
        });
        getContentPane().add(boxSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setText("Seleccione Una Figura");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fr.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 373, 249));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSeleccionActionPerformed
      
        String op = ""+boxSeleccion.getSelectedItem();
        
        switch (op){
            
            case "Cuadrado":
                dispose ();
                VCuadrado windowC = new VCuadrado ();
                windowC.setVisible(true);
                windowC.setLocationRelativeTo(null);
                break;
            case "Triangulo":
                dispose ();
                VCuadrado windowT = new VCuadrado ();
                windowT.setVisible(true);
                windowT.setLocationRelativeTo(null);
                break;
            case "Rectangulo":
                dispose ();
                VCuadrado windowR = new VCuadrado ();
                windowR.setVisible(true);
                windowR.setLocationRelativeTo(null);
                break;
            case "Circulo":
                dispose ();
                VCuadrado windowCi = new VCuadrado ();
                windowCi.setVisible(true);
                windowCi.setLocationRelativeTo(null);
                break;
                
                
            
        }
        
    }//GEN-LAST:event_boxSeleccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JComboBox<String> boxSeleccion;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
