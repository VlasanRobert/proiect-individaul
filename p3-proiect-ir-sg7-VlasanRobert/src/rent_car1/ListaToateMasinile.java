/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rent_car1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static rent_car1.Mainpage.emailsend;

/**
 *
 * @author OZN cOxat
 */
public class ListaToateMasinile extends javax.swing.JFrame {

    /**
     * Creates new form ListaToateMasinile
     */
    public ListaToateMasinile() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        afisare_buton = new javax.swing.JButton();
        backbt = new javax.swing.JButton();
        addclientlb = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Dealocarebt = new javax.swing.JButton();
        Dealocarebt1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        displb = new javax.swing.JButton();
        schimblb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 227, 241));

        jPanel2.setBackground(new java.awt.Color(180, 181, 181));

        jTable1.setForeground(new java.awt.Color(153, 153, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Marca", "Model", "An fabricatie", "Numar de inmatiruclare"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\OZN cOxat\\Documents\\faculta\\an 2\\pi\\rent_car1\\caricon.png")); // NOI18N
        jLabel2.setText("jLabel1");

        afisare_buton.setBackground(new java.awt.Color(162, 156, 241));
        afisare_buton.setText("Afisati Masini");
        afisare_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afisare_butonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(afisare_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(afisare_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backbt.setText("Back");
        backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtActionPerformed(evt);
            }
        });

        addclientlb.setBackground(new java.awt.Color(162, 156, 241));
        addclientlb.setText("Adaugare client nou");
        addclientlb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addclientlbActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(162, 156, 241));
        jButton3.setText("Notificare clienti");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Dealocarebt.setBackground(new java.awt.Color(162, 156, 241));
        Dealocarebt.setText("Returnare");
        Dealocarebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DealocarebtActionPerformed(evt);
            }
        });

        Dealocarebt1.setBackground(new java.awt.Color(162, 156, 241));
        Dealocarebt1.setText("Norificare automata pentru returnare");
        Dealocarebt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dealocarebt1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(162, 156, 241));
        jButton1.setText("Lista Clientilor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        displb.setBackground(new java.awt.Color(162, 156, 241));
        displb.setText("Lista masini disponibile");
        displb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displbActionPerformed(evt);
            }
        });

        schimblb.setBackground(new java.awt.Color(162, 156, 241));
        schimblb.setText("Schimba masina");
        schimblb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schimblbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backbt)
                    .addComponent(addclientlb, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dealocarebt, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dealocarebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displb, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schimblb, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addclientlb, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Dealocarebt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Dealocarebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displb, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(schimblb, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(backbt)
                .addGap(15, 15, 15))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtActionPerformed

        dispose();
        Mainpage m = new Mainpage();
        m.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_backbtActionPerformed

    private void afisare_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afisare_butonActionPerformed
       
        // TODO add your handling code here:

        
        
        afis();
    }//GEN-LAST:event_afisare_butonActionPerformed

    private void addclientlbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addclientlbActionPerformed
        // TODO add your handling code here:
        dispose();
        adaugareclienti m = new adaugareclienti();
        m.setVisible(true);
    }//GEN-LAST:event_addclientlbActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        Send m = new Send();
        m.setVisible(true);
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton3ActionPerformed

    private void DealocarebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DealocarebtActionPerformed
        // TODO add your handling code here:
        dispose();
        Returnare m= new Returnare();
        m.setVisible(true);
    }//GEN-LAST:event_DealocarebtActionPerformed

    private void Dealocarebt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dealocarebt1ActionPerformed
        // TODO add your handling code here:
        sendauto();
    }//GEN-LAST:event_Dealocarebt1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        MeniuClienti m = new MeniuClienti();
        m.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void displbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displbActionPerformed
        // TODO add your handling code here:
        dispose();
        Lista_disponibil m = new Lista_disponibil();
        m.setVisible(true);

    }//GEN-LAST:event_displbActionPerformed

    private void schimblbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schimblbActionPerformed

        // TODO add your handling code here:
        dispose();
        Schimbare_masina m = new Schimbare_masina();
        m.setVisible(true);

    }//GEN-LAST:event_schimblbActionPerformed

    /**
     * 
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
            java.util.logging.Logger.getLogger(ListaToateMasinile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaToateMasinile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaToateMasinile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaToateMasinile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaToateMasinile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Dealocarebt;
    public javax.swing.JButton Dealocarebt1;
    private javax.swing.JButton addclientlb;
    private javax.swing.JButton afisare_buton;
    private javax.swing.JButton backbt;
    private javax.swing.JButton displb;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JButton schimblb;
    // End of variables declaration//GEN-END:variables
public void afis(){
    Connection dbconn = DBConnection.connectDB();
    if(dbconn != null){
    try{
    PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("select * from masini");   
            
            
            ResultSet res = st.executeQuery();
            while(res.next())
            {
            String nume = res.getString("marca");
            String prenume = res.getString("model");
            String email = res.getString("an");
            String data_retur = res.getString("inma");
            
            //String array
            String tbDta[] = {nume,prenume,email,data_retur};
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            //add string array data into jtbale
            tblModel.addRow((tbDta));
            
            }
          
                JOptionPane.showMessageDialog(this, "Datele despre clienti au fost afisate cu succes ","Suces",JOptionPane.INFORMATION_MESSAGE);
    
    }catch(SQLException ex){
   Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}}


StringBuilder email = new StringBuilder();
             StringBuilder data_retur = new StringBuilder();
             StringBuilder numar_inmatriculare = new StringBuilder();
             ArrayList<String> lista = new ArrayList<>();
public void sendauto()
   {         
   Connection dbconn = DBConnection.connectDB();
    if(dbconn != null){
    try{
    PreparedStatement st=(PreparedStatement)
                    dbconn.prepareStatement("SELECT * FROM clienti WHERE DATEDIFF(CURDATE(),dataretur) < 2 and CURDATE() < dataretur ");   
            
             
    
            ResultSet res = st.executeQuery();
             
            while(res.next())
            {
            String nume = res.getString("nume");
            String prenume = res.getString("prenume");
             email.append(res.getString("email"));
             email.append(" ");
             data_retur.append(res.getString("dataretur"));
             data_retur.append(" ");
             numar_inmatriculare.append(res.getString("inma"));
             numar_inmatriculare.append(" ");
             }
             String a1 = email.toString();
String[] elements = a1.split(" ");
List<String> list = new ArrayList<>();
list.addAll(Arrays.asList(elements));
for(String i : list)
{
emailsend1(i);
}


            
            
            
            //emailsend(email,data_retur,numar_inmatriculare);
   
   
}catch(SQLException ex){
   Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

   }


public static void emailsend1(String mail) {
        // Set system properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Create a session
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("vlasancosmi@gmail.com", "lkfd avol tjzi dbyb");
                    }
                });

        try {
            // Create a message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("vlasancosmi@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(mail));
            message.setSubject("Returnare masina");
            message.setText("Buna ziua va reamintim ca va trebuii sa returnati masina incurand.\n"+"O zi buna ");

            // Send the message
            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
