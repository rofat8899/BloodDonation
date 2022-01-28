/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rofat.blooddonation;

import com.rofat.blooddonation.Class.Api;
import dto.User;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author rofat
 */
public class Hospital extends javax.swing.JFrame {

    /**
     * Creates new form BloodRequest
     */
 Api api = new Api();
    User usr = new User();
Border border = BorderFactory.createLineBorder(Color.RED, 2);
Border noborder = BorderFactory.createLineBorder(Color.RED, 0);
String bloodType;
    public Hospital() throws IOException {
        initComponents();
usr = api.getUser("rofat@gmail.com");
    }
 public Hospital(User user) {
        initComponents();
usr=user;
    }
    private void setBorder(JLabel jlb){
    String bloodTypes[] = {"AB-","AB+","A+","A-","B+","B-","O+","O-"};
     List<JLabel> lb = new ArrayList<>();
     lb.add(btnABminus);
     lb.add(btnABplus);
     lb.add(btnAplus);
     lb.add(btnAminus);
     lb.add(btnBplus);
     lb.add(btnBminus);
     lb.add(btnOplus);
     lb.add(btnOminus);
     for(String eachType:bloodTypes){
         for(JLabel eachlb:lb)
    {
      if(eachlb==jlb)
        {
          jlb.setBorder(border);
          bloodType=eachType;
        }
      else{
    eachlb.setBorder(noborder);
    }
    }
    }
    
     
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAplus = new javax.swing.JLabel();
        btnAminus = new javax.swing.JLabel();
        btnBplus = new javax.swing.JLabel();
        btnBminus = new javax.swing.JLabel();
        btnOplus = new javax.swing.JLabel();
        btnOminus = new javax.swing.JLabel();
        btnABplus = new javax.swing.JLabel();
        btnABminus = new javax.swing.JLabel();
        btnRequestBlood = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnDonateBlood = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(545, 700));

        btnAplus.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\BloodDonation\\image\\R-A+.png")); // NOI18N
        btnAplus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAplusMouseClicked(evt);
            }
        });

        btnAminus.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\BloodDonation\\image\\R-A-.png")); // NOI18N
        btnAminus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAminusMouseClicked(evt);
            }
        });

        btnBplus.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\BloodDonation\\image\\R-B+.png")); // NOI18N
        btnBplus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBplusMouseClicked(evt);
            }
        });

        btnBminus.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\BloodDonation\\image\\R-B-.png")); // NOI18N
        btnBminus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBminusMouseClicked(evt);
            }
        });

        btnOplus.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\BloodDonation\\image\\R-O+.png")); // NOI18N
        btnOplus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOplusMouseClicked(evt);
            }
        });

        btnOminus.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\BloodDonation\\image\\R-O-.png")); // NOI18N
        btnOminus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOminusMouseClicked(evt);
            }
        });

        btnABplus.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\BloodDonation\\image\\R-AB+.png")); // NOI18N
        btnABplus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnABplusMouseClicked(evt);
            }
        });

        btnABminus.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\BloodDonation\\image\\R-AB-.png")); // NOI18N
        btnABminus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnABminusMouseClicked(evt);
            }
        });

        btnRequestBlood.setBackground(new java.awt.Color(255, 0, 0));
        btnRequestBlood.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnRequestBlood.setForeground(new java.awt.Color(255, 255, 255));
        btnRequestBlood.setText("Request Blood");
        btnRequestBlood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRequestBloodMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("HOSPITAL NAME");

        btnDonateBlood.setBackground(new java.awt.Color(255, 0, 0));
        btnDonateBlood.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnDonateBlood.setForeground(new java.awt.Color(255, 255, 255));
        btnDonateBlood.setText("Donate Blood");
        btnDonateBlood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDonateBloodMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\BloodDonation\\image\\hospital-logo.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRequestBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAplus)
                                    .addComponent(btnOplus, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOminus)
                                    .addComponent(btnAminus))))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBplus)
                                    .addComponent(btnABplus))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnABminus)
                                    .addComponent(btnBminus)))
                            .addComponent(btnDonateBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(116, 116, 116)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAplus)
                    .addComponent(btnBminus)
                    .addComponent(btnBplus)
                    .addComponent(btnAminus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOplus)
                    .addComponent(btnOminus)
                    .addComponent(btnABminus)
                    .addComponent(btnABplus))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRequestBlood)
                    .addComponent(btnDonateBlood))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAplusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAplusMouseClicked
        // TODO add your handling code here:
         setBorder(btnAplus);
    }//GEN-LAST:event_btnAplusMouseClicked

    private void btnAminusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAminusMouseClicked
        // TODO add your handling code here:
  setBorder(btnAminus);
    }//GEN-LAST:event_btnAminusMouseClicked

    private void btnBplusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBplusMouseClicked
        // TODO add your handling code here:
  setBorder(btnBplus);
    }//GEN-LAST:event_btnBplusMouseClicked

    private void btnBminusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBminusMouseClicked
        // TODO add your handling code here:
  setBorder(btnBminus);
    }//GEN-LAST:event_btnBminusMouseClicked

    private void btnOplusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOplusMouseClicked
        // TODO add your handling code here:
  setBorder(btnOplus);
    }//GEN-LAST:event_btnOplusMouseClicked

    private void btnOminusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOminusMouseClicked
        // TODO add your handling code here:
  setBorder(btnOminus);
    }//GEN-LAST:event_btnOminusMouseClicked

    private void btnABplusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnABplusMouseClicked
        // TODO add your handling code here:
  setBorder(btnABplus);
    }//GEN-LAST:event_btnABplusMouseClicked

    private void btnABminusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnABminusMouseClicked
        // TODO add your handling code here:
  setBorder(btnABminus);
    }//GEN-LAST:event_btnABminusMouseClicked

    private void btnRequestBloodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRequestBloodMouseClicked
        // TODO add your handling code here:
//Map<String,Object> obj = new HashMap<>();
//obj.put("requestEmail", usr.getEmail());
//obj.put("requestBloodType", bloodType);
//obj.put("remark",txtRemark.getText());
//   try {
//              api.AddBloodRequest(obj);
//                HomePage t = new HomePage(usr);
//                 t.setVisible(true); 
//                dispose();
//            } catch (IOException ex) {
//                Logger.getLogger(DonateBlood.class.getName()).log(Level.SEVERE, null, ex);
//            }
    }//GEN-LAST:event_btnRequestBloodMouseClicked

    private void btnDonateBloodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDonateBloodMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDonateBloodMouseClicked
    
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
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {            
                try {
                    new Hospital().setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnABminus;
    private javax.swing.JLabel btnABplus;
    private javax.swing.JLabel btnAminus;
    private javax.swing.JLabel btnAplus;
    private javax.swing.JLabel btnBminus;
    private javax.swing.JLabel btnBplus;
    private javax.swing.JButton btnDonateBlood;
    private javax.swing.JLabel btnOminus;
    private javax.swing.JLabel btnOplus;
    private javax.swing.JButton btnRequestBlood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}