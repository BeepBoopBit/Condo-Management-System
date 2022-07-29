package GUI;

import EntrySystem.EntryClass;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Everyone
 * - Designed the java form 
 * - Implements the code
 */
public class Register extends javax.swing.JFrame {

    Login _myLogin;
    final EntryClass _entry = EntryClass.getInstance();

    public Register() {
        initComponents();
    }

    void setLogin(Login login) {
        _myLogin = login;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        t_user = new javax.swing.JLabel();
        t_password = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        submitbutton = new javax.swing.JButton();
        t_cpassword = new javax.swing.JLabel();
        cpassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign Up");
        setResizable(false);

        BG.setBackground(new java.awt.Color(43, 35, 39));

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Sign Up");

        t_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        t_user.setForeground(new java.awt.Color(255, 255, 255));
        t_user.setText("Username");

        t_password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        t_password.setForeground(new java.awt.Color(255, 255, 255));
        t_password.setText("Password");

        user.setBackground(new java.awt.Color(43, 35, 39));
        user.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        user.setForeground(new java.awt.Color(240, 240, 240));
        user.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        password.setBackground(new java.awt.Color(43, 35, 39));
        password.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        password.setForeground(new java.awt.Color(240, 240, 240));
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        submitbutton.setBackground(new java.awt.Color(0, 0, 0));
        submitbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submitbutton.setForeground(new java.awt.Color(240, 240, 240));
        submitbutton.setText("Submit");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });

        t_cpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        t_cpassword.setForeground(new java.awt.Color(255, 255, 255));
        t_cpassword.setText("Confirm Password");

        cpassword.setBackground(new java.awt.Color(43, 35, 39));
        cpassword.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cpassword.setForeground(new java.awt.Color(240, 240, 240));
        cpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cpassword)
                        .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(t_user, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(t_password, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(t_cpassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(user, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(submitbutton)))
                .addGap(38, 38, 38))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(title)
                .addGap(29, 29, 29)
                .addComponent(t_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(t_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(t_cpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(submitbutton)
                .addContainerGap(51, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(390, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        String pass00 = password.getText();
        String pass01 = cpassword.getText();
        String username = user.getText();

        if (pass00 == null ? pass01 == null : pass00.equals(pass01)) {
            _entry.register(username, pass00);
            this.setVisible(false);
            _myLogin.setVisible(true);
        } else {
            JFrame PopUp = new JFrame();
            JOptionPane.showMessageDialog(PopUp, "Please make sure your password match.");
            password.setText("");
            cpassword.setText("");
        }
    }//GEN-LAST:event_submitbuttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JTextField cpassword;
    private javax.swing.JTextField password;
    private javax.swing.JButton submitbutton;
    private javax.swing.JLabel t_cpassword;
    private javax.swing.JLabel t_password;
    private javax.swing.JLabel t_user;
    private javax.swing.JLabel title;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
