/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVAproject;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author APtheGreat
 */
public class Updatebookings extends javax.swing.JFrame {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    /**
     * Creates new form Updatebookings
     */
    public Updatebookings() {
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

        loadBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        SeatsTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pnrTF = new javax.swing.JTextField();
        BookTimeTF = new javax.swing.JTextField();
        BookStatusTF = new javax.swing.JTextField();
        updBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        delBtn = new javax.swing.JButton();
        stnfromTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        stntoTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        categoryTF = new javax.swing.JTextField();
        paymentTF = new javax.swing.JTextField();
        DtTF = new javax.swing.JTextField();
        FusernameTF = new javax.swing.JTextField();
        RemarksTF = new javax.swing.JTextField();
        intBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Ftrainno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        loadBtn.setText("Load Record");
        loadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Seatsbooked");

        SeatsTF.setEnabled(false);
        SeatsTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeatsTFActionPerformed(evt);
            }
        });

        jLabel5.setText("Stn_to");

        BookTimeTF.setEnabled(false);
        BookTimeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookTimeTFActionPerformed(evt);
            }
        });

        BookStatusTF.setEnabled(false);

        updBtn.setText("Update Record");
        updBtn.setEnabled(false);
        updBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Stn_from");

        delBtn.setText("Delete Records");
        delBtn.setEnabled(false);
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        stnfromTF.setEnabled(false);

        jLabel2.setText("BookingTime");

        jLabel3.setText("Booking Status");

        jLabel1.setText("Pnr_no");

        stntoTF.setEnabled(false);
        stntoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stntoTFActionPerformed(evt);
            }
        });

        jLabel7.setText("Category");

        jLabel8.setText("Payment");

        jLabel9.setText("Dt of Journey");

        jLabel10.setText("Fusername");

        jLabel11.setText("Remarks");

        categoryTF.setEnabled(false);

        paymentTF.setEnabled(false);

        DtTF.setEnabled(false);

        FusernameTF.setEnabled(false);

        RemarksTF.setEnabled(false);

        intBtn.setText("Insert Record");
        intBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Enable");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Disable");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setText("Train_no");

        Ftrainno.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Andalus", 3, 36)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JAVAproject/irctc_logo_en_IN.gif.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(updBtn)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(63, 63, 63)))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12))
                                .addGap(186, 186, 186)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delBtn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Ftrainno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(BookStatusTF, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(pnrTF, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(BookTimeTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(RemarksTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                                    .addComponent(FusernameTF, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(DtTF, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(paymentTF, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(categoryTF, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(SeatsTF)
                                                    .addComponent(stntoTF)
                                                    .addComponent(stnfromTF))))
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addComponent(loadBtn)
                                            .addComponent(jButton2)
                                            .addComponent(intBtn)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel13)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pnrTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BookTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookStatusTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Ftrainno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(stnfromTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(stntoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(SeatsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(categoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(paymentTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(DtTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(FusernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(RemarksTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updBtn)
                    .addComponent(delBtn))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(loadBtn)
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(intBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnActionPerformed

        try{
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/irctc","root","ap");
            stmt = con.createStatement();
            String query = "SELECT * from bookings WHERE pnr_no = \"" + pnrTF.getText() + "\";";
            rs = stmt.executeQuery(query);
            if (rs.next()){
                String un = rs.getString("pnr_no");
                String pass = rs.getString("BookingTime");
                String arr = rs.getString("BookingStatus");
                String tn  = rs.getString("FTrain_no");
                String Stn_from = rs.getString("FStn_from");
                String Stn_to = rs.getString("FStn_to");
                String Seatsbooked = rs.getString("Seatsbooked");
                String category = rs.getString("category");
                String payment = rs.getString("payment");
                String dt = rs.getString("dt_of_journey");
                String fun = rs.getString("Fusername");
                String remarks = rs.getString("remarks");
                BookTimeTF.setText(pass);
                BookStatusTF.setText(arr);
                Ftrainno.setText(tn);
                stnfromTF.setText(Stn_from);
                stntoTF.setText(Stn_to);
                SeatsTF.setText(Seatsbooked);
                categoryTF.setText(category);
                paymentTF.setText(payment);
                DtTF.setText(dt);
                FusernameTF.setText(fun);
                RemarksTF.setText(remarks);
                updBtn.setEnabled(true);
                delBtn.setEnabled(true);
                BookTimeTF.setEnabled(true);
                BookStatusTF.setEnabled(true);
                Ftrainno.setEnabled(true);
                stnfromTF.setEnabled(true);
                stntoTF.setEnabled(true);
                SeatsTF.setEnabled(true);
                categoryTF.setEnabled(true);
                paymentTF.setEnabled(true);
                DtTF.setEnabled(true);
                FusernameTF.setEnabled(true);
                RemarksTF.setEnabled(true);
            } else{
                JOptionPane.showMessageDialog(null,"No Such Record Found.");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_loadBtnActionPerformed

    private void updBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updBtnActionPerformed

        int ans = JOptionPane.showConfirmDialog(null, "Surely wanna update the Record?");
        if(ans==JOptionPane.YES_OPTION){
            try{
                stmt = con.createStatement();
                String query = "UPDATE bookings SET BookingTime = \"" + BookTimeTF.getText()+"\", BookingStatus = \"" + BookStatusTF.getText() +"\" , FTrain_no = \""+Ftrainno.getText()+ "\" , FStn_from = \"" + stnfromTF.getText() + "\" , FStn_to = \"" +stntoTF.getText() +"\" , Seatsbooked = \""+ SeatsTF.getText()+"\" ,category = \""+categoryTF.getText()+"\" , payment= \""+paymentTF.getText()+"\" , Dt_of_journey = \""+DtTF.getText()+"\", Fusername = \""+FusernameTF.getText()+"\",remarks = \""+RemarksTF.getText()+"\" WHERE pnr_no = \"" + pnrTF.getText() + "\";";
                stmt.execute(query);
                JOptionPane.showMessageDialog(null, "Record successfully updated.");
            }catch(HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(null, e.toString());
            }
            pnrTF.setText("");
            BookTimeTF.setText("");
            BookStatusTF.setText("");
            Ftrainno.setText("");
            stnfromTF.setText("");
            stntoTF.setText("");
            SeatsTF.setText("");
            categoryTF.setText("");
            paymentTF.setText("");
            DtTF.setText("");
            FusernameTF.setText("");
            RemarksTF.setText("");
            updBtn.setEnabled(false);
            delBtn.setEnabled(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_updBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed

        int res = JOptionPane.showConfirmDialog(null, "Wanna delete the record for sure?");
        if(res == JOptionPane.YES_OPTION){
            try{
                stmt = con.createStatement();
                String query = "DELETE FROM bookings WHERE pnr_no = \"" + pnrTF.getText() + "\" ;";
                stmt.execute(query);
                JOptionPane.showMessageDialog(null, "Record Deleted!");
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        pnrTF.setText("");
        BookTimeTF.setText("");
        BookStatusTF.setText("");
        Ftrainno.setText("");
        stnfromTF.setText("");
        stntoTF.setText("");
        SeatsTF.setText("");
        categoryTF.setText("");
        paymentTF.setText("");
        DtTF.setText("");
        FusernameTF.setText("");
        RemarksTF.setText("");
        updBtn.setEnabled(false);
        delBtn.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_delBtnActionPerformed

    private void BookTimeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookTimeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookTimeTFActionPerformed

    private void stntoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stntoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stntoTFActionPerformed

    private void intBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intBtnActionPerformed
        
        try{
            Class.forName("java.sql.Driver");
            Connection con1= DriverManager.getConnection("jdbc:mysql://localhost/irctc","root","ap");
            Statement stmt1=con1.createStatement();
            String query = "INSERT INTO CUSTOMER " +"VALUES ("+pnrTF.getText()+",'"+BookTimeTF.getText()+"','"+BookStatusTF.getText()+"','"+Ftrainno.getText()+"','"+stnfromTF.getText()+"','"+stntoTF.getText()+"','"+SeatsTF.getText()+"','"+categoryTF.getText()+"','"+paymentTF.getText()+"','"+DtTF.getText()+"','"+FusernameTF.getText()+"','"+RemarksTF.getText()+"');";
            stmt1.executeUpdate(query);
            int res = JOptionPane.showConfirmDialog(null, "Pay Rs."+paymentTF.getText()+"");
            if(res==JOptionPane.YES_OPTION){
              JOptionPane.showMessageDialog(null, "Booking DOne!");
            }

            pnrTF.setText("");
            BookTimeTF.setText("");
            BookStatusTF.setText("");
            Ftrainno.setText("");
            stnfromTF.setText("");
            stntoTF.setText("");
            SeatsTF.setText("");
            categoryTF.setText("");
            paymentTF.setText("");
            DtTF.setText("");
            FusernameTF.setText("");
            RemarksTF.setText("");

        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_intBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    
    BookTimeTF.setEnabled(true);
    BookStatusTF.setEnabled(true);
    Ftrainno.setEnabled(true);
    stnfromTF.setEnabled(true);
    stntoTF.setEnabled(true);
    SeatsTF.setEnabled(true);
    categoryTF.setEnabled(true);
    paymentTF.setEnabled(true);
    DtTF.setEnabled(true);
    FusernameTF.setEnabled(true);
    RemarksTF.setEnabled(true);
    loadBtn.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    BookTimeTF.setEnabled(false);
    BookStatusTF.setEnabled(false);
    Ftrainno.setEnabled(false);
    stnfromTF.setEnabled(false);
    stntoTF.setEnabled(false);
    SeatsTF.setEnabled(false);
    categoryTF.setEnabled(false);
    paymentTF.setEnabled(false);
    DtTF.setEnabled(false);
    FusernameTF.setEnabled(false);
    RemarksTF.setEnabled(false);
    loadBtn.setEnabled(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SeatsTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeatsTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeatsTFActionPerformed

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
            java.util.logging.Logger.getLogger(Updatebookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Updatebookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Updatebookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Updatebookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Updatebookings().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookStatusTF;
    private javax.swing.JTextField BookTimeTF;
    private javax.swing.JTextField DtTF;
    javax.swing.JTextField Ftrainno;
    private javax.swing.JTextField FusernameTF;
    private javax.swing.JTextField RemarksTF;
    private javax.swing.JTextField SeatsTF;
    private javax.swing.JTextField categoryTF;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton intBtn;
    javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loadBtn;
    private javax.swing.JTextField paymentTF;
    javax.swing.JTextField pnrTF;
    private javax.swing.JTextField stnfromTF;
    private javax.swing.JTextField stntoTF;
    private javax.swing.JButton updBtn;
    // End of variables declaration//GEN-END:variables
}
