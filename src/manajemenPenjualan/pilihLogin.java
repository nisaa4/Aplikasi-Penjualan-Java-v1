/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manajemenPenjualan;

/**
 *
 * @author Nia
 */
public class pilihLogin extends javax.swing.JFrame {
    
    private String divisi; // Menyimpan informasi divisi pengguna

    // Metode setter untuk divisi
    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    // Metode getter untuk divisi
    public String getDivisi() {
        return divisi;
    }

    /**
     * Creates new form pilihLogin
     */
    public pilihLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnKasir = new javax.swing.JButton();
        btnDataBarang = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Pilih Login Untuk");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 360, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/kasir.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 170, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/kardus.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 190, 159));

        btnKasir.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnKasir.setForeground(new java.awt.Color(102, 0, 102));
        btnKasir.setText("Kasir");
        btnKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKasirActionPerformed(evt);
            }
        });
        getContentPane().add(btnKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 178, 80));

        btnDataBarang.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnDataBarang.setForeground(new java.awt.Color(102, 0, 102));
        btnDataBarang.setText("Data Barang");
        btnDataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataBarangActionPerformed(evt);
            }
        });
        getContentPane().add(btnDataBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 180, 80));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bgpilihlogin.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 592, 439));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataBarangActionPerformed
        // TODO add your handling code here:

        // Membuat instance dari kelas login.java
        // Simpan pilihan login sebagai "gudang"
        divisi = "gudang";
        login lg = new login();
        // Menampilkan frame login
        lg.setDivisi("gudang"); // Menetapkan divisi sebagai "gudang"
        lg.setVisible(true);

    }//GEN-LAST:event_btnDataBarangActionPerformed

    private void btnKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKasirActionPerformed
        // TODO add your handling code here:

        // Membuat instance dari kelas login.java
        // Simpan pilihan login sebagai "kasir"
        divisi = "kasir";
        login lg = new login();
        // Menampilkan frame login
        lg.setDivisi("kasir"); // Menetapkan divisi sebagai "kasir"
        lg.setVisible(true);

    }//GEN-LAST:event_btnKasirActionPerformed

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
            java.util.logging.Logger.getLogger(pilihLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pilihLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pilihLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pilihLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pilihLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnDataBarang;
    private javax.swing.JButton btnKasir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
    
}
