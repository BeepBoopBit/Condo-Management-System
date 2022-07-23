package GUI;

import CMSClass.Condo;
import FileManager.Ostream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * @author Everyone
 * - Designed the java form 
 * - Implements the code
 */
public class GenerateReport extends javax.swing.JFrame {

    DefaultTableModel _MyModel;
    Condo _MyCondo = Condo.get_instance();
    ArrayList<String[]> _ReportData;
    Ostream _MyOstream = Ostream.getInstance();
    CMS _MyCMS;

    public GenerateReport() {
        initComponents();
        _MyModel = (DefaultTableModel) GRReportTable.getModel();
    }

    void setMyCMS(CMS data) {
        _MyCMS = data;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GRReportTable = new javax.swing.JTable();
        GRExitButton = new javax.swing.JButton();
        SaveToFileButton = new javax.swing.JButton();
        GRFilterCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        GenerateReportButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("REPORT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setText("________________________________________");

        GRReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unit No,", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(GRReportTable);

        GRExitButton.setText("Exit");
        GRExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GRExitButtonActionPerformed(evt);
            }
        });

        SaveToFileButton.setText("Save To File");
        SaveToFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveToFileButtonActionPerformed(evt);
            }
        });

        GRFilterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sold", "Available" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Filter:");

        GenerateReportButton.setText("Generate Report");
        GenerateReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(GRFilterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SaveToFileButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(GenerateReportButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GRExitButton)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addContainerGap(60, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GRFilterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(GRExitButton)
                    .addComponent(GenerateReportButton)
                    .addComponent(SaveToFileButton))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(636, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GenerateReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReportButtonActionPerformed
        String searchValue = GRFilterCombo.getSelectedIndex() == 0 ? "Sold" : "Available";
        _ReportData = new ArrayList<>();
        // Remove all of the values
        while (_MyModel.getRowCount() != 0) {
            _MyModel.removeRow(0);
        }
        int floorSize = _MyCondo.getAllFloors().size();
        // Iterate through all the floors
        for (int i = 0; i < floorSize; ++i) {
            // iterate through all the data
            for (int j = 0; j < _MyCondo.getAllFloors().get(i).getStatus().size(); ++j) {
                if (searchValue.equals(_MyCondo.getAllFloors().get(i).getStatus().get(j))) {
                    String[] dataRow = {_MyCondo.getAllFloors().get(i).getUnitNo().get(j), _MyCondo.getAllFloors().get(i).getStatus().get(j)};
                    _MyModel.addRow(dataRow);
                    _ReportData.add(dataRow);
                }
            }
        }
    }//GEN-LAST:event_GenerateReportButtonActionPerformed

    private void SaveToFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveToFileButtonActionPerformed
        _MyOstream.deleteReport();
        _MyOstream.exportReport(_ReportData);
    }//GEN-LAST:event_SaveToFileButtonActionPerformed

    private void GRExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GRExitButtonActionPerformed
        this.setVisible(false);
        _MyCMS.setVisible(true);
    }//GEN-LAST:event_GRExitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GRExitButton;
    private javax.swing.JComboBox<String> GRFilterCombo;
    private javax.swing.JTable GRReportTable;
    private javax.swing.JButton GenerateReportButton;
    private javax.swing.JButton SaveToFileButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
