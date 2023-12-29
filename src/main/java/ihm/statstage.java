package ihm;

import Metier.EquipeMetier;
import Metier.ProjetMetier;
import Metier.TacheMetier;
import com.sun.javafx.charts.Legend;
import entites.Compte;
import entites.Equipe;
import entites.Projet;
import entites.Tache;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class statstage extends JDialog {

    JDialog statstage     = new JDialog();
    JPanel  panel         = new JPanel();
    JButton button1       = new JButton("OK");
    JButton button2       = new JButton("CANCEL");

    DefaultPieDataset pieDataset = new DefaultPieDataset();

    JFreeChart pieChart = ChartFactory.createPieChart("TASK",pieDataset, true, true, false);


    public  statstage(String nameTeam){

        String n = nameTeam;
        statstage.setSize(600,700);
        statstage.setLocationRelativeTo(null);
        initComponents(n);
    }

    Double valafaire   = 0.0;
    Double valencours  = 0.0;
    Double valterminer = 0.0;

    private void initComponents(String nameTeam) {

        EquipeMetier equipeMetier = new EquipeMetier();
        TacheMetier  tacheMetier  = new TacheMetier();

        ProjetMetier metierprojet = new ProjetMetier();

        Equipe equipe = null;

        List<Tache> data = null;

        loginForm loginForm = new loginForm("b");

        Compte compte = null;
        Compte c = loginForm.getcompte(compte);

        try{

            equipe = equipeMetier.findequipebyname(nameTeam);
            data = tacheMetier.findtacheByequipe(equipe);

            List<Projet> p = metierprojet.getAllBycompte(c);

            for(Tache tache : data){

                if(tache.getStatut().equals("A Faire")){
                    valafaire++;
                }

            }
            for(Tache tache : data){

                if(tache.getStatut().equals("En cours")){
                    valencours++;
                }

            }
            for(Tache tache : data){

                if(tache.getStatut().equals("Terminer")){
                    valterminer++;
                }

            }


            if(data.isEmpty() == true){
                valafaire   = (valafaire)/new Double(p.size());
                valencours  = (valencours)/new Double(p.size());
                valterminer = (valterminer)/new Double(p.size());


               /* pieDataset.setValue( "To do" , new Double(valafaire));
                pieDataset.setValue( "in progress" , new Double(valencours));
                pieDataset.setValue( "completed" , new Double(valterminer));*/


                PiePlot plot = (PiePlot) pieChart.getPlot();
                plot.setLabelFont(new Font("Tahoma", Font.BOLD, 15));
                plot.setNoDataMessage("Aucune donnée disponible");
                plot.setCircular(true);
                plot.setLabelGap(0.02);

                ChartPanel cPanel = new ChartPanel(pieChart);

                //JDIALOG : statstage
                statstage.add(cPanel);
                statstage.setVisible(true);
            }
            else{
                valafaire   = (valafaire)/new Double(p.size());
                valencours  = (valencours)/new Double(p.size());
                valterminer = (valterminer)/new Double(p.size());


                pieDataset.setValue( "To do" , new Double(valafaire));
                pieDataset.setValue( "in progress" , new Double(valencours));
                pieDataset.setValue( "completed" , new Double(valterminer));


                PiePlot plot = (PiePlot) pieChart.getPlot();
                plot.setLabelFont(new Font("Tahoma", Font.BOLD, 15));
                plot.setCircular(true);
                plot.setLabelGap(0.02);

                ChartPanel cPanel = new ChartPanel(pieChart);

                //JDIALOG : statstage
                statstage.add(cPanel);
                statstage.setVisible(true);
            }


        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
