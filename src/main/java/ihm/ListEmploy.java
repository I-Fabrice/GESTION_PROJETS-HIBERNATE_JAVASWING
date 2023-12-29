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

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author unknown
 */
public class ListEmploy extends JDialog {
    public ListEmploy(Equipe equipe,JFrame frame) {

        initComponents(equipe, frame);
        init(equipe,frame);
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        this.dispose();


    }
    
    
    public void init(Equipe equipe, JFrame frame){



        label1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
    


    private void label1MouseEntered(MouseEvent e) {
        // TODO add your code here

        label1.setForeground(new Color(97,212,195));
    }

    private void label1MouseExited(MouseEvent e) {
        // TODO add your code here

        label1.setForeground(new Color(153, 153, 153));
    }

    private void label1MouseClicked(MouseEvent e,JFrame frame) {
        // TODO add your code here

        int res = JOptionPane.showConfirmDialog(this,"Are you sure?");

        if(res == JOptionPane.YES_OPTION)
        {
            MembreMetier metiermembre = new MembreMetier();
            Compte data = null;
            loginForm loginForm = new loginForm("x");
            Compte compte = loginForm.getcompte(data);
            compte.getMembre().setEquipe(null);

            try{

                metiermembre.updatMembre(compte.getMembre());
                this.dispose();
                frame.dispose();
                new loginForm();

            }catch (Exception w){
                w.printStackTrace();
            }

        }
        if(res == JOptionPane.NO_OPTION){
            this.dispose();
        }
        if(res == JOptionPane.CANCEL_OPTION){
            this.dispose();
        }
    }

    private void label1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents(final Equipe equipe,final JFrame frame) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        button3 = new JButton();
        label1 = new JLabel();

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
        button3.setBounds(335, 35, 120, 50);

        //---- label1 ----
        label1.setText("Leave project?");
        label1.setBackground(new Color(204, 204, 204));
        label1.setForeground(new Color(153, 153, 153));
        label1.setFont(new Font("Tahoma", Font.BOLD, 15));
        label1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label1MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label1MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label1MouseExited(e);
            }
        });
        contentPane.add(label1);
        label1.setBounds(340, 425, 125, 30);

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
    private JButton button3;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
