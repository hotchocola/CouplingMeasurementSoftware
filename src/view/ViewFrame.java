/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Maudy
 */
public class ViewFrame extends javax.swing.JFrame {

    private Controller cobaController;
    private String mode;
    private ArrayList<String> pathKelas;
    private ArrayList<String> namaKelas;
    private String listKelas;
    private boolean success;

    /**
     * Creates new form CobaViewFrame
     */
    public ViewFrame() {
        initComponents();
        this.setTitle("Coupling Measurement Software");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.cobaController = new Controller();
        this.mode = "";
        this.success = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonFile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelNOC = new javax.swing.JLabel();
        labelCBO = new javax.swing.JLabel();
        labelRFC = new javax.swing.JLabel();
        labelLCOM = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textListKelas = new javax.swing.JTextArea();
        radioButtonPackage = new javax.swing.JRadioButton();
        radioButtonFile = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelDIT = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Silakan pilih kode program yang ingin diukur nilai couplingnya:");

        buttonFile.setText("Pilih");
        buttonFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFileActionPerformed(evt);
            }
        });

        jLabel2.setText("NOC:");

        jLabel3.setText("CBO:");

        jLabel4.setText("RFC:");

        jLabel5.setText("LCOM:");

        textListKelas.setColumns(20);
        textListKelas.setLineWrap(true);
        textListKelas.setRows(5);
        jScrollPane1.setViewportView(textListKelas);

        buttonGroup1.add(radioButtonPackage);
        radioButtonPackage.setText("ukur package");
        radioButtonPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonPackageActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButtonFile);
        radioButtonFile.setText("ukur file");
        radioButtonFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonFileActionPerformed(evt);
            }
        });

        jLabel6.setText("Pilih mode pengukuran:");

        jLabel7.setText("DIT:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 110, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labelCBO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelNOC, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labelLCOM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(92, 92, 92)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(radioButtonFile)
                                        .addGap(63, 63, 63)
                                        .addComponent(radioButtonPackage)))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(141, 141, 141))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonFile)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonFile)
                    .addComponent(radioButtonPackage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(labelLCOM, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(labelNOC, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(labelCBO, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(labelDIT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFileActionPerformed
        this.pathKelas = new ArrayList<>();
        this.namaKelas = new ArrayList<>();
        this.listKelas = "";
        this.success = true;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Java files", "java");
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setFileFilter(filter);
        fileChooser.setMultiSelectionEnabled(true);

        int status = fileChooser.showOpenDialog(this);
        if (mode.equals("file")) {
            File[] files = fileChooser.getSelectedFiles();
            if (status == JFileChooser.APPROVE_OPTION) {
                for (int i = 0; i < files.length; i++) {
                    String filename = files[i].getName();
                    if (filename.endsWith(".java")) {
                        listKelas += files[i].getName() + ", ";
                        namaKelas.add(files[i].getName().substring(0, files[i].getName().length() - 5));
                        pathKelas.add(files[i].getAbsolutePath());
                    }
                }
            }
        } else {
            File[] files = fileChooser.getSelectedFiles();
            if (status == JFileChooser.APPROVE_OPTION) {
                for (int i = 0; i < files.length; i++) {
                    System.out.println(files[i].getName());
                    try {
                        this.listFilesAndFilesSubDirectories(files[i].getAbsolutePath());
                    } catch (IOException ex) {
                        Logger.getLogger(ViewFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        if (listKelas.length() > 0 && mode.equals("file")) {
            listKelas = listKelas.substring(0, listKelas.length() - 2);
            textListKelas.setText(listKelas);
        } else if (listKelas.length() < 1 && mode.equals("file")) {
            JOptionPane.showMessageDialog(this,
                    "Pilihlah file!",
                    "Terjadi kesalahan!",
                    JOptionPane.WARNING_MESSAGE);
            success = false;
        }
        try {
//                for (int i = 0; i < namaKelas.size(); i++) {
//                    System.out.println(namaKelas.get(i));
//                }
            if (success) {
                this.cobaController.getKelas(pathKelas, namaKelas);
                this.labelNOC.setText(this.cobaController.getNilaiNOC() + "");
                this.labelCBO.setText(this.cobaController.getNilaiCBO() + "");
                this.labelRFC.setText(this.cobaController.getNilaiRFC() + "");
                this.labelLCOM.setText(this.cobaController.getNilaiLCOM() + "");
                this.labelDIT.setText(this.cobaController.getNilaiDIT()+"");
                success = true;

                JOptionPane.showMessageDialog(this,
                        "Sukses!",
                        "Nilai metric berhasil diukur!",
                        JOptionPane.PLAIN_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(ViewFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonFileActionPerformed

    private void radioButtonPackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonPackageActionPerformed
        if (radioButtonFile.isSelected()) {
            buttonFile.setText("Pilih file");
            mode = "file";
        } else if (radioButtonPackage.isSelected()) {
            buttonFile.setText("Pilih package");
            mode = "package";
        }
    }//GEN-LAST:event_radioButtonPackageActionPerformed

    private void radioButtonFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonFileActionPerformed
        if (radioButtonFile.isSelected()) {
            buttonFile.setText("Pilih file");
            mode = "file";
        } else if (radioButtonPackage.isSelected()) {
            buttonFile.setText("Pilih package");
            mode = "package";
        }
    }//GEN-LAST:event_radioButtonFileActionPerformed

    public void listFilesAndFilesSubDirectories(String directoryName) throws IOException {
        File directory = new File(directoryName);
        //get all the files from a directory
        if (directory.isDirectory() && mode.equals("package")) {
            File[] fList = directory.listFiles();
            for (File file : fList) {
                if (file.isFile() && file.getName().endsWith(".java")) {
                    listKelas += file.getName() + ", ";
//                System.out.println("F. list kelas: " + file.getName() + ", ");
                    namaKelas.add(file.getName().substring(0, file.getName().length() - 5));
//                System.out.println("F. nama kelas: " + file.getName().substring(0, file.getName().length() - 5));
                    pathKelas.add(file.getAbsolutePath());
//                System.out.println("F. path kelas: " + file.getAbsolutePath());
                } else if (file.isDirectory()) {
                    listFilesAndFilesSubDirectories(file.getCanonicalPath());
                }
            }
        } else if (!directory.isDirectory() && mode.equals("package")) {
            JOptionPane.showMessageDialog(this,
                    "Pilihlah package!",
                    "Terjadi kesalahan!",
                    JOptionPane.WARNING_MESSAGE);
            success = false;
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new ViewFrame();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCBO;
    private javax.swing.JLabel labelDIT;
    private javax.swing.JLabel labelLCOM;
    private javax.swing.JLabel labelNOC;
    private javax.swing.JLabel labelRFC;
    private javax.swing.JRadioButton radioButtonFile;
    private javax.swing.JRadioButton radioButtonPackage;
    private javax.swing.JTextArea textListKelas;
    // End of variables declaration//GEN-END:variables
}
