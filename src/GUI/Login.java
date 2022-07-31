package GUI;

import EntrySystem.EntryClass;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Everyone
 * - Designed the java form 
 * - Implements the code
 */
public class Login extends javax.swing.JFrame {

    CMS _myCMS = new CMS();
    final EntryClass _entry = EntryClass.getInstance();
    Register _myRegister = new Register();

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t_user = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        t_password = new javax.swing.JLabel();
        signinbutton = new javax.swing.JButton();
        registerbutton = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Condo Management System");
        setMaximumSize(new java.awt.Dimension(100000, 100000));
        setPreferredSize(new java.awt.Dimension(850, 650));
        setResizable(false);

        BG.setBackground(new java.awt.Color(43, 35, 39));
        BG.setMaximumSize(new java.awt.Dimension(10000, 10000));
        BG.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_logo.png"))); // NOI18N

        t_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        t_user.setForeground(new java.awt.Color(255, 255, 255));
        t_user.setText("Username");

        user.setBackground(new java.awt.Color(43, 35, 39));
        user.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        t_password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        t_password.setForeground(new java.awt.Color(255, 255, 255));
        t_password.setText("Password");

        signinbutton.setBackground(new java.awt.Color(43, 35, 39));
        signinbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signinbutton.setForeground(new java.awt.Color(255, 255, 255));
        signinbutton.setText("Sign in");
        signinbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbuttonActionPerformed(evt);
            }
        });

        registerbutton.setBackground(new java.awt.Color(43, 35, 39));
        registerbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerbutton.setForeground(new java.awt.Color(255, 255, 255));
        registerbutton.setText("Register");
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(43, 35, 39));
        password.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_user)
                            .addComponent(t_password)
                            .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BGLayout.createSequentialGroup()
                                    .addComponent(signinbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(registerbutton))
                                .addComponent(user, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(t_user)
                .addGap(18, 18, 18)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(t_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signinbutton)
                    .addComponent(registerbutton))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(438, 559));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed
        _myRegister.setVisible(true);
        _myRegister.setLogin(this);
    }//GEN-LAST:event_registerbuttonActionPerformed

    private void signinbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbuttonActionPerformed
        String username = user.getText();
        String pass = password.getText();
        if (_entry.login(username, pass)) {
            this.setVisible(false);
            _myCMS.setVisible(true);
        } else {
            JFrame PopUp = new JFrame();
            JOptionPane.showMessageDialog(PopUp, "The username or password you entered is incorrect.");
            user.setText("");
            password.setText("");
        }
    }//GEN-LAST:event_signinbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton registerbutton;
    private javax.swing.JButton signinbutton;
    private javax.swing.JLabel t_password;
    private javax.swing.JLabel t_user;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
