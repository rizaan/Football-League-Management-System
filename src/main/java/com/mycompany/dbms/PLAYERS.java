/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.dbms;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moideen Aadil Shan
 */
public class PLAYERS extends javax.swing.JFrame {
int b;
    /**
     * Creates new form PLAYERS
     */
       private void ciddrop() throws SQLException{
        try {
        cidOP.removeAllItems();
        jcOP.removeAllItems();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = Connect.getConnection();
        Statement stm = con.createStatement();
        String sel=(String)teamOP.getSelectedItem();
        
       
        
        String sql="select contract_id from contracts where employer='"+sel+"'";
        ResultSet rs=stm.executeQuery(sql);
        while(rs.next()){
            String a=rs.getString("contract_id");
            cidOP.addItem(a);
        }
  
sql = "SELECT jersey_no FROM players WHERE team='" + sel + "'";
rs = stm.executeQuery(sql);

Set<Integer> jerseyNumbers = new HashSet<>();
while (rs.next()) {
    int jerseyNo = rs.getInt("jersey_no");
    jerseyNumbers.add(jerseyNo);
}

for (int j = 1; j <= 100; j++) {
    if (!jerseyNumbers.contains(j)) {
        jcOP.addItem(String.valueOf(j));
    }
}


        
        
    } catch (SQLException ex) {
        ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
       
  private void ciddrop1() throws SQLException{
        try {
        cidOP1.removeAllItems();
        jcOP1.removeAllItems();
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
        
        String sql="select * from players where player_id="+sel+"";
        ResultSet rs=stm.executeQuery(sql);
        rs.next();
        String c=rs.getString("cid");
        String  team=rs.getString("team");
  
sql = "SELECT jersey_no FROM players WHERE team='" + team + "'";
rs = stm.executeQuery(sql);

Set<Integer> jerseyNumbers = new HashSet<>();
while (rs.next()) {
    int jerseyNo = rs.getInt("jersey_no");
    jerseyNumbers.add(jerseyNo);
}

for (int j = 1; j <= 100; j++) {
    if (!jerseyNumbers.contains(j)) {
        jcOP1.addItem(String.valueOf(j));
    }
}


sql = "SELECT contract_id FROM contracts WHERE employer='" + team + "'";
rs = stm.executeQuery(sql);
while(rs.next()){
    String a=rs.getString("contract_id");
    cidOP1.addItem(a);
}
cidOP1.removeItem(c);

        
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
        
        String sql = "SELECT * from TEAM";
        ResultSet rs = stm.executeQuery(sql);

        
        while (rs.next()) {
            String name = rs.getString("team_name");
            teamOP.addItem(name);
            
        }
        sql="select * from players";
        rs=stm.executeQuery(sql);
        while(rs.next()){
            String a =rs.getString("player_id");
            statsOP.addItem(a);
            deleteOP.addItem(a);
            updateOP.addItem(a);
        }
        
   
        

    } catch (SQLException ex) {
        ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    public PLAYERS(int a) throws SQLException {
        initComponents();
        b=a;
        dropdown();
        setExtendedState(PLAYERS.MAXIMIZED_BOTH);
        if(b==0){
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel5.setVisible(false);
            jLabel4.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jLabel15.setVisible(false);
            jLabel13.setVisible(false);
            jLabel14.setVisible(false);
            fname1.setVisible(false);
            lname1.setVisible(false);
            ageOP.setVisible(false);
            teamOP.setVisible(false);
            jcOP.setVisible(false);
            cidOP.setVisible(false);
            deleteOP.setVisible(false);
            ageOP2.setVisible(false);
            cidOP1.setVisible(false);
            jcOP1.setVisible(false);
            insertBTN.setVisible(false);
            deleteBTN.setVisible(false);
            updateBTN.setVisible(false);
            nationOP.setVisible(false);
            updateOP.setVisible(false);
            
            
        }
    }

    private PLAYERS() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        lname1 = new javax.swing.JTextField();
        ageOP = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        nationOP = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        teamOP = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jcOP = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cidOP = new javax.swing.JComboBox<>();
        insertBTN = new javax.swing.JButton();
        deleteOP = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        deleteBTN = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        updateOP = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cidOP1 = new javax.swing.JComboBox<>();
        jcOP1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ageOP2 = new javax.swing.JComboBox<>();
        updateBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        displayBTN = new javax.swing.JButton();
        statsOP = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        displayBTN1 = new javax.swing.JButton();
        generate = new javax.swing.JButton();

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
        jLabel1.setText("ADD NEW PLAYER:");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("age:");

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

        ageOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "___", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", " " }));
        ageOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageOPActionPerformed(evt);
            }
        });

        jLabel5.setText("Nationality:");

        nationOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "___", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Democratic Republic of the Congo", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia" }));
        nationOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationOPActionPerformed(evt);
            }
        });

        jLabel6.setText("team:");

        teamOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "___" }));
        teamOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamOPActionPerformed(evt);
            }
        });

        jLabel7.setText("jersey no:");

        jcOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "___" }));
        jcOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcOPActionPerformed(evt);
            }
        });

        jLabel8.setText("cid:");

        cidOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "___" }));
        cidOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidOPActionPerformed(evt);
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

        deleteOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "___" }));
        deleteOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOPActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("DELETE PLAYER :");

        jLabel10.setText("PID :");

        deleteBTN.setBackground(new java.awt.Color(0, 102, 102));
        deleteBTN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        deleteBTN.setForeground(new java.awt.Color(255, 255, 255));
        deleteBTN.setText("DELETE");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("UPDATE PLAYER :");

        jLabel12.setText("PID :");

        updateOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "___" }));
        updateOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOPActionPerformed(evt);
            }
        });

        jLabel13.setText("cid:");

        cidOP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "___" }));
        cidOP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidOP1ActionPerformed(evt);
            }
        });

        jcOP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "___" }));
        jcOP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcOP1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Jersey no:");

        jLabel15.setText("age:");

        ageOP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "___", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", " " }));
        ageOP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageOP2ActionPerformed(evt);
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
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel5))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jcOP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(27, 27, 27))
                                                .addComponent(nationOP, 0, 1, Short.MAX_VALUE)))))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(cidOP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(teamOP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ageOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(insertBTN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(deleteOP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(deleteBTN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcOP1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateOP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageOP2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidOP1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(51, 51, 51)
                        .addComponent(updateBTN)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nationOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(teamOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cidOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(insertBTN)
                .addGap(51, 51, 51)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(deleteBTN))
                .addGap(41, 41, 41)
                .addComponent(jLabel11)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(ageOP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(updateOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidOP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(updateBTN))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jcOP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 535, Short.MAX_VALUE))
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
                "PID", "FIRST NAME", "LAST NAME", "AGE", "JC NO", "TEAM", "NATIONALITY", "CID"
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

        statsOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "___" }));
        statsOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsOPActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PID :");

        displayBTN1.setBackground(new java.awt.Color(0, 0, 0));
        displayBTN1.setFont(new java.awt.Font("Solid Edge Stencil", 0, 12)); // NOI18N
        displayBTN1.setForeground(new java.awt.Color(255, 255, 255));
        displayBTN1.setText("DISPLAY PLAYER STATS");
        displayBTN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        displayBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTN1ActionPerformed(evt);
            }
        });

        generate.setBackground(new java.awt.Color(0, 0, 0));
        generate.setFont(new java.awt.Font("Solid Edge Stencil", 0, 12)); // NOI18N
        generate.setForeground(new java.awt.Color(255, 255, 255));
        generate.setText("GENERATE TOP STATS");
        generate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statsOP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statsOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3037, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(286, 286, 286))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        HomePage hp=new HomePage(b);
        hp.show();
    }//GEN-LAST:event_backActionPerformed

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = Connect.getConnection();

            Statement stm = con.createStatement();

            String sql = "SELECT * FROM PLAYERS";
            ResultSet rs = stm.executeQuery(sql);

            // Clear existing data from jTable1
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            // Populate jTable1 with data from ResultSet
            while (rs.next()) {
                String fname=rs.getString("fname");
                String lname=rs.getString("lname");
                int age=rs.getInt("age");
                String jc=rs.getString("jersey_no");
                int cid=rs.getInt("cid");
                String team=rs.getString("TEAM");
                int pid=rs.getInt("PLAYER_ID");
                String nation=rs.getString("nationality");
                // Add a new row to jTable1
                model.addRow(new Object[]{pid,fname,lname,age,jc,team,nation,cid});
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

    private void fname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fname1ActionPerformed

    private void lname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lname1ActionPerformed

    private void ageOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageOPActionPerformed

    private void nationOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationOPActionPerformed

    private void teamOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamOPActionPerformed
        if(teamOP.getSelectedItem()!="___"){
            try {
                ciddrop();
            } catch (SQLException ex) {
                Logger.getLogger(PLAYERS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(teamOP.getSelectedItem()=="___"){
            jcOP.removeAllItems();
            cidOP.removeAllItems();
            jcOP.addItem("___");
            cidOP.addItem("___");
        }
    }//GEN-LAST:event_teamOPActionPerformed

    private void jcOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcOPActionPerformed

    private void cidOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidOPActionPerformed

    private void insertBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBTNActionPerformed
        if(b==1||b==4){
            if(fname1.equals("") || lname1.equals("") || ageOP.getSelectedItem().equals("___") || nationOP.equals("___") || teamOP.getSelectedItem().equals(("___"))|| jcOP.getSelectedItem().equals("___") ||  cidOP.getSelectedItem().equals("___")){
                JOptionPane.showMessageDialog(this, "ENTER AND SELECT ALL THE FIELDS ");
                return;
            }

            String fname=(String)fname1.getText();
            String lname=(String)lname1.getText();
            String ag=(String)ageOP.getSelectedItem();
            String nation=(String)nationOP.getSelectedItem();
            String team=(String)teamOP.getSelectedItem();
            String jc=(String)jcOP.getSelectedItem();
            String cid=(String)cidOP.getSelectedItem();
            int age=0,js=0,cid1=0;
            try{
                age=Integer.parseInt(ag);
                js=Integer.parseInt(jc);
                cid1=Integer.parseInt(cid);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "ENTER A VALID AGE ");
                return;
            }
            
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = Connect.getConnection();
                Statement stm = con.createStatement();
                String sql="insert into players (fname,lname,nationality,jersey_no,team,cid,age) values ('"+fname+"','"+lname+"','"+nation+"',"+js+",'"+team+"',"+cid1+",'"+age+"')";
                int affect=stm.executeUpdate(sql);

                if(affect>0){
                    
//                    ResultSet rs=stm.executeQuery("select * FROM PLAYERS ORDER BY PLAYER_ID DESC LIMIT 1");
//                    if(rs.next()){
//                        String temp=rs.getString("MGR_ID");
//                        deleteOP.addItem(temp);
//                        updateOP.addItem(temp);
//                    }

                    JOptionPane.showMessageDialog(this, "INSERTED SUCCESSFULLY");
                    ResultSet rs=stm.executeQuery("select * FROM PLAYERS ORDER BY PLAYER_ID DESC LIMIT 1");
                    rs.next();
                    int pid=rs.getInt("PLAYER_ID");
                    String a=String.valueOf(pid);
                    deleteOP.addItem(a);
                    updateOP.addItem(a);
                    statsOP.addItem(a);       
                    ciddrop();
                    fname1.setText("");
                    lname1.setText("");
                    nationOP.setSelectedItem("___");
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

    private void deleteOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteOPActionPerformed

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
                String sql = "delete from players where player_id='"+sel+"'";
                int rs =stm.executeUpdate(sql);
                if(rs>0){
                     JOptionPane.showMessageDialog(this, "DELETED SUCCESSFULLY");
                     deleteOP.removeItem(selected);
                     updateOP.removeItem(selected);
                     statsOP.removeItem(selected);
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

    private void updateOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOPActionPerformed
        if(updateOP.getSelectedItem()!="___"){
            try {
                ciddrop1();
            } catch (SQLException ex) {
                Logger.getLogger(PLAYERS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(updateOP.getSelectedItem()=="___"){
            jcOP1.removeAllItems();
            cidOP1.removeAllItems();
            jcOP1.addItem("___");
            cidOP1.addItem("___");
        }
    }//GEN-LAST:event_updateOPActionPerformed

    private void cidOP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidOP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidOP1ActionPerformed

    private void jcOP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcOP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcOP1ActionPerformed

    private void ageOP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageOP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageOP2ActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        if(b==1||b==4){
            String selected=(String)updateOP.getSelectedItem();
            try{

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = Connect.getConnection();
                Statement stm = con.createStatement();
                String ag=(String)ageOP2.getSelectedItem();
                String ci=(String)cidOP1.getSelectedItem();
                String j=(String)jcOP1.getSelectedItem();
                int age=0,cid=0,jc=0,pid;
                boolean flag=false;
                try{
                    pid=Integer.parseInt(selected);
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(this,"SELECT THE MANAGER YOU WANT TO UPDATE");
                    ex.printStackTrace();
                    return;
                }

                if(!ageOP2.getSelectedItem().equals("___")){
                    try{
                        age=Integer.parseInt(ag);
                    }catch(NumberFormatException ex){
                        
                        ex.printStackTrace();
                        return;
                    }
                    
                        String sql = "UPDATE players SET  age = " + age + " WHERE player_id = " + pid;
                        int affect=stm.executeUpdate(sql);
                        if(affect>0){
                            flag=true;
                        
                        }

                }
                if(!cidOP1.getSelectedItem().equals("___")){
                    try{
                        cid=Integer.parseInt(ci);
                    }catch(NumberFormatException ex){
                        ex.printStackTrace();
                        return;
                    }
                    String sql = "UPDATE players SET cid = " + cid + " WHERE player_id = " + pid;
                    int affect=stm.executeUpdate(sql);
                    if(affect>0){

                        flag=true;
                    }
                }
                 if(!jcOP1.getSelectedItem().equals("___")){
                    try{
                        jc=Integer.parseInt(j);
                    }catch(NumberFormatException ex){
                        ex.printStackTrace();
                        return;
                    }
                    String sql = "UPDATE players SET jersey_no = " + jc + " WHERE player_id = " + pid;
                    int affect=stm.executeUpdate(sql);
                    if(affect>0){

                        flag=true;
                    }
                }

                if(flag){
                    cidOP1.removeAllItems();
                    ciddrop1();
                    JOptionPane.showMessageDialog(this,"PLAYER "+pid+" UPDATED SUCCESSFULLY");
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

    private void statsOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statsOPActionPerformed

    private void displayBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTN1ActionPerformed
        if(statsOP.getSelectedItem()!="___"){
            try{

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = Connect.getConnection();
                Statement stm = con.createStatement();
                 JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            String a=(String)statsOP.getSelectedItem();
            int k=0;
            try{
                k=Integer.parseInt(a);
            }catch(NumberFormatException ex){
                ex.printStackTrace();
            }
            String sql = "SELECT * FROM STATS,PLAYERS WHERE PLAYER_ID=PID AND PID="+k+"";
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
            textArea.append("PLAYER ID: " + rs.getInt("PID") + "\n"
                    +"PLAYER NAME:"+rs.getString("FNAME")+" "+rs.getString("LNAME")+"\n"
                    + "GOALS: " + rs.getString("GOALS") + "\n"
                    + "ASSISTS: " + rs.getString("ASSISTS") + "\n"
                    + "YELLOW CARDS: " + rs.getString("YELLOW_CARDS") + "\n"
                    + "RED CARDS: " + rs.getString("RED_CARDS") + "\n\n");
            
        }
            
            

        // Create a JScrollPane to allow scrolling if there are many matches
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 300));
         textArea.setCaretPosition(0);
        // Display the popup using JOptionPane with a JScrollPane
        JOptionPane.showMessageDialog(null, scrollPane, "STATS OF PLAYER WITH PLAYER ID: :"+statsOP.getSelectedItem(), JOptionPane.INFORMATION_MESSAGE);
               
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PLAYERS.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(PLAYERS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"SELECT THE PLAYER");
        }
    }//GEN-LAST:event_displayBTN1ActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = Connect.getConnection();
    Statement stm = con.createStatement();

    String goalsQuery = "SELECT p.FNAME, p.LNAME, s.GOALS FROM players p INNER JOIN stats s ON p.PLAYER_ID = s.PID ORDER BY s.GOALS DESC LIMIT 3";
    ResultSet goalsResult = stm.executeQuery(goalsQuery);

    String goalsMessage = "Top 3 Players for Goals:\n";
    while (goalsResult.next()) {
        goalsMessage += goalsResult.getString("FNAME") + " " + goalsResult.getString("LNAME") + " - " + goalsResult.getInt("GOALS") + "\n";
    }

    String assistsQuery = "SELECT p.FNAME, p.LNAME, s.ASSISTS FROM players p INNER JOIN stats s ON p.PLAYER_ID = s.PID ORDER BY s.ASSISTS DESC LIMIT 3";
    ResultSet assistsResult = stm.executeQuery(assistsQuery);

    String assistsMessage = "\nTop 3 Players for Assists:\n";
    while (assistsResult.next()) {
        assistsMessage += assistsResult.getString("FNAME") + " " + assistsResult.getString("LNAME") + " - " + assistsResult.getInt("ASSISTS") + "\n";
    }

    String yellowCardsQuery = "SELECT p.FNAME, p.LNAME, s.YELLOW_CARDS FROM players p INNER JOIN stats s ON p.PLAYER_ID = s.PID ORDER BY s.YELLOW_CARDS DESC LIMIT 3";
    ResultSet yellowCardsResult = stm.executeQuery(yellowCardsQuery);

    String yellowCardsMessage = "\nTop 3 Players for Yellow Cards:\n";
    while (yellowCardsResult.next()) {
        yellowCardsMessage += yellowCardsResult.getString("FNAME") + " " + yellowCardsResult.getString("LNAME") + " - " + yellowCardsResult.getInt("YELLOW_CARDS") + "\n";
    }

    String redCardsQuery = "SELECT p.FNAME, p.LNAME, s.RED_CARDS FROM players p INNER JOIN stats s ON p.PLAYER_ID = s.PID ORDER BY s.RED_CARDS DESC LIMIT 3";
    ResultSet redCardsResult = stm.executeQuery(redCardsQuery);

    String redCardsMessage = "\nTop 3 Players for Red Cards:\n";
    while (redCardsResult.next()) {
        redCardsMessage += redCardsResult.getString("FNAME") + " " + redCardsResult.getString("LNAME") + " - " + redCardsResult.getInt("RED_CARDS") + "\n";
    }

    String message = goalsMessage + assistsMessage + yellowCardsMessage + redCardsMessage;

    JOptionPane.showMessageDialog(null, message, "Top Stats", JOptionPane.INFORMATION_MESSAGE);

    goalsResult.close();
    assistsResult.close();
    yellowCardsResult.close();
    redCardsResult.close();
    stm.close();
    con.close();
} catch (SQLException ex) {
    Logger.getLogger(TEAMS.class.getName()).log(Level.SEVERE, null, ex);
} catch (ClassNotFoundException ex) {
    Logger.getLogger(CONTRACTS.class.getName()).log(Level.SEVERE, null, ex);
}

    }//GEN-LAST:event_generateActionPerformed

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
            java.util.logging.Logger.getLogger(PLAYERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PLAYERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PLAYERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PLAYERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PLAYERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ageOP;
    private javax.swing.JComboBox<String> ageOP2;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> cidOP;
    private javax.swing.JComboBox<String> cidOP1;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JComboBox<String> deleteOP;
    private javax.swing.JButton displayBTN;
    private javax.swing.JButton displayBTN1;
    private javax.swing.JTextField fname1;
    private javax.swing.JButton generate;
    private javax.swing.JButton insertBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JComboBox<String> jcOP;
    private javax.swing.JComboBox<String> jcOP1;
    private javax.swing.JTextField lname1;
    private javax.swing.JComboBox<String> nationOP;
    private javax.swing.JComboBox<String> statsOP;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> teamOP;
    private javax.swing.JButton updateBTN;
    private javax.swing.JComboBox<String> updateOP;
    // End of variables declaration//GEN-END:variables
}
