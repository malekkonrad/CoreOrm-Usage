package pl.edu.agh.dp.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.edu.agh.dp.core.mapping.annotations.Entity;
import pl.edu.agh.dp.core.mapping.annotations.Id;
import pl.edu.agh.dp.core.mapping.annotations.JoinColumn;
import pl.edu.agh.dp.core.mapping.annotations.ManyToMany;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Subject {

    @Id()
    Long id;

    String name;

    @ManyToMany()
    @JoinColumn(joinColumns = {"students"}, nullable = true)
    List<Student> students;
}
