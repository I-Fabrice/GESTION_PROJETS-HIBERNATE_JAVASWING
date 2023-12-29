package ihm;

import Metier.CompteMetier;
import Metier.MembreMetier;
import entites.Compte;
import entites.Membre;
import entites.Role;
import org.apache.commons.validator.routines.EmailValidator;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;

public class JDialogprofil extends JDialog {

    JDialog jDialogprofil = new JDialog();
    JPanel  panel         = new JPanel();
    JButton button1       = new JButton("APPLY");
    JButton button2       = new JButton("CANCEL");

    JTextField text1      = new JTextField();
    JTextField text2      = new JTextField();
    JLabel text3 = new JLabel();
    JLabel text4 = new JLabel();
    JLabel text5 = new JLabel();
    JPasswordField password = new JPasswordField();

    JSeparator separator1 = new JSeparator();
    JSeparator separator2 = new JSeparator();
    JSeparator separator3 = new JSeparator();
    JSeparator separator4 = new JSeparator();
    JSeparator separator5 = new JSeparator();


    JLabel label1         = new JLabel();
    JLabel label2         = new JLabel("FULL NAME");
    JLabel label3         = new JLabel("EMAIL");
    JLabel label4         = new JLabel("USERNAME");
    JLabel label5         = new JLabel("PASSWORD");
    JLabel label6         = new JLabel("STATUT");
    JLabel label7         = new JLabel();
    JLabel label8         = new JLabel();

    public  JDialogprofil(){

        jDialogprofil.setSize(600,700);
        jDialogprofil.setLocationRelativeTo(null);
        initComponents();
    }

    MembreMetier metiermembre = new MembreMetier();
    CompteMetier metiercompte = new CompteMetier();

    loginForm loginForm = new loginForm(null);

    private void clear(){
        text1.setText("");
        text2.setText("");
        password.setText("");
    }

    private void initComponents(){


        //TEXT1
        text1.setBackground(new Color(36,47,65));
        text1.setForeground(new Color(255,255,255));
        text1.setFont(new Font("Century Gothic",Font.PLAIN,15));
        text1.setBounds(80,120,410,30);
        text1.setBorder(null);
        text1.setCaretColor(new Color(255,255,255));

        //TEXT2
        text2.setBackground(new Color(36,47,65));
        text2.setForeground(new Color(255,255,255));
        text2.setFont(new Font("Century Gothic",Font.PLAIN,15));
        text2.setBounds(80,220,410,30);
        text2.setBorder(null);
        text2.setCaretColor(new Color(255,255,255));

        //TEXT3
        text3.setBackground(new Color(36,47,65));
        text3.setForeground(new Color(255,255,255));
        text3.setFont(new Font("Century Gothic",Font.PLAIN,15));
        text3.setBounds(80,320,410,30);
        text3.disable();


        //TEXT4

        text4.setBackground(new Color(36,47,65));
        text4.setForeground(new Color(255,255,255));
        text4.setFont(new Font("Century Gothic",Font.PLAIN,15));
        text4.setBounds(80,420,410,30);



        //TEXT5
        text5.setBackground(new Color(36,47,65));
        text5.setForeground(new Color(255,255,255));
        text5.setFont(new Font("Century Gothic",Font.PLAIN,15));
        text5.setBounds(80,520,410,30);
        text5.disable();

        //************Password******************

        password.setBackground(new Color(36,47,65));
        password.setForeground(new Color(255,255,255));
        password.setFont(new Font("Century Gothic",Font.PLAIN,15));
        password.setBounds(80,420,300,30);
        password.setBorder(null);
        password.setCaretColor(new Color(255,255,255));

        //Separator 1
        separator1.setBackground(Color.WHITE);
        separator1.setForeground(Color.WHITE);
        separator1.setBounds(80,150,410,50);

        //Separator 2
        separator2.setBackground(Color.WHITE);
        separator2.setForeground(Color.WHITE);
        separator2.setBounds(80,250,410,50);

        //Separator 3
        separator3.setBackground(Color.WHITE);
        separator3.setForeground(Color.WHITE);
        separator3.setBounds(80,350,410,50);

        //Separator 4
        separator4.setBackground(Color.WHITE);
        separator4.setForeground(Color.WHITE);
        separator4.setBounds(80,450,410,50);

        //Separator 5
        separator5.setBackground(Color.WHITE);
        separator5.setForeground(Color.WHITE);
        separator5.setBounds(80,550,410,50);



        //label1 : NewIcon
        label1.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\registration_40px.PNG"));
        label1.setBounds(520,10,100,50);




        //label2 : FULL NAME
        label2.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label2.setBackground(new Color(36,47,65));
        label2.setForeground(new Color(204,204,204));
        label2.setBounds(80,70,100,50);

        //label3 : EMAIL
        label3.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label3.setBackground(new Color(36,47,65));
        label3.setForeground(new Color(204,204,204));
        label3.setBounds(80,160,100,50);

        //label4 : USERNAME
        label4.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label4.setBackground(new Color(36,47,65));
        label4.setForeground(new Color(204,204,204));
        label4.setBounds(80,260,120,50);

        //label5 : PASSWORD
        label5.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label5.setBackground(new Color(36,47,65));
        label5.setForeground(new Color(204,204,204));
        label5.setBounds(80,360,120,50);


        //label6 : GENRE
        label6.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label6.setBackground(new Color(36,47,65));
        label6.setForeground(new Color(204,204,204));
        label6.setBounds(80,460,120,50);

        //label7 :
        label7.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label7.setBackground(new Color(36,47,65));
        label7.setForeground(new Color(204,204,204));
        label7.setBounds(470,420,40,30);
        ImageIcon image = new ImageIcon("C:\\Users\\al-peco\\Downloads\\invisible_30px.PNG");
        label7.setIcon(image);

        //Label8 : VALIDATOR EMAIL
        label8.setBackground(new Color(37,47,65));
        label8.setForeground(new Color(204,204,204));
        label8.setFont(new Font("Century Gothic",Font.PLAIN,15));
        label8.setBounds(495,220,125,30);
        label8.setVisible(false);

        //Button : OK
        button1.setBackground(new Color(97,212,195));
        button1.setForeground(new Color(255,255,255));
        button1.setBounds(230,595,100,40);
        button1.setFont(new Font("Century Gothic",Font.PLAIN,20));
        button1.setBorder(new BevelBorder(BevelBorder.RAISED));
        button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //Button : cancel
        button2.setBackground(new Color(97,212,195));
        button2.setForeground(new Color(255,255,255));
        button2.setBounds(370,595,120,40);
        button2.setBorder(new BevelBorder(BevelBorder.RAISED));
        button2.setFont(new Font("Century Gothic",Font.PLAIN,20));
        button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        //Panel
        panel.setBackground(new Color(36,47,65));
        panel.setLayout(null);
        panel.add(button1);
        panel.add(button2);
        panel.add(password);
        panel.add(text1);
        panel.add(text2);
        panel.add(text3);
        panel.add(text4);
        panel.add(text5);
        panel.add(separator1);
        panel.add(separator2);
        panel.add(separator3);
        panel.add(separator4);
        panel.add(separator5);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);
        panel.add(label7);
        panel.add(label8);

