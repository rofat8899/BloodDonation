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
public class BloodRequest extends javax.swing.JFrame {

    /**
     * Creates new form BloodRequest
     */
 Api api = new Api();
    User usr = new User();
Border border = BorderFactory.createLineBorder(Color.RED, 2);
Border noborder = BorderFactory.createLineBorder(Color.RED, 0);
String bloodType;
    public BloodRequest() throws IOException {
        initComponents();
usr = api.getUser("rofat@gmail.com");
    }
 public BloodRequest(User user) {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAplus = new javax.swing.JLabel();
        btnAminus = new javax.swing.JLabel();
        btnBplus = new javax.swing.JLabel();
        btnBminus = new javax.swing.JLabel();
        btnOplus = new javax.swing.JLabel();
        btnOminus = new javax.swing.JLabel();
        btnABplus = new javax.swing.JLabel();
        btnABminus = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemark = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(545, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(545, 700));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\BloodDonation\\image\\Rectangle 96-1.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Blood Type");

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

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setText("Remark");

        txtRemark.setColumns(20);
        txtRemark.setRows(5);
        jScrollPane1.setViewportView(txtRemark);

        btnSubmit.setBackground(new java.awt.Color(255, 0, 0));
        btnSubmit.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnAplus))
                                    .addComponent(btnOplus, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnOminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBplus)
                                    .addComponent(btnABplus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBminus, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnABminus, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(37, 37, 37))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAplus))
                    .addComponent(btnBminus)
                    .addComponent(btnBplus)
                    .addComponent(btnAminus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOplus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOminus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnABplus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnABminus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addContainerGap(36, Short.MAX_VALUE))
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

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // TODO add your handling code here:
Map<String,Object> obj = new HashMap<>();
obj.put("requestEmail", usr.getEmail());
obj.put("requestBloodType", bloodType);
obj.put("remark",txtRemark.getText());
   try {
              api.AddBloodRequest(obj);
                HomePage t = new HomePage(usr);
                 t.setVisible(true); 
                dispose();
            } catch (IOException ex) {
                Logger.getLogger(DonateBlood.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnSubmitMouseClicked
    
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
            java.util.logging.Logger.getLogger(BloodRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {            
                try {
                    new BloodRequest().setVisible(true);
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
    private javax.swing.JLabel btnOminus;
    private javax.swing.JLabel btnOplus;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtRemark;
    // End of variables declaration//GEN-END:variables
}
