package peteseo.pbl9responsemodel.grade;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    List<Student> repository = new ArrayList<>();

    public Student save(Student student) {
        repository.add(student);
        return student;
    }

    public List<Student> findAll() {
        return repository;
    }

    public int count() {
        return repository.size();
    }

    public List<Student> findByGrade(int grade){
        return repository.stream().filter(student -> student.getGrade() == grade).toList();
    }

    public List<Student> findByOrderByGradeDesc(){
        return repository.stream().sorted((s1, s2) -> s2.getGrade() - s1.getGrade()).toList();
    }
}
