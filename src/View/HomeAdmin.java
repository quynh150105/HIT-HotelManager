package View;

import Model.Room;
import Model.User;

public class HomeAdmin extends javax.swing.JFrame {
    
    private static User currentUser;
    private static Room room;
    
    public HomeAdmin(User currentUser) {
        this.currentUser = currentUser;
        this.setUndecorated(true);
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
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
        BtInfo = new javax.swing.JButton();
        BtLogOut = new javax.swing.JButton();
        BtSearch = new javax.swing.JButton();
        BtUpdateRoom = new javax.swing.JButton();
        BtAddRoom = new javax.swing.JButton();
        BDeleteRoom = new javax.swing.JButton();
        BTInfoCustomer = new javax.swing.JButton();
        BtDanhGia = new javax.swing.JButton();
        ListBill = new javax.swing.JButton();
        BTExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HomeAdmin");

        TitleHITHotelManager.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        TitleHITHotelManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleHITHotelManager.setText("HIT HotelManager");

        BtInfo.setText("Thông tin tài khoản");
        BtInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInfoActionPerformed(evt);
            }
        });

        BtLogOut.setText("Đăng xuất");
        BtLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLogOutActionPerformed(evt);
            }
        });

        BtSearch.setText("Danh sách các phòng");
        BtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSearchActionPerformed(evt);
            }
        });

        BtUpdateRoom.setText("Thay Đổi Phòng");
        BtUpdateRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtUpdateRoomActionPerformed(evt);
            }
        });

        BtAddRoom.setText("Thêm Phòng");
        BtAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAddRoomActionPerformed(evt);
            }
        });

        BDeleteRoom.setText("Xóa Phòng");
        BDeleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDeleteRoomActionPerformed(evt);
            }
        });

        BTInfoCustomer.setText("Hồ sơ khách hàng");
        BTInfoCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTInfoCustomerActionPerformed(evt);
            }
        });

        BtDanhGia.setText("Xem đánh giá");
        BtDanhGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDanhGiaActionPerformed(evt);
            }
        });

        ListBill.setText("Danh sách hóa đơn");
        ListBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBillActionPerformed(evt);
            }
        });

        BTExit.setText("Thoát");
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
                .addGap(229, 229, 229)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BtUpdateRoom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addComponent(BtAddRoom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BDeleteRoom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BTInfoCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(BtInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtDanhGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TitleHITHotelManager, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(BTExit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(TitleHITHotelManager, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTInfoCustomer)
                    .addComponent(ListBill))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BDeleteRoom)
                    .addComponent(BtDanhGia))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtUpdateRoom)
                    .addComponent(BtInfo))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtAddRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtSearch))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtLogOut)
                    .addComponent(BTExit))
                .addGap(121, 121, 121))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // BUTTON Infor
    private void BtInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInfoActionPerformed
        new InfoUser(currentUser);
        this.dispose();
        if(currentUser != null ){
            System.out.println("thong tin tai khoan: ");
            currentUser.display();
        }
        else{
            System.out.println("khong co nguoi dung");
        }

    }//GEN-LAST:event_BtInfoActionPerformed
    
    // BUTTON Logout
    private void BtLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLogOutActionPerformed
        new Login(currentUser);
        this.dispose();
        if(currentUser!= null){
            System.out.println("Dang xuat thanh cong");
            currentUser = null;
            System.out.println("CurentUser: " + currentUser);
        }
    }//GEN-LAST:event_BtLogOutActionPerformed
    
    
    // BUTTOn FindRoom
    private void BtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSearchActionPerformed
        new ListRoomAdmin(currentUser);
        this.dispose();
        System.out.println("thuc hien xem cac phong");
    }//GEN-LAST:event_BtSearchActionPerformed

    
    // BUTTON UPDATE Room;
    private void BtUpdateRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtUpdateRoomActionPerformed
        if(currentUser!= null){
            System.out.println("nguoi dung hien tai: " + currentUser.getName());
            System.out.println("thuc hien update phong!");
            this.dispose();
            new UpdateRoom(currentUser,room);  
        }
        else{
            this.dispose();
            new UpdateRoom(currentUser,room);
        }
        
        
    }//GEN-LAST:event_BtUpdateRoomActionPerformed

    
    // BUTTON AddRoom
    private void BtAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAddRoomActionPerformed
       
        if(currentUser!= null){
            new AddRoom(currentUser,room);
            this.dispose();
            System.out.println("nguoi dung hien tai: " + currentUser.getName());
            System.out.println("thuc hien them phong!");
        }
        else{
            new AddRoom(currentUser,room);
            this.dispose();
        }
        
        
        
    }//GEN-LAST:event_BtAddRoomActionPerformed
    
    // BUTTON Delete
    private void BDeleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeleteRoomActionPerformed
        if(currentUser!= null){
            new DeleteRoom(currentUser,room);
            this.dispose();
            System.out.println("nguoi dung hien tai: " + currentUser.getName());
            System.out.println("thuc hien xoa phong!");
        }
        else{
           new DeleteRoom(currentUser,room);
           this.dispose();
        }
       
    }//GEN-LAST:event_BDeleteRoomActionPerformed
    
    
    // BUTTON inforCustomer
    private void BTInfoCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTInfoCustomerActionPerformed
        new CustomerProfile(currentUser);
        this.dispose();
        System.out.println("Thuc hien xem ho so khach hang!");
    }//GEN-LAST:event_BTInfoCustomerActionPerformed
    
    
    // BUTTON Comments
    private void BtDanhGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDanhGiaActionPerformed
        new Comments(currentUser);
        this.dispose();
        System.out.println("thuc hien xem danh gia");
        
    }//GEN-LAST:event_BtDanhGiaActionPerformed
    
    // BUTTON List Bill
    private void ListBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBillActionPerformed
        new ListBill(currentUser);
        this.dispose();
        System.out.println("thuc hien xem danh sach hoa don");
    }//GEN-LAST:event_ListBillActionPerformed

    private void BTExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTExitActionPerformed

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
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeAdmin(currentUser);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BDeleteRoom;
    private javax.swing.JButton BTExit;
    private javax.swing.JButton BTInfoCustomer;
    private javax.swing.JButton BtAddRoom;
    private javax.swing.JButton BtDanhGia;
    private javax.swing.JButton BtInfo;
    private javax.swing.JButton BtLogOut;
    private javax.swing.JButton BtSearch;
    private javax.swing.JButton BtUpdateRoom;
    private javax.swing.JButton ListBill;
    private javax.swing.JLabel TitleHITHotelManager;
    // End of variables declaration//GEN-END:variables
}
