public class HelpFrame extends javax.swing.JFrame {
    public HelpFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        q1Label = new javax.swing.JLabel();
        a1Label = new javax.swing.JLabel();
        q2Label = new javax.swing.JLabel();
        a2Label = new javax.swing.JLabel();
        a2sLabel = new javax.swing.JLabel();
        q3Label = new javax.swing.JLabel();
        a3Label = new javax.swing.JLabel();
        q4Label = new javax.swing.JLabel();
        a4Label = new javax.swing.JLabel();
        a4hudaLabel = new javax.swing.JLabel();
        a4heruLabel = new javax.swing.JLabel();
        a4khasinLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help ThermocamX");
        setAlwaysOnTop(true);
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleLabel.setText("FAQ ThermocamX");

        q1Label.setText("Q : How to use ThermocamX?");

        a1Label.setText("A : When you in the Main Window, just click Capture from the Menu Bar.");

        q2Label.setText("Q : What is Fast or Slow Capture?");

        a2Label.setText("A : Fast Capture is uses for time optimization capture but less quality,");

        a2sLabel.setText("  Slow Capture uses for the best quality but need more time.");

        q3Label.setText("Q : Can I contribute to the ThermocamX Project?");

        a3Label.setText("A : Yes, you can. You can go to our development site (see Help Menu).");

        q4Label.setText("Q : Where I can contact the Developer?");

        a4Label.setText("A : You can contact us in our email, see below");

        a4hudaLabel.setText("Huda as Project Leader (fudastriker@gmail.com)");

        a4heruLabel.setText("Heru as UI and Mechanics Designer (h3rucutu@gmail.com)");

        a4khasinLabel.setText("Khasin as Electronics and Circuit Designer (-)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel)
                            .addComponent(q1Label)
                            .addComponent(a1Label)
                            .addComponent(q2Label)
                            .addComponent(a2Label)
                            .addComponent(q3Label)
                            .addComponent(q4Label)
                            .addComponent(a4Label)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(a2sLabel))
                            .addComponent(a3Label))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a4hudaLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a4heruLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a4khasinLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a2sLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q3Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a3Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q4Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a4Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a4hudaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a4heruLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a4khasinLabel)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1Label;
    private javax.swing.JLabel a2Label;
    private javax.swing.JLabel a2sLabel;
    private javax.swing.JLabel a3Label;
    private javax.swing.JLabel a4Label;
    private javax.swing.JLabel a4heruLabel;
    private javax.swing.JLabel a4hudaLabel;
    private javax.swing.JLabel a4khasinLabel;
    private javax.swing.JLabel q1Label;
    private javax.swing.JLabel q2Label;
    private javax.swing.JLabel q3Label;
    private javax.swing.JLabel q4Label;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
