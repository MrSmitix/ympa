package org.openapitools.api.factories;

import org.openapitools.api.ReportsApiService;
import org.openapitools.api.impl.ReportsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReportsApiServiceFactory {
    private static final ReportsApiService service = new ReportsApiServiceImpl();

    public static ReportsApiService getReportsApi() {
        return service;
    }
}
