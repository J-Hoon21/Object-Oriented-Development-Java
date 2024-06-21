
package oodj_assignment;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
public class AppointmentBooking extends javax.swing.JFrame {
    public AppointmentBooking() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SectionTitle = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPassportIC = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblArriving = new javax.swing.JLabel();
        lblDeparture = new javax.swing.JLabel();
        lblRoom = new javax.swing.JLabel();
        lbl0 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lblID1 = new javax.swing.JLabel();
        lblContact1 = new javax.swing.JLabel();
        lblContact2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnResetDate = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        btnAdd1Day = new javax.swing.JButton();
        lblContact3 = new javax.swing.JLabel();
        cbxTime = new javax.swing.JComboBox<>();
        lbl00 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        cbxType = new javax.swing.JComboBox<>();
        Appliance = new javax.swing.JLabel();
        txtAppliance = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblContact4 = new javax.swing.JLabel();
        txtTechnician = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        SectionTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SectionTitle.setText("Home Appliances Servicing Appointment");

        lblID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblID.setText("ID");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setText("Name");

        lblPassportIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPassportIC.setText("Passport/ IC Number");

        lblContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact.setText("Contact Number");

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        lblArriving.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblArriving.setText("Arriving Date");

        lblDeparture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDeparture.setText("Departure Date");

        lblRoom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRoom.setText("Room Number");

        lbl0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl0.setText("- - - - - - - - - - - - - - - - - - - - - - -");
        lbl0.setPreferredSize(new java.awt.Dimension(202, 17));

        lbl5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl5.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl3.setText("- - - - - - - - - - - - - - - - - - - - - - -");
        lbl3.setPreferredSize(new java.awt.Dimension(202, 17));

        lbl4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl4.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        lbl6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl6.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        lbl7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl7.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        lbl8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl8.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        lbl9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl9.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        lbl10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl10.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        lblID1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblID1.setText("Type");

        lblContact1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact1.setText("Estimate Date");

