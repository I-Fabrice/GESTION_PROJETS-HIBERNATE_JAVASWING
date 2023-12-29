package entites;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity @Table(name ="Membre")
@Data @NoArgsConstructor @AllArgsConstructor
public class Membre {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmem;
    private String nom;
    private String mail;
    private String genre;
    @ManyToOne
    private Equipe equipe;
    @OneToOne
    private Compte compte;
    @OneToMany(mappedBy = "membre")
    private List<Projet> projets;

}
