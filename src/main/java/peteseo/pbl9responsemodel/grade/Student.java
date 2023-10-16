package peteseo.pbl9responsemodel.grade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private String name;
    private int grade;


    boolean isGradeValid() {
        return grade >= 0 && grade < 6;
    }


}
