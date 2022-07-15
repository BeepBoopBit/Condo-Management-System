/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import FileManager.Istream;

/**
 *
 * @author paulm
 */
public class SellCondo extends javax.swing.JFrame {

    CMS _myCMS;
    Istream _istream = Istream.getInstance();
    public SellCondo() {
        initComponents();
    }

    public void setCMS(CMS cms){
        _myCMS = cms;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SCConfirmButton = new javax.swing.JButton();
        SCExitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SCSelectFloorLabel = new javax.swing.JLabel();
        SCEnterUnitLabel = new javax.swing.JLabel();
        SCPriceLabel = new javax.swing.JLabel();
        SCPriceDisplay = new javax.swing.JLabel();
        SCSelectFloorCombo = new javax.swing.JComboBox<>();
        SCEnterUnitText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SCConfirmButton.setText("Confirm");
        SCConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCConfirmButtonActionPerformed(evt);
            }
        });

        SCExitButton.setText("Exit");
        SCExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCExitButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Specify the floor and enter the condo unit to sell:");

        SCSelectFloorLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SCSelectFloorLabel.setText("Select Floor:");

        SCEnterUnitLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SCEnterUnitLabel.setText("Enter Condo Unit:");

        SCPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SCPriceLabel.setText("Price:");

        SCPriceDisplay.setText("500.00");

        SCSelectFloorCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Floor 1", "Floor 2", "Floor 3", "Floor 4", "Floor 5" }));
        SCSelectFloorCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCSelectFloorComboActionPerformed(evt);
            }
        });

        SCEnterUnitText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCEnterUnitTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SCPriceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SCPriceDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SCConfirmButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SCSelectFloorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SCSelectFloorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SCEnterUnitLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SCExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SCEnterUnitText))
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCSelectFloorLabel)
                    .addComponent(SCEnterUnitLabel)
                    .addComponent(SCSelectFloorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SCEnterUnitText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SCPriceLabel)
                        .addComponent(SCPriceDisplay))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SCConfirmButton)
                        .addComponent(SCExitButton)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SCExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCExitButtonActionPerformed
        this.setVisible(false);
        _myCMS.setVisible(true);
    }//GEN-LAST:event_SCExitButtonActionPerformed

    private void SCConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCConfirmButtonActionPerformed
        int tableIndex = SCSelectFloorCombo.getSelectedIndex();
        int rowPos = (Integer.parseInt(SCEnterUnitText.getText()) % 100)-1;
        String[] water = _istream.getFloors().get(tableIndex).getTableData().get(rowPos);
        String[] newData = new String[]{water[0], water[1], water[2], water[3], "SOLD"};
        _istream.getFloors().get(tableIndex).getTableData().set(rowPos, newData);
        _myCMS.setVisible(true);
        this.setVisible(false);
        _myCMS.readDataInTable();
    }//GEN-LAST:event_SCConfirmButtonActionPerformed

    private void SCSelectFloorComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCSelectFloorComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SCSelectFloorComboActionPerformed

    private void SCEnterUnitTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCEnterUnitTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SCEnterUnitTextActionPerformed

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
            java.util.logging.Logger.getLogger(SellCondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellCondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellCondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellCondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellCondo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SCConfirmButton;
    private javax.swing.JLabel SCEnterUnitLabel;
    private javax.swing.JTextField SCEnterUnitText;
    private javax.swing.JButton SCExitButton;
    private javax.swing.JLabel SCPriceDisplay;
    private javax.swing.JLabel SCPriceLabel;
    private javax.swing.JComboBox<String> SCSelectFloorCombo;
    private javax.swing.JLabel SCSelectFloorLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
