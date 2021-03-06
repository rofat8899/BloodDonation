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
public class RegisterAddress extends javax.swing.JFrame {

    /**
     * Creates new form testJframe
     */
    Map<String, Object> oldData = new HashMap<>();

    String[] fields = {"Street No", "Village", "Commune", "District", "Province"};
    GlobalFuntions f = new GlobalFuntions(fields);

    public RegisterAddress() {
        initComponents();
    }

    public RegisterAddress(Map<String, Object> obj) {
        initComponents();
        oldData = obj;

        f.setObject(oldData);
        setFields();
        f.setForeColor(txtStreetNo);
        f.setForeColor(txtVillage);
        f.setForeColor(txtCommune);
        f.setForeColor(txtDistrict);
        f.setForeColor(txtProvince);
    }

    private void setFields() {
        f.checkAndAssignValueToTF(txtStreetNo, "Street No");
        f.checkAndAssignValueToTF(txtVillage, "Village");
        f.checkAndAssignValueToTF(txtCommune, "Commune");
        f.checkAndAssignValueToTF(txtDistrict, "District");
        f.checkAndAssignValueToTF(txtProvince, "Province");
    }

    private Map<String, Object> setObject() {
        Map<String, Object> obj = new HashMap<>();
        obj.put("Street No", txtStreetNo.getText());
        obj.put("Village", txtVillage.getText());
        obj.put("Commune", txtCommune.getText());
        obj.put("District", txtDistrict.getText());
        obj.put("Province", txtProvince.getText());
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
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        basicInfoPnl = new javax.swing.JPanel();
        txtStreetNo = new javax.swing.JTextField();
        txtVillage = new javax.swing.JTextField();
        txtCommune = new javax.swing.JTextField();
        txtDistrict = new javax.swing.JTextField();
        txtProvince = new javax.swing.JTextField();

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
        banner.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\testing\\image\\Register-banner.png")); // NOI18N
        banner.setToolTipText("");
        banner.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lbBasicInfo.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        lbBasicInfo.setForeground(new java.awt.Color(204, 0, 0));
        lbBasicInfo.setText("ADDRESS");

        btnPrevious.setBackground(java.awt.Color.red);
        btnPrevious.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
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

        txtStreetNo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtStreetNo.setForeground(new java.awt.Color(204, 204, 204));
        txtStreetNo.setText("Street No");
        txtStreetNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtStreetNoMouseClicked(evt);
            }
        });

        txtVillage.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtVillage.setForeground(new java.awt.Color(204, 204, 204));
        txtVillage.setText("Village");
        txtVillage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtVillageMouseClicked(evt);
            }
        });

        txtCommune.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtCommune.setForeground(new java.awt.Color(204, 204, 204));
        txtCommune.setText("Commune");
        txtCommune.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCommuneMouseClicked(evt);
            }
        });

        txtDistrict.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtDistrict.setForeground(new java.awt.Color(204, 204, 204));
        txtDistrict.setText("District");
        txtDistrict.setToolTipText("");
        txtDistrict.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDistrictMouseClicked(evt);
            }
        });

        txtProvince.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtProvince.setForeground(new java.awt.Color(204, 204, 204));
        txtProvince.setText("Province");
        txtProvince.setToolTipText("");
        txtProvince.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProvinceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout basicInfoPnlLayout = new javax.swing.GroupLayout(basicInfoPnl);
        basicInfoPnl.setLayout(basicInfoPnlLayout);
        basicInfoPnlLayout.setHorizontalGroup(
                basicInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(basicInfoPnlLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(basicInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtVillage, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtStreetNo, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCommune, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(27, Short.MAX_VALUE))
        );
        basicInfoPnlLayout.setVerticalGroup(
                basicInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(basicInfoPnlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtStreetNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVillage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(btnPrevious)
                                        .addComponent(btnNext))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProvinceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProvinceMouseClicked
        // TODO add your handling code here:
        f.clearTextBox(txtProvince);
    }//GEN-LAST:event_txtProvinceMouseClicked

    private void txtDistrictMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDistrictMouseClicked
        // TODO add your handling code here:
        f.clearTextBox(txtDistrict);
    }//GEN-LAST:event_txtDistrictMouseClicked

    private void txtCommuneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCommuneMouseClicked
        // TODO add your handling code here:
        f.clearTextBox(txtCommune);
    }//GEN-LAST:event_txtCommuneMouseClicked

    private void txtVillageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVillageMouseClicked
        // TODO add your handling code here:
        f.clearTextBox(txtVillage);
    }//GEN-LAST:event_txtVillageMouseClicked

    private void txtStreetNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStreetNoMouseClicked
        // TODO add your handling code here:
        f.clearTextBox(txtStreetNo);
    }//GEN-LAST:event_txtStreetNoMouseClicked

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        oldData.putAll(setObject());
        RegisterContact jframe = new RegisterContact(oldData);
        jframe.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        oldData.putAll(setObject());
        Register jframe = new Register(oldData);
        jframe.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPreviousActionPerformed


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
            java.util.logging.Logger.getLogger(RegisterAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterAddress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JPanel basicInfoPnl;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel lbBasicInfo;
    private javax.swing.JTextField txtCommune;
    private javax.swing.JTextField txtDistrict;
    private javax.swing.JTextField txtProvince;
    private javax.swing.JTextField txtStreetNo;
    private javax.swing.JTextField txtVillage;
    // End of variables declaration//GEN-END:variables
}