        //JDialog Profil
        jDialogprofil.add(panel);
        jDialogprofil.setVisible(true);

        Compte data = null;
        Compte compte = loginForm.getcompte(data);

        try {

            Compte comptefind = metiercompte.getcomptebyid(compte);

            text1.setText(comptefind.getMembre().getNom());
            text2.setText(comptefind.getMembre().getMail());
            text3.setText(comptefind.getIdcompte());
            password.setText(comptefind.getMotpas());
            text5.setText(comptefind.getRole().getStatut());

        }catch (Exception e1){
            e1.printStackTrace();
            JOptionPane.showConfirmDialog(null,e1.getMessage(),"Error",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }

        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jDialogprofil.dispose();
            }
        });

        text2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);


                EmailValidator emailValidator = EmailValidator.getInstance();
                boolean valid = !emailValidator.isValid(text2.getText().trim());
                if(!valid == true)
                {
                    label8.setText("Valid Email");
                    label8.setBackground(new Color(37,47,65));
                    label8.setForeground(Color.CYAN);
                    label8.setVisible(true);
                    button1.setEnabled(true);
                }
                if(!valid == false)
                {
                    label8.setText("Invalid email");
                    label8.setBackground(new Color(37,47,65));
                    label8.setForeground(Color.red);
                    label8.setVisible(true);
                    button1.setEnabled(false);
                }

            }
        });
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
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                String fullname = text1.getText();
                String email    = text2.getText();
                String Password = new String(password.getPassword());


                Membre membre1 = new Membre(null, fullname, email, null, null, null, null);
                Compte compte1 = new Compte(null, Password, null, null);

                Compte data = null;
                Compte compte = loginForm.getcompte(data);

                Compte comp = null;
                Membre mem = null;
                try{

                    Compte comptee = metiercompte.getcomptebyid(compte);
                    mem = metiermembre.updateMembre(comptee,membre1);
                    comp = metiercompte.updateCompte(comptee,compte1);
                    JOptionPane.showConfirmDialog(null, "Successfull", "Information",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    jDialogprofil.dispose();

                }catch (Exception e1){
                    e1.printStackTrace();
                    JOptionPane.showConfirmDialog(null,e1.getMessage(),"Error",
                            JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
                    try{
                        metiermembre.deletemembre(mem);
                        metiercompte.deleteCompte(comp);
                    }catch (Exception e3){
                        e3.getMessage();
                    }

                }
            }
        });
    }
}
