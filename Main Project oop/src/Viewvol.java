/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tawfek
 */
import Classes.*;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class Viewvol extends javax.swing.JFrame {
    String a;
    /**
     * Creates new form Viewvol
     */
    public Viewvol(){
        initComponents();
        
                    inspec a;
    try {
        a = new inspec();
        a.LoadviolationCurrentList();
      DefaultTableModel model=(DefaultTableModel) viol.getModel();
           Object rowdata[]=new Object[7];
           for(Map.Entry k:a.Old_build .entrySet()){
               String key = k.getKey().toString();
              Vector v1=(Vector)k.getValue();    
          rowdata[0]=key;
          rowdata[1]=v1.get(0);
          rowdata[2]=v1.get(1);
          rowdata[3]=v1.get(2);
          rowdata[4]=v1.get(3);  
                if(v1.size()==4){ rowdata[5]="NULL";
          rowdata[6]="NULL";}
                else if(v1.size()==5){ rowdata[5]=v1.get(4);rowdata[6]="NULL";} 
                else {
                    rowdata[5]=v1.get(4);rowdata[6]=v1.get(5);
                }
                model.addRow(rowdata);
        
    }
    } catch (Exception ex) {
        Logger.getLogger(View_user.class.getName()).log(Level.SEVERE, null, ex);
    }
    //////////////////////////////////////////////////
                inspec c;
    try {
        c = new inspec();
        c.LoadviolationAppointmentList();
      DefaultTableModel model=(DefaultTableModel) viol1.getModel();
           Object rowdata[]=new Object[7];
           for(Map.Entry k:c.timed_vio .entrySet()){
               String key = k.getKey().toString();
              Vector v1=(Vector)k.getValue();    
          rowdata[0]=key;
          rowdata[1]=v1.get(0);
          rowdata[2]=v1.get(1);
          rowdata[3]=v1.get(2);
          rowdata[4]=v1.get(3);  
                if(v1.size()==4){ rowdata[5]="NULL";
          rowdata[6]="NULL";}
                else if(v1.size()==5){ rowdata[5]=v1.get(4);rowdata[6]="NULL";} 
                else {
                    rowdata[5]=v1.get(4);rowdata[6]=v1.get(5);
                }
                model.addRow(rowdata);
        
    }
    } catch (Exception ex) {
        Logger.getLogger(View_user.class.getName()).log(Level.SEVERE, null, ex);
    }
    ////////////////////////////////////////////
                inspec b;
    try {
        b = new inspec();
        b.LoadviolationFinnishedList();
      DefaultTableModel model=(DefaultTableModel) viol2.getModel();
           Object rowdata[]=new Object[7];
           for(Map.Entry k:b.finished_violation .entrySet()){
               String key = k.getKey().toString();
              Vector v1=(Vector)k.getValue();    
          rowdata[0]=key;
          rowdata[1]=v1.get(0);
          rowdata[2]=v1.get(1);
          rowdata[3]=v1.get(2);
          rowdata[4]=v1.get(3);  
                if(v1.size()==4){ rowdata[5]="NULL";
          rowdata[6]="NULL";}
                else if(v1.size()==5){ rowdata[5]=v1.get(4);rowdata[6]="NULL";} 
                else {
                    rowdata[5]=v1.get(4);rowdata[6]=v1.get(5);
                }
                model.addRow(rowdata);
        
    }
    } catch (Exception ex) {
        Logger.getLogger(View_user.class.getName()).log(Level.SEVERE, null, ex);
    }
     viol.enableInputMethods(false);
       viol1.enableInputMethods(false);
         viol2.enableInputMethods(false);
    }
        public Viewvol(String s) {
               initComponents();
        
                    inspec f;
    try {
        f = new inspec();
        f.LoadviolationCurrentList();
      DefaultTableModel model=(DefaultTableModel) viol.getModel();
           Object rowdata[]=new Object[7];
           for(Map.Entry k:f.Old_build .entrySet()){
               String key = k.getKey().toString();
              Vector v1=(Vector)k.getValue();    
          rowdata[0]=key;
          rowdata[1]=v1.get(0);
          rowdata[2]=v1.get(1);
          rowdata[3]=v1.get(2);
          rowdata[4]=v1.get(3);  
                if(v1.size()==4){ rowdata[5]="NULL";
          rowdata[6]="NULL";}
                else if(v1.size()==5){ rowdata[5]=v1.get(4);rowdata[6]="NULL";} 
                else {
                    rowdata[5]=v1.get(4);rowdata[6]=v1.get(5);
                }
                model.addRow(rowdata);
        
    }
    } catch (Exception ex) {
        Logger.getLogger(View_user.class.getName()).log(Level.SEVERE, null, ex);
    }
    //////////////////////////////////////////////////
                inspec c;
    try {
        c = new inspec();
        c.LoadviolationAppointmentList();
      DefaultTableModel model=(DefaultTableModel) viol1.getModel();
           Object rowdata[]=new Object[7];
           for(Map.Entry k:c.timed_vio .entrySet()){
               String key = k.getKey().toString();
              Vector v1=(Vector)k.getValue();    
          rowdata[0]=key;
          rowdata[1]=v1.get(0);
          rowdata[2]=v1.get(1);
          rowdata[3]=v1.get(2);
          rowdata[4]=v1.get(3);  
                if(v1.size()==4){ rowdata[5]="NULL";
          rowdata[6]="NULL";}
                else if(v1.size()==5){ rowdata[5]=v1.get(4);rowdata[6]="NULL";} 
                else {
                    rowdata[5]=v1.get(4);rowdata[6]=v1.get(5);
                }
                model.addRow(rowdata);
        
    }
    } catch (Exception ex) {
        Logger.getLogger(View_user.class.getName()).log(Level.SEVERE, null, ex);
    }
    ////////////////////////////////////////////
                inspec b;
    try {
        b = new inspec();
        b.LoadviolationFinnishedList();
      DefaultTableModel model=(DefaultTableModel) viol2.getModel();
           Object rowdata[]=new Object[7];
           for(Map.Entry k:b.finished_violation .entrySet()){
               String key = k.getKey().toString();
              Vector v1=(Vector)k.getValue();    
          rowdata[0]=key;
          rowdata[1]=v1.get(0);
          rowdata[2]=v1.get(1);
          rowdata[3]=v1.get(2);
          rowdata[4]=v1.get(3);  
                if(v1.size()==4){ rowdata[5]="NULL";
          rowdata[6]="NULL";}
                else if(v1.size()==5){ rowdata[5]=v1.get(4);rowdata[6]="NULL";} 
                else {
                    rowdata[5]=v1.get(4);rowdata[6]=v1.get(5);
                }
                model.addRow(rowdata);
        
    }
    } catch (Exception ex) {
        Logger.getLogger(View_user.class.getName()).log(Level.SEVERE, null, ex);
    }
     viol.setEnabled(false);
    viol1.setEnabled(false);
     viol2.setEnabled(false);
    if(s=="inspector"){
            a="inspector";
        }
    else if(s=="Voltime"){
        a="Voltime";
    }
        else   if(s=="admin"){
            a="admin";
        }
        else if(s=="head"){
            a="head";
        }
        else if(s=="member"){
    a="member";
         }
        else if(s=="ins")
            a="ins";
           else if(s=="Deletevol")
            a="Deletevol";
     else if(s=="add_voilation_validation")
            a="add_voilation_validation";  
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viol = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viol1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        viol2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Voilation Details");
        setLocation(new java.awt.Point(550, 200));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shrook\\Desktop\\left.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel2.setFont(new java.awt.Font("Gabriola", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("View All Violation");
        jLabel2.setAlignmentY(0.0F);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 210, -1));

        t2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 204, 51), new java.awt.Color(255, 51, 0), new java.awt.Color(255, 153, 102)));
        t2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Adress", "Complaining", "Inspector Name", "Time", "Validation"
            }
        ));
        viol.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(viol);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 400));

        t2.addTab("Old Violation", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viol1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Adress", "Complaining", "Inspector Name", "Time", "Validation"
            }
        ));
        viol1.setSurrendersFocusOnKeystroke(true);
        jScrollPane2.setViewportView(viol1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 400));

        t2.addTab("Timed Violation", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viol2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Adress", "Complaining", "Inspector Name", "Time", "Validation"
            }
        ));
        viol2.setSurrendersFocusOnKeystroke(true);
        jScrollPane3.setViewportView(viol2);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 400));

        t2.addTab("Finished Violation", jPanel5);

        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 740, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
