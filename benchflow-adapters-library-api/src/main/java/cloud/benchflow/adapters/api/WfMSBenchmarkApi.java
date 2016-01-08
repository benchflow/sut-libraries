package cloud.benchflow.adapters.api;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public abstract class WfMSBenchmarkApi {

    protected String sutEndpoint;
    protected String deployAPI;

    public WfMSBenchmarkApi(String sutEndpoint, String deployAPI) {
        this.sutEndpoint = sutEndpoint;
        this.deployAPI = sutEndpoint + deployAPI;
    };

    public abstract Map<String, String> deploy(File model) throws IOException;

}