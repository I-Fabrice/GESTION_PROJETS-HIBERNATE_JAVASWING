package Metier;

import dao.TacheDao;
import entites.Equipe;
import entites.Projet;
import entites.Tache;
import org.hibernate.loader.custom.Return;

import javax.xml.bind.Unmarshaller;
import java.util.List;

public class TacheMetier {

    private TacheDao dao = new TacheDao();

    EquipeMetier metierEquipe = new EquipeMetier();

    public Tache creationTache(Tache tache,Projet projetselect)throws Exception{

        if(tache.getNomtac().trim().equals("") || tache.getTyptac().trim().equals("") || tache.getFto().trim().equals("") || tache.getDesctac().trim().equals("") || tache.getStatut().trim().equals(""))
            throw new Exception("the fields must not be empty");
        tache.setProjet(projetselect);
        Tache data = dao.addTache(tache);

        return data;
    }

    public List<Tache> getAllByProjet(Projet projet)throws Exception{


        return dao.findAllTacheByProjet(projet.getIdepro());
    }

    public void deleteTache(Tache tache)throws Exception{

        dao.deleteTache(tache);
    }


    public Tache updateTache(Tache tachesaisi, Tache tacheselect)throws Exception{

        if(tachesaisi.getNomtac().trim().equals("") || tachesaisi.getTyptac().trim().equals("") || tachesaisi.getFto().trim().equals("") || tachesaisi.getDesctac().trim().equals("") || tachesaisi.getStatut().trim().equals(""))
            throw new Exception("the fields must not be empty");
        tachesaisi.setIdtache(tacheselect.getIdtache());
        tachesaisi.setEquipe(tacheselect.getEquipe());
        tachesaisi.setProjet(tacheselect.getProjet());
        Tache data = dao.updateTache(tachesaisi);

        return data;
    }


    public List<Tache> findtacheByequipe(Equipe equipe)throws Exception{
        List<Tache> taches = dao.findTacheByequipe(equipe);
        return taches;
    }

    public List<Tache> findtacheBycompte(Projet projet)throws Exception{

        List<Tache> taches = dao.findAllTacheByProjet(projet.getIdepro());
        return taches;
    }

    public Tache AffecterGroupe(Long id, Tache tacheselect)throws Exception{

        if(id == null)
            throw new Exception("the fields must not be empty");
        Equipe equipe = metierEquipe.findEquipe(id);
        tacheselect.setEquipe(equipe);

        Tache data =  dao.updateTache(tacheselect);

        return data;
    }

    public Tache findtache(Long id)throws Exception{
        return dao.findByID(id);
    }
    public Tache findtachesbyname(String name)throws Exception{
        Tache tache = dao.findTacheByname(name);

        return tache;
    }
}
