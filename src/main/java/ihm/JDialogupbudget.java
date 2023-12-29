package ihm;

import Metier.BudgetMetier;
import entites.Budget;
import entites.Compte;
import entites.Projet;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class JDialogupbudget extends JDialog {

    JDialog jDialogupbudget = new JDialog();
    JPanel  panel         = new JPanel();
    JButton button1       = new JButton("Apply");
    JButton button2       = new JButton("CANCEL");


    JSeparator separator1 = new JSeparator();
    JSeparator separator2 = new JSeparator();

    JLabel label1         = new JLabel();
    JLabel label2         = new JLabel("ALLOCATED BUDGET");
    JLabel label3         = new JLabel("SPENT BUDGET");
    JLabel label4         = new JLabel();
    JLabel label5         = new JLabel("DEVISE");

    JComboBox comboBox    = new JComboBox();


    BudgetMetier budgetMetier = new BudgetMetier();

    Budget value = null;

    JTextField text1      = new JTextField();
    JTextField text2      = new JTextField();

    OpenprojectForm openprojectForm = new OpenprojectForm("");

    public void clear(){
        text1.setText("");
        text2.setText("");
    }


    public  JDialogupbudget() {

        jDialogupbudget.setSize(600, 700);
        jDialogupbudget.setLocationRelativeTo(null);
        initComponents();
    }
        public void initComponents(){


            Projet datas = null;
            Projet projet = openprojectForm.getprojet(datas);

            try {

                List<Budget> data = budgetMetier.gettallbudgetbyprojet(projet);
                for (Budget budget : data) {
                    value = budget;
                }
            }catch (Exception e5){
                e5.printStackTrace();
                JOptionPane.showConfirmDialog(null,e5.getMessage(),"Error",
                        JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }

            String budgetall = value.getBudallpro()+"";
            String budgetdep = value.getBudep()+"";

            text1.setText(budgetall);
            text2.setText(budgetdep);

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

            //label4 : POURCENTAGE DEPENSER

            label4.setFont(new Font("Century Gothic",Font.PLAIN,18));
            label4.setBackground(new Color(36,47,65));
            label4.setForeground(Color.CYAN);
            label4.setBounds(80,455,250,50);
            Double res = null;
            try{
                res = budgetMetier.pourcentageDep(value);
            }catch (Exception z){
                z.printStackTrace();
            }

            label4.setText(res+" %");

            //
            label5.setFont(new Font("Century Gothic",Font.PLAIN,18));
            label5.setBackground(new Color(36,47,65));
            label5.setForeground(new Color(204,204,204));
            label5.setBounds(80,365,150,30);

            //Jcombox : DEVISE

            comboBox.setFont(new Font("Century Gothic",Font.BOLD,15));
            comboBox.setForeground(new Color(204,204,204));
            comboBox.setBackground(new Color(60,63,65));
            comboBox.setBounds(80,410,280,36);

            comboBox.addItem("Dollar américain");
            comboBox.addItem("Euro");
            comboBox.addItem("Dirham marocain");
            comboBox.getSelectedIndex();

            if(value.getDevise().trim().equals("Dollar américain")){
                comboBox.setSelectedItem("Dollar américain");
            }
            if(value.getDevise().trim().equals("Euro")){
                comboBox.setSelectedItem("Euro");
            }
            if(value.getDevise().trim().equals("Dirham marocain")){
                comboBox.setSelectedItem("Dirham marocain");
            }

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
            panel.add(label4);
            panel.add(label5);
            panel.add(comboBox);


            //JDialog Profil
            jDialogupbudget.add(panel);
            jDialogupbudget.setVisible(true);

            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    jDialogupbudget.dispose();
                }
            });

            comboBox.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Double budal = new Double(text1.getText());
                    Double budep = new Double(text2.getText());

                    String devise    = (String) comboBox.getSelectedItem();

                    Double res1 = null;
                    Double res2 = null;
                    if(value.getDevise().trim().equals("Dollar américain") && devise.trim().equals("Euro")){

                        res1 = (budal * 0.84)/(1.0);
                        res2 = (budep * 0.84)/(1.0);

                        Double rese = null;
                        rese = (Double) (res2*100)/(res1);
                        label4.setText(rese+" %");

                        String s1 = res1+"";
                        String s2 = res2+"";
                        text1.setText(s1);
                        text2.setText(s2);

                        value.setDevise("Euro");
                    }
                    if(value.getDevise().trim().equals("Dollar américain") && devise.trim().equals("Dirham marocain")){
                        res1 = (budal * 8.93)/(1.0);
                        res2 = (budep * 8.93)/(1.0);

                        Double rese = null;
                        rese = (Double) (res2*100)/(res1);
                        label4.setText(rese+" %");

                        String s1 = res1+"";
                        String s2 = res2+"";
                        text1.setText(s1);
                        text2.setText(s2);

                        value.setDevise("Dirham marocain");
                    }

                    if(value.getDevise().trim().equals("Euro") && devise.trim().equals("Dollar américain")){

                        res1 = (budal * 1.18)/(1.0);
                        res2 = (budep * 1.18)/(1.0);

                        Double rese = null;
                        rese = (Double) (res2*100)/(res1);
                        label4.setText(rese+" %");

                        String s1 = res1+"";
                        String s2 = res2+"";
                        text1.setText(s1);
                        text2.setText(s2);

                        value.setDevise("Dollar américain");

                    }
                    if(value.getDevise().trim().equals("Euro") && devise.trim().equals("Dirham marocain")){

                        res1 = (budal * 10.58)/(1.0);
                        res2 = (budep * 10.58)/(1.0);

                        Double rese = null;
                        rese = (Double) (res2*100)/(res1);
                        label4.setText(rese+" %");

                        String s1 = res1+"";
                        String s2 = res2+"";
                        text1.setText(s1);
                        text2.setText(s2);



                        value.setDevise("Dirham marocain");
                    }

                    if(value.getDevise().trim().equals("Dirham marocain") && devise.trim().equals("Dollar américain")){
                        res1 = (budal * 0.11)/(1.0);
                        res2 = (budep * 0.11)/(1.0);

                        Double rese = null;
                        rese = (Double) (res2*100)/(res1);
                        label4.setText(rese+" %");

                        String s1 = res1+"";
                        String s2 = res2+"";
                        text1.setText(s1);
                        text2.setText(s2);


                        value.setDevise("Dollar américain");

                    }

                    if(value.getDevise().trim().equals("Dirham marocain") && devise.trim().equals("Euro")){

                        res1 = (budal * 0.094)/(1.0);
                        res2 = (budep * 0.094)/(1.0);

                        Double rese = null;
                        rese = (Double) (res2*100)/(res1);
                        label4.setText(rese+" %");

                        String s1 = res1+"";
                        String s2 = res2+"";
                        text1.setText(s1);
                        text2.setText(s2);



                        value.setDevise("Euro");

                    }
                }
            });

            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);

                    Double budgetall = new Double(text1.getText()) ;
                    Double budgetdep = new Double(text2.getText());

                    String devise    = (String) comboBox.getSelectedItem();
                    if(budgetdep<=budgetall){
                        Budget budget1 = new Budget(null,budgetall,budgetdep,devise,null);
                        Projet datas = null;
                        Projet projet = openprojectForm.getprojet(datas);


                        try{

                            List<Budget> data = budgetMetier.gettallbudgetbyprojet(projet);
                            for(Budget budget : data )
                            {
                                value = budget;
                            }

                            budgetMetier.updateBudget(value.getProjet(),budget1);
                            JOptionPane.showConfirmDialog(null, "Success", "Information",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                            clear();
                            jDialogupbudget.dispose();

                        }catch(Exception e1){
                            JOptionPane.showConfirmDialog(null,e1.getMessage(),"Error",
                                    JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
                            e1.printStackTrace();
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

