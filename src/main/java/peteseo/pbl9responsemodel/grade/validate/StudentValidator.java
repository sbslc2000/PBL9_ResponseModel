package peteseo.pbl9responsemodel.grade.validate;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;
import peteseo.pbl9responsemodel.grade.Student;
import peteseo.pbl9responsemodel.response.exception.ValidationException;

public class StudentValidator {

    public static void validate(Student student) {
        StudentValidateResult result = new StudentValidateResult();


        if(student.getGrade() < 0) {
            result.setMinGrade(student.getGrade());
        }

        if(student.getGrade() > 5) {
            result.setMaxGrade(student.getGrade());
        }

        if(student.getName().length() < 3) {
            result.setMinNameSize(student.getName().length());
        }

        if(student.getName().length() > 10) {
            result.setMaxNameSize(student.getName().length());
        }

        if(!result.isValid()) {
            throw new ValidationException(result, "학생 정보가 유효하지 않습니다.");
        }
    }
}
