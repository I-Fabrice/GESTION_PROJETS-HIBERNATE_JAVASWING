package ihm;

import Metier.EquipeMetier;
import entites.Equipe;
import entites.Projet;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class JDialogupequipe extends JDialog {

    JDialog jDialogupequipe = new JDialog();
    JPanel  panel         = new JPanel();
    JButton button1       = new JButton("APPLY");
    JButton button2       = new JButton("CANCEL");

    JTextField text1      = new JTextField();
    JTextArea  text2      = new JTextArea();

    JSeparator separator1 = new JSeparator();

    JLabel label1         = new JLabel();
    JLabel label2         = new JLabel("Name team");
    JLabel label3         = new JLabel("Purpose of team");

    JLabel label5         = new JLabel();


    JComboBox comboBox1   = new JComboBox();

    EquipeMetier metierequipe = new EquipeMetier();

    OpenprojectForm openprojectForm = new OpenprojectForm("r");

    List<Equipe> equipes = null;

    final UndoManager undoManager = new UndoManager();


    public  JDialogupequipe(String name){

        jDialogupequipe.setSize(600,700);
        jDialogupequipe.setLocationRelativeTo(null);
        initComponents(name);
    }

    public void clear(){
        text1.setText("");
        text2.setText("");
    }

    private void initComponents(String name){


        //TEXT1
        text1.setBackground(new Color(36,47,65));
        text1.setForeground(new Color(255,255,255));
        text1.setFont(new Font("Century Gothic",Font.PLAIN,15));
        text1.setBounds(80,120,410,30);
        text1.setBorder(null);
        text1.setCaretColor(new Color(255,255,255));
        text1.disable();

        //TEXTAREA2
        text2.setBackground(new Color(36,47,65));
        text2.setForeground(new Color(255,255,255));
        text2.setFont(new Font("Century Gothic",Font.PLAIN,15));
        text2.setBounds(80,230,410,30);
        text2.setSize(410,270);
        text2.setCaretColor(new Color(255,255,255));
        text2.setBorder(BorderFactory.createLineBorder(Color.WHITE,2,true));

        //Separator 1
        separator1.setBackground(Color.WHITE);
        separator1.setForeground(Color.WHITE);
        separator1.setBounds(80,150,410,50);


        //label1 : NewIcon
        label1.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\team_30px.PNG"));
        label1.setBounds(520,10,100,50);

        //label2 : NAME team
        label2.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label2.setBackground(new Color(36,47,65));
        label2.setForeground(new Color(204,204,204));
        label2.setBounds(80,70,150,50);

        //label3 : Purpose
        label3.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label3.setBackground(new Color(36,47,65));
        label3.setForeground(new Color(204,204,204));
        label3.setBounds(80,160,150,50);

        //label5 : Nombre de caractère
        label5.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label5.setBackground(new Color(36,47,65));
        label5.setForeground(new Color(204,204,204));
        label5.setBounds(430,490,150,50);

        //Button : OK
        button1.setBackground(new Color(97,212,195));
        button1.setForeground(new Color(255,255,255));
        button1.setBounds(80,560,100,40);
        button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button1.setBorder(new BevelBorder(BevelBorder.RAISED));
        button1.setFont(new Font("Century Gothic",Font.PLAIN,20));

        //Button : cancel
        button2.setBackground(new Color(97,212,195));
        button2.setForeground(new Color(255,255,255));
        button2.setBounds(220,560,120,40);
        button2.setBorder(new BevelBorder(BevelBorder.RAISED));
        button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button2.setFont(new Font("Century Gothic",Font.PLAIN,20));

        //Panel
        panel.setBackground(new Color(36,47,65));
        panel.setLayout(null);
        panel.add(button1);
        panel.add(button2);
        panel.add(text1);
        panel.add(text2);
        panel.add(separator1);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label5);

        //JDialog Profil
        jDialogupequipe.add(panel);
        jDialogupequipe.setVisible(true);

        /*//---- comboBox1 ----
        comboBox1.setFont(new Font("Tahoma", Font.BOLD, 15));
        comboBox1.setForeground(Color.black);
        comboBox1.setBounds(55, 80, 205, comboBox1.getPreferredSize().height);*/

        Projet projet = null;
        Projet p      = null;
        p = openprojectForm.getprojet(projet);
        try{

            Equipe equipe = metierequipe.findequipebyname(name);
            text1.setText(equipe.getNomequ());
            text2.setText(equipe.getObjequ());

        }catch(Exception n){
            n.printStackTrace();
        }

        text1.getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undoManager.addEdit(e.getEdit());
            }
        });

        text2.getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undoManager.addEdit(e.getEdit());
            }
        });

        text2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);

                label5.setText( text2.getText().length() + " /250" );

                if(text2.getText().length() == 250){
                    label5.setForeground(Color.red);
                    e.consume();
                }
                if(text2.getText().length() <250){
                    label5.setForeground(new Color(204,204,204));
                    text2.setEditable(true);
                }

            }
        });

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                String name = text1.getText();
                String objectif = text2.getText();

                Projet data = null;
                Projet projet = openprojectForm.getprojet(data);

                Equipe equipe1 = new Equipe(null,name,objectif,null,null,null);

                try{
                    Equipe equ = metierequipe.findequipebyname(name);

                    metierequipe.updateEquipe(equ,equipe1);
                    JOptionPane.showConfirmDialog(null, "Success", "Information",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    jDialogupequipe.dispose();
                    new testjormdesigner();

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
                //undoManager.undo();
                jDialogupequipe.dispose();
            }
        });
    }


}
