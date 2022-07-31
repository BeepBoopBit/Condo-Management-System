package GUI;

import CMSClass.Condo;
import FileManager.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * @author Everyone
 * - Designed the java form 
 * - Implements the code
 */
public class CMS extends javax.swing.JFrame {

    private final Istream                               _Istream;
    private final Ostream                               _Ostream        = Ostream.getInstance();
    private final Condo                                 _MyCondo        = Condo.get_instance();
    private final int                                   _TableColSize   = 3;
    private final int                                   _TableDataSize  = 10;
    private final ArrayList<DefaultTableModel>          _FModel;
    private final ArrayList<javax.swing.JTable>         _Tables;
    
    public CMS() {
        initComponents();
        
        // Initilize Istream
        _Istream = Istream.getInstance();
        _Istream.readFloors();
        
        // Initialize Model
        _FModel = new ArrayList<>();
        _FModel.add((DefaultTableModel) CMFloor1Table.getModel());
        _FModel.add((DefaultTableModel) CMFloor2Table.getModel());
        _FModel.add((DefaultTableModel) CMFloor3Table.getModel());
        _FModel.add((DefaultTableModel) CMFloor4Table.getModel());
        _FModel.add((DefaultTableModel) CMFloor5Table.getModel());
        
        // Initialize Tables
        _Tables = new ArrayList<>();
        _Tables.add(CMFloor1Table);
        _Tables.add(CMFloor2Table);
        _Tables.add(CMFloor3Table);
        _Tables.add(CMFloor4Table);
        _Tables.add(CMFloor5Table);

        // Set up Table Values
        setUpTableData();
    }
    
    // Used when a value is edited inside of any condo (Yes, very inefficient)
    private void setUpTableData(){
        for(int i = 0; i < _FModel.size(); ++i){
            for(int j = 0; j < _TableDataSize; ++j){
                _FModel.get(i).addRow(_MyCondo.getUnitDataInFloor(i, j));
            }
        }
    }
    
    private boolean checkIfSelected(int tabIndex){
        return _Tables.get(tabIndex).getSelectedRow() >= 0;
    }
    
    public void updateEditedValue(int tableIndex, int rowIndex){
        _FModel.get(tableIndex).removeRow(rowIndex);
        _FModel.get(tableIndex).insertRow(rowIndex, _MyCondo.getUnitDataInFloor(tableIndex, rowIndex));
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
        RefreshButton = new javax.swing.JButton();
        Logo_icon_small = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                "Unit No.", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
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
                "Unit No.", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
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
                "Unit No.", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
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
                "Unit No.", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
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
                "Unit No.", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
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

        RefreshButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        Logo_icon_small.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_logo [small].png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CMDescriptionButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CMReportButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CMExitButton))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Logo_icon_small)
                        .addGap(18, 18, 18)
                        .addComponent(CMSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CMSearchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RefreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(CMEditCondoButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CMSellCondoButton)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CMSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CMSearchButton)
                            .addComponent(Logo_icon_small)
                            .addComponent(RefreshButton))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CMSellCondoButton)
                            .addComponent(CMEditCondoButton1))
                        .addGap(18, 18, 18)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CMDescriptionButton)
                    .addComponent(CMReportButton)
                    .addComponent(CMExitButton))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1097, 697));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CMSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMSearchBarActionPerformed
        // Create a new Description Window
        DescriptionWindow _descriptionWindow = new DescriptionWindow();
        // Make it visible
        _descriptionWindow.setVisible(true);
        // Set the current window invisible
        this.setVisible(false);
    }//GEN-LAST:event_CMSearchBarActionPerformed

    private void CMSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMSearchButtonActionPerformed
        int currentTableIndex = jTabbedPane1.getSelectedIndex();
        // Remove all of the values
        while(_FModel.get(currentTableIndex).getRowCount() != 0){   
             _FModel.get(currentTableIndex).removeRow(0);
        }
        String searchValue = CMSearchBar.getText();
        // If there is a value in search
        if(searchValue.length() != 0){
            // Iterate through all the data in the current floor
            for(int j = 0; j < _TableDataSize; ++j){
                // Get the row in the specific data
                String[] dataRow = _MyCondo.getUnitDataInFloor(currentTableIndex, j);
                // Iterate through that row values if the soughted value is there
                for(int k = 0; k < _TableColSize; ++k){
                    // If it is, add it to the data
                    if(dataRow[k] == null ? searchValue == null : dataRow[k].equals(searchValue)){
                        _FModel.get(currentTableIndex).addRow(dataRow);
                    }
                }
            }
        }else{
            setUpTableData();
        }
    }//GEN-LAST:event_CMSearchButtonActionPerformed

    private void CMEditCondoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMEditCondoButton1ActionPerformed
        if(!checkIfSelected(jTabbedPane1.getSelectedIndex())){
            return;
        }
        // get tab index and selected item row
        int tabIndex = jTabbedPane1.getSelectedIndex();
        int selectedRow = _Tables.get(tabIndex).getSelectedRow();
        // Create a new edit window
        EditDescription _editWindow = new EditDescription(tabIndex, selectedRow);
        // Make it visible
        _editWindow.setVisible(true);
        // Set the current window invisible
        this.setVisible(false);
        // Set 'this' to the edit window (for editing data, we need access to this class)
        _editWindow.setMyCMS(this);
    }//GEN-LAST:event_CMEditCondoButton1ActionPerformed

    private void CMDescriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMDescriptionButtonActionPerformed
        if(!checkIfSelected(jTabbedPane1.getSelectedIndex())){
            return;
        }
        // get tab index and selected item row
        int tabIndex = jTabbedPane1.getSelectedIndex();
        int selectedRow = _Tables.get(tabIndex).getSelectedRow();        
        // Create a new Description Window
        DescriptionWindow _descriptionWindow = new DescriptionWindow(tabIndex,selectedRow);
        // Make it visible
        _descriptionWindow.setVisible(true);
        // Set the current window invisible
        this.setVisible(false);
        // Set 'this' to the edit window (for editing data, we need access to this class)
        _descriptionWindow.setMyCMS(this);
    }//GEN-LAST:event_CMDescriptionButtonActionPerformed

    private void CMSellCondoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMSellCondoButtonActionPerformed
        SellCondo _sellCondoWindow = new SellCondo();
        _sellCondoWindow.setVisible(true);
        _sellCondoWindow.setCMS(this);
        this.setVisible(false);
    }//GEN-LAST:event_CMSellCondoButtonActionPerformed

    private void CMReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMReportButtonActionPerformed
        GenerateReport newReport = new GenerateReport();
        newReport.setMyCMS(this);
        newReport.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CMReportButtonActionPerformed

    private void CMExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMExitButtonActionPerformed
        Login _loginWindow = new Login();
        _loginWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CMExitButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        int currentTableIndex = jTabbedPane1.getSelectedIndex();
        // Remove all of the values
        while(_FModel.get(currentTableIndex).getRowCount() != 0){   
             _FModel.get(currentTableIndex).removeRow(0);
        }
        setUpTableData();
        CMSearchBar.setText("");
    }//GEN-LAST:event_RefreshButtonActionPerformed

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
    private javax.swing.JLabel Logo_icon_small;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
