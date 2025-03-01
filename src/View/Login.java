package View;

import Model.User;
import dao.UserDAO;
import java.util.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {
    private static User curentUser;
  
    public Login(User curentUser) {
        this.setUndecorated(true);
        initComponents();
        this.curentUser = curentUser;     
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleHITHotelManager = new javax.swing.JLabel();
        UsnameLabel = new javax.swing.JLabel();
        InputUsername = new javax.swing.JTextField();
        PsLabel = new javax.swing.JLabel();
        ButtonLogin = new javax.swing.JButton();
        ButtonForgetPw = new javax.swing.JButton();
        ButtonSignUp = new javax.swing.JButton();
        InputPassword = new javax.swing.JPasswordField();
        BTExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        TitleHITHotelManager.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        TitleHITHotelManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleHITHotelManager.setText("HIT HotelManager");

        UsnameLabel.setText("Username");

        InputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputUsernameActionPerformed(evt);
            }
        });

        PsLabel.setText("Password");

        ButtonLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonLogin.setText("Login");
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        ButtonForgetPw.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        ButtonForgetPw.setText("Forgot password");
        ButtonForgetPw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonForgetPwActionPerformed(evt);
            }
        });

        ButtonSignUp.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        ButtonSignUp.setText("Sign up");
        ButtonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSignUpActionPerformed(evt);
            }
        });

        BTExit.setText("Exit");
        BTExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleHITHotelManager, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(InputUsername)
                                    .addComponent(UsnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ButtonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)
                                        .addComponent(ButtonForgetPw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(InputPassword)
                                    .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(130, 130, 130))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(BTExit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(TitleHITHotelManager, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(UsnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonForgetPw, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(BTExit)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputUsernameActionPerformed
  
    //  BUTTON SignUp
    private void ButtonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSignUpActionPerformed
        new SignUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonSignUpActionPerformed
     
    // BUTTON  ForgetPassword
    private void ButtonForgetPwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonForgetPwActionPerformed
        new ForgetPassword().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonForgetPwActionPerformed
 
    // BUTTON LogIn
    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        String inputuser = InputUsername.getText();
        String inputpassword = new String(InputPassword.getPassword());
        if(authenticate(inputuser,inputpassword)){
            if(inputuser.equals("admin")){
                new HomeAdmin(curentUser);
                this.dispose();
                System.out.println("dang nhap thanh cong");
                System.out.println("currenUser: "+ curentUser.getName());
            }
            else{
                new HomeUser(curentUser);
                this.dispose();
                System.out.println("dang nhap thanh cong");
                System.out.println("currenUser: "+ curentUser.getName());
            }           
        } else {    
            System.out.println("dang nhap that bai");
            JOptionPane.showMessageDialog(this, "Username hoặc Password không đúng.", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void BTExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTExitActionPerformed
    

    // Phương thức định danh xác thực đơn giản
    private boolean authenticate(String username, String password){
        boolean check = false;      
        ArrayList<User> list = UserDAO.getInstance().selectAll();
        for(User u : list){
            if(u.getName().equals(username) && u.getPassword().equals(password)){
              curentUser = u;
              check = true;
            }   
        }       
        return check;
    }
    
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
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(curentUser);    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTExit;
    private javax.swing.JButton ButtonForgetPw;
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JButton ButtonSignUp;
    private javax.swing.JPasswordField InputPassword;
    private javax.swing.JTextField InputUsername;
    private javax.swing.JLabel PsLabel;
    private javax.swing.JLabel TitleHITHotelManager;
    private javax.swing.JLabel UsnameLabel;
    // End of variables declaration//GEN-END:variables
}
