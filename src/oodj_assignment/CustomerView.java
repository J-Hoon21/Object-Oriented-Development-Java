package oodj_assignment;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.time.LocalDate;
public class CustomerView extends javax.swing.JFrame {
    public CustomerView() {
        initComponents();
        Edit.setEnabled(false);
        Delete.setEnabled(false);
        Departure.setEnabled(false);
        Search.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        Delete = new javax.swing.JButton();
        Return = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        SearchFilter = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Departure = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CustomerTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Age", "Passport/IC", "Contact", "Email", "Arriving Date", "Departure Date", "Room"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CustomerTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(CustomerTable);

        Delete.setText("Delete Customer");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Return.setText("Return");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        Refresh.setText("Refresh Table");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        Edit.setText("Edit Customer");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Departure.setText("Departure");
        Departure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartureActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("*Please ensure all payment has been settle before departure*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Refresh, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addGap(72, 72, 72)
                .addComponent(SearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Departure, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(343, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit)
                    .addComponent(Search)
                    .addComponent(SearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete)
                    .addComponent(Departure)
                    .addComponent(Return))
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addGap(55, 55, 55))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(216, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String input = JOptionPane.showInputDialog("Enter customer ID:");
        Appointment found = CustomerIO.checking2(input);
        Customer found2 = CustomerIO.checking(input);
        if(found != null){
        JOptionPane.showMessageDialog(null, "Alert!! This customer has made an appointment!!");
        }
        else if(found2 == null){
        JOptionPane.showMessageDialog(null, "Customer ID not found!!");
        }
        else {
        {result = JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Make Changes? "
               ,"Delete Customer Profile", JOptionPane.ERROR_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    found2.setID("-");
                    found2.setName("-");
                    found2.setGender("-");
                    found2.setAge("-");
                    found2.setPassportIC("-");
                    found2.setContact("-");
                    found2.setEmail("-");
                    found2.setArriving("-");
                    found2.setDeparture("-");
                    found2.setRoomNumber("-");
        DefaultTableModel model = (DefaultTableModel)CustomerTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if (((String)model.getValueAt(i, 0)).equals(input)) {
                model.removeRow(i);
                File file = new File("customer.txt");
            try{
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for(int row = 0; row < CustomerTable.getRowCount(); row++) {
                    for(int column = 0; column < CustomerTable.getColumnCount(); column++) {
                        bw.write(CustomerTable.getValueAt(row, column).toString()+":");

                    }bw.newLine();
                }
                bw.close();
                fw.close();
                JOptionPane.showMessageDialog(this, "Delete Successful!");
            } catch(Exception e){
                System.out.println("Error in table write method ...");
            }
            }}}}}
    }//GEN-LAST:event_DeleteActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        setVisible(false);
        OODJ_Assignment.second.getX().setVisible(true);
    }//GEN-LAST:event_ReturnActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        File file = new File("customer.txt");
        try {
            BufferedReader br = new BufferedReader (new FileReader(file));
            //Get table model
            //Clear any sort
            DefaultTableModel model = (DefaultTableModel)CustomerTable.getModel();
            final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model); // Sort The table
            CustomerTable.setRowSorter(sorter);
            sorter.setRowFilter(null);
            Edit.setEnabled(true);
            Delete.setEnabled(true);
            Departure.setEnabled(true);
            Search.setEnabled(true);
            // get lines from txt file
            Object[] tableLines = br.lines().toArray();
            model.setRowCount(0);

            // extratct data from lines
            // set data to jtable model
            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim();
                String[] details = line.split(":");
                model.addRow(details);
            }
        }
        catch (FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Customer list failed to retrieve");
        }
    }//GEN-LAST:event_RefreshActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        setVisible(false);
        new CustomerEdit().setVisible(true);
    }//GEN-LAST:event_EditActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel)CustomerTable.getModel(); // Get the table model
            final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model); // Sort The table
            CustomerTable.setRowSorter(sorter);
            String text = SearchFilter.getText(); // Get specific keywords
            if (text.length() == 0) {
                sorter.setRowFilter(null); // If no type any things, display all results
                Edit.setEnabled(true);
                Delete.setEnabled(true);
                Departure.setEnabled(true);
            } else {
                sorter.setRowFilter(RowFilter.regexFilter(text)); // If got result display that line
                Edit.setEnabled(false);
                Delete.setEnabled(false);
                Departure.setEnabled(false);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void DepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartureActionPerformed
      String input = JOptionPane.showInputDialog("Enter customer ID:");
        LocalDate currentDate = LocalDate.now(); // Get current Date value
        date = currentDate.toString();
        Customer found = CustomerIO.checking(input);
        if(found != null && found.getDeparture().equals(date)){ 
            Appointment found2 = CustomerIO.checking2(input);
            if(found2 == null){ 
              PaymentandFeedback found3 = CustomerIO.checking5(input);
              if(found3 == null || found3 != null && found3.getStatus().equals("Paid")){
               {result = JOptionPane.showConfirmDialog(this, "Are You Sure You Want Update Departure Records? (This action cannot be undone!)"
            , "Update Departure record", JOptionPane.ERROR_MESSAGE);
              if (result == JOptionPane.YES_OPTION) {
                id = found.getID();
                name = found.getName();
                gender = found.getGender();
                age = found.getAge();
                passportic = found.getPassportIC();
                contact = found.getContact();
                email = found.getEmail();
                arriving = found.getArriving();
                departure = found.getDeparture();
                room = found.getRoomNumber();
                Departure Dep = new Departure(id,name,gender,age,passportic,contact,email,arriving,departure,room);
                CustomerIO.allDeparture.add(Dep);
                CustomerIO.historywrite();;
                JOptionPane.showMessageDialog(this, "Departure Successful!");
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
                DefaultTableModel model = (DefaultTableModel)CustomerTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if (((String)model.getValueAt(i, 0)).equals(input)) {
                model.removeRow(i);
                File file = new File("customer.txt");
            try{
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for(int row = 0; row < CustomerTable.getRowCount(); row++) {
                    for(int column = 0; column < CustomerTable.getColumnCount(); column++) {
                        bw.write(CustomerTable.getValueAt(row, column).toString()+":");

                    }bw.newLine();
                }
                bw.close();
                fw.close();
                      } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        } }}}}}else {
                  JOptionPane.showMessageDialog(null, "This Customer Has Unpaid Payment!");
              }
        } else {
                  JOptionPane.showMessageDialog(null, "This Customer Has Appointment!");
              }
        }else {
                  JOptionPane.showMessageDialog(null, "Today Is Not The Departure Date, Please Check Your Departure Date!");
              }
    }//GEN-LAST:event_DepartureActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerTable;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Departure;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Return;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchFilter;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private String id,name,gender,age,passportic,contact,email,arriving,departure,room, date;
    private int result;
}
