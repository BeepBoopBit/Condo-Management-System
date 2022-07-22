/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import CMSClass.Condo;
import FileManager.Istream;
import FileManager.Ostream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EditDescription extends javax.swing.JFrame {
    
    CMS _myCMS = null;
    DescriptionWindow _MyDescription = null;
    Istream _istream = Istream.getInstance();
    Ostream _ostream = Ostream.getInstance();
    private int _tableIndex;
    private int _rowPos;
    Condo _MyCondo = Condo.get_instance();
    
    ArrayList<String> newDetails = new ArrayList<>();
    ArrayList<String> newAmenities  = new ArrayList<>();
    
    public EditDescription() {
        initComponents();
    }
    
    public EditDescription(int tableIndex, int rowPos) {
        initComponents();
        _tableIndex = tableIndex;
        _rowPos = rowPos;
        setUpValues();
    }

    public void pushNewDetails(String data){
        newDetails.add(data);
        addDetail(data);
    }
    public void addDetail(String str){
        DefaultTableModel tempModel = (DefaultTableModel) DetailsTable.getModel();
        String[] myStr = {str};
        tempModel.addRow(myStr);
    }   
    public void removeDetails(int row){
        DefaultTableModel tempModel = (DefaultTableModel) DetailsTable.getModel();
        tempModel.removeRow(row);
        newDetails.remove(row);
    }
    
    public void pushNewAmenities(String data){
        newDetails.add(data);
        addAmeties(data);
    }
    public void addAmeties(String str){
        DefaultTableModel tempModel = (DefaultTableModel) AmentiesTable.getModel();
        String[] myStr = {str};
        tempModel.addRow(myStr);
    }
    public void removeAmenities(int row){
        DefaultTableModel tempModel = (DefaultTableModel) AmentiesTable.getModel();
        tempModel.removeRow(row);
        newAmenities.remove(row);
    }
    
    private void setUpValues(){
        EDCostText.setText(_MyCondo.getFloor(_tableIndex).getCost().get(_rowPos));
        EDUnitNoText.setText(_MyCondo.getFloor(_tableIndex).getUnitNo().get(_rowPos));
        
        DefaultTableModel detailModel = (DefaultTableModel) DetailsTable.getModel();
        ArrayList<ArrayList<String>> tempData = _MyCondo.getFloor(_tableIndex).getDetails();
        for(int j = 0; j < tempData.get(_rowPos).size(); ++j){
            String TempDataValue = tempData.get(_rowPos).get(j);
            detailModel.addRow(new String[]{TempDataValue});
            newDetails.add(TempDataValue);
        }
        
        DefaultTableModel amenitiesModel = (DefaultTableModel) AmentiesTable.getModel();
        tempData = _MyCondo.getFloor(_tableIndex).getAmenities();
        for(int j = 0; j < tempData.get(_tableIndex).size(); ++j){
            String TempDataValue = tempData.get(_rowPos).get(j);
            amenitiesModel.addRow(new String[]{TempDataValue});
            newAmenities.add(TempDataValue);
        }
    }
    
    public void setMyCMS(CMS myCMS) { 
        this._myCMS = myCMS;
    }
    
    public void setDescriptionWindow(DescriptionWindow window){
        _MyDescription = window;
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
        EDBackButton = new javax.swing.JButton();

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

        EDDetailButton.setText("Edit Detail");
        EDDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDDetailButtonActionPerformed(evt);
            }
        });

        EDAmenityButton.setText("Edit Amenity");
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

        EDMODCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Full Payment", "Installment" }));

        EDBackButton.setText("Back");
        EDBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDBackButtonActionPerformed(evt);
            }
        });

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
                                .addComponent(EDConfirmButton)
                                .addGap(24, 24, 24)
                                .addComponent(EDBackButton))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EDConfirmButton)
                    .addComponent(EDBackButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(568, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EDDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDDetailButtonActionPerformed
        EditDetails newEditDetail = new EditDetails();
        newEditDetail.setDescriptionWindow(this); 
        newEditDetail.setUpValues(newDetails);
        newEditDetail.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EDDetailButtonActionPerformed

    private void EDAmenityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDAmenityButtonActionPerformed
        EditAmenities newEditAmenities = new EditAmenities(); 
        newEditAmenities.setDescriptionWindow(this);
        newEditAmenities.setUpValues(newAmenities);
        newEditAmenities.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EDAmenityButtonActionPerformed

    private void EDConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDConfirmButtonActionPerformed
        String unitText = EDUnitNoText.getText();
        String costText = EDCostText.getText();
        String modeOfPayment = EDMODCombo.getSelectedIndex() == 0 ? "N/A" : EDMODCombo.getSelectedIndex() == 1 ? "Full Payment" : "Installment";
        _MyCondo.replaceUnitNo(_tableIndex, _rowPos, unitText);
        _MyCondo.replaceCost(_tableIndex, _rowPos, costText);
        _MyCondo.replaceModeOfPayment(_tableIndex, _rowPos, modeOfPayment);
        _MyCondo.replaceDetails(_tableIndex, _rowPos, newDetails);
        _MyCondo.replaceAmenities(_tableIndex, _rowPos, newAmenities);
        _myCMS.updateEditedValue(_tableIndex, _rowPos);
        this.setVisible(false);
        _myCMS.setVisible(true);
        _ostream.updateFiles();
    }//GEN-LAST:event_EDConfirmButtonActionPerformed

    private void EDBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDBackButtonActionPerformed
        if(_myCMS == null){
            _MyDescription.setVisible(true);
        }else{
            _myCMS.setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_EDBackButtonActionPerformed

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
    private javax.swing.JButton EDBackButton;
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
