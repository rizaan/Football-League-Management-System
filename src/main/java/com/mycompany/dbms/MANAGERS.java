/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.dbms;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moideen Aadil Shan
 */
public class MANAGERS extends javax.swing.JFrame {
int b;

    private void updatedrop() throws SQLException{
        try {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = Connect.getConnection();
        Statement stm = con.createStatement();
        String sel=(String)updateOP.getSelectedItem();
        int sel1=0;
        
        try{
            sel1=Integer.parseInt(sel);
        }catch(NumberFormatException ex){
            ex.printStackTrace();
            
        }
        
        String sql = "SELECT * FROM manager where mgr_id="+sel1+"";
        ResultSet rs = stm.executeQuery(sql);
        rs.next();
        String team=rs.getString("team");
        String c=rs.getString("cid");
        sql="select * from contracts where employer='"+team+"'";
        rs=stm.executeQuery(sql);
        while(rs.next()){
            String a=rs.getString("contract_id");
            cidUPOP.addItem(a);
        }
        cidUPOP.removeItem(c);

    } catch (SQLException ex) {
        ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
     private void dropdown() throws SQLException {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = Connect.getConnection();
        Statement stm = con.createStatement();
        
        String sql = "SELECT t.* FROM team t LEFT JOIN manager m ON t.team_name = m.team WHERE m.team IS NULL";
        ResultSet rs = stm.executeQuery(sql);

        
        while (rs.next()) {
            String name = rs.getString("team_name");
            team1.addItem(name);
            
        }
        
       sql = "SELECT * FROM MANAGER";
       rs=stm.executeQuery(sql);
       while (rs.next()) {
            String name = rs.getString("MGR_ID");
            deleteOP.addItem(name);
            updateOP.addItem(name);
            
        }
   
        

    } catch (SQLException ex) {
        ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
    }
}

     
     private void ciddropdown(){
          try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = Connect.getConnection();
        Statement stm = con.createStatement();
        
        String teamName =(String) team1.getSelectedItem(); 
        
String sql = "SELECT contract_id FROM contracts c " +
             "INNER JOIN team t ON c.EMPLOYER = t.team_name " +
             "WHERE t.team_name = '"+teamName+"'";
        ResultSet rs = stm.executeQuery(sql);

        
        while (rs.next()) {
            String name = rs.getString("CONTRACT_ID");
            cid1.addItem(name);
            
        }
   
        

    } catch (SQLException ex) {
        ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
    }
     }

    public MANAGERS(int a) throws SQLException {
        b=a;
        initComponents();
        setExtendedState(MATCHES.MAXIMIZED_BOTH);
        dropdown();
        if(b==0){
            insertBTN.setVisible(false);
            deleteBTN.setVisible(false);
            updateBTN.setVisible(false);
            jLabel5.setVisible(false);
            jLabel7.setVisible(false);
            jLabel9.setVisible(false);
            fname1.setVisible(false);
            lname1.setVisible(false);
            age1.setVisible(false);
            phno1.setVisible(false);
            team1.setVisible(false);
            cid1.setVisible(false);
            deleteOP.setVisible(false);
            updateOP.setVisible(false);
            age2.setVisible(false);
            cidUPOP.setVisible(false);
            jLabel11.setVisible(false);
            jLabel6.setVisible(false);
            jLabel2.setVisible(false);
            jLabel4.setVisible(false);
            jLabel15.setVisible(false);
            jLabel16.setVisible(false);
            jLabel8.setVisible(false);
            jLabel10.setVisible(false);
            jLabel14.setVisible(false);
            jLabel3.setVisible(false);
            
        }
    }

    private MANAGERS() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        lname1 = new javax.swing.JTextField();
        age1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        deleteOP = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        updateOP = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        phno1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        team1 = new javax.swing.JComboBox<>();
        cid1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        insertBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        cidUPOP = new javax.swing.JComboBox<>();
        age2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        updateBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        displayBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back.setFont(new java.awt.Font("Solid Edge Stencil", 1, 14)); // NOI18N
        back.setText("<");
        back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("ADD NEW MANAGER:");

