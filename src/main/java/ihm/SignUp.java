package ihm;

import Metier.CompteMetier;
import Metier.MembreMetier;
import Metier.RoleMetier;
import entites.Compte;
import entites.Membre;
import entites.Role;
import org.apache.commons.validator.routines.EmailValidator;

import java.lang.Object;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;


public class SignUp extends JFrame {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JLabel Jl = new JLabel();
    JSeparator separator  = new JSeparator();
    JSeparator separator2 = new JSeparator();
    JSeparator separator3 = new JSeparator();
    JSeparator separator4 = new JSeparator();
    JSeparator separator5 = new JSeparator();
    JSeparator separator6 = new JSeparator();

    JCheckBox checkBox1 = new JCheckBox("Manager");
    JCheckBox checkBox2 = new JCheckBox("Employ");

    JRadioButton radioButton1 = new JRadioButton("Manager");
    JRadioButton radioButton2 = new JRadioButton("Employ");
    ButtonGroup buttonGroup = new ButtonGroup();

    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JPasswordField password = new JPasswordField();
    JLabel label = new JLabel("Learn the value of hard work by working hard");
    JLabel label2 = new JLabel("Plan yourself");
    JLabel label3 = new JLabel("EMAIL");
    JLabel label4 = new JLabel("USERNAME");
    JLabel label5 = new JLabel("PASSWORD");
    JLabel label6 = new JLabel("FULL NAME");
    JLabel label8 = new JLabel();

    JLabel label7 = new JLabel();

    JLabel lien = new JLabel("Already a member?");
    JButton button = new JButton("Sign Up");



    public SignUp(){
        frame.setSize(1500,850);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        initComponents();
    }

    RoleMetier metierrole     = new RoleMetier();
    MembreMetier metiermembre = new MembreMetier();
    CompteMetier metiercompte = new CompteMetier();

    private void clear(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        password.setText("");
    }

    private void initComponents(){

        //************MyDefaultPanel0***********
        panel.setLayout(null);
        Color ColPanel1 = new Color(97,212,195);
        panel.setBackground(ColPanel1);

        //************MyDefaultPanel1***********
        panel1.setLayout(null);
        Color ColPanel2 = new Color(36,47,65);
        panel1.setBackground(ColPanel2);

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

        //*************Separator3***************
        separator3.setBackground(Color.WHITE);
        separator3.setForeground(Color.WHITE);
        separator3.setBounds(150,330,410,50);

        //*************Separator4**************
        separator4.setBackground(Color.WHITE);
        separator4.setForeground(Color.WHITE);
        separator4.setBounds(150,430,410,50);

        //*************Separator5**************
        separator5.setBackground(Color.WHITE);
        separator5.setForeground(Color.WHITE);
        separator5.setBounds(150,530,410,50);

        //*************Separator6**************
        separator6.setBackground(Color.WHITE);
        separator6.setForeground(Color.WHITE);
        separator6.setBounds(150,230,410,50);

        //*************checkbox1***************
        checkBox1.setBackground(new Color(36,47,65));
        checkBox1.setForeground(new Color(255,255,255));
        checkBox1.setFont(new Font("Century Gothic",Font.PLAIN,15));
        checkBox1.setBounds(150,580,80,30);
        checkBox1.setBorder(null);

        //JradioButton1
        radioButton1.setBackground(new Color(36,47,65));
        radioButton1.setForeground(new Color(255,255,255));
        radioButton1.setFont(new Font("Century Gothic",Font.PLAIN,15));
        radioButton1.setBounds(150,580,80,30);
        radioButton1.setBorder(null);

        //JradioButton2
        radioButton2.setBackground(new Color(36,47,65));
        radioButton2.setForeground(new Color(255,255,255));
        radioButton2.setFont(new Font("Century Gothic",Font.PLAIN,15));
        radioButton2.setBounds(280,580,100,30);
        radioButton2.setBorder(null);

        //ButtonGroup
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        //*************checkbox2***************
        checkBox2.setBackground(new Color(36,47,65));
        checkBox2.setForeground(new Color(255,255,255));
        checkBox2.setFont(new Font("Century Gothic",Font.PLAIN,15));
        checkBox2.setBounds(280,580,100,30);
        checkBox2.setBorder(null);

        //************JtextField1***************
        jTextField1.setBackground(new Color(36,47,65));
        jTextField1.setForeground(new Color(255,255,255));
        jTextField1.setFont(new Font("Century Gothic",Font.PLAIN,15));
        jTextField1.setBounds(150,200,410,30);
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new Color(255,255,255));

        //************JtextField2***************
        jTextField2.setBackground(new Color(36,47,65));
        jTextField2.setForeground(new Color(255,255,255));
        jTextField2.setFont(new Font("Century Gothic",Font.PLAIN,15));
        jTextField2.setBounds(150,300,410,30);
        jTextField2.setBorder(null);
        jTextField2.setCaretColor(new Color(255,255,255));

        //************JtextField3***************
        jTextField3.setBackground(new Color(36,47,65));
        jTextField3.setForeground(new Color(255,255,255));
        jTextField3.setFont(new Font("Century Gothic",Font.PLAIN,15));
        jTextField3.setBounds(150,400,410,30);
        jTextField3.setBorder(null);
        jTextField3.setCaretColor(new Color(255,255,255));

        //************Password******************
        password.setBackground(new Color(36,47,65));
        password.setForeground(new Color(255,255,255));
        password.setFont(new Font("Century Gothic",Font.PLAIN,15));
        password.setBounds(150,500,350,30);//280
        password.setBorder(null);
        password.setCaretColor(new Color(255,255,255));

