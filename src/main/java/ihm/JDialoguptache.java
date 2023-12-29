package ihm;

import Metier.TacheMetier;
import entites.Projet;
import entites.Tache;
import javafx.scene.control.Button;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

public class JDialoguptache extends JDialog {


    JDialog jDialoguptache = new JDialog();
    JPanel  panel         = new JPanel();
    JButton button1       = new JButton("Apply");
    JButton button2       = new JButton("CANCEL");

    JTextField text1      = new JTextField();
    JTextField text2      = new JTextField();
    JTextField text3      = new JTextField();
    JTextField text4      = new JTextField();

    JSeparator separator1 = new JSeparator();
    JSeparator separator2 = new JSeparator();
    JSeparator separator3 = new JSeparator();
    JSeparator separator4 = new JSeparator();

    JLabel label1         = new JLabel();
    JLabel label2         = new JLabel("Name task");
    JLabel label3         = new JLabel("Type of task");
    JLabel label4         = new JLabel("End date");
    JLabel label5         = new JLabel("Description");

    JLabel label6         = new JLabel("Description");
    JLabel label7         = new JLabel("Description");
    JLabel label8         = new JLabel("Description");
    JLabel label9         = new JLabel("Description");

    JLabel label10        = new JLabel("Would you delete task?");

    JCheckBox checkBox1   = new JCheckBox("To do");
    JCheckBox checkBox2   = new JCheckBox("In progress");
    JCheckBox checkBox3   = new JCheckBox("Complete");

    JRadioButton radioButton1 = new JRadioButton("To do");
    JRadioButton radioButton2 = new JRadioButton("In progress");
    JRadioButton radioButton3 = new JRadioButton("Complete");
    ButtonGroup  buttonGroup  = new ButtonGroup();

    JComboBox jComboBox1  = new JComboBox();
    JComboBox jComboBox2  = new JComboBox();
    JComboBox jComboBox3  = new JComboBox();

    public  JDialoguptache(JLabel label,JFrame frame){

        jDialoguptache.setSize(600,700);
        jDialoguptache.setLocationRelativeTo(null);
        initComponents(label,frame);
    }


    public void clear(){
        text1.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");

        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        checkBox3.setSelected(false);
    }
    TacheMetier metiertache = new TacheMetier();

    OpenprojectForm openprojectForm = new OpenprojectForm("x");


