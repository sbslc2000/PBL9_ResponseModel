package peteseo.pbl9responsemodel.grade;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
    @PostMapping("/api/students")
    public Student addStudent(@RequestBody Student grade) {

        return studentService.addGrade(grade);
    }

    @GetMapping("/api/students")
    public List<Student> getStudents(
        @RequestParam(value = "grade", required = false) Integer grade,
        @RequestParam(value = "orderBy", required = false) String orderBy

            ) {

        if (grade != null) {
            return studentService.findByGrade(grade);
        } else if (orderBy != null && orderBy.equals("grade")) {
            return studentService.findByOrderByGradeDesc();
        } else {
            return studentService.findAll();
        }
    }
}
