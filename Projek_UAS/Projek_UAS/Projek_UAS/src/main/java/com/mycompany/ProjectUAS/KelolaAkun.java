/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ProjectUAS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HASNA PUTRI PRISWATI
 */
public class KelolaAkun extends javax.swing.JFrame {

    /**
     * Creates new form Pengguna
     */
   public KelolaAkun() {
    initComponents();
    tampil_table();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_dasar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePengguna = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jb_ubah = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Text_Username = new javax.swing.JTextField();
        Text_Password = new javax.swing.JTextField();
        Text_Nama = new javax.swing.JTextField();
        jb_bersihkan = new javax.swing.JButton();
        jb_hapus = new javax.swing.JButton();
        jb_tutup = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Text_notelp = new javax.swing.JTextField();
        fieldID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Text_alamat = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        Role = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_dasar.setBackground(new java.awt.Color(255, 255, 255));
        pn_dasar.setPreferredSize(new java.awt.Dimension(1366, 773));

        jPanel1.setBackground(new java.awt.Color(255, 245, 238));

        jPanel4.setBackground(new java.awt.Color(255, 245, 238));
        jPanel4.setPreferredSize(new java.awt.Dimension(227, 768));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel12)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(597, 597, 597))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(205, 179, 149));
        jPanel2.setPreferredSize(new java.awt.Dimension(765, 137));

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 245, 238));
        jLabel1.setText("PENGGUNA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(453, 453, 453))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );

        jPanel3.setBackground(new java.awt.Color(255, 245, 238));

        tablePengguna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Password", "Nama", "No Telp", "Alamat", "Role"
            }
        ));
        tablePengguna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePenggunaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePengguna);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(205, 179, 149));
        jLabel3.setText("Tabel Pengguna");

        jb_ubah.setText("Ubah");
        jb_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ubahActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(205, 179, 149));
        jLabel4.setText("ID :");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(205, 179, 149));
        jLabel6.setText("Username  : ");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(205, 179, 149));
        jLabel7.setText("Password :");

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(205, 179, 149));
        jLabel11.setText("Nama :");

        jb_bersihkan.setText("Bersihkan");
        jb_bersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_bersihkanActionPerformed(evt);
            }
        });

        jb_hapus.setText("Hapus");
        jb_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_hapusActionPerformed(evt);
            }
        });

        jb_tutup.setText("Tutup");
        jb_tutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_tutupActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(205, 179, 149));
        jLabel5.setText("No Telp :");

        fieldID.setEditable(false);
        fieldID.setText("Otomatis Terisi");
        fieldID.setEnabled(false);
        fieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIDActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(205, 179, 149));
        jLabel10.setText("Alamat :");

        Text_alamat.setColumns(20);
        Text_alamat.setRows(5);
        jScrollPane2.setViewportView(Text_alamat);

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(205, 179, 149));
        jLabel13.setText("Role : ");

        Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih role", "Admin", "Super Admin" }));
        Role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jb_bersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Text_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Text_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Text_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fieldID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(133, 133, 133)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2)
                                            .addComponent(Role, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jb_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jb_tutup, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(322, 322, 322))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Text_notelp, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(322, 322, 322))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(Text_Username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Text_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Text_notelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_bersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_tutup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
        );

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1121, Short.MAX_VALUE)))
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_dasarLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(pn_dasar, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ubahActionPerformed
        // TODO add your handling code here:
        String id = fieldID.getText();
        String usernm = Text_Username.getText();
        String pw = Text_Password.getText();
        String nm = Text_Nama.getText();
        String notelp = Text_notelp.getText();
        String almt = Text_alamat.getText();
        String rl = (String) Role.getSelectedItem();

if(usernm.equals("")){
    JOptionPane.showMessageDialog(null, "Isi Username Terlebih Dahulu");
}else if(pw.equals("")){
    JOptionPane.showMessageDialog(null, "Isi Password Terlebih Dahulu");
}else if(nm.equals("")){
    JOptionPane.showMessageDialog(null, "Isi Nama Terlebih Dahulu");
}else if(notelp.equals("")){
    JOptionPane.showMessageDialog(null, "Isi No Telp Terlebih Dahulu");
}else if(almt.equals("")){
    JOptionPane.showMessageDialog(null, "Isi Alamat Terlebih Dahulu");
}else if(rl.equals("Pilih Role")){
    JOptionPane.showMessageDialog(null, "Pilih Role Terlebih Dahulu");
}else{
    try {
        String Vsql = "UPDATE admin SET username = ?, password = ?, nama = ?, no_telp = ?, alamat = ?, role = ? WHERE id_admin = ?";
        java.sql.Connection vconn = (Connection) Database.konfig();
        PreparedStatement pstmt = vconn.prepareStatement(Vsql);
        
        // Mengatur parameter dalam PreparedStatement
        pstmt.setString(1, usernm);
        pstmt.setString(2, pw);
        pstmt.setString(3, nm);
        pstmt.setString(4, notelp);
        pstmt.setString(5, almt);
        pstmt.setString(6, rl);
        pstmt.setString(7, id);
        
        int rowsUpdated = pstmt.executeUpdate(); // Menggunakan executeUpdate untuk pernyataan yang tidak mengembalikan result set
        
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Ubah Data Berhasil");
            tampil_table();
            bersih();
        } else {
            JOptionPane.showMessageDialog(null, "Ubah Data Gagal");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ubah Data Gagal");
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}

    }//GEN-LAST:event_jb_ubahActionPerformed

    private void jb_bersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_bersihkanActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_jb_bersihkanActionPerformed

    private void jb_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_hapusActionPerformed
        String id = fieldID.getText();
        String usernm = Text_Username.getText();
        String pw = Text_Password.getText();
        String nm = Text_Nama.getText();
        String notelp = Text_notelp.getText();
        String almt = Text_alamat.getText();
        String rl = (String) Role.getSelectedItem();
    
        if (id.equals("")) {
        JOptionPane.showMessageDialog(null, "Pilih data dari tabel terlebih dahulu untuk dihapus");
        } else {
         try {
            
            String query = "DELETE FROM admin WHERE id_admin = '"+id+"'";
            java.sql.Connection vconn =(Connection)Database.konfig();
            java.sql.PreparedStatement pst = vconn.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
            tampil_table();
            bersih();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hapus Data Gagal");
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        }
    }//GEN-LAST:event_jb_hapusActionPerformed

    private void jb_tutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_tutupActionPerformed
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jb_tutupActionPerformed

    private void fieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIDActionPerformed

    private void tablePenggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePenggunaMouseClicked
        // TODO add your handling code here:
        int baris = tablePengguna.rowAtPoint(evt.getPoint());
        //int kolom = Tabel_Karyawan.columnAtPoint(evt.getPoint());
        
        String id = tablePengguna.getValueAt(baris, 0).toString();
        fieldID.setText(id);
        
        String usernm = tablePengguna.getValueAt(baris, 1).toString();
        Text_Username.setText(usernm);
        
        String pw = tablePengguna.getValueAt(baris, 2).toString();
        Text_Password.setText(pw);
        
        String nm = tablePengguna.getValueAt(baris, 3).toString();
        Text_Nama.setText(nm);
        
        String no_telp = tablePengguna.getValueAt(baris, 4).toString();
        Text_notelp.setText(no_telp);
        
        String almt = tablePengguna.getValueAt(baris, 5).toString();
        Text_alamat.setText(almt);
        
        String rl = tablePengguna.getValueAt(baris, 6).toString();
        Role.setSelectedItem(rl);
    }//GEN-LAST:event_tablePenggunaMouseClicked

    private void RoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleActionPerformed

   private void tampil_table() {
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("ID");
        tb.addColumn("Username");
        tb.addColumn("Password");
        tb.addColumn("Nama");
        tb.addColumn("No Telp");
        tb.addColumn("Alamat");
        tb.addColumn("Role");
        
        try {
            String query = "SELECT * FROM admin";
            java.sql.Connection vconn = (Connection) Database.konfig();
            java.sql.Statement s = vconn.createStatement();
            java.sql.ResultSet r = s.executeQuery(query);
            
            while (r.next()) {
                tb.addRow(new Object[]{
                    r.getString("id_admin"),
                    r.getString("username"),
                    r.getString("password"),
                    r.getString("nama"),
                    r.getString("no_telp"),
                    r.getString("alamat"),
                    r.getString("role")
                });
            }
            tablePengguna.setModel(tb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void bersih() {
        fieldID.setText("");
        Text_Username.setText("");
        Text_Password.setText("");
        Text_Nama.setText("");
        Text_notelp.setText("");
        Text_alamat.setText("");
        Role.setSelectedIndex(0);
    }

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Role;
    private javax.swing.JTextField Text_Nama;
    private javax.swing.JTextField Text_Password;
    private javax.swing.JTextField Text_Username;
    private javax.swing.JTextArea Text_alamat;
    private javax.swing.JTextField Text_notelp;
    private javax.swing.JTextField fieldID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_bersihkan;
    private javax.swing.JButton jb_hapus;
    private javax.swing.JButton jb_tutup;
    private javax.swing.JButton jb_ubah;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JTable tablePengguna;
    // End of variables declaration//GEN-END:variables
}
