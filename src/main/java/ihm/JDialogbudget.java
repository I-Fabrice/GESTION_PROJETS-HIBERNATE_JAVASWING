package ihm;

import Metier.BudgetMetier;
import entites.Budget;
import entites.Compte;
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

public class JDialogbudget extends JDialog {

    JDialog jDialogbudget = new JDialog();
    JPanel  panel         = new JPanel();
    JButton button1       = new JButton("OK");
    JButton button2       = new JButton("CANCEL");

    JTextField text1      = new JTextField();
    JTextField text2      = new JTextField();

    JSeparator separator1 = new JSeparator();
    JSeparator separator2 = new JSeparator();

    JLabel label1         = new JLabel();
    JLabel label2         = new JLabel("ALLOCATED BUDGET");
    JLabel label3         = new JLabel("SPENT BUDGET");
    JLabel label5         = new JLabel("DEVISE");

    JComboBox comboBox    = new JComboBox();


    BudgetMetier budgetMetier = new BudgetMetier();

    OpenprojectForm openprojectForm = new OpenprojectForm("");

    UndoManager undoManager = new UndoManager();



    public void clear(){
        text1.setText("");
        text2.setText("");
    }
    public  JDialogbudget(){

        jDialogbudget.setSize(600,700);
        jDialogbudget.setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents(){


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

        //TEXT1
        text1.setBackground(new Color(36,47,65));
        text1.setForeground(new Color(255,255,255));
        text1.setFont(new Font("Century Gothic",Font.PLAIN,15));
        text1.setBounds(80,200,410,30);
        text1.setBorder(null);
        text1.setCaretColor(new Color(255,255,255));

        text1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // ignorer l'événement
                }
            }
        });


        //TEXT2
        text2.setBackground(new Color(36,47,65));
        text2.setForeground(new Color(255,255,255));
        text2.setFont(new Font("Century Gothic",Font.PLAIN,15));
        text2.setBounds(80,300,410,30);
        text2.setBorder(null);
        text2.setCaretColor(new Color(255,255,255));

        text2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // ignorer l'événement
                }

            }
        });



        //Separator 1
        separator1.setBackground(Color.WHITE);
        separator1.setForeground(Color.WHITE);
        separator1.setBounds(80,230,410,50);

        //Separator 2
        separator2.setBackground(Color.WHITE);
        separator2.setForeground(Color.WHITE);
        separator2.setBounds(80,330,410,50);


        //label1 : NewIcon
        label1.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\fund_accounting_48px.PNG"));
        label1.setBounds(520,50,80,50);


        //label2 : ALLOCATED BUDGET
        label2.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label2.setBackground(new Color(36,47,65));
        label2.setForeground(new Color(204,204,204));
        label2.setBounds(80,145,230,40);

        //label3 : SPENT BUDGET
        label3.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label3.setBackground(new Color(36,47,65));
        label3.setForeground(new Color(204,204,204));
        label3.setBounds(80,240,150,50);


        //
        label5.setFont(new Font("Century Gothic",Font.PLAIN,18));
        label5.setBackground(new Color(36,47,65));
        label5.setForeground(new Color(204,204,204));
        label5.setBounds(80,355,150,30);

        //Jcombox : DEVISE

        comboBox.setFont(new Font("Century Gothic",Font.BOLD,15));
        comboBox.setForeground(new Color(204,204,204));
        comboBox.setBackground(new Color(60,63,65));
        comboBox.setBounds(80,410,280,36);

        comboBox.addItem("Dollar américain");
        comboBox.addItem("Euro");
        comboBox.addItem("Dirham marocain");

        //Button : OK
        button1.setBackground(new Color(97,212,195));
        button1.setForeground(new Color(255,255,255));
        button1.setBounds(230,560,100,40);
        button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button1.setBorder(new BevelBorder(BevelBorder.RAISED));
        button1.setFont(new Font("Century Gothic",Font.PLAIN,20));

        //Button : cancel
        button2.setBackground(new Color(97,212,195));
        button2.setForeground(new Color(255,255,255));
        button2.setBounds(370,560,120,40);
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
        panel.add(separator2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label5);
        panel.add(comboBox);


        //JDialog Profil
        jDialogbudget.add(panel);
        jDialogbudget.setVisible(true);

        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jDialogbudget.dispose();
            }
        });

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Double budgetall = new Double(text1.getText()) ;
                Double budgetdep = new Double(text2.getText());
                Budget budget1   = null;
                String devise    = (String) comboBox.getSelectedItem();

                if(budgetdep<=budgetall)
                {
                    budget1 = new Budget(null,budgetall,budgetdep,devise,null);
                    Projet data = null;
                    Projet projet = openprojectForm.getprojet(data);
                    try{

                        budgetMetier.creationBudget(projet,budget1);
                        JOptionPane.showConfirmDialog(null, "Success", "Information",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        clear();
                        jDialogbudget.dispose();

                    }catch(Exception e1){
                        JOptionPane.showConfirmDialog(null,e1.getMessage(),"Error",
                                JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
                        e1.printStackTrace();
                        jDialogbudget.dispose();
                    }

                }
                else{
                    JOptionPane.showConfirmDialog(null,"Spent budget must be less than the budget allocated","Error",
                            JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
                }



            }
        });
    }
}
