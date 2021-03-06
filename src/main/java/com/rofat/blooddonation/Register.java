/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rofat.blooddonation;

import com.rofat.blooddonation.Class.GlobalFuntions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rofat
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form testJframe
     */
    Map<String, Object> oldData = new HashMap<>();

    String[] fields = {"Full Name", "Gender", "Date of Birth", "Blood Type", "User Type"};
    GlobalFuntions f = new GlobalFuntions(fields);

    public Register() {
        initComponents();
    }

    public Register(Map<String, Object> obj) {
        initComponents();
        oldData = obj;

        f.setObject(oldData);
        setFields();
        f.setForeColor(txtDOB);
        f.setForeColor(txtFullName);
    }

    private void setFields() {
        f.checkAndAssignValueToTF(txtFullName, "Full Name");
        f.checkAndAssignValueToCB(cbGender, "Gender");
        f.checkAndAssignValueToTF(txtDOB, "Date of Birth");
        f.checkAndAssignValueToCB(cbBloodType, "Blood Type");
        f.checkAndAssignValueToCB(cbUserType, "User Type");
    }

    private Map<String, Object> setObject() {
        Map<String, Object> obj = new HashMap<>();
        obj.put(fields[0], txtFullName.getText());
        obj.put(fields[1], cbGender.getSelectedItem());
        obj.put(fields[2], txtDOB.getText());
        obj.put(fields[3], cbBloodType.getSelectedItem());
        obj.put(fields[4], cbUserType.getSelectedItem());
        return obj;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        banner = new javax.swing.JLabel();
        lbBasicInfo = new javax.swing.JLabel();
        btnDiscard = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        basicInfoPnl = new javax.swing.JPanel();
        txtFullName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        cbGender = new javax.swing.JComboBox<>();
        cbBloodType = new javax.swing.JComboBox<>();
        cbUserType = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 700));

        banner.setBackground(new java.awt.Color(153, 0, 102));
        banner.setForeground(new java.awt.Color(153, 0, 153));
        banner.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        banner.setToolTipText("");
        banner.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lbBasicInfo.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        lbBasicInfo.setForeground(new java.awt.Color(204, 0, 0));
        lbBasicInfo.setText("BASIC INFO");

        btnDiscard.setBackground(java.awt.Color.red);
        btnDiscard.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnDiscard.setForeground(new java.awt.Color(255, 255, 255));
        btnDiscard.setText("Discard");
        btnDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardActionPerformed(evt);
            }
        });

        btnNext.setBackground(java.awt.Color.red);
        btnNext.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        basicInfoPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtFullName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtFullName.setForeground(new java.awt.Color(204, 204, 204));
        txtFullName.setText("Full Name");
        txtFullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFullNameMouseClicked(evt);
            }
        });

        txtDOB.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtDOB.setForeground(new java.awt.Color(204, 204, 204));
        txtDOB.setText("Date of Birth");
        txtDOB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDOBMouseClicked(evt);
            }
        });

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gender", "MALE", "FEMALE" }));

        cbBloodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood Type", "A-", "A+", "B-", "B+", "AB-", "AB+", "O-", "O+" }));

        cbUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User Type", "USER", "HOSPITAL" }));

        javax.swing.GroupLayout basicInfoPnlLayout = new javax.swing.GroupLayout(basicInfoPnl);
        basicInfoPnl.setLayout(basicInfoPnlLayout);
        basicInfoPnlLayout.setHorizontalGroup(
            basicInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicInfoPnlLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(basicInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbUserType, 0, 489, Short.MAX_VALUE)
                    .addComponent(cbGender, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbBloodType, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFullName)
                    .addComponent(txtDOB, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        basicInfoPnlLayout.setVerticalGroup(
            basicInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicInfoPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(cbBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(cbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(banner)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(basicInfoPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lbBasicInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnDiscard, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner)
                .addGap(7, 7, 7)
                .addComponent(lbBasicInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(basicInfoPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDiscard)
                    .addComponent(btnNext))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDOBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDOBMouseClicked
        // TODO add your handling code here:
        f.clearTextBox(txtDOB);
    }//GEN-LAST:event_txtDOBMouseClicked

    private void txtFullNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFullNameMouseClicked
        // TODO add your handling code here:
        f.clearTextBox(txtFullName);
    }//GEN-LAST:event_txtFullNameMouseClicked

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        oldData.putAll(setObject());
        RegisterAddress jframe = new RegisterAddress(oldData);
        jframe.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardActionPerformed
        // TODO add your handling code here:
        Login jframe = new Login();
        jframe.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDiscardActionPerformed


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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JPanel basicInfoPnl;
    private javax.swing.JButton btnDiscard;
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox<String> cbBloodType;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JComboBox<String> cbUserType;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel lbBasicInfo;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtFullName;
    // End of variables declaration//GEN-END:variables
}
