package ihm;

import Metier.CompteMetier;
import Metier.ProjetMetier;
import entites.Compte;
import entites.Projet;
import lombok.val;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.concurrent.Callable;

public class loginForm extends JFrame {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JLabel Jl = new JLabel();

    JSeparator separator = new JSeparator();
    JSeparator separator2 = new JSeparator();
    JSeparator separator3 = new JSeparator();
    JSeparator separator4 = new JSeparator();

    JLabel label = new JLabel("Learn the value of hard work by working hard");
    JLabel label2 = new JLabel("Plan yourself");
    JLabel label3 = new JLabel("USERNAME");
    JLabel label4 = new JLabel("PASSWORD");
    JLabel label5 = new JLabel("Sign in or Sign Up");
    JLabel label6 = new JLabel(new ImageIcon("C:\\Users\\al-peco\\Downloads\\invisible_30px.PNG"));
    JLabel label7 = new JLabel(new ImageIcon("C:\\Users\\al-peco\\Downloads\\key_24px.PNG"));
    JLabel label8 = new JLabel(new ImageIcon("C:\\Users\\al-peco\\Downloads\\username_24px.PNG"));

    JTextField text = new JTextField();
    JPasswordField password = new JPasswordField();

    JCheckBox checkBox1 = new JCheckBox("I agree all terms of service");
    JLabel lien = new JLabel("Not already member?");
    JButton button = new JButton("Login");

    CompteMetier metiercompte      =  new CompteMetier();
    ProjetMetier metierprojet      =  new ProjetMetier();

    private static Compte compte = null;


    public loginForm(){

        frame.setSize(1500,850);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        initComponents();
    }

    private void clear(){
        text.setText("");
        password.setText("");
    }

