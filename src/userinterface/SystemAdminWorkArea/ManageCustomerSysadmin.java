/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kunwa
 */
public class ManageCustomerSysadmin extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerSysadmin
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount user;

    public ManageCustomerSysadmin(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateCustomersTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public void populateCustomersTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblCustomersManageCustomers.getModel();

        tablemodel.setRowCount(0);
        for (UserAccount user : ecosystem.getUserAccountDirectory().getUserAccountList()) {
            if (user.getRole().getClass().getName() == "Business.Role.CustomerRole") {
                Object[] row = new Object[3];
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();

                tablemodel.addRow(row);
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsernameManageCutomers = new javax.swing.JTextField();
        txtPasswordManageCustomers = new javax.swing.JTextField();
        txtNameManageCustomers = new javax.swing.JTextField();
        btnSaveManageCustomers = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomersManageCustomers = new javax.swing.JTable();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        jLabel1.setText("name:");

        jLabel2.setText("username:");

        jLabel3.setText("password:");

        btnSaveManageCustomers.setText("Add");
        btnSaveManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveManageCustomersActionPerformed(evt);
            }
        });

        tblCustomersManageCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "name", "username", "password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomersManageCustomers);

        btnupdate.setText("update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnsave.setText("save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 429, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPasswordManageCustomers))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNameManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsernameManageCutomers)))
                        .addGap(267, 267, 267)
                        .addComponent(btnback))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnSaveManageCustomers))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnupdate)
                        .addGap(26, 26, 26)
                        .addComponent(btndelete)
                        .addGap(28, 28, 28)
                        .addComponent(btnsave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNameManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnback)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsernameManageCutomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPasswordManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSaveManageCustomers)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(btnsave))
                .addContainerGap(186, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveManageCustomersActionPerformed
        // TODO add your handling code here:
        if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtUsernameManageCutomers.getText())) {
            UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount(txtNameManageCustomers.getText(), txtUsernameManageCutomers.getText(), txtPasswordManageCustomers.getText(), null, new CustomerRole());
            Customer customer = ecosystem.getCustomerDirectory().createUserAccount(txtUsernameManageCutomers.getText());
            populateCustomersTable();
            txtNameManageCustomers.setText("");
            txtUsernameManageCutomers.setText("");
            txtPasswordManageCustomers.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Username is not unique");
        }
    }//GEN-LAST:event_btnSaveManageCustomersActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblCustomersManageCustomers.getSelectedRow();

if(selectRow>=0){
String name = (String) tblCustomersManageCustomers.getValueAt(selectRow, 0);
String username= (String) tblCustomersManageCustomers.getValueAt(selectRow, 1);
String password= (String) tblCustomersManageCustomers.getValueAt(selectRow, 2);
user=ecosystem.getUserAccountDirectory().authenticateUser(username, password);
txtNameManageCustomers.setText(name+"");
txtPasswordManageCustomers.setText(username+"");
txtUsernameManageCutomers.setText(password+"");

JOptionPane.showMessageDialog(null,"Please press save button to save the profile after updating the text field");

}
else {
JOptionPane.showMessageDialog(null,"Please select a row to update a profile");
}
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCustomersManageCustomers.getSelectedRow();
if(selectedRow>=0){
int selectionButton = JOptionPane.YES_NO_OPTION;
int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?","Warning",selectionButton);
if(selectionResult == JOptionPane.YES_OPTION){
String username= (String) tblCustomersManageCustomers.getValueAt(selectedRow, 1);
String pwd= (String) tblCustomersManageCustomers.getValueAt(selectedRow, 2);
UserAccount user=ecosystem.getUserAccountDirectory().authenticateUser(username, pwd);
ecosystem.getUserAccountDirectory().deleteUserAccount(user);
ecosystem.getCustomerDirectory().deleteCustomer(user.getUsername());
populateCustomersTable();
}
}else{
JOptionPane.showMessageDialog(null, "Please select a row to delete the account");
}
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        ecosystem.getUserAccountDirectory().updateUserAccount(user, txtNameManageCustomers.getText(), txtUsernameManageCutomers.getText(), txtPasswordManageCustomers.getText());
populateCustomersTable();



txtNameManageCustomers.setText("");
txtUsernameManageCutomers.setText("");
txtPasswordManageCustomers.setText("");
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveManageCustomers;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomersManageCustomers;
    private javax.swing.JTextField txtNameManageCustomers;
    private javax.swing.JTextField txtPasswordManageCustomers;
    private javax.swing.JTextField txtUsernameManageCutomers;
    // End of variables declaration//GEN-END:variables
}
