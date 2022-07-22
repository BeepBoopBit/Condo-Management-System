/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import FileManager.Istream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CM Jinghiro
 */
public class EditDescription extends javax.swing.JFrame {
    
    CMS _myCMS;
    AddDetails _myDetails = new AddDetails();
    AddAmenities _myAmeneties = new AddAmenities();
    Istream _istream = Istream.getInstance();
    private int _tableIndex;
    private int _rowPos;
    public EditDescription() {
        initComponents();
    }

    public void setTableAndRow(int table, int row){
        _tableIndex= table;
        _rowPos = row;
        setUpValues();
    }
    
    private void setUpValues(){
<<<<<<< HEAD
        EDUnitNoText.setText(_istream.getFloors().get(_tableIndex).getNames().get(_rowPos));
        EDCostText.setText(_istream.getFloors().get(_tableIndex).getAges().get(_rowPos));
        EDPaymentText.setText(_istream.getFloors().get(_tableIndex).getPaymentOptions().get(_rowPos));
        ArrayList<String> details = _istream.getFloors().get(_tableIndex).getDetails().get(_rowPos);
        DefaultTableModel model = (DefaultTableModel) DetailsTable.getModel();
        for(int i = 0; i < details.size(); ++i){
            String tempStr[] = {details.get(i)};
            model.addRow(tempStr);
        }
        model = (DefaultTableModel) AmentiesTable.getModel();
        ArrayList<String> amenities = _istream.getFloors().get(_tableIndex).getAmenities().get(_rowPos);
        for(int i = 0; i < details.size(); ++i){
            String tempStr[] = {amenities.get(i)};
            model.addRow(tempStr);
        }
=======
        // To be Implemented
>>>>>>> 38682909964abc81c7af2fcce94894b3632309bd
    }
    
    public void setMyCMS(CMS myCMS) { 
        this._myCMS = myCMS;
    }
    
    public void addDetail(String str){
        DefaultTableModel tempModel = (DefaultTableModel) DetailsTable.getModel();
        String[] myStr = {str};
        tempModel.addRow(myStr);
    }    
    public void addAmeties(String str){
        DefaultTableModel tempModel = (DefaultTableModel) AmentiesTable.getModel();
        String[] myStr = {str};
        tempModel.addRow(myStr);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DWNameText1 = new javax.swing.JTextField();
        EDUnitNoText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AmentiesTable = new javax.swing.JTable();
        EDCostText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        EDDetailButton = new javax.swing.JButton();
        EDAmenityButton = new javax.swing.JButton();
        EDConfirmButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DetailsTable = new javax.swing.JTable();
        EDMODCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Mode of Payment:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Unit No.:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Cost:");

        AmentiesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Amenities"
            }
        ));
        jScrollPane1.setViewportView(AmentiesTable);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Additional Information:");

        EDDetailButton.setText("Add Detail");
        EDDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDDetailButtonActionPerformed(evt);
            }
        });

        EDAmenityButton.setText("Add Amenity");
        EDAmenityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDAmenityButtonActionPerformed(evt);
            }
        });

        EDConfirmButton.setText("Confirm");
        EDConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDConfirmButtonActionPerformed(evt);
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

        EDMODCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full Payment", "Installment" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EDDetailButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EDAmenityButton)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(EDConfirmButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EDUnitNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EDCostText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EDMODCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(EDUnitNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(EDCostText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EDMODCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EDDetailButton)
                        .addComponent(EDAmenityButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(EDConfirmButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(568, 379));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EDDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDDetailButtonActionPerformed
        _myDetails.setVisible(true);
        _myDetails.setDescription(this);
        this.setVisible(false);
    }//GEN-LAST:event_EDDetailButtonActionPerformed

    private void EDAmenityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDAmenityButtonActionPerformed
        _myAmeneties.setVisible(true);
        _myAmeneties.setDescription(this);
        this.setVisible(false);
        DefaultTableModel tempModel = (DefaultTableModel) AmentiesTable.getModel();
        String[] myStr = {_myAmeneties.getData()};
        tempModel.addRow(myStr);
    }//GEN-LAST:event_EDAmenityButtonActionPerformed

    private void EDConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDConfirmButtonActionPerformed
<<<<<<< HEAD
        
        String name = EDUnitNoText.getText();
        String age = EDCostText.getText();
        String payment = EDPaymentText.getText();
       
        // get data
        ArrayList<String> details = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) DetailsTable.getModel();
        while(DetailsTable.getRowCount() != 0){
            System.out.println(DetailsTable.getValueAt(0, 0).toString());
            details.add(DetailsTable.getValueAt(0, 0).toString());
            model.removeRow(0);
        }
        // get data
        ArrayList<String> amenities = new ArrayList<>();
        DefaultTableModel model0 = (DefaultTableModel) AmentiesTable.getModel();
        while(AmentiesTable.getRowCount() != 0){
            System.out.println(AmentiesTable.getValueAt(0, 0).toString());
            amenities.add(AmentiesTable.getValueAt(0, 0).toString());
            model0.removeRow(0);
        }
        
        _istream.getFloors().get(_tableIndex).getNames().set(_rowPos, name);
        _istream.getFloors().get(_tableIndex).getAges().set(_rowPos, age);
        _istream.getFloors().get(_tableIndex).getPaymentOptions().set(_rowPos, payment);
        _istream.getFloors().get(_tableIndex).getDetails().set(_rowPos, details);
        _istream.getFloors().get(_tableIndex).getAmenities().set(_rowPos, amenities);
        
        this.setVisible(false);
        _myCMS.setVisible(true);
        _myCMS.setUpData();
=======
        // File Edited Submit Button
        // TO-Be Imlemented
>>>>>>> 38682909964abc81c7af2fcce94894b3632309bd
    }//GEN-LAST:event_EDConfirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EditDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditDescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AmentiesTable;
    private javax.swing.JTextField DWNameText1;
    private javax.swing.JTable DetailsTable;
    private javax.swing.JButton EDAmenityButton;
    private javax.swing.JButton EDConfirmButton;
    private javax.swing.JTextField EDCostText;
    private javax.swing.JButton EDDetailButton;
    private javax.swing.JComboBox<String> EDMODCombo;
    private javax.swing.JTextField EDUnitNoText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
