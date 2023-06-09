/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemilihansupplierahp.view;

import pemilihansupplierahp.controller.ControllerStartAnalisis;

/**
 *
 * @author TAKEN ZERO
 */
public class ViewMain extends javax.swing.JFrame {

    /**
     * Creates new form ViewMain
     */
    public ViewMain() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mnuLogout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuClose = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuDataKaryawan = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuKriteria = new javax.swing.JMenuItem();
        mnuSubKriteria = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        mnuBobotKriteria = new javax.swing.JMenuItem();
        mnuBobotSubKriteria = new javax.swing.JMenuItem();
        mnuBobotKaryawan = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuStartAnalisis = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuHasilBobot = new javax.swing.JMenuItem();
        mnuHasil = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:: Sistem AHP Pemilihan Supplier  ::.");

        jPanel1.setBackground(java.awt.Color.gray);
        jPanel1.setForeground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEM PENGAMBILAN KEPUTUSAN PEMILIHAN SUPPLIER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu3.setText("Exit");

        mnuLogout.setText("Logout");
        mnuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogoutActionPerformed(evt);
            }
        });
        jMenu3.add(mnuLogout);
        jMenu3.add(jSeparator1);

        mnuClose.setText("Close App");
        mnuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCloseActionPerformed(evt);
            }
        });
        jMenu3.add(mnuClose);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Master Data");

        mnuDataKaryawan.setText("Data Supplier");
        mnuDataKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDataKaryawanActionPerformed(evt);
            }
        });
        jMenu4.add(mnuDataKaryawan);
        jMenu4.add(jSeparator2);

        mnuKriteria.setText("Kritera");
        mnuKriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKriteriaActionPerformed(evt);
            }
        });
        jMenu4.add(mnuKriteria);

        mnuSubKriteria.setText("Sub Kriteria");
        mnuSubKriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSubKriteriaActionPerformed(evt);
            }
        });
        jMenu4.add(mnuSubKriteria);
        jMenu4.add(jSeparator3);

        jMenu5.setText("Bobot");

        mnuBobotKriteria.setText("Bobot Kriteria");
        mnuBobotKriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBobotKriteriaActionPerformed(evt);
            }
        });
        jMenu5.add(mnuBobotKriteria);

        mnuBobotSubKriteria.setText("Bobot Sub Kriteria");
        mnuBobotSubKriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBobotSubKriteriaActionPerformed(evt);
            }
        });
        jMenu5.add(mnuBobotSubKriteria);

        mnuBobotKaryawan.setText("Bobot Karyawan");
        mnuBobotKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBobotKaryawanActionPerformed(evt);
            }
        });
        jMenu5.add(mnuBobotKaryawan);

        jMenu4.add(jMenu5);

        jMenuBar2.add(jMenu4);

        jMenu1.setText("Analisis");

        mnuStartAnalisis.setText("Mulai Proses Perhitungan");
        mnuStartAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuStartAnalisisActionPerformed(evt);
            }
        });
        jMenu1.add(mnuStartAnalisis);
        jMenu1.add(jSeparator4);

        mnuHasilBobot.setText("Hasil Perhitungan Bobot");
        mnuHasilBobot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHasilBobotActionPerformed(evt);
            }
        });
        jMenu1.add(mnuHasilBobot);

        mnuHasil.setText("Hasil Perhitungan Pemilihan Supplier");
        mnuHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHasilActionPerformed(evt);
            }
        });
        jMenu1.add(mnuHasil);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 512, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuDataKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDataKaryawanActionPerformed
        // TODO add your handling code here:
        new ViewKaryawan().setVisible(true);
    }//GEN-LAST:event_mnuDataKaryawanActionPerformed

    private void mnuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ViewLogin().setVisible(true);
    }//GEN-LAST:event_mnuLogoutActionPerformed

    private void mnuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuCloseActionPerformed

    private void mnuKriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKriteriaActionPerformed
        // TODO add your handling code here:
        new ViewKriteria().setVisible(true);
    }//GEN-LAST:event_mnuKriteriaActionPerformed

    private void mnuSubKriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSubKriteriaActionPerformed
        // TODO add your handling code here:
        new ViewSubKriteria().setVisible(true);
    }//GEN-LAST:event_mnuSubKriteriaActionPerformed

    private void mnuBobotKriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBobotKriteriaActionPerformed
        // TODO add your handling code here:
        new ViewBobotKriteria().setVisible(true);
    }//GEN-LAST:event_mnuBobotKriteriaActionPerformed

    private void mnuBobotSubKriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBobotSubKriteriaActionPerformed
        // TODO add your handling code here:
        new ViewBobotSubKriteria().setVisible(true);
    }//GEN-LAST:event_mnuBobotSubKriteriaActionPerformed

    private void mnuBobotKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBobotKaryawanActionPerformed
        // TODO add your handling code here:
        new ViewSelectKaryawan().setVisible(true);
    }//GEN-LAST:event_mnuBobotKaryawanActionPerformed

    private void mnuStartAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuStartAnalisisActionPerformed
        // TODO add your handling code here:
        ControllerStartAnalisis controllerStartAnalisis = new ControllerStartAnalisis(this);
    }//GEN-LAST:event_mnuStartAnalisisActionPerformed

    private void mnuHasilBobotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHasilBobotActionPerformed
        // TODO add your handling code here:
        new ViewNilaiBobot().setVisible(true);
    }//GEN-LAST:event_mnuHasilBobotActionPerformed

    private void mnuHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHasilActionPerformed
        // TODO add your handling code here:
        new ViewHasil().setVisible(true);
    }//GEN-LAST:event_mnuHasilActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuItem mnuBobotKaryawan;
    private javax.swing.JMenuItem mnuBobotKriteria;
    private javax.swing.JMenuItem mnuBobotSubKriteria;
    private javax.swing.JMenuItem mnuClose;
    private javax.swing.JMenuItem mnuDataKaryawan;
    private javax.swing.JMenuItem mnuHasil;
    private javax.swing.JMenuItem mnuHasilBobot;
    private javax.swing.JMenuItem mnuKriteria;
    private javax.swing.JMenuItem mnuLogout;
    private javax.swing.JMenuItem mnuStartAnalisis;
    private javax.swing.JMenuItem mnuSubKriteria;
    // End of variables declaration//GEN-END:variables
}
