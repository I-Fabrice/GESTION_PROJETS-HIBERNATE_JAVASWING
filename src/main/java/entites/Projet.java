package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Table(name ="Projet")
@Data @AllArgsConstructor @NoArgsConstructor
public class Projet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idepro;
    @Column(unique = true)
    private String nompro;
    private String typro;
    private String despro;
    @OneToOne
    private Budget budget;
    @ManyToOne
    private Membre membre;
    @OneToMany(mappedBy = "projet")
    private  List<Tache> taches;
    @OneToMany(mappedBy = "projet")
    private List<Equipe> equipe = new ArrayList<>();

}
