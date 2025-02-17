package View;

import Model.Bill;
import Model.User;
import dao.BillDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class CustomerBill extends javax.swing.JFrame {
    
    private static User currentUser;
    private static DefaultTableModel tableModel;

    public CustomerBill(User currentUser) {
        this.currentUser = currentUser;
        this.setUndecorated(true);
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        tableModel = new DefaultTableModel() {
        @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép chỉnh sửa ô nào trong bảng
            }
        };
        
        tableModel.setColumnIdentifiers(new String[]{"id","create_date","name","phoneNumber","number","type","checkin","checkout","pice"});
        TableBill.setModel(tableModel);
        loadData();
        
        
    }
    private void loadData() {
        tableModel.setRowCount(0);
        ArrayList<Bill> list = BillDAO.getInstance().selectById(currentUser.getName());
            for(Bill b: list){
                tableModel.addRow(new Object[]{b.getId(),b.getCreateDate(),b.getName(),b.getPhoneNumber(),b.getNumber(),b.getType(),b.getCheckIn(),b.getCheckOut(),b.getPrice()});
        }           
        TableBill.getColumnModel().getColumn(0).setPreferredWidth(50);  // ID
        TableBill.getColumnModel().getColumn(1).setPreferredWidth(200); // create_date
        TableBill.getColumnModel().getColumn(2).setPreferredWidth(120); // name
        TableBill.getColumnModel().getColumn(3).setPreferredWidth(130); // PhoneNumber
        TableBill.getColumnModel().getColumn(4).setPreferredWidth(110); // number
        TableBill.getColumnModel().getColumn(5).setPreferredWidth(100); // type
        TableBill.getColumnModel().getColumn(6).setPreferredWidth(220); // checkin
        TableBill.getColumnModel().getColumn(7).setPreferredWidth(220); // checkout
        TableBill.getColumnModel().getColumn(8).setPreferredWidth(140); // price
    }
      
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableBill = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Bill");

        BtBack.setText("Back");
        BtBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBackActionPerformed(evt);
            }
        });

        TableBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "create date", "customer name", "phone number", "number", "type", "checkin", "checkout", "price"
            }
        ));
        TableBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBillMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableBill);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(BtBack, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(BtBack)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // BUTTON BACK
    private void BtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBackActionPerformed
        new ListRoomCustomer(currentUser);
        this.dispose();
        System.out.println("nguoi dung hien tai: " + currentUser.getName());

    }//GEN-LAST:event_BtBackActionPerformed
    
    
    private void TableBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBillMouseClicked
//        int selectedRow = TableBill.getSelectedRow();
//        if (selectedRow != -1) {
//            int confirm = javax.swing.JOptionPane.showConfirmDialog(
//                this,
//                "Bạn có chắc chắn muốn xóa hóa đơn này?",
//                "Xác nhận trả phòng",
//                javax.swing.JOptionPane.YES_NO_OPTION
//            );
//
//            if (confirm == javax.swing.JOptionPane.YES_OPTION) {
//
//                int roomNumber = (int) tableModel.getValueAt(selectedRow, 0);
//
//                // xóa khỏi database
//                BillDAO.getInstance().delete(roomNumber);
//
//                // Xóa khỏi bảng hiển thị
//                tableModel.removeRow(selectedRow);
//                javax.swing.JOptionPane.showMessageDialog(this, "Xóa thành công!");
//            }
//        }
    }//GEN-LAST:event_TableBillMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerBill(currentUser);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBack;
    private javax.swing.JTable TableBill;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