    private void initComponents(final JLabel labl, final JFrame frme) {


        //TEXT1
        text1.setBackground(new Color(36, 47, 65));
        text1.setForeground(new Color(255, 255, 255));
        text1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        text1.setBounds(80, 120, 410, 30);
        text1.setBorder(null);
        text1.setCaretColor(new Color(255, 255, 255));
        text1.disable();

        //TEXT2
        text2.setBackground(new Color(36, 47, 65));
        text2.setForeground(new Color(255, 255, 255));
        text2.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        text2.setBounds(80, 220, 410, 30);
        text2.setBorder(null);
        text2.setCaretColor(new Color(255, 255, 255));

        //TEXT3
        text3.setBackground(new Color(36, 47, 65));
        text3.setForeground(new Color(255, 255, 255));
        text3.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        text3.setBounds(80, 320, 410, 30);
        text3.setBorder(null);
        text3.setCaretColor(new Color(255, 255, 255));

        //TEXT4

        text4.setBackground(new Color(36, 47, 65));
        text4.setForeground(new Color(255, 255, 255));
        text4.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        text4.setBounds(80, 420, 410, 30);
        text4.setBorder(null);
        text4.setCaretColor(new Color(255, 255, 255));

        //Separator 1
        separator1.setBackground(Color.WHITE);
        separator1.setForeground(Color.WHITE);
        separator1.setBounds(80, 150, 410, 50);

        //Separator 2
        separator2.setBackground(Color.WHITE);
        separator2.setForeground(Color.WHITE);
        separator2.setBounds(80, 250, 410, 50);

        //Separator 3
        separator3.setBackground(Color.WHITE);
        separator3.setForeground(Color.WHITE);
        separator3.setBounds(80, 350, 410, 50);

        //Separator 4
        separator4.setBackground(Color.WHITE);
        separator4.setForeground(Color.WHITE);
        separator4.setBounds(80, 450, 410, 50);


        //label1 : NewIcon
        label1.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\work_authorisation_48px.PNG"));
        label1.setBounds(520, 10, 100, 50);


        //label2 : Name task
        label2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        label2.setBackground(new Color(36, 47, 65));
        label2.setForeground(new Color(204, 204, 204));
        label2.setBounds(80, 70, 150, 50);

        //label3 : Type of task
        label3.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        label3.setBackground(new Color(36, 47, 65));
        label3.setForeground(new Color(204, 204, 204));
        label3.setBounds(80, 160, 150, 50);

        //label4 : End date
        label4.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        label4.setBackground(new Color(36, 47, 65));
        label4.setForeground(new Color(204, 204, 204));
        label4.setBounds(80, 260, 150, 50);

        //label5 : Description
        label5.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        label5.setBackground(new Color(36, 47, 65));
        label5.setForeground(new Color(204, 204, 204));
        label5.setBounds(80, 360, 150, 50);

        //label6 :
        label6.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        label6.setBackground(new Color(36, 47, 65));
        label6.setForeground(new Color(204, 204, 204));
        label6.setBounds(80, 360, 150, 50);

        //label7 :
        label7.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        label7.setBackground(new Color(36, 47, 65));
        label7.setForeground(new Color(204, 204, 204));
        label7.setBounds(80, 360, 150, 50);

        //label8 :
        label8.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        label8.setBackground(new Color(36, 47, 65));
        label8.setForeground(new Color(204, 204, 204));
        label8.setBounds(80, 360, 150, 50);

        //label9 :
        label9.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        label9.setBackground(new Color(36, 47, 65));
        label9.setForeground(new Color(204, 204, 204));
        label9.setBounds(80, 360, 150, 50);

        //label10
        label10.setBackground(new Color(37,47,65));
        label10.setForeground(new Color(204,204,204));
        label10.setFont(new Font("Century Gothic",Font.PLAIN,15));
        label10.setBounds(350,585,170,30);
        label10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        //CheckBox1 : To do
        checkBox1.setBackground(new Color(36, 47, 65));
        checkBox1.setForeground(new Color(255, 255, 255));
        checkBox1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        checkBox1.setBounds(80, 485, 100, 30);
        checkBox1.setBorder(null);

        //CheckBox2 : In progress
        checkBox2.setBackground(new Color(36, 47, 65));
        checkBox2.setForeground(new Color(255, 255, 255));
        checkBox2.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        checkBox2.setBounds(180, 485, 100, 30);
        checkBox2.setBorder(null);

        //CheckBox3 :  Complete
        checkBox3.setBackground(new Color(36, 47, 65));
        checkBox3.setForeground(new Color(255, 255, 255));
        checkBox3.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        checkBox3.setBounds(310, 485, 100, 30);
        checkBox3.setBorder(null);

        //radioButton1 : To do
        radioButton1.setBackground(new Color(36, 47, 65));
        radioButton1.setForeground(new Color(255, 255, 255));
        radioButton1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        radioButton1.setBounds(80, 485, 100, 30);
        radioButton1.setBorder(null);

        //radioButton2 : In progress
        radioButton2.setBackground(new Color(36, 47, 65));
        radioButton2.setForeground(new Color(255, 255, 255));
        radioButton2.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        radioButton2.setBounds(180, 485, 100, 30);
        radioButton2.setBorder(null);

        //radioButton3 :  Complete
        radioButton3.setBackground(new Color(36, 47, 65));
        radioButton3.setForeground(new Color(255, 255, 255));
        radioButton3.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        radioButton3.setBounds(310, 485, 100, 30);
        radioButton3.setBorder(null);

        //ButtonGroup
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        //JCombobox1

        jComboBox1.addItem("2021");
        jComboBox1.addItem("2022");
        jComboBox1.addItem("2023");
        jComboBox1.addItem("2024");
        jComboBox1.addItem("2025");
        jComboBox1.addItem("2026");
        jComboBox1.setBounds(80, 320, 100, 30);
        jComboBox1.setBackground(new Color(36, 47, 65));
        jComboBox1.setForeground(new Color(255, 255, 255));
        jComboBox1.setFont(new Font("Century Gothic", Font.PLAIN, 15));

        JScrollPane pane = new JScrollPane(jComboBox1,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //jComboBox1.addItem(pane);
        //JCombobox2

        jComboBox2.addItem("01");
        jComboBox2.addItem("02");
        jComboBox2.addItem("03");
        jComboBox2.addItem("04");
        jComboBox2.addItem("05");
        jComboBox2.addItem("06");
        jComboBox2.addItem("07");
        jComboBox2.addItem("08");
        jComboBox2.addItem("09");
        jComboBox2.addItem("10");
        jComboBox2.addItem("11");
        jComboBox2.addItem("12");
        jComboBox2.setBounds(195, 320, 50, 30);
        jComboBox2.setBackground(new Color(36, 47, 65));
        jComboBox2.setForeground(new Color(255, 255, 255));
        jComboBox2.setFont(new Font("Century Gothic", Font.PLAIN, 15));


        JScrollPane pane2 = new JScrollPane(jComboBox2,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        // jComboBox2.addItem(pane2);
        //JCombobox3

        jComboBox3.addItem("01");
        jComboBox3.addItem("02");
        jComboBox3.addItem("03");
        jComboBox3.addItem("04");
        jComboBox3.addItem("05");
        jComboBox3.addItem("06");
        jComboBox3.addItem("07");
        jComboBox3.addItem("08");
        jComboBox3.addItem("09");
        jComboBox3.addItem("10");
        jComboBox3.addItem("11");
        jComboBox3.addItem("12");
        jComboBox3.addItem("13");
        jComboBox3.addItem("14");
        jComboBox3.addItem("15");
        jComboBox3.addItem("16");
        jComboBox3.addItem("17");
        jComboBox3.addItem("18");
        jComboBox3.addItem("19");
        jComboBox3.addItem("20");
        jComboBox3.addItem("21");
        jComboBox3.addItem("22");
        jComboBox3.addItem("23");
        jComboBox3.addItem("24");
        jComboBox3.addItem("25");
        jComboBox3.addItem("26");
        jComboBox3.addItem("27");
        jComboBox3.addItem("28");
        jComboBox3.addItem("29");
        jComboBox3.addItem("30");
        jComboBox3.addItem("31");
        jComboBox3.setBounds(260, 320, 50, 30);
        jComboBox3.setBackground(new Color(36, 47, 65));
        jComboBox3.setForeground(new Color(255, 255, 255));
        jComboBox3.setFont(new Font("Century Gothic", Font.PLAIN, 15));

        JScrollPane pane3 = new JScrollPane(jComboBox3,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //jComboBox3.addItem(pane3);

        //Button : OK
        button1.setBackground(new Color(97, 212, 195));
        button1.setForeground(new Color(255, 255, 255));
        button1.setBounds(80, 580, 100, 40);
        button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button1.setBorder(new BevelBorder(BevelBorder.RAISED));
        button1.setFont(new Font("Century Gothic", Font.PLAIN, 20));

        //Button : cancel
        button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button2.setBackground(new Color(97, 212, 195));
        button2.setForeground(new Color(255, 255, 255));
        button2.setBounds(220, 580, 120, 40);
        button2.setBorder(new BevelBorder(BevelBorder.RAISED));
        button2.setFont(new Font("Century Gothic", Font.PLAIN, 20));


        //Panel
        panel.setBackground(new Color(36, 47, 65));
        panel.setLayout(null);
        panel.add(button1);
        panel.add(button2);
        panel.add(text1);
        panel.add(text2);
        //panel.add(text3);
        panel.add(text4);
        panel.add(separator1);
        panel.add(separator2);
        //panel.add(separator3);
        panel.add(separator4);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        //panel.add(label10);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        panel.add(jComboBox1);
        panel.add(jComboBox2);
        panel.add(jComboBox3);

        //JDialog Profil
        jDialoguptache.add(panel);
        jDialoguptache.setVisible(true);

        checkBox1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                checkBox2.setSelected(false);
                checkBox3.setSelected(false);
            }
        });

        checkBox2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkBox1.setSelected(false);
                checkBox3.setSelected(false);
            }
        });

        checkBox3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkBox1.setSelected(false);
                checkBox2.setSelected(false);

            }
        });

        final String s = labl.getText();


        try{
            Tache tche = metiertache.findtachesbyname(s);
            text1.setText(tche.getNomtac());
            text2.setText(tche.getTyptac());
            text4.setText(tche.getDesctac());
            String SEPARATEUR = "-";

            String mots[] = tche.getStatut().split(SEPARATEUR);
            String years  = mots[0];
            String mouth  = mots[1];
            String day    = mots[2];
            for (int i = 0; i < mots.length; i++) {
                System.out.println(mots[i]);
            }
            jComboBox1.setSelectedItem(years);
            jComboBox2.setSelectedItem(mouth);
            jComboBox3.setSelectedItem(day);


            if(tche.getStatut().trim().equals("A Faire")){
                checkBox1.setSelected(true);
            }
            if(tche.getStatut().trim().equals("En cours")){
                checkBox2.setSelected(true);
            }
            if(tche.getStatut().trim().equals("Terminer")){
                checkBox3.setSelected(true);
            }



        }catch(Exception e){
            e.printStackTrace();
        }

        label10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                final String w = labl.getText();
                try{

                    int res = JOptionPane.showConfirmDialog(jDialoguptache,"Are you sure?");
                    if(res == JOptionPane.YES_OPTION)
                    {
                        Tache tache = metiertache.findtachesbyname(w);
                        metiertache.deleteTache(tache);
                        jDialoguptache.dispose();
                        new testjormdesigner();
                        frme.dispose();
                    }


                }catch (Exception ed){
                    ed.printStackTrace();
                }

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                label10.setForeground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                label10.setForeground(new Color(204,204,204));
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                String name = text1.getText();
                String type = text2.getText();
                //String date = text3.getText();
                String years = (String) jComboBox1.getSelectedItem();
                String mouth = (String) jComboBox2.getSelectedItem();
                String day = (String) jComboBox3.getSelectedItem();
                String desc = text4.getText();

                Date date = new Date();
                String dte = "" + date;
                String datas[] = dte.split(" ");
                String d = null;
                int h = date.getMonth() + 1;
                String m = 0 + "" + h;

                d = "" + datas[2];
                Integer di = Integer.parseInt(d);
                Integer mi = Integer.parseInt(m);

                Integer dii = Integer.parseInt(day);
                Integer mii = Integer.parseInt(mouth);


                if(mii>=mi && dii>di || mii>mi && dii<=dii || mii>mi && dii>=dii) {


                    String Date = years + "-" + mouth + "-" + day;

                    boolean value1 = radioButton1.isSelected();
                    boolean value2 = radioButton2.isSelected();
                    boolean value3 = radioButton3.isSelected();

                    String statut = "";

                    if (value1 == true) {
                        statut = "A Faire";
                    }
                    if (value2 == true) {
                        statut = "En cours";
                    }

                    if (value3 == true) {
                        statut = "Terminer";
                    }

                    Projet data = null;


                    try {

                        Tache tache1 = new Tache(null, name, type, desc, Date, statut, null, null);
                        // Projet projet = openprojectForm.getprojet(data);
                        Tache tche = metiertache.findtachesbyname(s);
                        metiertache.updateTache(tache1,tche);
                        JOptionPane.showConfirmDialog(null, "Success", "Information",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        clear();
                        jDialoguptache.dispose();
                        frme.dispose();
                        new testjormdesigner();

                    } catch (Exception e1) {
                        JOptionPane.showConfirmDialog(null, e1.getMessage(), "Error",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                        e1.printStackTrace();
                    }
                }
                else {
                    JOptionPane.showConfirmDialog(jDialoguptache, "For optimization reasons, end date of the task must be higher than the current date", "Information",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jDialoguptache.dispose();
            }
        });
    }
}
