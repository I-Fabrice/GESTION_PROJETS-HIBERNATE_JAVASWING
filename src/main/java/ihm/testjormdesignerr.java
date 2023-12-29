/*
 * Created by JFormDesigner on Thu Jun 10 12:03:02 CEST 2021
 */

package ihm;

import Metier.EquipeMetier;
import Metier.TacheMetier;
import entites.Equipe;
import entites.Projet;
import entites.Tache;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorEvent;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

/**
 * @author unknown
 */
public class testjormdesignerr {

    private JDialogequipe jDialogequipe;
    private JDialogbudget jDialogbudget=null;
    private JDialogtache jDialogtache=null;

    public testjormdesignerr() {
        initComponents();
        init();
    }

    public testjormdesignerr(String x) {

    }

    private void menuItem5ActionPerformed(ActionEvent e) {
        // TODO add your code here
        new JDialogprofil();
    }

    private void menuItem8ActionPerformed(ActionEvent e) {
        // TODO add your code here
        int res = JOptionPane.showConfirmDialog(frame, "Are you sure?");

        if (res == JOptionPane.YES_OPTION) {
            frame.dispose();
        }
    }

    private void menuItem7ActionPerformed(ActionEvent e) {
        // TODO add your code here
        new JDialogupproject();
    }

    private void menuItem4ActionPerformed(ActionEvent e) {
        // TODO add your code here
        new Firstform();
        frame.dispose();

    }

    private void menuItem6ActionPerformed(ActionEvent e) {
        // TODO add your code here
        int res = JOptionPane.showConfirmDialog(frame, "Are you sure?");

        if (res == JOptionPane.YES_OPTION) {
            frame.dispose();
        }
    }

    private void menuItem1ActionPerformed(ActionEvent e) {
        // TODO add your code here
       jDialogtache = new JDialogtache(frame);
    }

