package GUI;

import FileManager.Istream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DescriptionWindow extends javax.swing.JFrame {

    CMS myCMS;
    Istream _istream = Istream.getInstance();
    int _tableIndex;
    int _rowPos;
    public DescriptionWindow() {
        initComponents();
        setUpValues();
    }
    
    void setTableAndRow(int table, int row){
        _tableIndex = table;
        _rowPos = row;
    }
    
    private void setUpValues(){
        DWNameText.setText(_istream.getFloors().get(_tableIndex).getNames().get(_rowPos));
        DWAgeText.setText(_istream.getFloors().get(_tableIndex).getAges().get(_rowPos));
        DWPaymentText.setText(_istream.getFloors().get(_tableIndex).getPaymentOptions().get(_rowPos));
        ArrayList<String> details = _istream.getFloors().get(_tableIndex).getDetails().get(_rowPos);
        DefaultTableModel model = (DefaultTableModel) DetailsTable.getModel();
        for(int i = 0; i < details.size(); ++i){
            String tempStr[] = {details.get(i)};
            model.addRow(tempStr);
        }
        model = (DefaultTableModel) AmenitiesTable.getModel();
        ArrayList<String> amenities = _istream.getFloors().get(_tableIndex).getAmenities().get(_rowPos);
        for(int i = 0; i < details.size(); ++i){
            String tempStr[] = {amenities.get(i)};
            model.addRow(tempStr);
        }
    }
    
    public void setMyCMS(CMS myCMS) {
        this.myCMS = myCMS;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DWImageLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DWNameText = new javax.swing.JTextField();
        DWAgeText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DWPaymentText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AmenitiesTable = new javax.swing.JTable();
        DWEditButton = new javax.swing.JButton();
        DWBackButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DetailsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        DWImageLabel.setText("Image");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Age:");

        DWAgeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DWAgeTextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Payment Options:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("About Condo:");

        AmenitiesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Amenities"
            }
        ));
        jScrollPane1.setViewportView(AmenitiesTable);

        DWEditButton.setText("Edit Description");
        DWEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DWEditButtonActionPerformed(evt);
            }
        });

        DWBackButton.setText("Back");
        DWBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DWBackButtonActionPerformed(evt);
            }
        });

        DetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Details"
            }
        ));
        jScrollPane2.setViewportView(DetailsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(DWEditButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DWBackButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(DWImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(DWPaymentText)
                                        .addGap(119, 119, 119))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addGap(12, 12, 12)
                                        .addComponent(DWNameText)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DWAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(DWNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(DWAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(DWPaymentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(DWImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DWBackButton)
                    .addComponent(DWEditButton))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(628, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DWAgeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DWAgeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DWAgeTextActionPerformed

    private void DWBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DWBackButtonActionPerformed
        this.setVisible(false);
        myCMS.setVisible(true);
    }//GEN-LAST:event_DWBackButtonActionPerformed

    private void DWEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DWEditButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DWEditButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DescriptionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DescriptionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DescriptionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DescriptionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DescriptionWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AmenitiesTable;
    private javax.swing.JTextField DWAgeText;
    private javax.swing.JButton DWBackButton;
    private javax.swing.JButton DWEditButton;
    private javax.swing.JLabel DWImageLabel;
    private javax.swing.JTextField DWNameText;
    private javax.swing.JTextField DWPaymentText;
    private javax.swing.JTable DetailsTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
