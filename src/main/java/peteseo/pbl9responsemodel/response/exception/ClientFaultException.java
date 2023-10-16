package peteseo.pbl9responsemodel.response.exception;

import lombok.Getter;
import peteseo.pbl9responsemodel.response.status.Status;

@Getter
public abstract class ClientFaultException extends BaseException{
    private Object data;
    private Status status;

    public ClientFaultException(Object data, Status status) {
        this.data = data;
        this.status = status;
    }
}
