
package View;


import javax.swing.JOptionPane;
import java.sql.*;
//import Controller.LoginController; 
import Controller.loginControllor;
import java.awt.HeadlessException;
import java.util.logging.Level; 
import java.util.logging.Logger; 



public class Login extends javax.swing.JFrame {
  //  Connection conn  ;
   // Statement stmt = null;
    
public Login(){
    initComponents();
}
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        userName = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        loginBtn = new com.k33ptoo.components.KButton();
        cancelBtn = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        signB = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 530));

        jPanel1.setBackground(new java.awt.Color(92, 209, 209));
        jPanel1.setLayout(null);

        kGradientPanel1.setBackground(new java.awt.Color(204, 0, 204));
        kGradientPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 0, 204));
        kGradientPanel1.setkGradientFocus(10);
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userName.setBackground(new java.awt.Color(204, 0, 204));
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        kGradientPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 244, 230, 27));

        password.setBackground(new java.awt.Color(204, 0, 204));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        kGradientPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 321, 230, -1));

        loginBtn.setBorder(null);
        loginBtn.setText("Login");
        loginBtn.setkBorderRadius(50);
        loginBtn.setkEndColor(new java.awt.Color(204, 204, 255));
        loginBtn.setkHoverEndColor(new java.awt.Color(204, 0, 255));
        loginBtn.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        loginBtn.setkHoverStartColor(new java.awt.Color(204, 204, 255));
        loginBtn.setkStartColor(new java.awt.Color(204, 0, 255));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        cancelBtn.setBorder(null);
        cancelBtn.setText("Cancel");
        cancelBtn.setkBorderRadius(50);
        cancelBtn.setkEndColor(new java.awt.Color(204, 204, 255));
        cancelBtn.setkHoverEndColor(new java.awt.Color(204, 0, 255));
        cancelBtn.setkHoverStartColor(new java.awt.Color(204, 204, 255));
        cancelBtn.setkStartColor(new java.awt.Color(204, 0, 255));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 241, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 321, 70, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Not a member ?");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 468, -1, 21));

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 108, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\pp.png")); // NOI18N
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 23, 58, 67));

        signB.setBorder(null);
        signB.setText("Sign Up");
        signB.setFont(new java.awt.Font("Segoe UI Emoji", 1, 10)); // NOI18N
        signB.setkBorderRadius(30);
        signB.setkFillButton(false);
        signB.setkForeGround(new java.awt.Color(0, 0, 0));
        signB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signBActionPerformed(evt);
            }
        });
        kGradientPanel1.add(signB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 80, 20));

        jPanel1.add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 500, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
      
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
    //LoginController.login(userTF.getText(), new String(pWTF.getPassword()));
       
    String user = userName.getText();
    String pass = new String(password.getPassword());

    loginControllor controller = new loginControllor();
    boolean isValid = controller.validateLogin(user, pass);

    if (isValid) {
        Home obj = new Home();
        obj.setVisible(true);
        this.dispose();       
    } else {
     
        JOptionPane.showMessageDialog(this, "Invalid Username or Password");
    }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void signBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signBActionPerformed
        // TODO add your handling code here:
        Sign obj = new Sign();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signBActionPerformed

    public static void main(String args[]) {
      
        //try {
            //for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                //if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //break;
                //}
            //}
        //} catch (ClassNotFoundException ex) {
            //java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //} catch (InstantiationException ex) {
            //java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //} catch (IllegalAccessException ex) {
            //java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            //java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //}
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KButton loginBtn;
    private javax.swing.JPasswordField password;
    private com.k33ptoo.components.KButton signB;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables

    
}

