package peteseo.pbl9responsemodel;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import peteseo.pbl9responsemodel.response.ErrorResponseTemplate;
import peteseo.pbl9responsemodel.response.exception.ClientFaultException;

@RestControllerAdvice
public class GlobalControllerAdvice {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorResponseTemplate handleException(Exception e) {
        return new ErrorResponseTemplate(e.getMessage());
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ClientFaultException.class)
    public ErrorResponseTemplate handleClientFaultException(ClientFaultException e) {
        return new ErrorResponseTemplate(e.getData(), e.getStatus());
    }
}
