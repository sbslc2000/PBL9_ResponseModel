package peteseo.pbl9responsemodel.response.status;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.ToString;

@Getter
public enum StatusCode {
    OK(2000, "OK"),
    REQUEST_ERROR(4000, "Bad Request"),
    VALIDATION_FAILURE(4001, "Validation Failure"),
    INTERNAL_SERVER_ERROR(5000, "Internal Server Error");

    private final int code;
    private final String message;

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @JsonValue
    public int getCode() {
        return this.code;
    }
}
