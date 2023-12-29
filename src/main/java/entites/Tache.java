package entites;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity @Table(name ="Tâche")
@Data @AllArgsConstructor @NoArgsConstructor
public class Tache {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idtache;
    @Column(unique = true)
    private String nomtac;
    private String typtac;
    private String desctac;
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private String fto;
    private String statut;
    @ManyToOne
    private Projet projet;
    @ManyToOne
    private Equipe equipe;


}
