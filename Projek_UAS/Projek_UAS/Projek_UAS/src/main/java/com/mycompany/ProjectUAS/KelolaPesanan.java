/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ProjectUAS;

import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.VerticalAlignment;
import com.itextpdf.layout.borders.Border;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class KelolaPesanan extends javax.swing.JFrame {
    Connection con;
    Statement st;
    int xy;
    int xx;
    
    public static String id_pesanan;
    public static String Hrg;
    public static String Pj;
    public static String Tm;
    public static String Tk;
    public static String Pngrjn;
    public static String Ket;
    
            
    public KelolaPesanan() {
        initComponents();
        filter.add("Semua");
        filter.add("Selesai");
        filter.add("Ongoing");
        tampilTabel();
        bersih();
    }
    
    public String getIdPesanan() {
        return id_pesanan;
    }
    
    public String getTk() {
        return Tk;
    }
    
    public String getHrg() {
        return Hrg;
    }
    
    public String getPj() {
        return Pj;
    }
        
    public String getTm() {
        return Tm;
    }
    
    public String getPngrjn() {
        return Pngrjn;
    }
    
    public String getKet() {
        return Ket;
    }


    
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
        tablePesanan = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jb_tutup = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        buttonBersihkan = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonLanjut = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fieldIdPesanan = new javax.swing.JTextField();
        fieldPermJah = new javax.swing.JTextField();
        fieldTangMas = new javax.swing.JTextField();
        fieldHarga = new javax.swing.JTextField();
        fieldTangKel = new javax.swing.JTextField();
        fieldPengerjaan = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        fieldKeterangan = new javax.swing.JTextArea();
        filter = new java.awt.Choice();
        jLabel7 = new javax.swing.JLabel();
        buttonBuatKuitansi = new javax.swing.JButton();
        comboTipeKuitansi = new javax.swing.JComboBox<>();

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
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(628, 628, 628))
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
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(205, 179, 149));
        jPanel2.setPreferredSize(new java.awt.Dimension(765, 137));

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 245, 238));
        jLabel1.setText("PESANAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(454, 454, 454))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );

        jPanel3.setBackground(new java.awt.Color(255, 245, 238));

        tablePesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablePesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePesananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePesanan);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(205, 179, 149));
        jLabel3.setText("Tabel Pesanan");

        jb_tutup.setText("Tutup");
        jb_tutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_tutupActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(205, 179, 149));
        jLabel6.setText("ID Pesanan : ");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(205, 179, 149));
        jLabel8.setText("Permintaan Jahitan : ");

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(205, 179, 149));
        jLabel11.setText("Keterangan :");

        buttonBersihkan.setText("Bersihkan");
        buttonBersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBersihkanActionPerformed(evt);
            }
        });

        buttonUbah.setText("Ubah");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        buttonLanjut.setText("Lanjut");
        buttonLanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLanjutActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(205, 179, 149));
        jLabel9.setText("Harga :");

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(205, 179, 149));
        jLabel10.setText("Tanggal Keluar :");

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(205, 179, 149));
        jLabel13.setText("Tanggal Masuk :");

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(205, 179, 149));
        jLabel14.setText("Pengerjaan :");

        fieldIdPesanan.setEditable(false);
        fieldIdPesanan.setText("Otomatis Terisi");
        fieldIdPesanan.setActionCommand("null");
        fieldIdPesanan.setEnabled(false);
        fieldIdPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIdPesananActionPerformed(evt);
            }
        });

        fieldKeterangan.setColumns(20);
        fieldKeterangan.setRows(5);
        jScrollPane2.setViewportView(fieldKeterangan);

        filter.setName(""); // NOI18N
        filter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(205, 179, 149));
        jLabel7.setText("Filter: ");

        buttonBuatKuitansi.setText("Buat Kuitansi Masuk");
        buttonBuatKuitansi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuatKuitansiActionPerformed(evt);
            }
        });

        comboTipeKuitansi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih tipe kuitansi", "Hanya yang terpilih", "Semua yang terkait", " " }));
        comboTipeKuitansi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipeKuitansiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fieldIdPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel13))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(fieldTangMas, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                                .addComponent(fieldHarga)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(32, 32, 32)
                                            .addComponent(fieldPermJah, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(79, 79, 79)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(fieldTangKel))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addGap(44, 44, 44)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2)
                                                        .addComponent(fieldPengerjaan)))))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(78, 78, 78)
                                            .addComponent(jLabel11)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(buttonBuatKuitansi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(buttonBersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(buttonLanjut, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(buttonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(comboTipeKuitansi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jb_tutup, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(26, 26, 26))))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(fieldIdPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTangKel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldPermJah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldTangMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonBersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonLanjut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_tutup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(fieldPengerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBuatKuitansi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipeKuitansi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        filter.getAccessibleContext().setAccessibleName("");

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
                .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_dasarLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(pn_dasar, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_tutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_tutupActionPerformed
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jb_tutupActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        
        String pj = fieldPermJah.getText();
        String hrg = fieldHarga.getText();
        String tm = fieldTangMas.getText();
        String tk = fieldTangKel.getText();
        String pngrjn = fieldPengerjaan.getText();
        String ket = fieldKeterangan.getText();
        String id = fieldIdPesanan.getText();
        
        
        if (id.equals("") || id.equals("Otomatis Terisi")) {
            JOptionPane.showMessageDialog(null, "Pilih data dari tabel terlebih dahulu untuk dihapus!");
        } else {   
            int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                 try {
                    String query = "DELETE FROM pesan_pelanggan WHERE Id_Pesanan = '"+id+"'";
                    java.sql.Connection vconn =(Connection)Database.konfig();
                    java.sql.PreparedStatement pst = vconn.prepareStatement(query);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Hapus data berhasil!");
                    tampilTabel();
                    bersih();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Hapus data gagal: " + e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonBersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBersihkanActionPerformed
        bersih();
    }//GEN-LAST:event_buttonBersihkanActionPerformed

    private void buttonLanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLanjutActionPerformed
        Pj = fieldPermJah.getText();
        Hrg = fieldHarga.getText();
        Tm = fieldTangMas.getText();
        Tk = fieldTangKel.getText();
        Pngrjn = fieldPengerjaan.getText();
        Ket = fieldKeterangan.getText();
        
        if(Pj.equals("")){
           JOptionPane.showMessageDialog(null, "Isi Permintaan Jahitan Terlebih Dahulu!");
       }else if(Hrg.equals("")){
           JOptionPane.showMessageDialog(null, "Isi Harga Terlebih Dahulu!");
       }else if(Tm.equals("")){
           JOptionPane.showMessageDialog(null, "Isi Tanggal Masuk Terlebih Dahulu!");
       }else if(Pngrjn.equals("")){
           JOptionPane.showMessageDialog(null, "Isi Pengerjaan Terlebih Dahulu!");
       }else if(Ket.equals("")){
           JOptionPane.showMessageDialog(null, "Isi Keterangan Terlebih Dahulu!");
       }
        else{
            new Pelanggan().setVisible(true);
            dispose();
            UserSession.setIsCreateOrder(true);
                 
        }
    }//GEN-LAST:event_buttonLanjutActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
       
        String id = fieldIdPesanan.getText();
        String pj = fieldPermJah.getText();
        String hrg = fieldHarga.getText();
        String tm = fieldTangMas.getText();
        String tk = fieldTangKel.getText();
        String pngrjn = fieldPengerjaan.getText();
        String ket = fieldKeterangan.getText();
       
       if(id.equals("")||id.equals("Otomatis Terisi")){
           JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
       }
       else if(pj.equals("")){
           JOptionPane.showMessageDialog(null, "Isi Permintaan Jahitan Terlebih Dahulu!");
       }else if(hrg.equals("")){
           JOptionPane.showMessageDialog(null, "Isi Harga Terlebih Dahulu!");
       }else if(tm.equals("")){
           JOptionPane.showMessageDialog(null, "Isi Tanggal Masuk Terlebih Dahulu!");
       }else if(pngrjn.equals("")){
           JOptionPane.showMessageDialog(null, "Isi Pengerjaan Terlebih Dahulu!");
       }else if(ket.equals("")){
           JOptionPane.showMessageDialog(null, "Isi Keterangan Terlebih Dahulu!");
       }else{
            try {
                String Vsql = "UPDATE Pesan_Pelanggan SET Permintaan_Jahitan = ?, Harga = ?, Tanggal_Masuk = ?, Tanggal_Keluar = ?, Pengerjaan = ?, Keterangan = ? WHERE Id_Pesanan = ?";
                java.sql.Connection vconn = (Connection) Database.konfig();
                PreparedStatement pstmt = vconn.prepareStatement(Vsql);

                pstmt.setString(1, pj);
                pstmt.setString(2, hrg);
                pstmt.setString(3, tm);
                pstmt.setString(4, tk);
                pstmt.setString(5, pngrjn);
                pstmt.setString(6, ket);
                pstmt.setString(7, id);


                int rowsUpdated = pstmt.executeUpdate(); 
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Ubah data berhasil!");
                    tampilTabel();
                    bersih();
                } else {
                    JOptionPane.showMessageDialog(null, "Ubah data gagal!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Terjadi error saat mengubah data:" + e.getMessage());
            }
        }

    }//GEN-LAST:event_buttonUbahActionPerformed

    private void fieldIdPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIdPesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIdPesananActionPerformed

    private void tablePesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePesananMouseClicked
        int baris = tablePesanan.rowAtPoint(evt.getPoint());

        String id = tablePesanan.getValueAt(baris, 0).toString();
        fieldIdPesanan.setText(id);

        String pj = tablePesanan.getValueAt(baris, 1).toString();
        fieldPermJah.setText(pj);

        String hrg = tablePesanan.getValueAt(baris, 2).toString();
        fieldHarga.setText(hrg);

        String tm = tablePesanan.getValueAt(baris, 3).toString();
        fieldTangMas.setText(tm);

        String tk = tablePesanan.getValueAt(baris, 4).toString();
        fieldTangKel.setText(tk);
        System.out.println("Tanggal Keluar: " + tk);

        String pngrjn = tablePesanan.getValueAt(baris, 5).toString();
        fieldPengerjaan.setText(pngrjn);

        String ket = tablePesanan.getValueAt(baris, 6).toString();
        fieldKeterangan.setText(ket);

        if(tk == null || tk.trim().isEmpty()) {
            UserSession.setIsOrderCompleted(false);
        } else {   
            UserSession.setIsOrderCompleted(true);
        }

        Boolean currentIsOrderCompleted = UserSession.getIsOrderCompleted();
        System.out.println(UserSession.getIsOrderCompleted());

        if (currentIsOrderCompleted) {
            buttonBuatKuitansi.setText("Buat Kuitansi Keluar");
        } else {
            buttonBuatKuitansi.setText("Buat Kuitansi Masuk");
        }        
    }//GEN-LAST:event_tablePesananMouseClicked

    private void filterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterItemStateChanged
        String selectedItem = (String) evt.getItem();

        if (selectedItem.equals("Semua")) {
            tampilTabel();

        } else if (selectedItem.equals("Selesai")) {
            try {
                String query = "SELECT p.Tanggal_Masuk, pl.Nama, p.Permintaan_Jahitan, p.Harga, p.Keterangan "
                + "FROM pelanggan pl "
                + "JOIN pesan_pelanggan p ON pl.id_pelanggan = p.id_pelanggan "
                + "WHERE COALESCE(p.Tanggal_Keluar, '') != ''";

                java.sql.Connection vconn = (Connection) Database.konfig();
                java.sql.Statement s = vconn.createStatement();
                java.sql.ResultSet r = s.executeQuery(query);

                DefaultTableModel tb = new DefaultTableModel();
                tb.addColumn("Tanggal Masuk");
                tb.addColumn("Nama");
                tb.addColumn("Permintaan Jahitan");
                tb.addColumn("Harga");
                tb.addColumn("Keterangan");

                while (r.next()) {
                    tb.addRow(new Object[]{
                        r.getString("Tanggal_Masuk"),
                        r.getString("Nama"),
                        r.getString("Permintaan_Jahitan"),
                        r.getInt("Harga"),
                        r.getString("Keterangan")
                    });
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (selectedItem.equals("Ongoing")) {
            try {
                String query = "SELECT p.Tanggal_Masuk, pl.Nama, p.Permintaan_Jahitan, p.Harga, p.Keterangan "
                + "FROM pelanggan pl "
                + "JOIN pesan_pelanggan p ON pl.id_pelanggan = p.id_pelanggan "
                + "WHERE COALESCE(p.Tanggal_Keluar, '') = ''";

                java.sql.Connection vconn = (Connection) Database.konfig();
                java.sql.Statement s = vconn.createStatement();
                java.sql.ResultSet r = s.executeQuery(query);

                DefaultTableModel tb = new DefaultTableModel();
                tb.addColumn("Tanggal Masuk");
                tb.addColumn("Nama");
                tb.addColumn("Permintaan Jahitan");
                tb.addColumn("Harga");
                tb.addColumn("Keterangan");

                while (r.next()) {
                    tb.addRow(new Object[]{
                        r.getString("Tanggal_Masuk"),
                        r.getString("Nama"),
                        r.getString("Permintaan_Jahitan"),
                        r.getInt("Harga"),
                        r.getString("Keterangan")
                    });
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_filterItemStateChanged

    private void buttonBuatKuitansiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuatKuitansiActionPerformed
        String tipeKuitansi = (String) comboTipeKuitansi.getSelectedItem();
        String idPesanan = fieldIdPesanan.getText();
        String tangMas = fieldTangMas.getText();
        String tangKel = fieldTangKel.getText();

        if (tipeKuitansi.equals("Pilih tipe kuitansi")) {
            JOptionPane.showMessageDialog(null, "Pilih tipe kuitansi dari tabel terlebih dahulu!");
            return;
        }

        try {
            Connection conn = (Connection) Database.konfig();
            String query = "SELECT Id_Pelanggan FROM pesan_pelanggan WHERE Id_Pesanan = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(idPesanan));
            ResultSet rs = pstmt.executeQuery();
            
            if(tipeKuitansi.equals("Hanya yang terpilih")){
                if (buttonBuatKuitansi.getText().equals("Buat Kuitansi Masuk")) {
                    buatKuitansi(tangMas, null, Integer.parseInt(idPesanan), tipeKuitansi);              
                } else {
                    buatKuitansi(tangMas, tangKel, Integer.parseInt(idPesanan), tipeKuitansi);  
                }
                
            }else {
                if (rs.next()) {
                int idPelanggan = rs.getInt("Id_Pelanggan");
                System.out.println(idPelanggan );
                
                
                    if (buttonBuatKuitansi.getText().equals("Buat Kuitansi Masuk")) {
                        buatKuitansi(tangMas, null, idPelanggan, tipeKuitansi);              
                    } else {
                        buatKuitansi(tangMas, tangKel, idPelanggan, tipeKuitansi);  
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Id Pesanan tidak ditemukan!");
                }
            }


            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException | IOException ex) {
            Logger.getLogger(KelolaPesanan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buttonBuatKuitansiActionPerformed

    private void comboTipeKuitansiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipeKuitansiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipeKuitansiActionPerformed

public void tampilTabel() {
    DefaultTableModel tb = new DefaultTableModel();
    fieldIdPesanan.setText("Otomatis terisi");
    tb.addColumn("Id");
    tb.addColumn("Permintaan Jahitan");
    tb.addColumn("Harga");
    tb.addColumn("Tanggal_Masuk");
    tb.addColumn("Tanggal_Keluar");
    tb.addColumn("Pengerjaan");
    tb.addColumn("Keterangan");
    tb.addColumn("Nama Pelanggan"); // Add a new column for Nama

    try {
        String query = "SELECT pp.*, p.Nama " +
                       "FROM pesan_pelanggan pp " +
                       "JOIN pelanggan p ON pp.Id_Pelanggan = p.Id_Pelanggan";
        java.sql.Connection vconn = (Connection) Database.konfig();
        java.sql.Statement s = vconn.createStatement();
        java.sql.ResultSet r = s.executeQuery(query);
        int counter = 1;
        while (r.next()) {
            tb.addRow(new Object[]{
                r.getString("id_pesanan"),
                r.getString("permintaan_jahitan"),
                r.getString("harga"),
                r.getString("tanggal_masuk"),
                r.getString("tanggal_keluar"),
                r.getString("pengerjaan"),
                r.getString("keterangan"),
                r.getString("Nama") 
            });
        }
        tablePesanan.setModel(tb);
    } catch (Exception e) {
        e.printStackTrace();
        }
    }
    
    private void bersih() {
        fieldIdPesanan.setText("Otomatis Terisi");
        fieldPermJah.setText("");
        fieldHarga.setText("");
        fieldTangMas.setText("");
        fieldTangKel.setText("");
        fieldPengerjaan.setText("");
        fieldKeterangan.setText("");
        
    }
    


    
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBersihkan;
    private javax.swing.JButton buttonBuatKuitansi;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonLanjut;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JComboBox<String> comboTipeKuitansi;
    private javax.swing.JTextField fieldHarga;
    private javax.swing.JTextField fieldIdPesanan;
    private javax.swing.JTextArea fieldKeterangan;
    private javax.swing.JTextField fieldPengerjaan;
    private javax.swing.JTextField fieldPermJah;
    private javax.swing.JTextField fieldTangKel;
    private javax.swing.JTextField fieldTangMas;
    private java.awt.Choice filter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_tutup;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JTable tablePesanan;
    // End of variables declaration//GEN-END:variables

    private void buatKuitansi(String tanggal_masuk, String tanggal_keluar, int id, String tipeKuitansi) throws FileNotFoundException, IOException {
        String path = "D:\\Kuitansi\\kuitansi-masuk-" + tanggal_masuk.replace("/", "-") + "-" + id + ".pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        PageSize customPageSize = new PageSize(PageSize.A4.getWidth(), PageSize.A4.getHeight() / 2);
        pdfDocument.setDefaultPageSize(customPageSize);
        Document document = new Document(pdfDocument);

        float col = 280f;
        float columnWidth[] = {col, col};

        Table table = new Table(columnWidth);

        table.setBackgroundColor(new DeviceRgb(205, 179, 149)).setFontColor(ColorConstants.WHITE);

        table.addCell(new Cell().add(new Paragraph("Kuitansi")).setTextAlignment(TextAlignment.CENTER).setVerticalAlignment(VerticalAlignment.MIDDLE).setMarginTop(30f).setMarginBottom(30f).setFontSize(30f).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(new Paragraph("HARF Taylor\nJl. UPI Cibiru\n087654321")).setTextAlignment(TextAlignment.RIGHT).setVerticalAlignment(VerticalAlignment.MIDDLE).setMarginTop(30f).setMarginBottom(30f).setMarginRight(10f).setBorder(Border.NO_BORDER));

        float colWidth[] = {150, 300, 100, 80};
        Table customerInfoTable = new Table(colWidth);

        customerInfoTable.addCell(new Cell(0, 4).add(new Paragraph("Informasi Pelanggan")).setBorder(Border.NO_BORDER).setBold());

        float itemInfoColWidth[] = {140, 140, 140, 140};
        Table itemInfoTable = new Table(itemInfoColWidth);

        int total = 0;
        try {
            String sql = null;
            if ((tanggal_keluar == null || tanggal_keluar.trim().isEmpty()) && tipeKuitansi.equals("Semua yang terkait")) {
                JOptionPane.showMessageDialog(null, "A");
                sql = "SELECT pp.Permintaan_Jahitan, pp.Harga, pp.Tanggal_Masuk, pp.Pengerjaan, pp.Keterangan, p.Nama, p.No_Telp, p.Email, p.Alamat, p.Id_Pelanggan " +
                    "FROM pesan_pelanggan pp " +
                    "JOIN pelanggan p ON pp.Id_Pelanggan = p.Id_Pelanggan " +
                    "WHERE pp.Tanggal_Masuk = ? " +
                    "AND pp.Id_Pelanggan = ? " +
                    "AND COALESCE(pp.Tanggal_Masuk, '') != ''";
            } else if ((tanggal_keluar != null || !tanggal_keluar.trim().isEmpty()) && tipeKuitansi.equals("Semua yang terkait")) {
                JOptionPane.showMessageDialog(null, "B");
                sql = "SELECT pp.Permintaan_Jahitan, pp.Harga, pp.Tanggal_Masuk, pp.Tanggal_Keluar, pp.Pengerjaan, pp.Keterangan, p.Nama, p.No_Telp, p.Email, p.Alamat, p.Id_Pelanggan " +
                    "FROM pesan_pelanggan pp " +
                    "JOIN pelanggan p ON pp.Id_Pelanggan = p.Id_Pelanggan " +
                    "WHERE pp.Tanggal_Masuk = ? " +
                    "AND pp.Tanggal_Keluar = ? " +       
                    "AND pp.Id_Pelanggan = ? ";
            }  else if (tanggal_keluar == null || tanggal_keluar.trim().isEmpty() && tipeKuitansi == "Hanya yang terpilih") {
                JOptionPane.showMessageDialog(null, "C");
                sql = "SELECT pp.Permintaan_Jahitan, pp.Harga, pp.Tanggal_Masuk, pp.Pengerjaan, pp.Keterangan, p.Nama, p.No_Telp, p.Email, p.Alamat, p.Id_Pelanggan " +
                    "FROM pesan_pelanggan pp " +
                    "JOIN pelanggan p ON pp.Id_Pelanggan = p.Id_Pelanggan " +
                    "WHERE pp.Tanggal_Masuk = ? " +
                    "AND pp.Id_Pesanan = ? " +
                    "AND COALESCE(pp.Tanggal_Masuk, '') != ''";
            } else if (tanggal_keluar != null || !tanggal_keluar.trim().isEmpty() && tipeKuitansi == "Hanya yang terpilih") {
                JOptionPane.showMessageDialog(null, "D");
                sql = "SELECT pp.Permintaan_Jahitan, pp.Harga, pp.Tanggal_Masuk, pp.Tanggal_Keluar, pp.Pengerjaan, pp.Keterangan, p.Nama, p.No_Telp, p.Email, p.Alamat, p.Id_Pelanggan " +
                    "FROM pesan_pelanggan pp " +
                    "JOIN pelanggan p ON pp.Id_Pelanggan = p.Id_Pelanggan " +
                    "WHERE pp.Tanggal_Masuk = ? " +
                    "AND pp.Tanggal_Keluar = ? " +       
                    "AND pp.Id_Pesanan = ? ";
            }

            Connection conn = (Connection) Database.konfig();
            System.out.println("Query: " + sql);
            PreparedStatement pstmt = conn.prepareStatement(sql);

            if ((tanggal_keluar == null || tanggal_keluar.trim().isEmpty()) && tipeKuitansi.equals("Semua yang terkait")) {
                pstmt.setString(1, tanggal_masuk);
                pstmt.setInt(2, id);
            } else if ((tanggal_keluar != null && !tanggal_keluar.trim().isEmpty()) && tipeKuitansi.equals("Semua yang terkait")) {
                pstmt.setString(1, tanggal_masuk);
                pstmt.setString(2, tanggal_keluar);
                pstmt.setInt(3, id);
            } else if ((tanggal_keluar == null || tanggal_keluar.trim().isEmpty()) && tipeKuitansi.equals("Hanya yang terpilih")) {
                pstmt.setString(1, tanggal_masuk);
                pstmt.setInt(2, id);
            } else if ((tanggal_keluar != null && !tanggal_keluar.trim().isEmpty()) && tipeKuitansi.equals("Hanya yang terpilih")) {
                pstmt.setString(1, tanggal_masuk);
                pstmt.setString(2, tanggal_keluar);
                pstmt.setInt(3, id);
            }

            ResultSet rs = pstmt.executeQuery();


            int counter = 0;

            while (rs.next()) {
                if (counter < 1) {
                    customerInfoTable.addCell(new Cell().add(new Paragraph("Nama Pelanggan")).setBorder(Border.NO_BORDER));
                    JOptionPane.showMessageDialog(null, rs.getString("Nama"));
                    customerInfoTable.addCell(new Cell().add(new Paragraph(": " + rs.getString("Nama"))).setBorder(Border.NO_BORDER));
                    customerInfoTable.addCell(new Cell().add(new Paragraph("No. Telepon")).setBorder(Border.NO_BORDER));
                    customerInfoTable.addCell(new Cell().add(new Paragraph(": " + rs.getString("No_Telp"))).setBorder(Border.NO_BORDER));
                    customerInfoTable.addCell(new Cell().add(new Paragraph("Tanggal Masuk")).setBorder(Border.NO_BORDER));
                    customerInfoTable.addCell(new Cell().add(new Paragraph(": " + rs.getString("Tanggal_Masuk"))).setBorder(Border.NO_BORDER));
                    if (tanggal_keluar != null && !tanggal_keluar.trim().isEmpty()) {
                        customerInfoTable.addCell(new Cell().add(new Paragraph("Tanggal Keluar")).setBorder(Border.NO_BORDER));
                        customerInfoTable.addCell(new Cell().add(new Paragraph(": " + rs.getString("Tanggal_Keluar"))).setBorder(Border.NO_BORDER)); 
                    }
                }

                itemInfoTable.addCell(new Cell().add(new Paragraph("Permintaan Jahitan")).setBackgroundColor(new DeviceRgb(205, 179, 149)).setFontColor(ColorConstants.WHITE));
                itemInfoTable.addCell(new Cell().add(new Paragraph("Pengerjaan")).setBackgroundColor(new DeviceRgb(205, 179, 149)).setFontColor(ColorConstants.WHITE));
                itemInfoTable.addCell(new Cell().add(new Paragraph("Harga")).setBackgroundColor(new DeviceRgb(205, 179, 149)).setFontColor(ColorConstants.WHITE));
                itemInfoTable.addCell(new Cell().add(new Paragraph("Keterangan")).setBackgroundColor(new DeviceRgb(205, 179, 149)).setFontColor(ColorConstants.WHITE));

                itemInfoTable.addCell(new Cell().add(new Paragraph(rs.getString("Permintaan_Jahitan"))));
                itemInfoTable.addCell(new Cell().add(new Paragraph(rs.getString("Pengerjaan"))));
                itemInfoTable.addCell(new Cell().add(new Paragraph(String.valueOf(rs.getInt("Harga")))));
                itemInfoTable.addCell(new Cell().add(new Paragraph(rs.getString("Keterangan"))));

                total = total + rs.getInt("Harga");

                counter++;
            }

            rs.close();
            pstmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        itemInfoTable.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        itemInfoTable.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
        itemInfoTable.addCell(new Cell().add(new Paragraph("Total Harga")).setTextAlignment(TextAlignment.RIGHT).setBackgroundColor(new DeviceRgb(205, 179, 149)).setFontColor(ColorConstants.WHITE).setBorder(Border.NO_BORDER));
        itemInfoTable.addCell(new Cell().add(new Paragraph(String.valueOf(total))).setTextAlignment(TextAlignment.RIGHT).setBackgroundColor(new DeviceRgb(205, 179, 149)).setBorder(Border.NO_BORDER).setFontColor(ColorConstants.WHITE));       

        document.add(table);
        document.add(new Paragraph("\n"));
        document.add(customerInfoTable);
        document.add(new Paragraph("\n"));
        document.add(itemInfoTable);
        document.add(new Paragraph("\n(TTD)").setTextAlignment(TextAlignment.RIGHT));
        document.close();
        Desktop.getDesktop().open(new File(path));
    } 
}


