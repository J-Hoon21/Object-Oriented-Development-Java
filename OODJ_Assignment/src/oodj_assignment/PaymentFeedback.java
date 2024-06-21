package oodj_assignment;
import javax.swing.JOptionPane;
import java.time.LocalDate;
public class PaymentFeedback extends javax.swing.JFrame {
    public PaymentFeedback() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl2 = new javax.swing.JLabel();
        lbl0 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lblArriving = new javax.swing.JLabel();
        lblDeparture = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblRoom = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl00 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblPassportIC = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblID1 = new javax.swing.JLabel();
        Appliance = new javax.swing.JLabel();
        lblContact2 = new javax.swing.JLabel();
        lblContact1 = new javax.swing.JLabel();
        lblContact3 = new javax.swing.JLabel();
        lblContact4 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        lblContact5 = new javax.swing.JLabel();
        lblContact6 = new javax.swing.JLabel();
        lblContact7 = new javax.swing.JLabel();
        lblContact8 = new javax.swing.JLabel();
        lblContact9 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        txtfees1 = new javax.swing.JFormattedTextField();
        txtfees2 = new javax.swing.JFormattedTextField();
        lblContact10 = new javax.swing.JLabel();
        cbxPayMethod = new javax.swing.JComboBox<>();
        cbxRating = new javax.swing.JComboBox<>();
        lblContact11 = new javax.swing.JLabel();
        cbxPayStatus = new javax.swing.JComboBox<>();
        txtComment = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl2.setText("- - - - - - - - - - - - - - - - - - - - - - -");
        lbl2.setPreferredSize(new java.awt.Dimension(202, 17));

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

        lblArriving.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblArriving.setText("Arriving Date");

        lblDeparture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDeparture.setText("Departure Date");

        lblID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblID.setText("ID");

        lblRoom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRoom.setText("Room Number");

        lbl8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl8.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        lbl00.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl00.setText("- - - - - - - - - - - - - - - - - - - - - - -");
        lbl00.setPreferredSize(new java.awt.Dimension(202, 17));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setText("Name");

        lblGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGender.setText("Gender");

        lblPassportIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPassportIC.setText("Passport/ IC Number");

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl1.setText("- - - - - - - - - - - - - - - - - - - - - - -");
        lbl1.setPreferredSize(new java.awt.Dimension(202, 17));

        lblContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact.setText("Contact Number");

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        lblAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAge.setText("Age");

        lblID1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblID1.setText("Type");

        Appliance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Appliance.setText("Appliance");

        lblContact2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact2.setText("Booking Date");

        lblContact1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact1.setText("Estimate Date");

        lblContact3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact3.setText("Time");

        lblContact4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact4.setText("Technician");

        lbl9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl9.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        lbl10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl10.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        lbl11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl11.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        lbl12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl12.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        lbl13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl13.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        lbl14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl14.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

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

        lblContact5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact5.setText("Payment Date");

        lblContact6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact6.setText("Material Fees");

        lblContact7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact7.setText("Repair Fees");

        lblContact8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact8.setText("Feedback Rating");

        lblContact9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact9.setText("Feedback Comment");

        lbl15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl15.setText("- - - - - - - - - - - - - - - - - - - - - - -");

