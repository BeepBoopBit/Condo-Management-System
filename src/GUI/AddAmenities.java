package GUI;

/**
 * @author Paul Reonal 
 * - Designed the java form 
 * - Implements the code
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

    public void setEditAmenities(EditAmenities data) {
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
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AAAddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AACancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(AAAmenityText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AAAmenityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AACancelButton)
                    .addComponent(AAAddButton))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(404, 158));
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
