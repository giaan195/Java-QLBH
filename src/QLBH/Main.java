package QLBH;

import QLBH.Panel.QLNV;
import QLBH.Panel.*;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Toolkit;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    private LoginDialog Login;
    private JPanel mainPanel;
    private int NVFlag = 0;

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/QLBH/img/cart-icon.png")));
        jlbDate.setText(myFunction.getCurrentDate());
        
        mainPanel = new AboutPanel();
        pnldata.setLayout(new GridLayout());
        pnldata.add(mainPanel);
        pnldata.validate();
        setSize(900, 550);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbUser = new javax.swing.JLabel();
        jlbUserName = new javax.swing.JLabel();
        jlbDate = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnNV = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnSP = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnHD = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btnLogout = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        pnldata = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlInfo.setMaximumSize(new java.awt.Dimension(170, 80));
        pnlInfo.setMinimumSize(new java.awt.Dimension(170, 80));
        pnlInfo.setPreferredSize(new java.awt.Dimension(170, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/icon-user.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel1.setVerifyInputWhenFocusTarget(false);

        jlbUser.setText("User:");

        jlbUserName.setForeground(new java.awt.Color(153, 51, 255));

        jlbDate.setForeground(new java.awt.Color(0, 102, 102));
        jlbDate.setText("datatime");

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbDate)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(jlbUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbUserName)))
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbUser)
                            .addComponent(jlbUserName))
                        .addGap(18, 18, 18)
                        .addComponent(jlbDate)))
                .addContainerGap())
        );

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/staff-48.png"))); // NOI18N
        btnNV.setText("Quản Lý Nhân Viên");
        btnNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNV.setMaximumSize(new java.awt.Dimension(130, 76));
        btnNV.setMinimumSize(new java.awt.Dimension(130, 76));
        btnNV.setPreferredSize(new java.awt.Dimension(130, 76));
        btnNV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNVActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNV);
        jToolBar1.add(jSeparator1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/Users-48.png"))); // NOI18N
        jButton1.setText("Quản Lý Khách Hàng");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(130, 76));
        jButton1.setMinimumSize(new java.awt.Dimension(130, 76));
        jButton1.setPreferredSize(new java.awt.Dimension(130, 76));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator2);

        btnSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/product-48.png"))); // NOI18N
        btnSP.setText("Quản Lý Sản Phẩm");
        btnSP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSP.setMaximumSize(new java.awt.Dimension(130, 76));
        btnSP.setMinimumSize(new java.awt.Dimension(130, 76));
        btnSP.setPreferredSize(new java.awt.Dimension(130, 76));
        btnSP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSPActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSP);
        jToolBar1.add(jSeparator3);

        btnHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/barcode-48.png"))); // NOI18N
        btnHD.setText("Quản Lý Hóa Đơn");
        btnHD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHD.setMaximumSize(new java.awt.Dimension(130, 76));
        btnHD.setMinimumSize(new java.awt.Dimension(130, 76));
        btnHD.setPreferredSize(new java.awt.Dimension(130, 76));
        btnHD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHDActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHD);
        jToolBar1.add(jSeparator4);
        jToolBar1.add(jSeparator9);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/logout-48.png"))); // NOI18N
        btnLogout.setText("Đăng Xuất");
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setMaximumSize(new java.awt.Dimension(100, 76));
        btnLogout.setMinimumSize(new java.awt.Dimension(100, 76));
        btnLogout.setPreferredSize(new java.awt.Dimension(100, 76));
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLogout);
        jToolBar1.add(jSeparator5);

        javax.swing.GroupLayout pnldataLayout = new javax.swing.GroupLayout(pnldata);
        pnldata.setLayout(pnldataLayout);
        pnldataLayout.setHorizontalGroup(
            pnldataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnldataLayout.setVerticalGroup(
            pnldataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        jMenu3.setText("Quản Lý");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/staff-16.png"))); // NOI18N
        jMenuItem1.setText("Nhân Viên");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/Users-16.png"))); // NOI18N
        jMenuItem2.setText("Khách Hàng");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/product-16.png"))); // NOI18N
        jMenuItem4.setText("Sản Phẩm");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/barcode-16.png"))); // NOI18N
        jMenuItem3.setText("Hóa Đơn");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Trợ Giúp");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/Users-16.png"))); // NOI18N
        jMenuItem6.setText("About");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(pnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(pnldata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnldata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        NVFlag = 0;
        mainPanel = new QLKH();
        pnldata.removeAll();
        pnldata.add(mainPanel);
        pnldata.validate();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NVFlag = 1;
        if(Login.id.equals("admin")){
        mainPanel = new QLNV();
        pnldata.removeAll();
        pnldata.add(mainPanel);
        pnldata.validate();
        }
        else JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập!", "Thông Báo",HEIGHT);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNVActionPerformed
        NVFlag = 1;
        if(Login.id.equals("admin")){
        mainPanel = new QLNV();
        pnldata.removeAll();
        pnldata.add(mainPanel);
        pnldata.validate();
        }
        else JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập!", "Thông Báo",HEIGHT);
    }//GEN-LAST:event_btnNVActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        NVFlag = 0;
        mainPanel = new QLKH();
        pnldata.removeAll();
        pnldata.add(mainPanel);
        pnldata.validate();
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void btnSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSPActionPerformed
        NVFlag = 0;
        mainPanel = new QLSP();
        pnldata.removeAll();
        pnldata.add(mainPanel);
        pnldata.validate();
    }//GEN-LAST:event_btnSPActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        jlbUserName.setText("");
        Login = new LoginDialog(this,true);
        Login.setVisible(true);
        jlbUserName.setText(Login.id);
        if(NVFlag==1&&!Login.id.equals("admin")){
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập, Hệ thống đưa bạn về trang chủ!", "Thông Báo",HEIGHT);
            mainPanel = new AboutPanel();
            pnldata.removeAll();
            pnldata.add(mainPanel);
            pnldata.validate();
        }
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHDActionPerformed
        NVFlag = 0;
        mainPanel = new QLHD();
        pnldata.removeAll();
        pnldata.add(mainPanel);
        pnldata.validate();
    }//GEN-LAST:event_btnHDActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        NVFlag = 0;
        mainPanel = new QLSP();
        pnldata.removeAll();
        pnldata.add(mainPanel);
        pnldata.validate();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        NVFlag = 0;
        mainPanel = new QLHD();
        pnldata.removeAll();
        pnldata.add(mainPanel);
        pnldata.validate();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NVFlag = 0;
        mainPanel = new QLKH();
        pnldata.removeAll();
        pnldata.add(mainPanel);
        pnldata.validate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        NVFlag = 0;
        mainPanel = new AboutPanel();
        pnldata.removeAll();
        pnldata.add(mainPanel);
        pnldata.validate();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Login = new LoginDialog(this,true);
        Login.setVisible(true);
        jlbUserName.setText(Login.id);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHD;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNV;
    private javax.swing.JButton btnSP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel jlbDate;
    private javax.swing.JLabel jlbUser;
    private javax.swing.JLabel jlbUserName;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnldata;
    // End of variables declaration//GEN-END:variables
}
