/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestion_salarie;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class DisponibiliteSalarie extends javax.swing.JFrame {

    /**
     * Creates new form DisponibiliteSalarie
     */
    public DisponibiliteSalarie() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldIDsalarie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ModificationButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDateChooserDE_la_date = new com.toedter.calendar.JDateChooser();
        jDateChooserA_la_date = new com.toedter.calendar.JDateChooser();
        Etat_disponibilite = new javax.swing.JComboBox<>();
        HistoriqueButton = new javax.swing.JButton();
        Etat_actuelButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Disponibilite de salari??s");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID salari??", "Prenom", "Nom", "Etat", "De la date :", "?? la date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(55);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 540, 500));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setText("ID salari?? :");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 80, 30));

        jTextFieldIDsalarie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDsalarieActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldIDsalarie, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 200, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setText("Etat :");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 80, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setText("De la date :");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 80, 30));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel7.setText("?? la date :");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 80, 30));

        ModificationButton.setBackground(new java.awt.Color(102, 102, 102));
        ModificationButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ModificationButton.setText("Appliquer modification");
        ModificationButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificationButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ModificationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, 40));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Afficher les salari??s selon ??tat");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 220, 40));

        jDateChooserDE_la_date.setBackground(new java.awt.Color(204, 204, 204));
        jDateChooserDE_la_date.setDateFormatString("y MMM d");
        jPanel2.add(jDateChooserDE_la_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 200, 30));

        jDateChooserA_la_date.setBackground(new java.awt.Color(204, 204, 204));
        jDateChooserA_la_date.setDateFormatString("y MMM d");
        jPanel2.add(jDateChooserA_la_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 200, 30));

        Etat_disponibilite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aucune information", "En travail", "Cong??", "Malade", "Absent" }));
        Etat_disponibilite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Etat_disponibiliteActionPerformed(evt);
            }
        });
        jPanel2.add(Etat_disponibilite, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 200, 30));

        HistoriqueButton.setBackground(new java.awt.Color(102, 102, 102));
        HistoriqueButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        HistoriqueButton.setText("Historique");
        HistoriqueButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HistoriqueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoriqueButtonActionPerformed(evt);
            }
        });
        jPanel2.add(HistoriqueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 140, 40));

        Etat_actuelButton.setBackground(new java.awt.Color(102, 102, 102));
        Etat_actuelButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Etat_actuelButton.setText("Dernier modification");
        Etat_actuelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Etat_actuelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Etat_actuelButtonActionPerformed(evt);
            }
        });
        jPanel2.add(Etat_actuelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 130, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_salarie/steel_background_use_now_1000x500.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 500));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void AFFTousSelonetattable(JTable table){
        PreparedStatement prs;
        ResultSet rst;
        Connectiondb connect=new Connectiondb();
        String Etat_actuel=Etat_disponibilite.getSelectedItem().toString();
        
        String query="SELECT ID_salarie, prenom, nom,Etat_actuel, salarie.N_Etat FROM salarie,disponibilite_salaries WHERE Etat_actuel=? AND salarie.N_Etat=disponibilite_salaries.N_Etat;";
        try {
            prs=connect.connectdb().prepareStatement(query);
            prs.setString(1, Etat_actuel);
            rst=prs.executeQuery();
            DefaultTableModel tableMd=(DefaultTableModel)table.getModel();
            Object[] row;

            while(rst.next()){
                row=new Object[4];
                row[0]=rst.getInt(1);
                row[1]=rst.getString(2);
                row[2]=rst.getString(3);
                row[3]=rst.getString(4);
                //row[4]=rst.getDate(5);
                //row[5]=rst.getDate(6);
                tableMd.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModificationSalarie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
              
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        AFFTousSelonetattable(jTable1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ModificationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificationButtonActionPerformed
        PreparedStatement prs;
        ResultSet rst;
        Connectiondb connect=new Connectiondb();
        String IDsalarie=jTextFieldIDsalarie.getText();
        String query="SELECT `ID_salarie` FROM `salarie` WHERE ID_salarie=? ;";
        int i=0;
        try {
            
            prs=connect.connectdb().prepareStatement(query);
            prs.setString(1, IDsalarie);
            rst=prs.executeQuery();   
                String Etat_actuel=Etat_disponibilite.getSelectedItem().toString();
                switch(Etat_actuel){
                case "Aucune information" -> i=1;
                case "En travail" -> i=2;
                case "Cong??" -> i=3;
                case "Malade" -> i=4;
                case "Absent" -> i=5;
            }
               if(i!=0) {
                String query2="UPDATE `salarie` SET `N_Etat`=? WHERE ID_salarie=?";
                prs=connect.connectdb().prepareStatement(query2);
                prs.setInt(1, i);
                prs.setString(2,IDsalarie);
                prs.executeUpdate();
                
                String query3="INSERT INTO `date` (`date_debut`, `date_fin`) VALUES (?,?)";
                String Datedebut ="";
                String Datefin="";
                prs=connect.connectdb().prepareStatement(query3);
                if(jDateChooserDE_la_date.getDate()!= null )
               {  SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
                  Datedebut=date.format(jDateChooserDE_la_date.getDate());
                  prs.setString(1, Datedebut);
               }
                if(jDateChooserA_la_date.getDate()!= null)
                {
                  SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
                  Datefin=date.format(jDateChooserA_la_date.getDate());
                  prs.setString(2,Datefin);
                }
                if(jDateChooserDE_la_date.getDate()== null)
                {
                    prs.setDate(1, null);
                    
                }
                if(jDateChooserA_la_date.getDate()==null)
                {
                    prs.setDate(2, null);
                    
                }
                
                prs.executeUpdate();
                String id_date="";
                if(Datefin!="" && Datedebut!="")
                { String query4="SELECT ID_Date FROM date WHERE date_debut=? AND date_fin=?";
                prs=connect.connectdb().prepareStatement(query4);
                prs.setString(1, Datedebut);
                prs.setString(2, Datefin);
                rst=prs.executeQuery();
                
                if(rst.next())
                {
                    id_date=rst.getString(1);
                }
                }
                
                else if (Datefin=="")
               {
                String query4="SELECT ID_Date FROM date WHERE date_debut=?";
                prs=connect.connectdb().prepareStatement(query4);
                prs.setString(1, Datedebut);
                rst=prs.executeQuery();
                
                if(rst.next())
                {
                    id_date=rst.getString(1);
                }
                
               }
                else{
                    JOptionPane.showMessageDialog(rootPane, "vous devez entrer au moins la date de debut d'??tat !!!", "Erreur date !!", JOptionPane.WARNING_MESSAGE);
                }
                    
                // query to store
                if(id_date!=""){
                String query5="INSERT INTO `gerer_disponibilite` (`ID_salarie`, `N_etat_disponibilite`, `ID_date`) VALUES (?, ?, ?)";
                prs=connect.connectdb().prepareStatement(query5);
                prs.setString(1, IDsalarie);
                prs.setInt(2, i);
                prs.setString(3, id_date);
                if(prs.executeUpdate()>0){
                    JOptionPane.showMessageDialog(rootPane, "Modification appliquer","succ??s",JOptionPane.INFORMATION_MESSAGE);
                }
                }
             }
            
           // else{
            //   JOptionPane.showMessageDialog(rootPane, "Ce salari?? n'existe pas !!","Erreur",JOptionPane.ERROR_MESSAGE);
            //}
            
        } catch (SQLException ex) {
            Logger.getLogger(DisponibiliteSalarie.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //JOptionPane.showMessageDialog(rootPane, "Modification appliquer","succ??s",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ModificationButtonActionPerformed

    private void HistoriqueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoriqueButtonActionPerformed
        
        PreparedStatement prs;
        ResultSet rst;
        Connectiondb connect=new Connectiondb();
        String IDsalarie=jTextFieldIDsalarie.getText();
        
        String query="SELECT gerer_disponibilite.ID_salarie,prenom,nom,etat_actuel,date_debut,date_fin FROM gerer_disponibilite,salarie,disponibilite_salaries,date WHERE salarie.ID_salarie=? AND salarie.ID_salarie=gerer_disponibilite.ID_salarie AND gerer_disponibilite.N_etat_disponibilite=disponibilite_salaries.N_Etat AND gerer_disponibilite.ID_date=date.ID_date";
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try {
            prs=connect.connectdb().prepareStatement(query);
          
            prs.setString(1, IDsalarie);
            rst=prs.executeQuery();
            DefaultTableModel tableMd=(DefaultTableModel)jTable1.getModel();
            Object[] row;
            while(rst.next()) // cad si salarie existe
            {
            
                row=new Object[6];
                row[0]=rst.getInt(1);
                row[1]=rst.getString(2);
                row[2]=rst.getString(3);
                row[3]=rst.getString(4);
                row[4]=rst.getDate(5);
                row[5]=rst.getDate(6);
                tableMd.addRow(row);
              }
            
                
            
            //else{
             //  JOptionPane.showMessageDialog(rootPane, "Ce salari?? n'existe pas !!","Erreur",JOptionPane.ERROR_MESSAGE);

            //}
            
        } catch (SQLException ex) {
            Logger.getLogger(DisponibiliteSalarie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HistoriqueButtonActionPerformed

    private void jTextFieldIDsalarieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDsalarieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDsalarieActionPerformed

    private void Etat_disponibiliteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Etat_disponibiliteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Etat_disponibiliteActionPerformed

    private void Etat_actuelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Etat_actuelButtonActionPerformed
        PreparedStatement prs;
        ResultSet rst;
        Connectiondb connect=new Connectiondb();
        String IDsalarie=jTextFieldIDsalarie.getText();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        String query="SELECT gerer_disponibilite.ID_salarie,prenom,nom,etat_actuel,date_debut,date_fin FROM gerer_disponibilite,salarie,disponibilite_salaries,date WHERE gerer_disponibilite.ID_date=date.ID_date  AND salarie.N_Etat=disponibilite_salaries.N_Etat AND salarie.ID_salarie=? AND salarie.ID_salarie=gerer_disponibilite.ID_salarie AND gerer_disponibilite.N_etat_disponibilite=disponibilite_salaries.N_Etat  ORDER BY date.date_debut DESC;";
        
         try {
            prs=connect.connectdb().prepareStatement(query);
          
            prs.setString(1, IDsalarie);
            rst=prs.executeQuery();
            DefaultTableModel tableMd=(DefaultTableModel)jTable1.getModel();
            Object[] row;
            if(rst.next()) // cad si salarie existe
            {
            
                row=new Object[6];
                row[0]=rst.getInt(1);
                row[1]=rst.getString(2);
                row[2]=rst.getString(3);
                row[3]=rst.getString(4);
                row[4]=rst.getDate(5);
                row[5]=rst.getDate(6);
                tableMd.addRow(row);
              }
            
                
            
            //else{
             //  JOptionPane.showMessageDialog(rootPane, "Ce salari?? n'existe pas !!","Erreur",JOptionPane.ERROR_MESSAGE);

            //}
            
        } catch (SQLException ex) {
            Logger.getLogger(DisponibiliteSalarie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Etat_actuelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DisponibiliteSalarie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisponibiliteSalarie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisponibiliteSalarie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisponibiliteSalarie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisponibiliteSalarie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Etat_actuelButton;
    private javax.swing.JComboBox<String> Etat_disponibilite;
    private javax.swing.JButton HistoriqueButton;
    private javax.swing.JButton ModificationButton;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooserA_la_date;
    private com.toedter.calendar.JDateChooser jDateChooserDE_la_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldIDsalarie;
    // End of variables declaration//GEN-END:variables
}
