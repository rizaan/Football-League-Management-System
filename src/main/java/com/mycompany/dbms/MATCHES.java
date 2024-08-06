/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.dbms;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moideen Aadil Shan
 */
public class MATCHES extends javax.swing.JFrame {
int b;
    /**
     * Creates new form MATCHES
     */


private void updateWinnerComboBox() {
    // Get the selected teams from team1 and team2
    String selectedTeam1 = (String) team1.getSelectedItem();
    String selectedTeam2 = (String) team2.getSelectedItem();

    // Clear existing items before adding new ones
    winOP.removeAllItems();

    // Add the selected teams to the winnerComboBox
    if (selectedTeam1 != "___") {
        winOP.addItem(selectedTeam1);
    }
    if (selectedTeam2 != "___") {
        winOP.addItem(selectedTeam2);
    }
}
     private void dropdown() throws SQLException {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = Connect.getConnection();
        Statement stm = con.createStatement();
        String sql = "SELECT * FROM team";
        ResultSet rs = stm.executeQuery(sql);
        String sql1 = "SELECT * FROM stadium";
        String sql2="SELECT * FROM REFEREE";
        String sql3="SELECT * FROM MATCHES";
        // Clear existing items before adding new ones
        team1.removeAllItems();
        team2.removeAllItems();
        
        while (rs.next()) {
            String name = rs.getString("team_name");
            team1.addItem(name);
            team2.addItem(name);
        }
        rs=stm.executeQuery(sql1);
        while (rs.next()) {
            String name = rs.getString("STD_NAME");
            stdOP.addItem(name);
        }
        rs=stm.executeQuery(sql2);
        while (rs.next()) {
            String name = rs.getString("REF_ID");
            refOP.addItem(name);
        }
        rs=stm.executeQuery(sql3);
        while(rs.next()){
            String name=rs.getString("MATCH_ID");
            deleteOP.addItem(name);
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
    }
}
     
     
    
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
//        String selectedMonth1 = (String) month2.getSelectedItem();
//        String selectedYear1 = (String) year2.getSelectedItem();
        int sm=0;
        int sy=0;
        int sm1=0;
        int sy1=0;
        try{
         sm=Integer.parseInt(selectedMonth);
         sy=Integer.parseInt(selectedYear);
//         sm1=Integer.parseInt(selectedMonth1);
//         sy1=Integer.parseInt(selectedYear1);
        }catch(NumberFormatException ex){
            ex.printStackTrace();
        }
       

