package twitterapi;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TwitterPoster extends javax.swing.JFrame {

    static File[] files;

    private static String getResource(String imagessavegif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TwitterPoster() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dosyaeklebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        startbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mesajicerik = new javax.swing.JTextArea();
        saniye = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        silMod = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setTitle("Twitter Poster");
        setIconImage(new ImageIcon(getClass()
            .getResource("/twitterapi/resimler" + "/tw.png")).getImage());
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowOpened(java.awt.event.WindowEvent evt) {
            formWindowOpened(evt);
        }
    });

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jLabel1.setText("Kaç  Saniye  Bir Çalışacak :");
    jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    dosyaeklebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/twitterapi/resimler/image-add-icon.png"))); // NOI18N
    dosyaeklebtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    dosyaeklebtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            dosyaeklebtnActionPerformed(evt);
        }
    });

    table.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Resim", "Staus"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            true, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane1.setViewportView(table);
    if (table.getColumnModel().getColumnCount() > 0) {
        table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(1).setMaxWidth(80);
    }

    startbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/twitterapi/resimler/Cloud-Upload-On-icon.png"))); // NOI18N
    startbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    startbtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            startbtnActionPerformed(evt);
        }
    });

    mesajicerik.setColumns(20);
    mesajicerik.setRows(5);
    mesajicerik.setText("RT Lütfen.");
    mesajicerik.setBorder(javax.swing.BorderFactory.createTitledBorder("Mesaj Yazabilirsiniz"));
    jScrollPane2.setViewportView(mesajicerik);

    saniye.setText("5000");
    saniye.setToolTipText("Varsayılan 5 Saniye");
    saniye.setBorder(javax.swing.BorderFactory.createTitledBorder("Milisaniye"));
    saniye.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            saniyeActionPerformed(evt);
        }
    });

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jLabel2.setText("Post Atılacak Resimleri Seçin : ");
    jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jLabel3.setText("Gönderdikten Sonra Sil");
    jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    silMod.setText("Aktif");
    silMod.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jMenu1.setText("Ayarlar");

    jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
    jMenuItem2.setText("Twitter Key Ayarları");
    jMenu1.add(jMenuItem2);

    jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
    jMenuItem1.setText("Log Tut");
    jMenu1.add(jMenuItem1);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Hakkında");

    jMenuItem3.setText("ByTRiSLaSiS");
    jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem3ActionPerformed(evt);
        }
    });
    jMenu2.add(jMenuItem3);

    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(saniye))
        .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dosyaeklebtn)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(startbtn))
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, Short.MAX_VALUE))
        .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(silMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(2, 2, 2))
    );

    layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dosyaeklebtn, startbtn});

    layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel3});

    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dosyaeklebtn)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(startbtn))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(saniye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(silMod))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dosyaeklebtn, jLabel1, jLabel3, saniye, silMod, startbtn});

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbtnActionPerformed

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Integer saniyeset = Integer.valueOf(saniye.getText());
                String ms = mesajicerik.getText();
                try {
                    TwitterApi api = new TwitterApi(TwitterPoster.files, saniyeset, ms);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TwitterPoster.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        if (String.valueOf(TwitterPoster.files).equals("null")) {
            JOptionPane.showMessageDialog(null, "Resim Seçin", "HATA", 0);
        } else {
            t.start();
        }

    }//GEN-LAST:event_startbtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void saniyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saniyeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saniyeActionPerformed

    private void dosyaeklebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosyaeklebtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        chooser.setCurrentDirectory(new java.io.File(System.getProperty("user.home") + "/Desktop"));
        Component frame = null;
        chooser.showOpenDialog(frame);
        files = chooser.getSelectedFiles();
        for (File file : files) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[]{file});
        }
    }//GEN-LAST:event_dosyaeklebtnActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/groups/turkcoders/"));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(null, "Sorunlardan Dolayı Açılamadı", "HATA", 0);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TwitterPoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                TwitterPoster T = new TwitterPoster();

                T.addWindowListener(new WindowListener() {
                    @Override
                    public void windowOpened(WindowEvent we) {

                    }

                    @Override
                    public void windowClosing(WindowEvent we) {
                        try {
                            Trayter trayter = new Trayter(T);
                        } catch (IOException ex) {
                            Logger.getLogger(TwitterPoster.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    @Override
                    public void windowClosed(WindowEvent we) {
                    }

                    @Override
                    public void windowIconified(WindowEvent we) {
                    }

                    @Override
                    public void windowDeiconified(WindowEvent we) {
                    }

                    @Override
                    public void windowActivated(WindowEvent we) {
                    }

                    @Override
                    public void windowDeactivated(WindowEvent we) {
                    }
                });
                T.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dosyaeklebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea mesajicerik;
    private javax.swing.JTextField saniye;
    public static javax.swing.JToggleButton silMod;
    private javax.swing.JButton startbtn;
    public static javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
