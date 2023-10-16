package peteseo.pbl9responsemodel.grade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peteseo.pbl9responsemodel.grade.validate.StudentValidateResult;
import peteseo.pbl9responsemodel.grade.validate.StudentValidator;
import peteseo.pbl9responsemodel.response.exception.ValidationException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student addGrade(Student student) {
        StudentValidator.validate(student);
        return studentRepository.save(student);
    }

    public List<Student> findByGrade(int grade) {
        return studentRepository.findByGrade(grade);
    }

    public List<Student> findByOrderByGradeDesc() {
        return studentRepository.findByOrderByGradeDesc();
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
