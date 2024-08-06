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
public class STADIUMS extends javax.swing.JFrame {
int b;

   void dropdown(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = Connect.getConnection();
            
            Statement stm = con.createStatement();

            String sql="SELECT * FROM STADIUM";

            ResultSet rs=stm.executeQuery(sql);
            
            while(rs.next()){
                String name=rs.getString("STD_NAME");
                deleteOP.addItem(name);
                updateOP.addItem(name);
            }

            
            
        } catch (SQLException ex) {
            Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CONTRACTS.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    /**
     * Creates new form STADIUMS
     */
    public STADIUMS(int a) {
        b=a;
        initComponents();
        setExtendedState(STADIUMS.MAXIMIZED_BOTH);
        dropdown();
        if(b==0){
            jLabel5.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel1.setVisible(false);
            jLabel6.setVisible(false);
            jLabel16.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            name1.setVisible(false);
            city1.setVisible(false);
            cap1.setVisible(false);
            deleteOP.setVisible(false);
            updateOP.setVisible(false);
            cap2.setVisible(false);
            insertBTN.setVisible(false);
            deleteBTN.setVisible(false);
            updateBTN.setVisible(false);
        }
    }

    private STADIUMS() {
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
        jLabel1 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        city1 = new javax.swing.JTextField();
        cap1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        insertBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        deleteOP = new javax.swing.JComboBox<>();
        deleteBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cap2 = new javax.swing.JTextField();
        updateOP = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        updateBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        displayBTN = new javax.swing.JButton();
        filterBTN = new javax.swing.JButton();
        filterOP = new javax.swing.JComboBox<>();
        salfilter = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back.setFont(new java.awt.Font("Solid Edge Stencil", 1, 14)); // NOI18N
        back.setText("<");
        back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("DELETE STADIUM:");

        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });

