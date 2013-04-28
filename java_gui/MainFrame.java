public class MainFrame extends javax.swing.JFrame {
    public MainFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        statusPanel = new javax.swing.JPanel();
        statusProgressBar = new javax.swing.JProgressBar();
        statusSeparator = new javax.swing.JSeparator();
        statusLabel = new javax.swing.JLabel();
        statusTextLabel = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitItem = new javax.swing.JMenuItem();
        captureMenu = new javax.swing.JMenu();
        normalItem = new javax.swing.JMenuItem();
        fastItem = new javax.swing.JMenuItem();
        slowItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpItem = new javax.swing.JMenuItem();
        aboutItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ThermocamX (alpha 0.0.3)");
        setPreferredSize(new java.awt.Dimension(600, 500));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        statusProgressBar.setValue(75);
        statusProgressBar.setStringPainted(true);

        statusLabel.setText("Status :");

        statusTextLabel.setText("Ready");

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusTextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addComponent(statusProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(statusSeparator)
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusPanelLayout.createSequentialGroup()
                .addComponent(statusSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(statusLabel)
                        .addComponent(statusTextLabel))
                    .addComponent(statusProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        fileMenu.setText("File");

        exitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exitItem.setText("Exit");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitItem);

        Menu.add(fileMenu);

        captureMenu.setText("Capture");

        normalItem.setText("Capture (not available yet)");
        normalItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalItemActionPerformed(evt);
            }
        });
        captureMenu.add(normalItem);

        fastItem.setText("Fast Capture (not available yet)");
        captureMenu.add(fastItem);

        slowItem.setText("Slow Capture (not available yet)");
        captureMenu.add(slowItem);

        Menu.add(captureMenu);

        helpMenu.setText("Help");

        helpItem.setText("Help");
        helpItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpItemActionPerformed(evt);
            }
        });
        helpMenu.add(helpItem);

        aboutItem.setText("About");
        aboutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutItem);

        Menu.add(helpMenu);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(statusPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void aboutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutItemActionPerformed
        AboutFrame about = new AboutFrame();
        about.setLocationRelativeTo(this);
        about.setVisible(true);
    }//GEN-LAST:event_aboutItemActionPerformed

    private void helpItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpItemActionPerformed
        HelpFrame help = new HelpFrame();
        help.setLocationRelativeTo(this);
        help.setVisible(true);
    }//GEN-LAST:event_helpItemActionPerformed

    private void normalItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_normalItemActionPerformed
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem aboutItem;
    private javax.swing.JMenu captureMenu;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenuItem fastItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem helpItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem normalItem;
    private javax.swing.JMenuItem slowItem;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JProgressBar statusProgressBar;
    private javax.swing.JSeparator statusSeparator;
    private javax.swing.JLabel statusTextLabel;
    // End of variables declaration//GEN-END:variables
}
