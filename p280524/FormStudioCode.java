/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package p280524;

/**
 *
 * @author Asus
 */
public class FormStudioCode extends javax.swing.JFrame {

    /**
     * Creates new form FormStudioCode
     */
    public FormStudioCode() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMathGrade = new javax.swing.JTextField();
        txtEnglishGrade = new javax.swing.JTextField();
        txtScienceGrade = new javax.swing.JTextField();
        btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtAverage = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Name              :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 100, 16);

        jLabel2.setText("Address          :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 100, 16);

        jLabel3.setText("Age                 :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 90, 16);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(120, 20, 270, 22);
        getContentPane().add(txtAddress);
        txtAddress.setBounds(120, 50, 270, 22);

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        getContentPane().add(txtAge);
        txtAge.setBounds(120, 80, 270, 22);

        jLabel4.setText("Mathgrade      :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 90, 16);

        jLabel5.setText("English Grade  :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 81, 16);

        jLabel6.setText("Science Grade :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 170, 100, 16);
        getContentPane().add(txtMathGrade);
        txtMathGrade.setBounds(120, 110, 270, 22);

        txtEnglishGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnglishGradeActionPerformed(evt);
            }
        });
        getContentPane().add(txtEnglishGrade);
        txtEnglishGrade.setBounds(120, 140, 270, 22);
        getContentPane().add(txtScienceGrade);
        txtScienceGrade.setBounds(120, 170, 270, 22);

        btn.setText("Proses");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn);
        btn.setBounds(15, 200, 380, 23);

        jLabel7.setText("Average         :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 230, 100, 16);
        getContentPane().add(txtAverage);
        txtAverage.setBounds(120, 230, 270, 22);

        setSize(new java.awt.Dimension(414, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
        p260324.StudentRecord student = new p260324.StudentRecord();
        student.setName(txtName.getText());
        student.setaddresss(txtAddress.getText());
        student.setage(Integer.parseInt(txtAge.getText()));
        student.setmathGrade(Double.parseDouble(txtMathGrade.getText()));
        student.setenglishGrade(Double.parseDouble(txtEnglishGrade.getText()));
        student.setscienceGrade(Double.parseDouble(txtScienceGrade.getText()));
        ////
        txtAverage.setText(student.getAverage()+"");
    }//GEN-LAST:event_btnActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtEnglishGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnglishGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnglishGradeActionPerformed

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
            java.util.logging.Logger.getLogger(FormStudioCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormStudioCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormStudioCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormStudioCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormStudioCode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAverage;
    private javax.swing.JTextField txtEnglishGrade;
    private javax.swing.JTextField txtMathGrade;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtScienceGrade;
    // End of variables declaration//GEN-END:variables
}