        city1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city1ActionPerformed(evt);
            }
        });

        cap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cap1ActionPerformed(evt);
            }
        });

        jLabel2.setText("STADIUM NAME:");

        jLabel3.setText("CITY:");

        jLabel4.setText("CAPACITY:");

        insertBTN.setBackground(new java.awt.Color(0, 102, 102));
        insertBTN.setForeground(new java.awt.Color(255, 255, 255));
        insertBTN.setText("INSERT");
        insertBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBTNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("ADD NEW STADIUM:");

        deleteBTN.setBackground(new java.awt.Color(0, 102, 102));
        deleteBTN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        deleteBTN.setForeground(new java.awt.Color(255, 255, 255));
        deleteBTN.setText("DELETE");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        jLabel6.setText("STADIUM NAME:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("UPDATE STADIUM DETAILS:");

        cap2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cap2ActionPerformed(evt);
            }
        });

        jLabel7.setText("STADIUM NAME:");

        jLabel8.setText("CAPACITY:");

        updateBTN.setBackground(new java.awt.Color(0, 102, 102));
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(insertBTN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(deleteOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(city1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cap1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(updateBTN)
                                    .addComponent(deleteBTN))
                                .addGap(225, 225, 225))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29)
                        .addComponent(updateOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel8)
                        .addGap(37, 37, 37)
                        .addComponent(cap2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(insertBTN)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBTN)
                            .addComponent(jLabel6))
                        .addGap(69, 69, 69)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cap2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addGap(36, 36, 36)
                .addComponent(updateBTN)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STADIUM NAME", "CITY", "CAPACITY"
            }
        ));
        jScrollPane1.setViewportView(Table);

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

        filterBTN.setBackground(new java.awt.Color(0, 0, 0));
        filterBTN.setFont(new java.awt.Font("Solid Edge Stencil", 0, 12)); // NOI18N
        filterBTN.setForeground(new java.awt.Color(255, 255, 255));
        filterBTN.setText("FILTER");
        filterBTN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        filterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBTNActionPerformed(evt);
            }
        });

        filterOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAX", "MIN", "ONLY" }));

        salfilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salfilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(filterOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(salfilter, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(filterBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salfilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(484, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 620, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = Connect.getConnection();

            Statement stm = con.createStatement();

            String sql = "SELECT * FROM STADIUM";
            ResultSet rs = stm.executeQuery(sql);

            // Clear existing data from jTable1
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            model.setRowCount(0);
            model.fireTableDataChanged();
            // Populate jTable1 with data from ResultSet
            while (rs.next()) {
                int Cap = rs.getInt("CAPACITY");
                String std = rs.getString("STD_NAME");
                String city = rs.getString("CITY");
                

                // Add a new row to jTable1
                model.addRow(new Object[]{std,city,Cap});
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

    private void filterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBTNActionPerformed
        try {
            String selectedOption = (String) filterOP.getSelectedItem();

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = Connect.getConnection();

            Statement stm = con.createStatement();

            ResultSet rs=null;
            String text = salfilter.getText();

           

            if(text.isEmpty()){
                JOptionPane.showMessageDialog(this, "Enter filter conditions!!!");
            }
            else {
                int intValue = Integer.parseInt(text);
                if("MIN".equals(selectedOption)){
                    String sql = "SELECT * FROM stadium where CAPACITY>='"+intValue+"'";
                    rs = stm.executeQuery(sql);
                }else if("MAX".equals(selectedOption)){
                    
                    String sql = "SELECT * FROM stadium where CAPACITY<='"+intValue+"'";
                    rs = stm.executeQuery(sql);
                }else{
                    String sql = "SELECT * FROM stadium where CAPACITY='"+intValue+"'";
                    rs = stm.executeQuery(sql);
                }

            }
            

            // Clear existing data from jTable1
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            model.setRowCount(0);

          while (rs.next()) {
                int Cap = rs.getInt("CAPACITY");
                String std = rs.getString("STD_NAME");
                String city = rs.getString("CITY");
                

                // Add a new row to jTable1
                model.addRow(new Object[]{std,city,Cap});

            }
            // Close resources
            rs.close();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_filterBTNActionPerformed

    private void salfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salfilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salfilterActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        HomePage hp=new HomePage(b);
        hp.show();
    }//GEN-LAST:event_backActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void city1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_city1ActionPerformed

    private void insertBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBTNActionPerformed
        if(b==1||b==3){
            int pls=0;
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = Connect.getConnection();
                boolean flag=true;
                Statement stm = con.createStatement();
                String Sname=name1.getText();
                String city=city1.getText();
                String cap=cap1.getText();
             
                int no=0;
                try{
                    no=Integer.parseInt(cap);
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(this, "Please enter a valid capacity.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                    pls=1;
                }
                if(Sname.equals("") || city.equals("") || cap.equals("")){
                    flag=false;
                }
                String check="SELECT * FROM STADIUM WHERE STD_NAME='"+Sname+"'";
                ResultSet rs=stm.executeQuery(check);
                if(!rs.next()){
                    if(flag) {
                        if(no>0){

                            String sql = "INSERT INTO stadium (STD_NAME,CITY,CAPACITY) VALUES (?,?,?)";
                            try (
                                PreparedStatement pstmt = con.prepareStatement(sql)) {
                                pstmt.setString(1, Sname);
                                pstmt.setString(2, city);
                                pstmt.setString(3, cap);
                                
                                pstmt.executeUpdate();
                                deleteOP.addItem(Sname);
                                updateOP.addItem(Sname);
                                // Assuming displayBTN is the JButton
                                JOptionPane.showMessageDialog(this, "Stadium added succesfully");
                                displayBTNActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "ManualTrigger"));

                                

                            }catch(Exception e){
                                System.out.println(e.getMessage());
                            }
                        }else{
                            if(pls==0)
                            JOptionPane.showMessageDialog(this, "CAPACITY CANNOT BE ZERO");
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "fill all the fields required");
                    }
                }else
                {
                    JOptionPane.showMessageDialog(this, "TEAM ALREADY EXIST ");
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

            if(b==1||b==3){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = Connect.getConnection();
                Statement stm = con.createStatement();

                String sql = "DELETE FROM stadium where STD_NAME='"+selected+"'";
                int rowsAffected =stm.executeUpdate(sql);
                if(rowsAffected>0){
                    JOptionPane.showMessageDialog(this,"STADIUM " + selected +" IS DELETED ");
                    deleteOP.removeItem(selected);
                    updateOP.removeItem(selected);
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

    private void cap2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cap2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cap2ActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        if(b==1||b==3){
            int pls=0;
            try{

                String selected=(String)updateOP.getSelectedItem();

               
                String cap=cap2.getText();
                int num=0;
                try{

                    num=Integer.parseInt(cap);
                    

                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "Please enter a valid capacity.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    pls=1;
                    e.printStackTrace();
                }
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = Connect.getConnection();
                Statement stm = con.createStatement();
                if(!cap.equals("")){
                if(num==0){
                    if(pls==0)
                    JOptionPane.showMessageDialog(this," CAPACITY CANNOT BE ZERO ");
                }else{

                    String sql = "update STADIUM set CAPACITY="+num+" where STD_NAME='"+selected+"'";
                    stm.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this,"UPDATED CAPACITY SUCCESFULLY");
                    // Assuming displayBTN is the JButton
                displayBTNActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "ManualTrigger"));

                }
                }else if(pls==0){
                    JOptionPane.showMessageDialog(this,"ENTER THE FIELD");
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"YOU DONT HAVE ACCESS TO INSERT");
        }

    }//GEN-LAST:event_updateBTNActionPerformed

    private void cap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cap1ActionPerformed
        // TODO
    }//GEN-LAST:event_cap1ActionPerformed

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
            java.util.logging.Logger.getLogger(STADIUMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STADIUMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STADIUMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STADIUMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STADIUMS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton back;
    private javax.swing.JTextField cap1;
    private javax.swing.JTextField cap2;
    private javax.swing.JTextField city1;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JComboBox<String> deleteOP;
    private javax.swing.JButton displayBTN;
    private javax.swing.JButton filterBTN;
    private javax.swing.JComboBox<String> filterOP;
    private javax.swing.JButton insertBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField salfilter;
    private javax.swing.JButton updateBTN;
    private javax.swing.JComboBox<String> updateOP;
    // End of variables declaration//GEN-END:variables
}
