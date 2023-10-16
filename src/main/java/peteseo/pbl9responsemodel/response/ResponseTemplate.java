package peteseo.pbl9responsemodel.response;

import lombok.Getter;
import peteseo.pbl9responsemodel.response.status.Status;

@Getter
public class ResponseTemplate {

    private final Status status;

    private final Metadata metadata;

    private final Object results;

    public ResponseTemplate(Object results, Status status, Metadata metadata) {
        this.results = results;
        this.status = status;
        this.metadata = metadata;
    }

    public ResponseTemplate(Object results, Metadata metadata) {
        this.results = results;
        this.status = Status.OK;
        this.metadata = metadata;
    }
}
