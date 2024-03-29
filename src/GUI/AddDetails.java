package GUI;

/**
 * @author Paul Reonal 
 * - Designed the java form 
 * - Implements the code
 */
public class AddDetails extends javax.swing.JFrame {

    String _data;
    EditDetails _myEditDetails;

    public AddDetails() {
        initComponents();
    }

    public String getData() {
        return _data;
    }

    public void setEditDetails(EditDetails data) {
        _myEditDetails = data;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ADDetailText = new javax.swing.JTextField();
        ADCancelButton = new javax.swing.JButton();
        ADAddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Add Detail:");

        ADCancelButton.setText("Cancel");
        ADCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADCancelButtonActionPerformed(evt);
            }
        });

        ADAddButton.setText("Add");
        ADAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADAddButtonActionPerformed(evt);
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
                        .addComponent(ADAddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ADCancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(ADDetailText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ADDetailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADCancelButton)
                    .addComponent(ADAddButton))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(387, 155));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADAddButtonActionPerformed
        this.setVisible(false);
        _myEditDetails.setVisible(true);
        _data = ADDetailText.getText();
        _myEditDetails.addDetails(_data);
    }//GEN-LAST:event_ADAddButtonActionPerformed

    private void ADCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADCancelButtonActionPerformed
        this.setVisible(false);
        _myEditDetails.setVisible(true);
    }//GEN-LAST:event_ADCancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADAddButton;
    private javax.swing.JButton ADCancelButton;
    private javax.swing.JTextField ADDetailText;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
