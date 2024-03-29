package GUI;

import CMSClass.Condo;
import FileManager.Istream;
import FileManager.Ostream;
import java.util.ArrayList;

/**
 * @author Paul Reonal 
 * - Designed the java form 
 * - Implements the code
 */
public class SellCondo extends javax.swing.JFrame {

    private CMS _myCMS;
    private Istream _istream = Istream.getInstance();
    private Ostream _ostream = Ostream.getInstance();
    private Condo _MyCondo = Condo.get_instance();

    public SellCondo() {
        this._ostream = Ostream.getInstance();
        initComponents();
    }

    public void setCMS(CMS cms) {
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
        SCSelectFloorCombo = new javax.swing.JComboBox<>();
        SCEnterUnitText = new javax.swing.JTextField();
        SCSelectFloorLabel1 = new javax.swing.JLabel();
        SCPaymentOptionCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        SCSelectFloorCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Floor 1", "Floor 2", "Floor 3", "Floor 4", "Floor 5" }));

        SCSelectFloorLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SCSelectFloorLabel1.setText("Payment Option:");

        SCPaymentOptionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full Payment", "Installment" }));

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SCSelectFloorLabel)
                            .addComponent(SCSelectFloorLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(SCConfirmButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SCSelectFloorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SCPaymentOptionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SCEnterUnitLabel)
                                .addGap(0, 33, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SCEnterUnitText)
                            .addComponent(SCExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addGap(35, 35, 35))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCSelectFloorLabel1)
                    .addComponent(SCPaymentOptionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCConfirmButton)
                    .addComponent(SCExitButton))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(521, 232));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SCExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCExitButtonActionPerformed
        this.setVisible(false);
        _myCMS.setVisible(true);
    }//GEN-LAST:event_SCExitButtonActionPerformed

    private void SCConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCConfirmButtonActionPerformed
        String UnitNo = SCEnterUnitText.getText();
        String modeOfPayment = SCPaymentOptionCombo.getSelectedIndex() == 0 ? "Full Payment" : "Installment";
        int floorIndex = SCSelectFloorCombo.getSelectedIndex();
        ArrayList<String> units = _MyCondo.getFloor(floorIndex).getUnitNo();
        int rowIndex = 0;
        for (int i = 0; i < units.size(); ++i) {
            if (units.get(i) == null ? UnitNo == null : units.get(i).equals(UnitNo)) {
                _MyCondo.getFloor(floorIndex).getModeOfPayment().set(i, modeOfPayment);
                _MyCondo.getFloor(floorIndex).getStatus().set(i, "Sold");
                rowIndex = i;
                break;
            }
        }
        _ostream.updateFiles();
        _myCMS.updateEditedValue(floorIndex, rowIndex);
        this.setVisible(false);
        _myCMS.setVisible(true);
    }//GEN-LAST:event_SCConfirmButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SCConfirmButton;
    private javax.swing.JLabel SCEnterUnitLabel;
    private javax.swing.JTextField SCEnterUnitText;
    private javax.swing.JButton SCExitButton;
    private javax.swing.JComboBox<String> SCPaymentOptionCombo;
    private javax.swing.JComboBox<String> SCSelectFloorCombo;
    private javax.swing.JLabel SCSelectFloorLabel;
    private javax.swing.JLabel SCSelectFloorLabel1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
