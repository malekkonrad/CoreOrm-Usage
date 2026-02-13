package pl.edu.agh.dp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.edu.agh.dp.core.mapping.annotations.Entity;
import pl.edu.agh.dp.core.mapping.annotations.Id;

@Getter
@Setter
@Entity
public class Cuj {
    @Id()
    Long id;
    String name;
}
