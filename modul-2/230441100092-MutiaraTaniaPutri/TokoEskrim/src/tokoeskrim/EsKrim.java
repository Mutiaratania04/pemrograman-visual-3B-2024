/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tokoeskrim;
import javax.swing.JOptionPane;

/**
 *
 * @author mutia
 */
public class EsKrim extends javax.swing.JFrame {
    
    /**
     * Creates new form EsKrim
     */
    public EsKrim() {
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

        buttonGroupRasa = new javax.swing.ButtonGroup();
        buttonGroupToping = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        pilihRasa1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pilihToping = new javax.swing.JLabel();
        misis = new javax.swing.JRadioButton();
        chocochip = new javax.swing.JRadioButton();
        selaiCoklat = new javax.swing.JRadioButton();
        noToping = new javax.swing.JRadioButton();
        kacang = new javax.swing.JRadioButton();
        coklat = new javax.swing.JRadioButton();
        stroberi = new javax.swing.JRadioButton();
        tiramisu = new javax.swing.JRadioButton();
        blubery = new javax.swing.JRadioButton();
        milktea = new javax.swing.JRadioButton();
        matcha = new javax.swing.JRadioButton();
        taro = new javax.swing.JRadioButton();
        banana = new javax.swing.JRadioButton();
        mint = new javax.swing.JRadioButton();
        slogan = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        order = new javax.swing.JLabel();
        Jumlah = new javax.swing.JLabel();
        berapa = new javax.swing.JTextField();
        kurang = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        totalnya = new javax.swing.JLabel();
        tombolTotal = new javax.swing.JButton();
        Total = new javax.swing.JTextField();
        bayarCash = new javax.swing.JLabel();
        kembali = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(219, 229, 255));

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\mutia\\Downloads\\eskrim_11zon(2).jpg")); // NOI18N

        pilihRasa1.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        pilihRasa1.setText("Choose Your Taste...!");

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        pilihToping.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        pilihToping.setText("Choose Your Topping...!");

        buttonGroupToping.add(misis);
        misis.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        misis.setText("Rainbow Sprinkle - Rp. 5000");

        buttonGroupToping.add(chocochip);
        chocochip.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        chocochip.setText("Choco Chip - Rp. 5000");

        buttonGroupToping.add(selaiCoklat);
        selaiCoklat.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        selaiCoklat.setText("Choco Jam - Rp. 5000");

        buttonGroupToping.add(noToping);
        noToping.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        noToping.setText("NoTopping - Rp. 0");

