/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rofat.blooddonation;

import com.rofat.blooddonation.Class.Api;
import dto.BloodDonation;
import dto.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rofat
 */
public class FindDonor extends javax.swing.JFrame {

    /**
     * Creates new form BloodRequest
     */
    List<User> donor = new ArrayList<>();
    Api api = new Api();
    User usr = new User();
    List<String> availability = new ArrayList<>();
    List<BloodDonation> result = api.getAllDonorPending();
    public FindDonor() throws IOException {
        initComponents();
        usr = api.getUser("rofat@gmail.com");
 loadData(result);
    }

    public FindDonor(User user) throws IOException {
        initComponents();
        usr = user;
        loadData(result);
    }

    private void loadData( List<BloodDonation> donors) throws IOException {
System.out.print("Check");
      System.out.print(result.size());
        for (int i = 0; i < result.size(); i++) {
            
         
            switch (i) {
                case 0:
                    donor.add(i,api.getUser(donors.get(i).getDonorEmail()));                   
                    txtDonorname1.setText(donor.get(i).getName());
                    txtGenderAge1.setText(donor.get(i).getGender()+ ", " + donor.get(i).getAge());
                    txtAvailability1.setText(donors.get(i).getAvailableDate()); 
                    availability.add(donors.get(i).getAvailableDate()); 
                    pn1.setVisible(true);                 
                    pn2.setVisible(false);
                    pn3.setVisible(false);
                    pn4.setVisible(false);
                    pn5.setVisible(false);
                    break;
                case 1:
                    donor.add(i,api.getUser(donors.get(i).getDonorEmail()));                
                    txtDonorname2.setText(donor.get(i).getName());
                    txtGenderAge2.setText(donor.get(i).getGender() + ", " + donor.get(i).getAge());
                    txtAvailability2.setText(donors.get(i).getAvailableDate());
                    availability.add(donors.get(i).getAvailableDate());    
                    pn2.setVisible(true);
                    pn3.setVisible(false);
                    pn4.setVisible(false);
                    pn5.setVisible(false);
                    break;
                case 2:     
                    donor.add(i,api.getUser(donors.get(i).getDonorEmail()));             
                    txtDonorname3.setText(donor.get(i).getName());
                    txtGenderAge3.setText(donor.get(i).getGender()+ ", " + donor.get(i).getAge());
                    txtAvailability3.setText(donors.get(i).getAvailableDate());
                    availability.add(donors.get(i).getAvailableDate());    
                    pn3.setVisible(true);
                    pn4.setVisible(false);
                    pn5.setVisible(false);
                    break;
                case 3:   
                    donor.add(i,api.getUser(donors.get(i).getDonorEmail()));               
                    txtDonorname4.setText(donor.get(i).getName());
                    txtGenderAge4.setText(donor.get(i).getGender()+ ", " + donor.get(i).getAge());
                    txtAvailability4.setText(donors.get(i).getAvailableDate());
                    availability.add(donors.get(i).getAvailableDate());    
                    pn4.setVisible(true);
                    pn5.setVisible(false);
                    break;
                case 4:       
                    donor.add(i,api.getUser(donors.get(i).getDonorEmail()));           
                    txtDonorname5.setText(donor.get(i).getName());
                    txtGenderAge5.setText(donor.get(i).getGender() + ", " + donor.get(i).getAge());
                    txtAvailability5.setText(donors.get(i).getAvailableDate());
                    availability.add(donors.get(i).getAvailableDate());    
                    pn5.setVisible(true);
                    break;
                default: break;

            }
        }

    }
    private void resetData(){
    txtDonorname1.setText("");
                    txtGenderAge1.setText("");
                    txtAvailability1.setText(""); 
 txtDonorname2.setText("");
                    txtGenderAge2.setText("");
                    txtAvailability2.setText(""); 
txtDonorname3.setText("");
                    txtGenderAge3.setText("");
                    txtAvailability3.setText(""); 
txtDonorname4.setText("");
                    txtGenderAge4.setText("");
                    txtAvailability4.setText(""); 
txtDonorname5.setText("");
                    txtGenderAge5.setText("");
                    txtAvailability5.setText(""); 
pn1.setVisible(false);
 pn2.setVisible(false);
                    pn3.setVisible(false);
                    pn4.setVisible(false);
                    pn5.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbBloodType = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        pn1 = new javax.swing.JPanel();
        txtDonorname1 = new javax.swing.JLabel();
        txtGenderAge1 = new javax.swing.JLabel();
        txtAvailability1 = new javax.swing.JLabel();
        pn2 = new javax.swing.JPanel();
        txtDonorname2 = new javax.swing.JLabel();
        txtGenderAge2 = new javax.swing.JLabel();
        txtAvailability2 = new javax.swing.JLabel();
        pn3 = new javax.swing.JPanel();
        txtDonorname3 = new javax.swing.JLabel();
        txtGenderAge3 = new javax.swing.JLabel();
        txtAvailability3 = new javax.swing.JLabel();
        pn4 = new javax.swing.JPanel();
        txtDonorname4 = new javax.swing.JLabel();
        txtGenderAge4 = new javax.swing.JLabel();
        txtAvailability4 = new javax.swing.JLabel();
        pn5 = new javax.swing.JPanel();
        txtDonorname5 = new javax.swing.JLabel();
        txtGenderAge5 = new javax.swing.JLabel();
        txtAvailability5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(545, 700));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\BloodDonation\\image\\finddonor-banner.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Find Donor");

        cbBloodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood-Type", "A-", "A+", "B-", "B+", "AB-", "AB+", "O-", "O+" }));

