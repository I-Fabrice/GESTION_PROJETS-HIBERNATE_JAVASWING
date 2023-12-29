package ihm;

import Metier.CompteMetier;
import Metier.ProjetMetier;
import entites.Compte;
import entites.Projet;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JDialogupproject extends JDialog {


    JDialog jDialogupproject = new JDialog();
    JPanel  panel         = new JPanel();
    JButton button1       = new JButton("APPLY");
    JButton button2       = new JButton("CANCEL");

    JTextField text1      = new JTextField();
    JTextField text2      = new JTextField();
    JTextArea  text3      = new JTextArea();

    JSeparator separator1 = new JSeparator();
    JSeparator separator2 = new JSeparator();

    JLabel label1         = new JLabel();
    JLabel label2         = new JLabel("NAME PROJECT");
    JLabel label3         = new JLabel("TYPE PROJECT");
    JLabel label4         = new JLabel("DESCRIPTION");

    JLabel label5         = new JLabel();
    JLabel label6         = new JLabel();
    JLabel label7         = new JLabel();

    JLabel label8         = new JLabel();

    ProjetMetier metierprojet = new ProjetMetier();

    //loginForm    loginForm       = new loginForm(null);
    OpenprojectForm openprojectForm = new OpenprojectForm("");
    CompteMetier metiercompte    = new CompteMetier();

    public void clear(){

        text1.setText("");
        text2.setText("");
        text3.setText("");
    }

    public  JDialogupproject(){

        jDialogupproject.setSize(600,700);
        jDialogupproject.setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents(){


        //TEXT1
        text1.setBackground(new Color(36,47,65));
        text1.setForeground(new Color(255,255,255));
        text1.setFont(new Font("Century Gothic",Font.PLAIN,15));
        text1.setBounds(80,120,410,30);
        text1.disable();
        text1.setBorder(null);

        //TEXT2
        text2.setBackground(new Color(36,47,65));
        text2.setForeground(new Color(255,255,255));
        text2.setFont(new Font("Century Gothic",Font.PLAIN,15));
        text2.setBounds(80,220,410,30);
        text2.setBorder(null);
        text2.setCaretColor(new Color(255,255,255));

        //TEXTAREA3
        text3.setBackground(new Color(36,47,65));
        text3.setForeground(new Color(255,255,255));
        text3.setFont(new Font("Century Gothic",Font.PLAIN,15));
        text3.setBounds(80,330,410,30);
        text3.setSize(410,170);
        text3.setCaretColor(new Color(255,255,255));
        text3.setBorder(BorderFactory.createLineBorder(Color.WHITE,2,true));


        //Separator 1
        separator1.setBackground(Color.WHITE);
        separator1.setForeground(Color.WHITE);
        separator1.setBounds(80,150,410,50);

        //Separator 2
        separator2.setBackground(Color.WHITE);
        separator2.setForeground(Color.WHITE);
        separator2.setBounds(80,250,410,50);


        //label1 : NewIcon
        label1.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\project_management_48px.PNG"));
        label1.setBounds(520,10,100,50);

        //label2 : NAME PROJECT
        label2.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label2.setBackground(new Color(36,47,65));
        label2.setForeground(new Color(204,204,204));
        label2.setBounds(80,70,150,50);

        //label3 : TYPE PROJECT
        label3.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label3.setBackground(new Color(36,47,65));
        label3.setForeground(new Color(204,204,204));
        label3.setBounds(80,160,150,50);


        //label4 : DESCRIPTION
        label4.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label4.setBackground(new Color(36,47,65));
        label4.setForeground(new Color(204,204,204));
        label4.setBounds(80,260,150,50);

        //label5 :
        label5.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label5.setBackground(new Color(36,47,65));
        label5.setForeground(new Color(204,204,204));
        //label5.setBounds(80,260,150,50);

        //label6 :
        label6.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label6.setBackground(new Color(36,47,65));
        label6.setForeground(new Color(204,204,204));
        //label6.setBounds(80,260,150,50);

        //label7 :
        label7.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label7.setBackground(new Color(36,47,65));
        label7.setForeground(new Color(204,204,204));
        //label7.setBounds(80,260,150,50);

        //label8 :
        label8.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label8.setBackground(new Color(36,47,65));
        label8.setForeground(new Color(204,204,204));
        label8.setBounds(430,490,150,50);


        //Button : OK
        button1.setBackground(new Color(97,212,195));
        button1.setForeground(new Color(255,255,255));
        button1.setBounds(80,560,100,40);
        button1.setFont(new Font("Century Gothic",Font.PLAIN,20));
        button1.setBorder(new BevelBorder(BevelBorder.RAISED));
        button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //Button : cancel
        button2.setBackground(new Color(97,212,195));
        button2.setForeground(new Color(255,255,255));
        button2.setBounds(220,560,120,40);
        button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button2.setBorder(new BevelBorder(BevelBorder.RAISED));
        button2.setFont(new Font("Century Gothic",Font.PLAIN,20));


        //Panel
        panel.setBackground(new Color(36,47,65));
        panel.setLayout(null);
        panel.add(button1);
        panel.add(button2);
        panel.add(text1);
        panel.add(text2);
        panel.add(text3);
        panel.add(separator1);
        panel.add(separator2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label8);

        //JDialog Profil
        jDialogupproject.add(panel);
        jDialogupproject.setVisible(true);

        text3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);

                label8.setText( text3.getText().length() + " /250" );

                if(text3.getText().length() == 250){
                    label8.setForeground(Color.red);
                    e.consume();
                }
                if(text3.getText().length() <250){
                    label8.setForeground(new Color(204,204,204));
                    text3.setEditable(true);
                }

            }
        });

        try{

            Projet t= null;
            Projet x = openprojectForm.getprojet(t);

            Projet pro = metierprojet.getAllByname(x.getNompro());

            text1.setText(pro.getNompro());
            text2.setText(pro.getTypro());
            text3.setText(pro.getDespro());

        }catch (Exception e3){
            e3.printStackTrace();
            JOptionPane.showConfirmDialog(null,e3.getMessage(),"Error",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String name        = text1.getText();
                String typeproject = text2.getText();
                String description = text3.getText();

                Projet projet1 = new Projet(null,name,typeproject,description,null,null,null,null);

                Compte data = null;
                loginForm loginForm = new loginForm(null);
                Projet p = null;
                Projet projet = openprojectForm.getprojet(p);

                try {
                    Projet h = metierprojet.getAllByname(projet.getNompro());

                    Compte c = loginForm.getcompte(data);
                    Compte compte = metiercompte.getcomptebyid(c);
                    metierprojet.updateProjet(compte,h,projet1);
                    JOptionPane.showConfirmDialog(null, "Success", "Information",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    jDialogupproject.dispose();
                }catch (Exception e1){
                    e1.printStackTrace();
                    JOptionPane.showConfirmDialog(null,e1.getMessage(),"Error",
                            JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jDialogupproject.dispose();
            }
        });
    }
}
