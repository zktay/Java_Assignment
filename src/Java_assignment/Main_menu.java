/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Java_assignment;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author ZK
 */
public class Main_menu extends javax.swing.JFrame {
    private String st_date;
    private String en_date;
    /**
     * Creates new form Main_menu
     */
    public Main_menu(){
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        ImageIcon logo = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("pic/logo.jpg")));
        Image logo_pic1 = logo.getImage();
        Image logo_pic2 = logo_pic1.getScaledInstance(Logo_pic.getWidth(), Logo_pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon logo_pic = new ImageIcon(logo_pic2);
        Logo_pic.setIcon(logo_pic);
        
        ImageIcon admin = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("pic/admin.jpg")));
        Image adm_pic1 = admin.getImage();
        Image adm_pic2 = adm_pic1.getScaledInstance(adm_pic.getWidth(), adm_pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon admin_pic = new ImageIcon(adm_pic2);
        adm_pic.setIcon(admin_pic);
        
        try {
            Date date = new Date();
            start_date.setDate(date);
            DateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
            Calendar cal = Calendar.getInstance();                  
            cal.add(Calendar.DAY_OF_MONTH, 4);
            Date futureDate = cal.getTime();
            String outD = dt.format(futureDate);
            end_date.setDate(futureDate);
        }catch (Exception c){
            System.out.println("Error");
        }   
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
        Main_title = new javax.swing.JLabel();
        Logo_pic = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Modifyd_btn = new javax.swing.JButton();
        ViewR_btn = new javax.swing.JButton();
        Booking_btn = new javax.swing.JButton();
        Logout_btn = new javax.swing.JButton();
        ViewR_btn1 = new javax.swing.JButton();
        adm_pic = new javax.swing.JLabel();
        Cus_name = new javax.swing.JLabel();
        j_view_btn = new javax.swing.JButton();
        s_view_btn = new javax.swing.JButton();
        date_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        start_date = new com.toedter.calendar.JDateChooser();
        end_date = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ZK Resort Room Booking System");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Main_title.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Main_title.setText("ZK Resort Room Booking System");

        Logo_pic.setBackground(new java.awt.Color(0, 255, 255));
        Logo_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo_pic.setText("Logo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Logo_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Main_title, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo_pic, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Main_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Modifyd_btn.setText("Manage");
        Modifyd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modifyd_btnActionPerformed(evt);
            }
        });

        ViewR_btn.setText("View Receipt");

        Booking_btn.setText("Booking");

        Logout_btn.setText("Logout");
        Logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_btnActionPerformed(evt);
            }
        });

        ViewR_btn1.setText("Manage Account");

        adm_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adm_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Cus_name.setBackground(new java.awt.Color(0, 255, 255));
        Cus_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cus_name.setText("Admin");
        Cus_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cus_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adm_pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Modifyd_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewR_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(Logout_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(Booking_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(ViewR_btn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adm_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cus_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Booking_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modifyd_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewR_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewR_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(Logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        j_view_btn.setText("Jungle View");
        j_view_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_view_btnActionPerformed(evt);
            }
        });

        s_view_btn.setText("Sea View");
        s_view_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_view_btnActionPerformed(evt);
            }
        });

        jLabel1.setText("Start Date:");

        jLabel2.setText("End Date:");

        javax.swing.GroupLayout date_panelLayout = new javax.swing.GroupLayout(date_panel);
        date_panel.setLayout(date_panelLayout);
        date_panelLayout.setHorizontalGroup(
            date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(date_panelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(start_date, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        date_panelLayout.setVerticalGroup(
            date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(date_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(end_date, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(start_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(j_view_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s_view_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(date_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(date_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(j_view_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                            .addComponent(s_view_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j_view_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_view_btnActionPerformed
        this.toBack();
        Jungle_view jv = new Jungle_view();
        Date get_st_date = start_date.getDate();
        Date get_en_date = end_date.getDate();
        DateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
        String st_date = dt.format(get_st_date);
        String en_date = dt.format(get_en_date);
        jv.start_date.setText(st_date);
        jv.end_date.setText(en_date);
        jv.setVisible(true);
        jv.toFront();  
    }//GEN-LAST:event_j_view_btnActionPerformed

    private void s_view_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_view_btnActionPerformed
        this.toBack();
        Sea_view sv = new Sea_view();
        Date get_st_date = start_date.getDate();
        Date get_en_date = end_date.getDate();
        DateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
        String st_date = dt.format(get_st_date);
        String en_date = dt.format(get_en_date);
        sv.start_date.setText(st_date);
        sv.end_date.setText(en_date);
        sv.setVisible(true);
        sv.toFront();
        
        
    }//GEN-LAST:event_s_view_btnActionPerformed

    private void Logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_btnActionPerformed
        Index_page ip = new Index_page();
        ip.show();
        dispose();
    }//GEN-LAST:event_Logout_btnActionPerformed

    private void Modifyd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modifyd_btnActionPerformed
       this.toBack();
        Modify md = new Modify();
        md.setVisible(true);
        md.toFront();
    }//GEN-LAST:event_Modifyd_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_menu().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Booking_btn;
    private javax.swing.JLabel Cus_name;
    private javax.swing.JLabel Logo_pic;
    private javax.swing.JButton Logout_btn;
    private javax.swing.JLabel Main_title;
    private javax.swing.JButton Modifyd_btn;
    private javax.swing.JButton ViewR_btn;
    private javax.swing.JButton ViewR_btn1;
    private javax.swing.JLabel adm_pic;
    private javax.swing.JPanel date_panel;
    public com.toedter.calendar.JDateChooser end_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton j_view_btn;
    private javax.swing.JButton s_view_btn;
    public com.toedter.calendar.JDateChooser start_date;
    // End of variables declaration//GEN-END:variables
}
