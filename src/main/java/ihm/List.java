/*
 * Created by JFormDesigner on Tue Jun 22 22:00:22 CEST 2021
 */

package ihm;

import Metier.CompteMetier;
import Metier.EquipeMetier;
import Metier.MembreMetier;
import dao.CompteDao;
import entites.Compte;
import entites.Equipe;
import entites.Membre;
import entites.Tache;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class List extends JDialog {
    public List(Equipe equipe) {

        initComponents(equipe);
        init(equipe);
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        this.dispose();


    }

    private void button1MouseClicked(MouseEvent e,Equipe equipe) {
        // TODO add your code here
        try{

            CompteMetier metiercompte = new CompteMetier();
            EquipeMetier metierequipe = new EquipeMetier();
            MembreMetier metiermembre = new MembreMetier();

            loginForm loginForm = new loginForm(null);
            Compte data = null;
            Compte compte = loginForm.getcompte(data);

            CompteDao dao = new CompteDao();



            String res = JOptionPane.showInputDialog(this,"Enter Username");

            if(res.trim().equals(""))
            {

                JOptionPane.showMessageDialog(this,"The field is Empty");
            }
            if(res != null){

                Compte c =  dao.findByID(res);
                if(c.getRole().getStatut().trim().equals("Manager"))
                {
                    JOptionPane.showConfirmDialog(this,"Impossible to add Manager in project","Error",
                            JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
                }
                if(c.getRole().getStatut().trim().equals("Employ"))
                {


                    if(c.getMembre().getEquipe() != null){
                        JOptionPane.showConfirmDialog(this,"Employ already work in other project","Error",
                                JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
                    }
                    if(c.getMembre().getEquipe() == null)
                    {
                        c.getMembre().setEquipe(equipe);
                        metiermembre.updatMembre(c.getMembre());
                        JOptionPane.showConfirmDialog(this, "Operation Successfull", "Information",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                        new List(equipe);
                    }


                }


            }

        }catch (Exception ed){
            ed.printStackTrace();
            JOptionPane.showConfirmDialog(this,ed.getMessage(),"Error",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }

    }

    private void button2MouseClicked(MouseEvent e,Equipe equipe) {
        // TODO add your code here

        MembreMetier metiermembre = new MembreMetier();
        String value = (String) list1.getSelectedValue();
        try{

            Membre membre = metiermembre.findbyname(value);
            membre.setEquipe(null);
            metiermembre.updatMembre(membre);

            int res = JOptionPane.showConfirmDialog(this,"Are you sure?");

            if(res == JOptionPane.YES_OPTION)
            {
                JOptionPane.showConfirmDialog(this, "Successfull", "Information",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new List(equipe);
            }
            if(res == JOptionPane.NO_OPTION){

                this.dispose();
            }

        }catch (Exception q){
            q.printStackTrace();
            JOptionPane.showConfirmDialog(this,q.getMessage(),"Error",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }


    }

    public void init(Equipe equipe){



        MembreMetier metiermembre = new MembreMetier();
        EquipeMetier metierequipe = new EquipeMetier();

        /*loginForm loginForm = new loginForm(null);
        Compte data = null;
        Compte compte = loginForm.getcompte(data);*/


        try{

           DefaultListModel<String> model = new DefaultListModel<>();
           java.util.List<Membre> membres = metiermembre.findmembrebyname(equipe);
           for(Membre membre : membres){

               model.addElement(membre.getNom());
           }

           list1.setModel(model);



        }catch(Exception e){
            e.printStackTrace();

        }
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here

    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }
    private void initComponents(final Equipe equipe) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setVisible(true);
        setMinimumSize(new Dimension(550, 570));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== scrollPane1 ========
        {

            //---- list1 ----
            list1.setBackground(new Color(204, 204, 204));
            list1.setForeground(new Color(51, 51, 51));
            list1.setFont(new Font("Tahoma", Font.BOLD, 15));
            list1.setBorder(new BevelBorder(BevelBorder.RAISED));
            scrollPane1.setViewportView(list1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(30, 35, 235, 425);

        //---- button1 ----
        button1.setText("ADD");
        button1.setFont(new Font("Tahoma", Font.BOLD, 15));
        button1.setBackground(new Color(204, 204, 204));
        button1.setForeground(new Color(153, 153, 153));
        button1.setBorder(new BevelBorder(BevelBorder.RAISED));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(340, 35, 120, 50);

        //---- button2 ----
        button2.setText("REMOVE");
        button2.setBackground(new Color(204, 204, 204));
        button2.setForeground(new Color(153, 153, 153));
        button2.setFont(new Font("Tahoma", Font.BOLD, 15));
        button2.setBorder(new BevelBorder(BevelBorder.RAISED));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(340, 110, 120, 50);

        //---- button3 ----
        button3.setText("CANCEL");
        button3.setFont(new Font("Tahoma", Font.BOLD, 15));
        button3.setBorder(new BevelBorder(BevelBorder.RAISED));
        button3.setBackground(new Color(204, 204, 204));
        button3.setForeground(new Color(153, 153, 153));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        contentPane.add(button3);
        button3.setBounds(340, 185, 120, 50);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JScrollPane scrollPane1;
    private JList list1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
