/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QLBH.Panel;

import QLBH.myFunction;
import static com.microsoft.sqlserver.jdbc.StringUtils.isNumeric;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class QLNV extends javax.swing.JPanel {
    
    private void loadData(){
        Connection con = myFunction.getConnection();
        try{
        String query = "select * from NHANVIEN";
        PreparedStatement pst = con.prepareStatement(query);
        ResultSet rs =  pst.executeQuery();
        
        DefaultTableModel tbModel = (DefaultTableModel)jtbData.getModel();
        
        tbModel.setRowCount(0);
        while(rs.next()){
            String MANV = rs.getString("MANV");
            String HOTEN = rs.getString("HOTEN");
            String SDT = rs.getString("SODT");
            String NGVL = myFunction.dateLongtoShort(rs.getString("NGVL"));
            String data[] = {MANV,HOTEN,SDT,NGVL};
            tbModel.addRow(data);
            
        }
        con.close();
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    } 
    
    private void clear(){
        txtSearch.setText("");
        txtAddMANV.setText("");
        txtMANV1.setText("");
        txtAddHOTEN.setText("");
        txtHOTEN1.setText("");
        txtaAddSODT.setText("");
        txtSODT1.setText("");
        txtAddNGVL.setText("");
        txtNGVL1.setText("");
        txtID.setText("");
        txtPW.setText("");
        loadData();  
    }

    public QLNV() {
        initComponents();
        loadData();
        jtbData.setDefaultEditor(Object.class, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addDialog = new javax.swing.JDialog();
        jlbAddMANV = new javax.swing.JLabel();
        jlbAddHOTEN = new javax.swing.JLabel();
        jlbAddSODT = new javax.swing.JLabel();
        jlbAddNGVL = new javax.swing.JLabel();
        txtAddNGVL = new javax.swing.JTextField();
        txtaAddSODT = new javax.swing.JTextField();
        txtAddHOTEN = new javax.swing.JTextField();
        txtAddMANV = new javax.swing.JTextField();
        btnAddConfirm = new javax.swing.JButton();
        editDialog = new javax.swing.JDialog();
        jlbEditMANV = new javax.swing.JLabel();
        jlbEditHOTEN = new javax.swing.JLabel();
        jlbEditSODT = new javax.swing.JLabel();
        jlbEditNGVL = new javax.swing.JLabel();
        chkLoginApp = new javax.swing.JCheckBox();
        txtNGVL1 = new javax.swing.JTextField();
        txtSODT1 = new javax.swing.JTextField();
        txtHOTEN1 = new javax.swing.JTextField();
        txtMANV1 = new javax.swing.JTextField();
        jlbEditID = new javax.swing.JLabel();
        jlbEditPW = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtPW = new javax.swing.JPasswordField();
        jlbEditConfirm = new javax.swing.JButton();
        jlbTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbData = new javax.swing.JTable();
        jplFuntion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnRef = new javax.swing.JButton();

        addDialog.setTitle("Thêm Nhân Viên");
        addDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                addDialogWindowClosed(evt);
            }
        });

        jlbAddMANV.setText("Mã NV:");

        jlbAddHOTEN.setText("Họ Tên:");

        jlbAddSODT.setText("Số ĐT:");

        jlbAddNGVL.setText("Ngày VL:");

        btnAddConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/check-16.png"))); // NOI18N
        btnAddConfirm.setText("Xác Nhận");
        btnAddConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addDialogLayout = new javax.swing.GroupLayout(addDialog.getContentPane());
        addDialog.getContentPane().setLayout(addDialogLayout);
        addDialogLayout.setHorizontalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbAddNGVL)
                    .addComponent(jlbAddSODT)
                    .addComponent(jlbAddHOTEN)
                    .addComponent(jlbAddMANV))
                .addGap(18, 18, 18)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddMANV)
                    .addComponent(txtAddHOTEN)
                    .addComponent(txtaAddSODT)
                    .addComponent(txtAddNGVL, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddConfirm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addDialogLayout.setVerticalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbAddMANV)
                    .addComponent(txtAddMANV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbAddHOTEN)
                    .addComponent(txtAddHOTEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbAddSODT)
                    .addComponent(txtaAddSODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbAddNGVL)
                    .addComponent(txtAddNGVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddConfirm)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        editDialog.setTitle("Thay đổi thông tin nhân viên");
        editDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                editDialogWindowClosed(evt);
            }
        });

        jlbEditMANV.setText("Mã NV:");

        jlbEditHOTEN.setText("Họ Tên:");

        jlbEditSODT.setText("Số ĐT:");

        jlbEditNGVL.setText("Ngày VL:");

        chkLoginApp.setText("Cấp quyền sử dụng ứng dụng quản lý!");
        chkLoginApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLoginAppActionPerformed(evt);
            }
        });

        jlbEditID.setText("ID:");

        jlbEditPW.setText("PW:");

        jlbEditConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/check-16.png"))); // NOI18N
        jlbEditConfirm.setText("Xác Nhận");
        jlbEditConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlbEditConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editDialogLayout = new javax.swing.GroupLayout(editDialog.getContentPane());
        editDialog.getContentPane().setLayout(editDialogLayout);
        editDialogLayout.setHorizontalGroup(
            editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editDialogLayout.createSequentialGroup()
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editDialogLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbEditID)
                            .addComponent(jlbEditPW))
                        .addGap(18, 18, 18)
                        .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(txtPW)))
                    .addGroup(editDialogLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbEditNGVL)
                            .addComponent(jlbEditSODT)
                            .addComponent(jlbEditHOTEN)
                            .addComponent(jlbEditMANV))
                        .addGap(18, 18, 18)
                        .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMANV1)
                            .addComponent(txtHOTEN1)
                            .addComponent(txtSODT1)
                            .addComponent(txtNGVL1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                    .addGroup(editDialogLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(chkLoginApp))
                    .addGroup(editDialogLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jlbEditConfirm)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        editDialogLayout.setVerticalGroup(
            editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editDialogLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEditMANV)
                    .addComponent(txtMANV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEditHOTEN)
                    .addComponent(txtHOTEN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEditSODT)
                    .addComponent(txtSODT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEditNGVL)
                    .addComponent(txtNGVL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkLoginApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEditID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEditPW)
                    .addComponent(txtPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlbEditConfirm)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jlbTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlbTitle.setForeground(new java.awt.Color(0, 153, 153));
        jlbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitle.setText("QUẢN LÝ NHÂN VIÊN");

        jtbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ Tên", "Số Điện Thoại", "Ngày Vào Làm", "Access App"
            }
        ));
        jScrollPane1.setViewportView(jtbData);

        jplFuntion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tìm Kiếm:");

        txtSearch.setPreferredSize(new java.awt.Dimension(64, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/search.png"))); // NOI18N
        jButton1.setText("Tìm Kiếm");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/add.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/edit.png"))); // NOI18N
        btnMod.setText("Sửa");
        btnMod.setPreferredSize(new java.awt.Dimension(100, 30));
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/delete.png"))); // NOI18N
        btnDel.setText("Xóa");
        btnDel.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnRef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLBH/img/clear.png"))); // NOI18N
        btnRef.setText("Làm Mới");
        btnRef.setPreferredSize(new java.awt.Dimension(100, 30));
        btnRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplFuntionLayout = new javax.swing.GroupLayout(jplFuntion);
        jplFuntion.setLayout(jplFuntionLayout);
        jplFuntionLayout.setHorizontalGroup(
            jplFuntionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplFuntionLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addComponent(jSeparator2)
            .addGroup(jplFuntionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jplFuntionLayout.setVerticalGroup(
            jplFuntionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplFuntionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplFuntionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jplFuntionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addComponent(jplFuntion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jplFuntion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addDialog.pack();
        addDialog.setSize(375, 300);
        addDialog.setLocationRelativeTo(null);
        addDialog.setAlwaysOnTop(true);
        addDialog.setModal(true);
        txtAddNGVL.setText(myFunction.getCurrentDate());
        addDialog.setVisible(true);
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAddConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddConfirmActionPerformed
        StringBuilder sbError = new StringBuilder();
        if(txtAddMANV.getText().hashCode() == 0) sbError.append("Yêu cầu có mã Nhân Viên! \n");
        if(txtAddMANV.getText().length()>4) sbError.append("Mã Nhân Viên tối đa 4 kí tự, ví dụ NV01 NV02 ... \n");
        if(!isNumeric(txtaAddSODT.getText())&&!txtaAddSODT.getText().equals(""))sbError.append("Số điện thoại phải là số! \n");
        if(!myFunction.isVNDate(txtAddNGVL.getText())&&!txtAddNGVL.getText().equals("")) sbError.append("Ngày vào làm không đúng, hãy nhập dạng dd/MM/yyyy ex: 25/12/2020");
        
        Connection con = myFunction.getConnection();
        try{
            if(sbError.length()>0) JOptionPane.showMessageDialog(addDialog, sbError ,"Thông Báo",HEIGHT);
        else{
            String query = "INSERT INTO NHANVIEN VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtAddMANV.getText());
            pst.setString(2, txtAddHOTEN.getText());
            pst.setString(3, txtaAddSODT.getText());
            pst.setString(4, myFunction.dateShorttoLongto(txtAddNGVL.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(addDialog, "Ðã thêm thành công!");
            clear();
            con.close();
            addDialog.dispose();
        }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            JOptionPane.showMessageDialog(addDialog, e);
        }
    }//GEN-LAST:event_btnAddConfirmActionPerformed

    private void addDialogWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_addDialogWindowClosed
        addDialog.dispose();
    }//GEN-LAST:event_addDialogWindowClosed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        editDialog.pack();
        editDialog.setSize(375, 300);
        
        txtID.setVisible(false);
        txtPW.setVisible(false);
        jlbEditID.setVisible(false);
        jlbEditPW.setVisible(false);
        
        DefaultTableModel recordModel = (DefaultTableModel)jtbData.getModel();
        int selectdRow = jtbData.getSelectedRow();
        if(selectdRow==-1) JOptionPane.showMessageDialog(null, "Hãy chọn dữ liệu cần thay đổi!" ,"Thông Báo",HEIGHT);
        else{
            txtMANV1.setText(recordModel.getValueAt(selectdRow, 0).toString());
            txtMANV1.setEnabled(false); 
            if(recordModel.getValueAt(selectdRow, 1)!=null)
            txtHOTEN1.setText(recordModel.getValueAt(selectdRow, 1).toString());
            if(recordModel.getValueAt(selectdRow, 2)!=null)
            txtSODT1.setText(recordModel.getValueAt(selectdRow, 2).toString());
            if(recordModel.getValueAt(selectdRow, 3)!=null)
            txtNGVL1.setText(recordModel.getValueAt(selectdRow, 3).toString());

            editDialog.setAlwaysOnTop(true);
            editDialog.setModal(true);
            editDialog.setLocationRelativeTo(this);

            editDialog.setVisible(true);
        }
    }//GEN-LAST:event_btnModActionPerformed

    private void chkLoginAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLoginAppActionPerformed
        if(chkLoginApp.isSelected()){
            txtID.setVisible(true);
            txtPW.setVisible(true);
            jlbEditID.setVisible(true);
            jlbEditPW.setVisible(true);
            editDialog.setSize(375, 360);  
        }
        else{
            txtID.setVisible(false);
            txtPW.setVisible(false);
            jlbEditID.setVisible(false);
            jlbEditPW.setVisible(false);
            editDialog.setSize(375, 290);  
        }
    }//GEN-LAST:event_chkLoginAppActionPerformed

    private void jlbEditConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlbEditConfirmActionPerformed
        StringBuilder sbError = new StringBuilder();
        if(txtMANV1.getText().hashCode() == 0) sbError.append("Yêu cầu có mã Nhân Viên! \n");
        if(txtMANV1.getText().length()>4) sbError.append("Mã Nhân Viên tối đa 4 kí tự, ví dụ NV01 NV02 ... \n");
        if(!isNumeric(txtSODT1.getText())&&!txtSODT1.getText().equals(""))sbError.append("Số điện thoại phải là số! \n");
        if(!myFunction.isVNDate(txtNGVL1.getText())&&!txtNGVL1.getText().equals("")) sbError.append("Ngày vào làm không đúng, hãy nhập dạng dd/MM/yyyy ex: 25/12/2020 \n");
        
        Connection con = myFunction.getConnection();
        try{
            if(sbError.length()>0) JOptionPane.showMessageDialog(editDialog, sbError ,"Thông Báo",HEIGHT);
        else{
            String query = "UPDATE NHANVIEN SET HOTEN = ?, SODT = ?, NGVL = ? WHERE MANV = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(4, txtMANV1.getText());
            pst.setString(1, txtHOTEN1.getText());
            pst.setString(2, txtSODT1.getText());
            pst.setString(3, myFunction.dateShorttoLongto(txtNGVL1.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(editDialog, "Ðã cập nhật thành công!");
            clear();
            con.close();
            editDialog.dispose();
        }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            JOptionPane.showMessageDialog(editDialog, e);
        }
    }//GEN-LAST:event_jlbEditConfirmActionPerformed

    private void editDialogWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_editDialogWindowClosed
        editDialog.dispose();
    }//GEN-LAST:event_editDialogWindowClosed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        DefaultTableModel recordModel = (DefaultTableModel)jtbData.getModel();
        int selectdRow = jtbData.getSelectedRow();
        if(selectdRow==-1) JOptionPane.showMessageDialog(null, "Hãy chọn dữ liệu cần xóa!" ,"Thông Báo",HEIGHT);
        else{
        int response = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa?", "Xác Nhận Xóa", WIDTH, HEIGHT);
        if(response==JOptionPane.YES_OPTION)
        {
        Connection con = myFunction.getConnection();
        try{
        String query = "DELETE FROM NHANVIEN WHERE MANV=?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, recordModel.getValueAt(selectdRow, 0).toString());
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Ðã xóa thành công!");
        loadData();
        con.close();
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefActionPerformed
        clear();
    }//GEN-LAST:event_btnRefActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = myFunction.getConnection();
        try{
        String query = "select * from NHANVIEN where MANV = '" + txtSearch.getText() + "' or HOTEN LIKE N'%" + txtSearch.getText() + "%'" ;
        PreparedStatement pst = con.prepareStatement(query);
        ResultSet rs =  pst.executeQuery();
        
        DefaultTableModel rsModel = (DefaultTableModel)jtbData.getModel();
        
        rsModel.setRowCount(0);
        while(rs.next()){
            String MANV = rs.getString("MANV");
            String HOTEN = rs.getString("HOTEN");
            String SDT = rs.getString("SODT");
            String NGVL = myFunction.dateLongtoShort(rs.getString("NGVL"));
            
            String data[] = {MANV,HOTEN,SDT,NGVL};
            rsModel.addRow(data);
        }
        con.close();
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog addDialog;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddConfirm;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnRef;
    private javax.swing.JCheckBox chkLoginApp;
    private javax.swing.JDialog editDialog;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlbAddHOTEN;
    private javax.swing.JLabel jlbAddMANV;
    private javax.swing.JLabel jlbAddNGVL;
    private javax.swing.JLabel jlbAddSODT;
    private javax.swing.JButton jlbEditConfirm;
    private javax.swing.JLabel jlbEditHOTEN;
    private javax.swing.JLabel jlbEditID;
    private javax.swing.JLabel jlbEditMANV;
    private javax.swing.JLabel jlbEditNGVL;
    private javax.swing.JLabel jlbEditPW;
    private javax.swing.JLabel jlbEditSODT;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JPanel jplFuntion;
    private javax.swing.JTable jtbData;
    private javax.swing.JTextField txtAddHOTEN;
    private javax.swing.JTextField txtAddMANV;
    private javax.swing.JTextField txtAddNGVL;
    private javax.swing.JTextField txtHOTEN1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMANV1;
    private javax.swing.JTextField txtNGVL1;
    private javax.swing.JPasswordField txtPW;
    private javax.swing.JTextField txtSODT1;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtaAddSODT;
    // End of variables declaration//GEN-END:variables
}