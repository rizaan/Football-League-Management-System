/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.dbms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moideen Aadil Shan
 */
public class CONTRACTS extends javax.swing.JFrame {
    int b;
     private int getDaysInMonth(int year, int month) {
        // Handling February based on leap year
        if (month == 2) {
            return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
        }

        // Handling months with 31 days
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }

        // Handling months with 30 days
        return 30;
    }
    
    private void updateDateOptions() {
  
        String selectedMonth = (String) month1.getSelectedItem();
        String selectedYear = (String) year1.getSelectedItem();
        String selectedMonth1 = (String) month2.getSelectedItem();
        String selectedYear1 = (String) year2.getSelectedItem();
        int sm=0;
        int sy=0;
        int sm1=0;
        int sy1=0;
        try{
         sm=Integer.parseInt(selectedMonth);
         sy=Integer.parseInt(selectedYear);
         sm1=Integer.parseInt(selectedMonth1);
         sy1=Integer.parseInt(selectedYear1);
        }catch(NumberFormatException ex){
            ex.printStackTrace();
        }
       

        // Determine the number of days in the selected month
        int daysInMonth = getDaysInMonth(sy, sm);
        int daysInMonth1 = getDaysInMonth(sy1, sm1);
        // Clear and update date options
        date1.removeAllItems();
        date2.removeAllItems();
        for (int day = 1; day <= daysInMonth; day++) {
            String k=String.valueOf(day);
            date1.addItem(k);
            date2.addItem(k);
            
        }
    }
    
    void dropdown(){
        
         EMP1.addItem("REFEREE");
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = Connect.getConnection();
            
            Statement stm = con.createStatement();

            String sql="SELECT * FROM TEAM";
            String sql1="SELECT CONTRACT_ID FROM CONTRACTS";
            ResultSet rs=stm.executeQuery(sql);
            
            while(rs.next()){
                String name=rs.getString("TEAM_NAME");
                EMP1.addItem(name);
            }
            ResultSet rs1=stm.executeQuery(sql1);
            while(rs1.next()){
                int name = rs1.getInt("CONTRACT_ID");
                String s = Integer.toString(name);
                deleteOP1.addItem(s);
                updateOP.addItem(s);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CONTRACTS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Creates new form CONTRACTS
     */
    public CONTRACTS(int a) {
        b=a;
        initComponents();
        setExtendedState(CONTRACTS.MAXIMIZED_BOTH);
        dropdown();
        updateDateOptions();
        if(b==0){
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel9.setVisible(false);
            jLabel14.setVisible(false);
            jLabel13.setVisible(false);
            jLabel16.setVisible(false);
            jLabel15.setVisible(false);
            jLabel17.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            EMP1.setVisible(false);
            salary1.setVisible(false);
            date1.setVisible(false);
            date2.setVisible(false);
            month1.setVisible(false);
            month2.setVisible(false);
            year1.setVisible(false);
            year2.setVisible(false);
            deleteOP1.setVisible(false);
            updateOP.setVisible(false);
            salfield1.setVisible(false);
            insertBTN.setVisible(false);
            deleteBTN.setVisible(false);
            updateBTN.setVisible(false);
        }
        
    }

    private CONTRACTS() {
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
        salary1 = new javax.swing.JTextField();
        month1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        date2 = new javax.swing.JComboBox<>();
        month2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        year2 = new javax.swing.JComboBox<>();
        EMP1 = new javax.swing.JComboBox<>();
        insertBTN = new javax.swing.JButton();
        updateOP = new javax.swing.JComboBox<>();
        deleteBTN = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        deleteOP1 = new javax.swing.JComboBox<>();
        date1 = new javax.swing.JComboBox<>();
        year1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        salfield1 = new javax.swing.JTextField();
        updateBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CREATE NEW CONTRACT :");

        salary1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salary1ActionPerformed(evt);
            }
        });

        month1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        month1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                month1ActionPerformed(evt);
            }
        });

        jLabel2.setText("EMPLOYER:");

        jLabel4.setText("SALARY:");

        jLabel5.setText("START DATE:");

        jLabel6.setText("DATE");

        jLabel7.setText("MONTH");

        jLabel8.setText("YEAR");

        jLabel9.setText("END DATE:");

        date2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        date2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date2ActionPerformed(evt);
            }
        });

        month2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        month2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                month2ActionPerformed(evt);
            }
        });

        jLabel10.setText("DATE");

        jLabel11.setText("MONTH");

        jLabel12.setText("YEAR");

        year2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", " " }));
        year2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year2ActionPerformed(evt);
            }
        });

        EMP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMP1ActionPerformed(evt);
            }
        });

        insertBTN.setBackground(new java.awt.Color(0, 102, 102));
        insertBTN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        insertBTN.setForeground(new java.awt.Color(255, 255, 255));
        insertBTN.setText("INSERT");
        insertBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBTNActionPerformed(evt);
            }
        });

        updateOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOPActionPerformed(evt);
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

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("DELETE CONTRACT:");

        jLabel14.setText("CONTRACT ID:");

        jLabel15.setText("CONTRACT ID:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("UPDATE CONTRACT:");

        deleteOP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOP1ActionPerformed(evt);
            }
        });

        date1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date1ActionPerformed(evt);
            }
        });

        year1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", " " }));
        year1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year1ActionPerformed(evt);
            }
        });

        jLabel17.setText("SALARY:");

        salfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salfield1ActionPerformed(evt);
            }
        });

        updateBTN.setBackground(new java.awt.Color(0, 102, 102));
        updateBTN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        updateBTN.setForeground(new java.awt.Color(255, 255, 255));
        updateBTN.setText("UPDATE");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CONTRACT ID", "EMPLOYER", "START DATE", "END DATE", "SALARY"
            }
        ));
        jScrollPane2.setViewportView(table);

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
                        .addGap(263, 263, 263)
                        .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(EMP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(salary1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(month2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(month1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(year2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel14)
                        .addGap(45, 45, 45)
                        .addComponent(deleteOP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBTN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(salfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateBTN)
                            .addComponent(insertBTN))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salary1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(EMP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(month1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(year2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(insertBTN)
                .addGap(56, 56, 56)
                .addComponent(jLabel13)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBTN)
                    .addComponent(jLabel14)
                    .addComponent(deleteOP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(updateOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(salfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(updateBTN)
                .addContainerGap(512, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 619, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = Connect.getConnection();
            
            Statement stm = con.createStatement();

            String sql = "SELECT * FROM CONTRACTS";
            ResultSet rs = stm.executeQuery(sql);

            // Clear existing data from jTable1
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            
             
           
            // Populate jTable1 with data from ResultSet
            while (rs.next()) {
                int CID = rs.getInt("CONTRACT_ID");
                String EMPLOYER = rs.getString("EMPLOYER");
                String START = rs.getString("START_DATE");
                String END=rs.getString("END_DATE");
                int SALARY=rs.getInt("SALARY");
              

                // Add a new row to jTable1
                model.addRow(new Object[]{CID, EMPLOYER, START, END,SALARY});
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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        HomePage hp=new HomePage(b);
        hp.show();
    }//GEN-LAST:event_backActionPerformed

    private void salary1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salary1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salary1ActionPerformed

    private void month1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_month1ActionPerformed
        updateDateOptions();
    }//GEN-LAST:event_month1ActionPerformed

    private void month2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_month2ActionPerformed
        updateDateOptions();
    }//GEN-LAST:event_month2ActionPerformed

    private void EMP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMP1ActionPerformed
        
    }//GEN-LAST:event_EMP1ActionPerformed

    private void insertBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBTNActionPerformed
        if(b==1||b==4){
         if(!salary1.getText().equals("")){
             
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = Connect.getConnection();
                boolean flag=true;
                int sal1=0;
                Statement stm = con.createStatement();
                String emp=(String)EMP1.getSelectedItem();
                String sal=salary1.getText();
                String sdd=(String) date1.getSelectedItem();
                String sdm=(String) month1.getSelectedItem();
                String sdy=(String) year1.getSelectedItem();
                String edd=(String) date2.getSelectedItem();
                String edm=(String) month2.getSelectedItem();
                String edy=(String) year2.getSelectedItem();
                try{
                    
                    sal1=Integer.parseInt(sal);
                    if(sal1==0){
                        JOptionPane.showMessageDialog(this, "Salary cannot be zero.", "Input Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                       
                }catch(NumberFormatException ex){
                   JOptionPane.showMessageDialog(this, "Please enter a valid salary.", "Input Error", JOptionPane.ERROR_MESSAGE);
                   ex.printStackTrace();
                   return;
                    
                }
                String sd = sdy + "-" + sdm + "-" + sdd;
                String ed = edy + "-" + edm + "-" + edd;
                int year = Integer.parseInt(sdy);
                int month = Integer.parseInt(sdm);
                int day = Integer.parseInt(sdd);
                int year1 = Integer.parseInt(edy);
                int month1 = Integer.parseInt(edm);
                int day1 = Integer.parseInt(edd);
                LocalDate date1 = LocalDate.of(year,month, day);
                LocalDate date2 = LocalDate.of(year1,month1, day1);
                String sql;
                if(date2.isAfter(date1)){
                if(emp=="REFEREE"){
                    sql = "INSERT INTO CONTRACTS (EMPLOYER, SALARY, START_DATE, END_DATE) VALUES ('IFA', " + sal1 + ", '" + sd + "', '" + ed + "')";
                }else{
                sql = "INSERT INTO CONTRACTS (EMPLOYER, SALARY, START_DATE, END_DATE) VALUES ('" + emp + "', " + sal1 + ", '" + sd + "', '" + ed + "')";
                }
                stm.executeUpdate(sql);
                ResultSet rs=stm.executeQuery("select * FROM CONTRACTS ORDER BY CONTRACT_ID DESC LIMIT 1");
                if(rs.next()){
                    String temp=rs.getString("CONTRACT_ID");
                    deleteOP1.addItem(temp);
                    updateOP.addItem(temp);
                }
         
                JOptionPane.showMessageDialog(this, "ADDED NEW CONTRACT SUCCESFULLY");
                // Assuming displayBTN is the JButton
                displayBTNActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "ManualTrigger"));

                }else{
                    JOptionPane.showMessageDialog(this, "CONTRACT END DATE SHOULD BE AFTER THE CONTRACT START DATE");
                }
                
            

            
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(CONTRACTS.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CONTRACTS.class.getName()).log(Level.SEVERE, null, ex);
            }
         }else{
             JOptionPane.showMessageDialog(this, "Fill all the fields ");
         }
        }else{
            JOptionPane.showMessageDialog(this, "YOU DONT HAVE ACCESS TO INSERT ");
        }

    }//GEN-LAST:event_insertBTNActionPerformed

    private void updateOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOPActionPerformed
         
    }//GEN-LAST:event_updateOPActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
         try{
            String selected=(String)deleteOP1.getSelectedItem();

            if(b==1||b==4){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = Connect.getConnection();
                Statement stm = con.createStatement();

                String sql = "DELETE FROM CONTRACTS where CONTRACT_ID='"+selected+"'";
                int rowsAffected =stm.executeUpdate(sql);
                if(rowsAffected>0){
                    JOptionPane.showMessageDialog(this,"CONTRACT WITH ID " + selected +" IS DELETED ");
                    deleteOP1.removeItem(selected);
                    updateOP.removeItem(selected);
                    // Assuming displayBTN is the JButton
displayBTNActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "ManualTrigger"));

                    //updateop.removeItem(selected);
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

    private void deleteOP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteOP1ActionPerformed

    private void date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date1ActionPerformed
       
    }//GEN-LAST:event_date1ActionPerformed

    private void year1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year1ActionPerformed
        updateDateOptions();
    }//GEN-LAST:event_year1ActionPerformed

    private void salfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salfield1ActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        if(b==1||b==4){
        try{
           
            String selected=(String)updateOP.getSelectedItem();
          
            boolean flag=false;
            String sal=salfield1.getText();
            int num=0,sel;
            try{
                
                num=Integer.parseInt(sal);
                sel=Integer.parseInt(selected);
                if(num==0){
                    JOptionPane.showMessageDialog(this, "Salary cannot be zero.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                 
                
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Please enter a valid salary.", "Input Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                return;
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = Connect.getConnection();
            Statement stm = con.createStatement();
            if(sal.equals("")){
                JOptionPane.showMessageDialog(this,"ENTER THE SALARY");
            }else{
           
            String sql = "update CONTRACTS set salary="+num+" where contract_id="+sel+"";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"UPDATED SALARY SUCCESFULLY");
            // Assuming displayBTN is the JButton
            displayBTNActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "ManualTrigger"));

            }
        
       
        
     
       } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
             JOptionPane.showMessageDialog(this,"YOU DONT HAVE ACCESS TO INSERT");
        }


           

            
     
    }//GEN-LAST:event_updateBTNActionPerformed

    private void date2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date2ActionPerformed
       
    }//GEN-LAST:event_date2ActionPerformed

    private void year2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year2ActionPerformed
        updateDateOptions();
    }//GEN-LAST:event_year2ActionPerformed

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
            java.util.logging.Logger.getLogger(CONTRACTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CONTRACTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CONTRACTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CONTRACTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CONTRACTS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> EMP1;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> date1;
    private javax.swing.JComboBox<String> date2;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JComboBox<String> deleteOP1;
    private javax.swing.JButton displayBTN;
    private javax.swing.JButton insertBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> month1;
    private javax.swing.JComboBox<String> month2;
    private javax.swing.JTextField salary1;
    private javax.swing.JTextField salfield1;
    private javax.swing.JTable table;
    private javax.swing.JButton updateBTN;
    private javax.swing.JComboBox<String> updateOP;
    private javax.swing.JComboBox<String> year1;
    private javax.swing.JComboBox<String> year2;
    // End of variables declaration//GEN-END:variables
}