        txtfees1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));

        txtfees2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));

        lblContact10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact10.setText("Payment Method");

        cbxPayMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banking", "Cash", "Other" }));

        cbxRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5 - Very Good", "4 - Good", "3 - Moderate", "2 - Poor", "1 - Very Poor" }));

        lblContact11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContact11.setText("Payment Status");

        cbxPayStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paid", "Not Paid" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRoom)
                            .addComponent(lblDeparture)
                            .addComponent(lblArriving)
                            .addComponent(lblEmail)
                            .addComponent(lblContact)
                            .addComponent(lblPassportIC)
                            .addComponent(lblGender)
                            .addComponent(lblName)
                            .addComponent(lblAge)
                            .addComponent(lblID))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl8)
                                .addComponent(lbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl00, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl0, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContact4)
                            .addComponent(lblContact2)
                            .addComponent(lblContact3)
                            .addComponent(lblID1)
                            .addComponent(lblContact1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl10)
                                    .addComponent(lbl9))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Appliance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnSearch)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lblContact8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbxRating, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(lblContact5)
                                                        .addGap(47, 47, 47))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblContact6)
                                                            .addComponent(lblContact11)
                                                            .addComponent(lblContact7)
                                                            .addComponent(lblContact10))
                                                        .addGap(30, 30, 30)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbxPayStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lbl15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cbxPayMethod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtfees1)
                                                        .addComponent(txtfees2))))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(lblContact9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtComment)))
                                .addGap(31, 31, 31))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirm)
                        .addGap(181, 181, 181))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addGap(18, 18, 18)
                                .addComponent(lblName)
                                .addGap(18, 18, 18)
                                .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPassportIC, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblContact)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmail)
                                .addGap(18, 18, 18)
                                .addComponent(lblArriving)
                                .addGap(18, 18, 18)
                                .addComponent(lblDeparture)
                                .addGap(18, 18, 18)
                                .addComponent(lblRoom))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSearch))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(lbl0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl4)
                                .addGap(18, 18, 18)
                                .addComponent(lbl5)
                                .addGap(18, 18, 18)
                                .addComponent(lbl6)
                                .addGap(18, 18, 18)
                                .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 205, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblContact2)
                                    .addComponent(lbl9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblContact1)
                                    .addComponent(lbl10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblID1)
                                    .addComponent(lbl11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Appliance)
                                    .addComponent(lbl12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblContact3)
                                    .addComponent(lbl13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblContact4)
                                    .addComponent(lbl14))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblContact5)
                                    .addComponent(lbl15))
                                .addGap(18, 18, 18)
                                .addComponent(lblContact6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtfees1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContact7)
                            .addComponent(txtfees2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblContact10)
                                    .addComponent(cbxPayMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbxPayStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblContact11))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContact8)
                            .addComponent(cbxRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContact9)
                            .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String input = JOptionPane.showInputDialog("Enter Customer ID:");
        Appointment found = CustomerIO.checking2(input);
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
            lbl9.setText(found.getBooking());
            lbl10.setText(found.getEstimate());
            lbl11.setText(found.getType());
            lbl12.setText(found.getAppliance());
            lbl13.setText(found.getTime());
            lbl14.setText(found.getTech());
            LocalDate currentDate = LocalDate.now(); // Get current Date value
            lbl15.setText(currentDate.toString());
        }
        else {
            JOptionPane.showMessageDialog(null, "ID not found, Please Try Again!");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        setVisible(false);
        new TechAppointmentView().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
        type = lbl11.getText();
        appliance = lbl12.getText();
        booking = lbl9.getText();
        estimate = lbl10.getText();
        time = lbl13.getText();
        tech = lbl14.getText();
        date = lbl15.getText();
        fees1 = txtfees1.getText();
        fees2 = txtfees2.getText();
        method = cbxPayMethod.getSelectedItem().toString();
        status = cbxPayStatus.getSelectedItem().toString();
        rating = cbxRating.getSelectedItem().toString();
        comment = txtComment.getText();
        if(name.equals("- - - - - - - - - - - - - - - - - - - - - - -") || fees1.equals("") || fees2.equals("")||
           comment.equals("")){
        JOptionPane.showMessageDialog(null, "Incomplete Data Entry!!");  
        }
        else{result = JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Make Payment? "
               + "(This action cannot be undone!)", "Submit Payment", JOptionPane.ERROR_MESSAGE);
               if (result == JOptionPane.YES_OPTION) {
        
        Appointment found = CustomerIO.checking2(id);
        if(found != null){
            // save to appointment history
            AppointmentHistory ah = new AppointmentHistory(id,name,gender, age, passportic, contact, email, arriving, departure, 
                        room, type, appliance, booking, estimate, time, tech);
                CustomerIO.allHistory.add(ah);
                CustomerIO.historywrite();;
            // save to payment feedback
                PaymentandFeedback pay = new PaymentandFeedback(id,name,gender, age, passportic, contact, email, type, appliance, tech,
                date, fees1, fees2, method, status, rating, comment);
                CustomerIO.allPayment.add(pay);
                CustomerIO.historywrite();;
            // clear current appointment
        found.setID("-");
        found.setName("-");
        found.setGender("-");
        found.setAge("-");
        found.setPassportIC("-");
        found.setContact("-");
        found.setEmail("-");
        found.setArriving("-");
        found.setDeparture("-");
        found.setRoomNumber("-");
        found.setType("-");
        found.setAppliance("-");
        found.setBooking("-");
        found.setEstimate("-");
        found.setTime("-");
        found.setTech("-");
        CustomerIO.write();
        JOptionPane.showMessageDialog(this,"Payment Update Successful!!");
        setReset();
            }else {JOptionPane.showMessageDialog(null, "Something when wrong, please check your appointment!!");
        }}}
       
    }//GEN-LAST:event_btnConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentFeedback().setVisible(true);
            }
        });
    }
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
            lbl11.setText("- - - - - - - - - - - - - - - - - - - - - - -");
            lbl12.setText("- - - - - - - - - - - - - - - - - - - - - - -");
            lbl13.setText("- - - - - - - - - - - - - - - - - - - - - - -");
            lbl14.setText("- - - - - - - - - - - - - - - - - - - - - - -");
            lbl15.setText("- - - - - - - - - - - - - - - - - - - - - - -");
            txtfees1.setText("");
            txtfees2.setText("");
            txtComment.setText("");
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appliance;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbxPayMethod;
    private javax.swing.JComboBox<String> cbxPayStatus;
    private javax.swing.JComboBox<String> cbxRating;
    private javax.swing.JLabel lbl0;
    private javax.swing.JLabel lbl00;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
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
    private javax.swing.JLabel lblContact10;
    private javax.swing.JLabel lblContact11;
    private javax.swing.JLabel lblContact2;
    private javax.swing.JLabel lblContact3;
    private javax.swing.JLabel lblContact4;
    private javax.swing.JLabel lblContact5;
    private javax.swing.JLabel lblContact6;
    private javax.swing.JLabel lblContact7;
    private javax.swing.JLabel lblContact8;
    private javax.swing.JLabel lblContact9;
    private javax.swing.JLabel lblDeparture;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassportIC;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JTextField txtComment;
    private javax.swing.JFormattedTextField txtfees1;
    private javax.swing.JFormattedTextField txtfees2;
    // End of variables declaration//GEN-END:variables
private String id, name, gender, passportic, age,contact,email,arriving,departure, room, type, appliance
        , booking, estimate, time, tech, date, fees1, fees2, method, status, rating, comment;
private int result;
}
