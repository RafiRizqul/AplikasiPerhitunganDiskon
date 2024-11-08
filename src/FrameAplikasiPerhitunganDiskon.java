
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ACER
 */
public class FrameAplikasiPerhitunganDiskon extends javax.swing.JFrame {

    void hitungDiskon() {
        try {
            // Ambil nilai harga asli dari JTextField
            double hargaAsli = Double.parseDouble(jTextField1.getText());
            // Ambil persentase diskon dari JComboBox atau JSlider
            int persentaseDiskon = jSlider1.getValue();

            double diskonKupon = 0; // Diskon tambahan dari kupon, default 0%
            // Cek kode kupon
            String kodeKupon = jTextField2.getText().trim();
            if (kodeKupon.equalsIgnoreCase("BELIMURAH")) {
                diskonKupon = hargaAsli * 20 / 100;
            } else {
                diskonKupon = 0; // Tidak ada diskon tambahan jika kupon tidak valid
            }
            
            // Hitung jumlah diskon dan harga akhir
            double jumlahDiskonPersentase = hargaAsli * persentaseDiskon / 100;
            double totalDiskon = jumlahDiskonPersentase + diskonKupon;
            double hargaAkhir = hargaAsli - totalDiskon;
            
            
            
           
            // Tampilkan hasil pada JTextField atau JLabel
            jLabel4.setText(String.valueOf(hargaAkhir));
            jLabel5.setText(String.valueOf(totalDiskon));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Creates new form FrameAplikasiPerhitunganDiskon
     */
    public FrameAplikasiPerhitunganDiskon() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Nominal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 8, 4, 8);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Pilih Diskon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 8, 4, 8);
        jPanel1.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 8, 4, 8);
        jPanel1.add(jTextField1, gridBagConstraints);

        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 8, 4, 8);
        jPanel1.add(jSlider1, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", " " }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 8, 4, 8);
        jPanel1.add(jComboBox1, gridBagConstraints);

        jLabel3.setText("Persentase Diskon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 8, 4, 8);
        jPanel1.add(jLabel3, gridBagConstraints);

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 8, 4, 8);
        jPanel1.add(jButton1, gridBagConstraints);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(166, 120));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Riwayat\n");
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 8, 4, 8);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel4.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Hasil Akhir Label");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Penghematan Label");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        jPanel1.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 8, 4, 8);
        jPanel1.add(jTextField2, gridBagConstraints);

        jLabel8.setText("Kupon Diskon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 8, 4, 8);
        jPanel1.add(jLabel8, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
            // Ambil nilai harga asli dari JTextField
            double hargaAsli = Double.parseDouble(jTextField1.getText());

            // Ambil persentase diskon dari JComboBox atau JSlider
            int persentaseDiskon = jSlider1.getValue();

            // Hitung jumlah diskon dan harga akhir
            double diskonKupon = 0; // Diskon tambahan dari kupon, default 0%
            // Cek kode kupon
            String kodeKupon = jTextField2.getText().trim();
            if (kodeKupon.equalsIgnoreCase("BELIMURAH")) {
                diskonKupon = hargaAsli * 20 / 100;
            } else {
                diskonKupon = 0; // Tidak ada diskon tambahan jika kupon tidak valid
            }
            
            // Hitung jumlah diskon dan harga akhir
            double jumlahDiskonPersentase = hargaAsli * persentaseDiskon / 100;
            double totalDiskon = jumlahDiskonPersentase + diskonKupon;
            double hargaAkhir = hargaAsli - totalDiskon;
            
           
            // Tampilkan hasil pada JTextField atau JLabel
            jLabel4.setText(String.valueOf(hargaAkhir));
            jLabel5.setText(String.valueOf(totalDiskon));
                         // Tambahkan hasil perhitungan ke JTextArea sebagai riwayat
            String hasil = "Harga Asli: " + hargaAsli + ", Diskon: " + persentaseDiskon + "%, "
                         + "Penghematan: " + totalDiskon + ", Harga Akhir: " + hargaAkhir + "\n";
              // Tambahkan informasi apakah kupon valid atau tidak
            if (diskonKupon > 0) {
                jTextArea1.append("Kupon berhasil digunakan! Diskon tambahan: " + diskonKupon + "\n");
            } else if (!kodeKupon.isEmpty()) {
                jTextArea1.append("Kode kupon tidak valid.\n");
            }
            jTextArea1.append(hasil); // Tambah hasil ke JTextArea
            
            

       } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        int nilaiDiskon = jSlider1.getValue(); // Mendapatkan nilai dari JSlider
        jComboBox1.setEditable(true);
        jComboBox1.setSelectedItem(nilaiDiskon); // Mengatur nilai JComboBox sesuai nilai JSlider
        jComboBox1.setEditable(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jSlider1StateChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
           int persentaseDiskon = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            jSlider1.setValue(persentaseDiskon); // Mengatur nilai JSlider sesuai nilai JComboBox
        }
        if (jTextField1.getText().isEmpty() == false) {

            hitungDiskon();
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

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
            java.util.logging.Logger.getLogger(FrameAplikasiPerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAplikasiPerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAplikasiPerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAplikasiPerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAplikasiPerhitunganDiskon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}