/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rent_car1;

import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.Period;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import static rent_car1.User.verificConectarea;

/**
 *
 * @author OZN cOxat
 */
public class Addadmin extends javax.swing.JFrame {

    /**
     * Creates new form Addadmin
     */
    public Addadmin() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Registerbut2 = new javax.swing.JButton();
        RegisterName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Registerbut = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        backbtn = new javax.swing.JButton();
        addangajat = new javax.swing.JButton();
        add_carsbutt = new javax.swing.JButton();
        actbuton3 = new javax.swing.JButton();
        Masini_disp_buton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 227, 241));
        jPanel1.setRequestFocusEnabled(false);

        jPanel2.setBackground(new java.awt.Color(180, 181, 181));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\OZN cOxat\\Documents\\faculta\\an 2\\pi\\rent_car1\\caricon.png")); // NOI18N
        jLabel2.setText("jLabel1");

        Registerbut2.setBackground(new java.awt.Color(162, 156, 241));
        Registerbut2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Registerbut2.setText("Retrogradare");
        Registerbut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registerbut2ActionPerformed(evt);
            }
        });

        RegisterName.setBackground(new java.awt.Color(180, 181, 181));
        RegisterName.setBorder(null);
        RegisterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Username");

        Registerbut.setBackground(new java.awt.Color(162, 156, 241));
        Registerbut.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Registerbut.setText("Promovare");
        Registerbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterbutActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(RegisterName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Registerbut, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Registerbut2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registerbut, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registerbut2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(410, Short.MAX_VALUE))
        );

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        addangajat.setBackground(new java.awt.Color(162, 156, 241));
        addangajat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addangajat.setText("Adaugare angajat nou ");
        addangajat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addangajatActionPerformed(evt);
            }
        });

        add_carsbutt.setBackground(new java.awt.Color(162, 156, 241));
        add_carsbutt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add_carsbutt.setText("Adaugare Masini");
        add_carsbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_carsbuttActionPerformed(evt);
            }
        });

        actbuton3.setBackground(new java.awt.Color(162, 156, 241));
        actbuton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        actbuton3.setText("Stergere Masini");
        actbuton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actbuton3ActionPerformed(evt);
            }
        });

        Masini_disp_buton.setBackground(new java.awt.Color(162, 156, 241));
        Masini_disp_buton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Masini_disp_buton.setText("Modificare Status");
        Masini_disp_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masini_disp_butonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(addangajat, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(add_carsbutt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(actbuton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Masini_disp_buton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(backbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(addangajat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add_carsbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(actbuton3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Masini_disp_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(backbtn)
                .addGap(276, 276, 276))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterNameActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterNameActionPerformed

    private void RegisterbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterbutActionPerformed
        // TODO add your handling code here:
        User utilizatori = new User();
        utilizatori.setUsername(RegisterName.getText());
        
        //utilizatori.setIsadmin(String.valueOf(registerRol.getText()));
        if(utilizatori.getUsername().isEmpty()){
            JOptionPane.showMessageDialog(this,"Toate camputile trebuie completate","Error",JOptionPane.ERROR_MESSAGE);

        }
        else
        {
          addadmin(utilizatori.getUsername());
        }
    }//GEN-LAST:event_RegisterbutActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:

        dispose();
        adminpage m = new adminpage();
        m.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void Registerbut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registerbut2ActionPerformed
        // TODO add your handling code here:
 User utilizatori = new User();
        utilizatori.setUsername(RegisterName.getText());
        
        //utilizatori.setIsadmin(String.valueOf(registerRol.getText()));
        if(utilizatori.getUsername().isEmpty()){
            JOptionPane.showMessageDialog(this,"Toate camputile trebuie completate","Error",JOptionPane.ERROR_MESSAGE);

        }
        else
        {
          retrogradare(utilizatori.getUsername());
        }

        
    }//GEN-LAST:event_Registerbut2ActionPerformed

    private void addangajatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addangajatActionPerformed
        // TODO add your handling code here:

        dispose();
        Register m = new Register();
        m.setVisible(true);

    }//GEN-LAST:event_addangajatActionPerformed

    private void add_carsbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_carsbuttActionPerformed
        // TODO add your handling code here:
        dispose();
        AdaugareMasini m = new AdaugareMasini();
        m.setVisible(true);
    }//GEN-LAST:event_add_carsbuttActionPerformed

    private void actbuton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actbuton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        Stergeremasini m = new Stergeremasini();
        m.setVisible(true);

    }//GEN-LAST:event_actbuton3ActionPerformed

    private void Masini_disp_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masini_disp_butonActionPerformed
        // TODO add your handling code here:
        dispose();
        Modificarestat m = new Modificarestat();
        m.setVisible(true);
    }//GEN-LAST:event_Masini_disp_butonActionPerformed

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
            java.util.logging.Logger.getLogger(Addadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Masini_disp_buton;
    private javax.swing.JTextField RegisterName;
    private javax.swing.JButton Registerbut;
    private javax.swing.JButton Registerbut2;
    private javax.swing.JButton actbuton3;
    private javax.swing.JButton add_carsbutt;
    private javax.swing.JButton addangajat;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
public void addadmin(String username)
{
Connection dbconn = DBConnection.connectDB();
if(dbconn != null)
{try{
    String verific = verificConectarea();

         
            
          
               
    
    
    
 PreparedStatement st=(PreparedStatement)
         dbconn.prepareStatement("SELECT username from useri WHERE  username= ? and username != ?");
            st.setString(1, username);
            st.setString(2,verific);
            ResultSet res= st.executeQuery();
               boolean ex = res.next();
               if(ex)
               {
               PreparedStatement st1=(PreparedStatement)
         dbconn.prepareStatement("UPDATE useri SET adminstat = 1 WHERE username = ?");
               st1.setString(1, username);
               st1.executeUpdate();
                  JOptionPane.showMessageDialog(this, "Userul a primit statusul de admin","Suces",JOptionPane.INFORMATION_MESSAGE);
               }
               else
               {
               JOptionPane.showMessageDialog(this, "Nu exista niciun utilizator cu acest user sau sunteti conectat cu acesta","ERROR",JOptionPane.INFORMATION_MESSAGE);
               }
    

    
    
    
}catch(SQLException ex){
   Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
    }

}
}
public void retrogradare(String username)
{
Connection dbconn = DBConnection.connectDB();
if(dbconn != null)
{try{
    String verific = verificConectarea();
    //PreparedStatement st11=(PreparedStatement)
         //dbconn.prepareStatement("SELECT username from useri WHERE  username= ? ");
           // st11.setString(1, verific);
            //ResultSet res11= st11.executeQuery();
             //  boolean ex1 = res11.next();
    
    
    
 PreparedStatement st=(PreparedStatement)
         dbconn.prepareStatement("SELECT username from useri WHERE  username= ? and username != ?");
            st.setString(1, username);
            st.setString(2,verific);
            ResultSet res= st.executeQuery();
               boolean ex = res.next();
               if(ex)
               {
               PreparedStatement st1=(PreparedStatement)
         dbconn.prepareStatement("UPDATE useri SET adminstat = 0 WHERE username = ?");
               st1.setString(1, username);
               st1.executeUpdate();
                  JOptionPane.showMessageDialog(this, "Userul a fost retrogradat","Suces",JOptionPane.INFORMATION_MESSAGE);
               }
               else
               {
               JOptionPane.showMessageDialog(this, "Nu exista niciun utilizator cu acest user sau sunteti conectat cu acest user","ERROR",JOptionPane.INFORMATION_MESSAGE);
               }
   // }
   // else
    //{
   // JOptionPane.showMessageDialog(this, "Nu puteti modifica rangul pentru ca sunteti conectat","ERROR",JOptionPane.INFORMATION_MESSAGE);
    //}
    
    
}catch(SQLException ex){
   Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
    }

}

}



}
