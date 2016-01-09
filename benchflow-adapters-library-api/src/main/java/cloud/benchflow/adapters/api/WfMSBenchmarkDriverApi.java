package cloud.benchflow.adapters.api;

import java.io.IOException;

public abstract class WfMSBenchmarkDriverApi {

    protected String sutEndpoint;

    public WfMSBenchmarkDriverApi(String sutEndpoint) {
        this.sutEndpoint = sutEndpoint;
    }

    public abstract String startProcessDefinition(String processDefinitionId) throws IOException;

}