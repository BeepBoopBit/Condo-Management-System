/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author CM Jinghiro
 */
public class AddAmenities extends javax.swing.JFrame {

    String _data;
    EditAmenities _myEditAmenities;
    public AddAmenities() {
        initComponents();
    }
    public String getData() {
        return _data;
    }
    public void setEditAmenities(EditAmenities data){
        _myEditAmenities = data;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AAAmenityText = new javax.swing.JTextField();
        AACancelButton = new javax.swing.JButton();
        AAAddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Add Amenity:");

        AACancelButton.setText("Cancel");
        AACancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AACancelButtonActionPerformed(evt);
            }
        });

        AAAddButton.setText("Add");
        AAAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AAAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AAAddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AACancelButton))
                    .addComponent(AAAmenityText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AAAmenityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AACancelButton)
                    .addComponent(AAAddButton))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(410, 172));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AAAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AAAddButtonActionPerformed
        this.setVisible(false);
        _myEditAmenities.setVisible(true);
        _data = AAAmenityText.getText();
        _myEditAmenities.addAmeties(_data);
    }//GEN-LAST:event_AAAddButtonActionPerformed

    private void AACancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AACancelButtonActionPerformed
        this.setVisible(false);
        _myEditAmenities.setVisible(true);
    }//GEN-LAST:event_AACancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AAAddButton;
    private javax.swing.JTextField AAAmenityText;
    private javax.swing.JButton AACancelButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
