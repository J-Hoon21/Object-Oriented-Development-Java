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
public class AppointmentView extends javax.swing.JFrame {
    public AppointmentView() {
        initComponents();
        Edit.setEnabled(false);
        Delete.setEnabled(false);
        Save.setEnabled(false);
        DeleteSelectedRow.setEnabled(false);
        Search.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        AppointmentTable = new javax.swing.JTable();
        Refresh = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        SearchFilter = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Return = new javax.swing.JButton();
        DeleteSelectedRow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AppointmentTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Age", "Passport/IC", "Contact", "Email", "Arriving Date", "Departure Date", "Room", "Type", "Appliance", "Booking Date", "Estimate Date", "Time", "Technician"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AppointmentTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(AppointmentTable);

        Refresh.setText("Refresh Table");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        Save.setText("Save Changes");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Edit.setText("Edit Appoinment");
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

        Delete.setText("Delete Appoinment");
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

        DeleteSelectedRow.setText("Delete Selected Row");
        DeleteSelectedRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSelectedRowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Return, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(Refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteSelectedRow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72)
                .addComponent(SearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(321, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit)
                    .addComponent(Search)
                    .addComponent(SearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Delete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Return)
                    .addComponent(DeleteSelectedRow))
                .addGap(24, 24, 24))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(159, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        File file = new File("appointment.txt");
        try {
            BufferedReader br = new BufferedReader (new FileReader(file));
            //Get table model
            //Clear any sort
            DefaultTableModel model = (DefaultTableModel)AppointmentTable.getModel();
            final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model); // Sort The table
            AppointmentTable.setRowSorter(sorter);
            sorter.setRowFilter(null);
            Edit.setEnabled(true);
            Delete.setEnabled(true);
            Save.setEnabled(true);
            DeleteSelectedRow.setEnabled(true);
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
            JOptionPane.showMessageDialog(null, "Appointment list failed to retrieve");
        }
    }//GEN-LAST:event_RefreshActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
     {result = JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Save Changes? (This action cannot be undone!)"
                , "Update Appointment Changes", JOptionPane.ERROR_MESSAGE);
     if (result == JOptionPane.YES_OPTION) {
        File file = new File("appointment.txt");
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int row = 0; row < AppointmentTable.getRowCount(); row++) {
        for(int column = 0; column < AppointmentTable.getColumnCount(); column++) {
             bw.write(AppointmentTable.getValueAt(row, column).toString()+":");
             
        }bw.newLine();
            }
            bw.close();
            fw.close();
                } catch(Exception e){
            System.out.println("Error in table write method ...");
        }
     }}
    }//GEN-LAST:event_SaveActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
       setVisible(false);
       new AppointmentEdit().setVisible(true);
    }//GEN-LAST:event_EditActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel)AppointmentTable.getModel(); // Get the table model
            final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model); // Sort The table
            AppointmentTable.setRowSorter(sorter);
            String text = SearchFilter.getText(); // Get specific keywords
            if (text.length() == 0) {
                sorter.setRowFilter(null); // If no type any things, display all results
                Edit.setEnabled(true);
                Delete.setEnabled(true);
                Save.setEnabled(true);
                DeleteSelectedRow.setEnabled(true);
            } else {
                sorter.setRowFilter(RowFilter.regexFilter(text)); // If got result display that line
                 Edit.setEnabled(false);
                 Delete.setEnabled(false);
                 Save.setEnabled(false);
                 DeleteSelectedRow.setEnabled(false);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       String input = JOptionPane.showInputDialog("Enter customer ID:");
       Appointment found2 = CustomerIO.checking2(input);
        if(found2 == null){
            JOptionPane.showMessageDialog(null, "ID not found!");
        }
        else
        {result = JOptionPane.showConfirmDialog(this, "Are You Sure You Want Delete Appointment Records? (This action cannot be undone!)"
            , "Update Departure record", JOptionPane.ERROR_MESSAGE);
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
        found2.setType("-");
        found2.setAppliance("-");
        found2.setBooking("-");
        found2.setEstimate("-");
        found2.setTime("-");
        found2.setTech("-");
       DefaultTableModel model = (DefaultTableModel)AppointmentTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
        if (((String)model.getValueAt(i, 0)).equals(input)) {
            model.removeRow(i);
            File file = new File("appointment.txt");
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int row = 0; row < AppointmentTable.getRowCount(); row++) {
        for(int column = 0; column < AppointmentTable.getColumnCount(); column++) {
             bw.write(AppointmentTable.getValueAt(row, column).toString()+":");
             
        }bw.newLine();
            }
            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(this, "Delete Successful!");
                } catch(Exception e){
            System.out.println("Error in table write method ...");
        }
        }
     }}}
    }//GEN-LAST:event_DeleteActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        setVisible(false);
        OODJ_Assignment.second.getX().setVisible(true);
    }//GEN-LAST:event_ReturnActionPerformed

    private void DeleteSelectedRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSelectedRowActionPerformed
         DefaultTableModel model = (DefaultTableModel) AppointmentTable.getModel();
        int[] selectedRows = AppointmentTable.getSelectedRows();
        if (selectedRows.length > 0) {
            for (int i = selectedRows.length - 1; i >= 0; i--) {
                model.removeRow(selectedRows[i]);
            }
        }
    }//GEN-LAST:event_DeleteSelectedRowActionPerformed

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
            java.util.logging.Logger.getLogger(AppointmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppointmentTable;
    private javax.swing.JButton Delete;
    private javax.swing.JButton DeleteSelectedRow;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Return;
    private javax.swing.JButton Save;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchFilter;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private int result;
}
