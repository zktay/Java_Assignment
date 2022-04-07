/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Java_assignment;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import static java.lang.Integer.parseInt;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author ZK
 */
public class Jungle_view extends javax.swing.JFrame {
    private static final String PIC_FOLDER = "pic/";
    public ImageIcon icon;
    /**
     * Creates new form Jungle_view
     */
    public Jungle_view() {
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
        jPanel3 = new javax.swing.JPanel();
        Modifyd_btn1 = new javax.swing.JButton();
        ViewR_btn2 = new javax.swing.JButton();
        Booking_btn1 = new javax.swing.JButton();
        Logout_btn1 = new javax.swing.JButton();
        adm_pic = new javax.swing.JLabel();
        Cus_name1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        start_date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        end_date = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jungle View");

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

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Modifyd_btn1.setText("Manage");

        ViewR_btn2.setText("View Receipt");
        ViewR_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewR_btn2ActionPerformed(evt);
            }
        });

        Booking_btn1.setText("Booking");
        Booking_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Booking_btn1ActionPerformed(evt);
            }
        });

        Logout_btn1.setText("Logout");
        Logout_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_btn1ActionPerformed(evt);
            }
        });

        adm_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adm_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Cus_name1.setBackground(new java.awt.Color(0, 255, 255));
        Cus_name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cus_name1.setText("Staff");
        Cus_name1.setToolTipText("");
        Cus_name1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cus_name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adm_pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Modifyd_btn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewR_btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(Logout_btn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(Booking_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adm_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cus_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Booking_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modifyd_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewR_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setText("Start Date:");

        jLabel3.setText("End Date:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1022, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(start_date, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(start_date, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Main_menu mm = new Main_menu();
        mm.show();
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void ViewR_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewR_btn2ActionPerformed
        Modify md = new Modify();
        md.show();
        dispose();
    }//GEN-LAST:event_ViewR_btn2ActionPerformed

    private void Booking_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Booking_btn1ActionPerformed
        Main_menu mm = new Main_menu();
        mm.show();
        dispose();
    }//GEN-LAST:event_Booking_btn1ActionPerformed

    private void Logout_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_btn1ActionPerformed
        Index_page ip = new Index_page();
        ip.show();
        dispose();
    }//GEN-LAST:event_Logout_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Jungle_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jungle_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jungle_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jungle_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jungle_view().setVisible(true);
            }
        });
    }
    
    public void Room(Date startDate, Date endDate){
        this.toBack();
        DateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
        File file = new File("file/Jungle_Room.txt");
        File booking = new File ("file/booking.txt");
        ArrayList<String> jungle_room = new ArrayList<String>();
        ArrayList<String> VALUES = new ArrayList<String>();
        jPanel2.setLayout(new GridLayout (10, 1, 0, 5));
        try{
            String j_room_data, b_room_data;
            BufferedReader br  = new BufferedReader (new FileReader(file));
            BufferedReader bk  = new BufferedReader (new FileReader(booking));
            while ((j_room_data = br.readLine())!= null){
                    String[] s_array = j_room_data.split("\\n");
                    for (String a : s_array){
                        for (int i = 0; i < s_array.length; i++) {
                            String[] s_room;
                            s_room = a.split(", ");
                            jungle_room.add(s_room[0]);
                            //System.out.println(sea_room);
                        }
                    }
            }
            while ((b_room_data = bk.readLine())!= null){
                String[] b_array = b_room_data.split("\\n");
                for (String b : b_array){
                    String[] b_room;
                        b_room = b.split(", ");
                        String[] strs = { b_room[1], b_room[6], b_room[7], b_room[10] };
                        for(int i =  0; i < strs.length; i++){
                            VALUES.add(strs[i]);
                        }
                }
            }
                        for ( int i = 0; i < VALUES.size(); i=i+4){
                            String room = VALUES.get(i);
                            String s_first_date = VALUES.get(i + 1);
                            String s_last_date = VALUES.get(i + 2);
                            String status = VALUES.get(i + 3);
                            System.out.println(s_first_date);
                            System.out.println(s_last_date);
                            Date first_date = dateConverter(s_first_date);
                            Date last_date = dateConverter(s_last_date);
                            System.out.println(first_date);
                            System.out.println(last_date);
                            Boolean compare_date = dateCompare(startDate, first_date, last_date);
                            //System.out.println(compare_date);
                            if (compare_date == true && "Reserved".equals(status) ){
                                jungle_room.remove(room);
                            }else if (compare_date == false){
                                //sea_room.add(room);
                                System.out.print("Ever Reach here?");
                            }else{
                                System.out.print("Filter Room Error/ Succes\n");
                            }
                        }
                                    for (int i = 0; i < jungle_room.size(); i++) {
                                            Border border = BorderFactory.createLineBorder(Color.gray);
                                            JPanel panel = new JPanel();
                                            JPanel panel1 = new JPanel();
                                            JPanel panel2 = new JPanel();
                                            panel.setPreferredSize(new Dimension(984, 128));
                                            panel.setLayout(new GridLayout(1, 10, 5, 2));
                                            panel1.setLayout(new GridLayout(3, 1));
                                            panel2.setLayout(new GridLayout(3, 1));
                                            JLabel pack_pic = new JLabel("Pic");
                                            pack_pic.setPreferredSize(new Dimension(48, 18));
                                            JLabel pack_name = new JLabel("Room Name");
                                            JLabel pack_price = new JLabel("Room Price");
                                            JButton b1 = new JButton("Book");
                                            JLabel temp = new JLabel("");
                                            JLabel temp1 = new JLabel("");
                                            JLabel temp2 = new JLabel("");
                                            JLabel temp3 = new JLabel("");
                                            JLabel temp4 = new JLabel("");
                                            JLabel temp5 = new JLabel("");
                                            b1.setPreferredSize(new Dimension(10, 10));
                                            panel.add(pack_pic);
                                            panel2.add(pack_name);
                                            panel2.add(temp5);
                                            panel2.add(pack_price);
                                            panel.add(panel2);
                                            panel.add(temp1);
                                            panel.add(temp2);
                                            panel.add(temp3);
                                            panel.add(temp4);
                                            panel1.add(temp);
                                            panel1.add(b1);
                                            panel1.add(temp1);
                                            panel.add(panel1);
                                            panel.setBorder(border);
                                            panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(0.5f)));
                                            jPanel2.add(panel);
                                            pack_name.setText(jungle_room.get(i));
                                            String room_filter = pack_name.getText();
                                            switch (room_filter){
                                                case "Room 1":
                                                    pack_pic.setIcon(picture("1"));
                                                    break;
                                                case "Room 2":
                                                    pack_pic.setIcon(picture("2"));
                                                    break;
                                                case "Room 3":
                                                    pack_pic.setIcon(picture("3"));
                                                    break;
                                                case "Room 4":
                                                    pack_pic.setIcon(picture("4"));
                                                    break;
                                                case "Room 5":
                                                    pack_pic.setIcon(picture("5"));
                                                    break;
                                                case "Room 6":
                                                    pack_pic.setIcon(picture("6"));
                                                    break;
                                                case "Room 7":
                                                    pack_pic.setIcon(picture("7"));
                                                    break;
                                                case "Room 8":
                                                    pack_pic.setIcon(picture("8"));
                                                    break;
                                                case "Room 9":
                                                    pack_pic.setIcon(picture("9"));
                                                    break;
                                                case "Room 10":
                                                    pack_pic.setIcon(picture("10"));
                                                    break;                     
                                            }
                                            /**
                                            int f = i + 1 ;
                                            System.out.println("This is width:" + pack_pic.getWidth());
                                            String pic_counter = String.valueOf(f);
                                            System.out.println(pic_counter);
                                            ImageIcon jun_pic1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(PIC_FOLDER + pic_counter + ".jpg")));
                                            Image j_pic1 = jun_pic1.getImage();
                                            //Image s_pic2 = s_pic1.getScaledInstance(pack_pic.getWidth(), pack_pic.getHeight(), Image.SCALE_SMOOTH);
                                            Image j_pic2 = j_pic1.getScaledInstance(170, 190, Image.SCALE_SMOOTH);
                                            ImageIcon jun_pic = new ImageIcon(j_pic2);
                                            pack_pic.setIcon(jun_pic);
                                            * */
                                            pack_price.setText("RM 350");
                                            final int i0 = i;
                                            b1.addActionListener(new ActionListener() {
                                                public void actionPerformed(ActionEvent e) {
                                                    Book_Form bf = new Book_Form();
                                                    bf.Room_No.setText(jungle_room.get(i0));
                                                    bf.Room_Price.setText("RM 350");
                                                    String Sstart_date = start_date.getText();
                                                    String Send_date = end_date.getText();
                                                    bf.start_date_form.setText(Sstart_date);
                                                    bf.end_date_form.setText(Send_date);
                                                    bf.setVisible(true);
                                                    String counter = dateCounter(Sstart_date, Send_date);
                                                    bf.days_count.setText(counter);
                                                    int temp, Total;
                                                    temp = (parseInt(counter) * 350);
                                                    Total =  (temp * 110/100) + 10;
                                                    bf.total_amount.setText("RM " + String.valueOf(Total));
                                                    bf.Sight.setText("Jungle");
                                                }
                                            });
            br.close();
            bk.close();
            }
            
        }catch(Exception e){
            System.out.println("Sea View Room Error");
            e.printStackTrace();
        }
    }
    
    
    public String dateCounter(String start, String end){
            SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
            try {
                Date d1 = sdf.parse(start);
                Date d2 = sdf.parse(end);
                long difference_In_Time
                    = d2.getTime() - d1.getTime();
                long difference_In_Days
                    = (difference_In_Time
                       / (1000 * 60 * 60 * 24))
                      % 365;
                String diff = Long.toString(difference_In_Days);
                return diff;
            }catch (ParseException f) {
                f.printStackTrace();
            }  
        return null;
    }
    
    public Date dateConverter(String date1){
        DateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
        try{
            Date date_date = dt.parse(date1);
            return date_date;
        }catch (Exception e){
            System.out.print("Date Converter Error");
        }
        return null;
    }
    
    public boolean dateCompare(Date startDate,Date starting_date, Date ending_date){
        Date d;
        d = startDate;
        return d.after(starting_date) && d.before(ending_date);
    }
    
    public ImageIcon picture(String ROOM){
        ImageIcon sea_pic1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(PIC_FOLDER + ROOM + ".jpg")));
        Image s_pic1 = sea_pic1.getImage();
        Image s_pic2 = s_pic1.getScaledInstance(170, 190, Image.SCALE_SMOOTH);
        ImageIcon sea_pic = new ImageIcon(s_pic2);
        return sea_pic;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Booking_btn1;
    private javax.swing.JLabel Cus_name1;
    private javax.swing.JLabel Logo_pic;
    private javax.swing.JButton Logout_btn1;
    private javax.swing.JLabel Main_title;
    private javax.swing.JButton Modifyd_btn1;
    private javax.swing.JButton ViewR_btn2;
    private javax.swing.JLabel adm_pic;
    private javax.swing.JButton back;
    public javax.swing.JLabel end_date;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel start_date;
    // End of variables declaration//GEN-END:variables
}