if(a=="inspector")   { 
    Inspector2 s=new Inspector2();
       s.setVisible(true);
       this.setVisible(false);
}
else if(a=="admin"){
       View s=new View();
       s.setVisible(true);
       this.setVisible(false);
}
else if(a=="head"){
        head s=new head();
       s.setVisible(true);
       this.setVisible(false);
}
else if(a=="member"){
        hearing s=new hearing();
       s.setVisible(true);
       this.setVisible(false);
}
else if(a=="ins")
{
    Edit_voilation_time e= new Edit_voilation_time();
    e.setVisible(true);
    this.setVisible(false);
}
else if(a=="Deletevol")
{
    Deletevol e= new Deletevol();
    e.setVisible(true);
    this.setVisible(false);
}
else if(a=="add_voilation_validation")
{
    add_voilation_validation e= new add_voilation_validation();
    e.setVisible(true);
    this.setVisible(false);
}
else if(a=="Voltime")
{
    Voltime e= new Voltime();
    e.setVisible(true);
    this.setVisible(false);
}

    }//GEN-LAST:event_jLabel1MouseClicked

    private void t2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_t2MouseClicked

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
            java.util.logging.Logger.getLogger(Viewvol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viewvol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viewvol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viewvol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewvol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane t2;
    private javax.swing.JTable viol;
    private javax.swing.JTable viol1;
    private javax.swing.JTable viol2;
    // End of variables declaration//GEN-END:variables
}
