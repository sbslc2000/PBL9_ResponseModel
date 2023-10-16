package peteseo.pbl9responsemodel.response.status;

import lombok.Getter;

@Getter
public class Status {
    private StatusCode code;
    private String message;

    public static final Status OK = new Status(StatusCode.OK, "요청에 성공하였습니다.");
    public static final Status VALIDATION_FAILURE = new Status(StatusCode.VALIDATION_FAILURE, "Validation Failure");
    public Status(StatusCode statusCode, String message) {
        this.code = statusCode;
        this.message = message;
    }
}
