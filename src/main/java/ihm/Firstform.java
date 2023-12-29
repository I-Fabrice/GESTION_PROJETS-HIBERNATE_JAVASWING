package ihm;

import entites.Compte;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Firstform extends JDialog {

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
    private JLabel label6 = new JLabel("NEW PROJECT");
    private JLabel label7 = new JLabel("OPEN PROJECT");
    private JLabel label8 = new JLabel("RETURN BACK");
    private JLabel label9 = new JLabel();



    private ImageIcon image1 = new ImageIcon("C:\\Users\\al-peco\\Downloads\\male_user_200px.PNG");

    public Firstform(){

        jDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jDialog.setSize(900,600);
        jDialog.setLocationRelativeTo(null);
        initCompoments();
    }

    public void initCompoments(){

        //jPanel3
        jPanel3.setBackground(new Color(97,212,195));
        jPanel3.add(label2);


        //label2
        label2.setIcon(image1);

        //label3
        label3.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\undo_52px.PNG"));
        label3.setBounds(40,35,100,50);
        label3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //label4
        label4.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\doctors_folder_60px.PNG"));
        label4.setBounds(40,35,100,50);
        label4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //label5
        label5.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\opened_folder_48px.PNG"));
        label5.setBounds(55,35,100,50);
        label5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //label6 : NEW PROJECT
        label6.setFont(new Font("Tahoma",Font.BOLD,15));
        label6.setBackground(new Color(187,187,187));
        label6.setForeground(new Color(60,63,65));
        label6.setBounds(183,210,150,30);
        jPanel2.add(label6);

        //label7 : OPEN PROJECT
        label7.setFont(new Font("Tahoma",Font.BOLD,15));
        label7.setBackground(new Color(187,187,187));
        label7.setForeground(new Color(60,63,65));
        label7.setBounds(370,210,150,30);
        jPanel2.add(label7);

        //label8 : Return back
        label8.setFont(new Font("Tahoma",Font.BOLD,15));
        label8.setBackground(new Color(187,187,187));
        label8.setForeground(new Color(60,63,65));
        label8.setBounds(565,210,150,30);
        jPanel2.add(label8);



        //jPanel1
        jPanel1.setBackground(new Color(97,212,195));
        jPanel1.add(label1,0);
        jPanel1.add(label2,1);

        //jPanel2
        jPanel2.setBackground(new Color(187,187,187));
        jPanel2.add(jPanel4);
        jPanel2.add(jPanel5);
        jPanel2.add(jPanel6);

        //jPanel4
        jPanel4.setBackground(new Color(97,212,195));
        jPanel4.setBounds(160,80,150,120);
        jPanel4.add(label4);

        //jPanel5
        jPanel5.setBackground(new Color(204,204,204));
        jPanel5.setBounds(540,80,150,120);
        jPanel5.add(label3);

        //jPanel6
        jPanel6.setBackground(new Color(204,204,204));
        jPanel6.setBounds(350,80,150,120);
        jPanel6.add(label5);


        //jDialog
        jDialog.setLayout(new GridLayout(2,0));
        jDialog.add(jPanel1,0);
        jDialog.add(jPanel2,1);

        jDialog.setVisible(true);

        /*loginForm loginForm = new loginForm("v");
        Compte data = null;
        Compte compte = loginForm.getcompte(data);

        JOptionPane.showConfirmDialog(null,"WELCOME BACK "+compte.getIdcompte(),"INFORMATION",
                JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);*/

        label4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new JDialogproject();

            }

        });

        label3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new loginForm();
                jDialog.dispose();
            }
        });

        label5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new OpenprojectForm(jDialog);
            }
        });

    }


}