        btnSearch.setBackground(new java.awt.Color(255, 0, 0));
        btnSearch.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        pn1.setBackground(new java.awt.Color(255, 255, 255));
        pn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn1MouseClicked(evt);
            }
        });

        txtDonorname1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtDonorname1.setText("Donor Name");

        txtGenderAge1.setText("Gender,Age");

        txtAvailability1.setText("Availability");

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDonorname1)
                    .addComponent(txtGenderAge1)
                    .addComponent(txtAvailability1))
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addComponent(txtDonorname1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGenderAge1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAvailability1))
        );

        pn2.setBackground(new java.awt.Color(255, 255, 255));
        pn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn2MouseClicked(evt);
            }
        });

        txtDonorname2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtDonorname2.setText("Donor Name");

        txtGenderAge2.setText("Gender,Age");

        txtAvailability2.setText("Availability");

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDonorname2)
                    .addComponent(txtGenderAge2)
                    .addComponent(txtAvailability2))
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addComponent(txtDonorname2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGenderAge2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAvailability2))
        );

        pn3.setBackground(new java.awt.Color(255, 255, 255));
        pn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn3MouseClicked(evt);
            }
        });

        txtDonorname3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtDonorname3.setText("Donor Name");

        txtGenderAge3.setText("Gender,Age");

        txtAvailability3.setText("Availability");

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDonorname3)
                    .addComponent(txtGenderAge3)
                    .addComponent(txtAvailability3))
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addComponent(txtDonorname3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGenderAge3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAvailability3))
        );

        pn4.setBackground(new java.awt.Color(255, 255, 255));
        pn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn4MouseClicked(evt);
            }
        });

        txtDonorname4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtDonorname4.setText("Donor Name");

        txtGenderAge4.setText("Gender,Age");

        txtAvailability4.setText("Availability");

        javax.swing.GroupLayout pn4Layout = new javax.swing.GroupLayout(pn4);
        pn4.setLayout(pn4Layout);
        pn4Layout.setHorizontalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDonorname4)
                    .addComponent(txtGenderAge4)
                    .addComponent(txtAvailability4))
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pn4Layout.setVerticalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createSequentialGroup()
                .addComponent(txtDonorname4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGenderAge4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAvailability4))
        );

        pn5.setBackground(new java.awt.Color(255, 255, 255));
        pn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn5MouseClicked(evt);
            }
        });

        txtDonorname5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtDonorname5.setText("Donor Name");

        txtGenderAge5.setText("Gender,Age");

        txtAvailability5.setText("Availability");

        javax.swing.GroupLayout pn5Layout = new javax.swing.GroupLayout(pn5);
        pn5.setLayout(pn5Layout);
        pn5Layout.setHorizontalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDonorname5)
                    .addComponent(txtGenderAge5)
                    .addComponent(txtAvailability5))
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pn5Layout.setVerticalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn5Layout.createSequentialGroup()
                .addComponent(txtDonorname5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGenderAge5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAvailability5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn1MouseClicked
        // TODO add your handling code here:
    Sendrequest t = new Sendrequest(usr,donor.get(0), availability.get(0));
    t.setVisible(true);
    dispose();
    }//GEN-LAST:event_pn1MouseClicked

    private void pn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn2MouseClicked
        // TODO add your handling code here:
    Sendrequest t = new Sendrequest(usr,donor.get(1), availability.get(1));
    t.setVisible(true);
    dispose();
    }//GEN-LAST:event_pn2MouseClicked

    private void pn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn3MouseClicked
        // TODO add your handling code here:
    Sendrequest t = new Sendrequest(usr,donor.get(2), availability.get(2));
    t.setVisible(true);
    dispose();
    }//GEN-LAST:event_pn3MouseClicked

    private void pn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn4MouseClicked
        // TODO add your handling code here:
    Sendrequest t = new Sendrequest(usr,donor.get(3), availability.get(3));
    t.setVisible(true);
    dispose();
    }//GEN-LAST:event_pn4MouseClicked

    private void pn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn5MouseClicked
        // TODO add your handling code here:
    Sendrequest t = new Sendrequest(usr,donor.get(4), availability.get(4));
    t.setVisible(true);
    dispose();
    }//GEN-LAST:event_pn5MouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
         resetData();

try{
if(cbBloodType.getSelectedItem().toString().contains("Blood-Type")){
 loadData(result);
}
else{
 loadData(api.getAllDonorPendingByBloodType(cbBloodType.getSelectedItem().toString()));       
}
}  
catch(Exception e)
{}     
    }//GEN-LAST:event_btnSearchMouseClicked

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
            java.util.logging.Logger.getLogger(FindDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FindDonor().setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbBloodType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    private javax.swing.JPanel pn5;
    private javax.swing.JLabel txtAvailability1;
    private javax.swing.JLabel txtAvailability2;
    private javax.swing.JLabel txtAvailability3;
    private javax.swing.JLabel txtAvailability4;
    private javax.swing.JLabel txtAvailability5;
    private javax.swing.JLabel txtDonorname1;
    private javax.swing.JLabel txtDonorname2;
    private javax.swing.JLabel txtDonorname3;
    private javax.swing.JLabel txtDonorname4;
    private javax.swing.JLabel txtDonorname5;
    private javax.swing.JLabel txtGenderAge1;
    private javax.swing.JLabel txtGenderAge2;
    private javax.swing.JLabel txtGenderAge3;
    private javax.swing.JLabel txtGenderAge4;
    private javax.swing.JLabel txtGenderAge5;
    // End of variables declaration//GEN-END:variables
}
