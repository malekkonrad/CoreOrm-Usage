package pl.edu.agh.dp.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.edu.agh.dp.core.mapping.InheritanceType;
import pl.edu.agh.dp.core.mapping.annotations.Entity;
import pl.edu.agh.dp.core.mapping.annotations.Id;
import pl.edu.agh.dp.core.mapping.annotations.Inheritance;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Persom {

    @Id()
    Long id;

    String imie;
    String nazwisko;
}
