package oodj_assignment;
import javax.swing.JOptionPane;
public class TechnicianEdit extends javax.swing.JFrame {
    public TechnicianEdit() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxType = new javax.swing.JComboBox<>();
        lblContact = new javax.swing.JLabel();
        txtPassportIC = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cbxGender = new javax.swing.JComboBox<>();
        SectionTitle = new javax.swing.JLabel();
        txtAge = new javax.swing.JFormattedTextField();
        lblName = new javax.swing.JLabel();
        txtContact = new javax.swing.JFormattedTextField();
        lblPassportIC = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblDOB = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        lblGender = new javax.swing.JLabel();
        lblSpecialisation = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnVerify = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kitchen Equipment", "Laundry Equipment", "Cleaning Equipment", "Heating and Cooling Equipment", "Humidifiers and Dehumidifiers", "Air Purifiers", "Entertainment Centers" }));

        lblContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact.setText("Contact Number");

        txtPassportIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassportIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassportICKeyTyped(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.setEnabled(false);

        cbxGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        SectionTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SectionTitle.setText("Technician Profile Edit Section");

        txtAge.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));
        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setText("Name");

        txtContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactKeyTyped(evt);
            }
        });

        lblPassportIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPassportIC.setText("Passport/ IC Number");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblDOB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDOB.setText("Age");

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        lblGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGender.setText("Gender");

        lblSpecialisation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSpecialisation.setText("Specialisation");

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        btnVerify.setText("Search");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnBack)
                        .addGap(166, 166, 166)
                        .addComponent(btnConfirm)
                        .addGap(214, 214, 214))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSpecialisation)
                                .addGap(91, 91, 91)
                                .addComponent(cbxType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContact)
                                    .addComponent(lblPassportIC)
                                    .addComponent(lblDOB)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblEmail)
                                                .addGap(139, 139, 139))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblName)
                                                    .addComponent(lblGender))
                                                .addGap(126, 126, 126)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cbxGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtName)
                                            .addComponent(txtContact)
                                            .addComponent(txtAge)
                                            .addComponent(txtPassportIC)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(SectionTitle)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(SectionTitle)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(cbxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassportIC, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassportIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContact)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpecialisation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnConfirm))
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassportICKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassportICKeyTyped

    }//GEN-LAST:event_txtPassportICKeyTyped

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        String count = txtAge.getText();
        int length = count.length();
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)){
            evt.consume();
        }
        if (length >= 2){
            txtAge.setText("");
        }
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyTyped
        String count = txtContact.getText();
        int length = count.length();
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)){
            evt.consume();
        }
        if (length >= 10){
            txtContact.setText("");
        }
    }//GEN-LAST:event_txtContactKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        setVisible(false);
        new TechnicianView().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
                    name = txtName.getText();
                    gender =  cbxGender.getSelectedItem().toString();
                    age = txtAge.getText();
                    passportic = txtPassportIC.getText();
                    contact = txtContact.getText();
                    email = txtEmail.getText();
                    specialisation =  cbxType.getSelectedItem().toString();
        if(name.equals("") || age.equals("") || passportic .equals("") || contact.equals("")){
            JOptionPane.showMessageDialog(null, "Incomplete Data Entry!!");
        }else{
                 {result = JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Make Changes? "
               ,"Edit Technician Profile", JOptionPane.ERROR_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    Technician found = FileIO.checking2(name);
                    if(found != null){
                    found.setGender(gender);
                    found.setAge(age);
                    found.setPassportIC(passportic);
                    found.setContact(contact);
                    found.setEmail(email);
                    found.setSpecialisation(specialisation);
                    FileIO.write();
                    JOptionPane.showMessageDialog(this, "Update Successful!");
                    setReset();
                }}}}
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        String input = JOptionPane.showInputDialog("Enter Technician Name: ");
        Appointment found2 = CustomerIO.checking4(input);
        if(found2 != null){
            JOptionPane.showMessageDialog(null, "Alert!! This technician occupied in an appointment!!");
        }   else if(found2 == null){
            Technician found = FileIO.checking2(input);
            if(found != null){
                txtName.setText(found.getName());
                cbxGender.setSelectedItem(found.getGender());
                txtAge.setText(found.getAge());
                txtPassportIC.setText(found.getPassportIC());
                txtContact.setText(found.getContact());
                txtEmail.setText(found.getEmail());
                cbxType.setSelectedItem(found.getSpecialisation());
            } else {
                JOptionPane.showMessageDialog(null, "Techinician not found, Please Try Again!");
            }
        }

    }//GEN-LAST:event_btnVerifyActionPerformed

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
            java.util.logging.Logger.getLogger(TechnicianEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TechnicianEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TechnicianEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TechnicianEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TechnicianEdit().setVisible(true);
            }
        });
    }
private void setReset(){
    txtName.setText("");
    cbxGender.setSelectedItem("");
    txtAge.setText("");
    txtPassportIC.setText("");
    txtContact.setText("");
    txtEmail.setText("");
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SectionTitle;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnVerify;
    private javax.swing.JComboBox<String> cbxGender;
    private javax.swing.JComboBox<String> cbxType;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassportIC;
    private javax.swing.JLabel lblSpecialisation;
    private javax.swing.JFormattedTextField txtAge;
    private javax.swing.JFormattedTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassportIC;
    // End of variables declaration//GEN-END:variables
private String id, input, name, gender, passportic, age,contact,email,specialisation;
private int result;
}