        fname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname1ActionPerformed(evt);
            }
        });

        lname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lname1ActionPerformed(evt);
            }
        });

        age1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age1ActionPerformed(evt);
            }
        });

        jLabel2.setText("AGE:");

        jLabel4.setText("PH NO");

        jLabel6.setText("LAST NAME:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("DELETE MANAGER:");

        deleteOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOPActionPerformed(evt);
            }
        });

        jLabel8.setText("MANAGER_ID");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("UPDATE MANAGER:");

        jLabel10.setText("MANAGER ID:");

        jLabel11.setText("FIRST NAME:");

        updateOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "____" }));
        updateOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOPActionPerformed(evt);
            }
        });

        jLabel14.setText("CID:");

        phno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phno1ActionPerformed(evt);
            }
        });

        jLabel15.setText("TEAM:");

        team1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "___" }));
        team1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                team1ActionPerformed(evt);
            }
        });

        cid1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "___" }));
        cid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cid1ActionPerformed(evt);
            }
        });

        jLabel16.setText("CID:");

        insertBTN.setBackground(new java.awt.Color(0, 102, 102));
        insertBTN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        insertBTN.setForeground(new java.awt.Color(255, 255, 255));
        insertBTN.setText("INSERT");
        insertBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBTNActionPerformed(evt);
            }
        });

        deleteBTN.setBackground(new java.awt.Color(0, 102, 102));
        deleteBTN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        deleteBTN.setForeground(new java.awt.Color(255, 255, 255));
        deleteBTN.setText("DELETE");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        cidUPOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidUPOPActionPerformed(evt);
            }
        });

        age2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age2ActionPerformed(evt);
            }
        });

        jLabel3.setText("AGE:");

        updateBTN.setBackground(new java.awt.Color(0, 102, 102));
        updateBTN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        updateBTN.setForeground(new java.awt.Color(255, 255, 255));
        updateBTN.setText("UPDATE");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(23, 23, 23)
                                .addComponent(age2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cidUPOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                        .addComponent(updateBTN)))
                .addGap(111, 111, 111))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(deleteOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(deleteBTN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(insertBTN)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel15))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(team1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel4))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phno1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(250, 250, 250))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(team1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(insertBTN)
                .addGap(54, 54, 54)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBTN))
                .addGap(85, 85, 85)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidUPOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(updateBTN)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(597, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MID", "FNAME", "LNAME", "AGE", "PH_NO", "TEAM", "CID"
            }
        ));
        jScrollPane1.setViewportView(table);

        displayBTN.setBackground(new java.awt.Color(0, 0, 0));
        displayBTN.setFont(new java.awt.Font("Solid Edge Stencil", 0, 12)); // NOI18N
        displayBTN.setForeground(new java.awt.Color(255, 255, 255));
        displayBTN.setText("DISPLAY ALL");
        displayBTN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(687, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 545, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        HomePage hp=new HomePage(b);
        hp.show();
    }//GEN-LAST:event_backActionPerformed

    private void fname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fname1ActionPerformed

    private void lname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lname1ActionPerformed

    private void age1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age1ActionPerformed

    private void deleteOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteOPActionPerformed

    private void updateOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOPActionPerformed
         if(updateOP.getSelectedItem()!="___"){
            try { 
                cidUPOP.removeAllItems();
                updatedrop();
            } catch (SQLException ex) {
                Logger.getLogger(MANAGERS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_updateOPActionPerformed

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = Connect.getConnection();

            Statement stm = con.createStatement();

            String sql = "SELECT * FROM MANAGER";
            ResultSet rs = stm.executeQuery(sql);

            // Clear existing data from jTable1
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            // Populate jTable1 with data from ResultSet
            while (rs.next()) {
                int mid=rs.getInt("MGR_ID");
                String fname=rs.getString("FNAME");
                String lname=rs.getString("LNAME");
                String t=rs.getString("TEAM");
                String ph=rs.getString("PH_NO");
                int age=rs.getInt("age");
                int cid=rs.getInt("cid");
                // Add a new row to jTable1
                model.addRow(new Object[]{mid,fname,lname,age,ph,t,cid});
            }

            // Close resources
            rs.close();
            stm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CONTRACTS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_displayBTNActionPerformed

    private void phno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phno1ActionPerformed

    private void team1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_team1ActionPerformed
        if(!(team1.getSelectedItem()=="___")){
            ciddropdown();
        }
    }//GEN-LAST:event_team1ActionPerformed

    private void cid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cid1ActionPerformed

    private void insertBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBTNActionPerformed
        if(b==1||b==4){
            if(fname1.equals("") || lname1.equals("") || age1.equals("") || phno1.equals("") || team1.getSelectedItem().equals(("___"))|| cid1.getSelectedItem().equals("___")){
                 JOptionPane.showMessageDialog(this, "ENTER AND SELECT ALL THE FIELDS ");
                 return;
            }
            
           String fname=(String)fname1.getText();
           String lname=(String)lname1.getText();
           String ag=(String)age1.getText();
           String ph=phno1.getText();
           String team=(String)team1.getSelectedItem();
           String cid=(String)cid1.getSelectedItem();
           if(ph.length() != 10){
               JOptionPane.showMessageDialog(this, "ENTER A VALID 10 DIGIT PHONE NUMBER ");
                 return; 
           }
           int age=0,cidf=0;
           try{
               age=Integer.parseInt(ag);
               
           }catch(NumberFormatException e){
               JOptionPane.showMessageDialog(this, "ENTER A VALID AGE ");
                 return; 
           }
           try{
               cidf=Integer.parseInt(cid);
               
           }catch(NumberFormatException e){
              
                 return; 
           }
           if(age<1){
                JOptionPane.showMessageDialog(this, "AGE CANNOT BE ZERO ");
                 return;
           }
           
           
          
           
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = Connect.getConnection();
                Statement stm = con.createStatement();
                String sql="insert into manager (fname,lname,ph_no,team,cid,age) values ('"+fname+"','"+lname+"','"+ph+"','"+team+"',"+cidf+","+age+")";
                int affect=stm.executeUpdate(sql);
                
                if(affect>0){
                    team1.removeItem(team);
                       ResultSet rs=stm.executeQuery("select * FROM MANAGER ORDER BY MGR_ID DESC LIMIT 1");
                if(rs.next()){
                    String temp=rs.getString("MGR_ID");
                    deleteOP.addItem(temp);
                    updateOP.addItem(temp);
                }
                
                    JOptionPane.showMessageDialog(this, "INSERTED SUCCESSFULLY");
                    fname1.setText("");
                    lname1.setText("");
                    phno1.setText("");
                    age1.setText("");
                    displayBTNActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "ManualTrigger"));
                }
                
     
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "YOU DONT HAVE ACCESS TO INSERT ");
        }
    }//GEN-LAST:event_insertBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        try{
            String selected=(String)deleteOP.getSelectedItem();
            int sel=0;
            try{
                sel=Integer.parseInt(selected);
            }catch(NumberFormatException ex){
                ex.printStackTrace();
            }
            if(b==1||b==4){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = Connect.getConnection();
                Statement stm = con.createStatement();
                String name="";
                String sql = "select * from manager where mgr_id="+sel+"";
                ResultSet rs =stm.executeQuery(sql);
                if(rs.next()){
                    name=rs.getString("team");
                }
                String sql1="delete from manager where mgr_id="+sel+"";
                int affect=stm.executeUpdate(sql1);
                if(affect>0){
                    team1.addItem(name);
                    JOptionPane.showMessageDialog(this,"MANAGER" + selected +" IS DELETED ");
                    deleteOP.removeItem(selected);
                    updateOP.addItem(selected);
                    // Assuming displayBTN is the JButton
                    displayBTNActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "ManualTrigger"));

                }
            }else{
                JOptionPane.showMessageDialog(this, "YOU DONT HAVE ACCESS TO DELETE ");

            }
        }catch(SQLException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void cidUPOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidUPOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidUPOPActionPerformed

    private void age2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age2ActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
     if(b==1||b==4){
            String selected=(String)updateOP.getSelectedItem();
            try{

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = Connect.getConnection();
                Statement stm = con.createStatement();
                String ag=age2.getText();
                String cid=(String)cidUPOP.getSelectedItem();
                int age=0,cid1=0,mgr=0;
                boolean flag=false;
                 try{
                        mgr=Integer.parseInt(selected);
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(this,"SELECT THE MANAGER YOU WANT TO UPDATE");
                        ex.printStackTrace();
                        return;
                    }
                 
        
                
                if(!age2.getText().equals("")){
                 try{
                        age=Integer.parseInt(ag);
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(this,"Enter a valid age");
                        ex.printStackTrace();
                        return;
                    }
                  if(age<1){
                       JOptionPane.showMessageDialog(this,"AGE CANNOT BE ZERO"); 
                       return;
                        }else{
                       String sql = "UPDATE manager SET  age = " + age + " WHERE mgr_id = " + mgr;
                       int affect=stm.executeUpdate(sql);
                       if(affect>0){
                           flag=true;
                       }
                  }
                 
            }
                if(!cidUPOP.getSelectedItem().equals("___")){
                 try{
                        cid1=Integer.parseInt(cid);
                    }catch(NumberFormatException ex){
                        ex.printStackTrace();
                        return;
                    }
                 String sql = "UPDATE manager SET cid = " + cid1 + " WHERE mgr_id = " + mgr;
                       int affect=stm.executeUpdate(sql);
                       if(affect>0){
                           
                           flag=true;
                       }
            }
                
                if(flag){
                    cidUPOP.removeAllItems();
                    updatedrop();
                    JOptionPane.showMessageDialog(this,"MANAGER "+mgr+" UPDATED SUCCESSFULLY"); 
                    displayBTNActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "ManualTrigger"));
                       
                }else{
                    JOptionPane.showMessageDialog(this,"ENTER THE FIELDS YOU WANT TO UPDATE"); 
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"YOU DONT HAVE ACCESS TO INSERT");
        }

    }//GEN-LAST:event_updateBTNActionPerformed

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
            java.util.logging.Logger.getLogger(MANAGERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MANAGERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MANAGERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MANAGERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MANAGERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age1;
    private javax.swing.JTextField age2;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> cid1;
    private javax.swing.JComboBox<String> cidUPOP;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JComboBox<String> deleteOP;
    private javax.swing.JButton displayBTN;
    private javax.swing.JTextField fname1;
    private javax.swing.JButton insertBTN;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname1;
    private javax.swing.JTextField phno1;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> team1;
    private javax.swing.JButton updateBTN;
    private javax.swing.JComboBox<String> updateOP;
    // End of variables declaration//GEN-END:variables
}
