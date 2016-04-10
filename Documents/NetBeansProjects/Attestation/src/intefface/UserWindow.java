/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intefface;

import dao.DaoFactory;
import dao.entities.Group;
import dao.entities.LecturerWorkload;
import dao.entities.Subject;
import dao.entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author nastja
 */
public class UserWindow extends javax.swing.JFrame {
    User user;
    DaoFactory daoFactory;
    List<LecturerWorkload> lecturerWorkloads;
    List<Subject> subjects;
    List<Group> groups;
    
    public UserWindow(User user) {
        initComponents();
        this.user = user;
        daoFactory = DaoFactory.getInstance(DaoFactory.DaoType.ORACLE);
        labelWelcom.setText("Welcome, " + user.getName() + ".");
        lecturerWorkloads = daoFactory.createLecturerWorkloadDao().findWorkload(user);
        
        
        fillComboBoxSubj();
        
        fillComboBoxSubj();
    }
    /**
     * Creates new form UserWindow
     */
    public UserWindow() {
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

        labelWelcom = new javax.swing.JLabel();
        panelMesage = new javax.swing.JPanel();
        labelMessage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxSubject = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        buttonOK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboBoxGroup = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelWelcom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        panelMesage.setBackground(new java.awt.Color(244, 115, 84));

        labelMessage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Message");

        javax.swing.GroupLayout panelMesageLayout = new javax.swing.GroupLayout(panelMesage);
        panelMesage.setLayout(panelMesageLayout);
        panelMesageLayout.setHorizontalGroup(
            panelMesageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMesageLayout.createSequentialGroup()
                .addGroup(panelMesageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMesageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMesageLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelMesageLayout.setVerticalGroup(
            panelMesageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMesageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        comboBoxSubject.setBackground(new java.awt.Color(245, 134, 81));
        comboBoxSubject.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        comboBoxSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSubjectActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setText("Choose subject:");

        buttonOK.setBackground(new java.awt.Color(245, 134, 81));
        buttonOK.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        buttonOK.setText("OK");
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOKActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Choose group:");

        comboBoxGroup.setBackground(new java.awt.Color(245, 134, 81));
        comboBoxGroup.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        comboBoxGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxGroupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(labelWelcom, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxSubject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelMesage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelWelcom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMesage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonOK)))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxGroupActionPerformed

    private void comboBoxSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSubjectActionPerformed
        System.out.println("hey");
        fillComboBoxGroup();
    }//GEN-LAST:event_comboBoxSubjectActionPerformed

    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed
       String groupName = (String) comboBoxGroup.getSelectedItem();
       String subjName = (String) comboBoxSubject.getSelectedItem();
        for(LecturerWorkload l : lecturerWorkloads){
          if(l.getGroupCode().equals(groupName) && l.getNameSubject().equals(subjName)){
              JournalRateWindow journalRateWindow = new JournalRateWindow(l);
              journalRateWindow.setVisible(true);
          }  
        }
    }//GEN-LAST:event_buttonOKActionPerformed

    private void fillComboBoxSubj() {
        subjects = daoFactory.createLecturerWorkloadDao().
                findSubjList(user);
        String[] subjectsName = new String[subjects.size()];
             System.out.println(subjects.toString());
        for(int i = 0; i < subjects.size(); i++){
            subjectsName[i] = subjects.get(i).getName();
        }
        System.out.println(subjectsName.toString());
        comboBoxSubject.setModel(new DefaultComboBoxModel(subjectsName));
        comboBoxSubject.setSelectedIndex(0);
    }
    private void fillComboBoxGroup() {
        int subj = comboBoxSubject.getSelectedIndex();
        if(subj != -1){
            comboBoxGroup.removeAllItems();
             List<Group> group = daoFactory.createLecturerWorkloadDao().
                     findGroupList(user, subjects.get(subj));
             System.out.println(group.toString());
             String[] listGroupCode = new String[group.size()];
             for(int i = 0; i < group.size(); i++){
                listGroupCode[i] = group.get(i).getGroupCode();
            }
            comboBoxGroup.setModel(new DefaultComboBoxModel(listGroupCode));
            
        }
        
    }
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
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOK;
    private javax.swing.JComboBox comboBoxGroup;
    private javax.swing.JComboBox comboBoxSubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelMessage;
    private javax.swing.JLabel labelWelcom;
    private javax.swing.JPanel panelMesage;
    // End of variables declaration//GEN-END:variables


}