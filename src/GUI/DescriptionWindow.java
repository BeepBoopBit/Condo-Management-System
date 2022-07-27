package GUI;

import CMSClass.Condo;
import FileManager.Istream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * @author Everyone 
 * - Designed the java form 
 * - Implements the code
 */
public class DescriptionWindow extends javax.swing.JFrame {

    private CMS myCMS;
    private Istream _istream = Istream.getInstance();
    private Condo _MyCondo = Condo.get_instance();
    private int _tableIndex;
    private int _rowPos;

    // Will set-up the values automatically
    public DescriptionWindow(int tableIndex, int rowPos) {
        initComponents();
        _tableIndex = tableIndex;
        _rowPos = rowPos;
        setUpValues();
    }

    public DescriptionWindow() {
        initComponents();
    }

    void setTableAndRow(int table, int row) {
        _tableIndex = table;
        _rowPos = row;
    }

    private void setUpValues() {
        DWCostLabel.setText(_MyCondo.getFloor(_tableIndex).getCost().get(_rowPos));
        DWUnitNoLabel.setText(_MyCondo.getFloor(_tableIndex).getUnitNo().get(_rowPos));
        DWMOPLabel.setText(_MyCondo.getFloor(_tableIndex).getModeOfPayment().get(_rowPos));

        DefaultTableModel detailModel = (DefaultTableModel) DetailsTable.getModel();
        ArrayList<ArrayList<String>> tempData = _MyCondo.getFloor(_tableIndex).getDetails();
        for (int j = 0; j < tempData.get(_rowPos).size(); ++j) {
            detailModel.addRow(new String[]{tempData.get(_rowPos).get(j)});
        }

        DefaultTableModel amenitiesModel = (DefaultTableModel) AmenitiesTable.getModel();
        tempData = _MyCondo.getFloor(_tableIndex).getAmenities();
        for (int j = 0; j < tempData.get(_tableIndex).size(); ++j) {
            amenitiesModel.addRow(new String[]{tempData.get(_tableIndex).get(j)});
        }
    }

    public void setMyCMS(CMS myCMS) {
        this.myCMS = myCMS;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AmenitiesTable = new javax.swing.JTable();
        DWEditButton = new javax.swing.JButton();
        DWBackButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DetailsTable = new javax.swing.JTable();
        DWCostLabel = new javax.swing.JLabel();
        DWUnitNoLabel = new javax.swing.JLabel();
        DWMOPLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("UNIT NO.");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("COST:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("MODE OF PAYMENT:");

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

        DWCostLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DWCostLabel.setText("0.00");

        DWUnitNoLabel.setBackground(new java.awt.Color(255, 255, 255));
        DWUnitNoLabel.setText("100");

        DWMOPLabel.setText("Payment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(DWEditButton)
                        .addGap(341, 341, 341)
                        .addComponent(DWBackButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(204, 204, 204))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DWUnitNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DWCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(DWMOPLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DWCostLabel)
                    .addComponent(jLabel2)
                    .addComponent(DWUnitNoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(DWMOPLabel))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DWBackButton)
                    .addComponent(DWEditButton))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(622, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DWBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DWBackButtonActionPerformed
        this.setVisible(false);
        myCMS.setVisible(true);
    }//GEN-LAST:event_DWBackButtonActionPerformed

    private void DWEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DWEditButtonActionPerformed

        // Create a new edit window
        EditDescription _editWindow = new EditDescription(_tableIndex, _rowPos);
        _editWindow.setDescriptionWindow(this);
        _editWindow.setMyCMS(myCMS);
        // Make it visible
        _editWindow.setVisible(true);
        // Set the current window invisible
        this.setVisible(false);
    }//GEN-LAST:event_DWEditButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AmenitiesTable;
    private javax.swing.JButton DWBackButton;
    private javax.swing.JLabel DWCostLabel;
    private javax.swing.JButton DWEditButton;
    private javax.swing.JLabel DWMOPLabel;
    private javax.swing.JLabel DWUnitNoLabel;
    private javax.swing.JTable DetailsTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