        lblContact2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact2.setText("Booking Date");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnResetDate.setText("Reset Date");
        btnResetDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDateActionPerformed(evt);
            }
        });

        lblAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAge.setText("Age");

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl2.setText("- - - - - - - - - - - - - - - - - - - - - - -");
        lbl2.setPreferredSize(new java.awt.Dimension(202, 17));

        btnAdd1Day.setText("Add 1 Day");
        btnAdd1Day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1DayActionPerformed(evt);
            }
        });

        lblContact3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact3.setText("Time");

        cbxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9.00 AM", "12.00 PM", "3.00 PM" }));

        lbl00.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl00.setText("- - - - - - - - - - - - - - - - - - - - - - -");
        lbl00.setPreferredSize(new java.awt.Dimension(202, 17));

        lblGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGender.setText("Gender");

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl1.setText("- - - - - - - - - - - - - - - - - - - - - - -");
        lbl1.setPreferredSize(new java.awt.Dimension(202, 17));

        cbxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kitchen Equipment", "Laundry Equipment", "Cleaning Equipment", "Heating and Cooling Equipment", "Humidifiers and Dehumidifiers", "Air Purifiers", "Entertainment Centers" }));

        Appliance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Appliance.setText("Appliance");

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblContact4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact4.setText("Technician");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SectionTitle)
                .addGap(279, 279, 279))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl0, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl00, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAge)
                                .addGap(115, 115, 115)
                                .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblRoom)
                                    .addGap(48, 48, 48)
                                    .addComponent(lbl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDeparture)
                                    .addGap(43, 43, 43)
                                    .addComponent(lbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblArriving)
                                    .addGap(59, 59, 59)
                                    .addComponent(lbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEmail)
                                    .addGap(107, 107, 107)
                                    .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblContact)
                                    .addGap(36, 36, 36)
                                    .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPassportIC)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGender)
                                .addGap(94, 94, 94)
                                .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirm)
                        .addGap(136, 136, 136))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContact1)
                            .addComponent(lblContact2)
                            .addComponent(lblContact3)
                            .addComponent(lblID1)
                            .addComponent(Appliance)
                            .addComponent(lblContact4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnResetDate)
                                .addGap(33, 33, 33)
                                .addComponent(btnAdd1Day))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAppliance)
                                    .addComponent(txtTechnician, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(SectionTitle)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblName)
                                    .addComponent(lbl0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSearch)
                                .addComponent(lbl00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPassportIC, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblContact)
                                    .addComponent(lbl4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmail)
                                    .addComponent(lbl5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblArriving)
                                    .addComponent(lbl6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDeparture)
                                    .addComponent(lbl7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRoom)
                                    .addComponent(lbl8))
                                .addContainerGap(33, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID1)
                            .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Appliance)
                            .addComponent(txtAppliance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContact2)
                            .addComponent(lbl9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl10)
                            .addComponent(lblContact1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnResetDate)
                            .addComponent(btnAdd1Day))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblContact3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContact4)
                            .addComponent(txtTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(btnConfirm)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String input = JOptionPane.showInputDialog("Enter Customer ID:");
        Appointment found2 = CustomerIO.checking2(input);
        if(found2 == null){
        Customer found = CustomerIO.checking(input);
        if(found != null){
        lbl00.setText(found.getID());
        lbl0.setText(found.getName());
        lbl1.setText(found.getGender());
        lbl2.setText(found.getAge());
        lbl3.setText(found.getPassportIC());
        lbl4.setText(found.getContact());
        lbl5.setText(found.getEmail());
        lbl6.setText(found.getArriving());
        lbl7.setText(found.getDeparture());
        lbl8.setText(found.getRoomNumber());
        
        
        LocalDate currentDate = LocalDate.now(); // Get current Date value
        lbl9.setText(currentDate.toString());
        LocalDate Next3days = currentDate.plus(3, ChronoUnit.DAYS); //Adding 1 weeks to the current date
        lbl10.setText(Next3days.toString());
        
        LocalDate DepartureDate = LocalDate.parse(lbl7.getText());
        if (currentDate.isAfter(DepartureDate) || currentDate.equals(DepartureDate)){
            JOptionPane.showMessageDialog(this, "Oops! Departure Date has passed! Appointment Booking Is Impossible!");
            setReset();
        }
        else if (Next3days.isAfter(DepartureDate) || Next3days.equals(DepartureDate)){
            JOptionPane.showMessageDialog(this, "Oops! Estimate Date has exceeds Departure Date! Appointment Booking Is Impossible!");
            setReset();
        }}
            else {
                JOptionPane.showMessageDialog(null, "ID not found, Please Try Again!");
                setReset();
            }}
             else {
                 JOptionPane.showMessageDialog(null, "Sorry! Only 1 appointment can be made!");
             }                      
       
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDateActionPerformed
        LocalDate currentDate = LocalDate.now(); // Get current Date value
        LocalDate result = currentDate.plus(3, ChronoUnit.DAYS); //Adding 3 DAYS to the current date
        lbl10.setText(result.toString());
    }//GEN-LAST:event_btnResetDateActionPerformed

    private void btnAdd1DayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1DayActionPerformed
        LocalDate Date = LocalDate.parse(lbl10.getText());
        LocalDate Add1Day = Date.plus(1, ChronoUnit.DAYS); //Adding 1 day
        lbl10.setText(Add1Day.toString());
        LocalDate DepartureDate = LocalDate.parse(lbl7.getText());
        if (Add1Day.equals(DepartureDate)){
            JOptionPane.showMessageDialog(this, "Oops! Departure Date has passed! Appointment Booking Is Impossible!");
            setReset();
        }
    }//GEN-LAST:event_btnAdd1DayActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
    id = lbl00.getText();
    name = lbl0.getText();
    gender =  lbl1.getText();
    age = lbl2.getText();
    passportic = lbl3.getText();
    contact = lbl4.getText();
    email = lbl5.getText();
    arriving = lbl6.getText();
    departure = lbl7.getText();
    room = lbl8.getText();
    type = cbxType.getSelectedItem().toString();
    appliance = txtAppliance.getText();
    booking = lbl9.getText();
    estimate = lbl10.getText();
    time = cbxTime.getSelectedItem().toString();
    tech = txtTechnician.getText();
    if(name.equals("- - - - - - - - - - - - - - - - - - - - - - -") || appliance.equals("") || tech.equals("")){
        JOptionPane.showMessageDialog(null, "Incomplete Data Entry!");
    }else{
         Technician found = FileIO.checking2(tech);
         if(found == null){
         JOptionPane.showMessageDialog(null, "Technician Not Found!");
         }
    else{
          Appointment found2 = CustomerIO.checking3(tech, time, estimate);
          if(found2 != null){
         JOptionPane.showMessageDialog(null, "Sorry! This Techinician Has been Schedule In The Same Date and Same Time!");
         }
    else{
          Technician found3 = FileIO.checking4(tech, type);
          if(found3 == null){
         JOptionPane.showMessageDialog(null, "Sorry! This Techinician Specialisation Is Not Match With The Service Type!");
         }
          else{{result = JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Make Appointment? "
               + "(Please ensure your personal data is correct!)", "Submit Appointment", JOptionPane.ERROR_MESSAGE);
               if (result == JOptionPane.YES_OPTION) {
                Appointment app = new Appointment(id,name,gender, age, passportic, contact, email, arriving, departure, 
                        room, type, appliance, booking, estimate, time, tech);
                CustomerIO.allAppointment.add(app);
                CustomerIO.write();
                JOptionPane.showMessageDialog(this, "Appointment Booking Successful!");
                setReset();
             }}}}}} 
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        setReset();
        setVisible(false);
        OODJ_Assignment.second.getX().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

     private void setReset(){
     lbl00.setText("- - - - - - - - - - - - - - - - - - - - - - -");
     lbl0.setText("- - - - - - - - - - - - - - - - - - - - - - -");
     lbl1.setText("- - - - - - - - - - - - - - - - - - - - - - -");
     lbl2.setText("- - - - - - - - - - - - - - - - - - - - - - -");
     lbl3.setText("- - - - - - - - - - - - - - - - - - - - - - -");
     lbl4.setText("- - - - - - - - - - - - - - - - - - - - - - -");
     lbl5.setText("- - - - - - - - - - - - - - - - - - - - - - -");
     lbl6.setText("- - - - - - - - - - - - - - - - - - - - - - -");
     lbl7.setText("- - - - - - - - - - - - - - - - - - - - - - -");
     lbl8.setText("- - - - - - - - - - - - - - - - - - - - - - -");
     lbl9.setText("- - - - - - - - - - - - - - - - - - - - - - -");
     lbl10.setText("- - - - - - - - - - - - - - - - - - - - - - -");
     txtAppliance.setText("");
}
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
            java.util.logging.Logger.getLogger(AppointmentBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appliance;
    private javax.swing.JLabel SectionTitle;
    private javax.swing.JButton btnAdd1Day;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnResetDate;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbxTime;
    private javax.swing.JComboBox<String> cbxType;
    private javax.swing.JLabel lbl0;
    private javax.swing.JLabel lbl00;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblArriving;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblContact1;
    private javax.swing.JLabel lblContact2;
    private javax.swing.JLabel lblContact3;
    private javax.swing.JLabel lblContact4;
    private javax.swing.JLabel lblDeparture;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassportIC;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JTextField txtAppliance;
    private javax.swing.JTextField txtTechnician;
    // End of variables declaration//GEN-END:variables
private String id, input, name, gender, passportic, age,contact,email,arriving,departure, room, type, appliance
        , booking, estimate, time, tech;
private int result;
}
