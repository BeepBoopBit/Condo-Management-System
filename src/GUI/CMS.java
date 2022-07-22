package GUI;

import CMSClass.CondoData;
import FileManager.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CMS extends javax.swing.JFrame {

    private final Istream _istream;
    private final Ostream _ostream = Ostream.getInstance();
    private final int _tableSize = 4;
    ArrayList<CondoData> _data;
    ArrayList<DefaultTableModel> _fModel;
    ArrayList<javax.swing.JTable> _tables;
    
    public CMS() {
        initComponents();
        _istream = Istream.getInstance();
        _istream.readFloors();
        _data = _istream.getFloors();
        _fModel = new ArrayList<>();
        _fModel.add((DefaultTableModel) CMFloor1Table.getModel());
        _fModel.add((DefaultTableModel) CMFloor2Table.getModel());
        _fModel.add((DefaultTableModel) CMFloor3Table.getModel());
        _fModel.add((DefaultTableModel) CMFloor4Table.getModel());
        _fModel.add((DefaultTableModel) CMFloor5Table.getModel());
        setUpData();
        _tables = new ArrayList<>();
        _tables.add(CMFloor1Table);
        _tables.add(CMFloor2Table);
        _tables.add(CMFloor3Table);
        _tables.add(CMFloor4Table);
        _tables.add(CMFloor5Table);
    }
    
    public void setUpData(){
        for(int i = 0; i < _fModel.size(); ++i){
            ArrayList<String[]> tempData = _data.get(i).getTableData();
            for(int j = 0; j < tempData.size(); ++j){
                _fModel.get(i).addRow(tempData.get(j));
            }
        }
    }
    
    public void readDataInTable(){
        int currentTableIndex = jTabbedPane1.getSelectedIndex();
        // remove all of the values
        while(_fModel.get(currentTableIndex).getRowCount() != 0){   
            _fModel.get(currentTableIndex).removeRow(0);
        }
        ArrayList<String[]> tempData = _data.get(currentTableIndex).getTableData();
        for(int j = 0; j < tempData.size(); ++j){    
            _fModel.get(currentTableIndex).addRow(tempData.get(j));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        CMFloor1Table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        CMFloor2Table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        CMFloor3Table = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        CMFloor4Table = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        CMFloor5Table = new javax.swing.JTable();
        CMSearchBar = new javax.swing.JTextField();
        CMSearchButton = new javax.swing.JButton();
        CMSellCondoButton = new javax.swing.JButton();
        CMDescriptionButton = new javax.swing.JButton();
        CMReportButton = new javax.swing.JButton();
        CMExitButton = new javax.swing.JButton();
        CMEditCondoButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        CMFloor1Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMFloor1Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unit No.", "Short Description", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CMFloor1Table);

        jTabbedPane1.addTab("Floor 1", jScrollPane1);

        CMFloor2Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMFloor2Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unit No.", "Short Description", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(CMFloor2Table);

        jTabbedPane1.addTab("Floor 2", jScrollPane2);

        CMFloor3Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMFloor3Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unit No.", "Short Description", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(CMFloor3Table);

        jTabbedPane1.addTab("Floor 3", jScrollPane3);

        CMFloor4Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMFloor4Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unit No.", "Short Description", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(CMFloor4Table);

        jTabbedPane1.addTab("Floor 4", jScrollPane4);

        CMFloor5Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMFloor5Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unit No.", "Short Description", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CMFloor5Table.setColumnSelectionAllowed(true);
        jScrollPane5.setViewportView(CMFloor5Table);
        CMFloor5Table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTabbedPane1.addTab("Floor 5", jScrollPane5);

        CMSearchBar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMSearchBarActionPerformed(evt);
            }
        });

        CMSearchButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMSearchButton.setText("Search");
        CMSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMSearchButtonActionPerformed(evt);
            }
        });

        CMSellCondoButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMSellCondoButton.setText("Sell Condo Unit");
        CMSellCondoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMSellCondoButtonActionPerformed(evt);
            }
        });

        CMDescriptionButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMDescriptionButton.setText("Description");
        CMDescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMDescriptionButtonActionPerformed(evt);
            }
        });

        CMReportButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMReportButton.setText("Generate Report");
        CMReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMReportButtonActionPerformed(evt);
            }
        });

        CMExitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMExitButton.setText("Exit");
        CMExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMExitButtonActionPerformed(evt);
            }
        });

        CMEditCondoButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMEditCondoButton1.setText("Edit Condo Unit");
        CMEditCondoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMEditCondoButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CMDescriptionButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CMReportButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CMExitButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(CMSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CMSearchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CMEditCondoButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CMSellCondoButton))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CMSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CMSearchButton)
                    .addComponent(CMSellCondoButton)
                    .addComponent(CMEditCondoButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CMDescriptionButton)
                    .addComponent(CMReportButton)
                    .addComponent(CMExitButton))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(676, 394));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CMSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMSearchBarActionPerformed
        
        DescriptionWindow _descriptionWindow = new DescriptionWindow();
        _descriptionWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CMSearchBarActionPerformed

    private void CMSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMSearchButtonActionPerformed
        String searchValue = CMSearchBar.getText();
        int currentTableIndex = jTabbedPane1.getSelectedIndex();
        // remove all of the values
        while(_fModel.get(currentTableIndex).getRowCount() != 0){   
            _fModel.get(currentTableIndex).removeRow(0);
        }
        ArrayList<String[]> tempData = _data.get(currentTableIndex).getTableData();
        for(int j = 0; j < tempData.size(); ++j){    
            _fModel.get(currentTableIndex).addRow(tempData.get(j));
        }
        if(searchValue.length() != 0){
            ArrayList<String[]> tableData = _data.get(currentTableIndex).getTableData();
            int tempTableSize = tableData.size();
            int removeValue = 0;
            for(int i = 0; i < tempTableSize; ++i){
                boolean wasFound = false;
                for(int j = 0; j < _tableSize; ++j){
                    if(tableData.get(i)[j] == null ? searchValue == null : tableData.get(i)[j].equals(searchValue)){
                        wasFound = true;
                        break;
                    }
                }
                if(!wasFound){
                    _fModel.get(currentTableIndex).removeRow(i-removeValue++);
                }
            }
        }
    }//GEN-LAST:event_CMSearchButtonActionPerformed

    private void CMEditCondoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMEditCondoButton1ActionPerformed
        EditDescription _editWindow = new EditDescription();
        _editWindow.setVisible(true);
        this.setVisible(false);
        _editWindow.setMyCMS(this);
        int tabIndex = jTabbedPane1.getSelectedIndex();
        int selectedRow = _tables.get(tabIndex).getSelectedRow();
        _editWindow.setTableAndRow(tabIndex, selectedRow);
    }//GEN-LAST:event_CMEditCondoButton1ActionPerformed

    private void CMDescriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMDescriptionButtonActionPerformed
        
        DescriptionWindow _descriptionWindow = new DescriptionWindow();
        int tabIndex = jTabbedPane1.getSelectedIndex();
        int selectedRow = _tables.get(tabIndex).getSelectedRow();
        _descriptionWindow.setTableAndRow(tabIndex, selectedRow);
        _descriptionWindow.setVisible(true);
        this.setVisible(false);
        _descriptionWindow.setMyCMS(this);
    }//GEN-LAST:event_CMDescriptionButtonActionPerformed

    private void CMSellCondoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMSellCondoButtonActionPerformed
        SellCondo _sellCondoWindow = new SellCondo();
        _sellCondoWindow.setVisible(true);
        _sellCondoWindow.setCMS(this);
        this.setVisible(false);
    }//GEN-LAST:event_CMSellCondoButtonActionPerformed

    private void CMReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMReportButtonActionPerformed
        JFrame PopUp = new JFrame();
        _ostream.deleteReport();
        for(int i = 0; i < _data.size(); ++i){
            _ostream.exportData(_data.get(i).getTableData());
        }
        JOptionPane.showMessageDialog(PopUp, "Report Generated Successfully!");
    }//GEN-LAST:event_CMReportButtonActionPerformed

    private void CMExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMExitButtonActionPerformed
        Login _loginWindow = new Login();
        _loginWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CMExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CMS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CMDescriptionButton;
    private javax.swing.JButton CMEditCondoButton1;
    private javax.swing.JButton CMExitButton;
    private javax.swing.JTable CMFloor1Table;
    private javax.swing.JTable CMFloor2Table;
    private javax.swing.JTable CMFloor3Table;
    private javax.swing.JTable CMFloor4Table;
    private javax.swing.JTable CMFloor5Table;
    private javax.swing.JButton CMReportButton;
    private javax.swing.JTextField CMSearchBar;
    private javax.swing.JButton CMSearchButton;
    private javax.swing.JButton CMSellCondoButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
