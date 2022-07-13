package GUI;
import FileManager.*;

public class CMS extends javax.swing.JFrame {

    private Istream _istream = new Istream();
    
    public CMS() {
        initComponents();
        _istream.read("src/FileManager/Datas.dat");
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
        CMSellCondoButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        CMFloor1Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMFloor1Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(101), null, null, null, null},
                { new Integer(102), null, null, null, null},
                { new Integer(103), null, null, null, null},
                { new Integer(104), null, null, null, null},
                { new Integer(105), null, null, null, null},
                { new Integer(106), null, null, null, null},
                { new Integer(107), null, null, null, null},
                { new Integer(108), null, null, null, null},
                { new Integer(109), null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Unit No.", "Short Description", "Location", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
                { new Integer(201), null, null, null, null},
                { new Integer(202), null, null, null, null},
                { new Integer(203), null, null, null, null},
                { new Integer(204), null, null, null, null},
                { new Integer(205), null, null, null, null},
                { new Integer(206), null, null, null, null},
                { new Integer(207), null, null, null, null},
                { new Integer(208), null, null, null, null},
                { new Integer(209), null, null, null, null},
                {null, "", null, null, null}
            },
            new String [] {
                "Unit No.", "Short Description", "Location", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
                { new Integer(301), null, null, null, null},
                { new Integer(302), null, null, null, null},
                { new Integer(303), null, null, null, null},
                { new Integer(304), null, null, null, null},
                { new Integer(305), null, null, null, null},
                { new Integer(306), null, null, null, null},
                { new Integer(307), null, null, null, null},
                { new Integer(308), null, null, null, null},
                { new Integer(309), null, null, null, null},
                { new Integer(40), null, null, null, null}
            },
            new String [] {
                "Unit No.", "Short Description", "Location", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
                { new Integer(401), null, null, null, null},
                { new Integer(402), null, null, null, null},
                { new Integer(403), null, null, null, null},
                { new Integer(404), null, null, null, null},
                { new Integer(405), null, null, null, null},
                { new Integer(406), null, null, null, null},
                { new Integer(407), null, null, null, null},
                { new Integer(408), null, null, null, null},
                { new Integer(409), null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Unit No.", "Short Description", "Location", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
                { new Integer(501), null, null, null, null},
                { new Integer(502), null, null, null, null},
                { new Integer(503), null, null, null, null},
                { new Integer(504), null, null, null, null},
                { new Integer(505), null, null, null, null},
                { new Integer(506), null, null, null, null},
                { new Integer(507), null, null, null, null},
                { new Integer(508), null, null, null, null},
                { new Integer(509), null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Unit No.", "Short Description", "Location", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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

        CMSellCondoButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMSellCondoButton.setText("Sell Condo Unit");

        CMDescriptionButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMDescriptionButton.setText("Description");

        CMReportButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMReportButton.setText("Generate Report");

        CMExitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMExitButton.setText("Exit");

        CMSellCondoButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMSellCondoButton1.setText("Edit Condo Unit");

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
                        .addComponent(CMSellCondoButton1)
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
                    .addComponent(CMSellCondoButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CMDescriptionButton)
                    .addComponent(CMReportButton)
                    .addComponent(CMExitButton))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CMSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMSearchBarActionPerformed

    }//GEN-LAST:event_CMSearchBarActionPerformed

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
    private javax.swing.JButton CMSellCondoButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