        buttonGroupToping.add(kacang);
        kacang.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        kacang.setText("Crumble Nuts - Rp. 5000");
        kacang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kacangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pilihToping)
                    .addComponent(misis)
                    .addComponent(chocochip)
                    .addComponent(selaiCoklat)
                    .addComponent(kacang)
                    .addComponent(noToping))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pilihToping)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chocochip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(misis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selaiCoklat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kacang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noToping)
                .addContainerGap())
        );

        buttonGroupRasa.add(coklat);
        coklat.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        coklat.setText("Chocolate - Rp. 25.000");
        coklat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coklatActionPerformed(evt);
            }
        });

        buttonGroupRasa.add(stroberi);
        stroberi.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        stroberi.setText("Strowbarry - Rp. 25.000");

        buttonGroupRasa.add(tiramisu);
        tiramisu.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        tiramisu.setText("Tiramisu - Rp. 27.000");

        buttonGroupRasa.add(blubery);
        blubery.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        blubery.setText("Bluberry - Rp. 25.000");

        buttonGroupRasa.add(milktea);
        milktea.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        milktea.setText("Milktea - Rp. 28.000");

        buttonGroupRasa.add(matcha);
        matcha.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        matcha.setText("Matcha - Rp. 30.000");

        buttonGroupRasa.add(taro);
        taro.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        taro.setText("Taro - Rp. 28.000");

        buttonGroupRasa.add(banana);
        banana.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        banana.setText("Choco Banana - Rp. 35.000");

        buttonGroupRasa.add(mint);
        mint.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        mint.setText("Choco Mint - Rp. 35.000");

        slogan.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        slogan.setText("Explore your taste's world");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(logo)
                                    .addComponent(tiramisu)
                                    .addComponent(blubery))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(banana)
                                    .addComponent(taro)
                                    .addComponent(coklat)
                                    .addComponent(stroberi)
                                    .addComponent(matcha)
                                    .addComponent(pilihRasa1)
                                    .addComponent(mint))
                                .addGap(0, 22, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(milktea)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(slogan)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(pilihRasa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(coklat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stroberi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(matcha, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiramisu, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blubery, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(banana, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(milktea, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mint, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slogan)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        order.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        order.setText("Pick Your Order Here");

        Jumlah.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        Jumlah.setText("Jumlah");

        berapa.setText(" ");
        berapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berapaActionPerformed(evt);
            }
        });

        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        totalnya.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        totalnya.setText("Total");

        tombolTotal.setText("Total");
        tombolTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTotalActionPerformed(evt);
            }
        });

        Total.setText(" ");
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });

        bayarCash.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        bayarCash.setText("Cash");

        kembali.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        kembali.setText("Kembali");

        cash.setText(" ");
        cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashActionPerformed(evt);
            }
        });

        kembalian.setText(" ");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tombolTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(order)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(kurang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalnya, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(berapa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tambah))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bayarCash)))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(cash, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(Jumlah))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(reset))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(kembalian)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kembali)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(order)
                .addGap(19, 19, 19)
                .addComponent(Jumlah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(berapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kurang)
                    .addComponent(tambah))
                .addGap(42, 42, 42)
                .addComponent(totalnya)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolTotal)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(bayarCash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kembali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(reset)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1094, 1094, 1094))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coklatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coklatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coklatActionPerformed

    private void tombolTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTotalActionPerformed
        // TODO add your handling code here:
        if (!coklat.isSelected() && !stroberi.isSelected() && !matcha.isSelected() && !tiramisu.isSelected() && !blubery.isSelected() && !milktea.isSelected() && !taro.isSelected()&& !banana.isSelected()&& !mint.isSelected()){
        JOptionPane.showMessageDialog(this, "anda belum memilih pesanan", "Peringatan", JOptionPane.WARNING_MESSAGE); 
        return;
        }
        
        int jumlah = Integer.parseInt(berapa.getText());
        int hargaRasa = 0;
        int hargaTopping = 0;
        
        if (coklat.isSelected()){
            hargaRasa = 25000;
        }else if (stroberi.isSelected()){
            hargaRasa = 25000;
        }else if (matcha.isSelected()){
            hargaRasa = 30000;
        }else if (tiramisu.isSelected()){
            hargaRasa = 27000;
        }else if (blubery.isSelected()){
            hargaRasa = 25000;
        }else if (milktea.isSelected()){
            hargaRasa = 28000;
        }else if (taro.isSelected()){
            hargaRasa = 28000;
        }else if (banana.isSelected()){
            hargaRasa = 35000;
        }else if (mint.isSelected()){
            hargaRasa = 35000;
        }
        
        if (chocochip.isSelected()){
            hargaTopping += 5000;
        }
        if (misis.isSelected()){
            hargaTopping += 5000;
        }
        if (selaiCoklat.isSelected()){
            hargaTopping += 5000;
        }
        if (kacang.isSelected()){
            hargaTopping += 5000;
        }
        if (noToping.isSelected()){
            hargaTopping += 0;
        }
        
        
        int totalHarga = (hargaRasa + hargaTopping) * jumlah;
        
        if (totalHarga > 100000){
            double diskon = 0.05;
            totalHarga -= totalHarga * diskon;
            JOptionPane.showMessageDialog(this, "Selamat anda mendapatkan diskon 5%", "Information", JOptionPane.INFORMATION_MESSAGE); 
        }
        Total.setText(String.valueOf(totalHarga));
         
    }//GEN-LAST:event_tombolTotalActionPerformed

    private void cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        // TODO add your handling code here:
        int jumlah = Integer.parseInt(berapa.getText());
        if (jumlah > 1){
            berapa.setText(String.valueOf(jumlah - 1));
        }else{
           JOptionPane.showMessageDialog(null, "Jumlah minimal adalah 1", "Peringatan", JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_kurangActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        int jumlah = Integer.parseInt(berapa.getText());
        berapa.setText(String.valueOf(jumlah + 1));
           
    }//GEN-LAST:event_tambahActionPerformed

    private void berapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berapaActionPerformed
        // TODO add your handling code here:     
    }//GEN-LAST:event_berapaActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        buttonGroupRasa.clearSelection();
        buttonGroupToping.clearSelection();
        berapa.setText("0");
        Total.setText(null);
        cash.setText(null);
        kembalian.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void kacangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kacangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kacangActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        Total.setText("");
        Total.setEditable(false);        
        kembalian.setText("");
        kembalian.setEditable(false);
        berapa.setText("0");
        berapa.setEditable(false);        
        cash.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            hitungKembalian();
        }
    });
    }//GEN-LAST:event_formComponentShown

        private void hitungKembalian() {
    try {
        // Ambil nilai total harga dan cash dari TextField
        int total = Integer.parseInt(Total.getText());
        int Cash = Integer.parseInt(cash.getText());

        if (Cash >= total) {
            int recieve = Cash - total;
            kembalian.setText(String.valueOf(recieve));  
        } else {
            kembalian.setText("Uang tidak mencukupi");
        }
    } catch (NumberFormatException e) {
        kembalian.setText("");
    }
}
                
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EsKrim().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jumlah;
    private javax.swing.JTextField Total;
    private javax.swing.JRadioButton banana;
    private javax.swing.JLabel bayarCash;
    private javax.swing.JTextField berapa;
    private javax.swing.JRadioButton blubery;
    private javax.swing.ButtonGroup buttonGroupRasa;
    private javax.swing.ButtonGroup buttonGroupToping;
    private javax.swing.JTextField cash;
    private javax.swing.JRadioButton chocochip;
    private javax.swing.JRadioButton coklat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton kacang;
    private javax.swing.JLabel kembali;
    private javax.swing.JTextField kembalian;
    private javax.swing.JButton kurang;
    private javax.swing.JLabel logo;
    private javax.swing.JRadioButton matcha;
    private javax.swing.JRadioButton milktea;
    private javax.swing.JRadioButton mint;
    private javax.swing.JRadioButton misis;
    private javax.swing.JRadioButton noToping;
    private javax.swing.JLabel order;
    private javax.swing.JLabel pilihRasa1;
    private javax.swing.JLabel pilihToping;
    private javax.swing.JButton reset;
    private javax.swing.JRadioButton selaiCoklat;
    private javax.swing.JLabel slogan;
    private javax.swing.JRadioButton stroberi;
    private javax.swing.JButton tambah;
    private javax.swing.JRadioButton taro;
    private javax.swing.JRadioButton tiramisu;
    private javax.swing.JButton tombolTotal;
    private javax.swing.JLabel totalnya;
    // End of variables declaration//GEN-END:variables

}
