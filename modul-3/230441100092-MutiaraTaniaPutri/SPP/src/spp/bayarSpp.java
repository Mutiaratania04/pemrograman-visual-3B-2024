/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spp;
import javax.swing.*;

/**
 *
 * @author mutia
 */
public class bayarSpp extends javax.swing.JFrame {

    /**
     * Creates new form bayarSpp
     */
    public bayarSpp() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        nama = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        januari = new javax.swing.JCheckBox();
        juli = new javax.swing.JCheckBox();
        februari = new javax.swing.JCheckBox();
        agustus = new javax.swing.JCheckBox();
        maret = new javax.swing.JCheckBox();
        september = new javax.swing.JCheckBox();
        april = new javax.swing.JCheckBox();
        oktober = new javax.swing.JCheckBox();
        mei = new javax.swing.JCheckBox();
        november = new javax.swing.JCheckBox();
        juni = new javax.swing.JCheckBox();
        desember = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        tombolTotal = new javax.swing.JButton();
        bayar = new javax.swing.JTextField();
        tombolBayar = new javax.swing.JButton();
        kembalian = new javax.swing.JTextField();
        tombolKeluar = new javax.swing.JButton();
        status = new javax.swing.JTextField();
        tombolReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("======================================================================================");

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel1.setText("PEMBAYARAN SPP");

        jLabel3.setText("======================================================================================");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("NAMA :");

        jLabel5.setText("BULAN :");

        jLabel7.setText("STATUS :");

        jLabel8.setText("TOTAL :");

        jLabel9.setText("BAYAR :");

