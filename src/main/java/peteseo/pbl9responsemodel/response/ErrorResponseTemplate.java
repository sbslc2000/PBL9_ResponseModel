package peteseo.pbl9responsemodel.response;

import lombok.Getter;
import peteseo.pbl9responsemodel.response.status.Status;
import peteseo.pbl9responsemodel.response.status.StatusCode;

@Getter
public class ErrorResponseTemplate {

    private final Status status;

    private final Object data;

    public ErrorResponseTemplate(Object data, Status status) {
        this.data = data;
        this.status = status;
    }

    public ErrorResponseTemplate(String message) {
        this.data = null;
        this.status = new Status(StatusCode.INTERNAL_SERVER_ERROR, message);
    }
}
