package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Table(name ="Compte")
@Data @AllArgsConstructor @NoArgsConstructor
public class Compte {
    @Id
    private String idcompte;
    private String motpas;
    @OneToOne
    private Role role;
    @OneToOne
    private Membre membre;


}
