package peteseo.pbl9responsemodel.response.exception;

import peteseo.pbl9responsemodel.response.status.Status;
import peteseo.pbl9responsemodel.response.status.StatusCode;

public class ValidationException extends ClientFaultException{

    public ValidationException(Object data) {
        super(data, Status.VALIDATION_FAILURE);
    }

    public ValidationException(Object data, String message) {
        super(data, new Status(StatusCode.VALIDATION_FAILURE, message));
    }
}