    private void menuItem2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        jDialogequipe = new JDialogequipe(frame);

    }

    private void menuItem3ActionPerformed(ActionEvent e) {
        // TODO add your code here
       jDialogbudget  = new JDialogbudget();
    }

    private void menu8ActionPerformed(ActionEvent e) {
        // TODO add your code here
        //new JDialogupbudget();
    }

    private void menuItem17ActionPerformed(ActionEvent e) {
        // TODO add your code here
        new JDialogupbudget();
    }


    private void comboBox1ItemStateChanged(ItemEvent e) {
        // TODO add your code here

    }

    private void comboBox1ActionPerformed(ActionEvent e) {
        // TODO add your code here

        final TacheMetier metiertache = new TacheMetier();
        final EquipeMetier metierequipe = new EquipeMetier();
        EquipeMetier metierEquipe = new EquipeMetier();
        TacheMetier metierTache = new TacheMetier();
        OpenprojectForm openprojectForm = new OpenprojectForm("x");
        Projet projet = null;
        Projet p = openprojectForm.getprojet(projet);


        //======== scrollPane1 ========


        //======== panel2 ========


        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(0, 3));

        //======== panel3 ========

        JPanel panel3 = new JPanel();
        panel3.setLayout(null);

        //---- label1 ----
        label1.setText("A  FAIRE");
        label1.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel3.add(label1);
        label1.setBounds(25, 30, 100, 25);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for (int i = 0; i < panel3.getComponentCount(); i++) {
                Rectangle bounds = panel3.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = panel3.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            panel3.setMinimumSize(preferredSize);
            panel3.setPreferredSize(preferredSize);
        }

        panel2.add(panel3);

        //======== panel4 ========

        JPanel panel4 = new JPanel();
        panel4.setLayout(null);

        //---- label2 ----
        label2.setText("EN COURS");
        label2.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel4.add(label2);
        label2.setBounds(25, 30, 105, 25);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for (int i = 0; i < panel4.getComponentCount(); i++) {
                Rectangle bounds = panel4.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = panel4.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            panel4.setMinimumSize(preferredSize);
            panel4.setPreferredSize(preferredSize);
        }

        panel2.add(panel4);

        //======== panel5 ========

        JPanel panel5 = new JPanel();
        panel5.setLayout(null);

        //---- label6 ----
        label6.setText("TERMINER");
        label6.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel5.add(label6);
        label6.setBounds(25, 30, 105, 25);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for (int i = 0; i < panel5.getComponentCount(); i++) {
                Rectangle bounds = panel5.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = panel5.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            panel5.setMinimumSize(preferredSize);
            panel5.setPreferredSize(preferredSize);
        }

        panel2.add(panel5);

        scrollPane1.setViewportView(panel2);
        splitPane1.setRightComponent(scrollPane1);


        try {


            String nameq = (String) comboBox1.getSelectedItem();
            Equipe eq = metierEquipe.findequipebyname(nameq);
            List<Tache> data = metierTache.findtacheByequipe(eq);

            int z = 0;
            int o = 0;
            int v = 0;

            for (Tache tache : data) {


                if (tache.getStatut().trim().equals("A Faire")) {


                    JSeparator separator5 = new JSeparator();
                    separator5.setBackground(Color.WHITE);
                    separator5.setForeground(new Color(60, 63, 65));

                    final JPanel panel6 = new JPanel(null);
                    panel6.setBorder(new BevelBorder(BevelBorder.RAISED));
                    panel6.setBounds(20, 80 + z, 245, 160);
                    panel6.setBackground(new Color(204, 204, 204));

                    final JLabel label10 = new JLabel();
                    label10.setBounds(15, 13, 150, 30);
                    label10.setFont(new Font("Tahoma", Font.BOLD, 17));
                    label10.setForeground(new Color(0, 128, 255, 200));
                    label10.setText(tache.getNomtac());
                    panel6.add(label10);
                    panel6.add(separator5);
                    separator5.setBounds(15, 55, 200, 5);

                    //---- label2 ----
                    if (tache.getEquipe() == null) {
                        JLabel label2 = new JLabel();
                        label2.setText(" No Team");
                        label2.setFont(new Font("Tahoma", Font.PLAIN, 16));
                        label2.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\team_skin_type_7_48px.png"));
                        panel6.add(label2);
                        label2.setBounds(20, 75, 115, label2.getPreferredSize().height);
                        label2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                        label2.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                super.mouseClicked(e);
                                String w = label10.getText();
                                try {

                                    String res = JOptionPane.showInputDialog(frame, "Enter Team name");
                                    if (res.trim().equals("")) {

                                        JOptionPane.showMessageDialog(frame, "The field is Empty");
                                    }
                                    if (res != null) {

                                        Tache tache = metiertache.findtachesbyname(w);
                                        Equipe equipe = metierequipe.findequipebyname(res);
                                        tache.setEquipe(equipe);
                                        metiertache.updateTache(tache, tache);
                                        frame.dispose();
                                        new testjormdesignerr();
                                    }

                                } catch (Exception ed) {
                                    ed.printStackTrace();
                                    JOptionPane.showConfirmDialog(null, ed.getMessage(), "Error",
                                            JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        });
                    }
                    if (tache.getEquipe() != null) {
                        JLabel label2 = new JLabel();
                        label2.setText(" " + tache.getEquipe().getNomequ());
                        label2.setFont(new Font("Tahoma", Font.PLAIN, 16));
                        label2.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\team_skin_type_7_48px.png"));
                        panel6.add(label2);
                        label2.setBounds(20, 75, 115, label2.getPreferredSize().height);
                        label2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                        label2.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                super.mouseClicked(e);
                                String w = label10.getText();
                                try {

                                    String res = JOptionPane.showInputDialog(frame, "Enter Team name");
                                    if (res.trim().equals("")) {
                                        JOptionPane.showMessageDialog(frame, "The field is Empty");
                                    }
                                    if (res != null) {

                                        Tache tache = metiertache.findtachesbyname(w);
                                        Equipe equipe = metierequipe.findequipebyname(res);
                                        tache.setEquipe(equipe);
                                        metiertache.updateTache(tache, tache);
                                        frame.dispose();
                                        new testjormdesignerr();
                                    }

                                } catch (Exception ed) {
                                    ed.printStackTrace();
                                    JOptionPane.showConfirmDialog(null, ed.getMessage(), "Error",
                                            JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        });
                    }


                    //---- label6 ----
                    JLabel label6 = new JLabel();
                    label6.setText(" " + tache.getFto());
                    label6.setFont(new Font("Tahoma", Font.PLAIN, 16));
                    label6.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\error_48px.png"));
                    panel6.add(label6);
                    label6.setBounds(new Rectangle(new Point(20, 110), label6.getPreferredSize()));

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for (int i = 0; i < panel6.getComponentCount(); i++) {
                            Rectangle bounds = panel6.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel6.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel6.setMinimumSize(preferredSize);
                        panel6.setPreferredSize(preferredSize);
                    }


                    panel3.add(panel6);
                    panel6.setBounds(20, 80 + z, 245, 160);

                    panel3.add(panel6);
                    z = z + 185;

                    label10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    label10.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            super.mouseClicked(e);


                            if(SwingUtilities.isLeftMouseButton(e) && e.getClickCount() == 1){
                                new JDialoguptache(label10, frame);
                            }

                            if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1){

                                //JMenuItem : MenuItem30
                                JMenuItem menuItem30 = new JMenuItem("Delete Team");

                                //JPopupMenu : popupMenu
                                final JPopupMenu popupMenu = new JPopupMenu();
                                popupMenu.setForeground(new Color(204,204,204));
                                popupMenu.setBackground(new Color(60,63,65));
                                popupMenu.setFont(new Font("Tahoma",Font.BOLD,15));
                                panel6.add(popupMenu);

                                popupMenu.add(menuItem30);

                                popupMenu.show(panel6,90,25);

                                menuItem30.addActionListener(new AbstractAction() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        final String w = label10.getText();
                                        try{

                                            int res = JOptionPane.showConfirmDialog(frame,"Are you sure?");
                                            if(res == JOptionPane.YES_OPTION)
                                            {
                                                Tache tache = metiertache.findtachesbyname(w);
                                                metiertache.deleteTache(tache);
                                                frame.dispose();
                                                new testjormdesignerr();
                                            }


                                        }catch (Exception ed){
                                            ed.printStackTrace();
                                        }
                                    }
                                });
                            }
                        }
                    });


                }
                if (tache.getStatut().trim().equals("En cours")) {

                    JSeparator separator5 = new JSeparator();
                    separator5.setBackground(Color.WHITE);
                    separator5.setForeground(new Color(60, 63, 65));

                    final JPanel panel6 = new JPanel(null);
                    panel6.setBorder(new BevelBorder(BevelBorder.RAISED));
                    panel6.setBounds(20, 80 + z, 245, 160);
                    panel6.setBackground(new Color(204, 204, 204));


                    final JLabel label10 = new JLabel();
                    label10.setBounds(15, 13, 150, 30);
                    label10.setFont(new Font("Tahoma", Font.BOLD, 17));
                    label10.setForeground(new Color(0, 128, 255, 200));
                    label10.setText(tache.getNomtac());
                    panel6.add(label10);
                    panel6.add(separator5);
                    separator5.setBounds(15, 55, 200, 5);

                    //---- label2 ----
                    if (tache.getEquipe() == null) {
                        JLabel label2 = new JLabel();
                        label2.setText(" No Team");
                        label2.setFont(new Font("Tahoma", Font.PLAIN, 16));
                        label2.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\team_skin_type_7_48px.png"));
                        panel6.add(label2);
                        label2.setBounds(20, 75, 115, label2.getPreferredSize().height);
                        label2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                        label2.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                super.mouseClicked(e);
                                String w = label10.getText();
                                try {

                                    String res = JOptionPane.showInputDialog(frame, "Enter Team name");
                                    if (res.trim().equals("")) {

                                        JOptionPane.showMessageDialog(frame, "The field is Empty");
                                    }
                                    if (res != null) {

                                        Tache tache = metiertache.findtachesbyname(w);
                                        Equipe equipe = metierequipe.findequipebyname(res);
                                        tache.setEquipe(equipe);
                                        metiertache.updateTache(tache, tache);
                                        frame.dispose();
                                        new testjormdesignerr();
                                    }

                                } catch (Exception ed) {
                                    ed.printStackTrace();
                                    JOptionPane.showConfirmDialog(null, ed.getMessage(), "Error",
                                            JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        });
                    }
                    if (tache.getEquipe() != null) {
                        JLabel label2 = new JLabel();
                        label2.setText(" " + tache.getEquipe().getNomequ());
                        label2.setFont(new Font("Tahoma", Font.PLAIN, 16));
                        label2.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\team_skin_type_7_48px.png"));
                        panel6.add(label2);
                        label2.setBounds(20, 75, 115, label2.getPreferredSize().height);
                        label2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                        label2.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                super.mouseClicked(e);
                                String w = label10.getText();
                                try {

                                    String res = JOptionPane.showInputDialog(frame, "Enter Team name");
                                    if (res.trim().equals("")) {
                                        JOptionPane.showMessageDialog(frame, "The field is Empty");

                                    }
                                    if (res != null) {

                                        Tache tache = metiertache.findtachesbyname(w);
                                        Equipe equipe = metierequipe.findequipebyname(res);
                                        tache.setEquipe(equipe);
                                        metiertache.updateTache(tache, tache);
                                        frame.dispose();
                                        new testjormdesignerr();
                                    }

                                } catch (Exception ed) {
                                    ed.printStackTrace();
                                    JOptionPane.showConfirmDialog(null, ed.getMessage(), "Error",
                                            JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        });
                    }


                    //---- label6 ----
                    JLabel label6 = new JLabel();
                    label6.setText(" " + tache.getFto());
                    label6.setFont(new Font("Tahoma", Font.PLAIN, 16));
                    label6.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\error_48px.png"));
                    panel6.add(label6);
                    label6.setBounds(new Rectangle(new Point(20, 110), label6.getPreferredSize()));

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for (int i = 0; i < panel6.getComponentCount(); i++) {
                            Rectangle bounds = panel6.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel6.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel6.setMinimumSize(preferredSize);
                        panel6.setPreferredSize(preferredSize);
                    }


                    panel4.add(panel6);
                    panel6.setBounds(20, 80 + o, 245, 160);

                    panel4.add(panel6);
                    o = o + 185;

                    label10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    label10.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            super.mouseClicked(e);
                            if(SwingUtilities.isLeftMouseButton(e) && e.getClickCount() == 1){
                                new JDialoguptache(label10, frame);
                            }

                            if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1){

                                //JMenuItem : MenuItem30
                                JMenuItem menuItem30 = new JMenuItem("Delete Team");

                                //JPopupMenu : popupMenu
                                final JPopupMenu popupMenu = new JPopupMenu();
                                popupMenu.setForeground(new Color(204,204,204));
                                popupMenu.setBackground(new Color(60,63,65));
                                popupMenu.setFont(new Font("Tahoma",Font.BOLD,15));
                                panel6.add(popupMenu);

                                popupMenu.add(menuItem30);

                                popupMenu.show(panel6,90,25);

                                menuItem30.addActionListener(new AbstractAction() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        final String w = label10.getText();
                                        try{

                                            int res = JOptionPane.showConfirmDialog(frame,"Are you sure?");
                                            if(res == JOptionPane.YES_OPTION)
                                            {
                                                Tache tache = metiertache.findtachesbyname(w);
                                                metiertache.deleteTache(tache);
                                                frame.dispose();
                                                new testjormdesignerr();
                                            }


                                        }catch (Exception ed){
                                            ed.printStackTrace();
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
                if (tache.getStatut().trim().equals("Terminer")) {

                    JSeparator separator5 = new JSeparator();
                    separator5.setBackground(Color.WHITE);
                    separator5.setForeground(new Color(60, 63, 65));

                    final JPanel panel6 = new JPanel(null);
                    panel6.setBorder(new BevelBorder(BevelBorder.RAISED));
                    panel6.setBounds(20, 80 + z, 245, 160);
                    panel6.setBackground(new Color(204, 204, 204));


                    final JLabel label10 = new JLabel();
                    label10.setBounds(15, 13, 150, 30);
                    label10.setFont(new Font("Tahoma", Font.BOLD, 17));
                    label10.setForeground(new Color(0, 128, 255, 200));
                    label10.setText(tache.getNomtac());
                    panel6.add(label10);
                    panel6.add(separator5);
                    separator5.setBounds(15, 55, 200, 5);

                    //---- label2 ----
                    if (tache.getEquipe() == null) {
                        JLabel label2 = new JLabel();
                        label2.setText(" No Team");
                        label2.setFont(new Font("Tahoma", Font.PLAIN, 16));
                        label2.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\team_skin_type_7_48px.png"));
                        panel6.add(label2);
                        label2.setBounds(20, 75, 115, label2.getPreferredSize().height);
                        label2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                        label2.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                super.mouseClicked(e);
                                String w = label10.getText();
                                try {

                                    String res = JOptionPane.showInputDialog(frame, "Enter Team name");
                                    if (res.trim().equals("")) {
                                        JOptionPane.showMessageDialog(frame, "The field is Empty");

                                    }
                                    if (res != null) {

                                        Tache tache = metiertache.findtachesbyname(w);
                                        Equipe equipe = metierequipe.findequipebyname(res);
                                        tache.setEquipe(equipe);
                                        metiertache.updateTache(tache, tache);
                                        frame.dispose();
                                        new testjormdesignerr();
                                    }

                                } catch (Exception ed) {
                                    ed.printStackTrace();
                                    JOptionPane.showConfirmDialog(null, ed.getMessage(), "Error",
                                            JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        });
                    }
                    if (tache.getEquipe() != null) {
                        JLabel label2 = new JLabel();
                        label2.setText(" " + tache.getEquipe().getNomequ());
                        label2.setFont(new Font("Tahoma", Font.PLAIN, 16));
                        label2.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\team_skin_type_7_48px.png"));
                        panel6.add(label2);
                        label2.setBounds(20, 75, 115, label2.getPreferredSize().height);
                        label2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                        label2.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                super.mouseClicked(e);
                                String w = label10.getText();
                                try {

                                    String res = JOptionPane.showInputDialog(frame, "Enter Team name");
                                    if (res.trim().equals("")) {

                                        JOptionPane.showMessageDialog(frame, "The field is Empty");
                                    }
                                    if (res != null) {

                                        Tache tache = metiertache.findtachesbyname(w);
                                        Equipe equipe = metierequipe.findequipebyname(res);
                                        tache.setEquipe(equipe);
                                        metiertache.updateTache(tache, tache);
                                        frame.dispose();
                                        new testjormdesignerr();
                                    }

                                } catch (Exception ed) {
                                    ed.printStackTrace();
                                    JOptionPane.showConfirmDialog(null, ed.getMessage(), "Error",
                                            JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        });
                    }

                    //---- label6 ----
                    JLabel label6 = new JLabel();
                    label6.setText(" " + tache.getFto());
                    label6.setFont(new Font("Tahoma", Font.PLAIN, 16));
                    label6.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\error_48px.png"));
                    panel6.add(label6);
                    label6.setBounds(new Rectangle(new Point(20, 110), label6.getPreferredSize()));

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for (int i = 0; i < panel6.getComponentCount(); i++) {
                            Rectangle bounds = panel6.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel6.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel6.setMinimumSize(preferredSize);
                        panel6.setPreferredSize(preferredSize);
                    }


                    panel5.add(panel6);
                    panel6.setBounds(20, 80 + v, 245, 160);

                    panel5.add(panel6);
                    v = v + 185;

                    label10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    label10.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            super.mouseClicked(e);
                            if(SwingUtilities.isLeftMouseButton(e) && e.getClickCount() == 1){
                                new JDialoguptache(label10, frame);
                            }

                            if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1){

                                //JMenuItem : MenuItem30
                                JMenuItem menuItem30 = new JMenuItem("Delete Team");

                                //JPopupMenu : popupMenu
                                final JPopupMenu popupMenu = new JPopupMenu();
                                popupMenu.setForeground(new Color(204,204,204));
                                popupMenu.setBackground(new Color(60,63,65));
                                popupMenu.setFont(new Font("Tahoma",Font.BOLD,15));
                                panel6.add(popupMenu);

                                popupMenu.add(menuItem30);

                                popupMenu.show(panel6,90,25);

                                menuItem30.addActionListener(new AbstractAction() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        final String w = label10.getText();
                                        try{

                                            int res = JOptionPane.showConfirmDialog(frame,"Are you sure?");
                                            if(res == JOptionPane.YES_OPTION)
                                            {
                                                Tache tache = metiertache.findtachesbyname(w);
                                                metiertache.deleteTache(tache);
                                                frame.dispose();
                                                new testjormdesignerr();
                                            }


                                        }catch (Exception ed){
                                            ed.printStackTrace();
                                        }
                                    }
                                });
                            }
                        }
                    });

                }
            }


        }catch(Exception ea){
            ea.printStackTrace();
        }
    }

    private void label4MouseClicked(MouseEvent e) {
        // TODO add your code here

        EquipeMetier metierequipe = new EquipeMetier();
        TacheMetier metiertache   = new TacheMetier();

        try{

            String res = (String) comboBox1.getSelectedItem();

            int value = JOptionPane.showConfirmDialog(frame, "Are you sure?");

            if (value == JOptionPane.YES_OPTION) {

                comboBox1.removeItem(res);

                Equipe equipe = metierequipe.findequipebyname(res);
                List<Tache> taches = metiertache.findtacheByequipe(equipe);

                for(Tache tache : taches){
                    tache.setEquipe(null);
                    metiertache.updateTache(tache,tache);
                }

                metierequipe.DeleteTeam(equipe);
            }

        }catch(Exception l){
            l.printStackTrace();
            JOptionPane.showConfirmDialog(null,l.getMessage(),"Error",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private void menuItem10MouseClicked(MouseEvent e) {
        // TODO add your code here

        

    }

    private void menuItem10ActionPerformed(ActionEvent e) {
        // TODO add your code here

        boolean value = jDialogequipe.undoManager.canUndo();
        boolean val   = jDialogtache.undoManager.canUndo();

        try{

            if(value == true){
                jDialogequipe.undoManager.undo();
            }

            if(val == true){
                jDialogtache.undoManager.undo();
            }
        }catch(Exception qa){
            qa.printStackTrace();
        }
        

        

    }

    private void menuItem9ActionPerformed(ActionEvent e) {
        // TODO add your code here
        boolean value  = jDialogequipe.undoManager.canRedo();
        boolean val   = jDialogtache.undoManager.canRedo();

        if(value == true){
            jDialogequipe.undoManager.redo();
        }
        if(val == true){
            jDialogtache.undoManager.redo();
        }

    }

    private void menuItem11ActionPerformed(ActionEvent e) {
        // TODO add your code here
        if(jDialogequipe.text1.isCursorSet()){
            jDialogequipe.text1.cut();
        }
        if(jDialogequipe.text2.isCursorSet()){
            jDialogequipe.text2.cut();
        }



    }

    private void menuItem12ActionPerformed(ActionEvent e) {
        // TODO add your code here
        if(!jDialogequipe.text1.isCursorSet()){
            jDialogequipe.text1.copy();
        }
        if(!jDialogequipe.text2.isCursorSet()){
            jDialogequipe.text2.copy();
        }


    }

    private void menuItem13ActionPerformed(ActionEvent e) {
        // TODO add your code here


    }

    private void label4AncestorRemoved(AncestorEvent e) {
        // TODO add your code here
        
    }

    private void label5MouseClicked(MouseEvent e) {
        // TODO add your code here
        //JMenuItems
        JMenuItem menuItem30 = new JMenuItem("properties");
        JMenuItem menuItem31 = new JMenuItem("List of Member");

        //JPopupMenu : popupMenu
        final JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.setForeground(new Color(204,204,204));
        popupMenu.setBackground(new Color(60,63,65));
        popupMenu.setFont(new Font("Tahoma",Font.BOLD,15));
        panel1.add(popupMenu);

        popupMenu.add(menuItem30);
        popupMenu.add(menuItem31);

        popupMenu.show(panel1,150,190);

        menuItem31.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EquipeMetier metierequipe = new EquipeMetier();
                String w = (String) comboBox1.getSelectedItem();
                Equipe equipe = null;
                if(w == null){
                    JOptionPane.showConfirmDialog(frame, "create Team before to do this action", "Information",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    try{
                        equipe = metierequipe.findequipebyname(w);
                    }catch (Exception q){
                        q.printStackTrace();
                    }

                    new ihm.ListEmploy(equipe,frame);
                }


            }
        });

        menuItem30.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String equ = (String) comboBox1.getSelectedItem();
                if(equ == null){
                    JOptionPane.showConfirmDialog(frame, "create Team before to do this action", "Information",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    new JDialogupequipe(equ);
                }

            }
        });
        
        

    }

    private void menuItem15ActionPerformed(ActionEvent e) {
        // TODO add your code here
        new Aboutstage();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        frame = new JFrame();
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem17 = new JMenuItem();
        menuItem7 = new JMenuItem();
        menu6 = new JMenu();
        menuItem5 = new JMenuItem();
        menuItem6 = new JMenuItem();
        menuItem8 = new JMenuItem();
        menu2 = new JMenu();
        menuItem9 = new JMenuItem();
        menuItem10 = new JMenuItem();
        menuItem11 = new JMenuItem();
        menuItem12 = new JMenuItem();
        menuItem13 = new JMenuItem();
        menu3 = new JMenu();
        menu7 = new JMenu();
        menu4 = new JMenu();
        menuItem16 = new JMenuItem();
        menuItem14 = new JMenuItem();
        menuItem15 = new JMenuItem();
        splitPane1 = new JSplitPane();
        panel1 = new JPanel();
        label3 = new JLabel();
        label5 = new JLabel();
        comboBox1 = new JComboBox();
        panel6 = new JPanel();
        scrollPane1 = new JScrollPane();
        panel2 = new JPanel();
        panel3 = new JPanel();
        label1 = new JLabel();
        panel4 = new JPanel();
        label2 = new JLabel();
        panel5 = new JPanel();
        label6 = new JLabel();

        //======== frame ========
        {
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setBackground(new Color(97, 212, 195));
            frame.setFont(new Font("Tahoma", Font.PLAIN, 15));
            frame.setMinimumSize(new Dimension(1200, 750));
            frame.setMaximizedBounds(null);
            Container frameContentPane = frame.getContentPane();
            frameContentPane.setLayout(new GridBagLayout());
            ((GridBagLayout)frameContentPane.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)frameContentPane.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)frameContentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)frameContentPane.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //======== menuBar1 ========
            {
                menuBar1.setBackground(new Color(97, 212, 195));
                menuBar1.setForeground(new Color(0, 98, 196));

                //======== menu1 ========
                {
                    menu1.setText("File");
                    menu1.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\file_24px.png"));
                    menu1.setForeground(Color.black);
                    menu1.setBackground(new Color(97, 212, 195));
                    menu1.setFont(new Font("Tahoma", Font.PLAIN, 15));

                    //---- menuItem17 ----
                    menuItem17.setText("Budget");
                    menuItem17.setFont(new Font("Tahoma", Font.PLAIN, 16));
                    menuItem17.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\general_ledger_64px.png"));
                    menuItem17.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            menuItem17ActionPerformed(e);
                        }
                    });
                    menu1.add(menuItem17);

                    //---- menuItem7 ----
                    menuItem7.setText("My project");
                    menuItem7.setFont(new Font("Tahoma", Font.PLAIN, 16));
                    menuItem7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            menuItem7ActionPerformed(e);
                        }
                    });
                    menu1.add(menuItem7);
                    menu1.addSeparator();

                    //======== menu6 ========
                    {
                        menu6.setText("Settings");
                        menu6.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\settings_24px.png"));
                        menu6.setFont(new Font("Tahoma", Font.PLAIN, 15));

                        //---- menuItem5 ----
                        menuItem5.setText("Update");
                        menuItem5.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\update_left_rotation_24px.png"));
                        menuItem5.setFont(new Font("Tahoma", Font.PLAIN, 15));
                        menuItem5.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                menuItem5ActionPerformed(e);
                            }
                        });
                        menu6.add(menuItem5);

                        //---- menuItem6 ----
                        menuItem6.setText("Delete account");
                        menuItem6.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\delete_24px.png"));
                        menuItem6.setFont(new Font("Tahoma", Font.PLAIN, 15));
                        menuItem6.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                menuItem6ActionPerformed(e);
                            }
                        });
                        menu6.add(menuItem6);
                    }
                    menu1.add(menu6);

                    //---- menuItem8 ----
                    menuItem8.setText("Exit");
                    menuItem8.setFont(new Font("Tahoma", Font.PLAIN, 15));
                    menuItem8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            menuItem8ActionPerformed(e);
                        }
                    });
                    menu1.add(menuItem8);
                }
                menuBar1.add(menu1);

                //======== menu2 ========
                {
                    menu2.setText("Edit");
                    menu2.setBackground(new Color(97, 212, 195));
                    menu2.setForeground(Color.black);
                    menu2.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\edit_folder_24px.png"));
                    menu2.setFont(new Font("Tahoma", Font.PLAIN, 15));

                    //---- menuItem9 ----
                    menuItem9.setText("Redo                    ");
                    menuItem9.setFont(new Font("Tahoma", Font.PLAIN, 15));
                    menuItem9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_MASK));
                    menuItem9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            menuItem9ActionPerformed(e);
                        }
                    });
                    menu2.add(menuItem9);

                    //---- menuItem10 ----
                    menuItem10.setText("Undo typing   ");
                    menuItem10.setFont(new Font("Tahoma", Font.PLAIN, 15));
                    menuItem10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_MASK|KeyEvent.SHIFT_MASK));
                    menuItem10.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            menuItem10MouseClicked(e);
                            menuItem10MouseClicked(e);
                        }
                    });
                    menuItem10.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            menuItem10ActionPerformed(e);
                        }
                    });
                    menu2.add(menuItem10);
                    menu2.addSeparator();

                    //---- menuItem11 ----
                    menuItem11.setText("Cut");
                    menuItem11.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\cut_24px.png"));
                    menuItem11.setFont(new Font("Tahoma", Font.PLAIN, 15));
                    menuItem11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
                    menuItem11.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            menuItem11ActionPerformed(e);
                        }
                    });
                    menu2.add(menuItem11);

                    //---- menuItem12 ----
                    menuItem12.setText("Copy");
                    menuItem12.setFont(new Font("Tahoma", Font.PLAIN, 15));
                    menuItem12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
                    menuItem12.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            menuItem12ActionPerformed(e);
                        }
                    });
                    menu2.add(menuItem12);

                    //---- menuItem13 ----
                    menuItem13.setText("Paste");
                    menuItem13.setFont(new Font("Tahoma", Font.PLAIN, 15));
                    menuItem13.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            menuItem13ActionPerformed(e);
                        }
                    });
                    menu2.add(menuItem13);
                }
                menuBar1.add(menu2);

                //======== menu3 ========
                {
                    menu3.setText("Windows");
                    menu3.setBackground(new Color(97, 212, 195));
                    menu3.setForeground(Color.black);
                    menu3.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\windows8_24px.png"));
                    menu3.setFont(new Font("Tahoma", Font.PLAIN, 15));

                    //======== menu7 ========
                    {
                        menu7.setText("Go to project             ");
                        menu7.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\Laptop with cursor_24px.png"));
                        menu7.setFont(new Font("Tahoma", Font.PLAIN, 15));
                    }
                    menu3.add(menu7);
                }
                menuBar1.add(menu3);

                //======== menu4 ========
                {
                    menu4.setText("Help");
                    menu4.setBackground(new Color(97, 212, 195));
                    menu4.setForeground(Color.black);
                    menu4.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\help_242px.png"));
                    menu4.setFont(new Font("Tahoma", Font.PLAIN, 15));

                    //---- menuItem16 ----
                    menuItem16.setText("Contact             ");
                    menuItem16.setFont(new Font("Tahoma", Font.PLAIN, 15));
                    menu4.add(menuItem16);

                    //---- menuItem14 ----
                    menuItem14.setText("Keyboard shortcuts      ");
                    menuItem14.setFont(new Font("Tahoma", Font.PLAIN, 15));
                    menu4.add(menuItem14);
                    menu4.addSeparator();

                    //---- menuItem15 ----
                    menuItem15.setText("About");
                    menuItem15.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\high_importance_24px.png"));
                    menuItem15.setFont(new Font("Tahoma", Font.PLAIN, 15));
                    menuItem15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));
                    menuItem15.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            menuItem15ActionPerformed(e);
                        }
                    });
                    menu4.add(menuItem15);
                }
                menuBar1.add(menu4);
            }
            frame.setJMenuBar(menuBar1);

            //======== splitPane1 ========
            {
                splitPane1.setDividerLocation(300);

                //======== panel1 ========
                {
                    panel1.setForeground(new Color(204, 204, 204));
                    panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
                    ( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing. border
                    . TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
                    . Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
                    propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( )
                    ; }} );
                    panel1.setLayout(null);

                    //---- label3 ----
                    label3.setText("ESPACE DE TRAVAIL");
                    label3.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\slack_new_96px.png"));
                    label3.setFont(new Font("Tahoma", Font.BOLD, 17));
                    label3.setForeground(new Color(60, 63, 65));
                    label3.setBackground(new Color(187, 187, 187));
                    panel1.add(label3);
                    label3.setBounds(new Rectangle(new Point(5, 20), label3.getPreferredSize()));

                    //---- label5 ----
                    label5.setText("  Settings");
                    label5.setFont(new Font("Tahoma", Font.BOLD, 16));
                    label5.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\engineering_64px.png"));
                    label5.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            label5MouseClicked(e);
                        }
                    });
                    panel1.add(label5);
                    label5.setBounds(90, 125, 120, label5.getPreferredSize().height);

                    //---- comboBox1 ----
                    comboBox1.setFont(new Font("Tahoma", Font.BOLD, 15));
                    comboBox1.addItemListener(new ItemListener() {
                        @Override
                        public void itemStateChanged(ItemEvent e) {
                            comboBox1ItemStateChanged(e);
                        }
                    });
                    comboBox1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            comboBox1ActionPerformed(e);
                        }
                    });
                    panel1.add(comboBox1);
                    comboBox1.setBounds(60, 80, 200, 35);

                    //======== panel6 ========
                    {
                        panel6.setLayout(new GridLayout());
                    }
                    panel1.add(panel6);
                    panel6.setBounds(70, 590, 100, 100);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel1.getComponentCount(); i++) {
                            Rectangle bounds = panel1.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel1.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel1.setMinimumSize(preferredSize);
                        panel1.setPreferredSize(preferredSize);
                    }
                }
                splitPane1.setLeftComponent(panel1);

                //======== scrollPane1 ========
                {

                    //======== panel2 ========
                    {
                        panel2.setMaximumSize(new Dimension(32767, 750));
                        panel2.setLayout(new GridLayout(0, 3));

                        //======== panel3 ========
                        {
                            panel3.setLayout(null);

                            //---- label1 ----
                            label1.setText("A  FAIRE");
                            label1.setFont(new Font("Tahoma", Font.BOLD, 16));
                            panel3.add(label1);
                            label1.setBounds(25, 30, 100, 25);

                            {
                                // compute preferred size
                                Dimension preferredSize = new Dimension();
                                for(int i = 0; i < panel3.getComponentCount(); i++) {
                                    Rectangle bounds = panel3.getComponent(i).getBounds();
                                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                                }
                                Insets insets = panel3.getInsets();
                                preferredSize.width += insets.right;
                                preferredSize.height += insets.bottom;
                                panel3.setMinimumSize(preferredSize);
                                panel3.setPreferredSize(preferredSize);
                            }
                        }
                        panel2.add(panel3);

                        //======== panel4 ========
                        {
                            panel4.setLayout(null);

                            //---- label2 ----
                            label2.setText("EN COURS");
                            label2.setFont(new Font("Tahoma", Font.BOLD, 16));
                            panel4.add(label2);
                            label2.setBounds(25, 30, 105, 25);

                            {
                                // compute preferred size
                                Dimension preferredSize = new Dimension();
                                for(int i = 0; i < panel4.getComponentCount(); i++) {
                                    Rectangle bounds = panel4.getComponent(i).getBounds();
                                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                                }
                                Insets insets = panel4.getInsets();
                                preferredSize.width += insets.right;
                                preferredSize.height += insets.bottom;
                                panel4.setMinimumSize(preferredSize);
                                panel4.setPreferredSize(preferredSize);
                            }
                        }
                        panel2.add(panel4);

                        //======== panel5 ========
                        {
                            panel5.setLayout(null);

                            //---- label6 ----
                            label6.setText("TERMINER");
                            label6.setFont(new Font("Tahoma", Font.BOLD, 16));
                            panel5.add(label6);
                            label6.setBounds(25, 30, 105, 25);

                            {
                                // compute preferred size
                                Dimension preferredSize = new Dimension();
                                for(int i = 0; i < panel5.getComponentCount(); i++) {
                                    Rectangle bounds = panel5.getComponent(i).getBounds();
                                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                                }
                                Insets insets = panel5.getInsets();
                                preferredSize.width += insets.right;
                                preferredSize.height += insets.bottom;
                                panel5.setMinimumSize(preferredSize);
                                panel5.setPreferredSize(preferredSize);
                            }
                        }
                        panel2.add(panel5);
                    }
                    scrollPane1.setViewportView(panel2);
                }
                splitPane1.setRightComponent(scrollPane1);
            }
            frameContentPane.add(splitPane1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
            frame.pack();
            frame.setLocationRelativeTo(null);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }



    public testjormdesignerr(int h){

    }

    public void init(){


        final TacheMetier metiertache   = new TacheMetier();
        final EquipeMetier metierequipe = new EquipeMetier();

        panel6.setBounds(380,550,750,30);
        label1.setBackground(new Color(204,204,204));
        label1.setForeground(new Color(60,63,65));

        label2.setBackground(new Color(204,204,204));
        label2.setForeground(new Color(60,63,65));

        label5.setBackground(new Color(60,63,65));
        label5.setForeground(new Color(153,153,153));

        label6.setBackground(new Color(204,204,204));
        label6.setForeground(new Color(60,63,65));

        label5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        comboBox1.setBackground(new Color(204,204,204));
        comboBox1.setForeground(new Color(60,63,65));

        //separator5.setBackground(new Color(204,204,204));
        //separator5.setForeground(new Color(60,63,65));

        EquipeMetier metierEquipe = new EquipeMetier();
        TacheMetier  metierTache  = new TacheMetier();
        OpenprojectForm openprojectForm = new OpenprojectForm("x");
        Projet projet = null;
        Projet p = openprojectForm.getprojet(projet);

        try{

            List<Equipe> equipes = metierEquipe.getAllByProjet(p);
            List<Tache>  data   = metierTache.getAllByProjet(p);
            for(Equipe equipe : equipes){
                comboBox1.addItem(equipe.getNomequ());
            }


        }catch(Exception g){
            g.printStackTrace();
        }



    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame frame;
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem17;
    private JMenuItem menuItem7;
    private JMenu menu6;
    private JMenuItem menuItem5;
    private JMenuItem menuItem6;
    private JMenuItem menuItem8;
    private JMenu menu2;
    private JMenuItem menuItem9;
    private JMenuItem menuItem10;
    private JMenuItem menuItem11;
    private JMenuItem menuItem12;
    private JMenuItem menuItem13;
    private JMenu menu3;
    private JMenu menu7;
    private JMenu menu4;
    private JMenuItem menuItem16;
    private JMenuItem menuItem14;
    private JMenuItem menuItem15;
    private JSplitPane splitPane1;
    private JPanel panel1;
    private JLabel label3;
    private JLabel label5;
    private JComboBox comboBox1;
    private JPanel panel6;
    private JScrollPane scrollPane1;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel label1;
    private JPanel panel4;
    private JLabel label2;
    private JPanel panel5;
    private JLabel label6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private class JDialogproject extends AbstractAction {
        private JDialogproject() {
            // JFormDesigner - Action initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
            // Generated using JFormDesigner Evaluation license - unknown
            // JFormDesigner - End of action initialization  //GEN-END:initComponents
        }

        public void actionPerformed(ActionEvent e) {
            // TODO add your code here
        }
    }
    public String getequipe(){

        String name = (String) comboBox1.getSelectedItem();
        return name;
    }
}
