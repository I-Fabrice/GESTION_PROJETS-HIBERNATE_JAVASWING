package ihm;

import javax.swing.*;
import java.awt.*;

public class Aboutstage extends JDialog {

    private JDialog jDialog  = new JDialog();

    private JPanel  jPanel1  = new JPanel(new GridLayout(0,3));
    private JPanel  jPanel2  = new JPanel(null);

    private JPanel  jPanel3  = new JPanel(null);

    private JPanel  jPanel4  = new JPanel(null);
    private JPanel  jPanel5  = new JPanel(null);

    private JPanel  jPanel6  = new JPanel(null);

    private JLabel label1 = new JLabel(); //Même fonction que jPanel4
    private JLabel label2 = new JLabel();

    private JLabel label3 = new JLabel();
    private JLabel label4 = new JLabel();

    private JLabel label5 = new JLabel();

    private JLabel label6 = new JLabel();
    private JLabel label7 = new JLabel();
    private JLabel label8 = new JLabel();
    private JLabel label9 = new JLabel();
    private JLabel label10 = new JLabel();
    private JLabel label11 = new JLabel();
    private JLabel label12 = new JLabel();
    private JLabel label13 = new JLabel();
    private JLabel label14 = new JLabel();


    private ImageIcon image1 = new ImageIcon("C:\\Users\\al-peco\\Downloads\\project_management_240px.PNG");

    public Aboutstage(){

        jDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jDialog.setSize(900,600);
        jDialog.setLocationRelativeTo(null);
        initCompoments();
    }

    public void initCompoments() {

        //jPanel3
        jPanel3.setBackground(new Color(97, 212, 195));
        jPanel3.add(label2);

        //label2
        label2.setIcon(image1);

        //Label6 :
        label6.setText("      IPROJECT 2021.1.0 (FREE VERSION) ");
        label6.setBackground(new Color(204,204,204));
        label6.setForeground(new Color(60,63,65));
        label6.setBounds(60,30,500,50);
        label6.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\copy_2474px.PNG"));
        label6.setFont(new Font("Tahoma",Font.BOLD,15));

        //Label7 :
        label7.setText("      Built from March to July, 2021 ");
        label7.setBackground(new Color(204,204,204));
        label7.setForeground(new Color(60,63,65,230));
        label7.setBounds(89,60,500,50);
        label7.setFont(new Font("Tahoma",Font.BOLD,15));

        //Label8 :
        label8.setText("      Copyright ");
        label8.setBackground(new Color(204,204,204));
        label8.setForeground(new Color(60,63,65,230));
        label8.setBounds(89,230,150,50);
        label8.setFont(new Font("Tahoma",Font.BOLD,15));

        //Label9 :
        label9.setBackground(new Color(204,204,204));
        label9.setForeground(new Color(60,63,65,230));
        label9.setBounds(190,232,500,50);
        label9.setFont(new Font("Tahoma",Font.BOLD,15));
        label9.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\copyright_16px.PNG"));

        //Label10 :
        label10.setText("      Developed by, Fabrice ISSANGA-ISSANGA MAPILA ");
        label10.setBackground(new Color(204,204,204));
        label10.setForeground(new Color(60,63,65,230));
        label10.setBounds(89,170,500,50);
        label10.setFont(new Font("Tahoma",Font.BOLD,15));

        //Label11 :
        label11.setText("      MANAGEMENT APPLICATION ");
        label11.setBackground(new Color(204,204,204));
        label11.setForeground(new Color(60,63,65));
        label11.setBounds(60,100,500,50);
        label11.setFont(new Font("Tahoma",Font.BOLD,15));
        label11.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\project_management_a24px.PNG"));

        //Label12 :
        label12.setText("      Suptechnology High School Graduate ");
        label12.setBackground(new Color(204,204,204));
        label12.setForeground(new Color(60,63,65,230));
        label12.setBounds(89,135,500,50);
        label12.setFont(new Font("Tahoma",Font.BOLD,15));

        //Label13 :
        label13.setBackground(new Color(204,204,204));
        label13.setForeground(new Color(60,63,65,230));
        label13.setBounds(400,137,500,50);
        label13.setFont(new Font("Tahoma",Font.BOLD,15));
        label13.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\graduation_cap_26px.PNG"));

        //Label14 :
        label14.setText("      2021 ");
        label14.setBackground(new Color(204,204,204));
        label14.setForeground(new Color(60,63,65,230));
        label14.setBounds(195,232,150,50);
        label14.setFont(new Font("Tahoma",Font.BOLD,15));

        //jPanel1
        jPanel1.setBackground(new Color(97, 212, 195));
        jPanel1.add(label1, 0);
        jPanel1.add(label2, 1);

        //jPanel2 :
        jPanel2.add(label6);
        jPanel2.add(label7);
        jPanel2.add(label8);
        jPanel2.add(label9);
        jPanel2.add(label10);
        jPanel2.add(label11);
        jPanel2.add(label12);
        jPanel2.add(label13);
        jPanel2.add(label14);

        //jDialog
        jDialog.setLayout(new GridLayout(2, 0));
        jDialog.add(jPanel1, 0);
        jDialog.add(jPanel2, 1);

        jDialog.setVisible(true);
    }
}
