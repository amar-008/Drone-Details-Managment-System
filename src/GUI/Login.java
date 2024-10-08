/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author T Amaradeepan
 */
public class Login extends javax.swing.JFrame {

Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setIcon();
        setTitle("LOGIN");
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeDialog = new javax.swing.JDialog();
        confirmDialog = new javax.swing.JDialog();
        cancelButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        userNameField = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        registerButton1 = new javax.swing.JButton();
        showpasswordCheckBox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout welcomeDialogLayout = new javax.swing.GroupLayout(welcomeDialog.getContentPane());
        welcomeDialog.getContentPane().setLayout(welcomeDialogLayout);
        welcomeDialogLayout.setHorizontalGroup(
            welcomeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        welcomeDialogLayout.setVerticalGroup(
            welcomeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout confirmDialogLayout = new javax.swing.GroupLayout(confirmDialog.getContentPane());
        confirmDialog.getContentPane().setLayout(confirmDialogLayout);
        confirmDialogLayout.setHorizontalGroup(
            confirmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        confirmDialogLayout.setVerticalGroup(
            confirmDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(0, 0, 0));
        cancelButton.setText("Cancel");
        cancelButton.setToolTipText("Cancel here");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 650, 100, 30));

        loginButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Login");
        loginButton.setToolTipText("Login here");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, 80, 30));

        passwordField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        passwordField.setToolTipText("Enter Password Here");
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 191, 34));

        userNameField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        userNameField.setToolTipText("Enter Username Here");
        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 190, 33));

        userNameLabel.setBackground(new java.awt.Color(51, 51, 51));
        userNameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        userNameLabel.setText("Username:");
        getContentPane().add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, -1, -1));

        passwordLabel.setBackground(new java.awt.Color(0, 0, 0));
        passwordLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setText("Password:");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("UAV SECTOR ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 210, 80));

        registerButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        registerButton1.setForeground(new java.awt.Color(0, 0, 0));
        registerButton1.setText("Register");
        registerButton1.setToolTipText("Register here");
        registerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 650, 90, 30));

        showpasswordCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        showpasswordCheckBox.setText("Show Password");
        showpasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(showpasswordCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 610, -1, 20));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/login (1).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(300, 300));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 810));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 540, -1, -1));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 550, 100, 50));

        jLabel5.setDisplayedMnemonic('W');
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        
            System.exit(0);    
        
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        con=Connect.ConnectDB();
        String sql= "select * from users where Username= '" + userNameField.getText() + "' and User_Password ='" + passwordField.getText() + "'";
      try
      {
          pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
          //(""==usernamField.getText())
          if("".equals(userNameField.getText()) && "".equals(passwordField.getText())){
              JOptionPane.showMessageDialog(null,"Please Enter Username and Password!");
          }
         else if (rs.next()){
             this.hide();
             MainMenu menu=new MainMenu();
             menu.setVisible(true);
          }
          else{
              
            JOptionPane.showMessageDialog(null, "Login Failed..Try again !","Access denied",JOptionPane.ERROR_MESSAGE);
            userNameField.setText("");
            passwordField.setText("");
            userNameField.requestFocus();
          }
      }
      catch(SQLException | HeadlessException e)
      {
         JOptionPane.showMessageDialog(null, e);    
      }
      
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
        con=Connect.ConnectDB();
        String sql= "select * from users where Username= '" + userNameField.getText() + "' and User_Password ='" + passwordField.getText() + "'";
      try
      {
          pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
          if("".equals(userNameField.getText()) && "".equals(passwordField.getText())){
              JOptionPane.showMessageDialog(null,"Please Enter Username and Password!");
          }
         else if (rs.next()){
             this.hide();
             MainMenu menu=new MainMenu();
             menu.setVisible(true);
          }
          else{
              
            JOptionPane.showMessageDialog(null, "Login Failed..Try again !","Access denied",JOptionPane.ERROR_MESSAGE);
            userNameField.setText("");
            passwordField.setText("");
            userNameField.requestFocus();
          }
      }
      catch(SQLException | HeadlessException e)
      {
         JOptionPane.showMessageDialog(null, e);    
      }
            
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void registerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButton1ActionPerformed
        // TODO add your handling code here:
        UserRegisteration user=new UserRegisteration();
        this.hide();
        user.setVisible(true);
    }//GEN-LAST:event_registerButton1ActionPerformed

    private void showpasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordCheckBoxActionPerformed
        // TODO add your handling code here:
        if(showpasswordCheckBox.isSelected())
        {
            passwordField.setEchoChar((char)0);
        }
        else
        {
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showpasswordCheckBoxActionPerformed

    /**
     * @param args the command line arguments
     */
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Login login=new Login();
            login.setVisible(true);
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            System.out.println(screenSize.width+" "+screenSize.height);
            login.setSize(screenSize.width, screenSize.height);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JDialog confirmDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton1;
    private javax.swing.JCheckBox showpasswordCheckBox;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JDialog welcomeDialog;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        
    
     
    }
}
