package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Table(name ="Equipe")
@Data @AllArgsConstructor @NoArgsConstructor
public class Equipe {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ideequ;
    @Column(unique = true)
    private String nomequ;
    private String objequ;
    @OneToMany(mappedBy = "equipe")
    private List<Membre> membres;
    @OneToMany(mappedBy = "equipe")
    private List<Tache> taches;
    @ManyToOne
    private Projet projet;

}
