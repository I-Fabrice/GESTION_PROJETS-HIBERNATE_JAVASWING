package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @Table(name ="Budget")
@Data @AllArgsConstructor @NoArgsConstructor
public class Budget {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idebudget;
    private Double budallpro;
    private Double budep;
    private String devise;
    @OneToOne
    private Projet projet;
}