        jLabel10.setText("KEMBALIAN :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(87, 87, 87))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama.setText("  ");
        jPanel5.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 240, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tabel.setBackground(new java.awt.Color(153, 153, 255));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Pembayaran", "Status"
            }
        ));
        jScrollPane2.setViewportView(tabel);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 330, 340));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setLayout(new java.awt.GridLayout(6, 2));

        januari.setText("Januari");
        jPanel8.add(januari);

        juli.setText("Juli");
        jPanel8.add(juli);

        februari.setText("Februari");
        jPanel8.add(februari);

        agustus.setText("Agustus");
        agustus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agustusActionPerformed(evt);
            }
        });
        jPanel8.add(agustus);

        maret.setText("Maret");
        jPanel8.add(maret);

        september.setText("September");
        jPanel8.add(september);

        april.setText("April");
        jPanel8.add(april);

        oktober.setText("Oktober");
        jPanel8.add(oktober);

        mei.setText("Mei");
        jPanel8.add(mei);

        november.setText("November");
        jPanel8.add(november);

        juni.setText("Juni");
        jPanel8.add(juni);

        desember.setText("Desember");
        jPanel8.add(desember);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 34, -1, 177));

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Pembayaran per bulan Rp.100.000");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 217, -1, -1));

        total.setText("  ");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel5.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 230, -1));

        tombolTotal.setText("TOTAL");
        tombolTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTotalActionPerformed(evt);
            }
        });
        jPanel5.add(tombolTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));
        jPanel5.add(bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 230, -1));

        tombolBayar.setText("BAYAR");
        tombolBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBayarActionPerformed(evt);
            }
        });
        jPanel5.add(tombolBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        kembalian.setText("  ");
        jPanel5.add(kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 230, -1));

        tombolKeluar.setText("EXIT");
        tombolKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKeluarActionPerformed(evt);
            }
        });
        jPanel5.add(tombolKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        status.setText("  ");
        jPanel5.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 230, -1));

        tombolReset.setText("RESET");
        tombolReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolResetActionPerformed(evt);
            }
        });
        jPanel5.add(tombolReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void tombolKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_tombolKeluarActionPerformed

    private void tombolTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTotalActionPerformed
        // TODO add your handling code here:
        String namaSiswa = nama.getText();
        int jmlSpp = 100000;

        java.util.List<String> bulanLunas = new java.util.ArrayList<>();
        if (januari.isSelected()) bulanLunas.add("Januari");
        if (februari.isSelected()) bulanLunas.add("Februari");
        if (maret.isSelected()) bulanLunas.add("Maret");
        if (april.isSelected()) bulanLunas.add("April");
        if (mei.isSelected()) bulanLunas.add("Mei");
        if (juni.isSelected()) bulanLunas.add("Juni");
        if (juli.isSelected()) bulanLunas.add("Juli");
        if (agustus.isSelected()) bulanLunas.add("Agustus");
        if (september.isSelected()) bulanLunas.add("September");
        if (oktober.isSelected()) bulanLunas.add("Oktober");
        if (november.isSelected()) bulanLunas.add("November");
        if (desember.isSelected()) bulanLunas.add("Desember");

        int bulanBelumLunas = 12 - bulanLunas.size();

        int totalBayar = jmlSpp * bulanLunas.size();

        String infoStatus;
        if (bulanLunas.size() == 12) {
            infoStatus = "Lunas";
        } else if (bulanLunas.isEmpty()) {
            infoStatus = "Belum Lunas";
        } else {
            infoStatus = "Belum Lunas";
        }

        status.setText(infoStatus);
        total.setText(String.format("%d", totalBayar));        
    }//GEN-LAST:event_tombolTotalActionPerformed

    private void agustusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agustusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agustusActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        total.setText("");
        total.setEditable(false);
        status.setText("");
        status.setEditable(false);
        kembalian.setText("");
        kembalian.setEditable(false);
    }//GEN-LAST:event_formComponentShown

    private void tombolBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBayarActionPerformed
        try {
        int Bayar = Integer.parseInt(bayar.getText());
        
        String totalText = total.getText().replaceAll("[^0-9]", "");
        int totalBayar = Integer.parseInt(totalText);
        
        if (Bayar >= totalBayar) {
            int Kembalian = Bayar - totalBayar;            
            kembalian.setText(String.valueOf(Kembalian));            
            JOptionPane.showMessageDialog(this, 
                "Kembalian Anda: Rp " + Kembalian + "\nPembayaran Berhasil", 
                "Informasi", JOptionPane.INFORMATION_MESSAGE);
            
            String Nama = nama.getText();            
            java.util.List<String> bulanLunas = new java.util.ArrayList<>();
            if (januari.isSelected()) bulanLunas.add("Januari");
            if (februari.isSelected()) bulanLunas.add("Februari");
            if (maret.isSelected()) bulanLunas.add("Maret");
            if (april.isSelected()) bulanLunas.add("April");
            if (mei.isSelected()) bulanLunas.add("Mei");
            if (juni.isSelected()) bulanLunas.add("Juni");
            if (juli.isSelected()) bulanLunas.add("Juli");
            if (agustus.isSelected()) bulanLunas.add("Agustus");
            if (september.isSelected()) bulanLunas.add("September");
            if (oktober.isSelected()) bulanLunas.add("Oktober");
            if (november.isSelected()) bulanLunas.add("November");
            if (desember.isSelected()) bulanLunas.add("Desember");
            
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tabel.getModel();
            model.setRowCount(0);  
            
            String[] Bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                               "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
            
            // Looping untuk setiap bulan
            for (int i = 0; i < Bulan.length; i++) {
                String statusBulan = bulanLunas.contains(Bulan[i]) ? "Lunas" : "Belum Bayar";                
                model.addRow(new Object[]{Nama, Bulan[i], statusBulan});
            }                  
            } else {
                JOptionPane.showMessageDialog(this, 
                    "Uang Anda tidak mencukupi.\nPembayaran Gagal!", 
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "Input tidak valid. Pastikan jumlah yang dibayar dan total pembayaran adalah angka.", 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tombolBayarActionPerformed

    private void tombolResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolResetActionPerformed
        // TODO add your handling code here:
        nama.setText("");
        status.setText("");
        total.setText("");
        bayar.setText("");
        kembalian.setText("");
        januari.setSelected(false);
        februari.setSelected(false);
        maret.setSelected(false);
        april.setSelected(false);
        mei.setSelected(false);
        juni.setSelected(false);
        juli.setSelected(false);
        agustus.setSelected(false);
        september.setSelected(false);
        oktober.setSelected(false);
        november.setSelected(false);
        desember.setSelected(false);
        
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tabel.getModel();
        model.setRowCount(0);

    }//GEN-LAST:event_tombolResetActionPerformed

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
            java.util.logging.Logger.getLogger(bayarSpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bayarSpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bayarSpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bayarSpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bayarSpp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agustus;
    private javax.swing.JCheckBox april;
    private javax.swing.JTextField bayar;
    private javax.swing.JCheckBox desember;
    private javax.swing.JCheckBox februari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox januari;
    private javax.swing.JCheckBox juli;
    private javax.swing.JCheckBox juni;
    private javax.swing.JTextField kembalian;
    private javax.swing.JCheckBox maret;
    private javax.swing.JCheckBox mei;
    private javax.swing.JTextField nama;
    private javax.swing.JCheckBox november;
    private javax.swing.JCheckBox oktober;
    private javax.swing.JCheckBox september;
    private javax.swing.JTextField status;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tombolBayar;
    private javax.swing.JButton tombolKeluar;
    private javax.swing.JButton tombolReset;
    private javax.swing.JButton tombolTotal;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