    private void initComponents(){

        //************MyDefaultPanel0***********
        panel.setLayout(null);
        //panel.setBounds(0,0,800,1000);
        Color ColPanel1 = new Color(97,212,195);
        panel.setBackground(ColPanel1);

        //************Label3*******************
        label3.setBackground(new Color(240,240,240));
        label3.setForeground(new Color(204,204,204));
        label3.setFont(new Font("Century Gothic",Font.PLAIN,20));
        label3.setBounds(150,240,125,50);

        //************Label4*******************
        label4.setBackground(new Color(240,240,240));
        label4.setForeground(new Color(204,204,204));
        label4.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label4.setBounds(150,340,125,50);//240

        //*************label5*******************
        label5.setBackground(new Color(255,255,255));
        label5.setForeground(new Color(255,255,255));
        label5.setFont(new Font("Century Gothic",Font.PLAIN,16));
        label5.setBounds(150,160,200,50);

        //label6
        label6.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label6.setBackground(new Color(36,47,65));
        label6.setForeground(new Color(204,204,204));
        label6.setBounds(525,395,40,30);

        //label7
        label7.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label7.setBackground(new Color(36,47,65));
        label7.setForeground(new Color(204,204,204));
        //label7.setBounds(140,395,40,30);

        //label8
        label8.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label8.setBackground(new Color(36,47,65));
        label8.setForeground(new Color(204,204,204));
        //label8.setBounds(140,295,40,30);


        //************Password******************

        password.setBackground(new Color(36,47,65));
        password.setForeground(new Color(255,255,255));
        password.setFont(new Font("Century Gothic",Font.PLAIN,15));
        password.setBounds(150,395,380,30);//280
        password.setBorder(null);
        password.setCaretColor(new Color(255,255,255));

        //*************JTextField***************
        text.setBackground(new Color(36,47,65));
        text.setForeground(new Color(255,255,255));
        text.setFont(new Font("Century Gothic",Font.PLAIN,16));
        text.setBounds(150,295,410,30);
        text.setBorder(null);
        text.setCaretColor(new Color(255,255,255));

        //*************Separator3***************
        separator3.setBackground(Color.WHITE);
        separator3.setForeground(Color.WHITE);
        separator3.setBounds(150,330,410,50);

        //*************Separator4**************
        separator4.setBackground(Color.WHITE);
        separator4.setForeground(Color.WHITE);
        separator4.setBounds(150,430,410,50);

        //*************checkbox1***************
        checkBox1.setBackground(new Color(36,47,65));
        checkBox1.setForeground(new Color(255,255,255));
        checkBox1.setFont(new Font("Century Gothic",Font.PLAIN,15));
        checkBox1.setBounds(150,480,410,30);
        checkBox1.setBorder(null);

        //*************Labellien****************
        lien.setBackground(new Color(37,47,65));
        lien.setForeground(new Color(204,204,204));
        lien.setFont(new Font("Century Gothic",Font.PLAIN,15));
        lien.setBounds(410,575,200,20);
        lien.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //*************Button*******************
        button.setBackground(new Color(97,212,195));
        button.setForeground(new Color(255,255,255));
        button.setBounds(150,560,200,50);
        button.setFont(new Font("Century Gothic",Font.PLAIN,20));
        button.setBorder(new BevelBorder(BevelBorder.RAISED));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button.setEnabled(false);

        checkBox1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!checkBox1.isSelected()){
                    button.setEnabled(false);
                }
                else{
                    button.setEnabled(true);
                }

            }
        });
        //************MyDefaultPanel1***********
        panel1.setLayout(null);
        //panel1.setBounds(800,0,1000,1000);
        Color ColPanel2 = new Color(36,47,65);
        panel1.setBackground(ColPanel2);


        //************AddInPanel1**************

        panel1.add(password);
        panel1.add(label8);
        panel1.add(label7);
        panel1.add(label6);
        panel1.add(label5);
        panel1.add(label4);
        panel1.add(label3);
        panel1.add(text);
        panel1.add(separator3);
        panel1.add(separator4);
        panel1.add(checkBox1);
        panel1.add(button);
        panel1.add(lien);

        //*************Create IconPanel1************
        Jl.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\project_management_240px.PNG"));
        Jl.setBounds(280,280,2000,300);

        //*************Create JSeparator1************
        separator.setBackground(Color.WHITE);
        separator.setForeground(Color.WHITE);
        separator.setBounds(200,650,350,50);

        //*************Create JSeparator2************
        separator2.setBackground(Color.WHITE);
        separator2.setForeground(Color.WHITE);
        separator2.setBounds(230,690,290,50);

        //*************Create label1******************
        label.setFont(new Font("Century Gothic",Font.PLAIN,20));
        label.setBackground(new Color(240,240,240));
        label.setForeground(new Color(255,255,255,200));
        label.setBounds(190,110,500,100);

        //*************Create label2*******************
        label2.setFont(new Font("Century Gothic",Font.PLAIN,20));
        label2.setBackground(new Color(240,240,240));
        label2.setForeground(new Color(255,255,255,200));
        label2.setBounds(320,180,500,100);


        //**************Add LabelinPanel***************
        panel.add(label);
        panel.add(label2);

        //*************Add SeparatorPanel********
        panel.add(separator);
        panel.add(separator2);
        //*************Add IconPanel1************
        panel.add(Jl);

        //Ajoutez les panels dans le frame
        frame.setLayout(new GridLayout(0,2));
        frame.add(panel,0);
        frame.add(panel1,1);

        //Visible
        frame.setVisible(true);

        //*******cliquez sur le lien**********

        lien.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new SignUp();
                frame.dispose();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                lien.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                lien.setForeground(new Color(204,204,204));
            }
        });

        label6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(password.getEchoChar() == (char)0){
                    password.setEchoChar('•');
                    label6.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\invisible_30px.PNG"));
                }
                else{
                    password.setEchoChar((char)0);
                    label6.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\eye_24px.PNG"));
                }

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                label6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                label6.setCursor(Cursor.getDefaultCursor());
            }
        });

        //******checkbox1*********


        //******cliquez sur le lien************

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String  username  =  text.getText();
                String  Password  =  new String(password.getPassword());
                String  value1    =  "Manager";

                //Compte compte = null;

                try{
                    compte =  metiercompte.Connexion(username,Password);
                    if(compte.getRole().getStatut().compareTo(value1) == 0) {
                        frame.dispose();
                        new Firstform();
                        clear();
                    }
                    if(compte.getRole().getStatut().compareTo(value1) != 0){

                        if(compte.getMembre().getEquipe() == null){
                            JOptionPane.showConfirmDialog(null,"Ask your Manager to add you in project","Error",
                                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            frame.dispose();
                            JDialog jDialog = null;
                            new OpenprojectForm(jDialog);
                            clear();

                        }

                    }

                }catch (Exception e1){
                    e1.printStackTrace();
                    JOptionPane.showConfirmDialog(null,e1.getMessage(),"Error",
                            JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
                }

            }
        });


    }

    //Fonction de laison
    public Compte getcompte(Compte compte){
        compte = this.compte;
        return compte;
    }

    //constructeur de liaison
    public loginForm(String x){

    }


}
