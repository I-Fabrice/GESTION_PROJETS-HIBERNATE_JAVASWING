package ihm;

import Metier.MembreMetier;
import Metier.ProjetMetier;
import entites.Compte;
import entites.Membre;
import entites.Projet;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class OpenprojectForm extends JDialog {

    JDialog jDialog = new JDialog();

    JPanel jPanel1 = new JPanel(null);

    JButton button1       = new JButton("OPEN");
    JButton button2       = new JButton("CANCEL");

    ProjetMetier metierprojet = new ProjetMetier();

    JLabel label = new JLabel("LIST OF MY PROJECT");
    JLabel icon = new JLabel();

    private static String name = null;
    private static Projet projet = null;


    public OpenprojectForm(JDialog jDialog1){

        jDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jDialog.setSize(600,700);
        jDialog.setLocationRelativeTo(null);
        initCompoments(jDialog1);
    }


    public void initCompoments(final JDialog jDialog1){

        users_list = new JComboBox();
        users_list.setFont(new Font("Century Gothic",Font.BOLD,15));
        users_list.setBackground(new Color(204,204,204));
        users_list.setForeground(new Color(60,63,65));
        users_list.setBounds(70,200,440,36);


        //Button : OK
        button1.setBackground(new Color(97,212,195));
        button1.setForeground(new Color(134,131,134));
        button1.setBounds(70,520,100,40);
        button1.setFont(new Font("Century Gothic",Font.PLAIN,20));
        button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button1.setBorder(new BevelBorder(BevelBorder.RAISED));

        //Button : cancel
        button2.setBackground(new Color(204,204,204));
        button2.setForeground(new Color(134,131,134));
        button2.setBounds(210,520,120,40);
        button2.setFont(new Font("Century Gothic",Font.PLAIN,20));
        button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button2.setBorder(new BevelBorder(BevelBorder.RAISED));

        //Label : MY PROJECT
        label.setFont(new Font("Tahoma",Font.BOLD,16));
        label.setBackground(new Color(187,187,187));
        label.setForeground(new Color(60,63,65));
        label.setBounds(70,120,350,60);

        //Label1 : ICON
        icon.setFont(new Font("Tahoma",Font.BOLD,16));
        icon.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\project_management_48px.PNG"));
        icon.setBackground(new Color(187,187,187));
        icon.setForeground(new Color(60,63,65));
        icon.setBounds(520,40,350,60);

        //jPanel1
        jPanel1.setBackground(new Color(187,187,187));
        jPanel1.add(users_list);
        jPanel1.add(button1);
        jPanel1.add(button2);
        jPanel1.add(label);
        jPanel1.add(icon);

        //jDialog
        jDialog.setLayout(new GridLayout(0,1));
        jDialog.add(jPanel1);

        Compte data = null;
        loginForm loginForm = new loginForm(null);

        try {
            Compte compte = loginForm.getcompte(data);
            if(compte.getRole().getStatut().equals("Employ")){
               users_list.addItem(compte.getMembre().getEquipe().getProjet().getNompro());
            }
            else{
                List<Projet> projets = metierprojet.getAllBycompte(compte);
                for(Projet projet : projets){

                    users_list.addItem(projet.getNompro());

                }
            }


        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,e.getMessage(),"Error",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }


        //Visible
        jDialog.setVisible(true);

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                try{
                    name = (String) users_list.getSelectedItem();
                    projet = metierprojet.getAllByname(name);
                    loginForm loginForm = new loginForm("x");
                    Compte d = null;
                    Compte compte = loginForm.getcompte(d);
                    if(compte.getRole().getStatut().equals("Employ")){
                        projet = compte.getMembre().getEquipe().getProjet();
                        jDialog.dispose();
                        new testjormdesignerr();
                    }
                    else{
                        jDialog.dispose();
                        new testjormdesigner();
                        jDialog1.dispose();
                    }


                }catch(Exception e1){
                    JOptionPane.showConfirmDialog(null,e1.getMessage(),"Error",
                            JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
                    e1.printStackTrace();
                }


            }
        });

        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jDialog.dispose();

            }
        });

    }

    private JComboBox users_list;

    //constructeur de liaison

    public OpenprojectForm(String x){

    }

    //Fonction de laison
    public Projet getprojet(Projet projet){
        projet = this.projet;
        return projet;
    }


}
