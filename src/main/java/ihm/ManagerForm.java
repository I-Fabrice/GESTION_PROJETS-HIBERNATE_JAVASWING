package ihm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ManagerForm extends JFrame {

    JFrame frame = new JFrame();

    JScrollPane panel1 = new JScrollPane();
    JScrollPane panel2 = new JScrollPane();

    JMenuBar menuBar = new JMenuBar();
    JMenu profil = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    JMenu windows  = new JMenu("Windows");
    JMenu help  = new JMenu("Help");

    JMenuItem menuItem1 = new JMenuItem("Show account");
    JMenu     menuItem2 = new JMenu("Settings");
    JMenu     menuItem5 = new JMenu("New                       ");
    JMenu     menuItem15 = new JMenu("Go to project            "); // Menu windows
    JMenuItem menuItem3 = new JMenuItem("Exit");
    JMenuItem menuItem4 = new JMenuItem("New project");
    JMenuItem menuItem6 = new JMenuItem("About"); // Pour MenuHelp Keyboard Shortcuts
    JMenuItem menuItem7 = new JMenuItem("Keyboard Shortcuts");
    JMenuItem menuItem8 = new JMenuItem("Help                ");
    JMenuItem menuItem9 = new JMenuItem("Redo                ");
    JMenuItem menuItem10 = new JMenuItem("Undo typing        ");
    JMenuItem menuItem11 = new JMenuItem("Cut                ");
    JMenuItem menuItem12 = new JMenuItem("Copy               ");
    JMenuItem menuItem13 = new JMenuItem("Paste              ");
    JMenuItem menuItem14 = new JMenuItem("Delete                          ");

    JMenuItem smenuItem1 = new JMenuItem("Update profile     ");
    JMenuItem smenuItem2 = new JMenuItem("Delete account     ");
    JMenuItem smenuItem3 = new JMenuItem("Task               ");
    JMenuItem smenuItem4 = new JMenuItem("Team               ");
    JMenuItem smenuItem5 = new JMenuItem("Budget             ");



    public ManagerForm(){

        frame.setSize(1500,850);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        initComponents();

    }


    public void initComponents(){


        //Panel1
        panel1.setLayout(null);


        //Panel2
        panel2.setLayout(null);

        //splitpane
        JSplitPane splitPane = new JSplitPane(SwingConstants.VERTICAL,panel1,panel2);
        splitPane.setOrientation(SwingConstants.VERTICAL);
        splitPane.setResizeWeight( 0.33 );
        splitPane.setDividerSize( 5 );
        splitPane.setDividerLocation(500);


        //SMenuItem1
        smenuItem1.setFont(new Font("Century Gothic",Font.PLAIN,15));

        //SMenuItem2
        smenuItem2.setFont(new Font("Century Gothic",Font.PLAIN,15));
        smenuItem2.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\delete_24px.PNG"));

        //SMenuItem3
        smenuItem3.setFont(new Font("Century Gothic",Font.PLAIN,15));
        smenuItem3.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\work_authorisation_24px.PNG"));
        //work_authorisation_48px
        //SmenuItem4
        smenuItem4.setFont(new Font("Century Gothic",Font.PLAIN,15));
        smenuItem4.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\people_24px.PNG"));

        //SmenuItem5
        smenuItem5.setFont(new Font("Century Gothic",Font.PLAIN,15));
        smenuItem5.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\money_24px.PNG"));

        //MenuItem1
        menuItem1.setFont(new Font("Century Gothic",Font.PLAIN,15));

        //MenuItem2
        menuItem2.setFont(new Font("Century Gothic",Font.PLAIN,15));
        menuItem2.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\settings_24px.PNG"));
        menuItem2.add(smenuItem1);
        menuItem2.add(smenuItem2);

        //MenuItem3
        menuItem3.setFont(new Font("Century Gothic",Font.PLAIN,15));
        menuItem3.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\shutdown_24px.PNG"));

        //MenuItem4
        menuItem4.setFont(new Font("Century Gothic",Font.PLAIN,15));

        //MenuItem5 : New
        menuItem5.setFont(new Font("Tahoma",Font.PLAIN,15));
        menuItem5.add(smenuItem3);
        menuItem5.add(smenuItem4);
        menuItem5.add(smenuItem5);

        //MenuItem6 : About
        menuItem6.setFont(new Font("Tahoma",Font.PLAIN,15));
        menuItem6.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\help_24px.png"));

        //MenuItem7 : keyboard shortcut
        menuItem7.setFont(new Font("Tahoma",Font.PLAIN,15));

        //MenuItem8 : Help
        menuItem8.setFont(new Font("Tahoma",Font.PLAIN,15));

        //MenuItem9
        menuItem9.setFont(new Font("Tahoma",Font.PLAIN,15));
        menuItem9.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\redo_24px.png"));

        //MenuItem10
        menuItem10.setFont(new Font("Tahoma",Font.PLAIN,15));
        menuItem10.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\undo_24px.png"));

        //MenuItem11
        menuItem11.setFont(new Font("Tahoma",Font.PLAIN,15));
        menuItem11.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\cut_24px.png"));

        //MenuItem12
        menuItem12.setFont(new Font("Tahoma",Font.PLAIN,15));
        menuItem12.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\copy_24px.png"));

        //MenuItem13
        menuItem13.setFont(new Font("Tahoma",Font.PLAIN,15));

        //MenuItem14
        menuItem14.setFont(new Font("Tahoma",Font.PLAIN,15));

        //MenuItem15
        menuItem15.setFont(new Font("Tahoma",Font.PLAIN,15));


        //Menu File
         profil.setForeground(new Color(36,47,65)); //changez la couleur du fond
         profil.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\file_24px.PNG"));
         //profil.setFont(new Font("Century Gothic",Font.PLAIN,15));
         profil.add(menuItem5);
         profil.add(menuItem4);
         profil.addSeparator();
         profil.add(menuItem2);
         profil.add(menuItem1);
         profil.addSeparator();
         profil.add(menuItem3);

         //Menu Edit
        edit.setBackground(new Color(36,47,65));
        edit.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\edit_folder_24px.PNG"));
        //edit.setFont(new Font("Century Gothic",Font.PLAIN,15));
        edit.add(menuItem9);
        edit.add(menuItem10);
        edit.addSeparator();
        edit.add(menuItem11);
        edit.add(menuItem12);
        edit.add(menuItem13);
        edit.add(menuItem14);

        //Menu Window
        windows.setBackground(new Color(36,47,65));
        //windows.setFont(new Font("Century Gothic",Font.PLAIN,15));
        windows.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\windows8_24px.PNG"));
        windows.add(menuItem15);

        //Menu Help
        help.setBackground(new Color(36,47,65));
        //help.setFont(new Font("Century Gothic",Font.PLAIN,15));
        help.setIcon(new ImageIcon("C:\\Users\\al-peco\\Downloads\\help_242px.PNG"));
        help.add(menuItem8);
        help.add(menuItem7);
        help.addSeparator();
        help.add(menuItem6);


        //MenuBar
         menuBar.setBackground(new Color(97,212,195));
         menuBar.add(profil);
         menuBar.add(edit);
         menuBar.add(windows);
         menuBar.add(help);

         //JOptionPane

          //Frame
          frame.add(splitPane);
          frame.setJMenuBar(menuBar);
          frame.setVisible(true); //Rendre la fênetre visible*/


          menuItem3.addActionListener(new AbstractAction() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  int res = JOptionPane.showConfirmDialog(frame,"Are you sure?");

                  if(res == JOptionPane.YES_OPTION)
                  {
                      frame.dispose();
                  }
              }
          });

          smenuItem1.addActionListener(new AbstractAction() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  new JDialogprofil();
              }
          });
          smenuItem2.addActionListener(new AbstractAction() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  int res = JOptionPane.showConfirmDialog(frame,"Are you sure?");

                  if(res == JOptionPane.YES_OPTION)
                  {
                      new SignUp();
                      frame.dispose();
                  }
              }
          });
          menuItem1.addActionListener(new AbstractAction() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  new JDialogprofil();
              }
          });
          menuItem4.addActionListener(new AbstractAction() {
              @Override
              public void actionPerformed(ActionEvent e) {

              }
          });
          smenuItem3.addActionListener(new AbstractAction() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  new JDialogtache(frame);
              }
          });
          smenuItem4.addActionListener(new AbstractAction() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  new JDialogequipe(frame);
              }
          });
          smenuItem5.addActionListener(new AbstractAction() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  new JDialogbudget();
              }
          });

    }
}
