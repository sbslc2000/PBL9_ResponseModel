package peteseo.pbl9responsemodel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import peteseo.pbl9responsemodel.response.ErrorResponseTemplate;
import peteseo.pbl9responsemodel.response.Metadata;
import peteseo.pbl9responsemodel.response.ResponseTemplate;
import peteseo.pbl9responsemodel.response.status.Status;

import java.util.List;

@Slf4j
@ControllerAdvice
public class ResponseWrappingAdvice implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return !ErrorResponseTemplate.class.equals(returnType.getParameterType());
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        log.info("Wrapping response body");
        int size = 1;
        if(body instanceof List<?>) {
            size = ((List)body).size();
        }

        return new ResponseTemplate(body, Status.OK, new Metadata(size));
    }
}