        //*************Button*******************
        button.setBackground(new Color(97,212,195));
        button.setForeground(new Color(255,255,255));
        button.setBounds(150,650,200,50);
        button.setFont(new Font("Century Gothic",Font.PLAIN,20));
        button.setBorder(new BevelBorder(BevelBorder.RAISED));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

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

        //************Label3***********************************
        label3.setBackground(new Color(240,240,240));
        label3.setForeground(new Color(204,204,204));
        label3.setFont(new Font("Century Gothic",Font.PLAIN,20));
        label3.setBounds(150,240,125,50);

        //************Label4*******************
        label4.setBackground(new Color(240,240,240));
        label4.setForeground(new Color(204,204,204));
        label4.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label4.setBounds(150,340,125,50);

        //************Label5*******************
        label5.setBackground(new Color(240,240,240));
        label5.setForeground(new Color(204,204,204));
        label5.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label5.setBounds(150,440,125,50);

        //************Label6*******************
        label6.setBackground(new Color(240,240,240));
        label6.setForeground(new Color(204,204,204));
        label6.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label6.setBounds(150,150,125,50);

        //************Label7*******************
        label7.setBackground(new Color(240,240,240));
        label7.setForeground(new Color(204,204,204));
        label7.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label7.setBounds(530,490,125,50);
        label7.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\invisible_30px.PNG"));

        //************Label8*******************
        label8.setBackground(new Color(37,47,65));
        label8.setForeground(new Color(204,204,204));
        label8.setFont(new Font("Century Gothic",Font.PLAIN,15));
        label8.setBounds(570,300,125,30);
        label8.setVisible(false);



        jTextField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);


                EmailValidator emailValidator = EmailValidator.getInstance();
                boolean valid = !emailValidator.isValid(jTextField2.getText().trim());
                if(!valid == true)
                {
                    label8.setText("Valid Email");
                    label8.setBackground(new Color(37,47,65));
                    label8.setForeground(Color.CYAN);
                    label8.setVisible(true);
                    button.setEnabled(true);
                }
                if(!valid == false)
                {
                    label8.setText("Invalid email");
                    label8.setBackground(new Color(37,47,65));
                    label8.setForeground(Color.red);
                    label8.setVisible(true);
                    button.setEnabled(false);
                }

            }
        });



        //*************Labellien****************
        lien.setBackground(new Color(37,47,65));
        lien.setForeground(new Color(204,204,204));
        lien.setFont(new Font("Century Gothic",Font.PLAIN,15));
        lien.setBounds(410,665,200,20);
        lien.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //************AddLabelInPanel1**************************
        panel1.add(label3);
        panel1.add(label4);
        panel1.add(label5);
        panel1.add(label6);
        panel1.add(lien);
        panel1.add(label7);
        panel1.add(label8);

        //*************AddTextFielandPasswordInPanel1***********
        panel1.add(password);
        panel1.add(jTextField1);
        panel1.add(jTextField2);
        panel1.add(jTextField3);


        //*************AddButtonInPanel1****************
        panel1.add(button);
        //**************Add checkBoxsInPanel1***********
        //panel1.add(checkBox1);
        //panel1.add(checkBox2);
        panel1.add(radioButton1);
        panel1.add(radioButton2);

        //**************Add LabelinPanel0***************
        panel.add(label);
        panel.add(label2);

        //*************Add IconPanel0*******************
        panel.add(Jl);

        //*************Add SeparatorPanel0**************
        panel.add(separator);
        panel.add(separator2);

        //*************Add SeparatorInPanel1************
        panel1.add(separator3);
        panel1.add(separator4);
        panel1.add(separator5);
        panel1.add(separator6);

        //Ajoutez les panels dans le frame
        frame.setLayout(new GridLayout(0,2));
        frame.add(panel,0);
        frame.add(panel1,1);

        //Visible
        frame.setVisible(true);


        label7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(password.getEchoChar() == (char)0){
                    password.setEchoChar('•');
                    label7.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\invisible_30px.PNG"));
                }
                else{
                    password.setEchoChar((char)0);
                    label7.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\eye_24px.PNG"));
                }

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                label7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                label7.setCursor(Cursor.getDefaultCursor());
            }
        });

        //*******cliquez sur le lien**********

        lien.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                loginForm loginForm = new loginForm();
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

        checkBox1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkBox2.setSelected(false);
            }
        });

        checkBox2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkBox1.setSelected(false);
            }
        });


       button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);


                String fullname = jTextField1.getText();
                String email    = jTextField2.getText();
                String username = jTextField3.getText();
                String Password = new String(password.getPassword());

                boolean value1   = radioButton1.isSelected();
                boolean value2   = radioButton2.isSelected();

                String statut = "";

                if(value1 == true) {
                statut = "Manager";
                }
                else if(value2 == true){
                    statut = "Employ";
                }

                Role role1 = new Role(null, statut, null);
                Membre membre1 = new Membre(null, fullname, email, null, null, null, null);
                Compte compte1 = new Compte(username, Password, role1, membre1);

                Membre membre = null;
                Role role = null;

                try{
                     role = metierrole.creationRole(role1);
                     membre  = metiermembre.creationMembre(membre1);
                    metiercompte.creationCompte(membre,role,compte1);
                    JOptionPane.showConfirmDialog(null, "SignUp Successfuly", "Information",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    new loginForm();
                    frame.dispose();

                }catch (Exception e1){
                    e1.printStackTrace();
                    JOptionPane.showConfirmDialog(null,e1.getMessage(),"Error",
                            JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
                    try{
                        metiermembre.deletemembre(membre);
                        metierrole.deleterole(role);
                    }catch (Exception e3){
                        e3.getMessage();
                    }

                }


            }
        });
    }
}
