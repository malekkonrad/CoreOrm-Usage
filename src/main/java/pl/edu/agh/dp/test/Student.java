package pl.edu.agh.dp.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.edu.agh.dp.core.mapping.annotations.Entity;
import pl.edu.agh.dp.core.mapping.annotations.JoinColumn;
import pl.edu.agh.dp.core.mapping.annotations.ManyToMany;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student extends Persom{
    String index;
    Integer age;


    @ManyToMany()
    @JoinColumn(joinColumns = {"subjects"}, nullable = true)
    List<Subject> subjects;

}