        // Determine the number of days in the selected month
        int daysInMonth = getDaysInMonth(sy, sm);
        int daysInMonth1 = getDaysInMonth(sy1, sm1);
        // Clear and update date options
        date1.removeAllItems();
//        date2.removeAllItems();
        for (int day = 1; day <= daysInMonth; day++) {
            String k=String.valueOf(day);
            date1.addItem(k);
//            date2.addItem(k);
            
        }
    }
    
    public MATCHES(int a) throws SQLException {
        b=a;
        initComponents();
        setExtendedState(MATCHES.MAXIMIZED_BOTH);
        dropdown();
        updateDateOptions();
        if(b==0){
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel4.setVisible(false);
            jLabel18.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel14.setVisible(false);
            jLabel13.setVisible(false);
            insertBTN.setVisible(false);
            deleteBTN.setVisible(false);
            pointTABLE.setVisible(false);
            deleteOP.setVisible(false);
            team1.setVisible(false);
            team2.setVisible(false);
            timeop.setVisible(false);
            date1.setVisible(false);
            month1.setVisible(false);
            year1.setVisible(false);
            winOP.setVisible(false);
            stdOP.setVisible(false);
            refOP.setVisible(false);
            
            
            
            
        }
    }

    private MATCHES() {
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
        jPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        month1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        timeop = new javax.swing.JComboBox<>();
        insertBTN = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        deleteOP = new javax.swing.JComboBox<>();
        date1 = new javax.swing.JComboBox<>();
        year1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        team1 = new javax.swing.JComboBox<>();
        team2 = new javax.swing.JComboBox<>();
        winOP = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        stdOP = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        refOP = new javax.swing.JComboBox<>();
        deleteBTN = new javax.swing.JButton();
        pointTABLE = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CREATE NEW MATCH :");

        month1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        month1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                month1ActionPerformed(evt);
            }
        });

        jLabel2.setText("TIME");

        jLabel4.setText("team1:");

        jLabel5.setText("MATCH DATE");

        jLabel6.setText("DATE");

        jLabel7.setText("MONTH");

        jLabel8.setText("YEAR");

        timeop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "00:00" }));
        timeop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeopActionPerformed(evt);
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

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("DELETE MATCH:");

        jLabel14.setText("MATCH ID:");

        deleteOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOPActionPerformed(evt);
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

        jLabel18.setText("team2:");

        team1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                team1ActionPerformed(evt);
            }
        });

        team2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                team2ActionPerformed(evt);
            }
        });

        winOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                winOPActionPerformed(evt);
            }
        });

        jLabel9.setText("WINNER:");

        stdOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdOPActionPerformed(evt);
            }
        });

        jLabel10.setText("STADIUM:");

        jLabel11.setText("REFEREE:");

        refOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refOPActionPerformed(evt);
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

        pointTABLE.setBackground(new java.awt.Color(0, 0, 0));
        pointTABLE.setFont(new java.awt.Font("Solid Edge Stencil", 0, 12)); // NOI18N
        pointTABLE.setForeground(new java.awt.Color(255, 255, 255));
        pointTABLE.setText("GENERATE CURRENT POINTS TABLE");
        pointTABLE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        pointTABLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointTABLEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addComponent(timeop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(team1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(team2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(72, 72, 72))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel14)
                        .addGap(45, 45, 45)
                        .addComponent(deleteOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(deleteBTN))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(winOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel10)
                                .addGap(27, 27, 27)
                                .addComponent(stdOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel7)
                                .addGap(38, 38, 38)
                                .addComponent(month1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(insertBTN))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(pointTABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(timeop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(team1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(team2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(month1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(year1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(winOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(stdOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(refOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(insertBTN)
                .addGap(90, 90, 90)
                .addComponent(jLabel13)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(deleteOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBTN))
                .addGap(48, 48, 48)
                .addComponent(pointTABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(470, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MATCH ID", "DATE", "TIME", "TEAM 1", "TEAM 2", "WINNER", "STADIUM", "RID"
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
                        .addGap(270, 270, 270)
                        .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(553, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 395, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = Connect.getConnection();

            Statement stm = con.createStatement();

            String sql = "SELECT * FROM MATCHES";
            ResultSet rs = stm.executeQuery(sql);

            // Clear existing data from jTable1
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            // Populate jTable1 with data from ResultSet
            while (rs.next()) {
                int mid=rs.getInt("MATCH_ID");
                String date=rs.getString("MDATE");
                String time=rs.getString("MTIME");
                String t1=rs.getString("T1");
                String t2=rs.getString("T2");
                String win=rs.getString("WINNER");
                int rid=rs.getInt("RID");
                String sname=rs.getString("SNAME");
                // Add a new row to jTable1
                model.addRow(new Object[]{mid,date,time,t1,t2,win,sname,rid});
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

    private void month1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_month1ActionPerformed
        updateDateOptions();
    }//GEN-LAST:event_month1ActionPerformed

    private void timeopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeopActionPerformed

    }//GEN-LAST:event_timeopActionPerformed

    private void insertBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBTNActionPerformed
        if(b==1||b==2){
            try{
            if(team1.getSelectedItem()==team2.getSelectedItem()){
                JOptionPane.showMessageDialog(this, "Please select two different teams.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String time=(String)timeop.getSelectedItem();
            String sdd=(String) date1.getSelectedItem();
            String sdm=(String) month1.getSelectedItem();
            String sdy=(String) year1.getSelectedItem();
            String sd = sdy + "-" + sdm + "-" + sdd;
            String sname=(String)stdOP.getSelectedItem();
            String t1=(String)team1.getSelectedItem();
            String t2=(String)team2.getSelectedItem();
            String win=(String)winOP.getSelectedItem();
            String ri=(String)refOP.getSelectedItem();
            int rid=0;
           try{
             rid=Integer.parseInt(ri);
           }catch(NumberFormatException ex){ 
                   ex.printStackTrace();            
                }
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = Connect.getConnection();
           Statement stm = con.createStatement();
           String sql="insert into matches (MDATE,MTIME,T1,T2,WINNER,RID,SNAME)VALUES ('"+sd+"','"+time+"','"+t1+"','"+t2+"','"+win+"',"+rid+",'"+sname+"') ";
           stm.executeUpdate(sql);
           ResultSet rs=stm.executeQuery("select * FROM MATCHES ORDER BY MATCH_ID DESC LIMIT 1");
           JOptionPane.showMessageDialog(this, "added new match succesfully");
           displayBTNActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "ManualTrigger"));
                if(rs.next()){
                    String temp=rs.getString("MATCH_ID");
                    deleteOP.addItem(temp);
                    
                }
           
            }
        catch (ClassNotFoundException ex) {
                Logger.getLogger(CONTRACTS.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CONTRACTS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "YOU DONT HAVE ACCESS TO INSERT ");
        }
            
    }//GEN-LAST:event_insertBTNActionPerformed

    private void deleteOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteOPActionPerformed

    private void date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date1ActionPerformed
        
    }//GEN-LAST:event_date1ActionPerformed

    private void year1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year1ActionPerformed
        updateDateOptions();
    }//GEN-LAST:event_year1ActionPerformed

    private void team1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_team1ActionPerformed
        
        updateWinnerComboBox();
     
    }//GEN-LAST:event_team1ActionPerformed

    private void team2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_team2ActionPerformed
        
       updateWinnerComboBox();
    }//GEN-LAST:event_team2ActionPerformed

    private void winOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_winOPActionPerformed

    private void stdOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdOPActionPerformed

    private void refOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refOPActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
         try{
            String selected=(String)deleteOP.getSelectedItem();

            if(b==1||b==2){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = Connect.getConnection();
                Statement stm = con.createStatement();

                String sql = "DELETE FROM MATCHES where MATCH_ID='"+selected+"'";
                int rowsAffected =stm.executeUpdate(sql);
                if(rowsAffected>0){
                    JOptionPane.showMessageDialog(this,"MATCH WITH ID " + selected +" IS DELETED ");
                    deleteOP.removeItem(selected);
                    
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

    private void pointTABLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointTABLEActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = Connect.getConnection();
            Statement stm = con.createStatement();
            String query = "SELECT " +
                "RANK() OVER (ORDER BY TotalPoints DESC) AS Position, " +
                "`Team Name`, " +
                "`Matches Played`, " +
                "TotalPoints AS Points " +
                "FROM (" +
                    "SELECT " +
                        "t.TEAM_NAME AS 'Team Name', " +
                        "COUNT(m.MATCH_ID) AS 'Matches Played', " +
                        "SUM(CASE WHEN t.TEAM_NAME = m.WINNER THEN 3 ELSE 0 END) AS TotalPoints " +
                    "FROM " +
                        "team t " +
                    "LEFT JOIN " +
                        "matches m ON t.TEAM_NAME IN (m.T1, m.T2) " +
                    "GROUP BY " +
                        "t.TEAM_NAME" +
                ") AS RankedTeams " +
                "ORDER BY " +
                    "TotalPoints DESC;";


            ResultSet resultSet = stm.executeQuery(query);

            // Create a DefaultTableModel and set it to the JTable
            DefaultTableModel model = new DefaultTableModel(new Object[]{"Position", "Team Name", "Matches Played", "Points"}, 0);
            while (resultSet.next()) {
                Object[] row = {
                        resultSet.getInt("Position"),
                        resultSet.getString("Team Name"),
                        resultSet.getInt("Matches Played"),
                        resultSet.getInt("Points")
                };
                model.addRow(row);
            }

            JTable pointsTable = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(pointsTable);

            JOptionPane.showMessageDialog(null, scrollPane, "Points Table", JOptionPane.INFORMATION_MESSAGE);

            resultSet.close();
            con.close();
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(MATCHES.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_pointTABLEActionPerformed

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
            java.util.logging.Logger.getLogger(MATCHES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MATCHES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MATCHES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MATCHES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MATCHES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> date1;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JComboBox<String> deleteOP;
    private javax.swing.JButton displayBTN;
    private javax.swing.JButton insertBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> month1;
    private javax.swing.JButton pointTABLE;
    private javax.swing.JComboBox<String> refOP;
    private javax.swing.JComboBox<String> stdOP;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> team1;
    private javax.swing.JComboBox<String> team2;
    private javax.swing.JComboBox<String> timeop;
    private javax.swing.JComboBox<String> winOP;
    private javax.swing.JComboBox<String> year1;
    // End of variables declaration//GEN-END:variables
}
