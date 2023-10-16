package peteseo.pbl9responsemodel.grade.validate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentValidateResult {
    private Integer maxGrade;
    private Integer minGrade;
    private Integer maxNameSize;
    private Integer minNameSize;

    @JsonIgnore
    public boolean isValid() {
        return maxGrade == null && minGrade == null && maxNameSize == null && minNameSize == null;
    }
}
