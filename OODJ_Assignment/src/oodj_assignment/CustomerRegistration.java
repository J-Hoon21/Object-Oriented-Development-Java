package oodj_assignment;
import javax.swing.JOptionPane;
import java.time.LocalDate;
public class CustomerRegistration extends javax.swing.JFrame {

    public CustomerRegistration() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SectionTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPassportIC = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblArriving = new javax.swing.JLabel();
        lblDeparture = new javax.swing.JLabel();
        txtPassportIC = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cbxGender = new javax.swing.JComboBox<>();
        txtAge = new javax.swing.JFormattedTextField();
        txtArriving = new javax.swing.JFormattedTextField();
        txtContact = new javax.swing.JFormattedTextField();
        txtDeparture = new javax.swing.JFormattedTextField();
        btnBack = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        lblRoom = new javax.swing.JLabel();
        txtRoom = new javax.swing.JFormattedTextField();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        SectionTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SectionTitle.setText("Customer Registration Section");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setText("Name");

        lblPassportIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPassportIC.setText("Passport/ IC Number");

        lblDOB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDOB.setText("Age");

        lblGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGender.setText("Gender");

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        lblContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact.setText("Contact Number");

        lblArriving.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblArriving.setText("Arriving Date");

        lblDeparture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDeparture.setText("Departure Date");

        txtPassportIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassportIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassportICKeyTyped(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbxGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        txtAge.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));
        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        txtArriving.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        txtArriving.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactKeyTyped(evt);
            }
        });

        txtDeparture.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        txtDeparture.setToolTipText("");
        txtDeparture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        lblRoom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRoom.setText("Room Number");

        txtRoom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblID.setText("ID");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("*No changes available for ID after registration, Date = yyyy-mm-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(SectionTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRoom)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEmail)
                                        .addGap(139, 139, 139))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblName)
                                            .addComponent(lblGender))
                                        .addGap(126, 126, 126)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblContact)
                                        .addComponent(lblArriving)
                                        .addComponent(lblDeparture)
                                        .addComponent(lblPassportIC)
                                        .addComponent(lblDOB))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtArriving, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPassportIC, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblID)
                            .addGap(156, 156, 156)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack)
                        .addGap(166, 166, 166)
                        .addComponent(btnConfirm)))
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SectionTitle)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(lblArriving)
                    .addComponent(txtArriving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeparture)
                    .addComponent(txtDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(21, 21, 21))
        );

        txtName.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
    id = txtID.getText();
    name = txtName.getText();
    gender =  cbxGender.getSelectedItem().toString();
    age = txtAge.getText();
    passportic = txtPassportIC.getText();
    contact = txtContact.getText();
    email = txtEmail.getText();
    arriving = txtArriving.getText();
    departure = txtDeparture.getText();
    room = txtRoom.getText();

    if(id.equals("") || name.equals("") || age.equals("") || passportic .equals("") || contact.equals("") || arriving .equals("") 
            || departure.equals("") || room.equals("")){
        JOptionPane.showMessageDialog(null, "Incomplete Data Entry!!");
    }
    else {
    LocalDate DepartureDate = LocalDate.parse(departure);
    LocalDate ArrivingDate = LocalDate.parse(arriving);
    if (ArrivingDate.isAfter(DepartureDate) || ArrivingDate.equals(DepartureDate)){
         JOptionPane.showMessageDialog(null, "Inappropriate Departure Date!!");
    }
    else {Customer found = CustomerIO.checking(id);
             if(found == null){
               {result = JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Register? "
               + "(No changes available for ID after registration!)", "Submit Registration", JOptionPane.ERROR_MESSAGE);
               if (result == JOptionPane.YES_OPTION) {
                Customer Cus = new Customer(id,name,gender,age,passportic,contact,email,arriving,departure,room);
                CustomerIO.allCustomer.add(Cus);
                CustomerIO.write();
                JOptionPane.showMessageDialog(this, "Register Successful!");
                setReset();
             }}}
             else {
                 JOptionPane.showMessageDialog(null, "Duplicate ID!!");
             }}}
    }//GEN-LAST:event_btnConfirmActionPerformed

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

    private void txtPassportICKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassportICKeyTyped

    }//GEN-LAST:event_txtPassportICKeyTyped

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
       OODJ_Assignment.second.getX().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRegistration().setVisible(true);
            }
        });
    }
 public String getName(){
         input = txtName.getText();
         return input;
        } 

 private void setReset(){
        txtID.setText("");
        txtName.setText("");
        cbxGender.setSelectedItem("");
        txtAge.setText("");
        txtPassportIC.setText("");
        txtContact.setText("");
        txtEmail.setText("");
        txtArriving.setText("");
        txtDeparture.setText("");
        txtRoom.setText("");
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SectionTitle;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cbxGender;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblArriving;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDeparture;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassportIC;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JFormattedTextField txtAge;
    private javax.swing.JFormattedTextField txtArriving;
    private javax.swing.JFormattedTextField txtContact;
    private javax.swing.JFormattedTextField txtDeparture;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassportIC;
    private javax.swing.JFormattedTextField txtRoom;
    // End of variables declaration//GEN-END:variables
    private String id, input, name, gender, passportic, age,contact,email,arriving,departure, room;
    private int result;
}
